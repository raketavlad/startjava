\echo 'Вывод всей таблицы'
SELECT * FROM jaegers ORDER BY model_name;

\echo 'Вывод всей информации про не уничтоженных Егерей'
SELECT * FROM jaegers WHERE status != 'Destroyed' ORDER BY model_name;

\echo 'Вывод всей информации про Егерей первого и четвертого поколения'
SELECT * FROM jaegers WHERE mark IN ('Mark-1', 'Mark-4') ORDER BY model_name;

\echo 'Вывод всей информации про всех Егерей кроме первого и четвертого поколения'
SELECT * FROM jaegers WHERE mark NOT IN ('Mark-1', 'Mark-4') ORDER BY mark DESC;

\echo 'Вывод всей информации про самого старого Егеря'
SELECT * FROM jaegers ORDER BY launch LIMIT 1;

\echo 'Вывод названия, марки, года выпуска и количество убитых Кайдзю для трех самых результативных Егерей'
SELECT model_name, mark, launch, kaiju_kill FROM jaegers ORDER BY kaiju_kill DESC LIMIT 3;

\echo 'Вывод среднего веса всех Егерей, округленного до трех знаков после запятой'
SELECT ROUND(CAST(AVG(weight) AS DECIMAL), 3) AS avg_weigth FROM jaegers;

\echo 'Вывод всей информации про Егерей, при этом увеличив количество убитых Кайдзю на 1 для ещё живых Егерей'
UPDATE jaegers SET kaiju_kill = kaiju_kill + 1 WHERE status != 'Destroyed';
SELECT * FROM jaegers ORDER BY model_name;

\echo 'Удаление из таблицы всех уничтоженных Егерей и вывод всей информации про оставшихся'
DELETE FROM jaegers WHERE status = 'Destroyed';
SELECT * FROM jaegers;