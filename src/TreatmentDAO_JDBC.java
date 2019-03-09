import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class TreatmentDAO_JDBC implements TreatmentDAO
{
    Connection dbConnection;
	public TreatmentDAO_JDBC(Connection dbconn)
    {
		dbConnection = dbconn;
	}

	@Override
  public void addTreatment(Treatment t)
    {
		PreparedStatement preparedStatement = null;
		String sql;
		sql = "insert into treatment(treatment_id, patient_id, consultation_id, cost) values (?,?,?,?)";

		try
        {
			preparedStatement = dbConnection.prepareStatement(sql);

			preparedStatement.setInt(1, t.getTid());
			preparedStatement.setInt(2, t.getPid());
			preparedStatement.setInt(3, t.getCid());
			preparedStatement.setFloat(4, t.getCost());

			preparedStatement.executeUpdate();

			System.out.println("Treatment: Id " + t.getTid()
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
