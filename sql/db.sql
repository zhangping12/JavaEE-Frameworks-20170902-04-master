DROP DATABASE IF EXISTS db;
CREATE DATABASE db;

DROP TABLE IF EXISTS db.user;
CREATE TABLE db.user (
  id        INT AUTO_INCREMENT PRIMARY KEY
  COMMENT 'id PK',
  username  VARCHAR(191) NOT NULL UNIQUE
  COMMENT 'username NN UN',
  password  VARCHAR(255) NOT NULL
  COMMENT 'password NN',
  avatar    varchar(255) comment 'avatar',
  addressId INT UNIQUE
  COMMENT 'address id FK'
)
  COMMENT 'user table';

DROP TABLE IF EXISTS db.book;
CREATE TABLE db.book (
  id      BIGINT AUTO_INCREMENT PRIMARY KEY
  COMMENT 'id PK',
  title   VARCHAR(255)  NOT NULL
  COMMENT 'title NN',
  price   DECIMAL(6, 2) NOT NULL
  COMMENT 'price NN',
  amount  INT           NOT NULL
  COMMENT 'amount NN',
  pubTime DATE          NOT NULL
  COMMENT 'publish time NN',
  userId  INT COMMENT 'user id FK'
)
  COMMENT 'book table';

ALTER TABLE db.book
  AUTO_INCREMENT 2147483647; -- int max value

DROP TABLE IF EXISTS db.address;
CREATE TABLE db.address (
  id     INT AUTO_INCREMENT PRIMARY KEY
  COMMENT 'id PK',
  detail VARCHAR(255) NOT NULL
  COMMENT 'detail NN',
  userId INT UNIQUE
  COMMENT 'user id FK'
)
  COMMENT 'address table';

DROP TABLE IF EXISTS db.student;
CREATE TABLE db.student (
  id   INT AUTO_INCREMENT PRIMARY KEY
  COMMENT 'id PK',
  name varchar(255) not null
  comment 'student name NN'
)
  comment 'student table';

DROP TABLE IF EXISTS db.course;
CREATE TABLE db.course (
  id    INT AUTO_INCREMENT PRIMARY KEY
  COMMENT 'id PK',
  title varchar(255) not null
  comment 'course title NN'
)
  comment 'course table';

DROP TABLE IF EXISTS db.student_course;
CREATE TABLE db.student_course (
  id        INT AUTO_INCREMENT PRIMARY KEY
  COMMENT 'id PK',
  studentId int comment 'student id FK',
  courseId  int comment 'course id Fk'
)
  comment 'student course table';

ALTER TABLE db.book
  ADD CONSTRAINT
  book_fk_userId
FOREIGN KEY (userId)
REFERENCES db.user (id);

ALTER TABLE db.address
  ADD CONSTRAINT
  address_fk_userId
FOREIGN KEY (userId)
REFERENCES db.user (id);

ALTER TABLE db.user
  ADD CONSTRAINT
  user_fk_addressId
FOREIGN KEY (addressId)
REFERENCES db.address (id);

alter table db.student_course
  add constraint
  student_course_fk_studentId
foreign key (studentId)
references db.student (id);

alter table db.student_course
  add constraint
  student_course_fk_courseId
foreign key (courseId)
references db.course (id);

SELECT *
FROM db.user;

SELECT *
FROM db.book;

SELECT *
FROM db.book
WHERE userId = 2;

-- user id : 5
-- admin: a / b / c

SELECT
  u.username,
  b.title,
  b.price,
  b.amount,
  b.pubTime
FROM db.user AS u LEFT OUTER JOIN db.book AS b
    ON u.id = b.userId;

SELECT *
FROM db.user;

SELECT *
FROM db.address;

# SET FOREIGN_KEY_CHECKS = 0;
# SET FOREIGN_KEY_CHECKS = 1;
#
# TRUNCATE db.address;

select *
from db.student;

select *
from db.course;

insert into db.student value (null, 'S1');
insert into db.student value (null, 'S2');
insert into db.student value (null, 'S3');

insert into db.course value (null, 'C1');
insert into db.course value (null, 'C2');
insert into db.course value (null, 'C3');

insert into db.student_course value (null, 1, 1);
insert into db.student_course value (null, 1, 2);
insert into db.student_course value (null, 2, 1);
insert into db.student_course value (null, 2, 2);

select *
from db.student_course;

SELECT
  s.name,
  c.title
from db.student as s inner join db.course as c
  inner join db.student_course sc
    on c.id = sc.courseId and s.id = sc.studentId
where s.id = 1;

select *
from db.user;


