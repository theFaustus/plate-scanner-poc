package com.evil.inc.platescannerocrpoc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.evil.inc.platescannerocrpoc.service.LicensePlateService;
import com.google.gson.JsonObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;


public class Result extends AppCompatActivity {
    Intent intent;
    String value;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        intent = getIntent();
        value = intent.getStringExtra("result"); //if it's a string you stored.

        text = findViewById(R.id.textView);
        try {
            validate(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //function for searching the number plate and scrapping the result
    public void validate(String number) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.17.41.34:8080/plates/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        retrofit.create(LicensePlateService.class).validateLicensePate(number).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                text.setText(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                text.setText("Sorry no record found");
            }
        });
    }
}