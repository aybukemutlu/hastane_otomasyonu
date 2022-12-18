/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainofResponsibilityPattern;

public class HospitalStaff
{
     public int patientId;
     public String appointmentTime;
     public String polyclinicName;
     public String doctorName;
     public String positionToBeApproved;

    
     
    
    //hasta randevu aldığı zaman onaylanması için başhakemine gitmesi gerekiyor.

    public HospitalStaff(int patientId, String appointmentTime, String polyclinicName, String doctorName, String positionToBeApproved) {
        this.patientId = patientId;
        this.appointmentTime = appointmentTime;
        this.polyclinicName = polyclinicName;
        this.doctorName = doctorName;
        this.positionToBeApproved = positionToBeApproved;
    }

     
}
