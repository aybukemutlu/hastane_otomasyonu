/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastaneyonetimsistemi;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.FactoryProducer;
import AbstractFactoryPattern.Worker;
import ChainofResponsibilityPattern.BilgiIslemPersoneli;
import ChainofResponsibilityPattern.GuvenlikPersoneli;
import ChainofResponsibilityPattern.HospitalStaff;
import ChainofResponsibilityPattern.SaglikPersoneli;
import ChainofResponsibilityPattern.TemizlikPersoneli;
import ChainofResponsibilityPattern.VeriGirisPersoneli;
import ChainofResponsibilityPattern.İdariPersonel;
import Controller.BashekimController;
import Controller.HastaController;
import Controller.RandevuController;
import FacadePattern.ListMaker;
import Model.HastaModel;
import View.LoginGui;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author nurcan
 */
public class Main {

    public static void main(String[] args) throws IOException {

        HastaController hastakayit = new HastaController();
        BashekimController cc = new BashekimController();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        RandevuController randevu = new RandevuController();
        HastaModel model = new HastaModel();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGui().setVisible(true);
            }
        });

        /*CHAİN OF RESPONSİBİLİTY PATTERN*/
        HospitalStaff staff = new HospitalStaff(8, "14:20", "Diş polikliniği", "Ahmet YAPTIRMIŞ", "Bilgi İşlem Personeli");

        GuvenlikPersoneli guvenlik = new GuvenlikPersoneli();
        SaglikPersoneli saglik = new SaglikPersoneli();
        TemizlikPersoneli temizlik = new TemizlikPersoneli();
        VeriGirisPersoneli veriGiris = new VeriGirisPersoneli();
        İdariPersonel idari = new İdariPersonel();
        BilgiIslemPersoneli bilgi = new BilgiIslemPersoneli();

        guvenlik.SetNextApprover(saglik);
        saglik.SetNextApprover(temizlik);
        temizlik.SetNextApprover(veriGiris);
        veriGiris.SetNextApprover(idari);
        idari.SetNextApprover(bilgi);

        guvenlik.ProcessRequest(staff);
        saglik.ProcessRequest(staff);
        temizlik.ProcessRequest(staff);
        veriGiris.ProcessRequest(staff);
        idari.ProcessRequest(staff);
        bilgi.ProcessRequest(staff);


        /*       FACADE PATTERNN    */
         ListMaker listmaker = new ListMaker();
         listmaker.ListHademe();
         System.out.println("\n\n");
         listmaker.ListHemsire(); 
        
        System.out.println("\n\n\n");

        /**
         * ** ABSTRACT FACTORY PATTERN ****
         */
        AbstractFactory workerFactory = FactoryProducer.getFactory(false);

        Worker worker1 = workerFactory.getWorker("BAŞHEKİM");
        worker1.works();

        System.out.println("\n");

        Worker worker2 = workerFactory.getWorker("HEMŞİRE");
        worker2.works();

        System.out.println("\n");

        Worker worker3 = workerFactory.getWorker("RESEPSİYONİST");
        worker3.works();

        System.out.println("\n \n");

        String istenen;
        Scanner klavye = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Lütfen ne yapmak istediğinizi seçiniz:");
            System.out.println("giris, hastakayit, bashekim\n");

            istenen = klavye.next();
            switch (istenen) {
                case "giris":
                    System.out.println("TC nizi giriniz:");
                    String tc = br.readLine();

                    System.out.println("Şifrenizi giriniz:");
                    String sifre = br.readLine();
                    model.getKontrol(tc, sifre);

                    System.out.println("Randevu oluşturunuz..");
                    System.out.println("Doktor adını giriniz:");
                    String doktoradirandevu = br.readLine();

                    System.out.println("Poliklinik adını giriniz");
                    String poliklinikadirandevu = br.readLine();

                    System.out.println("Randevu saatini giriniz:");
                    String randevusaati = br.readLine();

                    randevu.create(doktoradirandevu, poliklinikadirandevu, randevusaati);

                    break;

                case "hastakayit":
                    System.out.println("Sisteme kayit olunuz");
                    System.out.println("Sıra no :");
                    int hastaid = Integer.valueOf(br.readLine());

                    System.out.println("Tc nizi giriniz");
                    String hastaTc = br.readLine();

                    System.out.println("Adinizi giriniz");
                    String hastaAdi = br.readLine();

                    System.out.println("Sifre giriniz");
                    String hastasifre = br.readLine();

                    hastakayit.create(hastaid, hastaTc, hastaAdi, hastasifre);
                    break;

                case "bashekim":
                    System.out.println("Doktor sırasını giriniz:");
                    int id = Integer.valueOf(br.readLine());

                    System.out.println("Poliklinik adını giriniz");
                    String tmp = br.readLine();

                    System.out.println("Doktor adını giriniz");
                    String tmp2 = br.readLine();

                    cc.create(id, tmp, tmp2);
                    System.out.println(cc.getList());
                    break;

                default:
                    System.out.println("dogru girdiğinize emin olunuz");
                    break;
            }

        }

    }
}
