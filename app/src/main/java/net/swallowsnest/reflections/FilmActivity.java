package net.swallowsnest.reflections;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by marshas on 9/17/16.
 */
public class FilmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);

        //Find the view that shows the category
        TextView home = (TextView)findViewById(R.id.home);

        //Set the onClick listener for that view
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(FilmActivity.this, MainActivity.class);

                startActivity(homeIntent);
            }
        });


        //Find the view that shows the category
        TextView dance = (TextView)findViewById(R.id.danceAct);

        //Set the onClick listener for that view
        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent danceIntent = new Intent(FilmActivity.this, FilmActivity.class);

                startActivity(danceIntent);
            }
        });

        //Find the view that shows the category
        TextView literature = (TextView)findViewById(R.id.litAct);

        //Set the onClick listener for that view
        literature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent litIntent = new Intent(FilmActivity.this, LitActivity.class);

                startActivity(litIntent);
            }
        });

        //Find the view that shows the category
        TextView musicComposition = (TextView)findViewById(R.id.musicAct);

        //Set the onClick listener for that view
        musicComposition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicIntent = new Intent(FilmActivity.this, MusicActivity.class);

                startActivity(musicIntent);
            }
        });

        //Find the view that shows the category
        TextView photography = (TextView)findViewById(R.id.photoAct);

        //Set the onClick listener for that view
        photography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent photoIntent = new Intent(FilmActivity.this, PhotoActivity.class);

                startActivity(photoIntent);
            }
        });

        //Find the view that shows the category
        TextView visualArts = (TextView)findViewById(R.id.visualAct);

        //Set the onClick listener for that view
        visualArts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent visualIntent = new Intent(FilmActivity.this, VisualActivity.class);

                startActivity(visualIntent);
            }
        });
    }
}
