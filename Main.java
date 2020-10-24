package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int numberCars = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduceti numarul de masini:"));
        Car car[] = new Car[numberCars];
        for (int i = 0; i < numberCars; i++) {
            car[i] = new Car();
            car[i].setModel();
            car[i].setPret();
            car[i].setNew();
        }

        int selector = Integer.parseInt(JOptionPane.showInputDialog(null, "Alegeti: 1.Afisare obiecte sau 2.ToString"));
        switch (selector) {
            case 1:
                for (int i = 0; i < numberCars; i++) {
                    JOptionPane.showMessageDialog(null, "Modelul masinii "+(i+1) +": "+ car[i].getModel());
                    JOptionPane.showMessageDialog(null, "Pretul masinii " +(i+1) +": "+ car[i].getPret());
                    JOptionPane.showMessageDialog(null, "Is new masina "+(i+1)+": " + car[i].isNew());
                }
                break;

            case 2:
                for (int i = 0; i < numberCars; i++) {
                    JOptionPane.showMessageDialog(null, car[i].toString());
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error!");
        }

    }
}
