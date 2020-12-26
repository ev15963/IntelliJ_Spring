drop table member_intellij;
create table member_intellij
(
    id varchar2 (255) primary key,
    name varchar2(255)
);

create sequence seq_id increment by 1 start with 1;

insert into member_intellij values(seq_id.NEXTVAL, 'name');

desc member_intellij

insert into member_intellij (id, name) values (seq_id.NEXTVAL, 'spring');