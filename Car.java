package com.company;

import javax.swing.*;

public class Car {
    private String model;
    private int pret;
    private boolean isNew;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        this.model = JOptionPane.showInputDialog(null,"Model:");
    }

    public int getPret() {
        return pret;
    }

    public void setPret() {
        this.pret = Integer.parseInt(JOptionPane.showInputDialog(null,"pret:"));
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew() {
        isNew = Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Is new/is not new:"));
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", pret=" + pret +
                ", isNew=" + isNew +
                '}';
    }
}
