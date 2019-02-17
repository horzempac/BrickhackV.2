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

        Spinner spinner2 = (Spinner) findViewById(R.id.distance_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.distance_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);
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
                                         g.addMarker(new MarkerOptions().position(new LatLng(43.084452, -77.673883))
                                                 .title("Marker in Clark Gym"));
                                         startActivity(new Intent(PolyActivity.this, SelfReport.class));
                                     }
                                 });


        // Position the map's camera near Alice Springs in the center of Australia,
        // and set the zoom factor so most of Australia shows on the screen.
        //googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(43.157, -77.609), 10));

        LatLng rochester = new LatLng(43.106998, -77.659939);

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.085114, -77.667220))
                .title("Case date: 2/12/19").snippet("Symptoms: Cough, sneezing " +
                        "Medication: Claratin " +
                        "Effective: Yes " +
                        "Diagnosis: Allergies"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.086485, -77.667821))
                .title("Case date: 2/13/19").snippet("Symptoms: Rash, fever, nausea " +
                        "Medication: Cortisol, tums" +
                        "Effective: No, yes" +
                        "Diagnosis: Measles"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.086148, -77.667403))
                .title("Case date: 2/10/19").snippet("Symptoms: Cough, sneezing " +
                        "Medication: Claratin " +
                        "Effective: Yes " +
                        "Diagnosis: Allergies"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.083468, -77.681637))
                .title("Case date: 2/17/19").snippet("Symptoms: Cough, sneezing " +
                        "Medication: Claratin " +
                        "Effective: Yes " +
                        "Diagnosis: Allergies"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.079947,-77.67814))
                .title("Case date: 2/13/19").snippet("Symptoms: Rash, fever, nausea " +
                        "Medication: Cortisol, tums" +
                        "Effective: No, yes" +
                        "Diagnosis: Measles"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.123096,-77.662103))
                .title("Case date: 2/16/19").snippet("Symptoms: Cough, sneezing " +
                        "Medication: Claratin " +
                        "Effective: Yes " +
                        "Diagnosis: Allergies"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.122720,-77.663515))
                .title("Case date: 2/12/19").snippet("Symptoms: Rash, fever, nausea " +
                        "Medication: Cortisol, tums" +
                        "Effective: No, yes" +
                        "Diagnosis: Measles"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.107558,-77.686679))
                .title("Case date: 2/17/19").snippet("Symptoms: Cough, sneezing " +
                        "Medication: Claratin " +
                        "Effective: Yes " +
                        "Diagnosis: Allergies"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.120089,-77.658711))
                .title("Case date: 2/16/19").snippet("Symptoms: Rash, fever, nausea " +
                        "Medication: Cortisol, tums" +
                        "Effective: No, yes" +
                        "Diagnosis: Measles"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.084116,-77.632076))
                .title("Case date: 2/16/19").snippet("Symptoms: Cough, sneezing " +
                        "Medication: Claratin " +
                        "Effective: Yes " +
                        "Diagnosis: Allergies"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.083614,-77.636194
        ))
                .title("Case date: 2/12/19").snippet("Symptoms: Cough, sneezing " +
                        "Medication: Claratin " +
                        "Effective: Yes " +
                        "Diagnosis: Allergies"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.082110,-77.633406))
                .title("Case date: 2/13/19").snippet("Symptoms: Rash, fever, nausea " +
                        "Medication: Cortisol, tums" +
                        "Effective: No, yes" +
                        "Diagnosis: Measles"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.102449,-77.610886))
                .title("Case date: 2/14/19").snippet("Symptoms: Cough, sneezing " +
                        "Medication: Claratin " +
                        "Effective: Yes " +
                        "Diagnosis: Allergies"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.102292,-77.610714))
                .title("Case date: 2/17/19").snippet("Symptoms: Headache " +
                        "Medication: Advil " +
                        "Effective: No " +
                        "Diagnosis: Migraine"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.100287,-77.607625))
                .title("Case date: 2/16/19").snippet("Symptoms: Rash, fever, nausea " +
                        "Medication: Cortisol, tums" +
                        "Effective: No, yes" +
                        "Diagnosis: Measles"));

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rochester, 13));



    }

}

