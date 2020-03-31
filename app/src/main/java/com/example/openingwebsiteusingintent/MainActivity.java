package com.example.openingwebsiteusingintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            btn=findViewById(R.id.btn);


            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
                    if (i.resolveActivity(getPackageManager())!=null)
                    {
                        startActivity(i);
                    }
                }
            });

    }
}
