package com.apprizme.apprizme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MensagemActivity extends AppCompatActivity {

    private EditText tituloMensagem;
    private EditText corpoMensagem;
    private Firebase firebase;
    public static final String FIREBASE_URL = "https://apprizme.firebaseio.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);

        tituloMensagem = (EditText) findViewById(R.id.editText2);
        corpoMensagem = (EditText) findViewById(R.id.editText3);
    }

    public void enviarMensagem(View v) {
        inserirMensagem(new Mensagem(
                tituloMensagem.getText().toString(),
                corpoMensagem.getText().toString()
        ));
    }

    public void inserirMensagem(Mensagem t) {

        if(firebase == null) {
            // Create a connection to your Firebase database
            firebase = new Firebase(FIREBASE_URL);
        }

        firebase.child("MENSAGEM").push().setValue(t);
    }
}
