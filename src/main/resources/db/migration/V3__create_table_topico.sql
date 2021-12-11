CREATE TABLE topico (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
  titulo VARCHAR(255)  NOT NULL,
  mensagem VARCHAR(255) NOT NULL,
  data_criacao TIMESTAMP NOT NULL,
  curso_id BIGINT NOT NULL,
  autor_id BIGINT NOT NULL,
  status VARCHAR(255) NOT NULL,
  CONSTRAINT pk_topico PRIMARY KEY (id)
);

ALTER TABLE topico ADD CONSTRAINT FK_TOPICO_ON_AUTOR FOREIGN KEY (autor_id) REFERENCES usuario (id);

ALTER TABLE topico ADD CONSTRAINT FK_TOPICO_ON_CURSO FOREIGN KEY (curso_id) REFERENCES curso (id);