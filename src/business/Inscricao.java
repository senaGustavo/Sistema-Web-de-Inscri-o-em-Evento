package business;

import model.Participante;

public class Inscricao {

    private float valor = 0;

    public float calcularValor(Participante p) {

        switch (p.getCategoria().toLowerCase()) {

            case "aluno":
                valor = 30.0f;
                break;

            case "professor":
                valor = 50.0f;
                break;

            case "convidado":
                valor = 80.0f;
                break;

            default:
                System.out.println("Categoria inválida.");
                break;
        }
        if ("online".equalsIgnoreCase(p.getTipo())){
            valor = valor * 0.8F;
        }

        return valor;
    }
}
