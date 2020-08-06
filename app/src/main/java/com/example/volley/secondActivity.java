package com.example.volley;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.volley.Custom.CustomDialog;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import static com.android.volley.toolbox.Volley.*;

public class secondActivity extends AppCompatActivity {
        private static final Object URL="http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=21d5615c0b94f68985f7079b0f592dd1";

        ImageView image;
        TextView temp,weather,humidity,pressure,tempunit,city;
        CustomDialog dialog;
    String[] cities={"Patna",
            "Agartala",
            "Kohima",
            "Chandigarh",
            "Ranchi",
            "Thiruvananthapuram",
            "Mumbai",
            "Bhubaneswar",
            "Chandigarh",
            "Panaji",
            "Gandhinagar",
            "Dispur",
            "Amaravati",
            "Dehradun",
            "Shimla",
            "Bhopal",
            "Jaipur",
            "Aizawl",
            "Srinagar",
            "Kolkata",
            "Raipur",
            "Chennai",
            "Lucknow",
            "Gangtok",
            "Itanagar",
            "Bangalore",
            "Shillong",
            "Imphal"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

            image =findViewById(R.id.weatherImage);
            temp =findViewById(R.id.temp);
            weather =findViewById(R.id.wea);
            city=findViewById(R.id.city);
            tempunit=findViewById(R.id.tempunit);
        weather=findViewById(R.id.wea);
        humidity=findViewById(R.id.hum);
        pressure=findViewById(R.id.press);

        dialog=new CustomDialog(this,R.layout.dialog,cities);

        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
//        dialog =new Dialog(this);
  //      dialog.setContentView(R.layout.dialog);
    //  dialog.setCancelable(true);
       // dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        public void fechdata (String city){
            String URL="http://api.openweathermap.org/data/2.5/weather?q=+&appid=21d5615c0b94f68985f7079b0f592dd1";
        }

        final Gson gson=new GsonBuilder().create();
        StringRequest request=new StringRequest((String) URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {



                Data d=gson.fromJson(response,Data.class);

                Toast.makeText(secondActivity.this,""+d.getCoord().getLat(),Toast.LENGTH_SHORT).show();



                temp.setText(""+(d.getMain().getTemp()-273));

                city.setText(""+(d.getName()));

                String We=d.getWeather().get(0).getMain();


                weather.setText(We);


                humidity.setText(""+d.getMain().getHumidity());
                pressure.setText(""+d.getMain().getPressure()+"p");



                if(weather.equals("haze")){
                    image.setImageResource(R.drawable.cloud);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        RequestQueue queue = newRequestQueue(this);
        queue.add(request);

    }
}
