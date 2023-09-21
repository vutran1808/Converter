/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Agorithm;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class Machine extends Menu<String>{
    Agorithm al = new Agorithm();
    
    public Machine(){
        super("Number COnverter", new String[]{"Bin -> Dec","Dec -> Bin","Hex -> Dec","Dec -> Hec","Exit"});
    }
    
    

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("Enter binary number");
                String bin = getInput();
                al.BintoDec(bin);
                break;
            case 2:
                System.out.println("Enter Decimal number");
                int dec = Integer.parseInt(getInput());
                al.DectoBin(dec);
                break;
            case 3:
                System.out.println("Enter Heximal number");
                String hex = getInput();
                al.HextoDec(hex);
                break;
            case 4:
                System.out.println("Enter Decimal number");
                int dec2 = Integer.parseInt(getInput());
                al.DecToHex(dec2);
                break;
            case 5:
                break;
        }
    }
    
}
