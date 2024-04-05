package edu.DataAndAPIStream.FilasEPilhas;

import edu.DataAndAPIStream.EncadeamentoDeNo.No;

public class Fila<T> {

  private No<T> refDeEntrada;

  public Fila() {
    this.refDeEntrada = null;
  }

  public boolean isEmpty() {
    return refDeEntrada == null;
  }

  public void enqueue(No<T> novoNo) {
    novoNo.setProximoNo(refDeEntrada);
    refDeEntrada = novoNo;
  }

  public T first() {
    if (!this.isEmpty()) {
      No<T> primeiroNo = refDeEntrada;
      while (true) {
        if (primeiroNo.getProximoNo() != null) {
          primeiroNo = primeiroNo.getProximoNo();
        } else {
          break;
        }
      }
      return (T) primeiroNo.getdado();
    }
    return null;
  }

  public No<T> dequeue() {
    if (!this.isEmpty()) {
      No<T> primeiroNo = refDeEntrada;
      No<T> noAuxiliar = refDeEntrada;
      while (true) {
        if (primeiroNo.getProximoNo() != null) {
          noAuxiliar = primeiroNo;
          primeiroNo = primeiroNo.getProximoNo();
        } else {
          noAuxiliar.setProximoNo(null);
          break;
        }
      }
      return primeiroNo;
    }
    return null;
  }

  @Override
  public String toString() {
    No<T> noAuxiliar = refDeEntrada;
    String stringRetorno = "------------\n";
    stringRetorno += "   Fila\n";
    stringRetorno += "------------\n";

    if (refDeEntrada != null) {
      while (true) {
        stringRetorno += "[No{objeto=" + noAuxiliar.getdado() + "}] ---->";
        if (noAuxiliar.getProximoNo() != null) {
          noAuxiliar = noAuxiliar.getProximoNo();
        } else {
          stringRetorno += "null";
          break;
        }
      }
    } else {
      stringRetorno = "null";
    }


    return stringRetorno;
  }
}
