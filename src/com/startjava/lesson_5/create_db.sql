-- Создание БД
CREATE DATABASE robots;

-- Законнектиться к БД
\c robots;

--Создать таблицу
CREATE TABLE jaegers (id SERIAL PRIMARY KEY,
                      model_name TEXT,
                      mark TEXT,
                      height REAL,
                      weight REAL,
                      status TEXT,
                      origin TEXT,
                      launch DATE,
                      kaiju_kill INTEGER);

-- Вызов скрипта для заполнения таблицы данными
\i init_db.sql

-- Вызов скрипта с запросами
\i queries.sql