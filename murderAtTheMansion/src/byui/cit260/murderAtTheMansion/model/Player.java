/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Britt
 */
public class Player implements Serializable {
    private String name;
    private double numGuess;
    private Character character;
    private MainCharacter mainCharacter;
    private ArrayList<Item> inventoryItem = new ArrayList<Item>();

    public MainCharacter getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(MainCharacter mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    public Player() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumGuess() {
        return numGuess;
    }

    public void setNumGuess(double numGuess) {
        this.numGuess = numGuess;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public ArrayList<Item> getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(ArrayList<Item> inventoryItem) {
        this.inventoryItem = inventoryItem;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.numGuess) ^ (Double.doubleToLongBits(this.numGuess) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", numGuess=" + numGuess + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.numGuess) != Double.doubleToLongBits(other.numGuess)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}
