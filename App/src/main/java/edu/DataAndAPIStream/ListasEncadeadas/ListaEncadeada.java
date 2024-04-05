package edu.DataAndAPIStream.ListasEncadeadas;

import edu.DataAndAPIStream.EncadeamentoDeNo.No;

public class ListaEncadeada<T> {

  No<T> referenciaEntrada;

  public ListaEncadeada() {
    this.referenciaEntrada = null;
  }

  public boolean isEmpty() {
    return referenciaEntrada == null;
  }

  public int size() {
    int tamanhoLista = 0;
    No<T> referenciaAUX = referenciaEntrada;
    while (true) {
      if (referenciaAUX != null) {
        tamanhoLista++;
        if (referenciaAUX.getProximoNo() != null) {
          referenciaAUX = referenciaAUX.getProximoNo();
        } else {
          break;
        }
      } else {
        break;
      }
    }
    return tamanhoLista;
  }

  public void add(T conteudo) {
    No<T> novoNo = new No<>(conteudo);
    if (this.isEmpty()) {
      referenciaEntrada = novoNo;
      return;
    }

    No<T> noAuxiliar = referenciaEntrada;
    for (int i = 0; i < this.size() - 1; i++) {
      noAuxiliar = noAuxiliar.getProximoNo();
    }
    noAuxiliar.setProximoNo(novoNo);
  }

  public T get(int index) {
    return getNo(index).getdado();
  }

  private No<T> getNo(int index) {
    validaIndice(index);
    No<T> noAuxiliar = referenciaEntrada;
    No<T> noRetorno = null;
    for (int i = 0; i <= index; i++) {
      noRetorno = noAuxiliar;
      noAuxiliar = noAuxiliar.getProximoNo();
    }
    return noRetorno;
  }

  public T remove(int index) {
    validaIndice(index);
    No<T> noPivor = getNo(index);
    if (index == 0) {
      referenciaEntrada = noPivor.getProximoNo();
      return noPivor.getdado();
    }
    No<T> noAnterior = getNo(index - 1);
    noAnterior.setProximoNo(noPivor.getProximoNo());
    return noPivor.getdado();
  }

  private void validaIndice(int index) {
    if (index >= size()) {
      int ultimoIndice = size() - 1;
      throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + '.');
    }
  }

  @Override
  public String toString() {
    String strRetorno = "";
    No<T> noAuxiliar = referenciaEntrada;
    for (int i = 0; i < size(); i++) {
      strRetorno += "[No{conteudo=" + noAuxiliar.getdado() + "}]--->";
      noAuxiliar = noAuxiliar.getProximoNo();
    }
    strRetorno += "null";
    return strRetorno;
  }
}
