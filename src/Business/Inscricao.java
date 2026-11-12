package Business;

import model.Participante;

public class Inscricao extends Participante {

    private float valor = 0;

    public float calcularValor() {

        switch (getCategoria().toLowerCase()) {

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
        if (getTipo().toLowerCase() == "presencial"){

        } else if (getTipo().toLowerCase() == "online") {
            valor = valor * 0.8F;

        }else{
            System.out.println("Categoria invalida");
        }


        return valor;
    }
}
