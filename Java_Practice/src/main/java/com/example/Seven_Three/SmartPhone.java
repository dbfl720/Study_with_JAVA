package com.example.Seven_Three;



//실체 클래스
public class SmartPhone extends Phone{   //SmartPhone : 자식 , Phone : 부모

    //생성자
    public SmartPhone (String owner){
        super(owner);   //부모 phone의 생성자를 호출
    }


    //메소드
    public void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
