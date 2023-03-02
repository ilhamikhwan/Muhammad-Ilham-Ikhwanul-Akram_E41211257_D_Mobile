package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }



    public void menu(View view){
        Intent intent = new Intent(MainActivity.this, com.example.layout.Linear_activity.class);

        startActivity(intent);
    }
    public void menu2(View view){
        Intent intent = new Intent(MainActivity.this,relative_activity.class);

        startActivity(intent);
    }
    public void menu3(View view){
        Intent intent = new Intent(MainActivity.this,constraint_activity.class);

        startActivity(intent);
    }

    public void menu4(View view){
        Intent intent = new Intent(MainActivity.this, frame_activity.class);

        startActivity(intent);
    }

    public void menu5(View view){
        Intent intent = new Intent(MainActivity.this,table_activity.class);

        startActivity(intent);
    }
    public void menu6(View view){
        Intent intent = new Intent(MainActivity.this,material_activity.class);

        startActivity(intent);
    }
    public void menu7(View view){
        Intent intent = new Intent(MainActivity.this, horizontal_activity.class);

        startActivity(intent);
    }
    public void menu8(View view){
        Intent intent = new Intent(MainActivity.this,scrollview_activity.class);

        startActivity(intent);
    }



}