package com.example.employeedatabase;

import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AdminDelete extends AppCompatActivity {

    EditText etext;
    Button btn;
    DatabaseReference def;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_delete);
        etext=findViewById(R.id.etext1);
        btn=findViewById(R.id.btn1);
       def= FirebaseDatabase.getInstance().getReference("employee");
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String t = etext.getText().toString();
               delete(t);
           }
       });
    }

    private void delete(final String t) {

      def.addValueEventListener(new ValueEventListener() {
          @Override
          public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
              for(DataSnapshot d: dataSnapshot.getChildren()){
                  Model m = d.getValue(Model.class);
                  if(m.getName().equals(t)){
                      def.child(d.getKey()).removeValue();
                      Toast.makeText(AdminDelete.this,"Data Deleted From Database",Toast.LENGTH_SHORT).show();
                  }
                  //else {
                      //Toast.makeText(AdminDelete.this, "No such user exist", Toast.LENGTH_LONG).show();
                  //}
              }
          }

          @Override
          public void onCancelled(@NonNull DatabaseError databaseError) {

          }
      });


    }


}
