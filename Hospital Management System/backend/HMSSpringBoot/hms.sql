create database hms;
use hms;

-- Run Spring boot Application First Then run below commands

-- Fill Out roles table
insert into hms.roles values(1, 'ROLE_USER');
insert into hms.roles values(2, 'ROLE_ADMIN');

-- Fill out Users Table
-- Password : admin123
insert into hms.users values(1, '$2a$10$nuyV4m3SpBYuqzdRvQK4iO1PI9O0SkLyHQP2YB8CFksVJirzGrDT2', 'admin');
-- Password : user123
insert into hms.users values(2, '$2a$10$ef4yjYkFjmAjnQk/GPecK.VxaNmpe6yPfBoZh9dcW1.uzf1zFYemu', 'user');

-- fill out user_roles
insert into hms.user_roles values(2, 1);
insert into hms.user_roles values(1, 2);
