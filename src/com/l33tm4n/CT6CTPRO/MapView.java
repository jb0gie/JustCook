package com.l33tm4n.CT6CTPRO;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;

public class MapView extends Activity {
	 
    // Google Map
    private GoogleMap googleMap;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_view);
        
        try {
            // Loading map
            initilizeMap();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /**
     * function to load map. If map is not created it will create it for you
     * */
    private void initilizeMap() {
        if (googleMap == null) {
            googleMap = ((MapFragment) getFragmentManager().findFragmentById(
                    R.id.map)).getMap();
            
            googleMap.addMarker(new MarkerOptions()
            .position(new LatLng(50.794868,-1.069698))
            .title("Lidl")
            .snippet("Goldsmith Avenue, Southsea, Portsmouth PO4 8BU"));
            
            googleMap.addMarker(new MarkerOptions()
            .position(new LatLng(50.798571,-1.078208))
            .title("Asda Fratton")
            .snippet("The Bridge Shopping Centre, Somers Road North, Portsmouth PO1 1SL"));
            
            googleMap.addMarker(new MarkerOptions()
            .position(new LatLng(50.801175,-1.087958))
            .title("Tesco Commercial Road")
            .snippet("Crasswell Street, Portsmouth PO1 1RS"));
            
            googleMap.addMarker(new MarkerOptions()
            .position(new LatLng(50.79027,-1.088249))
            .title("Tesco Elm Grove")
            .snippet("51-63 Elm Grove, Southsea, Portsmouth PO5 1JF"));
            
            googleMap.addMarker(new MarkerOptions()
            .position(new LatLng(50.786799,-1.073938))
            .title("Tesco Albert Road")
            .snippet("183-191 Albert Road, Southsea, Portsmouth PO4 0JP"));
            
            googleMap.setMyLocationEnabled(true); // false to disable
            
            googleMap.getUiSettings().setMyLocationButtonEnabled(true);
            
            googleMap.getUiSettings().setRotateGesturesEnabled(true);
            
            // check if map is created successfully or not
            if (googleMap == null) {
                Toast.makeText(getApplicationContext(),
                        "Sorry! unable to create maps", Toast.LENGTH_SHORT)
                        .show();
            }
        }
        
        
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Criteria criteria = new Criteria();

        Location location = locationManager.getLastKnownLocation(locationManager.getBestProvider(criteria, false));
        if (location != null)
        {
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                    new LatLng(location.getLatitude(), location.getLongitude()), 13));

            CameraPosition cameraPosition = new CameraPosition.Builder()
            .target(new LatLng(location.getLatitude(), location.getLongitude()))      // Sets the center of the map to location user
            .zoom(17)                   // Sets the zoom
            .bearing(90)                // Sets the orientation of the camera to east
            .tilt(40)                   // Sets the tilt of the camera to 30 degrees
            .build();                   // Creates a CameraPosition from the builder
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        }
        
    }

    
    @Override
    protected void onResume() {
        super.onResume();
        initilizeMap();
    }
    
    
 
}
