SET SERVEROUTPUT ON;

BEGIN
  TransferFunds(101, 102, 2000);  
END;
/

SELECT * FROM accounts;
