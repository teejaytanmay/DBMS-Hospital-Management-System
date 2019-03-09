alter table patient
	add constraint pid_register FOREIGN KEY (patient_id) REFERENCES registration (patient_id);

alter table visit
	add constraint pid_visit FOREIGN KEY (patient_id) REFERENCES patient (patient_id);

alter table appointment
	add constraint vid_appointment FOREIGN KEY (visit_id) REFERENCES visit (visit_id) ON DELETE SET NULL,
	add constraint did_appointment FOREIGN KEY (doctor_id) REFERENCES doctor(doctor_id);

alter table consultation
	add constraint aid_consultation FOREIGN KEY (appointment_id) REFERENCES appointment (appointment_id) ON DELETE SET NULL;

alter table morgue
	add constraint pid_morgue FOREIGN KEY (patient_id) REFERENCES patient (patient_id);

alter table treatment
	add constraint pid_treatment FOREIGN KEY (patient_id) REFERENCES patient (patient_id),
	add constraint cid_teatment FOREIGN KEY (consultation_id) REFERENCES consultation (consultation_id);

alter table diagnostic_lab_visit
	add constraint dlid_diaglab FOREIGN KEY (diagnostic_lab_id) REFERENCES diagnostic_lab(diagnostic_lab_id) ON DELETE SET NULL,
	add constraint vid_diaglab FOREIGN KEY (visit_id) REFERENCES visit (visit_id) ON DELETE SET NULL;

alter table instrument
	add constraint dlid_instrument FOREIGN KEY (diagnostic_lab_id) REFERENCES diagnostic_lab (diagnostic_lab_id) ON DELETE SET NULL;
	
alter table pharmaceutical_medicine
	add constraint mid_medicine FOREIGN KEY (medicine_id) REFERENCES medicine (medicine_id) ON DELETE SET NULL,
	add constraint pid_pharmacy FOREIGN KEY (pharmacy_id) REFERENCES pharmacy (pharmacy_id) ON DELETE SET NULL;
