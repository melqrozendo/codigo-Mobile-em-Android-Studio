package com.example.trab3;

public class Cervejas {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Cervejas[] consoles = new Cervejas[]{
            new Cervejas("CORONA", "Corona Extra é a marca de cerveja mais popular do México, fundada em 1925 e foi a segunda cerveja a ser produzida pelo Grupo Modelo.", R.drawable.corona),
            new Cervejas("HEINEKEN", "Heineken Lager Beer, ou simplesmente Heineken, é uma cerveja Pale Lager com 5% de álcool por volume produzido pela empresa cervejeira holandesa Heineken International.", R.drawable.heineken),
            new Cervejas("BUDWEISER", "Budweiser, também conhecida popularmente como Bud, é uma cerveja do tipo long americana, fabricada pela empresa Anheuser-Busch, fundada em 1876.", R.drawable.budweiser),
    };

    private Cervejas(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public int getImageResourceId() { return imageResourceId; }

    public String toString() { return this.name; }
}
