/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainofResponsibilityPattern;

public abstract class Employee {
    
    protected Employee NextApprover;
 
    public void SetNextApprover(Employee supervisor)
    {
        this.NextApprover = supervisor;
    }
 
    public abstract void ProcessRequest(HospitalStaff req);
    
}
