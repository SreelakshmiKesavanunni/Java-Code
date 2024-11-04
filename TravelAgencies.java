public class Main{
 
    static int findAgencyWithHighestPrice(TravelAgencies[] agencies){
        int highest = agencies[0].price;
        for(int i = 0; i<agencies.length;i++)
        {
            if(agencies[i].price>highest){
                highest = agencies.length;
            }
        }
        return highest;
        
        
    }
    
    static TravelAgencies agencyDetailsForGivenIdAndInput(TravelAgencies[] agencies , int regNo , String packageType){
        for(int i =0 ; i<agencies.length; i++){
            if(agencies[i].regNo==regNo && agencies[i].packageType==packageType&&agencies[i].flightFacility==true){
                return agencies[i];
            }
        } return null;
        
        
    }
    public static void main(String[] args){
    TravelAgencies[] agencies = {null,null,null,null};
    agencies[0] = new TravelAgencies(123,"A2Z","platinum",5000,true);
    agencies[1] = new TravelAgencies(345,"sss","gold",3000,false);
    agencies[2] = new TravelAgencies(987,"cox","diamond",4000,true);
    agencies[3] = new TravelAgencies(888,"global","silver",2000,false);
    
    int price = findAgencyWithHighestPrice(agencies);
    System.out.println(price);
    
    TravelAgencies details = agencyDetailsForGivenIdAndInput(agencies , 987 ,"diamond");
    System.out.println(details.agencyName + ":"+ details.price);
    }
}

class TravelAgencies{
    int regNo;
    String agencyName;
    String packageType;
    int price;
    Boolean flightFacility;
    
    TravelAgencies(int regNo, String agencyName , String packageType, int price, Boolean flightFacility ){
        this.regNo= regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
        
    
    }
}