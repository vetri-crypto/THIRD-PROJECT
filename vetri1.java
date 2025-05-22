package beginner_java;
import java.util.Scanner;
public class vetri1 {

	public static void main(String[] args) {
		Scanner bat=new Scanner(System.in);
		System.out.println("\t\t\tSEARCH");
		System.out.println("");
		System.out.println("CURRENT STOCKS MOBILE:");
		System.out.println("1.APPLE\n2.SAMSUNG\n3.VIVO\n4.ONEPLUS\n5.GOOGLE PIXEL");
        String a=bat.nextLine();
		System.out.println("");
		if(a.equals("apple")||a.equals("APPLE")||a.equals("Apple")) {
			System.out.println("ABOUT PHONE");
			System.out.println("");
			System.out.println("MODEL:IPHONE 14");
			System.out.println("PROCESSOR:A15 BIONIC CHIP,6 CORE");
			System.out.println("RAM:8GB");
			System.out.println("STORAGE:128GB");
			System.out.println("REAR CAMERA:12MP+12MP");
			System.out.println("FRONT CAMERA:12MP");
			System.out.println("DISPLAY:6.1 inch SUPER RETINA XDR DISPLAY");
			System.out.println("NETWORK TYPE:5G,4G,3G,2G");
			System.out.println("AMOUNT:54,999");
			System.out.println("BATTERY:3279mAh");
			System.out.println("");
			System.out.println("Cash on delievery:");
			String b=bat.nextLine();
			if(b.equals("ok")||b.equals("OK")||b.equals("yes")||b.equals("YES")) {
				System.out.println("pay amount:");
				System.out.println("Mobile amount:54,999");
				int amount=bat.nextInt();
				if(amount==54999) {
					System.out.println("Thank you for purchase!");
				}
				else if(amount>54999) {
					int balance=amount-54999;
					System.out.println("Purchased!");
					System.out.println("Extra amount:"+balance);
				}
				else {
					int balance=54999-amount;
					System.out.println("Not purchase:");
					System.out.println("Balance amount:"+balance);
				}
			}
			else {
				System.out.println("Online payment:");
				System.out.println("Mobile amount:54,999");
				int amount=bat.nextInt();
				if(amount==54999) {
					System.out.println("Thank you for purchase!");
				}
				else if(amount>54999) {
					int balance=amount-54999;
					System.out.println("Purchased!");
					System.out.println("Extra amount:"+balance);
				}
				else {
					System.out.println("Order is not palced!");
					int balance=54999-amount;
					System.out.println("Must pay your balance amount for your order:"+balance);
				}
			}
			
		}
		else if(a.equals("Samsung")||a.equals("SAMSUNG")||a.equals("samsung")) {
			System.out.println("ABOUT PHONE");
			System.out.println("");
			System.out.println("MODEL:GALAXY S25 ULTRA");
			System.out.println("PROCESSOR:8 ELITE FOR GALAXY|OCTA CORE");
			System.out.println("RAM:12GB");
			System.out.println("STORAGE:256GB");
			System.out.println("REAR CAMERA:200MP+100MP+100MP+50MP");
			System.out.println("FRONT CAMERA:12MP");
			System.out.println("NETWORK TYPE:5G,4G,3G,2G");
			System.out.println("BATTERY:5000mAh");
			System.out.println("AMOUNT:1,29,999");
			System.out.println("");
			System.out.println("Cash on delievery:");
			String b=bat.nextLine();
			if(b.equals("ok")||b.equals("OK")||b.equals("yes")||b.equals("YES")) {
				System.out.println("pay amount:");
				System.out.println("Mobile amount:1,29,999");
				int amount=bat.nextInt();
				if(amount==129999) {
					System.out.println("Thank you for purchase!");
				}
				else if(amount>129999) {
					int balance=amount-129999;
					System.out.println("Purchased!");
					System.out.println("Extra amount:"+balance);
				}
				else {
					int balance=129999-amount;
					System.out.println("Not purchase:");
					System.out.println("Balance amount:"+balance);
				}
			}
			else {
				System.out.print("Online payment:");
				System.out.println("Mobile amount:1,29,999");
				int amount=bat.nextInt();
				if(amount==129999) {
					System.out.println("Thank you for purchase!");
				}
				else if(amount>129999) {
					int balance=amount-129999;
					System.out.println("Purchased!");
					System.out.println("Extra amount:"+balance);
				}
				else {
					System.out.println("Order is not palced!");
					int balance=129999-amount;
					System.out.println("Must pay your balance amount for your order:"+balance);
				}
			}
	}
		else if(a.equals("Vivo")||a.equals("VIVO")||a.equals("vivo")) {
			System.out.println("ABOUT PHONE");
			System.out.println("");
			System.out.println("MODEL:X200 PRO");
			System.out.println("PROCESSOR:DIMENSITY 9400");
			System.out.println("RAM:16GB");
			System.out.println("STORAGE:512GB");
			System.out.println("REAR CAMERA:50MP+50MP+200MP");
			System.out.println("FRONT CAMERA:32MP");
			System.out.println("BATTERY:6000mAh");
			System.out.println("NETWORK TYPE:5G,4G,3G,2G");
			System.out.println("AMOUNT:94,999");
			System.out.println("");
			System.out.println("Cash on delievery:");
			String b=bat.nextLine();
			if(b.equals("ok")||b.equals("OK")||b.equals("yes")||b.equals("YES")) {
				System.out.println("pay amount:");
				System.out.println("Mobile amount:94,999");
				int amount=bat.nextInt();
				if(amount==94999) {
					System.out.println("Thank you for purchase!");
				}
				else if(amount>94999) {
					int balance=amount-94999;
					System.out.println("Purchased!");
					System.out.println("Extra amount:"+balance);
				}
				else {
					int balance=94999-amount;
					System.out.println("Not purchase:");
					System.out.println("Balance amount:"+balance);
				}
			}
			else {
				System.out.print("Online payment:");    
				System.out.println("Mobile amount:94,999");
				int amount=bat.nextInt();
				if(amount==94999) {
					System.out.println("Thank you for purchase!");
				}
				else if(amount>94999) {
					int balance=amount-94999;
					System.out.println("Purchased!");
					System.out.println("Extra amount:"+balance);
				}
				else {
					System.out.println("Order is not palced!");
					int balance=94999-amount;
					System.out.println("Must pay your balance amount for your order:"+balance);
				}
			}
	}
		else if(a.equals("Oneplus")||a.equals("ONEPLUS")||a.equals("oneplus")) {
			System.out.println("ABOUT PHONE");
			System.out.println("");
			System.out.println("MODEL:NORD 3");
			System.out.println("PROCESSOR:MEDIATEK DIMENSITY 9000");
			System.out.println("RAM:16GB");
			System.out.println("STORAGE:256GB");
			System.out.println("REAR CAMERA:50MP+50MP+150MP");
			System.out.println("FRONT CAMERA:32MP");
			System.out.println("NETWORK TYPE:5G,4G,3G,2G");
			System.out.println("BATTERY:5000mAh");
			System.out.println("AMOUNT:33,999");
			System.out.println("");
			System.out.println("Cash on delievery:");
			String b=bat.nextLine();
			if(b.equals("ok")||b.equals("OK")||b.equals("yes")||b.equals("YES")) {
				System.out.println("pay amount:");
				System.out.println("Mobile amount:33,999");
				int amount=bat.nextInt();
				if(amount==33999) {
					System.out.println("Thank you for purchase!");
				}
				else if(amount>33999) {
					int balance=amount-33999;
					System.out.println("Purchased!");
					System.out.println("Extra amount:"+balance);
				}
				else {
					int balance=33999-amount;
					System.out.println("Not purchase:");
					System.out.println("Balance amount:"+balance);
				}
			}
			else {
				System.out.print("Online payment:");    
				System.out.println("Mobile amount:33,999");
				int amount=bat.nextInt();
				if(amount==33999) {
					System.out.println("Thank you for purchase!");
				}
				else if(amount>33999) {
					int balance=amount-33999;
					System.out.println("Purchased!");
					System.out.println("Extra amount:"+balance);
				}
				else {
					System.out.println("Order is not palced!");
					int balance=33999-amount;
					System.out.println("Must pay your balance amount for your order:"+balance);
				}
			}
	}
		else if(a.equals("GOOGLE PIXEL")||a.equals("PIXEL")||a.equals("Pixel")||a.equals("pixel")||a.equals("google pixel")||a.equals("Google pixel")) {
			System.out.println("ABOUT PHONE");
			System.out.println("");
			System.out.println("MODEL:PIXEL 7 PRO");
			System.out.println("PROCESSOR:GOOGLE TENSOR G2");
			System.out.println("RAM:12GB");
			System.out.println("STORAGE:128GB");
			System.out.println("REAR CAMERA:50MP+48MP+12MP");
			System.out.println("FRONT CAMERA:10.8MP");
			System.out.println("DISPLAY:6.7 inch Quad HD+LTPO OLED DISPLAY");
			System.out.println("BATTERY:4926mAh");
			System.out.println("NETWORK TYPE:5G,4G,3G,2G");
			System.out.println("AMOUNT:44,999");
			System.out.println("");
			System.out.println("Cash on delievery:");
			String b=bat.nextLine();
			if(b.equals("ok")||b.equals("OK")||b.equals("yes")||b.equals("YES")) {
				System.out.println("pay amount:");
				System.out.println("Mobile amount:44,999");
				int amount=bat.nextInt();
				if(amount==44999) {
					System.out.println("Thank you for purchase!");
				}
				else if(amount>44999) {
					int balance=amount-44999;
					System.out.println("Purchased!");
					System.out.println("Extra amount:"+balance);
				}
				else {
					int balance=44999-amount;
					System.out.println("Not purchase:");
					System.out.println("Balance amount:"+balance);
				}
			}
			else {
				System.out.print("Online payment:");    
				System.out.println("Mobile amount:44,999");
				int amount=bat.nextInt();
				if(amount==44999) {
					System.out.println("Thank you for purchase!");
				}
				else if(amount>44999) {
					int balance=amount-44999;
					System.out.println("Purchased!");
					System.out.println("Extra amount:"+balance);
				}
				else {
					System.out.println("Order is not palced!");
					int balance=94999-amount;
					System.out.println("Must pay your balance amount for your order:");
				}
			}
	}
		else {
			System.out.println(a+" "+"IS OUT OF STOCK");
		}

}
}
