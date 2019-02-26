package com.example.intent_1_habib.ScrollingActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.intent_1_habib.R;

public class DetailActivity extends AppCompatActivity {
    ImageView imgDetail;
    TextView tvDetail1,tvDetail2,tvDetail3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        imgDetail = findViewById( R.id.img_detail );
        tvDetail1 = findViewById( R.id.tv_phone );
        tvDetail2 = findViewById( R.id.tv_email );
        tvDetail3 = findViewById( R.id.tv_website );

        final int position = getIntent().getIntExtra( "position", 1 );
        tvDetail2.setText( getIntent().getStringExtra( "services" ) );
        tvDetail1.setText( String.valueOf( getIntent().getIntExtra( "phone", 0 ) ) );

        tvDetail3.setText( getIntent().getStringExtra( "web" ) );

        imgDetail.setImageResource( getIntent().getIntExtra( "image", 0 ) );
        setTitle( getIntent().getStringExtra( "name" ) );

        tvDetail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( Intent.ACTION_SENDTO, Uri.fromParts( "mailto", getIntent().getStringExtra( "services" ), null ) ) );
            }
        });
tvDetail3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity( new Intent( Intent.ACTION_VIEW, Uri.parse( getIntent().getStringExtra( "web" ) ) ) );
    }

});
tvDetail1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity( new Intent( Intent.ACTION_DIAL,Uri.parse( "tel:" + getIntent().getStringExtra( "phone" ) ) ) );
    }
});

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
