package edu.DataAndAPIStream.ListasEncadeadas;

public class MainLista {

  public static void main(String[] args) {
    ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

    minhaLista.add("teste1");
    minhaLista.add("teste2");
    minhaLista.add("teste3");
    minhaLista.add("teste4");

    System.out.println(minhaLista);

    minhaLista.remove(0);

    System.out.println(minhaLista);


    ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

    minhaListaEncadeada.add("c1");
    minhaListaEncadeada.add("c2");
    minhaListaEncadeada.add("c3");
    minhaListaEncadeada.add("c4");
    minhaListaEncadeada.add("c5");
    minhaListaEncadeada.add("c6");
    minhaListaEncadeada.add("c7");

    System.out.println(minhaListaEncadeada);

    minhaListaEncadeada.remove(3);
    minhaListaEncadeada.add(3, "99");

    System.out.println(minhaListaEncadeada);
    System.out.println(minhaListaEncadeada.get(3));
  }
}
