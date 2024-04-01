package edu.DataAndAPIStream.EncadeamentoDeNo;

public class MainNo {
    public static void main(String[] args) {

        No<String> no1 = new No<>("no1");

        No<String> no2 = new No<>("2");
        no1.setProximoNo(no2);

        No<String> no3 = new No<>("no3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("4");
        no3.setProximoNo(no4);

        System.out.println(no1.getProximoNo());
    }
}
