package com.kerjen.exodus.learning_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class ChooseScreenActivity extends AppCompatActivity implements View.OnClickListener {

    Button news;
    Button games;
    Button tests;
    Button reviews;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_screen);

        news = (Button) findViewById(R.id.btn1);
        games = (Button) findViewById(R.id.btn2);
        tests = (Button) findViewById(R.id.btn3);
        reviews = (Button) findViewById(R.id.btn4);

        news.setOnClickListener(this);
        games.setOnClickListener(this);
        tests.setOnClickListener(this);
        reviews.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn1:
                Intent intent1 = new Intent(this, SportNewsActivity.class);
                startActivity(intent1);
                break;

            case R.id.btn2:
                Intent intent2 = new Intent(this, GamesActivity.class);
                startActivity(intent2);
                break;

            case R.id.btn3:
                Intent intent3 = new Intent(this, TestsActivity.class);
                startActivity(intent3);
                break;

            case R.id.btn4:
                Intent intent4 = new Intent(this, FilmsReviewsActivity.class);
                startActivity(intent4);
                break;
        }
    }
}

//здесь у меня была проблема с правильной расстановкой кнопок друг относительно друга, но я её
//решил, а помогла мне в этом статья:
//http://developer.alexanderklimov.ru/android/layout/linearlayout.php
//при запусе приложения, кнопки на экране "слипаются", но это решаемо, так что в следующих версиях
//мы исправим этот недочёт
