package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class WeatherPagerAdapter extends FragmentStateAdapter {
    public WeatherPagerAdapter(@NonNull FragmentActivity fa) { super(fa); }
    @NonNull @Override
    public Fragment createFragment(int position) { return new WeatherAndForecastFragment(); }
    @Override
    public int getItemCount() { return 3; } // 3 trang để swipe
}
