drop table if exists "Jaegers";

create table "Jaegers" (
    id serial primary key,
    modelName varchar(255),
    mark varchar(255),
    height integer,
    weight integer,
    status varchar(255),
    origin varchar(255),
    launch date,
    kaijuKill integer
);
