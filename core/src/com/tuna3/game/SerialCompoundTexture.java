package com.tuna3.game;

import java.io.Serializable;

public class SerialCompoundTexture implements Serializable {
    private int xPosS;
    private int yPosS;
    private String pathS;

    public SerialCompoundTexture(CompoundTexture data){
        pathS = data.pathToFile;
        xPosS = data.xPos;
        yPosS = data.yPos;
    }

    public CompoundTexture buildObject(){
        return new CompoundTexture(pathS, xPosS, yPosS);
    }
}
