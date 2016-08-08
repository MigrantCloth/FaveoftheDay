/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.faveoftheday;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.faveoftheday.AnitaBaker;
import com.example.android.faveoftheday.OutKast;
import com.example.android.faveoftheday.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Find the View that shows the Anita Baker category
        TextView AnitaBaker = (TextView) findViewById(R.id.AnitaBaker);

        // Set a click listener on that View
        AnitaBaker.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent AnitaBakerIntent = new Intent(MainActivity.this, AnitaBaker.class);
                startActivity(AnitaBakerIntent);
            }
        });

        // Find the View that shows the Boyz II Men category
        TextView BoyzIIMen = (TextView) findViewById(R.id.BoyzIIMen);

        // Set a click listener on that View
        BoyzIIMen.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent BoyzIIMenIntent = new Intent(MainActivity.this, BoyzIIMen.class);
                startActivity(BoyzIIMenIntent);
            }
        });

        // Find the View that shows the OutKast category
        TextView outkast = (TextView) findViewById(R.id.OutKast);

        // Set a click listener on that View
        outkast.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent outkastIntent = new Intent(MainActivity.this, OutKast.class);
                startActivity(outkastIntent);
            }
        });

        // Find the View that shows the Rakim category
        TextView rakim = (TextView) findViewById(R.id.Rakim);

        // Set a click listener on that View
        rakim.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent rakimIntent = new Intent(MainActivity.this, Rakim.class);
                startActivity(rakimIntent);
            }
        });
    }


}