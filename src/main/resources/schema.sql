DROP TABLE IF EXISTS tasks;

CREATE TABLE IF NOT EXISTS tasks (
    id       VARCHAR(60)  PRIMARY KEY,
    text     VARCHAR      NOT NULL
);
