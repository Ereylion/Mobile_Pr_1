package com.example.kosatkinegorsergeevich;

import static com.example.kosatkinegorsergeevich.MainActivity.KEY;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            String str = bundle.getString(KEY);
            TextView textView = new TextView(this); // Создаем textView
            textView.setGravity(Gravity.CENTER); // Устанавливаем по центру
            textView.setTextSize(40); // Устанавливаем размер на 40
            textView.setText(str); // Фиксируем
            setContentView(textView); // Передаем в разметку активити
        }
    }
}
