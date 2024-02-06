package com.ict.homework;

public interface Ex01 {
	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		int sum = 0;
		int cnt = 0;
		for (int i = 1; sum <= 99; i++) {
			if (i % 2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
			cnt = i;
		}
		System.out.println(cnt);

		// 내가 한 것
//		int sum1 = 0;
//	    int sum2 = 0;
//	    int result = 0;
//	    for (int i = 1; i > 0; i++) {
//	      if (i % 2 == 0) {
//	        sum1 = sum1 + (-i);
//	       } else {
//	        sum2 = sum2 + i;
//	            }
//	        result = sum1 + sum2;
//	      if (result >= 100) {
//	        System.out.println("결과 : " + i);
//	        break;
//	      }
//	    }

	}
}
