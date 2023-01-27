package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		
		System.out.println("------곰------");
		Bear bear=new Bear();
		System.out.println("눈 : "+bear.getEye()+"개");
		System.out.println("다리 : "+bear.getLeg()+"개");
		System.out.println("특징 : "+bear.woong);
		System.out.println("------사자------");
		Lion lion=new Lion();
		System.out.println("눈 : "+lion.getEye()+"개");
		System.out.println("다리 : "+lion.getLeg()+"개");
		System.out.println("특징 : "+lion.galgi);
		System.out.println("------거미------");
		Spider spider=new Spider();
		System.out.println("눈 : "+spider.getEye()+"개");
		System.out.println("다리 : "+spider.getLeg()+"개");
		System.out.println("특징 : "+spider.web);

	}

}
