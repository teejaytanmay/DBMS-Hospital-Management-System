import java.lang.*;
import java.sql.*;

public class Consultation
{
    String medication, dosage;
    int appointment_id, consultation_id;
    public Consultation()
    {

    }
    public Consultation(int consultation_id, int appointment_id, String medication, String dosage)
    {
        appointment_id = appointment_id;
        consultation_id = consultation_id;
        medication = medication;
        dosage = dosage;
    }
    void setAid(int fn_Aid)
    {
        appointment_id = fn_Aid;
    }
    void setMed(String fn_med)
    {
        medication = fn_med;
    }
    void setDos(String fn_Dos)
    {
        dosage = fn_Dos;
    }
    void setCid(int fn_Cid)
    {
        consultation_id = fn_Cid;
    }

    int getAid()
    {
        return appointment_id;
    }
    int getCid()
    {
        return consultation_id;
    }
    String getMed()
    {
        return medication;
    }
    String getDos()
    {
        return dosage;
    }
    void print()
    {
        System.out.println("Appointment ID = " + appointment_id);
        System.out.println("Consultation ID = " +  consultation_id);
        System.out.println("Medication = " + medication);
        System.out.println("Dosage = " + dosage);
    }
}
