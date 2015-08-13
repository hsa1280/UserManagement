alter table facility
add constraint facility_pk
primary key (id) 
using index (
  create unique index facility_pk_idx on facility (id) reverse
);