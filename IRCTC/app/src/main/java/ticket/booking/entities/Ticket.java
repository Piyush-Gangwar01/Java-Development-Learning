package ticket.booking.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Date;

public class Ticket {

    private String tickedId;
    private String UserId;
    private String Source;
    private String Destination;
    private String date ;
    private Train train;

    public Ticket(String tickedId , String UserId, String Source, String Destination , String date, Train train){
        this.tickedId=tickedId;
        this.UserId=UserId;
        this.Source=Source;
        this.Destination=Destination;
        this.date=date;
        this.train=train;
    }


    @JsonAnyGetter
    @JsonSetter
    public String getTickedId() {
        return tickedId;
    }

    public void setTickedId(String tickedId){
        this.tickedId=tickedId;
    }

    public String getUserId(){
        return UserId;
    }

    public void setUserId(String userId){
        this.UserId=UserId;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getTicketInfo(){
        return String.format("Ticket ID: %s belongs to %s from %s to %s on %s",tickedId,UserId,Source,Destination,date);
    }


}
