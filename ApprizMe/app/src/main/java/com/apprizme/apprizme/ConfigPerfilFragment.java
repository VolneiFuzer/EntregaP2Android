package com.apprizme.apprizme;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ConfigPerfilFragment extends Fragment {

    View tela;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        tela = inflater.inflate(R.layout.activity_config_perfil, container, false);
        return tela;
    }
}
