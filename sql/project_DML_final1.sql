
insert into registration(patient_id, date_of_registration, time_of_registration) values
(1, '1999-01-02', '10:00:00'),
(2, '1999-01-02', '10:00:00');

insert into patient(patient_id,name,sex,pno,address,bdate,email,med_hist) values
(1,'Shreyas','M',"123",'Hyderabad','1998-01-01','shreyas.gupta@gmail.com','Diarrhoea'),
(2,'Tejas','M',"456",'Mumbai','1998-02-02','tejas@gmail.com','Fever');

insert into doctor(doctor_id,name,sex,qualification, specialization, consultation_charge) values
(1,'Varada','M','MBBS, MD','Anesthesia',100000),
(2,'Tanmay','M','MBBS, MS','Fever',500000);

insert into visit(visit_id, patient_id) values
(1, 1),
(2, 2);

insert into appointment(appointment_id, visit_id, doctor_id, appointment_date, appointment_time) values
(1, 1, 1, '1999-01-02', '11:00:00'),
(2, 2, 2, '1999-01-02', '12:00:00');

insert into consultation(consultation_id,appointment_id,medication,dosage) values
(1,1,'Diarrhoea Meds','500mg');

insert into morgue(body_id, patient_id) values
(1, 1);

insert into treatment(treatment_id,patient_id,consultation_id,cost) values
(1,1,1,1000);

insert into diagnostic_lab(diagnostic_lab_id, name) values
(1,'Apollo');

insert into instrument(instrument_id, diagnostic_lab_id, name, last_maintained_date, last_maintained_time,last_used_date,last_used_time) values
(1, 1, 'Blood Tester', '2018-11-11', '13:00:00','2018-11-25','19:00:00');

insert into diagnostic_lab_visit(diagnostic_lab_visit_id, diagnostic_lab_id, visit_id,result, test, cost) values
(1,1,1,'Normal','Diarrhoea',200);

insert into medicine(medicine_id, name, ingredients, mfd_date, expiry_date) values
(1, 'crocin', 'anasthesia', '2017-01-01', '2019-01-01');

insert into pharmacy(pharmacy_id, name) values
(1, 'capz and tabz');

insert into pharmaceutical_medicine(pharma_med_id,medicine_id, pharmacy_id) values
(1, 1, 1);
