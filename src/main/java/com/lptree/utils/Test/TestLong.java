package com.lptree.utils.Test;

public class TestLong {
	public static void main(String[] args) {
	    /*
	     * ����long���ͣ�����ֵ����int�͵����ֵ����С��int�͵���Сֵ�� ����Ҫ�����ֺ��L����l����ʾ����ֵΪ������
	     */
	    // 1��������ͨlong��������
	    long longnum1 = 123;
	    // 2���˾����뱨����Ϊint�͵����ֵΪ2147483647
	    //long longnum2 = 2147483650;
	    // 3����ȷ����Ϊ
	    long longnum3=2147483650L;
	    System.out.println(longnum3);
	}
	
	static int getOneInteger()
	{
		return 100;
	}
}
