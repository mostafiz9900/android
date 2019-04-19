package com.example.imageviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private static ImageView imageView;
private static Button button;

private int current_image_index;
int[] images ={R.mipmap.and_img1, R.mipmap.and_img2, R.mipmap.ic_launcher_foreground};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClick();
    }

    public void buttonClick(){
        imageView =(ImageView) findViewById(R.id.imageView);
        button=(Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image_index++;
                current_image_index =current_image_index % images.length;
                imageView.setImageResource(images[current_image_index]);
            }
        });
    }
}
