public class exersizefifteen {
	public static void main(String[] args){
		System.out.println(sphereVolume(2.0));//calls method with radius of two
	}
	public static double sphereVolume(double radius){
		//return 4/3 * Math.PI * (radius*3);
		double volume = 4.0/3 * Math.PI * Math.pow(radius, 3); //calulates volume
		return volume; //returns volume
		
	}

}
		
