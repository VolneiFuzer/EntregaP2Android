package com.apprizme.apprizme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.firebase.client.Firebase;

public class SignUpActivity extends Activity {

    private TextView goToLogin;
    private Button goToApriz;

    //Atributos para persistencia
    private EditText campoNome;
    private EditText campoEmail;
    private EditText campoSenha;
    private EditText campoConfSenha;


    // Variaveis para funcionamento da conexão com o firebase ---> passado para a casse = Excluir depois
    public static final String FIREBASE_URL = "https://apprizme.firebaseio.com";
    private Firebase firebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        goToLogin = (TextView) findViewById(R.id.text_new_cadastro);
        goToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        goToApriz = (Button) findViewById(R.id.BtLoginSignUp);
        goToApriz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, MenuLateralActivity.class);
                startActivity(intent);
            }
        });

        campoNome = (EditText) findViewById(R.id.campo_nome);
        campoEmail = (EditText) findViewById(R.id.campo_email);
        campoSenha = (EditText) findViewById(R.id.campo_senha);
        campoConfSenha = (EditText)  findViewById(R.id.campo_confSenha);

        // Firebase
        if (savedInstanceState == null){
            Firebase.setAndroidContext(this);
        }

        // Create a connection to your Firebase database
        firebase = new Firebase(FIREBASE_URL);

    }

    public void cadastraUsusario(View v) {
        inserirUsuario(new Usuario(
                campoNome.getText().toString(),
                campoEmail.getText().toString(),
                campoSenha.getText().toString(),
                campoConfSenha.getText().toString()
        ));
    }

    public void inserirUsuario(Usuario t) {

        if(firebase == null) {
            // Create a connection to your Firebase database
            firebase = new Firebase(FIREBASE_URL);
        }

        firebase.child("USUARIO").push().setValue(t);
    }
}
