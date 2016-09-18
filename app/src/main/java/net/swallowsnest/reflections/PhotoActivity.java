package net.swallowsnest.reflections;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by marshas on 9/17/16.
 */
public class PhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        //Find the view that shows the category
        TextView film = (TextView)findViewById(R.id.filmAct);

        //Set the onClick listener for that view
        film.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent filmIntent = new Intent(PhotoActivity.this, FilmActivity.class);

                startActivity(filmIntent);
            }
        });

        //Find the view that shows the category
        TextView literature = (TextView)findViewById(R.id.litAct);

        //Set the onClick listener for that view
        literature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent litIntent = new Intent(PhotoActivity.this, LitActivity.class);

                startActivity(litIntent);
            }
        });

        //Find the view that shows the category
        TextView musicComposition = (TextView)findViewById(R.id.musicAct);

        //Set the onClick listener for that view
        musicComposition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent musicIntent = new Intent(PhotoActivity.this, MusicActivity.class);

                startActivity(musicIntent);
            }
        });

        //Find the view that shows the category
        TextView dance = (TextView)findViewById(R.id.danceAct);

        //Set the onClick listener for that view
        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent photoIntent = new Intent(PhotoActivity.this, DanceActivity.class);

                startActivity(photoIntent);
            }
        });

        //Find the view that shows the category
        TextView visualArts = (TextView)findViewById(R.id.visualAct);

        //Set the onClick listener for that view
        visualArts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent visualIntent = new Intent(PhotoActivity.this, VisualActivity.class);

                startActivity(visualIntent);
            }
        });
    }
}
