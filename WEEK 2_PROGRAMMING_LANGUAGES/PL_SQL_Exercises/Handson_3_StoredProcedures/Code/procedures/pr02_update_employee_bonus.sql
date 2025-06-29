CREATE PROCEDURE UpdateEmployeeBonus(
  dept_id IN NUMBER,
  bonus_percent IN NUMBER
) IS
BEGIN
  UPDATE employees
  SET salary = salary + (salary * bonus_percent / 100)
  WHERE department_id = dept_id;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Bonus updated for Department ID: ' || dept_id);
END;
/
