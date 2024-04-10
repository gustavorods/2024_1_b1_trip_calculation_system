import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Variaveis
        int stop = 0;
        String[] opcoes = {"Cadastrar dados da viagem", "Apresentar os dados da viagem", "Apresentar o custo total da viagem", "Sair"};
        String decisao;
        Percurso viagem = new Percurso();
        Custos custoTotalDaViagem = new Custos();

        while(stop < 1) {
            decisao = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha uma opção",
                    "Caixa de escolha",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            switch (decisao) {
                case "Cadastrar dados da viagem":
                    viagem.cadastrarPercurso();
                    break;
                case "Apresentar os dados da viagem":
                    viagem.listarPercurso();
                    break;
                case "Apresentar o custo total da viagem":
                    custoTotalDaViagem.calcularViagem(viagem);
                    break;
                case "Sair":
                    stop++;
                    break;
            }

        }
    }
}