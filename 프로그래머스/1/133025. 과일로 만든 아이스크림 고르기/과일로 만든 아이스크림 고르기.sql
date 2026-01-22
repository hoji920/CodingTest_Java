-- 코드를 입력하세요
SELECT t1.FLAVOR
from FIRST_HALF t1
join ICECREAM_INFO t2
ON t1.flavor=t2.flavor
and t1.TOTAL_ORDER>3000
and t2.INGREDIENT_TYPE like 'frui%'
order by TOTAL_ORDER DESC;