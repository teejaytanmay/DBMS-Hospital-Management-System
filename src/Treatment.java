import java.lang.*;
import java.sql.*;

public class Treatment
{
    float cost;
    int treatment_id, patient_id, consultation_id;
    public Treatment()
    {

    }
    public Treatment(float cost, int treatment_id, int patient_id, int consultation_id)
    {
        cost = cost;
        treatment_id = treatment_id;
        patient_id = patient_id;
        consultation_id = consultation_id;
    }
    void setCost(float fn_cost)
    {
        cost = fn_cost;
    }
    void setTid(int fn_Tid)
    {
        treatment_id = fn_Tid;
    }
    void setPid(int fn_Pid)
    {
        patient_id = fn_Pid;
    }
    void setCid(int fn_Cid)
    {
        consultation_id = fn_Cid;
    }

    int getTid()
    {
        return treatment_id;
    }
    int getCid()
    {
        return consultation_id;
    }
    int getPid()
    {
        return patient_id;
    }
    float getCost()
    {
        return cost;
    }
    void print()
    {
        System.out.println("Treatment ID = " + treatment_id);
        System.out.println("Consultation ID = " +  consultation_id);
        System.out.println("Patient ID = " + patient_id);
        System.out.println("Cost = " + cost);
    }
}
