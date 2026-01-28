-- 코드를 입력하세요

SELECT mcdp_cd as "진료과코드",
COUNT(PT_NO) as "5월예약건수"
FROM APPOINTMENT
where TO_CHAR(APNT_YMD,'YYYY-MM-DD') >= '2022-05-01'
and TO_CHAR(APNT_YMD,'YYYY-MM-DD') <= '2022-05-31'
group by mcdp_cd
order by COUNT(PT_NO) asc, mcdp_cd asc