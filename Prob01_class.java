﻿package java0711_method.prob;

import java.lang.String;

/* 1 display()메소드에서 code별 가격합계를 구현하는 프로그램을 구현하시오.
 * 
 * 2 출력결과
 *   컴퓨터 75000
 *   소설   25000
 * 
 */
class BookShop {
	// 멤버변수
	String title;
	String code;
	int price;

	BookShop(String title, String code, int price) {
		this.title = title;
		this.code = code;
		this.price = price;
	}
}

public class Prob01_class {

	public static void main(String[] args) {
		BookShop[] shop = new BookShop[5];
		shop[0] = new BookShop("Java의 정석", "컴퓨터", 20000);
		shop[1] = new BookShop("나그네", "소설", 10000);
		shop[2] = new BookShop("실무에 바로쓰는 엑셀", "컴퓨터", 25000);
		shop[3] = new BookShop("초인", "소설", 15000);
		shop[4] = new BookShop("웹구현 JSP", "컴퓨터", 30000);
		display(shop);
	}// end main()
	

	public static void display(BookShop[] shop) {
		// code별 가격 합계를 구하는 프로그램을 구현하시오.
		for (int i = 0; i < shop.length; i++) {
			if (shop[i] == shop[0] || shop[i] == shop[2] || shop[i] == shop[4]) {
					System.out.println();
			}

		}

	}// end display()

}// end class
