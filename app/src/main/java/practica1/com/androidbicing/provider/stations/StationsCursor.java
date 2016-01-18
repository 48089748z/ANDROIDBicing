package practica1.com.androidbicing.provider.stations;

import android.database.Cursor;

import android.support.annotation.Nullable;

import practica1.com.androidbicing.provider.base.AbstractCursor;


/**
 * Cursor wrapper for the {@code stations} table.
 */
public class StationsCursor extends AbstractCursor implements StationsModel {
    public StationsCursor(Cursor cursor) {
        super(cursor);
    }

    /**
     * Primary key.
     */
    public long getId() {
        Long res = getLongOrNull(StationsColumns._ID);
        if (res == null)
            throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
        return res;
    }

    /**
     * Get the {@code type} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getType() {
        String res = getStringOrNull(StationsColumns.TYPE);
        return res;
    }

    /**
     * Get the {@code latitude} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getLatitude() {
        String res = getStringOrNull(StationsColumns.LATITUDE);
        return res;
    }

    /**
     * Get the {@code longitude} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getLongitude() {
        String res = getStringOrNull(StationsColumns.LONGITUDE);
        return res;
    }

    /**
     * Get the {@code streetname} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getStreetname() {
        String res = getStringOrNull(StationsColumns.STREETNAME);
        return res;
    }

    /**
     * Get the {@code streetnumber} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getStreetnumber() {
        String res = getStringOrNull(StationsColumns.STREETNUMBER);
        return res;
    }

    /**
     * Get the {@code altitude} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getAltitude() {
        String res = getStringOrNull(StationsColumns.ALTITUDE);
        return res;
    }

    /**
     * Get the {@code slots} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getSlots() {
        String res = getStringOrNull(StationsColumns.SLOTS);
        return res;
    }

    /**
     * Get the {@code bikes} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getBikes() {
        String res = getStringOrNull(StationsColumns.BIKES);
        return res;
    }

    /**
     * Get the {@code nearbystations} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getNearbystations() {
        String res = getStringOrNull(StationsColumns.NEARBYSTATIONS);
        return res;
    }

    /**
     * Get the {@code status} value.
     * Can be {@code null}.
     */
    @Nullable
    public String getStatus() {
        String res = getStringOrNull(StationsColumns.STATUS);
        return res;
    }
}
