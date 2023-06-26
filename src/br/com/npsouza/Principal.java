package br.com.npsouza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        List<Pessoa> listaM = new ArrayList<>();
        List<Pessoa> listaF = new ArrayList<>();

        Pessoa p1 = new Pessoa("Ana", "Feminino");
        Pessoa p2 = new Pessoa("Jose", "Masculino");
        Pessoa p3 = new Pessoa("Alicia", "Feminino");
        Pessoa p4 = new Pessoa("Joana", "Feminino");
        Pessoa p5 = new Pessoa("Joao", "Masculino");

        listaF.add(p1);
        listaM.add(p2);
        listaF.add(p3);
        listaF.add(p4);
        listaM.add(p5);

        System.out.println(listaM);
        System.out.println(listaF);


    }
}
