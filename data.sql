create table employee
(
    id integer ,
    name varchar(255) not null,
    salary integer,
    designation varchar(255),
    primary key(id)
);
insert into employee(id,name,salary,designation)
values( 100,'Nandini ' ,40000,'programmer');
insert into employee(id,name,salary,designation)
values( 101,'lakshman ' ,50000,'Manager');
insert into employee(id,name,salary,designation)
values( 102,'apoorv ' ,60000,'seniormanager');
insert into employee(id,name,salary,designation)
values( 103,'Rajitha ' ,70000,'Tester');
select * from employee;