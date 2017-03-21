package com.faisalpasha.phonebook3;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    private final String[] desig;
    private final String[] phone;


    public  ListAdapter (Activity context, String[] itemname, Integer[] imgid, String[] desig, String[] phone) {
        super(context, R.layout.list, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.desig=desig;
        this.phone=phone;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);
        TextView phon = (TextView) rowView.findViewById(R.id.phone1);
        Button butA =(Button)rowView.findViewById(R.id.callbutton);
        Button smsA =(Button)rowView.findViewById(R.id.smsbutton);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText(desig[position]);
        phon.setText("Phone: "+phone[position]);
        //newly innovated
        butA.setOnClickListener(new View.OnClickListener(){
            public void  onClick (View v){
                Intent in =new Intent(Intent.ACTION_CALL);
                // if String.format not used begining number does not show
                in.setData(Uri.parse(String.format("tel:%s", phone[position])));
                context.startActivity(in);
            }
        });
        smsA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse(String.format("smsto:%s", phone[position]));
                Intent sms = new Intent(Intent.ACTION_SENDTO, uri);
                context.startActivity(sms);
            }
        });
        return rowView;

    };
}


