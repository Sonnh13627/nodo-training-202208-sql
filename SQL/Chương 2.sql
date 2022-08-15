
--Chương 2:
-- 1.CHọn toàn bộ thông tin trong bảng SALGRADE
    select *
    from SALGRADE;
-- 2. Chọn toàn bộ thông tin trong bảng EMP
    select* from EMP;
--3. Hiển thị mọi loại nghề nghiệp
    select DISTINCT JOB from EMP;
--4.Hiển thị tên nhân viên và thu nhập trong một năm (REMUNERATION)
    select DISTINCT ENAME, SAL*12 REMUNERATION
    from EMP;
--5.Hiển thị theo nội dung dưới đây Who,what and when
select  ENAME||'HAS HELP THE POSITION OF'|| EMP.JOB || 'IN DEPT' || DEPTNO || 'SINCE' || HIREDATE
from EMP;
--6. Cấu trúc bảng emp
DESC  EMP;
--7.Thay đổi nhãn và định dạng hiển thị của cột sal và hiredate trong bảng emp;
SELECT TO_CHAR(HIREDATE,'yyyy/mm/dd'),
       to_char(SAL,'$9,999,00')
FROM EMP
--CHương 3:


