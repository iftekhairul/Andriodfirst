package com.faisalpasha.phonebook3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button teach, staff, itstaff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teach=(Button)findViewById(R.id.buteach);
        teach.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Intent teaActivity= new Intent(MainActivity.this, Teacher.class);
                startActivity(teaActivity);
            }
        });
        staff=(Button)findViewById(R.id.staffbu);
        staff.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Intent staffActivity= new Intent(MainActivity.this, Staff.class);
                startActivity(staffActivity);
            }
        });



        itstaff=(Button)findViewById(R.id.itbu);
        itstaff.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Intent itstaffActivity= new Intent(MainActivity.this, ItStaff.class);
                startActivity(itstaffActivity);
            }
        });
    }
}
