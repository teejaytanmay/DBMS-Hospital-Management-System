import java.io.*;
import java.util.Scanner;
// import DAO_Factory;
//STEP 1. Import required packages
import java.sql.*;

public class Main {
	public static void main(String[] args) {
		try{
      Scanner sc = new Scanner(System.in);

			DAO_Factory daoFactory = new DAO_Factory();

			daoFactory.activateConnection();

			TreatmentDAO tdao = daoFactory.getTreatmentDAO();
      ConsultationDAO cdao = daoFactory.getConsultationDAO();
      DiagnosticLabDAO dldao = daoFactory.getDiagnosticLabDAO();
      DiagnosticLabVisitDAO dlvdao = daoFactory.getDiagnosticLabVisitDAO();

      int choice;

      while (true){
        System.out.println("1 - To treat a patient");
        System.out.println("2 - To conduct a test");
				System.out.println("3 - To add a diagnostic lab to the hospital");
        System.out.println("Anything else - To exit");
        System.out.print("Choose: ");
        choice = sc.nextInt();
				System.out.println();

        if (choice==1) {
          int Tid, Cid, Aid, Pid;
          float Cost;
					String Med,Dos;
          System.out.print("Enter the Consultation ID: ");
					Cid = sc.nextInt();
					System.out.print("Enter the Appointment ID: ");
					Aid = sc.nextInt();
					System.out.print("Enter the Medication: ");
					Med = sc.next();
					System.out.print("Enter the Dosage: ");
          Dos = sc.next();
          Consultation c = new Consultation();
					c.setCid(Cid);
					c.setAid(Aid);
					c.setMed(Med);
					c.setDos(Dos);
					cdao.addConsultation(c);
					System.out.println();

					System.out.print("Enter the Treatment ID: ");
					Tid = sc.nextInt();
					System.out.print("Enter the Patient ID: ");
					Pid = sc.nextInt();
					System.out.print("Enter the Cost for Treatment: ");
					Cost = sc.nextInt();

					Treatment t = new Treatment();
					t.setTid(Tid);
					t.setPid(Pid);
					t.setCid(Cid);
					t.setCost(Cost);
					tdao.addTreatment(t);
					System.out.println();
        }

        else if (choice==2) {
          int DLVid;
          String Res;
          System.out.print("Enter the Diagnostic Lab Visit ID: ");
          DLVid = sc.nextInt();
					System.out.print("Enter the result for the test: ");
					Res = sc.next();
          DiagnosticLabVisit dlv = dlvdao.getDLabVisitById(DLVid);
					dlvdao.updateDLabVisitById(DLVid,Res);
					System.out.println();
        }

				else if (choice==3){
					int DLid;
					String name;
					System.out.print("Enter the Diagnostic Lab ID:");
					DLid = sc.nextInt();
					System.out.print("Enter the Name of the Diagnostic Lab:");
					name = sc.next();
					DiagnosticLab dl = new DiagnosticLab();
					dl.setDLid(DLid);
					dl.setName(name);
					dldao.addDLab(dl);
					System.out.println();
				}
        else{
          System.out.println("Exiting...");
          break;
        }
      }
			daoFactory.deactivateConnection();
		}catch(Exception e){
				//Handle errors for Class.forName
				e.printStackTrace();
		}
	}//end main
}//end FirstExample
