package com.hxj.extend;
/**
 * �������η���
 *    public ����
 *    protected ����  ���� ����
 *    Ĭ��  ����  ����
 *    private ����
 * �ࣺ������������Ժͷ���
 * ����̳и��ࣺ
 *   extends
 *   �������ֱ��ʹ�ø����з�private�����Ժͷ���
 *   ��������Щ�����޷�����������������������д����ķ���  
 *   	��д��
 *        ��������ͬ �����б���ͬ ����ֵ������ͬ 
 *        �������η������ʷ�Χ������С
 *        �������ݿ��ܲ�ͬ
 * @author hxj
 *
 */
public class Cat extends Animal{
	
	 @Override
	 public void eat() {
		System.out.println(nickName+"�����");
	 }
	
}
