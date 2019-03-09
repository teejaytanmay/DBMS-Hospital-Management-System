import java.lang.*;
import java.sql.*;

public class DiagnosticLab
{
    String name;
    int DLid;
    public DiagnosticLab()
    {

    }
    public DiagnosticLab(int DLid, String name)
    {
        DLid = DLid;
        name = name;
    }
    void setName(String fn_Name)
    {
        name = fn_Name;
    }
    void setDLid(int fn_DLid)
    {
        DLid = fn_DLid;
    }

    int getDLid()
    {
        return DLid;
    }
    String getName()
    {
        return name;
    }

    void print()
    {
        System.out.println("Diagnostic Lab ID = " + DLid);
        System.out.println("Lab Name = " +  name);
    }
}
