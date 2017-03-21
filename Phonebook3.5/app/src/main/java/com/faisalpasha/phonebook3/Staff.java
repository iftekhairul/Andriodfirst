package com.faisalpasha.phonebook3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class Staff extends Activity {

    ListView list;
    String[] itemname ={
            "Mr.Mahmudul Hasan",
            "Mr. Rashedul Hasan",
            "Mr.Imran Hossain",
            "Mr.Saiful Islam",
            "Ms. Jahid Hasan",
            "Mr. Monoj Kumar",
            "Mr. Taveer Zaman"
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
            "Administrative Head",
            "Assistan Administrator",
            "Maintanance",
            "Staff",
            "STaff",
            "STaff",
            "Staff"
    };
    String[] phone ={
            "01715744",
            "23154691",
            "01785425",
            "21254878",
            "47789465",
            "988725864",
            "322475854"
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
