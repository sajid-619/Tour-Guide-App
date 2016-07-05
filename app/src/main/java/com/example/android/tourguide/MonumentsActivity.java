package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mpombos on 30/6/16.
 */
public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_list);

        // Create a list of locations
        final ArrayList<Locations> locations = new ArrayList<>();
        locations.add(new Locations("Obelisco", R.string.obelisco_description,
                R.drawable.obelisco));
        locations.add(new Locations("Palacio Legislativo", R.string.legislativo_description,
                R.drawable.legislativo));
        locations.add(new Locations("Palacio Salvo", R.string.salvo_description,
                R.drawable.salvo));

        //Create AdapterView adapter with this activity as the context, and the arrayList of Locations
        LocationsAdapter adapter = new LocationsAdapter(this, locations);

        //Create ListView listView
        ListView listView = (ListView) findViewById(R.id.list);

        //set the AdapterView to the newly created listView
        listView.setAdapter(adapter);
    }
}
