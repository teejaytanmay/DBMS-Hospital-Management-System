drop database project;
create database project;
use project;

create table patient(
	patient_id int PRIMARY KEY,
	name varchar(30) NOT NULL,
	sex varchar(1),
	pno varchar(20) UNIQUE,
	address varchar(50) NOT NULL,
	bdate date,
	email varchar(50) UNIQUE,
	med_hist varchar(50)
);

create table doctor(
	doctor_id int PRIMARY KEY,
	name varchar(30) NOT NULL,
	sex varchar(1),
	qualification varchar(15),
	specialization varchar(15),
	consultation_charge float
);

create table registration(
	patient_id int PRIMARY KEY,
	date_of_registration DATE,
	time_of_registration TIME
);

create table visit(
	visit_id int PRIMARY KEY,
	patient_id int
);

create table appointment(
	appointment_id int PRIMARY KEY,
	visit_id int,
	doctor_id int,
	appointment_date DATE,
	appointment_time TIME
);

create table consultation(
	consultation_id int PRIMARY KEY,
	appointment_id int,
	medication varchar(30),
	dosage varchar(30)

);

create table morgue(
	body_id int PRIMARY KEY,
	patient_id int
);

create table treatment(
	treatment_id int PRIMARY KEY,
	patient_id int,
	consultation_id int,
	cost float
);

create table diagnostic_lab_visit(
	diagnostic_lab_visit_id int PRIMARY KEY,
	diagnostic_lab_id int,
	visit_id int,
	result varchar(100),
	test varchar(50),
	cost float
);

create table diagnostic_lab(
	diagnostic_lab_id int PRIMARY KEY,
	name varchar(30)
);

create table instrument(
	instrument_id int PRIMARY KEY,
	diagnostic_lab_id int,
	name varchar(20),
	last_maintained_date DATE,
	last_maintained_time TIME,
	last_used_date DATE,
	last_used_time TIME
);

create table medicine(
	medicine_id int PRIMARY KEY,
	name varchar(30),
	mfd_date DATE,
	expiry_date DATE,
	ingredients varchar(20)
);
create table pharmacy(
	pharmacy_id int PRIMARY KEY,
	name varchar(30)
);
create table pharmaceutical_medicine(
	pharma_med_id int PRIMARY KEY,
	medicine_id int,
	pharmacy_id int
);
