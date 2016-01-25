package practica1.com.androidbicing;

import android.app.Activity;
import android.os.Bundle;

import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.mylocation.GpsMyLocationProvider;
import org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay;

public class MapActivity extends Activity
{
    MapView map;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        map = (MapView) findViewById(R.id.map);
        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);

       /* this.mLocationOverlay = new MyLocationNewOverlay(this, new GpsMyLocationProvider(this),mMapView);
        mMapView.getOverlays().add(this.mLocationOverlay);*/
        addMarkers();

    }
    public void addMarkers()
    {
        IMapController mapController = map.getController();
        mapController.setZoom(10);
        GeoPoint startPoint = new GeoPoint(48.8583, 2.2944); //COORDENADAS DE PARIS A ZOOM 10
        mapController.setCenter(startPoint);
    }
}
