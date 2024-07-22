package it.univaq.disim.lpo.goosegame.core.game;


import java.io.Serializable;


public class Giocatore implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private String name;
    
    public Giocatore(String name) {
    	this.name = name;
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
	
}
