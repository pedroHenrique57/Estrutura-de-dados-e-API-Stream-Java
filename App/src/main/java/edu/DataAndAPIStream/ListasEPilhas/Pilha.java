package edu.DataAndAPIStream.ListasEPilhas;

import edu.DataAndAPIStream.EncadeamentoDeNo.No;

public class Pilha<T> {

    private No<T> refDeEntradaPilha;

    public Pilha() {
        this.refDeEntradaPilha = null;
    }

    public void push(No<T> novoNo) {
        No<T> refAuxiliar = refDeEntradaPilha;
        refDeEntradaPilha = novoNo;
        refDeEntradaPilha.setProximoNo(refAuxiliar);
    }

    public No<T> pop() {
        if(!this.isEmpty()){
            No<T> noPoped = refDeEntradaPilha;
            refDeEntradaPilha = refDeEntradaPilha.getProximoNo();
            return noPoped;
        }
        return null;
    }

    public No<T> top() {
        return refDeEntradaPilha;
    }

    public boolean isEmpty() {
        return refDeEntradaPilha == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        No<T> noAuxiliar = refDeEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getdado() + "}]\n";
                noAuxiliar = noAuxiliar.getProximoNo();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
