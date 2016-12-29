package com.example.onur.obd2.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.onur.obd2.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;

public class StartActivity extends AppCompatActivity
{
    public static String fileData;
    public static int counter = 0;
    Timer timer = new Timer();
    TextView _time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        _time = (TextView) findViewById(R.id.time);

        StringBuffer sbuffer = new StringBuffer();
        InputStream is = this.getResources().openRawResource(R.raw.file);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(is));

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
                        try {
                            fileData = reader.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        _time.setText(Integer.toString((counter)));
                        counter++;
                    }
                });
            }
        }, 1000, 1000);


        LinearLayout _oxygenButton = (LinearLayout) findViewById(R.id.oxgyenButton);
        _oxygenButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(StartActivity.this, OxygenActivity.class));
            }
        });

        LinearLayout _carbonDioksideButton = (LinearLayout) findViewById(R.id.carbonDioksideButton);
        _carbonDioksideButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(StartActivity.this, CarbonDioxideActivity.class));
            }
        });

        LinearLayout _fuelAmountButton = (LinearLayout) findViewById(R.id.fuelAmountButton);
        _fuelAmountButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(StartActivity.this, FuelAmountActivity.class));
            }
        });

        LinearLayout _wiperButton = (LinearLayout) findViewById(R.id.wiperButton);
        _wiperButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(StartActivity.this, WiperWaterActivity.class));
            }
        });

        LinearLayout _speedTimingButton = (LinearLayout) findViewById(R.id.speedTimingButton);
        _speedTimingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(StartActivity.this, SpeedTimingActivity.class));
            }
        });

        LinearLayout _gpsButton = (LinearLayout) findViewById(R.id.gpsButton);
        _gpsButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(StartActivity.this, MapsActivity.class));
            }
        });

        LinearLayout _transmissionButton = (LinearLayout) findViewById(R.id.transmissionButton);
        _transmissionButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(StartActivity.this, TransmissionActivity.class));
            }
        });

        LinearLayout _engineOilButton = (LinearLayout) findViewById(R.id.engineOilButton);
        _engineOilButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(StartActivity.this, EngineOilActivity.class));
            }
        });

        LinearLayout _controlButton = (LinearLayout) findViewById(R.id.controlButton);
        _controlButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(StartActivity.this, ControlSensorActivity.class));
            }
        });

        LinearLayout _resultButton = (LinearLayout) findViewById(R.id.resultButton);
        _resultButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(StartActivity.this, ResultActivity.class));
            }
        });

    }


    @Override
    public void onPause()
    {
        super.onPause();
    }

}