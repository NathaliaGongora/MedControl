IF DB_ID('ProjetoMedControl') IS NULL
BEGIN
    CREATE DATABASE ProjetoMedControl;
END;
GO

USE ProjetoMedControl;
GO

CREATE TABLE usuarios (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    idade INT NULL,
    sexo VARCHAR(20) NULL,
    alergias VARCHAR(MAX) NULL,
    doencas_cronicas VARCHAR(MAX) NULL,
    created_at DATETIME NOT NULL DEFAULT GETDATE()
);
GO

CREATE TABLE contas (
    id INT IDENTITY(1,1) PRIMARY KEY,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(100) NOT NULL,
    usuario_id INT NOT NULL,
    CONSTRAINT FK_Contas_Usuarios
        FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE CASCADE
);
GO

CREATE TABLE medicamentos (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(MAX) NULL,
    dosagem VARCHAR(50) NULL,
    horario VARCHAR(50) NULL,
    data_validade DATE NULL,
    data_fim DATE NULL,
    uso_continuo BIT NOT NULL DEFAULT 0,
    quantidade INT NOT NULL DEFAULT 0,
    usuario_id INT NOT NULL,
    status_tomado BIT NOT NULL DEFAULT 0,
    CONSTRAINT FK_Medicamentos_Usuarios
        FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE CASCADE
);
GO

CREATE TABLE historico_medicamentos (
    id INT IDENTITY(1,1) PRIMARY KEY,
    medicamento_id INT NOT NULL,
    usuario_id INT NOT NULL,
    data DATE NOT NULL,
    horario TIME NULL,
    tomado BIT NOT NULL DEFAULT 0,
    data_hora_tomado DATETIME NULL,
    CONSTRAINT FK_Historico_Medicamentos
        FOREIGN KEY (medicamento_id) REFERENCES medicamentos(id),
    CONSTRAINT FK_Historico_Usuarios
        FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);
GO

CREATE INDEX IX_Medicamentos_Usuario ON medicamentos(usuario_id);
CREATE INDEX IX_Historico_Usuario_Data ON historico_medicamentos(usuario_id, data);
GO

-- Atenção: a versão acadêmica armazena senhas sem hash porque o código Java
-- original espera esse formato. Em produção, use hash seguro e nunca texto puro.
