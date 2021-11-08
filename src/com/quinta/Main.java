package com.quinta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Cifrario cif=new Cifrario();

	    System.out.println("Inserisci la chiave: ");
	    cif.setChiave(sc.nextInt());
	    System.out.println("Inserisci il testo da cifrare: ");
	    cif.setParola(sc.next());

	    System.out.println(cif.cifraCes());

    }
}
