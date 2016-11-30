package com.apprizme.apprizme;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ApprizsSiFragment extends Fragment {

    View tela;
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        tela = inflater.inflate(R.layout.fragment_apprizs_si, container, false);

        listView = (ListView) tela.findViewById(R.id.list);

        String[] values = new String[] {
                "Alunos com multas atrasadas na biblioteca façam o favor de pagar",
                "Não haverá aula na sexta-feira anterior ao fds das eleições",
                "Segunda, Terça e Quarta da próxima semana é feriadão",
                "Facisa é primeira colocada na olimpíada de programação",
                "Sistemas de Informação da Facisa é segundo melhor do país"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getBaseContext(),
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String itemValue = (String) listView.getItemAtPosition(position);
                Toast.makeText(getActivity().getApplicationContext(), itemValue, Toast.LENGTH_LONG).show();

            }

        });

        return tela;
    }

}
