package com.kerjen.exodus.learning_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent0 = new Intent(this, ChooseScreenActivity.class);
        startActivity(intent0);
        finish();
    }
}

//данное activity является экраном загрузки приложения, но не совсем таким, какой мы изначально
//собиральсь сделать
//если хотите посмотреть его строение, то вот ссылка: https://habrahabr.ru/post/312516/

//для добавления новых цветов, при возникновении проблем с их же нехваткой в
//ресурсах android studio, в файле, по пути: ваш_проект\app\src\main\res\values\colors - добавляем
//нужный цвет
//вот полезная статья: http://developer.alexanderklimov.ru/android/trafficlights.php

