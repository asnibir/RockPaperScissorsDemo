package com.example.rockpaperscissors;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class OnePlayerMode extends AppCompatActivity implements View.OnClickListener {

    private Button rock, paper, scissors;
    private ImageView yourImage, computerImage;
    private TextView yourscoreTextview, computerscoreTextview;
    int yourScore, computerScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player_mode);

        rock = findViewById(R.id.rock_button);
        paper = findViewById(R.id.paper_button);
        scissors = findViewById(R.id.scissors_button);

        yourImage = findViewById(R.id.your_image);
        computerImage = findViewById(R.id.computer_image);

        yourscoreTextview = findViewById(R.id.your_score);
        computerscoreTextview = findViewById(R.id.computer_score);

        rock.setOnClickListener(this);
        paper.setOnClickListener(this);
        scissors.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.rock_button) {
            yourImage.setImageResource(R.drawable.rock);
            String message = play_turn("rock");
            Toast.makeText(OnePlayerMode.this, message, Toast.LENGTH_SHORT).show();
            yourscoreTextview.setText("Your score: " + Integer.toString(yourScore));
            computerscoreTextview.setText("Computer score: " + Integer.toString(computerScore));
            if(yourScore == 5) {
                Toast.makeText(OnePlayerMode.this, "You Win!!!", Toast.LENGTH_SHORT).show();
                yourScore = 0;
                computerScore = 0;
            }
            else if(computerScore== 5) {
                Toast.makeText(OnePlayerMode.this, "Computer Wins!!!", Toast.LENGTH_SHORT).show();
                yourScore = 0;
                computerScore = 0;
            }
        }
        else if(view.getId() == R.id.paper_button){
            yourImage.setImageResource(R.drawable.paper);
            String message = play_turn("paper");
            Toast.makeText(OnePlayerMode.this, message, Toast.LENGTH_SHORT).show();
            yourscoreTextview.setText("Your score: " + Integer.toString(yourScore));
            computerscoreTextview.setText("Computer score: " + Integer.toString(computerScore));
            if(yourScore == 5) {
                Toast.makeText(OnePlayerMode.this, "You Win!!!", Toast.LENGTH_SHORT).show();
                yourScore = 0;
                computerScore = 0;
            }
            else if(computerScore== 5) {
                Toast.makeText(OnePlayerMode.this, "Computer Wins!!!", Toast.LENGTH_SHORT).show();
                yourScore = 0;
                computerScore = 0;
            }
        }
        else{
            yourImage.setImageResource(R.drawable.scissor);
            String message = play_turn("scissors");
            Toast.makeText(OnePlayerMode.this, message, Toast.LENGTH_SHORT).show();
            yourscoreTextview.setText("Your score: " + Integer.toString(yourScore));
            computerscoreTextview.setText("Computer score: " + Integer.toString(computerScore));
            if(yourScore == 5) {
                Toast.makeText(OnePlayerMode.this, "You Win!!!", Toast.LENGTH_SHORT).show();
                yourScore = 0;
                computerScore = 0;
            }
            else if(computerScore== 5) {
                Toast.makeText(OnePlayerMode.this, "Computer Wins!!!", Toast.LENGTH_SHORT).show();
                yourScore = 0;
                computerScore = 0;
            }
        }
    }
    public String play_turn(String player_choice){
        String computer_choice = "";
        Random r = new Random();
        //choose 1,2 or 3
        int computer_choice_number = r.nextInt(3) + 1;
        if(computer_choice_number == 1) {
            computer_choice = "rock";
        }
        else if(computer_choice_number == 2) {
            computer_choice = "paper";
        }
        else if(computer_choice_number == 3) {
            computer_choice = "scissors";
        }
        //
        if(computer_choice == "rock"){
            computerImage.setImageResource(R.drawable.rock);
        }
        else if(computer_choice == "paper"){
            computerImage.setImageResource(R.drawable.paper);
        }
        else if(computer_choice == "scissors"){
            computerImage.setImageResource(R.drawable.scissor);
        }

        //
        if(computer_choice == player_choice) {
            return "Draw. Nobody won.";
        }
        else if(player_choice == "rock" && computer_choice == "scissors"){
            yourScore++;
            return "Rock crushes scissors. You win!";
        }
        else if(player_choice == "scissors" && computer_choice == "rock"){
            computerScore++;

            return "Rock crushes scissors. Computer wins!";
        }
        else if(player_choice == "rock" && computer_choice == "paper"){
            computerScore++;
            return "Paper covers rock. Computer wins!";
        }
        else if(player_choice == "paper" && computer_choice == "rock"){
            yourScore++;
            return "Paper covers rock. You win!";
        }
        else if(player_choice == "paper" && computer_choice == "scissors"){
            computerScore++;
            return "Scissors cut paper. Computer wins!";
        }
        else if(player_choice == "scissors" && computer_choice == "paper"){
            yourScore++;
            return "Scissors cut paper. You win!";
        }
        else
            return "";

    }
}






