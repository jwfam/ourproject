// 클래스 파일에 남길 수 있는 주석
// => 형식을 갖춘 주석을 남길 수 있다.
// => 용도
// 1) 소스 코드에서 특정 값을 쉽게 추출할 수 있다.
//    => 소스 코드에서 이 주석을 읽어 다른 소스 파일을 생성할 때 사용한다.
// 2) .class 파일에 주석을 남길 수 있다.
//    => 실행 시에 추출하여 사용할 수 있다.
//
package com.eomcs.annotation.ex1;

public @interface MyAnnotation {
  // 주석의 프로퍼티를 정의할 수 있다.
  // => 인터페이스에서 메서드를 정의하는 것과 유사하다.
  // => 메서드 이름은 프로퍼티(변수)명처럼 작성한다.
  // 즉 일반적인 메서드는 보통 동사로 이름을 시작하지만,
  // 애노테이션은 명사(명사구)로 이름을 짓는다.
  String value(); // 애노테이션의 기본 프로퍼티이다.
}


