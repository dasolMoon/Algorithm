-- 코드를 입력하세요
SELECT ANIMAL_ID
     , NAME
  FROM (
        SELECT A.ANIMAL_ID             AS ANIMAL_ID
             , A.NAME                  AS NAME
             , B.DATETIME - A.DATETIME AS DATETIME
          FROM ANIMAL_INS  A
             , ANIMAL_OUTS B
         WHERE A.ANIMAL_ID = B.ANIMAL_ID 
        ORDER BY DATETIME DESC
       )
 WHERE ROWNUM <= 2