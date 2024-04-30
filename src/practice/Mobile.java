package practice;

public class Mobile {
    String brand;
    String model;
    int price;
    String color;
    public Mobile(String b,String m, int i, String c){
        brand = b;
        model = m;
        price = i;
        color = c;
    }
    public void details() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		System.out.println(color);
	}

    public static void main(String[] args) {
    	Mobile m1 = new Mobile("samsung" , "m1" , 10000 , "black");
    	m1.details();
    	
    }
    }
    

