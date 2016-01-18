
package practica1.com.androidbicing;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StationsList {

    @SerializedName("stations")
    @Expose
    private List<Station> stations = new ArrayList<Station>();
    @SerializedName("updateTime")
    @Expose
    private Integer updateTime;

    /**
     * 
     * @return
     *     The stations
     */
    public List<Station> getStations() {
        return stations;
    }

    /**
     * 
     * @param stations
     *     The stations
     */
    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    /**
     * 
     * @return
     *     The updateTime
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime
     *     The updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

}
