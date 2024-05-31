// 실습
// - 다음과 같이 실행결과가 나오도록 코드를 완성하라.
//      $ java -classpath ... Test5 hongkildong
//      hongkildong 님 반갑습니다.
/* psvm만 하는 것이 아니라, 기본 옵션인데, 왜 System.out.println(args[0] + "님 반갑습니다."); 이 값을 해야 
홍길동님 반갑습니다. 가 나오는지가 관건이다.
출력할때는 System.out이 무조건 들어가야하고, 상황에 따라서 줄 바꿔야 할때는 .println , 줄 바꾸지 않고 할때는 print만 해도 출력된다.
args[0] 왼쪽부터 순서대로 읽는다.: args>님 반갑습니다.
String 필수...
*/
//

class Test5 {
    public static void main(String[] args) {
        System.out.println(args[0] + "님 반갑습니다.");
    }
}
