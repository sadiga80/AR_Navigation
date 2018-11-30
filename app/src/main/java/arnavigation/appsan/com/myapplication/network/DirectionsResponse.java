package arnavigation.appsan.com.myapplication.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import arnavigation.appsan.com.myapplication.network.model.GeocodedWaypoint;
import arnavigation.appsan.com.myapplication.network.model.Route;

import java.util.List;

/**
 * Created by Santhosh Adiga on 06-03-2018.
 */

public class DirectionsResponse {

    @SerializedName("geocoded_waypoints")
    @Expose
    private List<GeocodedWaypoint> geocodedWaypoints = null;
    @SerializedName("routes")
    @Expose
    private List<Route> routes = null;
    @SerializedName("status")
    @Expose
    private String status;

    public List<GeocodedWaypoint> getGeocodedWaypoints() {
        return geocodedWaypoints;
    }

    public void setGeocodedWaypoints(List<GeocodedWaypoint> geocodedWaypoints) {
        this.geocodedWaypoints = geocodedWaypoints;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
