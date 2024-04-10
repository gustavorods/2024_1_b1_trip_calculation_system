import javax.swing.*;
import java.text.DecimalFormat;

public class Custos {
    // Atributos
    private double totalPercurso;

    // Incizaliando vaziu
    public Custos(){
        this(0);
    }

    // Incizaliando cheio
    public Custos(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }

    // getter e setter
    public double getTotalPercurso() {
        return totalPercurso;
    }

    public void setTotalPercurso(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }

    // Método
    public void calcularViagem(Percurso dadosViagem) {
        DecimalFormat duasCasas = new DecimalFormat("0.00");
        setTotalPercurso((dadosViagem.getKmPercorrida() * dadosViagem.getValorCombustivel()) + dadosViagem.getValorPedagio());
        JOptionPane.showMessageDialog(null, "Custo total da viagem: " + getTotalPercurso());
    }
}
