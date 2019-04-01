## Java Comparable, Comparator

> 비교가 아닌 정렬

자바에서 객체를 정렬할 때 일정한 기준이 필요



**Comparable**

- 객체 간의 <u>일반적인 정렬</u>
- Comparable 인터페이스를 확장해서 <u>정렬의 기준</u>을 정의하는 **compareTo()** 메서드 구현



**Comparator**

- 객체 간의 <u>특정한 정렬</u>
- Comparator 인터페이스를 확장해서 <u>특정 기준</u>을 정의하는 **compare()** 메서드 구현



**공통점**

정렬의 기준을 정의



**차이점**

정렬 기준이 일반적인지 아닌지에 따라 compareTo(Object o) 메서드를 구현하거나 compare(Object o1, Object o2) 메서드를 구현하는 차이



출처 : <https://jeong-pro.tistory.com/173>

