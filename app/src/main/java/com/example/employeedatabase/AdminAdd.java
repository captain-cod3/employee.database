package com.example.employeedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AdminAdd extends AppCompatActivity {

    EditText etext1,etext2,etext3,etext4;
    Button btn;
    DatabaseReference ref;
    Model model=new Model();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminadd);
        etext1=findViewById(R.id.etext1);
        etext2=findViewById(R.id.etext2);
        etext3=findViewById(R.id.etext3);
        //etext4=findViewById(R.id.etext4);
        btn=findViewById(R.id.btn1);
        ref=FirebaseDatabase.getInstance().getReference().child("employee");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String Id=etext1.getText().toString().trim();
              String Name=etext2.getText().toString().trim();
              String Position=etext3.getText().toString().trim();
              //String Name=etext4.getText().toString().trim();
              model.setId(Id);
              model.setName(Name);
              model.setPosition(Position);
              ref.push().setValue(model);
                Toast.makeText(AdminAdd.this,"Data Added to Database",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
