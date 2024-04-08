\echo '����� ���� �������'
SELECT * FROM jaegers ORDER BY model_name;

\echo '����� ���� ���������� ��� �� ������������ ������'
SELECT * FROM jaegers WHERE status != 'Destroyed' ORDER BY model_name;

\echo '����� ���� ���������� ��� ������ ������� � ���������� ���������'
SELECT * FROM jaegers WHERE mark IN ('Mark-1', 'Mark-4') ORDER BY model_name;

\echo '����� ���� ���������� ��� ���� ������ ����� ������� � ���������� ���������'
SELECT * FROM jaegers WHERE mark NOT IN ('Mark-1', 'Mark-4') ORDER BY mark DESC;

\echo '����� ���� ���������� ��� ������ ������� �����'
SELECT * FROM jaegers ORDER BY launch LIMIT 1;

\echo '����� ��������, �����, ���� ������� � ���������� ������ ������ ��� ���� ����� �������������� ������'
SELECT model_name, mark, launch, kaiju_kill FROM jaegers ORDER BY kaiju_kill DESC LIMIT 3;

\echo '����� �������� ���� ���� ������, ������������ �� ���� ������ ����� �������'
SELECT ROUND(CAST(AVG(weight) AS DECIMAL), 3) AS avg_weigth FROM jaegers;

\echo '����� ���� ���������� ��� ������, ��� ���� �������� ���������� ������ ������ �� 1 ��� ��� ����� ������'
UPDATE jaegers SET kaiju_kill = kaiju_kill + 1 WHERE status != 'Destroyed';
SELECT * FROM jaegers ORDER BY model_name;

\echo '�������� �� ������� ���� ������������ ������ � ����� ���� ���������� ��� ����������'
DELETE FROM jaegers WHERE status = 'Destroyed';
SELECT * FROM jaegers;