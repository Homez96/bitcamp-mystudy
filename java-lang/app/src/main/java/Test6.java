// 실습
// - 애플리케이션 아규먼트를 다음과 같이 결과가 나오도록 모두 출력 하라.
//      $ java -classpath ... Test6 aaa bbb ccc ddd
//      'aaa'
//      'bbb'
//      'ccc'
//      'ddd'
//  println을 무조건 붙여야 띄워쓰기 해서 출력된다. print만 하면  aaabbbcccddd만 출력된다.
//

class Test6 {
    public static void main(String[] args) {
        // 코드를 완성하시오!
        System.out.println(args[0]);

        System.out.println(args[1]);

        System.out.println(args[2]);

        System.out.println(args[3]);
    }
}
