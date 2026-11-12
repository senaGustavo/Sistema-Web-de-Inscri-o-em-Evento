
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inscrição - Evento</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

    <main class="container">
        <section class="card">

            <h1>Inscrição no Evento</h1>
            <p class="subtitle">
                Preencha seus dados para realizar sua inscrição.
            </p>

            <form action="ServletInscricao" method="post">

                <div class="form-group">
                    <label for="nome">Nome completo</label>
                    <input type="text" id="nome" name="nome"
                           placeholder="Digite seu nome" required>
                </div>

                <div class="form-group">
                    <label for="email">E-mail</label>
                    <input type="email" id="email" name="email"
                           placeholder="Digite seu e-mail" required>
                </div>

                <div class="form-group">
                    <label for="tipo">Tipo de participação</label>
                    <select id="tipo" name="tipo" required>
                        <option value="">Selecione</option>
                        <option value="Presencial">Presencial</option>
                        <option value="Online">Online</option>
                    </select>
                </div>

                <div class="form-group">
                    <label for="categoria">Categoria</label>
                    <select id="categoria" name="categoria" required>
                        <option value="">Selecione</option>
                        <option value="Aluno">Aluno</option>
                        <option value="Professor">Professor</option>
                        <option value="Convidado">Convidado</option>
                    </select>
                </div>

                <button type="submit" class="btn">
                    Realizar inscrição
                </button>

            </form>

        </section>
    </main>

</body>
</html>
