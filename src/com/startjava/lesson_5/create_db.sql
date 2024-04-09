-- Создание БД
CREATE DATABASE robots;

-- Законнектиться к БД
\c robots;

--Создать таблицу
CREATE TABLE jaegers (
    id SERIAL  PRIMARY KEY,
    model_name VARCHAR(30),
    mark       VARCHAR(6),
    height     REAL,
    weight     DECIMAL,
    status     VARCHAR(30),
    origin     VARCHAR(30),
    launch     DATE,
    kaiju_kill INTEGER
);

-- Вызов скрипта для заполнения таблицы данными
\i init_db.sql

-- Вызов скрипта с запросами
\i queries.sql

-- Удаление таблицы
\c postgres
DROP DATABASE robots;