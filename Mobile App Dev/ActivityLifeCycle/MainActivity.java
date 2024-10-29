package com.example.start;
import androidx.appcompat.app.AppCompatActivity;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Appstate","Created");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("Appstate","Starting");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("Appstate","Resuming");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("Appstate","Paused");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("Appstate","Stopped");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("Appstate","Restarted");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("Appstate","Destroyed");
    }
}