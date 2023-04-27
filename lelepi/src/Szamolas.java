/*
* File: Szamolas.java
* Author: Nedved Balázs
* Copyright: 2023, Nedved Balázs
* Group: Szoft 1/1/N
* Date: 2023-04-04
* Github: https://github.com/fasded19/
* Licenc: GNU GPL
*/
import java.util.Scanner;

public class Szamolas {

    public Szamolas() {
    }
    public void startSzamolas() {
        double result =  this.bekerDatas();
        nyomtat(result);
    }
    private void nyomtat(double result) {
        System.out.println(result);
    }
    private double bekerDatas() {
        String aStr = beker("A oldal:");        
        if(!this.checkInput(aStr)) {
            System.err.println("Hiba! Csak számot lehet beírni!");
            throw new NumberFormatException();
        }
        String bStr = beker("B oldal:");
        if(!this.checkInput(bStr)) {
            System.err.println("Hiba! Csak számot lehet beírni!");
            throw new NumberFormatException();
        }        
        String cStr = beker("C oldal:");
        if(!this.checkInput(cStr)) {
            System.err.println("Hiba! Csak számot lehet beírni!");
            throw new NumberFormatException();
        }

        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double c = Double.parseDouble(cStr);
        double result = this.calcVolume(a,b,c);
        return result;
    }
    private String beker(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }
    public double calcVolume(double a, double b, double c) {
        double result = a*b*c;
        return result;
    }
    public boolean checkInput(String input) {
        if(input.matches("[0-9.]+")) {
            return true;
        }else {
            return false;
        }        
    }
}
