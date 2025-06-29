CREATE PROCEDURE TransferFunds(
  from_account_id IN NUMBER,
  to_account_id IN NUMBER,
  transfer_amount IN NUMBER
) IS
  insufficient_balance EXCEPTION;
BEGIN
  DECLARE
    source_balance NUMBER;
  BEGIN
    SELECT balance INTO source_balance FROM accounts WHERE account_id = from_account_id;

    IF source_balance < transfer_amount THEN
      RAISE insufficient_balance;
    END IF;
  END;

  UPDATE accounts
  SET balance = balance - transfer_amount
  WHERE account_id = from_account_id;

  UPDATE accounts
  SET balance = balance + transfer_amount
  WHERE account_id = to_account_id;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Transferred ' || transfer_amount || ' from Account ' || from_account_id || ' to Account ' || to_account_id);

EXCEPTION
  WHEN insufficient_balance THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance in account ' || from_account_id);
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: One or both account IDs are invalid.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed due to an unexpected error: ' || SQLERRM);
END;
/
