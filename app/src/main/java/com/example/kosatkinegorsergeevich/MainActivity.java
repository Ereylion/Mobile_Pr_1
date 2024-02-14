package com.example.kosatkinegorsergeevich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRR","onCreate");
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
        Button btn_2 = findViewById(R.id.button2);
        btn_2.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRR","onStart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRR","onDestroy()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRR","onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRR","onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRR","onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRR","onStop()");
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button) {
            Intent intent = new Intent(this, MainActivity2.class);
            EditText editText = findViewById(R.id.editTextText); // Ищем текстовое поле
            String message = editText.getText().toString();
            intent.putExtra(KEY, message);
            startActivity(intent);
        }
        else if(v.getId() == R.id.button2) {
            Intent intent2 = new Intent(Intent.ACTION_VIEW);
            String str = "https://developer.android.com/";
            intent2.setData(Uri.parse(str));
            startActivity(intent2);
        }
    }
}