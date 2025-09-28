public class TowerOfHonoi {
    public static void towOfHonoi(int n, String s, String d, String h){
        if(n<=0){
            return;
        }
        else{
             towOfHonoi(n-1, s, h,d);
             System.out.println("Disk " + n + " moved from " + s + " to " + d);
             towOfHonoi(n-1, h, d,s);
        }
    }

    public static void main(String args[]){
        TowerOfHonoi toh = new TowerOfHonoi();
        toh.towOfHonoi(3, "Source"," Destination", "Helper");
    }
}
