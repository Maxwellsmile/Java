/*
 * 2������������˼�룬��ơ���ȭ��Ϸ��
 */

package Object;

public class User {  
    public String name;  
    public int score;  
    public void chuquan(int i){  
        switch(i){  
        case 1:System.out.println("���ȭ������");break;  
        case 2:System.out.println("���ȭ��ʯͷ");break;  
        case 3:System.out.println("���ȭ����");break;  
        default:System.out.println("������󣡴˴�������Ч��");break;  
        }  
    }  
} 
