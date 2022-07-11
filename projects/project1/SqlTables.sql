drop table if exists reimbursements, users, reimb_type, reimb_status, roles;

create table roles(
id serial primary key,
role varchar(10) not null
);

create table reimb_status(
id serial primary key,
status varchar(10) not null
);

create table reimb_type(
id serial primary key,
type varchar(20) not null
);

create table users(
id serial primary key,
username varchar(50) unique not null,
password varchar(50) not null,
first_name varchar(100) not null,
last_name varchar(100)not null,
email varchar(150) unique not null,
role_id integer references roles(id) not null
);

create table reimbursements(
id serial primary key,
amount NUMERIC(19,2) not null,
submitted timestamp default current_timestamp not null,
resolved timestamp,
description varchar(250),
receipt bytea,
author_id integer references users(id) not null,
resolver_id integer references users(id),
status_id integer references reimb_status(id) not null,
type_id integer references reimb_type(id) not null
);

INSERT INTO roles (role) VALUES ('EMPLOYEE');
INSERT INTO roles (role) VALUES ('MANAGER');

INSERT INTO reimb_status (status) VALUES ('PENDING');
INSERT INTO reimb_status (status) VALUES ('APPROVED');
INSERT INTO reimb_status (status) VALUES ('DENIED');

INSERT INTO reimb_type (type) VALUES ('LODGING');
INSERT INTO reimb_type (type) VALUES ('TRAVEL');
INSERT INTO reimb_type (type) VALUES ('FOOD');
INSERT INTO reimb_type (type) VALUES ('OTHER');
insert into users (username, password, first_name, last_name, email, role_id) values ('passup12', 'AzUpOX', 'Nananne', 'Schruurs', 'nschuurs0@bluehost.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('seed1', 'On895S', 'Salim', 'Eschelle', 'seschele1@ovh.net', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('danshin2', 'lsOY0qWSkQ', 'Nikolia', 'Danshin', 'ndanshin2@usnews.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('tkingzet12', '9BDmKHVys0', 'Tybi', 'Kingzett', 'tkingzett3@opensource.org', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('olivier42', 'gQpW06IehVd', 'Sherman', 'Olivier', 'solivier4@omniture.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('eford5', 'us6bY7', 'Emili', 'Whatford', 'ewhatford5@linkedin.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('krundle6', 'k5vvbjLtTNK', 'Kale', 'Brundle', 'kbrundle6@china.com.cn', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('cordingly7', 'gSCJMp', 'Rosalinde', 'Cordingly', 'rcordingly7@list-manage.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('chapelhow8', 'm1mNKg', 'Mace', 'Chapelhow', 'mapelhow8@blogspot.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('rubin9', '5RCQGl1ckwi', 'Ruddie', 'Rubin', 'cuban9@cbslocal.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('jorcka', 'hBctMJ2', 'Kristina', 'Jordan', 'kjorcka@feedburner.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('lpestellb', 'H8leUW', 'Louella', 'Pestell', 'lpestellb@php.net', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('waiec', '75bBuFUxime', 'Wood', 'Adel', 'wadiec@technorati.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('clokinsd', '3aiCe0CB', 'Senator', 'Lorkins', 'clorkinsd@google.cn', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('cgappere', 'OiBBLw795', 'Kylie', 'Faker', 'cgappere@google.co.jp', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('sdyzarf', 'qOiMEB8dD82O', 'Lebron', 'James', 'Thechosenone@Top2Not2.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('lbrashg', 'fl7QHSmC', 'Laurie', 'Brash', 'lbrashg@mapy.cz', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('cpreh', 'ZygaPzl8z2pm', 'Carlye', 'Pre', 'cpreh@vinaora.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('rphlippii', 'ViOuZK9qIU', 'Revkah', 'Phlippi', 'rphlippii@nydailynews.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('ncowlamj', 'AcdQGU3mN', 'Norah', 'Cowlam', 'ncowlamj@mit.edu', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('tmussingtonk', 'LsAsivXz7A9', 'Tatiana', 'Mussington', 'tmussingtonk@pinterest.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('pilettl', 'Dz1BtMFRXEDz', 'Pansie', 'Ilett', 'pilettl@shutterfly.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('fgreedingm', 'GaPzboHG', 'Francklyn', 'Greeding', 'fgreedingm@princeton.edu', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('amattiaton', 'wIqVHzad', 'Amory', 'Mattiato', 'amattiaton@flickr.com', 1);
insert into users (username, password, first_name, last_name, email, role_id) values ('cwhyberdo', 'gFxg3uVWgEf9', 'Cchaddie', 'Whyberd', 'cwhyberdo@harvard.edu', 2);
insert into users (username, password, first_name, last_name, email, role_id) values ('rscamerdinep', 'NYdYrxp', 'Rowen', 'Scamerdine', 'rscamerdinep@fastcompany.com', 2);
insert into users (username, password, first_name, last_name, email, role_id) values ('claityq', 'tkQ9HwgA', 'Camile', 'Laity', 'claityq@bloglovin.com', 2);
insert into users (username, password, first_name, last_name, email, role_id) values ('aterbeckr', 'iVOpCgzWw', 'Augustina', 'Terbeck', 'aterbeckr@wp.com', 2);
insert into users (username, password, first_name, last_name, email, role_id) values ('llightbourns', 'rzEoPy4gOwFo', 'Leshia', 'Lightbourn', 'llightbourns@wordpress.com', 2);
insert into users (username, password, first_name, last_name, email, role_id) values ('tsimonott', 'PKvbskiQ2Mgl', 'Tallie', 'Simonot', 'tsimonott@addthis.com', 2);

insert into reimbursements (amount, description, author_id, status_id, type_id) values (10.1, 'Basketball', 1, 1, 3);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (72.12, 'Video Gamer', 2, 1, 3);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (126.91, 'Doctor', 4, 1, 2);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (48.25, 'Pro Athlete', 7, 1, 2);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (94.35, 'Nerd', 4, 2, 1);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (711.2, 'Video Gamer', 3, 2, 2);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (128.74, 'Pro Athlete', 8, 3, 2);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (225.0, 'Food Consumer', 10, 3, 1);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (218.36, 'Food Consumer', 12, 1, 4);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (358.74, 'Clothing Consumer', 2, 1, 1);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (140.35, 'Video Gamer', 5, 1, 3);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (839.53, 'Netflix and Chill', 9, 2, 3);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (691.27, 'Actor', 9, 2, 1);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (439.25, 'Annoouncer', 11, 3, 1);
insert into reimbursements (amount, description, author_id, status_id, type_id) values (22.41, 'Video Gamer', 12, 3, 1);