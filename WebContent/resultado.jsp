
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inscrição realizada</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

    <main class="container">
        <section class="card">

            <h1>Inscrição realizada!</h1>

            <p class="subtitle">
                Confira os dados da sua inscrição.
            </p>

            <div class="result-group">
                <p><strong>Nome:</strong> ${requestScope.participante.nome}</p>

                <p><strong>E-mail:</strong> ${requestScope.participante.email}</p>

                <p><strong>Participação:</strong> ${requestScope.participante.tipo}</p>

                <p><strong>Categoria:</strong> ${requestScope.participante.categoria}</p>

                <p class="price">
                    <strong>Valor final:</strong>
                    R$ ${requestScope.valorFinal}
                </p>
            </div>

            <div class="actions">
                <a href="index.jsp" class="btn btn-secondary">
                    Nova inscrição
                </a>

                <a href="minhaInscricao.jsp" class="btn">
                    Minha inscrição
                </a>
            </div>

        </section>
    </main>

</body>
</html>
