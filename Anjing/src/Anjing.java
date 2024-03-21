/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Anjing {

    private String Jenis;
    private String Ukuran;
    private int BeratBadan;
    private int Umur;

    public Anjing(String Jenis, String Ukuran, int BeratBadan, int Umur) 
    {   this.Jenis = Jenis;
        this.Ukuran = Ukuran;
        this.BeratBadan = BeratBadan;
        this.Umur = Umur;   
    }

    public void Menggonggong() 
    {   if (Jenis.equals("Alaskan Malamute")) 
        {System.out.println("Grouck! Grouck!");} 
        else 
        {System.out.println("Ouck! Ouck!");}
    }

    public void Bermain() 
    {System.out.println("Anjing sedang asik bermain!");}

    public void Tidur() 
    {System.out.println("Anjing sedang tidur dengan nyaman (^o^)");}

    public void TampilkanInfo()
    {   System.out.println("Jenis : " + Jenis);
        System.out.println("Ukuran : " + Ukuran);
        System.out.println("Berat Badan : " + BeratBadan + " kg");
        System.out.println("Umur : " + Umur + " tahun");
    }

    public static void main(String[] args) 
    {   Anjing anjing1 = new Anjing("Alaskan Malamute", "Besar", 35, 3);
        Anjing anjing2 = new Anjing("Pomeranian", "Kecil", 3, 1);
  
        anjing1.TampilkanInfo();
        anjing1.Menggonggong();
        anjing1.Bermain();
        anjing1.Tidur();

        System.out.println();

        anjing2.TampilkanInfo();
        anjing2.Menggonggong();
        anjing2.Bermain();
        anjing2.Tidur();
    }
}

