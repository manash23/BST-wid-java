package com.example.manash.votter;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity implements View.OnClickListener{
    Button blogin;
    EditText etusername,etpassword;
    TextView tvregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etusername=(EditText)findViewById(R.id.etusername);
        tvregister=(TextView)findViewById(R.id.tvregister);
        etpassword=(EditText)findViewById(R.id.etpassword);
        blogin=(Button)findViewById(R.id.blogin);
        blogin.setOnClickListener(this);
        tvregister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.blogin:
                 break;
            case R.id.tvregister:
                startActivity(new Intent(this,register.class));
        }
    }
}
