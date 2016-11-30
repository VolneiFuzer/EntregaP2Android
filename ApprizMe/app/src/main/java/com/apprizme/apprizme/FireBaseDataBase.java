package com.apprizme.apprizme;

import com.firebase.client.Firebase;

public class FireBaseDataBase {

    // Variaveis para funcionamento da conexão com o firebase ---> passado para a casse = Excluir depois
    public static final String FIREBASE_URL = "https://apprizme.firebaseio.com";
    private Firebase firebase;

    public void criaConexa(){
        // Create a connection to your Firebase database
        firebase = new Firebase("https://apprizme.firebaseio.com");
    }
}
