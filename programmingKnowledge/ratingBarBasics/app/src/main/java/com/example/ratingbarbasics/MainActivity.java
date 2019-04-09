package com.example.ratingbarbasics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    RatingBar ratingBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listenerFrorRatingBar();
        onButtonClickListstener();
    }
    public  void listenerFrorRatingBar(){
        ratingBar=(RatingBar) findViewById(R.id.ratingBar);
        editText=(EditText) findViewById(R.id.editText);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                editText.setText(String.valueOf(rating));
            }
        });
    }
    public  void  onButtonClickListstener(){
        ratingBar=(RatingBar) findViewById(R.id.ratingBar);
        button=(Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, String.valueOf(ratingBar.getRating()), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
