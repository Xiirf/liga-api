create table teams
(
   team_id				bigint(20) not null,
   name                 varchar(255) not null,
   logo         		varchar(255) not NULL,
   createdAt          	date not NULL,
   constraint pk_team 	primary key (team_id)
);