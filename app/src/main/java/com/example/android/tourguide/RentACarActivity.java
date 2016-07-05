package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class RentACarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_list);

        // Create a list of locations
        final ArrayList<Locations> locations = new ArrayList<>();
        locations.add(new Locations("Avis", R.string.avis_description));
        locations.add(new Locations("Alamo", R.string.alamo_description));

        //Create AdapterView adapter with this activity as the context, and the arrayList of Locations
        LocationsAdapter adapter = new LocationsAdapter(this, locations);

        //Create ListView listView
        ListView listView = (ListView) findViewById(R.id.list);

        //set the AdapterView to the newly created listView
        listView.setAdapter(adapter);
    }
}
