package com.example.manash.votter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button blogout;
    EditText etname,etage,etusername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname=(EditText)findViewById(R.id.etname);
        etage=(EditText)findViewById(R.id.etage);
        etusername=(EditText)findViewById(R.id.etusername);

        blogout=(Button)findViewById(R.id.blogout);
        blogout.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.blogout:
                startActivity(new Intent(this,login.class));
                break;

        }
    }
}
