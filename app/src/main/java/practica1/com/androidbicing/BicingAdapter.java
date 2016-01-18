package practica1.com.androidbicing;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.List;

import practica1.com.androidbicing.provider.stations.StationsColumns;

/**
 * Created by 48089748z on 18/01/16.
 */
public class BicingAdapter extends SimpleCursorAdapter {
    Context context;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public BicingAdapter(Context context, int layout, Cursor c, String[] from, int[] to, int flags)
    {
        super(context, layout, c, from, to, flags);
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        Cursor myCursor = getCursor();
        myCursor.moveToPosition(position);
        if (convertView == null)
        {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.listview_layout, parent, false);
        }
        TextView id = (TextView) convertView.findViewById(R.id.TVid);
        TextView bikes = (TextView) convertView.findViewById(R.id.TVbikes);
        TextView streetNumber = (TextView) convertView.findViewById(R.id.TVstreetNumber);
        TextView streetName = (TextView) convertView.findViewById(R.id.TVstreetName);
        TextView altitude = (TextView) convertView.findViewById(R.id.TValtitude);
        TextView latitude = (TextView) convertView.findViewById(R.id.TVlatitude);
        TextView longitude = (TextView) convertView.findViewById(R.id.TVlongitude);
        TextView nearbyStations = (TextView) convertView.findViewById(R.id.TVnearbyStations);
        TextView slots = (TextView) convertView.findViewById(R.id.TVslots);
        TextView status = (TextView) convertView.findViewById(R.id.TVstatus);

        id.setText("\n ID: "+myCursor.getString(myCursor.getColumnIndex(StationsColumns._ID)));
        bikes.setText(" Bikes: "+myCursor.getString(myCursor.getColumnIndex(StationsColumns.BIKES)));
        streetNumber.setText(" Street Number: "+myCursor.getString(myCursor.getColumnIndex(StationsColumns.STREETNUMBER)));
        streetName.setText(" Street name: "+myCursor.getString(myCursor.getColumnIndex(StationsColumns.STREETNAME)));
        altitude.setText(" Altitude: "+myCursor.getString(myCursor.getColumnIndex(StationsColumns.ALTITUDE)));
        latitude.setText(" Latitude: "+myCursor.getString(myCursor.getColumnIndex(StationsColumns.LATITUDE)));
        longitude.setText(" Longitude: "+myCursor.getString(myCursor.getColumnIndex(StationsColumns.LONGITUDE)));
        nearbyStations.setText(" Nearby Stations: "+myCursor.getString(myCursor.getColumnIndex(StationsColumns.NEARBYSTATIONS)));
        slots.setText(" Slots: "+myCursor.getString(myCursor.getColumnIndex(StationsColumns.SLOTS)));
        status.setText(" Status: "+myCursor.getString(myCursor.getColumnIndex(StationsColumns.STATUS)));

        return convertView;
    }
}
