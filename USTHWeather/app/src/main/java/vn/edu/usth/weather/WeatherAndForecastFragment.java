package vn.edu.usth.weather;

import android.os.Bundle;
import android.view.*;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class WeatherAndForecastFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inf, ViewGroup c, Bundle s) {
        return inf.inflate(R.layout.fragment_weather_and_forecast, c, false);
    }

    @Override
    public void onViewCreated(View v, @Nullable Bundle s) {
        if (getChildFragmentManager().findFragmentById(R.id.fl_weather) == null) {
            FragmentTransaction t = getChildFragmentManager().beginTransaction();
            t.replace(R.id.fl_weather, new WeatherFragment());
            t.replace(R.id.fl_forecast, new ForecastFragment());
            t.commit();
        }
    }
}
