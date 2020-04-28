package SistemaDeControleRestaurante;

import java.util.Date;

public class Conta {
    private Garçon garcon;
    private Mesa mesa;
    private Date dataDeAbertura;
    private int horaDeAbertura;
    private Produto ItemDaConta;
    private boolean statusConta;
    private Date dataDeFechamento;
    private int getHoraDeFechamento;

    public Conta(Garçon garcon, Date dataDeAbertura, int horaDeAbertura, int itemDaConta, boolean statusConta, Date dataDeFechamento, int getHoraDeFechamento) {
        this.garcon = garcon;
        this.dataDeAbertura = dataDeAbertura;
        this.horaDeAbertura = horaDeAbertura;
    }

    public Garçon getGarcon() {
        return garcon;
    }

    public void setGarcon(Garçon garcon) {
        this.garcon = garcon;
    }

    public Mesa getMesa(){
        return mesa;
    }

    public void setMesa(Mesa mesa){
        this.mesa = mesa;
    }

    public Date getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(Date dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public int getHoraDeAbertura() {
        return horaDeAbertura;
    }

    public void setHoraDeAbertura(int horaDeAbertura) {
        this.horaDeAbertura = horaDeAbertura;
    }

    public Produto getItemDaConta() {
        return ItemDaConta;
    }

    public void setItemDaConta(Produto itemDaConta) {
        ItemDaConta = itemDaConta;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    public Date getDataDeFechamento() {
        return dataDeFechamento;
    }

    public void setDataDeFechamento(Date dataDeFechamento) {
        this.dataDeFechamento = dataDeFechamento;
    }

    public int getGetHoraDeFechamento() {
        return getHoraDeFechamento;
    }

    public void setGetHoraDeFechamento(int getHoraDeFechamento) {
        this.getHoraDeFechamento = getHoraDeFechamento;
    }

    public void TotalCalculado(){
    }

    public void avisarCancelamento(){
    }

    public void calcularValorTotal(){
    }

    public void imprimirNotaFiscal(){
    }
}
