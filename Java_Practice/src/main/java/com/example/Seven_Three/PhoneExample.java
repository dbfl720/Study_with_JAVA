package com.example.Seven_Three;



//실행 클래스
public class PhoneExample {
    public static void main(String[] args){
        //Phone phone = new Phone;

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();   //phone의 메소드
        smartPhone.internetSearch();
        smartPhone.turnOff();   //phone의 메소드

    }
}
