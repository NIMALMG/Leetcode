# Write your MySQL query statement below
select query_name,ROUND(AVG(rating/position),2) AS quality ,ROUND(SUM(rating<3)/COUNT(*) * 100,2) AS poor_query_percentage  from Queries group by query_name