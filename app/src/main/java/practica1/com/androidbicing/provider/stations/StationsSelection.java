package practica1.com.androidbicing.provider.stations;


import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

import practica1.com.androidbicing.provider.base.AbstractSelection;


/**
 * Selection for the {@code stations} table.
 */
public class StationsSelection extends AbstractSelection<StationsSelection> {
    @Override
    protected Uri baseUri() {
        return StationsColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code StationsCursor} object, which is positioned before the first entry, or null.
     */
    public StationsCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new StationsCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public StationsCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code StationsCursor} object, which is positioned before the first entry, or null.
     */
    public StationsCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new StationsCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public StationsCursor query(Context context) {
        return query(context, null);
    }


    public StationsSelection id(long... value) {
        addEquals("stations." + StationsColumns._ID, toObjectArray(value));
        return this;
    }

    public StationsSelection idNot(long... value) {
        addNotEquals("stations." + StationsColumns._ID, toObjectArray(value));
        return this;
    }

    public StationsSelection orderById(boolean desc) {
        orderBy("stations." + StationsColumns._ID, desc);
        return this;
    }

    public StationsSelection orderById() {
        return orderById(false);
    }

    public StationsSelection type(String... value) {
        addEquals(StationsColumns.TYPE, value);
        return this;
    }

    public StationsSelection typeNot(String... value) {
        addNotEquals(StationsColumns.TYPE, value);
        return this;
    }

    public StationsSelection typeLike(String... value) {
        addLike(StationsColumns.TYPE, value);
        return this;
    }

    public StationsSelection typeContains(String... value) {
        addContains(StationsColumns.TYPE, value);
        return this;
    }

    public StationsSelection typeStartsWith(String... value) {
        addStartsWith(StationsColumns.TYPE, value);
        return this;
    }

    public StationsSelection typeEndsWith(String... value) {
        addEndsWith(StationsColumns.TYPE, value);
        return this;
    }

    public StationsSelection orderByType(boolean desc) {
        orderBy(StationsColumns.TYPE, desc);
        return this;
    }

    public StationsSelection orderByType() {
        orderBy(StationsColumns.TYPE, false);
        return this;
    }

    public StationsSelection latitude(String... value) {
        addEquals(StationsColumns.LATITUDE, value);
        return this;
    }

    public StationsSelection latitudeNot(String... value) {
        addNotEquals(StationsColumns.LATITUDE, value);
        return this;
    }

    public StationsSelection latitudeLike(String... value) {
        addLike(StationsColumns.LATITUDE, value);
        return this;
    }

    public StationsSelection latitudeContains(String... value) {
        addContains(StationsColumns.LATITUDE, value);
        return this;
    }

    public StationsSelection latitudeStartsWith(String... value) {
        addStartsWith(StationsColumns.LATITUDE, value);
        return this;
    }

    public StationsSelection latitudeEndsWith(String... value) {
        addEndsWith(StationsColumns.LATITUDE, value);
        return this;
    }

    public StationsSelection orderByLatitude(boolean desc) {
        orderBy(StationsColumns.LATITUDE, desc);
        return this;
    }

    public StationsSelection orderByLatitude() {
        orderBy(StationsColumns.LATITUDE, false);
        return this;
    }

    public StationsSelection longitude(String... value) {
        addEquals(StationsColumns.LONGITUDE, value);
        return this;
    }

    public StationsSelection longitudeNot(String... value) {
        addNotEquals(StationsColumns.LONGITUDE, value);
        return this;
    }

    public StationsSelection longitudeLike(String... value) {
        addLike(StationsColumns.LONGITUDE, value);
        return this;
    }

    public StationsSelection longitudeContains(String... value) {
        addContains(StationsColumns.LONGITUDE, value);
        return this;
    }

    public StationsSelection longitudeStartsWith(String... value) {
        addStartsWith(StationsColumns.LONGITUDE, value);
        return this;
    }

    public StationsSelection longitudeEndsWith(String... value) {
        addEndsWith(StationsColumns.LONGITUDE, value);
        return this;
    }

    public StationsSelection orderByLongitude(boolean desc) {
        orderBy(StationsColumns.LONGITUDE, desc);
        return this;
    }

    public StationsSelection orderByLongitude() {
        orderBy(StationsColumns.LONGITUDE, false);
        return this;
    }

    public StationsSelection streetname(String... value) {
        addEquals(StationsColumns.STREETNAME, value);
        return this;
    }

    public StationsSelection streetnameNot(String... value) {
        addNotEquals(StationsColumns.STREETNAME, value);
        return this;
    }

    public StationsSelection streetnameLike(String... value) {
        addLike(StationsColumns.STREETNAME, value);
        return this;
    }

    public StationsSelection streetnameContains(String... value) {
        addContains(StationsColumns.STREETNAME, value);
        return this;
    }

    public StationsSelection streetnameStartsWith(String... value) {
        addStartsWith(StationsColumns.STREETNAME, value);
        return this;
    }

    public StationsSelection streetnameEndsWith(String... value) {
        addEndsWith(StationsColumns.STREETNAME, value);
        return this;
    }

    public StationsSelection orderByStreetname(boolean desc) {
        orderBy(StationsColumns.STREETNAME, desc);
        return this;
    }

    public StationsSelection orderByStreetname() {
        orderBy(StationsColumns.STREETNAME, false);
        return this;
    }

    public StationsSelection streetnumber(String... value) {
        addEquals(StationsColumns.STREETNUMBER, value);
        return this;
    }

    public StationsSelection streetnumberNot(String... value) {
        addNotEquals(StationsColumns.STREETNUMBER, value);
        return this;
    }

    public StationsSelection streetnumberLike(String... value) {
        addLike(StationsColumns.STREETNUMBER, value);
        return this;
    }

    public StationsSelection streetnumberContains(String... value) {
        addContains(StationsColumns.STREETNUMBER, value);
        return this;
    }

    public StationsSelection streetnumberStartsWith(String... value) {
        addStartsWith(StationsColumns.STREETNUMBER, value);
        return this;
    }

    public StationsSelection streetnumberEndsWith(String... value) {
        addEndsWith(StationsColumns.STREETNUMBER, value);
        return this;
    }

    public StationsSelection orderByStreetnumber(boolean desc) {
        orderBy(StationsColumns.STREETNUMBER, desc);
        return this;
    }

    public StationsSelection orderByStreetnumber() {
        orderBy(StationsColumns.STREETNUMBER, false);
        return this;
    }

    public StationsSelection altitude(String... value) {
        addEquals(StationsColumns.ALTITUDE, value);
        return this;
    }

    public StationsSelection altitudeNot(String... value) {
        addNotEquals(StationsColumns.ALTITUDE, value);
        return this;
    }

    public StationsSelection altitudeLike(String... value) {
        addLike(StationsColumns.ALTITUDE, value);
        return this;
    }

    public StationsSelection altitudeContains(String... value) {
        addContains(StationsColumns.ALTITUDE, value);
        return this;
    }

    public StationsSelection altitudeStartsWith(String... value) {
        addStartsWith(StationsColumns.ALTITUDE, value);
        return this;
    }

    public StationsSelection altitudeEndsWith(String... value) {
        addEndsWith(StationsColumns.ALTITUDE, value);
        return this;
    }

    public StationsSelection orderByAltitude(boolean desc) {
        orderBy(StationsColumns.ALTITUDE, desc);
        return this;
    }

    public StationsSelection orderByAltitude() {
        orderBy(StationsColumns.ALTITUDE, false);
        return this;
    }

    public StationsSelection slots(String... value) {
        addEquals(StationsColumns.SLOTS, value);
        return this;
    }

    public StationsSelection slotsNot(String... value) {
        addNotEquals(StationsColumns.SLOTS, value);
        return this;
    }

    public StationsSelection slotsLike(String... value) {
        addLike(StationsColumns.SLOTS, value);
        return this;
    }

    public StationsSelection slotsContains(String... value) {
        addContains(StationsColumns.SLOTS, value);
        return this;
    }

    public StationsSelection slotsStartsWith(String... value) {
        addStartsWith(StationsColumns.SLOTS, value);
        return this;
    }

    public StationsSelection slotsEndsWith(String... value) {
        addEndsWith(StationsColumns.SLOTS, value);
        return this;
    }

    public StationsSelection orderBySlots(boolean desc) {
        orderBy(StationsColumns.SLOTS, desc);
        return this;
    }

    public StationsSelection orderBySlots() {
        orderBy(StationsColumns.SLOTS, false);
        return this;
    }

    public StationsSelection bikes(String... value) {
        addEquals(StationsColumns.BIKES, value);
        return this;
    }

    public StationsSelection bikesNot(String... value) {
        addNotEquals(StationsColumns.BIKES, value);
        return this;
    }

    public StationsSelection bikesLike(String... value) {
        addLike(StationsColumns.BIKES, value);
        return this;
    }

    public StationsSelection bikesContains(String... value) {
        addContains(StationsColumns.BIKES, value);
        return this;
    }

    public StationsSelection bikesStartsWith(String... value) {
        addStartsWith(StationsColumns.BIKES, value);
        return this;
    }

    public StationsSelection bikesEndsWith(String... value) {
        addEndsWith(StationsColumns.BIKES, value);
        return this;
    }

    public StationsSelection orderByBikes(boolean desc) {
        orderBy(StationsColumns.BIKES, desc);
        return this;
    }

    public StationsSelection orderByBikes() {
        orderBy(StationsColumns.BIKES, false);
        return this;
    }

    public StationsSelection nearbystations(String... value) {
        addEquals(StationsColumns.NEARBYSTATIONS, value);
        return this;
    }

    public StationsSelection nearbystationsNot(String... value) {
        addNotEquals(StationsColumns.NEARBYSTATIONS, value);
        return this;
    }

    public StationsSelection nearbystationsLike(String... value) {
        addLike(StationsColumns.NEARBYSTATIONS, value);
        return this;
    }

    public StationsSelection nearbystationsContains(String... value) {
        addContains(StationsColumns.NEARBYSTATIONS, value);
        return this;
    }

    public StationsSelection nearbystationsStartsWith(String... value) {
        addStartsWith(StationsColumns.NEARBYSTATIONS, value);
        return this;
    }

    public StationsSelection nearbystationsEndsWith(String... value) {
        addEndsWith(StationsColumns.NEARBYSTATIONS, value);
        return this;
    }

    public StationsSelection orderByNearbystations(boolean desc) {
        orderBy(StationsColumns.NEARBYSTATIONS, desc);
        return this;
    }

    public StationsSelection orderByNearbystations() {
        orderBy(StationsColumns.NEARBYSTATIONS, false);
        return this;
    }

    public StationsSelection status(String... value) {
        addEquals(StationsColumns.STATUS, value);
        return this;
    }

    public StationsSelection statusNot(String... value) {
        addNotEquals(StationsColumns.STATUS, value);
        return this;
    }

    public StationsSelection statusLike(String... value) {
        addLike(StationsColumns.STATUS, value);
        return this;
    }

    public StationsSelection statusContains(String... value) {
        addContains(StationsColumns.STATUS, value);
        return this;
    }

    public StationsSelection statusStartsWith(String... value) {
        addStartsWith(StationsColumns.STATUS, value);
        return this;
    }

    public StationsSelection statusEndsWith(String... value) {
        addEndsWith(StationsColumns.STATUS, value);
        return this;
    }

    public StationsSelection orderByStatus(boolean desc) {
        orderBy(StationsColumns.STATUS, desc);
        return this;
    }

    public StationsSelection orderByStatus() {
        orderBy(StationsColumns.STATUS, false);
        return this;
    }
}
