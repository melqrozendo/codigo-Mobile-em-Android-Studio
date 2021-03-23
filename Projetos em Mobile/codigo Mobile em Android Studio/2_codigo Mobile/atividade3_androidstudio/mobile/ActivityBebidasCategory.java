package com.example.projeto3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityBebidasCategory extends ListActivity {//essa class em java não precisa de xml pois tem o extends de list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_bebidas_category);//veja por se ter apenas uma atividade na minha lista nao irei usar o set.
        //caso outras items da lista fosse usado, usariamos o metodo setcontentview chamando o recurso grafico do xml
        ListView listBebidas = getListView();//instancia o listview
        ArrayAdapter<Bebidas> listAdapter = new ArrayAdapter<Bebidas>//criada uma lista adaptada
                (this, android.R.layout.simple_list_item_1, Bebidas.bebidas);//a lista adaptada chama o array criada na class bebidas
        listBebidas.setAdapter(listAdapter);//chama o metodo tostring  de retorno da class java bebidas
    }
    //atraves do adaptador ArrayAdapter usado para obter os dados não estaticos da class java Bebidas
    //usamos o metodo receptor, condição de chamada, e por se tratar de uma unica atividade não colocaremos a condicional if
    //dessa forma navegaremos da pagina de categoria para a de detalhes
    //com intenção de nao apenas fazer a transição, mas tbm de levar informações fazemos o putExtra de id.
    //atraves da id vai dizer qual foto selecionar, nome, e outros recursos visual na nova activity
    //veja a variavel EXTRA_DETALHES estará na nova class de detalhes, ela vai armazenar a id que vou passar pelo putExtra daqui.
    //assim iniciamos na transição
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(ActivityBebidasCategory.this, ActivityBebidasDetahes.class);
        intent.putExtra(ActivityBebidasDetahes.EXTRA_DETALHES, (int) id);
        startActivity(intent);
    }
}
    }
}
