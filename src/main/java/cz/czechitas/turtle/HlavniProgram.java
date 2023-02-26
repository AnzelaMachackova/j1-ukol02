package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {

    //zmrzlina
    nakresliKolecko(3);
    zofka.turnLeft(90);
    nakresliTrojuhelnik(120);

    //cesta
    zofka.penUp();
    zofka.move(300);
    zofka.turnRight(90);
    zofka.move(200);
    zofka.penDown();

    // snehulak
    nakresliKolecko(2);
    zofka.turnRight(180);
    zofka.penUp();
    zofka.move(30);
    zofka.turnRight(90);
    zofka.move(30);
    zofka.penDown();
    nakresliKolecko(3);
    zofka.turnLeft(90);
    zofka.penUp();
    zofka.move(60);
    zofka.turnRight(90);
    zofka.move(60);
    zofka.penDown();
    zofka.turnRight(90);
    nakresliKolecko(1);
    zofka.turnRight(90);
    zofka.penUp();
    zofka.move(120);
    zofka.turnRight(90);
    zofka.penDown();
    nakresliKolecko(1);
    zofka.penUp();
    zofka.move(60);
    zofka.turnRight(90);
    zofka.move(60);

    //cesta
    zofka.penDown();
    nakresliKolecko(4);
    zofka.turnLeft(90);
    zofka.penUp();
    zofka.move(90);
    zofka.turnLeft(90);
    zofka.move(600);
    zofka.penDown();

    //masinka
    nakresliObdelnikNeboCtverec(110, 180);
    zofka.turnLeft(90);
    nakresliObdelnikNeboCtverec(110, 150);
    zofka.turnRight(90);
    zofka.move(110);
    zofka.turnLeft(90);
    nakresliKolecko(3);
    zofka.turnLeft(90);
    zofka.move(160);
    nakresliKolecko(2);
    zofka.move(70);
    nakresliKolecko(2);
    zofka.move(30);
    zofka.turnRight(90);
    nakresliTrojuhelnik(90);

    }

    public void nakresliTrojuhelnik(double velikostStrany) {
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
    }
    public void nakresliObdelnikNeboCtverec(double velikostJedneStrany, double velikostDruheStrany) {
        zofka.move(velikostJedneStrany);
        zofka.turnLeft(90);
        zofka.move(velikostDruheStrany);
        zofka.turnLeft(90);
        zofka.move(velikostJedneStrany);
        zofka.turnLeft(90);
        zofka.move(velikostDruheStrany);
        zofka.turnLeft(90);
    }

    public void nakresliKolecko(int velikostKolecka){
        if (velikostKolecka == 1) {
            for (int i = 0; i < 18; i++) {
                zofka.turnLeft(20);
                zofka.move(5);
            }
        } else if (velikostKolecka == 2) {
            for (int i = 0; i < 36; i++) {
                zofka.turnLeft(10);
                zofka.move(5);
            }
        } else if (velikostKolecka == 3) {
            for (int i = 0; i < 72; i++) {
                zofka.turnLeft(5);
                zofka.move(5);
            }
        } else if (velikostKolecka == 4) {
            for (int i = 0; i < 120; i++) {
                zofka.turnLeft(3);
                zofka.move(5);
            }
        } else if (velikostKolecka > 4) {
            for (int i = 0; i < 180; i++) {
                zofka.turnLeft(2);
                zofka.move(5);
            }
        }

    }


    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
