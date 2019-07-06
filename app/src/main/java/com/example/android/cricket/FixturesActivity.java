package com.example.android.cricket;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FixturesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixtures);
    }

    public void gotomat(View view) {

        EditText editText = findViewById(R.id.entermat);
        String number = editText.getText().toString();

        int num = Integer.parseInt(number);

        if (num >= 1 && num <= 45)
        {
            String str="mat"+number;

            int id= getResources().getIdentifier(str,
                    "id", getPackageName());

            ScrollView scrollView = findViewById(R.id.sv);
            View inside = findViewById(id);

            scrollView.scrollTo(0, (int) inside.getY());
        }

        else
        {
            Toast.makeText(getApplicationContext(),"Invalid match number!",Toast.LENGTH_SHORT).show();
        }
    }
}
