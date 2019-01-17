package com.developersbreach.clicklisteners;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mListener = findViewById(R.id.text_listener);
        ImageView mImageView = findViewById(R.id.image_listener);

        mListener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You clicked TextView", Toast.LENGTH_LONG).show();
            }
        });

        mListener.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "You long clicked TextView", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You clicked on ImageView", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void buttonListener(View view) {
        Toast.makeText(getApplicationContext(), "You clicked the button", Toast.LENGTH_LONG).show();
    }

    public void imageListener(View view) {
        Intent intentToAnotherActivity = new Intent(MainActivity.this, NavigateActivity.class);
        startActivity(intentToAnotherActivity);
    }
}
