package com.vjadhav.demoapp;

import android.provider.Settings;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextSwitcher;
import android.widget.*;

public class MainActivity extends FragmentActivity {

    public void click(View view) {
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        Log.i("Username" , username.getText().toString());
        Log.i("Password" , password.getText().toString());
        Toast.makeText(MainActivity.this, "Logged in succuessfully as " + username.getText().toString(), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
