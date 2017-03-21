package com.faisalpasha.phonebook3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class Teacher extends Activity {

    ListView list;
    String[] itemname ={
            "Dr. Sayed Akhter Hossain",
            "Dr. Mohammad Fokhray Hossain",
            "Mr. Narayan Ranjan Chakrabarti",
            "Mr. Rashed Haidar Noori",
            "Ms. Subhenur Latif",
            "Mr. Fahad Faisal",
            "Mr. Mohshi Masnad"
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
            "Professor",
            "Assistant Head",
            "Assistant Professor",
            "Senior Lecturer",
            "Senior Lecturer",
            "Lecturer"
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
