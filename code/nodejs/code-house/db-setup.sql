create database codehouse;
use codehouse;

create table books (
	id int primary key auto_increment ,
    title varchar(20) not null,
    price double not null,
    detail varchar(40) not null
);

select * from books;

alter table books modify book_description varchar(40);
alter table books change book_name title varchar(20);
alter table books change book_description detail varchar(40);

insert into books(title, price, detail)
values ('NodeJs', 10.00, 'Learning NodeJS language');
