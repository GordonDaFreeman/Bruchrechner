package rechnen;

public class Bruch {
	int nenner;
	int z�hler;
	
	public Bruch(int z, int n){
		z�hler = z;
		nenner = n;
	}
	
	public Bruch k�rze(){
		int temp;
		int z = this.z�hler;
		int n = this.nenner;
		do{
			temp = z%n;
			z = n;
			n = temp;
		}while(temp != 0);
		return new Bruch(this.z�hler/z,this.nenner/z);
	}
	
	public static void main(String[] args){
	}
	
	public static Bruch multipliziere(Bruch b1, Bruch b2){
		Bruch res;
		int nRes,zRes;
		nRes = b1.nenner * b2.nenner;
		zRes = b1.z�hler * b2.z�hler;
		res = new Bruch(zRes,nRes);
		return res;
	}
	
	public static Bruch teilen(Bruch b1, Bruch b2){
		Bruch res;
		int nRes,zRes;
		nRes = b1.nenner * b2.z�hler;
		zRes = b1.z�hler * b2.nenner;
		res = new Bruch(zRes,nRes);
		return res;
	}
	
	public static Bruch addiere(Bruch b1, Bruch b2){
		b1 = b1.k�rze();
		b2 = b2.k�rze();
		int z1,z2,n1,n2;
		z1 = b1.z�hler* b2.nenner;
		n1 = b1.nenner* b2.nenner;
		z2 = b2.z�hler* b1.nenner;
		n2 = b2.nenner* b1.nenner;
		return new Bruch(z1+z2,n1);
		
	}
}
