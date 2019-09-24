package com.example.employeedatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LoginWindow extends AppCompatActivity {

    LinearLayout l1;
    ImageView img;
    EditText ed1,ed2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        l1=findViewById(R.id.l1);
        img=findViewById(R.id.img1);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        btn=findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("admin") && ed2.getText().toString().equals("admin123")) {
                    final Intent i1 = new Intent(LoginWindow.this, AdminMain.class);
                    startActivity(i1);

                } else {
                    Toast.makeText(LoginWindow.this,"You Are not an ADMIN",Toast.LENGTH_SHORT).show();
                }
                finish();
            }
        });



    }
}
