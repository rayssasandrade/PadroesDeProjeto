package SistemaDeControleRestaurante;

import java.util.Date;

public class Mesa {
    private Date dataDeOperação;
    private int horarioDeOperação;

    public Mesa(Date dataDeOperação, int horarioDeOperação) {
        this.dataDeOperação = dataDeOperação;
        this.horarioDeOperação = horarioDeOperação;
    }

    public Date getDataDeOperação() {
        return dataDeOperação;
    }

    public void setDataDeOperação(Date dataDeOperação) {
        this.dataDeOperação = dataDeOperação;
    }

    public int getHorarioDeOperação() {
        return horarioDeOperação;
    }

    public void setHorarioDeOperação(int horarioDeOperação) {
        this.horarioDeOperação = horarioDeOperação;
    }

    public void  gerarRelatorioDeOperação(){
    }
}
