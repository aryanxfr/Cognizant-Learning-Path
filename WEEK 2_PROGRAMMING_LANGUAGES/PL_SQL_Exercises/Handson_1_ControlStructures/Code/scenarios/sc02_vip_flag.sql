SET SERVEROUTPUT ON;
BEGIN
  FOR cust IN (SELECT * FROM customers WHERE balance > 10000) LOOP
    UPDATE customers
    SET isVIP = 'TRUE'
    WHERE customer_id = cust.customer_id;
    DBMS_OUTPUT.PUT_LINE('Customer ' || cust.name || ' promoted to VIP.');
  END LOOP;

  COMMIT;
END;
/
