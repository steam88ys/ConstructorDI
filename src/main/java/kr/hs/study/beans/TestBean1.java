package kr.hs.study.beans;

public class TestBean1 {
    private int data1;
    private double data2;
    private String data3;

    public TestBean1() {
        System.out.println("===TestBean1의 기본생성자===");
        this.data1 = 0;
        this.data2 = 0.0;
        this.data3 = "spring0";
    }

    // 생성자를 호출하는 객체 생성
    //TestBean1 t = new TestBean1(13);

    public void prData() {
        System.out.println("data1: "+data1);
        System.out.println("data1: "+data2);
        System.out.println("data1: "+data3);
        System.out.println("==========================");
    }

    public TestBean1(int data1) {   // 메서드 오버로딩
        System.out.println("===TestBean1의 int data1===");
        this.data1 = data1;
        this.data2 = 1.1;
        this.data3="spring1";
    }
}
