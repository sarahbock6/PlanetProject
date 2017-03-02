package inheritance;

public class PlanetShelf {

    public static void main(String[] args) {
        Planet p1 = new Planet("Jupiter" , "Far" , "Dim" , 1532 , 10000);
        Planet p2 = new Planet("Saturn" , "Close", "Super Bright" , 623 , 10321);
        Planet p3 = new Planet("Sun" , "Super Far" , "Bright" , 1354 , 14322);
        Planet p4 = new Planet("Uranus", "Medium" , "Dark" , 1000 , 12456);
        
        System.out.println(" Planet 1 " + p1);
        System.out.println(" Planet 2 " + p2 );
        System.out.println(" Planet 3 " + p3);
        System.out.println(" Planet 4 " + p4);
        
        Star s1 = new Star("Big Dipper" , "Far" , "Dim" , 1532 , 10000);
        Star s2 = new Star("Little Dipper" , "Close" , "Super Bright" , 623 , 10321);
        Star s3 = new Star("Taurus" , "Super Far" , "Bright" , 1354 , 14322);
        Star s4 = new Star("Libra", "Medium" , "Dark" , 1000 , 12456);
        
        System.out.println(" Star 1 " + s1);
        System.out.println(" Star 2 " + s2 );
        System.out.println(" Star 3 " + s3);
        System.out.println(" Star 4 " + s4);
        
        Moon m1 = new Moon("Full Moon" ,"Far" , "Dim" , 1532 , 10000);
        Moon m2 = new Moon("Waxing Crescent" , "Close" , "Super Bright" , 623 , 10321);
        Moon m3 = new Moon("Quarter Moon" , "Super Far" , "Bright" , 1354 , 14322);
        Moon m4 = new Moon("Gibbous", "Medium" , "Dark" , 1000 , 12456);
        
        System.out.println(" Moon 1 " + m1);
        System.out.println(" Moon 2 " + m2 );
        System.out.println(" Moon 3 " + m3);
        System.out.println(" Moon 4 " + m4);
        
        Astroid a1 = new Astroid("Pallas" ,"Far" , "Dark" , 1532 , 10000);
        Astroid a2 = new Astroid("Ceres" , "Close" , "Dark" , 623 , 10321);
        Astroid a3 = new Astroid("Vesta" , "Super Far" , "Dark" , 1354 , 14322);
        Astroid a4 = new Astroid("Hygiea" , "Medium" , "Dark" , 1000 , 12456);
        
        System.out.println(" Astroid 1 " + a1);
        System.out.println(" Astroid 2 " + a2 );
        System.out.println(" Astroid 3 " + a3);
        System.out.println(" Astroid 4 " + a4);
		
    }
    
}