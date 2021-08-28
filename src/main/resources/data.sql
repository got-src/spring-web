DROP TABLE IF EXISTS greetings;

CREATE TABLE greetings (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  value VARCHAR(250) NOT NULL
);

INSERT INTO greetings (value) VALUES
  ('Hello from Dave!'),
  ('Hello from Bill!'),
  ('Hello from John!');