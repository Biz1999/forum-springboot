create table curso (
  id BIGINT NOT NULL auto_increment,
  nome VARCHAR(255) NOT NULL,
  categoria VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO Curso (id, nome, categoria) VALUES (1, 'Kotlin', 'PROGRAMAÇÃO');
INSERT INTO Curso (id, nome, categoria) VALUES (2, 'Html', 'Frontend');