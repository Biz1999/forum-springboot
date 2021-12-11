CREATE TABLE usuario (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
  nome VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  CONSTRAINT pk_usuario PRIMARY KEY (id)
);
INSERT INTO Usuario (id, nome, email) VALUES (1, 'Ana da Silva', 'ana@email.com');