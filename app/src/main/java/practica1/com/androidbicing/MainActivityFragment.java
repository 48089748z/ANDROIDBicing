package practica1.com.androidbicing;

import android.annotation.TargetApi;
import android.database.Cursor;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import practica1.com.androidbicing.provider.stations.StationsColumns;
import practica1.com.androidbicing.provider.stations.StationsContentValues;
import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.http.GET;
/**
 * A placeholder fragment containing a simple view.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class MainActivityFragment extends Fragment implements LoaderManager.LoaderCallbacks<Cursor> {

    //http://wservice.viabicing.cat/v2/stations
    Retrofit retrofit;
    BicingService bicingService;
    BicingAdapter adapter;
    public String BASE_URL = "http://wservice.viabicing.cat/v2/";
    public MainActivityFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View mainActivityFragment =  inflater.inflate(R.layout.fragment_main, container, false);
        createRetrofit();
        downloadStations();

        ListView listView = (ListView) mainActivityFragment.findViewById(R.id.LVstations);
        adapter = new BicingAdapter(
                getContext(),
                R.layout.listview_layout,
                null,
                new String[] {
                        StationsColumns._ID,
                        StationsColumns.BIKES,
                        StationsColumns.STREETNUMBER,
                        StationsColumns.STREETNAME,
                        StationsColumns.ALTITUDE,
                        StationsColumns.LATITUDE,
                        StationsColumns.LONGITUDE,
                        StationsColumns.NEARBYSTATIONS,
                        StationsColumns.SLOTS,
                        StationsColumns.STATUS},
                new int[] { R.id.TVid,
                        R.id.TVbikes,
                        R.id.TVstreetNumber,
                        R.id.TVstreetName,
                        R.id.TValtitude,
                        R.id.TVlatitude,
                        R.id.TVlongitude,
                        R.id.TVnearbyStations,
                        R.id.TVslots,
                        R.id.TVstatus},
                0);
        listView.setAdapter(adapter);
        getLoaderManager().restartLoader(0, null, this);




        return mainActivityFragment;
    }
    public void downloadStations()
    {
        Call<StationsList> call = bicingService.getStations();
        call.enqueue(new Callback<StationsList>()
        {
            @Override
            public void onResponse(Response<StationsList> response, Retrofit retrofit)
            {
                if (response.isSuccess())
                {
                    StationsList stationsList = response.body();
                    StationsContentValues values = new StationsContentValues();
                    for(int x=0; x<stationsList.getStations().size(); x++)
                    {
                        Station station = stationsList.getStations().get(x);
                        values.putAltitude(station.getAltitude());
                        values.putBikes(station.getBikes());
                        values.putLatitude(station.getLatitude());
                        values.putLongitude(station.getLongitude());
                        values.putNearbystations(station.getNearbyStations());
                        values.putSlots(station.getSlots());
                        values.putStatus(station.getStatus());
                        values.putStreetname(station.getStreetName());
                        values.putStreetnumber(station.getStreetNumber());
                    }
                    getContext().getContentResolver().insert(StationsColumns.CONTENT_URI, values.values());
                }
            }
            @Override
            public void onFailure(Throwable t) {}
        });
    }

    public void createRetrofit()
    {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        bicingService = retrofit.create(BicingService.class);
    }
    public interface BicingService
    {
        @GET("stations")
        Call<StationsList> getStations();
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {

        return new CursorLoader(getContext(),
                StationsColumns.CONTENT_URI,
                null,
                null,
                null,
                "_id");
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        adapter.swapCursor(data);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        adapter.swapCursor(null);

    }

}
