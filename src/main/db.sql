create database java16_order_system;
use java16_order_system;

drop table if exists dishes;
create table dishes (
    dishId int primary key auto_increment,
    name varchar(50),
    price int
);

drop table if exists user;
create table user(
    userId int primary key auto_increment,
    name varchar(50) unique,
    password varchar(50),
    isAdmin int
);

drop table if exists order_user;
create table order_user (
    orderId int primary key auto_increment,
    userId int,  -- 这个用户id需要和user表中的userId具有关联关系
    time datetime,
    isDone int,
    foreign key(userId) references user(userId)
);

drop table if exists order_dish;
create table order_dish (
    orderId int,   -- orderId 也和 order_user 表的 orderId 字段有外键关系
    dishId int,    -- dishId 也和 dishes 表中的 dishId 存在外键关系
    foreign key(orderId) references order_user(orderId),
    foreign key(dishId) references dishes(dishId)
);