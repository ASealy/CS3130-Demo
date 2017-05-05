package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void event(View view) {
        EditText editText = (EditText) findViewById(R.id.input);
        String message = editText.getText().toString();
        TextView textView = (TextView) findViewById(R.id.display);
        textView.setText(message);
    }
}
