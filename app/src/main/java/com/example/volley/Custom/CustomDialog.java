<<<<<<< HEAD
package com.example.volley.Custom;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.volley.R;

import static com.example.volley.R.*;
import static com.example.volley.R.id.*;
import static com.example.volley.R.id.citytext;
import static com.example.volley.R.id.note;

public class CustomDialog extends Dialog {
    Context context;
    String[] cities;

    public CustomDialog(@NonNull Context context,int LayoutResource,String[] c){
        super(context);

        this.context=context;
        this.cities=c;
        this.setContentView(LayoutResource);
        this.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

    }

}


class Adapter extends RecyclerView.Adapter{

    Context context;
    String[] cities;

    public Adapter(Context context, String[] cities) {
        this.context = context;
        this.cities = cities;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View v=layoutInflater.inflate(R.layout.card,viewGroup,false);

        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        holder.citytext.setText(cities[i]);
    }


    @Override
    public int getItemCount() {
        return cities.length;
    }

    class Holder extends RecyclerView.ViewHolder{


        TextView note,citytext;

        public Holder(@NonNull View itemView){
            super(itemView);

            note=itemView.findViewById(id.note);
            citytext=itemView.findViewById(id.citytext);
        }
    }
}
=======
package com.example.volley.Custom;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.volley.R;

import static com.example.volley.R.*;
import static com.example.volley.R.id.*;
import static com.example.volley.R.id.citytext;
import static com.example.volley.R.id.note;

public class CustomDialog extends Dialog {
    Context context;
    String[] cities;

    public CustomDialog(@NonNull Context context,int LayoutResource,String[] c){
        super(context);

        this.context=context;
        this.cities=c;
        this.setContentView(LayoutResource);
        this.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

    }

}


class Adapter extends RecyclerView.Adapter{

    Context context;
    String[] cities;

    public Adapter(Context context, String[] cities) {
        this.context = context;
        this.cities = cities;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View v=layoutInflater.inflate(R.layout.card,viewGroup,false);

        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        holder.citytext.setText(cities[i]);
    }


    @Override
    public int getItemCount() {
        return cities.length;
    }

    class Holder extends RecyclerView.ViewHolder{


        TextView note,citytext;

        public Holder(@NonNull View itemView){
            super(itemView);

            note=itemView.findViewById(id.note);
            citytext=itemView.findViewById(id.citytext);
        }
    }
}
>>>>>>> c95cebe... new
