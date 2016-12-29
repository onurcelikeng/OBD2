package com.example.onur.obd2;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.onur.obd2.View.StartActivity;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText _name = (EditText) findViewById(R.id.name);
        final EditText _mail = (EditText) findViewById(R.id.mail);
        final EditText _phone = (EditText) findViewById(R.id.phone);

        Button _enterButton = (Button) findViewById(R.id.enterButton);
        _enterButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(_name.getText().toString().equals("") && _mail.getText().toString().equals("") && _phone.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Eksik bilgi girdiniz.", Toast.LENGTH_LONG).show();
                }

                else
                {
                    startActivity(new Intent(MainActivity.this, StartActivity.class));
                }
            }
        });
    }

    private void SaveInformation()
    {

    }

}
