import java.lang.*;
import java.util.List;

public interface DiagnosticLabVisitDAO
{
	public void updateDLabVisitById(int id, String Res);
  public DiagnosticLabVisit getDLabVisitById(int id);
	// public void addPatient(Patient patient);
	//public void updatePatient(Patient patient);
}
