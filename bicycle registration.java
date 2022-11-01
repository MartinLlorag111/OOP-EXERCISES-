class BicycleRestration{
	public static void main(String[] args){

		Bicycle bikeone,biketwo;
		Bicycle bike1, bike2,bike3;
		String owner1, owner2, owner3;
		String tag1, tag2,tag3;

		bike1 = new Bicycle ();
		bike1.setOwnerName("CoCo");

		bike2 = new Bicycle ();
		bike2.setOwnerName("Martin");
		
		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		
		bikeone = new Bicycle();
		bikeone.setTagNo("2004-134R");
		biketwo= new Bicycle();
		biketwo.setTagNo("2004-135R");

		tag1= bikeone.getTagNo();
		tag2=biketwo.getTagNo();

		System.out.println(owner1 + " owns a bicycle with the \n tagNo:"+tag1);
		System.out.println(owner2 + " also own bicycle too with the \n tagNo.:"+ tag2);
		

	}
}
