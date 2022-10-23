package com.tuna3.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class CompoundTexture {
    protected String pathToFile;
    public Texture texture;
    public int xPos;
    public int yPos;

    public CompoundTexture(String path, int xPosPass, int yPosPass){
        pathToFile = path;
        texture = new Texture(path);
        xPos = xPosPass;
        yPos = yPosPass;
    }

    public CompoundTexture(String path){
        pathToFile = path;
        texture = new Texture(path);
        xPos = 30;
        yPos = 30;
    }

    public boolean mouseHovering(){
        int mouseXPos = Gdx.input.getX();   //amsiedad, proque hay que recalcular las posiciones por si el tamaño de la pestaña cambia :(
        int mouseYPos = Gdx.graphics.getHeight()-Gdx.input.getY();
        int height = texture.getHeight()*Gdx.graphics.getHeight()/400;
        int width = texture.getWidth()*Gdx.graphics.getWidth()/800;
        int adjustXPos = xPos*Gdx.graphics.getWidth()/800;
        int adjustYPos = yPos*Gdx.graphics.getHeight()/400;

        if(mouseXPos > adjustXPos  &&  mouseXPos < adjustXPos + width){     //check dentro horizontal
            if(mouseYPos > adjustYPos   &&  mouseYPos < (adjustYPos + height)){    //check dentro vertical
                return true;
            }
        }
        return false;
    }

    public void dispose(){
        texture.dispose();
    }
}
