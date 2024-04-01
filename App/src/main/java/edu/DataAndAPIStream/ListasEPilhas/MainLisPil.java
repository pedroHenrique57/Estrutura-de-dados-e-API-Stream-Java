package edu.DataAndAPIStream.ListasEPilhas;

import edu.DataAndAPIStream.EncadeamentoDeNo.No;

public class MainLisPil {

    public static void main(String[] args) {

        Pilha<Integer> minhaPilha = new Pilha<>();

        No<Integer> no1 = new No<>(1);

        No<Integer> no2 = new No<>(2);
        no2.setProximoNo(no1);

        No<Integer> no3 = new No<>(3);
        no2.setProximoNo(no3);

        minhaPilha.push(no1);
        minhaPilha.push(no2);
        minhaPilha.push(no3);

        System.out.println(minhaPilha);

        minhaPilha.pop();

        System.out.println(minhaPilha);
    }
}
