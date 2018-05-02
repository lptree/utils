package com.lptree.utils.Test;

public class TestInnerClass {
	
}

class Circle {
    private double radius = 0;
    public static int count =1;
    public int count2 = 1;
    public Circle(double radius) {
        this.radius = radius;
    }
     
    class Draw {     //�ڲ���    	
    	private int count2;
        public void drawSahpe() {
            System.out.println(radius);  //�ⲿ���private��Ա
            System.out.println(count2);   //�ڲ���ͬ����Ա
            System.out.println(Circle.count);   //�ⲿ��ľ�̬��Ա
            System.out.println(Circle.this.count2);   //�ⲿ���ͬ����Ա
        }
    }
}