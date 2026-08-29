# Write your MySQL query statement below
select d.name as Department,e.name as Employee,e.Salary
from Department as d join Employee as e on e.departmentId=d.id
where (departmentId,salary) in(
    select departmentId,max(salary)
    from Employee
    group by departmentId
);