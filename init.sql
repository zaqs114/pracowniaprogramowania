
create table chairs
(
	id serial not null
		constraint chairs_pkey
			primary key,
	height integer not null,
	width integer not null,
	color varchar(64) not null,
	name varchar(64) not null
)
;

create table tables
(
	id serial not null
		constraint tables_pkey
			primary key,
	height integer not null,
	width integer not null,
	lenght integer not null,
	shape varchar(64) not null,
	name varchar(65) not null
)
;

create unique index tables_id_uindex
	on tables (id)
;

create table sets
(
	id serial not null
		constraint sets_pkey
			primary key,
	chair_id integer not null
		constraint chair_id
			references chairs,
	table_id integer not null
		constraint table_id
			references tables,
	name varchar(64) not null
)
;

create unique index sets_id_uindex
	on sets (id)
;


