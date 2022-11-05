-- 코드를 입력하세요
SELECT *
  FROM (
        SELECT NAME
             , DATETIME
          FROM ANIMAL_INS A
         WHERE NOT EXISTS (SELECT 1
                             FROM ANIMAL_OUTS B
                            WHERE A.ANIMAL_ID = B.ANIMAL_ID)
         ORDER BY DATETIME
        )
 WHERE ROWNUM <=3