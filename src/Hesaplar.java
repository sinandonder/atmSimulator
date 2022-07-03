
public class Hesaplar {
    private int id;
    private double bakiye;
    
   
    public Hesaplar(){
        id = 0;
        bakiye = 100;
    }
    
    public Hesaplar(int id, double bakiye){
        if(id < 0 || id > 9)
        {
            System.out.println("Bu aralıkta bir id bulunmuyor veya oluşturulamaz.");
        }else
        {
            this.id = id;
            this.bakiye = bakiye;
        }
        
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    public double getBakiye(){
        return bakiye;
    }
    
    public void setBakiye(double bakiye){
       this.bakiye = bakiye;
    }
    public void paraCek(double miktar){
        if(miktar < 0 && miktar > bakiye)
            System.out.println("Girilen miktar bakiyeden büyük veya geçersiz.");
        else
            this.bakiye -= miktar;
        
    }
    public void paraYatir(double miktar){
        if(miktar < 0)
            System.out.println("Geçersiz miktar.");
        else
            this.bakiye += miktar;
    }
}
