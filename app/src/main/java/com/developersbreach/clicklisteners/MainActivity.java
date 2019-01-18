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

        // Initialize variable with TextView and assign your id using findViewById( )
        TextView mListener = findViewById(R.id.text_listener);
        // Initialize variable with ImageView and assign your id using findViewById( )
        ImageView mImageView = findViewById(R.id.image_listener);

        /*
        Click listener for textView.
        */
        mListener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Adding toast message to check our listener.
                Toast.makeText(getApplicationContext(), "You clicked TextView", Toast.LENGTH_LONG).show();
            }
        });

        /*
        Long click listener for textView.
        */
        mListener.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                // Adding toast message to check our listener.
                Toast.makeText(getApplicationContext(), "You long clicked TextView", Toast.LENGTH_LONG).show();
                return true;
            }
        });

        /*
        Click listener for imageView.
        */
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Adding toast message to check our listener.
                Toast.makeText(getApplicationContext(), "You clicked on ImageView", Toast.LENGTH_LONG).show();
            }
        });

    }

    /*
    Click listener for textView.
    */
    public void buttonListener(View view) {
        // Adding toast message to check our listener.
        Toast.makeText(getApplicationContext(), "You clicked the button", Toast.LENGTH_LONG).show();
    }

    /*
    Navigating to different activities using onClickListener.
    */
    public void imageListener(View view) {
        Intent intentToAnotherActivity = new Intent(MainActivity.this, NavigateActivity.class);
        startActivity(intentToAnotherActivity);
    }

}
