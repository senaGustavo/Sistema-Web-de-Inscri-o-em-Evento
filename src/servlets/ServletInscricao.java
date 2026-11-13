package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import business.Inscricao;
import model.Participante;

@WebServlet("/ServletInscricao")
public class ServletInscricao extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Recebe os dados do formulário
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String tipo = request.getParameter("tipo");
        String categoria = request.getParameter("categoria");

        // 2. Cria o objeto Participante
        Participante participante = new Participante();
        participante.setNome(nome);
        participante.setEmail(email);
        participante.setTipo(tipo);
        participante.setCategoria(categoria);

        // 3. Calcula o valor com a classe de negócio
        Inscricao inscricao = new Inscricao();
        float valorFinal = inscricao.calcularValor(participante);

        // 4. Guarda no request (para resultado.jsp)
        request.setAttribute("participante", participante);
        request.setAttribute("valorFinal", String.format("%.2f", valorFinal));

        // 5. Guarda na sessão (para minhaInscricao.jsp)
        HttpSession session = request.getSession();
        session.setAttribute("participante", participante);
        session.setAttribute("valorFinal", String.format("%.2f", valorFinal));

        // 6. Encaminha para resultado.jsp (sem gerar HTML)
        RequestDispatcher dispatcher =
        	    request.getRequestDispatcher("/resultado.jsp");

        	dispatcher.forward(request, response);
    }
}