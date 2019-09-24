package com.example.employeedatabase;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Employee extends AppCompatActivity {

    private List<Model> modelList;
    DatabaseReference def;
    private ListView lst1;
    ArrayList<Model> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecustom);
        FirebaseApp.initializeApp(this);
        def = FirebaseDatabase.getInstance().getReference("employee");
        lst1 = findViewById(R.id.lst1);
        fetch();

    }
public void fetch()
        {
            def.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    for(DataSnapshot ds : dataSnapshot.getChildren())
                    {
                        Model m=ds.getValue(Model.class);
                        list.add(m);
                    }
                    Custom_Employee custom_employee=new Custom_Employee(Employee.this,R.layout.activity_employee,list);
                    lst1.setAdapter(custom_employee);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }


}
