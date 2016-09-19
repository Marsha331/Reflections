package net.swallowsnest.reflections;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by marshas on 9/18/16.
 */
public class RulesActivity extends AppCompatActivity {
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_rules);

            //Find the view that shows the category
            TextView home = (TextView)findViewById(R.id.home);

            //Set the onClick listener for that view
            home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent homeIntent = new Intent(RulesActivity.this, MainActivity.class);

                    startActivity(homeIntent);
                }
            });

        //Find the view that shows the category
        TextView dance = (TextView)findViewById(R.id.danceAct);

        //Set the onClick listener for that view
        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent danceIntent = new Intent(RulesActivity.this, DanceActivity.class);

                startActivity(danceIntent);
            }
        });


        //Find the view that shows the category
            TextView film = (TextView)findViewById(R.id.filmAct);

            //Set the onClick listener for that view
            film.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent filmIntent = new Intent(RulesActivity.this, FilmActivity.class);

                    startActivity(filmIntent);
                }
            });

            //Find the view that shows the category
            TextView literature = (TextView)findViewById(R.id.litAct);

            //Set the onClick listener for that view
            literature.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent litIntent = new Intent(RulesActivity.this, LitActivity.class);

                    startActivity(litIntent);
                }
            });

            //Find the view that shows the category
            TextView musicComposition = (TextView)findViewById(R.id.musicAct);

            //Set the onClick listener for that view
            musicComposition.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent musicIntent = new Intent(RulesActivity.this, MusicActivity.class);

                    startActivity(musicIntent);
                }
            });

            //Find the view that shows the category
            TextView photography = (TextView)findViewById(R.id.photoAct);

            //Set the onClick listener for that view
            photography.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent photoIntent = new Intent(RulesActivity.this, PhotoActivity.class);

                    startActivity(photoIntent);
                }
            });

            //Find the view that shows the category
            TextView visualArts = (TextView)findViewById(R.id.visualAct);

            //Set the onClick listener for that view
            visualArts.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent visualIntent = new Intent(RulesActivity.this, VisualActivity.class);

                    startActivity(visualIntent);
                }
            });
        }
    }


