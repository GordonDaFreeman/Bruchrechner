package rechnen;

public class Bruch {
	int nenner;
	int zähler;
	
	public Bruch(int z, int n){
		zähler = z;
		nenner = n;
	}
	
	public Bruch kürze(){
		int temp;
		int z = this.zähler;
		int n = this.nenner;
		do{
			temp = z%n;
			z = n;
			n = temp;
		}while(temp != 0);
		return new Bruch(this.zähler/z,this.nenner/z);
	}
	
	public static void main(String[] args){
	}
	
	public static Bruch multipliziere(Bruch b1, Bruch b2){
		Bruch res;
		int nRes,zRes;
		nRes = b1.nenner * b2.nenner;
		zRes = b1.zähler * b2.zähler;
		res = new Bruch(zRes,nRes);
		return res;
	}
	
	public static Bruch teilen(Bruch b1, Bruch b2){
		Bruch res;
		int nRes,zRes;
		nRes = b1.nenner * b2.zähler;
		zRes = b1.zähler * b2.nenner;
		res = new Bruch(zRes,nRes);
		return res;
	}
	
	public static Bruch addiere(Bruch b1, Bruch b2){
		b1 = b1.kürze();
		b2 = b2.kürze();
		int z1,z2,n1,n2;
		z1 = b1.zähler* b2.nenner;
		n1 = b1.nenner* b2.nenner;
		z2 = b2.zähler* b1.nenner;
		n2 = b2.nenner* b1.nenner;
		return new Bruch(z1+z2,n1);
		
	}
}
