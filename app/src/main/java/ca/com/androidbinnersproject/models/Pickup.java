package ca.com.androidbinnersproject.models;

import com.google.android.gms.maps.model.LatLng;

import java.util.Calendar;

/**
 * Created by jonathan_campos on 27/06/2016.
 */
public class Pickup {
    private String userID;
    private Calendar dateTime;
    private String instructions;
    private double latitude;
    private double longitude;
    private LatLng center;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Calendar getDateTime() {
        return dateTime;
    }

    public void setDateTime(Calendar dateTime) {
        this.dateTime = dateTime;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public LatLng getCenter(){
        if (this.getLatitude() != 0 && this.getLongitude() != 0){
            return new LatLng(getLongitude(), getLatitude());
        }

        return null;
    }
}
