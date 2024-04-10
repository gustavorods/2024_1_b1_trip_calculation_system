import javax.swing.*;

public class Percurso {
    // Atributos
    private double kmPercorrida;
    private double valorCombustivel;
    private double valorPedagio;

    // Incilizando vaziu
    public Percurso() {
        this(0,0,0);
    }

    // Incilizando cheio
    public Percurso(double kmPercorrida, double valorCombustivel, double valorPedagio) {
        this.kmPercorrida = kmPercorrida;
        this.valorCombustivel = valorCombustivel;
        this.valorPedagio = valorPedagio;
    }

    // gatter e setter
    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }

    public double getValorPedagio() {
        return valorPedagio;
    }

    public void setValorPedagio(double valorPedagio) {
        this.valorPedagio = valorPedagio;
    }

    // Métodos
    public void cadastrarPercurso() {
        setKmPercorrida(Double.parseDouble(JOptionPane.showInputDialog("Quantos km foram rodados?")));
        setValorCombustivel(Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do combustivel?")));
        setValorPedagio(Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do pedágio?")));
    }

    public void listarPercurso() {
        JOptionPane.showMessageDialog(null, "Suas informações: \n" +
                "Km rodados: " + getKmPercorrida() + "\n" +
                "Valor do combustivel: " + getValorCombustivel() + "\n" +
                "Qual é o valor do pedágio: " + getValorPedagio());
    }
}
