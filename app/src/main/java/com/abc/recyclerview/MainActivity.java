package com.abc.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrcontacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrcontacts.add(new ContactModel(R.drawable.photo,"Balaji","7391960082"));
        arrcontacts.add(new ContactModel(R.drawable.image,"Balaji","7391960082"));
        arrcontacts.add(new ContactModel(R.drawable.sc,"Balaji","7391960082"));
        arrcontacts.add(new ContactModel(R.drawable.dip,"Balaji","7391960082"));
        arrcontacts.add(new ContactModel(R.drawable.photo,"Balaji","7391960082"));
        arrcontacts.add(new ContactModel(R.drawable.photo,"Balaji","7391960082"));
        arrcontacts.add(new ContactModel(R.drawable.photo,"Balaji","7391960082"));
        arrcontacts.add(new ContactModel(R.drawable.photo,"Balaji","7391960082"));



        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrcontacts);
        recyclerView.setAdapter(adapter);




    }
}