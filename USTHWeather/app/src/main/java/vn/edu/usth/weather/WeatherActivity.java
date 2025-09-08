package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;


public class WeatherActivity extends AppCompatActivity {
    private static final String WeaAc = "WeatherActivity";

    @Override
    protected void onCreate(Bundle s) {
        super.onCreate(s);
        Log.i(WeaAc,"****Create****");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(WeaAc,"****Start****");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(WeaAc,"****Resume****");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(WeaAc,"****Pause****");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(WeaAc,"****Stop****");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(WeaAc,"****Destroy****");
    }
}
//startapp: onStart
//back: onPause, onStop, onDestroy
//home: onPause, onStop
//recent: onPause, onStop
//tap app at recent mode: onStart, onResume
//kill app: onPaseu, onStop, onDestroy