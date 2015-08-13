create table users
(
	id					number				not null,
	first_name			varchar2(64 char)	not null,
	last_name			varchar2(64 char)	not null,
	email_address		varchar2(64 char)	not null,
	is_admin			number(1,0)			default 0 not null,
	facility_id 		number				not null
);