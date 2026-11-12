
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Minha inscrição</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

    <main class="container">
        <section class="card">

            <h1>Minha inscrição</h1>

            <p class="subtitle">
                Dados do participante armazenados na sessão.
            </p>

            <div class="result-group">

                <p><strong>Nome:</strong> ${sessionScope.participante.nome}</p>

                <p><strong>E-mail:</strong> ${sessionScope.participante.email}</p>

                <p><strong>Participação:</strong> ${sessionScope.participante.tipo}</p>

                <p><strong>Categoria:</strong> ${sessionScope.participante.categoria}</p>

            </div>

            <div class="actions">

                <a href="index.jsp" class="btn btn-secondary">
                    Voltar ao início
                </a>

                <a href="ServletLogout" class="btn btn-danger">
                    Encerrar sessão
                </a>

            </div>

        </section>
    </main>

</body>
</html>
