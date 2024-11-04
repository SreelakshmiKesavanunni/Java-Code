import java.util.*;
public class Solution{
    
    static int findPriceForGivenBrand(Phone[] phone , String brand){
        int sumPrice = 0;
        for(int i=0;i<phone.length;i++){
            if(phone[i].brand.equals(brand)){
                sumPrice += phone[i].price;
            }
            
        }
        if(sumPrice==0){
            return 0;
        }
        else{
             return(sumPrice);
        }
        
        
    }
    
    static Phone getPhoneIdBasedOnOs(Phone[] phone, String os){
        for(int i=0;i<phone.length;i++){
            // System.out.println(phone[i].os);
            if(phone[i].os.equals(os) &&phone[i].price>=5000){
                return phone[i];
            }
        }
        return null;
        
    }
    public static void main(String[] args){
        
       Phone[] phone = new Phone[3];
       Scanner sc = new Scanner(System.in);
       int phoneId;
       String os;
       String brand;
       int price;
       for (int i =0;i<phone.length;i++){
           phoneId = sc.nextInt();
           sc.nextLine();
           os = sc.nextLine();
           brand = sc.nextLine();
           price = sc.nextInt();
           sc.nextLine();
           phone[i]=new Phone(phoneId,os,brand,price);
           System.out.println("Objects created.....");
       }
        String brand1 = sc.nextLine();
        String os1 = sc.nextLine();
        int sumPrice = findPriceForGivenBrand(phone,brand1);
        if(sumPrice!=0){
        System.out.println(sumPrice);
        }
        else{
            System.out.println("The given brand is not available.....");
        }
        
        Phone phone1 = getPhoneIdBasedOnOs(phone,os1);
        // System.out.println(id);
        if(phone1!=null){
            System.out.printf("%d %s %s %d ", phone1.phoneId , phone1.os,phone1.brand,phone1.price);
        }
        else{
        System.out.println("no phones are available...");
        }
        
    }
}

class Phone{
    int phoneId;
    String os;
    String brand;
    int price;
    
    Phone(int phoneId , String os , String brand , int price){
        this.phoneId = phoneId;
        this.os = os;
        this.brand= brand;
        this.price = price;
        
        
    }
}