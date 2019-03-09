import java.lang.*;
import java.sql.*;

public class DiagnosticLabVisit
{
    int dLabId, dLabVisitId, Vid;
    String result, test;
    float cost;
    public DiagnosticLabVisit()
    {

    }
    public DiagnosticLabVisit(int dLabId, int dLabVisitId, int Vid, String result, String test, float cost)
    {
        dLabId = dLabId;
        dLabVisitId = dLabVisitId;
        Vid = Vid;
        result = result;
        test = test;
        cost = cost;
    }
    void setCost(float fn_cost)
    {
        cost = fn_cost;
    }
    void setDLVid(int fn_DLVid)
    {
        dLabVisitId = fn_DLVid;
    }
    void setDLid(int fn_DLid)
    {
        dLabId = fn_DLid;
    }
    void setVid(int fn_Vid)
    {
        Vid = fn_Vid;
    }
    void setRes(String fn_Res)
    {
        result = fn_Res;
    }
    void setTest(String fn_Test)
    {
        test = fn_Test;
    }

    int getDLVId()
    {
        return dLabVisitId;
    }
    int getDLid()
    {
        return dLabId;
    }
    int getVid()
    {
        return Vid;
    }
    float getCost()
    {
        return cost;
    }
    String getRes()
    {
        return result;
    }
    String getTest()
    {
        return test;
    }
    void print()
    {
        System.out.println("Diagnostic Lab Visit ID = " + dLabVisitId);
        System.out.println("Diagnostic Lab ID = " +  dLabId);
        System.out.println("Visit ID = " + Vid);
        System.out.println("Result = " + result);
        System.out.println("Test = " + test);
        System.out.println("Cost = " + cost);
    }
}
