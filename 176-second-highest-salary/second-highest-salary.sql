# Write your MySQL query statement below
-- select(select salary from Employee where salary<(select max(salary) from Employee) order by -- salary desc limit 1)AS SecondHighestSalary;

select max(salary) AS SecondHighestSalary from Employee where salary<(select max(salary) from Employee);

