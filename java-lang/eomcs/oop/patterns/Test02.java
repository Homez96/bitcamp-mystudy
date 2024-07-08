//1) private 생성자 + Factory Method 설계 패턴

package com.eomcs.oop.patterns;

import com.eomcs.oop.patterns.step2.Sedan;

public class Test02 {
  public static void main(String[] args) {
    Sedan s1 = new Sedan();
    s1.maker = "현대자동차";
    s1.model = "소나타";
    s1.cc = 1998;
    s1.auto = true;
    s1.sunroof = false;

    Sedan s2 = new seadan();
    s2.maker = "기아자동차";
    s2.model = "K9";
    s2.cc = 2500;
    s2.auto = true;
    s2.sunroof = true;

  }

}
