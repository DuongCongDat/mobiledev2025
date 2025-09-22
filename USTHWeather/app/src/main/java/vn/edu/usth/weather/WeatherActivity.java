package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;


public class WeatherActivity extends AppCompatActivity {
    private static final String WeaAc = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ViewPager2 vp = findViewById(R.id.viewPager);
        vp.setAdapter(new WeatherPagerAdapter(this));

    }
    }
