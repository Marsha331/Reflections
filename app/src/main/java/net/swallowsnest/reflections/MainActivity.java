package net.swallowsnest.reflections;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows the category
        TextView dance = (TextView)findViewById(R.id.danceAct);

        //Set the onClick listener for that view
        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent danceIntent = new Intent(MainActivity.this, DanceActivity.class);

                startActivity(danceIntent);
            }
        });
        //Find the view that shows the category
        TextView film = (TextView)findViewById(R.id.filmAct);

        //Set the onClick listener for that view
        film.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent filmIntent = new Intent(MainActivity.this, FilmActivity.class);

                startActivity(filmIntent);
            }
        });

        //Find the view that shows the category
        TextView literature = (TextView)findViewById(R.id.litAct);

        //Set the onClick listener for that view
        literature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent litIntent = new Intent(MainActivity.this, LitActivity.class);

                startActivity(litIntent);
            }
        });

        //Find the view that shows the category
        TextView music = (TextView)findViewById(R.id.musicAct);

        //Set the onClick listener for that view
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicIntent = new Intent(MainActivity.this, MusicActivity.class);

                startActivity(musicIntent);
            }
        });

        //Find the view that shows the category
        TextView photography = (TextView)findViewById(R.id.photoAct);

        //Set the onClick listener for that view
        photography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent photoIntent = new Intent(MainActivity.this, PhotoActivity.class);

                startActivity(photoIntent);
            }
        });

        //Find the view that shows the category
        TextView visual = (TextView)findViewById(R.id.visualAct);

        //Set the onClick listener for that view
        visual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent visualIntent = new Intent(MainActivity.this, VisualActivity.class);

                startActivity(visualIntent);
            }
        });
    }
}
