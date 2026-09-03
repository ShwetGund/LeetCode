/* Write your PL/SQL query statement below */

SELECT P.firstName, P.lastName, A.CITY,A.STATE
FROM  Person P LEFT JOIN Address A
ON P.personId=A.personId;