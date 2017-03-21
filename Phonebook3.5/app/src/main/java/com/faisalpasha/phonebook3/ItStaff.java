package com.faisalpasha.phonebook3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class ItStaff extends Activity {

    ListView list;
    String[] itemname ={
            "Dr. Rashed Karim",
            "Mr. mahmudul hasan",
            "Mr. Maruf Chowdhury",
            "Mr. Nurul Haque",
            "Mr. Rezaur Rahman",
            "Mr. Habibur Rahman",
            "Mr. Mohsin Ahmed"
    };

    Integer[] imgid={
            R.drawable.akhter,
            R.drawable.fokhray,
            R.drawable.narayan,
            R.drawable.noori,
            R.drawable.subhenur,
            R.drawable.fahad,
            R.drawable.mohshi,
    };
    String[] desig ={
            "Head",
            "Senior IT Engineer",
            "Sr. Administrator Officer",
            "Junior IT Engineer",
            "Junior IT Engineer",
            "Junior IT Engineer",
            "Junior IT Engineer"
    };
    String[] phone ={
            "01715216",
            "23145451",
            "0145066441",
            "212106454",
            "89789465",
            "9898764",
            "322205454"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        ListAdapter adapter=new ListAdapter(this, itemname, imgid, desig, phone);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}
