package com.harshaldedhia.passwordvault;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Button button3=findViewById(R.id.button3);
        button3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(HomeActivity.this, AddNewActivity.class));
                    }
                }
        );
    }
}
