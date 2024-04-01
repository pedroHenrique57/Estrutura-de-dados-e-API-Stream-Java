package edu.DataAndAPIStream.EncadeamentoDeNo;

public class No<T> {

    private T dado;
    private No<T> proximoNo;

    public No(T dado) {
        this.proximoNo = null;
        this.dado = dado;
    }

    public T getdado() {
        return dado;
    }

    public void setdado(T dado) {
        this.dado = dado;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }   

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
