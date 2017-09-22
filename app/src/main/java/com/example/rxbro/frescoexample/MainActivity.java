package com.example.rxbro.frescoexample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fresco.initialize(this);

        Uri uri = Uri.parse("https://i.imgur.com/tGbaZCY.jpg");
        SimpleDraweeView draweeView = (SimpleDraweeView)findViewById(R.id.my_image);
        draweeView.setImageURI(uri);
    }
}
