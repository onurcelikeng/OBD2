package com.example.onur.obd2.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.onur.obd2.Model.Sensors.Oxygen;
import com.example.onur.obd2.Model.Sensors.WiperWater;
import com.example.onur.obd2.R;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class OxygenActivity extends AppCompatActivity
{
    Oxygen oxygen;
    Timer timer = new Timer();
    TextView _time;
    TextView _value;
    TextView _status;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oxygen);

        _time = (TextView) findViewById(R.id.time);
        _value = (TextView) findViewById(R.id.value);
        _status = (TextView) findViewById(R.id.status);


        timer.scheduleAtFixedRate(new TimerTask()
        {
            @Override
            public void run()
            {
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {

                        oxygen = new Oxygen(getData());

                        _time.setText(Integer.toString(StartActivity.counter));
                        _value.setText(oxygen.getValue() + " " + oxygen.getUnit());
                        _status.setText(getStatus(oxygen.getValue()));
                    }
                });
            }
        }, 1000, 1000);
    }

    @Override
    public void onPause()
    {
        super.onPause();
    }

    private String getStatus(double amount)
    {

        double part = (Oxygen.minValue + Oxygen.maxValue) / 3;

        if(Oxygen.minValue <= amount && amount < part)
        {
            return "RISKY";
        }

        if(part <= amount && amount <= 2 * part)
        {
            return "NOT BAD";
        }

        else
        {
            return "GOOD";
        }
    }

    private double getData()
    {
        String[] array = StartActivity.fileData.split(";");

        return Double.valueOf(array[1]);
    }


}
