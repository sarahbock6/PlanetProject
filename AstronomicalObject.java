package inheritance;
public class AstronomicalObject {
    String name;
    int size;
    int weight;
	
  
	public void Astronomical(String inname, int insize, int inweight){
        name = inname;
        size = insize;
        weight = inweight;

    }
    public void setNAME(String namein){
        name = namein;
    }
    public void setSIZE(int sizein){
        size = sizein;
    }
    public void setWEIGHT(int weightin){
        weight = weightin;
    }
    public String getNAME(){
        return name;
    }
    public int getSIZE(){
        return size;
    }
    public int getWEIGHT(){
        return weight;
    }
    public String toString()
    {
        return "NAME: " + name + "" + "" + " SIZE: " + size + "" + " WEIGHT: " + weight;
        
      
    }
}