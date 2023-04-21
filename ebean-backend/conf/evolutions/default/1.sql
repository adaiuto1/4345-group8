# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table application (
  id                            bigint auto_increment not null,
  student_email                 varchar(255),
  first_choice                  varchar(255),
  second_choice                 varchar(255),
  third_choice                  varchar(255),
  avoid                         varchar(255),
  is_available                  tinyint(1) default 0,
  constraint pk_application primary key (id)
);

create table classroom (
  class_id                      varchar(255) not null,
  class_title                   varchar(255),
  teacher_email                 varchar(255),
  location                      varchar(255),
  num_openings                  integer,
  ta1                           varchar(255),
  ta2                           varchar(255),
  ta3                           varchar(255),
  ta4                           varchar(255),
  ta5                           varchar(255),
  constraint pk_classroom primary key (class_id)
);

create table listing (
  listing_id                    integer auto_increment not null,
  teacher_email                 varchar(255),
  class_id                      varchar(255),
  message                       varchar(255),
  prereqs                       varchar(255),
  constraint pk_listing primary key (listing_id)
);

create table profile (
  id                            bigint auto_increment not null,
  email                         varchar(255),
  firstname                     varchar(255),
  lastname                      varchar(255),
  phone                         varchar(255),
  address                       varchar(255),
  city                          varchar(255),
  state                         varchar(255),
  country                       varchar(255),
  zip                           varchar(255),
  status                        varchar(255),
  title                         varchar(255),
  fax                           varchar(255),
  comments                      varchar(255),
  position                      varchar(255),
  affiliation                   varchar(255),
  degree                        varchar(255),
  starting_semester             varchar(255),
  grad_semester                 varchar(255),
  courses                       varchar(255),
  constraint pk_profile primary key (id)
);

create table taresponse (
  applicant_email               varchar(255),
  class_id                      varchar(255),
  teacher_email                 varchar(255),
  coursework                    varchar(255),
  applicant_message             varchar(255),
  is_open                       tinyint(1) default 0
);

create table user (
  id                            bigint auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  email                         varchar(255),
  question1                     varchar(255),
  answer1                       varchar(255),
  question2                     varchar(255),
  answer2                       varchar(255),
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists application;

drop table if exists classroom;

drop table if exists listing;

drop table if exists profile;

drop table if exists taresponse;

drop table if exists user;

