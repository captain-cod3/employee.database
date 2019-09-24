package com.example.employeedatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Custom_Employee extends ArrayAdapter<Model>{
    Context context;
    int resource;
    List<Model> modelList;

    public Custom_Employee(Context context, int resource, List<Model> modelList) {
        super(context, resource,modelList);
        this.context=context;
        this.resource = resource;
        this.modelList = modelList;
    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.activity_employee,null);

        TextView txt1=view.findViewById(R.id.tid);
        TextView txt2=view.findViewById(R.id.tname);
        TextView txt3=view.findViewById(R.id.tpost);
        //TextView txt4=view.findViewById(R.id.tsal);
        ImageView img1=view.findViewById(R.id.img1);


        Model eobj=modelList.get(position);
        txt1.setText(eobj.getId());
        txt2.setText(eobj.getName());
        txt3.setText(eobj.getPosition());
        //txt4.setText(eobj.getSalary()+"");
        Glide.with(context).load("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjxjKHMqrzhAhXBjOYKHXqRAQAQjRx6BAgBEAU&url=https%3A%2F%2Fpngtree.com%2Ficon-categories%2Fpeople&psig=AOvVaw2HXFdh7EKurrzrP0XlPgNF&ust=1554669792315920").into(img1);

        return view;
    }
}
