package com.example.cryptographer;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.one).setVisibility(View.VISIBLE);
        findViewById(R.id.two).setVisibility(View.VISIBLE);
        findViewById(R.id.three).setVisibility(View.VISIBLE);
        findViewById(R.id.four).setVisibility(View.VISIBLE);
        findViewById(R.id.five).setVisibility(View.VISIBLE);
        findViewById(R.id.six).setVisibility(View.VISIBLE);
        findViewById(R.id.editText).setVisibility(View.VISIBLE);
        findViewById(R.id.send).setVisibility(View.INVISIBLE);
        findViewById(R.id.textView).setVisibility(View.INVISIBLE);
        findViewById(R.id.back).setVisibility(View.INVISIBLE);
        final EditText input = findViewById(R.id.editText);
        Button send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendText();
            }
        });
        Button one = findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String original = input.getText().toString();
                findViewById(R.id.one).setVisibility(View.INVISIBLE);
                findViewById(R.id.two).setVisibility(View.INVISIBLE);
                findViewById(R.id.three).setVisibility(View.INVISIBLE);
                findViewById(R.id.four).setVisibility(View.INVISIBLE);
                findViewById(R.id.five).setVisibility(View.INVISIBLE);
                findViewById(R.id.six).setVisibility(View.INVISIBLE);
                findViewById(R.id.editText).setVisibility(View.INVISIBLE);
                findViewById(R.id.send).setVisibility(View.VISIBLE);
                findViewById(R.id.back).setVisibility(View.VISIBLE);
                crypto(1, original);
            }
        });
        Button two = findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String original = input.getText().toString();
                findViewById(R.id.one).setVisibility(View.INVISIBLE);
                findViewById(R.id.two).setVisibility(View.INVISIBLE);
                findViewById(R.id.three).setVisibility(View.INVISIBLE);
                findViewById(R.id.four).setVisibility(View.INVISIBLE);
                findViewById(R.id.five).setVisibility(View.INVISIBLE);
                findViewById(R.id.six).setVisibility(View.INVISIBLE);
                findViewById(R.id.editText).setVisibility(View.INVISIBLE);
                findViewById(R.id.send).setVisibility(View.VISIBLE);
                findViewById(R.id.back).setVisibility(View.VISIBLE);
                crypto(2, original);
            }
        });
        Button three = findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String original = input.getText().toString();
                findViewById(R.id.one).setVisibility(View.INVISIBLE);
                findViewById(R.id.two).setVisibility(View.INVISIBLE);
                findViewById(R.id.three).setVisibility(View.INVISIBLE);
                findViewById(R.id.four).setVisibility(View.INVISIBLE);
                findViewById(R.id.five).setVisibility(View.INVISIBLE);
                findViewById(R.id.six).setVisibility(View.INVISIBLE);
                findViewById(R.id.editText).setVisibility(View.INVISIBLE);
                findViewById(R.id.send).setVisibility(View.VISIBLE);
                findViewById(R.id.back).setVisibility(View.VISIBLE);
                crypto(3, original);
            }
        });
        Button four = findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String original = input.getText().toString();
                findViewById(R.id.one).setVisibility(View.INVISIBLE);
                findViewById(R.id.two).setVisibility(View.INVISIBLE);
                findViewById(R.id.three).setVisibility(View.INVISIBLE);
                findViewById(R.id.four).setVisibility(View.INVISIBLE);
                findViewById(R.id.five).setVisibility(View.INVISIBLE);
                findViewById(R.id.editText).setVisibility(View.INVISIBLE);
                findViewById(R.id.six).setVisibility(View.INVISIBLE);
                findViewById(R.id.send).setVisibility(View.VISIBLE);
                findViewById(R.id.back).setVisibility(View.VISIBLE);
                crypto(4, original);
            }
        });
        Button five = findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String original = input.getText().toString();
                findViewById(R.id.one).setVisibility(View.INVISIBLE);
                findViewById(R.id.two).setVisibility(View.INVISIBLE);
                findViewById(R.id.three).setVisibility(View.INVISIBLE);
                findViewById(R.id.four).setVisibility(View.INVISIBLE);
                findViewById(R.id.editText).setVisibility(View.INVISIBLE);
                findViewById(R.id.five).setVisibility(View.INVISIBLE);
                findViewById(R.id.six).setVisibility(View.INVISIBLE);
                findViewById(R.id.send).setVisibility(View.VISIBLE);
                findViewById(R.id.back).setVisibility(View.VISIBLE);
                crypto(5, original);
            }
        });
        Button six = findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String original = input.getText().toString();
                findViewById(R.id.one).setVisibility(View.INVISIBLE);
                findViewById(R.id.two).setVisibility(View.INVISIBLE);
                findViewById(R.id.three).setVisibility(View.INVISIBLE);
                findViewById(R.id.four).setVisibility(View.INVISIBLE);
                findViewById(R.id.editText).setVisibility(View.INVISIBLE);
                findViewById(R.id.five).setVisibility(View.INVISIBLE);
                findViewById(R.id.six).setVisibility(View.INVISIBLE);
                findViewById(R.id.send).setVisibility(View.VISIBLE);
                findViewById(R.id.six).setVisibility(View.VISIBLE);
                crypto(6, original);
            }
        });
        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.one).setVisibility(View.VISIBLE);
                findViewById(R.id.two).setVisibility(View.VISIBLE);
                findViewById(R.id.three).setVisibility(View.VISIBLE);
                findViewById(R.id.four).setVisibility(View.VISIBLE);
                findViewById(R.id.five).setVisibility(View.VISIBLE);
                findViewById(R.id.six).setVisibility(View.VISIBLE);
                findViewById(R.id.editText).setVisibility(View.VISIBLE);
                findViewById(R.id.send).setVisibility(View.INVISIBLE);
                findViewById(R.id.back).setVisibility(View.INVISIBLE);
                findViewById(R.id.textView).setVisibility(View.INVISIBLE);
            }
        });
    }

    protected String coded;

    protected void crypto(final int method, final String original) {
        findViewById(R.id.textView).setVisibility(View.VISIBLE);
        TextView text = findViewById(R.id.textView);
        coded = Crypt.crypt(method, original);
        text.setText(coded);
    }

    protected void sendText() {
        Intent send = new Intent(Intent.ACTION_SEND);
        send.setType("vnd.android-dir/mms-sms");
        send.putExtra(Intent.EXTRA_TEXT, coded);
        send.setType("text/plain");
        startActivity(send);
    }
}
