package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class youtubeapi extends YouTubeBaseActivity {

    //Iniciar Variable
    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtubeapi);

        Button back = findViewById(R.id.btn_backcuatro);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), home.class);
                startActivityForResult(intent, 0);
            }
        });
        //Asignar Variable
        youTubePlayerView = findViewById(R.id.youtube_player);

        //Inicializar Listener

        YouTubePlayer.OnInitializedListener Listener = new YouTubePlayer.OnInitializedListener() {

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                //Cargar Video Usando Youtube Id
                youTubePlayer.loadVideo("-LmKCdYhrjg");

                //Iniciar Vide
                youTubePlayer.play();

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(getApplicationContext(),
                        "fallo el inicio",
                        Toast.LENGTH_SHORT).show();
            }
        };
        //Iniciar reproductor
        youTubePlayerView.initialize("AIzaSyCqhUMg1URzvHhtD5K7P-jSeFbC6Szy_lY",Listener);

    }
}