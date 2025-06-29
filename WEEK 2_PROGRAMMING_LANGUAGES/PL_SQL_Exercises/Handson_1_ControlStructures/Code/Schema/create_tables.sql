CREATE TABLE customers (
    customer_id NUMBER PRIMARY KEY,
    name VARCHAR2(100),
    age NUMBER,
    balance NUMBER(10, 2),
    isVIP varchar(5)
);


CREATE TABLE loans (
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    interest_rate NUMBER(5, 2),
    due_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);