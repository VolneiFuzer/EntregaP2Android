package com.apprizme.apprizme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LoginActivity extends Activity {

    private ImageButton returnToSignUp;
    private Button goToApprizs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        goToApprizs = (Button) findViewById(R.id.buttomEnviar_login);
        goToApprizs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MenuLateralActivity.class);
                startActivity(intent);
            }
        });

    }
}
