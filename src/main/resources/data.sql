insert into contact(first_name, last_name, birth_date)
  values ('Chris', 'Pratt', '1984-05-03');
insert into contact(first_name, last_name, birth_date)
  values ('Scott', 'Tiger', '1990-11-02');
insert into contact(first_name, last_name, birth_date)
  values ('John', 'Smith', '1964-02-28');

insert into contact_tel_detail(contact_id, tel_type, tel_number)
  values (1, 'Mobile', '123456789');
insert into contact_tel_detail(contact_id, tel_type, tel_number)
  values (1, 'Home', '123456789');
insert into contact_tel_detail(contact_id, tel_type, tel_number)
  values (2, 'Home', '123456789');

insert into hobby(hobby_id) values ('Swimming');
insert into hobby(hobby_id) values ('Jogging');
insert into hobby(hobby_id) values ('Programming');
insert into hobby(hobby_id) values ('Movies');
insert into hobby(hobby_id) values ('Reading');

insert into contact_hobby_detail (contact_id, hobby_id) values (1, "Swimming");
insert into contact_hobby_detail (contact_id, hobby_id) values (1, "Movies");
insert into contact_hobby_detail (contact_id, hobby_id) values (2, "Swimming");