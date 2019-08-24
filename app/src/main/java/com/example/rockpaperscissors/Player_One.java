package com.example.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Player_One extends AppCompatActivity {

    private Button rock, paper, scissors;
    private ImageView playeroneImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player__one);

        rock = findViewById(R.id.player_one_rock);
        paper = findViewById(R.id.player_one_paper);
        scissors = findViewById(R.id.player_one_scissors);
        playeroneImage = findViewById(R.id.player_one_image);

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playeroneImage.setImageResource(R.drawable.rock);
                Intent intent = new Intent(Player_One.this, Player_Two.class);
                intent.putExtra("key", "rock");
                startActivity(intent);

            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playeroneImage.setImageResource(R.drawable.paper);
                Intent intent = new Intent(Player_One.this, Player_Two.class);
                intent.putExtra("key", "paper");
                startActivity(intent);

            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playeroneImage.setImageResource(R.drawable.scissor);
                Intent intent = new Intent(Player_One.this, Player_Two.class);
                intent.putExtra("key", "scissors");
                startActivity(intent);

            }
        });
    }
}
