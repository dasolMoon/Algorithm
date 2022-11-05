
SELECT YEAR
     , MONTH
     , CNT                           AS PUCHASED_USERS
     , ROUND((CNT/TOT_CNT), 1)       AS PUCHASED_RATIO
  FROM (
        SELECT A.YEAR    AS YEAR
             , A.MONTH   AS MONTH
             , COUNT(*)  AS CNT
             , B.TOT_CNT AS TOT_CNT
          FROM (
                SELECT DISTINCT USER_ID
                     , TO_CHAR(SALES_DATE,'YYYY') AS YEAR
                     , TO_CHAR(SALES_DATE,'MM')   AS MONTH
                  FROM ONLINE_SALE 
               )          A
             , (SELECT USER_ID
                     , COUNT(*) OVER(PARTITION BY 1) AS TOT_CNT
                  FROM USER_INFO   
                 WHERE TO_CHAR(JOINED,'YYYY') = '2021'
               )        B
         WHERE A.USER_ID = B.USER_ID
         GROUP BY A.YEAR
             , A.MONTH
             , B.TOT_CNT

       ) 
 ORDER BY YEAR, MONTH
 

