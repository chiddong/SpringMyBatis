-- db.sql

create table tblMyBatis (
    item varchar2(100) primary key,
    price number not null,
    regdate date default sysdate not null
);

insert into tblMyBatis values ('마우스', 35000, default);
insert into tblMyBatis values ('키보드', 50000, default);
insert into tblMyBatis values ('모니터', 200000, default);

select * from tblMyBatis;
select * from tblAddress;

commit;

select item from tblMyBatis
			where price = (select max(price) from tblMyBatis)
				and rownum = 1;