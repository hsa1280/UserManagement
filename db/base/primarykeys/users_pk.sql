alter table users
add constraint users_pk
primary key (id) 
using index (
  create unique index users_pk_idx on users (id) reverse
);