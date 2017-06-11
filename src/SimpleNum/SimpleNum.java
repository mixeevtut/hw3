package SimpleNum;

public class SimpleNum {
    void CheckEasy(int[] array) {
//
//        for (int j = 0; j < array.length; j++) {
//            int a = array[j];
//            if (a == 2 || a == 3){
//                System.out.print(a + " ");
//            }
//            for (int i = 2; i < Math.sqrt(a); i++) {
//                if (i + 1 > Math.sqrt(a) && a % i != 0) {
//                    System.out.print(a + " ");
//                }
//                if (a % i == 0) {
//                    break;
//                }
//            }
//        }
//    }

        for (int j = 0; j < array.length; j++) {
            int a = array[j];
            if (a == 2) {
                System.out.print(a + " ");
            }
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    break;
                }
                if (i == a - 1) {
                    System.out.print(a + " ");
                }
            }
        }
    }
}
