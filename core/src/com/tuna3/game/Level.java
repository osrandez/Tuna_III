package com.tuna3.game;

import com.badlogic.gdx.graphics.Texture;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Level implements Serializable {
    public CompoundTexture tuna, backgroundImg;
    public ArrayList<CompoundTexture> colision;

    public Level(CompoundTexture backgroundImgPass, CompoundTexture tunaPass){
        backgroundImg = backgroundImgPass;
        tuna = tunaPass;

        colision = new ArrayList<>();
    }

    public void addColision(int xPos, int yPos){
        colision.add(new CompoundTexture("colision.png", xPos, yPos));
    }

    public void dispose(){
        backgroundImg.dispose();
        tuna.dispose();
        for(CompoundTexture texture : colision){
            texture.dispose();
        }
    }

    public void save(){

    }
}
