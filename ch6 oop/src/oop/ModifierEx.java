package oop;

// modifier(제어자)
// 접근제어자 : public, protected, default , private
// 기타 : static, final, abstract, synchronuzed , native......

// static : 공통적인 (공유) <= ex) card class 보기

// final : 마지막의 , 변경될 수 없음 (클래스,메소드,멤버변수,지역변수)에 붙이기가능
//   ㄴ 이 class에 붙는 순간 (상속금지)
//    ㄴ 이 멤버변수에 붙으면 (상수의 개념)
//     ㄴ 이 메소드에 붙으면 (오버 라이딩 금지)

// 접근제어자(캡슐화 : 멤버변수들 가리기)
// public : 접근제한없음 (공용의)
// private : 같은 클래스 내에서만 접근 가능
// default : 접근 제어자 사용안하는 경우
//         : 같은 패키지 내에서만 접근 가능
// protected : 같은 패키지 내에서, 다른 패키지라면 자손 클래스에서 접근 가능
public class ModifierEx {
    public static void main(String[] args) {

    }
}
