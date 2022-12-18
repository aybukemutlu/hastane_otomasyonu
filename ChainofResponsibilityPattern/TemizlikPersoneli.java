/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainofResponsibilityPattern;

/**
 *
 * @author nurcan
 */
public class TemizlikPersoneli extends Employee{

    @Override
    public void ProcessRequest(HospitalStaff req) { if(req.positionToBeApproved.equals("Temizlik Personeli"))
        {
            System.out.println("Temizlik Personelindesiniz." );
            
        }else if (NextApprover != null)
        {
            System.out.println("Temizlik Personelindesiniz Randevunuzun onaylanması için Bilgi İşlem personeline yönlendiriliyorsunz.");
 
        }}

}
