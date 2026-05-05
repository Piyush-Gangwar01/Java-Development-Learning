package ticket.booking.Services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.Train;
import ticket.booking.entities.User;
import ticket.booking.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserBookingService {

    private static final User user;
    private List<User> userlist;


    //  user.json m data ko map krne k liye ek lib import krni pdegi from build.gradle(Object mapper)
    private  ObjectMapper objectMapper=new ObjectMapper();

    private static final String USER_PATH="../LocalDB.local/user.json";

    public UserBookingService(User user){
            this.user=user;
            File users=new File(USER_PATH);  //"Hey computer, there is a file called users.json. I want to use it."
            userlist=objectMapper.readValue(user,new TypeReference<List<User>>());
    }

    public boolean loginUser(){
        Optional<User> founduser=userlist.stream()
                                            .filter(user1->{return user1.getName().equals(user.getName())  && UserServiceUtil.checkpassword(user.getPassword() , user1.getHashedPass());
                                            }).findFirst();
        return founduser.isPresent();
    }

    public boolean signup(User user1){
        try{
            userlist.add(user1);
            saveUserListtoFile();
            return Boolean.TRUE;
        }catch(IOException e){
            return Boolean.FALSE;
        }
    }

    private void saveUserListtoFile() {
        File userfile=new File(USER_PATH);
        objectMapper.writeValue(userfile,userlist);
    }

    public static void fetchbooking(){
        user.PrintTicket();
    }

    public List<Train> getTrains(String src, String dest){
        try{
            TrainService trainService=new TrainService();
            return trainService.searchTrains(src,dest);
        }catch (IOException e){
            return new ArrayList<>();
        }
    }

    public void CancleBooking(String ticketId){

    }

    public List<List<Integer>> fetchSeats(Train train){
        return train.getSeats();
    }

    public Boolean bookTrainSeat(Train train, int row, int seat) {
        try{
            TrainService trainService = new TrainService();
            List<List<Integer>> seats = train.getSeats();
            if (row >= 0 && row < seats.size() && seat >= 0 && seat < seats.get(row).size()) {
                if (seats.get(row).get(seat) == 0) {
                    seats.get(row).set(seat, 1);
                    train.setSeats(seats);
                    trainService.addTrain(train);
                    return true; // Booking successful
                } else {
                    return false; // Seat is already booked
                }
            } else {
                return false; // Invalid row or seat index
            }
        }catch (IOException ex){
            return Boolean.FALSE;
        }
    }

}
