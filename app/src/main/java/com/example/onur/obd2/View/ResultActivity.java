package com.example.onur.obd2.View;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.example.onur.obd2.R;

public class ResultActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        LinearLayout _sendButton = (LinearLayout) findViewById(R.id.sendButton);
        _sendButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("mailto:posta@onurcelikeng.com?subject=Bir şikayetim olacaktı"));
                startActivity(intent);
            }
        });
    }

}
