package arnavigation.appsan.com.myapplication.utils;

/**
 * Created by Santhosh Adiga on 08-05-2018.
 */

public class LatLng {

        private double lat;
        private double lng;

        public LatLng(double lat,double lng){
            this.lat=lat;
            this.lng=lng;
        }

        public double getLat(){
            return lat;
        }

        public double getLng(){
            return lng;
        }
}
