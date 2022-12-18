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
public class SaglikPersoneli extends Employee{

    @Override
    public void ProcessRequest(HospitalStaff req) {
         if(req.positionToBeApproved.equals("Sağlık Personeli"))
        {
            System.out.println("Sağlık Personelindesiniz " );
            
        }else if (NextApprover != null)
        {
            System.out.println("Sağlık Personelindesiniz Randevunuzun onaylanması için Bilgi İşlem personeline yönlendiriliyorsunz.");
 
        }   }

    
}
