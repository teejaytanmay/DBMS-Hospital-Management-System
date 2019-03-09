import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class DiagnosticLabVisitDAO_JDBC implements DiagnosticLabVisitDAO
{
    Connection dbConnection;
	public DiagnosticLabVisitDAO_JDBC(Connection dbconn)
    {
		dbConnection = dbconn;
	}

  @Override
	public DiagnosticLabVisit getDLabVisitById(int id)
    {
		DiagnosticLabVisit dl = new DiagnosticLabVisit();
		PreparedStatement preparedStatement = null;
    ResultSet rs = null;
		try
        {
			preparedStatement = dbConnection.prepareStatement("select diagnostic_lab_visit_id, diagnostic_lab_id, visit_id, result, test, cost from diagnostic_lab_visit where diagnostic_lab_visit_id = (?)");
            preparedStatement.setInt(1,id);
			rs = preparedStatement.executeQuery();

			//STEP 5: Extract data from result set
			while(rs.next())
            {
				//Retrieve by column name
				int dLabVisitId  = rs.getInt("diagnostic_lab_visit_id");
				int Vid = rs.getInt("visit_id");
        int dLabId = rs.getInt("diagnostic_lab_id");
        String res= rs.getString("result");
        String test = rs.getString("test");
        float cost = rs.getFloat("cost");
				dl.setDLVid(dLabVisitId);
				dl.setVid(Vid);
        dl.setDLid(dLabId);
        dl.setRes(res);
        dl.setTest(test);
        dl.setCost(cost);
				break;
				// Add exception handling here if more than one row is returned
			}
		}
        catch (SQLException ex)
        {
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
        finally
        {
            try
            {
                if (rs != null)
                {
                    rs.close();
                }
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }
            try
            {
                if (preparedStatement != null)
                {
                    preparedStatement.close();
                }
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }
        }
        return dl;
	}

	@Override
  public void updateDLabVisitById(int id, String Res)
    {
		PreparedStatement preparedStatement = null;
		String sql;
		sql = "update diagnostic_lab_visit set result = (?)";

		try
        {
			preparedStatement = dbConnection.prepareStatement(sql);

			preparedStatement.setString(1, Res);
			preparedStatement.executeUpdate();

			System.out.println("Diagnostic Lab Visit: Id " + id
				+ ", updated in the database");
		}
        catch (SQLException e)
        {
 			System.out.println(e.getMessage());
 		}
		try
        {
			if (preparedStatement != null)
            {
				preparedStatement.close();
			}
		}
        catch (SQLException e)
        {
 			System.out.println(e.getMessage());
 		}
	}
}
