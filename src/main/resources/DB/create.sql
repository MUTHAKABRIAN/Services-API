SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS cleaner (
    cleanerId int PRIMARY KEY auto_increment,
    cleaner_name VARCHAR,
    image VARCHAR,
    physical_address VARCHAR,
    phone_number int,
    email VARCHAR,
    rating float,
    description VARCHAR
);

CREATE TABLE IF NOT EXISTS maid (
    maidId int PRIMARY KEY auto_increment,
    maid_name VARCHAR,
    image VARCHAR,
    physical_address VARCHAR,
    phone_number int,
    email VARCHAR,
    rating float,
    description VARCHAR
);

CREATE TABLE IF NOT EXISTS moving_help (
    moverId int PRIMARY KEY auto_increment,
    mover_name VARCHAR,
    image VARCHAR,
    physical_address VARCHAR,
    phone_number int,
    email VARCHAR,
    rating float,
    description VARCHAR
);

CREATE TABLE IF NOT EXISTS categories (
    categoryId int PRIMARY KEY auto_increment,
    home_cleaning VARCHAR,
    maid_services VARCHAR,
    mover_services VARCHAR,
    plumbing VARCHAR,
    electrician VARCHAR,
    carpet_cleaning VARCHAR,
    paint_man VARCHAR
);

CREATE TABLE IF NOT EXISTS plumber(
   plumberId int PRIMARY KEY auto_increment,
   plumber_name VARCHAR,
   image VARCHAR,
   physical_address VARCHAR,
   phone_number int,
   email VARCHAR,
   rating float,
   description VARCHAR


);

CREATE TABLE IF NOT EXISTS electrician(
    electricianId int PRIMARY KEY auto_increment,
    electrician_name VARCHAR,
    image VARCHAR,
    physical_address VARCHAR,
    phone_number int,
    email VARCHAR,
    rating float,
    description VARCHAR
);
CREATE TABLE IF NOT EXISTS carpet_clean(
    ccId int PRIMARY KEY auto auto_increment,
    cc_name VARCHAR,
    image VARCHAR,
    physical_address VARCHAR,
    phone_number int,
    email VARCHAR,
    rating float,
    description VARCHAR
);
CREATE TABLE IF NOT EXISTS paint(
    painterId int PRIMARY KEY auto_increment,
    painter_name VARCHAR,
    image VARCHAR,
    physical_address VARCHAR,
    phone_number int,
    email VARCHAR,
    rating float,
    description VARCHAR
)


--CREATE DATABASE services;