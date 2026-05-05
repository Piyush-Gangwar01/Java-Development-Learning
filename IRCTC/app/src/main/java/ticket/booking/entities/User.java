package ticket.booking.entities;

import java.util.List;

public class User {

    private String name;
    private int userid;
    private String password;
    private String hashedPass;
    private List<Ticket> ticketsBooked;

    public User(String name, int userid, String password, String hashedPass, List<Ticket> ticketsBooked) {
        this.name = name;
        this.userid = userid;
        this.password = password;
        this.hashedPass = hashedPass;
        this.ticketsBooked = ticketsBooked;
    }

    public User(){} // empty constructor for if humne kuch pass nhi kiya then kuch denge .

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashedPass() {
        return hashedPass;
    }

    public void setHashedPass(String hashedPass) {
        this.hashedPass = hashedPass;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }

    public void PrintTicket(){
        for(int i=0;i<ticketsBooked.size();i++){
            System.out.println(ticketsBooked.get(i).getTicketInfo());
        }
    }
}
