package inheritance;

public class Planet extends AstronomicalObject {
    
	private String location;
	private String light;

    public Planet(String name1, String location1, String light1, int size1, int weight1)	

    {
	super(name1, size1, weight1);
	location = location1;
	light = light1;
    
    }
    
    public void setNAME(String name1){
        name = name1;
        
    }
    
    public void setLOCATION(String location1){
        location = location1;
        
    }
    
    public void setLIGHT(String light1){
        light = light1;
        
    }
    
    public void setSIZE(int size1){
        size = size1;
        
    }
    
    public void setWEIGHT(int weight1){
        weight = weight1;
        
    }
    
    public String getNAME(){
        return name;
        
    }
    
    public String getLOCATION(){
        return location;
        
    }
    
    public String getLIGHT(){
        return light;
        
    }
    
    public int getSIZE(){
        return size;
        
    }
    
    public int getWEIGHT(){
        return weight;
        
    }
    
    public String toString()
    
    {
    	
        return "NAME: " +  name  + "" + " LOCATION: "+ location + " LIGHT: " + light + "" + " SIZE: " + size + "" + " WEIGHT: " + weight;
    
    }
    
}
