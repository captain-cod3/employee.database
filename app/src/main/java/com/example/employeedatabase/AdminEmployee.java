package com.example.employeedatabase;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminEmployee extends AppCompatActivity {

    ImageView img1,img2;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_employee);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AdminEmployee.this,LoginWindow.class);
                startActivity(intent);
            }
        });
       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent2=new Intent(AdminEmployee.this,Employee.class);
               startActivity(intent2);
           }
       });

    }

}
