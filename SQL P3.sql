select concat("thanu"," ","shri") as fullname;
select char_length("thanushri") as stringlength;
select upper("hello") as uppercase;
select lower("HELLO") AS lowercase;
select length("thanushri") as length;
select replace("hello world","world","sql") as updatedstring;

select substring("hello word",1,5) as substring;##from 1 to 5 letters
select left("hello world",5) as leftstring;##from left 5 letters
select right("hello world",3) as rightstring;##from right 3 letters
select instr("hello world","world") as position;
select trim(" "from" hello world  ") as trimmed;
select reverse("hello") as reverse;
select ascii("t") as name;

 SELECT CONCAT_WS('_', 'geeks', 'for', 'geeks');
 SELECT FIND_IN_SET('e','a,b,c,d,e,f');##postion from set
 SELECT concat(FORMAT(0.9815780 * 100, '3') +'%') AS PercentageOutput;
 select INSTR('geeks for geeks', 'e');
 select lcase("THANU");
 SELECT LOCATE('for', 'geeksforgeeks', 1);
 
 select LPAD('geeks', 8, '0') as Append;
 select mid("thanushri",6,2) as findmid;
 SELECT POSITION('e' IN 'geeksforgeeks');
 SELECT REPEAT('geeks', 2) as repeatstring;
 select  RPAD('geeks', 8, '0');
 select space(7);
SELECT STRCMP('google.com', 'geeksforgeeks.com');

##numerical function
select abs(-8) as absolute;
select ceil(12.4567) as ceiloperation;
select floor(12.39);
SELECT ROUND(15.6789, 2);
SELECT TRUNCATE(12.98765, 2);
SELECT MOD(10, 3);
SELECT POWER(2, 3);
SELECT SQRT(16);
select exp(1);
SELECT LOG(100);
SELECT RAND();

###date functions
select now();
select curdate();
select curtime();

#################sql functions####################
use thanu;
CREATE TABLE sales (
    sale_id INT PRIMARY KEY,
    product_id INT,
    customer_id INT,
    supplier_id INT, -- Common column
    sale_date DATE,
    quantity INT,
    price DECIMAL(10, 2)
);

INSERT INTO sales (sale_id, product_id, customer_id, supplier_id, sale_date, quantity, price)
VALUES
(1, 101, 201, 301, '2025-02-01', 2, 19.99),
(2, 102, 202, 302, '2025-02-02', 1, 49.99),
(3, 101, 203, 301, '2025-02-03', 3, 19.99),
(4, 103, 204, 303, '2025-02-04', 5, 9.99),
(5, 104, 205, 304, '2025-02-05', 2, 29.99),
(6, 102, 206, 302, '2025-02-06', 1, 49.99),
(7, 105, 207, 305, '2025-02-07', 4, 15.99),
(8, 104, 208, 304, '2025-02-08', 2, 29.99),
(9, 103, 209, 303, '2025-02-09', 3, 9.99),
(10, 101, 210, 301, '2025-02-10', 1, 19.99);

CREATE TABLE products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    category VARCHAR(50),
    supplier_id INT -- Common column
);

INSERT INTO products (product_id, product_name, category, supplier_id)
VALUES
(101, 'Product A', 'Category 1', 301),
(102, 'Product B', 'Category 2', 302),
(103, 'Product C', 'Category 1', 303),
(104, 'Product D', 'Category 3', 304),
(105, 'Product E', 'Category 2', 305),
(106, 'Product F', 'Category 3', 306),
(107, 'Product G', 'Category 1', 307),
(108, 'Product H', 'Category 2', 308),
(109, 'Product I', 'Category 3', 309),
(110, 'Product J', 'Category 1', 310);

###sub query
SELECT s.sale_id, s.product_id, p.product_name
FROM sales s
INNER JOIN products p ON s.product_id = p.product_id
WHERE s.product_id IN (SELECT product_id FROM products WHERE product_id > 102);

select product_id,product_name from products where product_id in(select distinct product_id from products);
select product_id,sum(quantity) from sales where product_id in(select distinct product_id from sales) group by product_id;


drop table customers;
drop table payments;
drop table offices;
drop table employees;
drop table orders2;
drop table orderdetails;
drop table products2;
drop table productlines;






 


