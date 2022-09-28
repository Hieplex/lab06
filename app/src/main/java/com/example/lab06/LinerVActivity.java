package com.example.lab06;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinerVActivity extends AppCompatActivity {
    EditText myEditText;
    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liner_vactivity);
        myEditText = (EditText) findViewById(R.id.editTextName);
        myButton = (Button) findViewById(R.id.buttonSend);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // give data for previous activity
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("YourName",myEditText.getText().toString() );
                intent.putExtras(bundle); //send with data
                setResult(RESULT_OK, intent); // return result
                finish(); // close activity2 and back to Activity1
            }
        });
    }
}