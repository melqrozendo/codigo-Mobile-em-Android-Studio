package com.example.projeto3;

public class Bebidas {
    //cada bebida tera um nome, uma descrição e uma identificação de recurso de imagem
    private String name;
    private String description;
    private int imageResourceId;

    //bebidas é um array de 2 bebidas
    public static final Bebidas [] bebidas = {//esse array de bebidas será chamada pela listAdapter da class java de category
            new Bebidas ("Coca Cola", "maior marca de refrigerante do mundo", R.drawable.coca),
            new Bebidas ("Guaraná", "maior marca de refrigerante do brasil", R.drawable.guarana),
    };
    //criando construtor
    private Bebidas (String name, String description, int imageResourceId){
        this. name = name;
        this. description = description;
        this. imageResourceId = imageResourceId;
        }
        public String getName(){return name;}
        public String getDescription(){return description;}
        public int getImageResourceId(){return imageResourceId;}
        public String toString(){return this.name;}//metodo tostring de retorno será chamado pela listAdapter da class java category
}
