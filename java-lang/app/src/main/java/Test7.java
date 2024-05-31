// 실습
// - 애플리케이션 아규먼트를 다음과 같이 결과가 나오도록 모두 출력 하라.
// $ java -classpath ... argument '대한' '민국' '만세' '만만세'
// '대한'
// '민국'
// '만세'
// '만만세'
//
//
class Test7 {
    public static void main(String[] args) {
        for (String arg : args)
            System.out.println("'" + arg + "'");
    }
}