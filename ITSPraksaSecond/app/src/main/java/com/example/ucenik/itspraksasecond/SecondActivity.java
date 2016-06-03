package com.example.ucenik.itspraksasecond;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String receivedString = intent.getStringExtra(MainActivity.MESSAGE);

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(receivedString);

    }

    public void hello(View view) {
        Intent data = new Intent();
        data.putExtra("other", "Hello, there!");
        setResult(RESULT_OK, data);
        finish();
    }

}
