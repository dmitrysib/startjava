select * from "Jaegers";
select * from "Jaegers" where status = 'Active';
select * from "Jaegers" where mark = 'Mark-1' or mark = 'Mark-6';
select * from "Jaegers" order by mark desc;
select * from "Jaegers" order by launch asc limit 1;

select * from "Jaegers" where "kaijuKill" in (select max("kaijuKill") from "Jaegers");
select * from "Jaegers" where "kaijuKill" in (select min("kaijuKill") from "Jaegers");

select avg(weight) from "Jaegers";

update "Jaegers" set "kaijuKill" = "kaijuKill" + 1 where status = 'Active';

delete from "Jaegers" where status = 'Destroyed';
