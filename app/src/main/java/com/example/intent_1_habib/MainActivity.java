package com.example.intent_1_habib;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.intent_1_habib.Adapter.FragmentAdapter;
import com.example.intent_1_habib.Fragement.Fragment1;
import com.example.intent_1_habib.Fragement.Fragment2;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemSelectedListener {

    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = findViewById(R.id.sp_sp);
        sp.setOnItemSelectedListener(this);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.fragment, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sp.setAdapter(adapter);
    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        FragmentManager move;
        move = getSupportFragmentManager();
        switch (position){
            case 0 :
                move.beginTransaction().replace(R.id.main_container,new Fragment1()).addToBackStack("any").commit();
                break;
            case 1 :
                move.beginTransaction().replace(R.id.main_container,new Fragment2()).addToBackStack("any").commit();
                break;
            case 2 :
                break;
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
