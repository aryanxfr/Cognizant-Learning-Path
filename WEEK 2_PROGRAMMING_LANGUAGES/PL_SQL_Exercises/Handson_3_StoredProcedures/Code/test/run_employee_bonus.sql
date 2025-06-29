SET SERVEROUTPUT ON;

BEGIN
  UpdateEmployeeBonus(101, 10);
END;
/

SELECT * FROM employees;
