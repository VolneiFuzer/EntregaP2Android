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

public class ApprizsFragment extends Fragment {

    View tela;
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        tela = inflater.inflate(R.layout.fragment_apprizs, container, false);

        listView = (ListView) tela.findViewById(R.id.list);

        String[] values = new String[] {
                "Não haverá aula hoje pela manhã",
                "Alunos com multas atrasadas na biblioteca façam o favor de pagar",
                "Notas de Desenvolvimento mobile no ar",
                "Meu telemóvel está a carregar",
                "Comida liberada na cantina na conta do Professor Daniel Abella",
                "Não haverá aula na sexta-feira anterior ao fds das eleições",
                "Não haverá aula na segunda-feira posterior ao fds das eleições",
                "Disciplina de Android vai dar 10 pra todo mundo",
                "Segunda, Terça e Quarta da próxima semana é feriadão",
                "Entreguem os projetos de Android",
                "Entrega do projeto de Android foi adiada",
                "Facisa é primeira colocada na olimpíada de programação",
                "Sistemas de Informação da Facisa é segundo melhor do país",
                "Empresa canadense busca por profissionais qualificados"
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
