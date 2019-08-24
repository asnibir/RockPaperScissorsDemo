package com.example.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Player_Two extends AppCompatActivity {
    private Button rock, paper, scissors;
    private ImageView playertwoImage;
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player__two);

        rock = findViewById(R.id.player_two_rock);
        paper = findViewById(R.id.player_two_paper);
        scissors = findViewById(R.id.player_two_scissors);
        playertwoImage = findViewById(R.id.player_two_image);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            value = bundle.getString("key");
           // Toast.makeText(Player_Two.this, value, Toast.LENGTH_SHORT).show();
        }

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(Player_Two.this, "you pressed rock button", Toast.LENGTH_SHORT).show();
                playertwoImage.setImageResource(R.drawable.rock);
                if(value.equals("rock")){
                    Toast.makeText(Player_Two.this, "It's a draw!", Toast.LENGTH_SHORT).show();
                }
                if(value.equals("paper")){
                    Toast.makeText(Player_Two.this, "Player One wins!", Toast.LENGTH_SHORT).show();
                }
                if(value.equals("scissors")){
                    Toast.makeText(Player_Two.this, "Player Two wins!", Toast.LENGTH_SHORT).show();
                }
                //Intent intent = new Intent(Player_Two.this, Player_One.class);
                //startActivity(intent);

            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playertwoImage.setImageResource(R.drawable.paper);
                if(value.equals("rock")){
                    Toast.makeText(Player_Two.this, "Player Two Wins!", Toast.LENGTH_SHORT).show();

                }
                if(value.equals("paper")){
                    Toast.makeText(Player_Two.this, "It's a draw!", Toast.LENGTH_SHORT).show();
                }
                if(value.equals("scissors")){
                    Toast.makeText(Player_Two.this, "Player One wins!", Toast.LENGTH_SHORT).show();
                }
                //Intent intent = new Intent(Player_Two.this, Player_One.class);
                //startActivity(intent);
            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playertwoImage.setImageResource(R.drawable.scissor);
                if(value.equals("rock")){
                    Toast.makeText(Player_Two.this, "Player One wins!", Toast.LENGTH_SHORT).show();
                }
                if(value.equals("paper")){
                    Toast.makeText(Player_Two.this, "Player Two wins!", Toast.LENGTH_SHORT).show();
                }
                if(value.equals("scissors")){
                    Toast.makeText(Player_Two.this, "It's a draw!", Toast.LENGTH_SHORT).show();
                }
                //Intent intent = new Intent(Player_Two.this, Player_One.class);
                //startActivity(intent);

            }
        });
    }
}
