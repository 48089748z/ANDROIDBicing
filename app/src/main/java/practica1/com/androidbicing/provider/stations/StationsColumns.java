package practica1.com.androidbicing.provider.stations;

import android.net.Uri;
import android.provider.BaseColumns;

import practica1.com.androidbicing.provider.BicingProvider;


/**
 * Bicing stations information
 */
public class StationsColumns implements BaseColumns {
    public static final String TABLE_NAME = "stations";
    public static final Uri CONTENT_URI = Uri.parse(BicingProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    public static final String TYPE = "type";

    public static final String LATITUDE = "latitude";

    public static final String LONGITUDE = "longitude";

    public static final String STREETNAME = "streetName";

    public static final String STREETNUMBER = "streetNumber";

    public static final String ALTITUDE = "altitude";

    public static final String SLOTS = "slots";

    public static final String BIKES = "bikes";

    public static final String NEARBYSTATIONS = "nearbyStations";

    public static final String STATUS = "status";


    public static final String DEFAULT_ORDER = TABLE_NAME + "." +_ID;

    // @formatter:off
    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            TYPE,
            LATITUDE,
            LONGITUDE,
            STREETNAME,
            STREETNUMBER,
            ALTITUDE,
            SLOTS,
            BIKES,
            NEARBYSTATIONS,
            STATUS
    };
    // @formatter:on

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(TYPE) || c.contains("." + TYPE)) return true;
            if (c.equals(LATITUDE) || c.contains("." + LATITUDE)) return true;
            if (c.equals(LONGITUDE) || c.contains("." + LONGITUDE)) return true;
            if (c.equals(STREETNAME) || c.contains("." + STREETNAME)) return true;
            if (c.equals(STREETNUMBER) || c.contains("." + STREETNUMBER)) return true;
            if (c.equals(ALTITUDE) || c.contains("." + ALTITUDE)) return true;
            if (c.equals(SLOTS) || c.contains("." + SLOTS)) return true;
            if (c.equals(BIKES) || c.contains("." + BIKES)) return true;
            if (c.equals(NEARBYSTATIONS) || c.contains("." + NEARBYSTATIONS)) return true;
            if (c.equals(STATUS) || c.contains("." + STATUS)) return true;
        }
        return false;
    }

}
