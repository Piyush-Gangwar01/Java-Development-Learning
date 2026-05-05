package ticket.booking.entities;

import java.util.List;
import java.util.Map;

public class Train {

    private String trainNo;
    private String trainId;
    private List<List<Integer>> seats;
    private Map<String, String> stationtime;
    private List<String> Stations;

    public Train() {
        this.trainNo = trainNo;
        this.trainId = trainId;
        this.seats = seats;
        this.stationtime = stationtime;
        Stations = stations;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public Map<String, String> getStationtime() {
        return stationtime;
    }

    public void setStationtime(Map<String, String> stationtime) {
        this.stationtime = stationtime;
    }

    public List<String> getStations() {
        return Stations;
    }

    public void setStations(List<String> stations) {
        Stations = stations;
    }

    public String getTrainInfo(){
        return String.format("Train ID: %s Train No: %s" ,trainId,trainNo);
    }

    public Map<Object, Object> getStationTimes() {
    }
}
