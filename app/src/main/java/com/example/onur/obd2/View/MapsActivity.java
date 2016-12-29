package com.example.onur.obd2.View;
import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import com.example.onur.obd2.R;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback
{

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap)
    {
        double[] latitude = new double[8];
        double[] longitude = new double[8];
        latitude[0] = 38.368965;
        longitude[0] = 27.209613;
        latitude[1] = 38.372993;
        longitude[1] = 27.197137;
        latitude[2] = 38.375365;
        longitude[2] = 27.195807;
        latitude[3] = 38.376122;
        longitude[3] = 27.191419;
        latitude[4] = 38.380092;
        longitude[4] = 27.18481;
        latitude[5] = 38.38074;
        longitude[5] = 27.183587;
        latitude[6] = 38.384012;
        longitude[6] = 27.18084;
        latitude[7] = 38.385114;
        longitude[7] = 27.179456;

        mMap = googleMap;

        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        LatLng startLoc = new LatLng(latitude[0], longitude[0]);
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(startLoc, 12));

        for(int i = 0; i < latitude.length - 1; i++)
        {
            LatLng start = new LatLng(latitude[i], longitude[i]);
            LatLng target = new LatLng(latitude[i+1], longitude[i+1]);

            mMap.addMarker(new MarkerOptions().position(start).title("Me"));

            mMap.addPolyline(new PolylineOptions().geodesic(true).width(3.0f).color(Color.RED).add(start).add(target));
        }

        if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED)
        {
            mMap.setMyLocationEnabled(true);
            LocationManager service = (LocationManager) getSystemService(LOCATION_SERVICE);
            Criteria criteria =new Criteria();
            String provider = service.getBestProvider(criteria, true);
            Location location = service.getLastKnownLocation(provider);

            LocationListener locationListener = new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {
                    drawMarker(location);
                }
            };

        }

    }

    private void drawMarker(Location location)
    {
        mMap.clear();
        LatLng currentPosition = new LatLng(location.getLatitude(), location.getLongitude());
        mMap.addMarker(new MarkerOptions().position(currentPosition).snippet("Lat : " + location.getLatitude() + "Lng : " + location.getLongitude()).title("ME"));
    }

}

