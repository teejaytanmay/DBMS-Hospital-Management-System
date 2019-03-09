import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class ConsultationDAO_JDBC implements ConsultationDAO
{
    Connection dbConnection;
	public ConsultationDAO_JDBC(Connection dbconn)
    {
		dbConnection = dbconn;
	}

	@Override
  public void addConsultation(Consultation c)
    {
		PreparedStatement preparedStatement = null;
		String sql;
		sql = "insert into consultation(consultation_id, appointment_id, medication, dosage) values (?,?,?,?)";

		try
        {
			preparedStatement = dbConnection.prepareStatement(sql);

			preparedStatement.setInt(1, c.getCid());
			preparedStatement.setInt(2, c.getAid());
			preparedStatement.setString(3, c.getMed());
			preparedStatement.setString(4, c.getDos());

			preparedStatement.executeUpdate();

			System.out.println("Consultation: Id " + c.getCid()
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
