package com.kerjen.exodus.learning_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

public class ReviewsActivity extends AppCompatActivity {
    private ShimmerTextView shimmerTextView2;
    private Shimmer shimmer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        shimmerTextView2 = (ShimmerTextView) findViewById(R.id.shimmer);

        shimmer2 = new Shimmer();
        shimmer2.start(shimmerTextView2);

        BottomNavigationBar bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        bottomNavigationBar.setActiveColor(R.color.colorPrimary).setInActiveColor("#FFFFFF").setBarBackgroundColor("#ECECEC");
        bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);
        bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED);
        bottomNavigationBar.
                addItem(new BottomNavigationItem(R.mipmap.ic_face_white_24dp, "Кино"))
                .addItem(new BottomNavigationItem(R.drawable.ic_launcher, "Игры"))
                .addItem(new BottomNavigationItem(R.drawable.ic_launcher,"Книги"))
                .initialise();
    }
}
