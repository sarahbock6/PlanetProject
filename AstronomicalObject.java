package inheritance;

public class AstronomicalObject {
		
		String name;
		int size;
		int weight;

		public AstronomicalObject(String name1, int size1, int weight1){

		super();	
		name = name1;
		size = size1;
		weight = weight1;

	}

	public void setNAME(String name1){
		name = name1;
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
