package com.example.jalsanrakshan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class home extends AppCompatActivity {
    String usename;
    ImageView imageView;
    ViewFlipper v_flpr;
    AlertDialog alertDialog;
    ImageView closeButton;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        Intent intent= getIntent();
        usename=intent.getStringExtra("username");


        imageView = (ImageView) findViewById(R.id.callingbuttons);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:7049458888"));
                Toast.makeText(home.this, "call", Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        int images[] = {R.drawable.house, R.drawable.groundtank, R.drawable.terrace};
        v_flpr = findViewById(R.id.flipr);

        for (int image : images) {
            fliperImage(image);
        }
    }
    public void fliperImage(int images) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(images);

        v_flpr.addView(imageView);
        v_flpr.setFlipInterval(4000);
        v_flpr.setAutoStart(true);

    }
    public void feature (View view){
        Intent i = new Intent(home.this, feature.class);
        startActivity(i);
        finish();
    }
    }

