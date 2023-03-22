 create table dept (deptno number(2),
    dname varchar2(14),
    loc varchar2(13),
    primary key(deptno));
    
create table emp (empno number(4),
ename varchar2(10),
job varchar2(9),
mgr number(4),
hiredate date,
sal number(7,2),
comm number(7,2),
deptno number(2),
primary key(empno),
foreign key(deptno) references dept);

insert into dept
values (10, ¡®ACCOUNTING¡¯, ¡®NEW YORK¡¯);

insert into emp
values(7369, 'SMITH', 'CLERK', 7902, '10/12/17', 
800, NULL, 20);