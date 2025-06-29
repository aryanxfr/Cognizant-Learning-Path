SET SERVEROUTPUT ON;

BEGIN
  FOR cust IN (SELECT customer_id FROM customers WHERE age > 60) LOOP
    UPDATE loans
    SET interest_rate = interest_rate - 1
    WHERE customer_id = cust.customer_id;
  END LOOP;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('--- Updated Interest Rates for Seniors ---');

  FOR loan IN (
    SELECT l.loan_id, c.name, l.interest_rate
    FROM loans l
    JOIN customers c ON l.customer_id = c.customer_id
    WHERE c.age > 60
  ) LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Loan ID: ' || loan.loan_id ||
      ', Customer: ' || loan.name ||
      ', Updated Interest Rate: ' || loan.interest_rate
    );
  END LOOP;
END;