package com.example.projeto3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityBebidasDetahes extends AppCompatActivity { //extends de exibição criada

    public static final String EXTRA_DETALHES = "bebidaSEL";//variavel criada para trazer do putExtra da class category os dados do id.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas_detalhes);//metodo que chama recurso do xml

        //obtem bebida atraves do id selecionado de intenção ou transição ou de navegação da class category
        //assim temos o numero inteiro que foi passado pela class category
        //assim pego o get de transição de pagina, o getExtras, o get da variavel para setar neles o valor inteiro e retirar o string
        //instancio a class bebidas que recebe o numero de parametros da class category recebida pela variavel
        //caso seja 0 recebe dados da coca, caso seja 1 recebe dados do guarana
        //então bebidaSE fica responsavel para setar imagem, nome e a descrição na pagina de layout.
        int bebidaSEL = (Integer) getIntent().getExtras().get(EXTRA_DETALHES);
        Bebidas bebidaSE = Bebidas.bebidas[bebidaSEL];

        //preencher a imagem da Bebidas
        //instancio a ImageView do xml e chamo de photo e ela vai receber como referencia o id.photo do xml(layout)
        //e seto a id com a imagem que foi passada pela class bebida atraves de bebidaSE
        //
        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource (bebidaSE.getImageResourceId());
        photo.setContentDescription(bebidaSE.getName());//obs: nao sei

        //preencher o nome das bebidas
        TextView name = findViewById(R.id.name);
        name.setText(bebidaSE.getName());

        //preencher a descrição do console
        TextView description = findViewById(R.id.description);
        description.setText(bebidaSE.getDescription());
    }
}
