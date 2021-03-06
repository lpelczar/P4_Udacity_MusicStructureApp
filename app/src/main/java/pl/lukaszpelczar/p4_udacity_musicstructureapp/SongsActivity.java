package pl.lukaszpelczar.p4_udacity_musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //These lines of code sets the logo in App Toolbar
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.logo);

        // Find the View
        TextView playing = (TextView) findViewById(R.id.playing);

        // Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(playingIntent);
            }
        });

        // Find the View
        TextView library = (TextView) findViewById(R.id.library);

        // Set a click listener on that View
        library.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(SongsActivity.this, MainActivity.class);
                startActivity(libraryIntent);
            }
        });

        // Find the View
        TextView browse = (TextView) findViewById(R.id.browse);

        // Set a click listener on that View
        browse.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent browseIntent = new Intent(SongsActivity.this, BrowseActivity.class);
                startActivity(browseIntent);
            }
        });

        // Find the View
        TextView search = (TextView) findViewById(R.id.search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(SongsActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        // Find the View
        TextView firstSong = (TextView) findViewById(R.id.firstSong);

        // Set a click listener on that View
        firstSong.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent firstSongIntent = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(firstSongIntent);
            }
        });

    }
}
