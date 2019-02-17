/* reverted*/
package com.example.polygons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import android.widget.Spinner;
import android.widget.ArrayAdapter;



import android.support.design.widget.FloatingActionButton;
import android.view.View;


import static com.example.polygons.R.id.map;


/**
 * An activity that displays a Google map with polylines to represent paths or routes,
 * and polygons to represent areas.
 */
public class PolyActivity extends AppCompatActivity
        implements
                OnMapReadyCallback
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);

        // Get the SupportMapFragment and request notification when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(map);
        mapFragment.getMapAsync(this);

        Spinner spinner = (Spinner) findViewById(R.id.symptoms_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.symptoms_array, android.R.layout.simple_spinner_item);
                // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    /**
     * Manipulates the map when it's available.
     * The API invokes this callback when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera.
     * In this tutorial, we add polylines and polygons to represent routes and areas on the map.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        final GoogleMap g = googleMap;

        FloatingActionButton myFab = (FloatingActionButton)  findViewById(R.id.floatingActionButton);
        myFab.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View v) {
                                         /*g.addMarker(new MarkerOptions().position(new LatLng(43.084452, -77.673883))
                                                 .title("Marker in Clark Gym"));*/
                                         startActivity(new Intent(PolyActivity.this, SelfReport.class));
                                     }
                                 });


        // Position the map's camera near Alice Springs in the center of Australia,
        // and set the zoom factor so most of Australia shows on the screen.
        //googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(43.157, -77.609), 10));

        LatLng rochester = new LatLng(43.106998, -77.659939);

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.085114, -77.667220))
                .title("Marker in NRH"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.086485, -77.667821))
                .title("Marker in Ellingson"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.086148, -77.667403))
                .title("Marker in Gibson"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.083468, -77.681637))
                .title("Marker in Global Village"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.079947,-77.67814))
                .title("Marker in Global Village"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.123096,-77.662103))
                .title("Marker in Airport"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.122720,-77.663515))
                .title("Marker in Airport"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.107558,-77.686679))
                .title("Marker in Airport"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.120089,-77.658711))
                .title("Marker in Airport"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.084116,-77.632076))
                .title("Marker in Market Place Mall"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.083614,-77.636194
        ))
                .title("Marker in Market Place Mall"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.082110,-77.633406))
                .title("Marker in Market Place Mall"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.102449,-77.610886))
                .title("Marker in MCC"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.102292,-77.610714))
                .title("Marker in MCC"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.100287,-77.607625))
                .title("Marker in MCC"));


        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rochester, 13));



    }
}

