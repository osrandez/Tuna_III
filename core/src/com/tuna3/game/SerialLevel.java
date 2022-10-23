package com.tuna3.game;

import java.io.*;
import java.util.ArrayList;

public class SerialLevel implements Serializable {
    private SerialCompoundTexture backgroundImg;
    private SerialCompoundTexture tuna;
    private ArrayList<SerialCompoundTexture> colision;

    public SerialLevel(Level data){
        backgroundImg = new SerialCompoundTexture(data.backgroundImg);
        tuna = new SerialCompoundTexture(data.tuna);
        colision = new ArrayList<>();
        for(CompoundTexture texture : data.colision){
            colision.add(new SerialCompoundTexture(texture));
        }
    }

    public void save() {
        try (FileOutputStream writter = new FileOutputStream("sida.jpg"); ObjectOutputStream write = new ObjectOutputStream(writter)){
            write.writeObject(this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
