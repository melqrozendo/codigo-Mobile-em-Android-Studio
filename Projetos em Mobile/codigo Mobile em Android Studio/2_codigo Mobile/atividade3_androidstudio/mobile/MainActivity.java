package com.example.projeto3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//chama o xml de nivel superior

        //ListView listView = findViewById (R.id.List_options);//instancia do listview do xml no java
        //listView.setOnItemClickListener (itemClickListener);//chamada do metodo receptor pelo listview instanciado

        //aqui começa o metodo receptor onitemclicklistener
        AdapterView.OnItemClickListener ItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){//condição de posição que o item esta no xml
                    Intent intent = new ( MainActivity.this, ActivityBebidasCategory.class);//sair da pagina nivel superior para de categoria
                    startActivity( intent);//inicie a transição de tela apos confirmação da posição do item selecionado
                }
            }
        }
    }
};
ListView listView = findViewById (R.id.List_options);//instancia do listview do xml no java
listView.setOnItemClickListener (itemClickListener);//chamada do metodo receptor pelo listview instanciado
