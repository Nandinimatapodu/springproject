create table employee
(
    id integer ,
    name varchar(255) not null,
    age integer,
    salary integer,
    designation varchar(255),
    primary key(id)
);
insert into employee(id,name,age,salary,designation)
values( 100,'Nandini ',22 ,40000,'programmer');
insert into employee(id,name,age,salary,designation)
values( 101,'lakshman ',27 ,50000,'Manager');
insert into employee(id,name,age,salary,designation)
values( 102,'apoorv ' ,30,60000,'seniormanager');
insert into employee(id,name,age,salary,designation)
values( 103,'Rajitha ',28 ,70000,'Tester');
select * from employee;
