create database thanu;
use thanu;
drop table emp;
create table emp(empid int,empname varchar(20),salary varchar(10),phone varchar(10));
insert into emp(empid,empname,salary,phone) values(1,"thanu",50000,9944224488),(2,"sundari",65000,7788994455),(3,"keerthi",75000,3322116655);
select * from emp;
show keys from emp;
alter table emp add constraint emp_k primary key(empid);
insert into emp(empid,empname,salary,phone) values(1,"thanu",50000,9944224488);

set autocommit=0;
start transaction;
savepoint sp1;
delete from emp where empid=2;
rollback to savepoint sp1;
select * from emp;

select * from emp group by empname,empid having empid>=2;

drop table customer;
drop table orders;
drop table orders1;

CREATE TABLE customer (
    customer_id INT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone_number VARCHAR(15)
);

INSERT INTO customer (customer_id,first_name, last_name, email, phone_number) VALUES
(1,'John', 'Doe', 'john.doe@example.com', '123-456-7890'),
(2,'Jane', 'Smith', 'jane.smith@example.com', '234-567-8901'),
(3,'Alice', 'Johnson', 'alice.johnson@example.com', '345-678-9012'),
(4,'Bob', 'Brown', 'bob.brown@example.com', '456-789-0123');

INSERT INTO customer (customer_id, first_name, last_name, email, phone_number) VALUES
(5, 'NewCustomer', 'Example', 'newcustomer@example.com', '567-890-1234');
INSERT INTO customer (customer_id, first_name, last_name, email, phone_number) VALUES
(6, 'David', 'Miller', 'david.miller@example.com', '678-901-2345'),
(7, 'Emma', 'Wilson', 'emma.wilson@example.com', '789-012-3456'),
(8, 'Liam', 'Clark', 'liam.clark@example.com', '890-123-4567'),
(9, 'Sophia', 'Lopez', 'sophia.lopez@example.com', '901-234-5678'),
(10, 'William', 'Davis', 'william.davis@example.com', '012-345-6789');


create table orders(orderid int,customer_id int primary key,orderdate date);
insert into orders values(10,1,"1990-12-20"),(20,2,"2009-12-23"),(30,3,"1927-12-03"),(40,5,"1923-12-21");

create table orders1(orderid int,customer_id int,orderdate date,FOREIGN KEY (customer_id) REFERENCES customer(customer_id));
insert into orders1 values(10,1,"1990-12-20"),(20,2,"2009-12-23"),(30,3,"1927-12-03"),(40,5,"1923-12-21");

select * from orders;
select * from customer;

select o.customer_id,c.first_name,o.orderid,o.orderdate from orders o inner join customer c on o.customer_id=c.customer_id;
select o.customer_id,c.first_name,o.orderid,o.orderdate from orders o left join customer c on o.customer_id=c.customer_id;
select o1.customer_id,c.first_name,o1.orderid,o1.orderdate from orders1 o1 inner join customer c on o1.customer_id=c.customer_id;
select o1.customer_id,c.first_name,o1.orderid,o1.orderdate from orders1 o1 right join customer c on o1.customer_id=c.customer_id;

##full outer join
select o1.customer_id,c.first_name,o1.orderid,o1.orderdate from orders1 o1 left join customer c on o1.customer_id=c.customer_id
union
select o1.customer_id,c.first_name,o1.orderid,o1.orderdate from orders1 o1 right join customer c on o1.customer_id=c.customer_id;




