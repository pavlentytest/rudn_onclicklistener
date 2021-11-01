package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    private ConstraintLayout root;
    private int counter;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(this);
        result = findViewById(R.id.textView);
       //root = findViewById(R.id.mainRoot);

        // реализация интерфейса View.OnClickListener через анонимный класс
      /*
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        */
    }

    @Override
    public void onClick(View v) {
        counter++;
        result.setText(Integer.toString(counter));

        //Toast.makeText(this,"Message!",Toast.LENGTH_LONG).show();
        //root.setBackgroundColor(Color.RED);
        //Snackbar.make(findViewById(R.id.mainRoot),"Message2",Snackbar.LENGTH_LONG).show();
    }


}