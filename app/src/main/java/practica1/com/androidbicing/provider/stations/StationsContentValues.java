package practica1.com.androidbicing.provider.stations;



import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import practica1.com.androidbicing.provider.base.AbstractContentValues;


/**
 * Content values wrapper for the {@code stations} table.
 */
public class StationsContentValues extends AbstractContentValues {
    @Override
    public Uri uri() {
        return StationsColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable StationsSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable StationsSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public StationsContentValues putType(@Nullable String value) {
        mContentValues.put(StationsColumns.TYPE, value);
        return this;
    }

    public StationsContentValues putTypeNull() {
        mContentValues.putNull(StationsColumns.TYPE);
        return this;
    }

    public StationsContentValues putLatitude(@Nullable String value) {
        mContentValues.put(StationsColumns.LATITUDE, value);
        return this;
    }

    public StationsContentValues putLatitudeNull() {
        mContentValues.putNull(StationsColumns.LATITUDE);
        return this;
    }

    public StationsContentValues putLongitude(@Nullable String value) {
        mContentValues.put(StationsColumns.LONGITUDE, value);
        return this;
    }

    public StationsContentValues putLongitudeNull() {
        mContentValues.putNull(StationsColumns.LONGITUDE);
        return this;
    }

    public StationsContentValues putStreetname(@Nullable String value) {
        mContentValues.put(StationsColumns.STREETNAME, value);
        return this;
    }

    public StationsContentValues putStreetnameNull() {
        mContentValues.putNull(StationsColumns.STREETNAME);
        return this;
    }

    public StationsContentValues putStreetnumber(@Nullable String value) {
        mContentValues.put(StationsColumns.STREETNUMBER, value);
        return this;
    }

    public StationsContentValues putStreetnumberNull() {
        mContentValues.putNull(StationsColumns.STREETNUMBER);
        return this;
    }

    public StationsContentValues putAltitude(@Nullable String value) {
        mContentValues.put(StationsColumns.ALTITUDE, value);
        return this;
    }

    public StationsContentValues putAltitudeNull() {
        mContentValues.putNull(StationsColumns.ALTITUDE);
        return this;
    }

    public StationsContentValues putSlots(@Nullable String value) {
        mContentValues.put(StationsColumns.SLOTS, value);
        return this;
    }

    public StationsContentValues putSlotsNull() {
        mContentValues.putNull(StationsColumns.SLOTS);
        return this;
    }

    public StationsContentValues putBikes(@Nullable String value) {
        mContentValues.put(StationsColumns.BIKES, value);
        return this;
    }

    public StationsContentValues putBikesNull() {
        mContentValues.putNull(StationsColumns.BIKES);
        return this;
    }

    public StationsContentValues putNearbystations(@Nullable String value) {
        mContentValues.put(StationsColumns.NEARBYSTATIONS, value);
        return this;
    }

    public StationsContentValues putNearbystationsNull() {
        mContentValues.putNull(StationsColumns.NEARBYSTATIONS);
        return this;
    }

    public StationsContentValues putStatus(@Nullable String value) {
        mContentValues.put(StationsColumns.STATUS, value);
        return this;
    }

    public StationsContentValues putStatusNull() {
        mContentValues.putNull(StationsColumns.STATUS);
        return this;
    }
}
