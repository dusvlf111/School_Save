--1
select nvl(deptno,0) as deptno
    , max(mgr) as max_deptno
    , min(mgr) min_deptno
    , sum(mgr) sum_deptno
    , round(avg(mgr)) avg_deptno
from EMP
group by deptno
having avg(deptno)=10
order by deptno
;


--2
select
    deptno,
    round(avg(mgr))
from EMP
group by deptno
order by round(avg(mgr))desc
;


--3
select
    job,
    count(job) as count_job
from EMP
group by job
order by count_job desc
;

--4


