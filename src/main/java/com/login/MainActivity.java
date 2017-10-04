package com.example.android.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText Password;
    private TextView info;
    private Button Login;
    private int count=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (EditText)findViewById(R.id.etUsername);
        Password= (EditText)findViewById(R.id.etPassword);
        info= (TextView)findViewById(R.id.tvInfo);
        Login= (Button)findViewById(R.id.btnlogin);
         info.setText("No of Attempts Left="+count);

    }
    private void Valid(String username,String Password ){
        if((username.equals("Admin")) && (Password.equals("1234")) ){
            Intent intent = new Intent(MainActivity.this, userpage.class);
        }
          else
        {
            count--;
            info.setText("No of Attempts left"+ String.valueOf(count));
            if(count==0){
                Login.setEnabled(false);
            }
    }
}
}
