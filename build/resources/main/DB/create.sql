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
    paint_man VARCHAR,
);

--CREATE DATABASE services_test WITH TEMPLATE services;