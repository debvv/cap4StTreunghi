package com.example.cap4sttreunghi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
    }
    public void MyClick(View v)
    {  try {
        Intent intent = new Intent(MainActivity.this,Draw.class);
        intent.putExtra("points",et1.getText().toString());
        startActivity(intent);
        //startActivityForResult(intent,1);
    } catch (Exception e) {
        Toast.makeText(getBaseContext(), e.getMessage(),
                Toast.LENGTH_LONG).show();
    }
    }

}