import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class DiagnosticLabDAO_JDBC implements DiagnosticLabDAO
{
    Connection dbConnection;
	public DiagnosticLabDAO_JDBC(Connection dbconn)
    {
		dbConnection = dbconn;
	}

	@Override
  public void addDLab(DiagnosticLab d)
    {
		PreparedStatement preparedStatement = null;
		String sql;
		sql = "insert into diagnostic_lab(diagnostic_lab_id, name) values (?,?)";

		try
        {
			preparedStatement = dbConnection.prepareStatement(sql);

			preparedStatement.setInt(1, d.getDLid());
			preparedStatement.setString(2, d.getName());

			preparedStatement.executeUpdate();

			System.out.println("Diagnostic Lab: Id " + d.getDLid()
				+ ", added to the database");
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
