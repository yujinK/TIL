## Java Comparable, Comparator

> 비교가 아닌 정렬
>
> 자바에서 객체를 정렬할 때 일정한 기준이 필요
>
> 인터페이스
>
> 요약 : Comparable = 일반적인 정렬, Comparator = 커스터마이즈(customize) 정렬



**Comparable**

- 객체 간의 <u>일반적인 정렬</u> ex.) 오름차순, 내림차순
- 객체 클래스에 확장해서 사용
- Comparable 인터페이스를 확장해서 <u>정렬의 기준</u>을 정의하는 **compareTo()** 메서드 구현
  - compareTo()
    - int 타입 반환
    - 파라미터는 비교 대상이 되는 객체
    - A.compareTo(B)
      - A < B : return 음수
      - A = B : return 0
      - A > B : return 양수
    - 정렬에 있어서 앞에 오고 싶을 때 음수를 return
    - 주의해야할 점
      - 아무 음수, 아무 양수 리턴하는 것 아님
      - -1, 0, 1만 사용하는 것 아님
      - A.compareTo(B) == -(B.compareTo(A)) 조건 만족하게 구성



**Comparator**

- 객체 간의 <u>특정한 정렬</u> ex.) 문자열의 길이 순, Comparable로 구현한 것 이외의 기준으로 정렬
- Comparator 인터페이스를 확장해서 <u>특정 기준</u>을 정의하는 **compare()** 메서드 구현
- 특정한 정렬이 필요할 때 마다 compareTo를 수정할 수 없으니 Comparator를 사용하면 정렬이 필요할 때 특수한 기준을 줄 수 있음



**공통점**

정렬의 기준을 정의



**차이점**

정렬 기준이 일반적인지 아닌지에 따라 compareTo(Object o) 메서드를 구현하거나 compare(Object o1, Object o2) 메서드를 구현하는 차이



출처 : <https://jeong-pro.tistory.com/173>

