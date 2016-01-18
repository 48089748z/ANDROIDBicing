package practica1.com.androidbicing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Station {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("streetName")
    @Expose
    private String streetName;
    @SerializedName("streetNumber")
    @Expose
    private String streetNumber;
    @SerializedName("altitude")
    @Expose
    private String altitude;
    @SerializedName("slots")
    @Expose
    private String slots;
    @SerializedName("bikes")
    @Expose
    private String bikes;
    @SerializedName("nearbyStations")
    @Expose
    private String nearbyStations;
    @SerializedName("status")
    @Expose
    private String status;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * 
     * @param streetName
     *     The streetName
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * 
     * @return
     *     The streetNumber
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * 
     * @param streetNumber
     *     The streetNumber
     */
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * 
     * @return
     *     The altitude
     */
    public String getAltitude() {
        return altitude;
    }

    /**
     * 
     * @param altitude
     *     The altitude
     */
    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    /**
     * 
     * @return
     *     The slots
     */
    public String getSlots() {
        return slots;
    }

    /**
     * 
     * @param slots
     *     The slots
     */
    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     * 
     * @return
     *     The bikes
     */
    public String getBikes() {
        return bikes;
    }

    /**
     * 
     * @param bikes
     *     The bikes
     */
    public void setBikes(String bikes) {
        this.bikes = bikes;
    }

    /**
     * 
     * @return
     *     The nearbyStations
     */
    public String getNearbyStations() {
        return nearbyStations;
    }

    /**
     * 
     * @param nearbyStations
     *     The nearbyStations
     */
    public void setNearbyStations(String nearbyStations) {
        this.nearbyStations = nearbyStations;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
