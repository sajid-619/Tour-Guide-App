package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the food category
        TextView city = (TextView) findViewById(R.id.cities);

        // Set a click listener on that View
        city.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the food category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link City}
                Intent cityIntent = new Intent(MainActivity.this, CitiesActivity.class);

                // Start the new activity
                startActivity(cityIntent);
            }
        });

        // Find the View that shows the food category
        TextView monuments = (TextView) findViewById(R.id.monuments);

        // Set a click listener on that View
        monuments.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the food category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Monuments}
                Intent monumentsIntent = new Intent(MainActivity.this, MonumentsActivity.class);

                // Start the new activity
                startActivity(monumentsIntent);
            }
        });

        // Find the View that shows the food category
        TextView famousPeople = (TextView) findViewById(R.id.famous_people);

        // Set a click listener on that View
        famousPeople.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the food category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Monuments}
                Intent famousPeopleIntent = new Intent(MainActivity.this, FamousPeopleActivity.class);

                // Start the new activity
                startActivity(famousPeopleIntent);
            }
        });

        // Find the View that shows the food category
        TextView rentACar = (TextView) findViewById(R.id.rent_a_car);

        // Set a click listener on that View
        rentACar.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the food category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Monuments}
                Intent rentACarIntent = new Intent(MainActivity.this, RentACarActivity.class);

                // Start the new activity
                startActivity(rentACarIntent);
            }
        });

    }
}
