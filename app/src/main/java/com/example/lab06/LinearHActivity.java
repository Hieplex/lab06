package com.example.lab06;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class LinearHActivity extends AppCompatActivity {
    Button mybt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_hactivity);
        mybt = (Button) findViewById(R.id.buttonLinearHActivity);
        mybt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent send = new Intent(LinearHActivity.this,MainActivity.class);
                send.putExtra("firstValue", new String("Helllo world!"));
                send.putExtra("secondValue",new Integer(20));
                startActivity(send);
                finish();
            }
        });
    }

}
