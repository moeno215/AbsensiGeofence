package com.google.android.gms.location.sample.geofencing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.location.sample.geofencing.respon_login.ResponseLogin;
import com.google.android.gms.location.sample.geofencing.rest.ApiClient;
import com.google.android.gms.location.sample.geofencing.rest.ApiInterface;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends AppCompatActivity {

    EditText etname, etpass;
    Button btn ;
    ApiInterface mApiInterface = ApiClient.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn = findViewById(R.id.btn);
        final EditText etname = findViewById(R.id.etname);
        final EditText etpass = findViewById(R.id.etpass);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Call<ResponseLogin> testlogin = mApiInterface.getLog(
                        etname.getText().toString(),
                        etpass.getText().toString());

                Log.d("login", etname.getText().toString() + etpass.getText().toString());

                testlogin.enqueue(new Callback<ResponseLogin>() {
                    @Override
                    public void onResponse(Call<ResponseLogin> call, Response<ResponseLogin> response) {
                        Log.d("login", response.body().toString());

                        String status = response.body().getResult();
                        if (status.equals("1")){
                            Intent barIntent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(barIntent);

                            Toast.makeText(LoginActivity.this, "Praise the sun" , Toast.LENGTH_SHORT).show();

                        }


                        }

                    @Override
                    public void onFailure(Call<ResponseLogin> call, Throwable t) {
                        Log.d("login", t.getMessage().toString());

                        Toast.makeText(LoginActivity.this, "YOU DIED" , Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });

    }

}
