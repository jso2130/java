package com.office.inheri;

import java.security.PublicKey;

import com.office.inheri.restraurant.ChildRestaurant;
import com.office.inheri.restraurant.ParentRestaurant;

public class MainClass {

	public static void main(String[] args) {

//		ParentRestaurant parentRestaurant = new ParentRestaurant();
//		parentRestaurant.makeJajang();
//		parentRestaurant.makeJjamppong();
		
		ChildRestaurant childRestaurant = new ChildRestaurant();
		childRestaurant.makeJajang(ChildRestaurant.CHILD_MENU);     // true = 아들꺼, false = 아빠꺼
		childRestaurant.makeJjamppong();
		childRestaurant.makeBokkeumbap();
		
	}

}
