package com.kerjen.exodus.learning_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.loopj.android.http.*;

import org.json.JSONArray;
import org.json.JSONObject;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {


    EditText name;
    EditText pass;

    Button reg;
    Button log;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        name = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        reg = (Button) findViewById(R.id.button);
        log = (Button) findViewById(R.id.button2);
        reg.setOnClickListener(this);
        log.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AsyncHttpClient client = new AsyncHttpClient();
        RequestParams params = new RequestParams();
        params.put("username", name.getText().toString());
        params.put("password", pass.getText().toString());

        switch (v.getId()) {

            case R.id.button:
                client.get("http://195.19.44.155/samsung/api/?method=register", params, new JsonHttpResponseHandler() {


                    @Override
                    public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, JSONObject response) {
                        // super.onSuccess(statusCode, headers, response);

                    }


                    @Override
                    public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, Throwable throwable, JSONArray errorResponse) {
                        // super.onFailure(statusCode, headers, throwable, errorResponse);
                    }
                });
                break;


            case R.id.button2:
                client.get("http://195.19.44.155/samsung/api/?method=login", params, new JsonHttpResponseHandler() {


                    @Override
                    public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, JSONObject response) {
                        // super.onSuccess(statusCode, headers, response);
                        Intent intent01 = new Intent(RegistrationActivity.this, ChooseScreenActivity.class);
                        startActivity(intent01);
                    }


                    @Override
                    public void onFailure(int statusCode, cz.msebera.android.httpclient.Header[] headers, Throwable throwable, JSONArray errorResponse) {
                        // super.onFailure(statusCode, headers, throwable, errorResponse);
                    }
                });
                break;
        }

    }

}

//здесь у нас проходит регистрация, и вход в приложение
//пока у нас нет своего сервера, я воспользовался сервером, предоставленным нам на уроке

//ввиду возникновения неизвестных мне проброблем при переходе с SplashScreenActivity сюда, это
//activity пока остаётся незадействованным в нашем приложении
//предполагаю, что проблемы могли появиться, в целом, из-за библиотек, нужных для работы Bottom
//Navigation Bar-а, и, в частности, из-за моего использования в данной активности библиотеки
//com.loopj.android.http
