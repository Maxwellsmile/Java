/*
 * 2������������˼�룬��ơ���ȭ��Ϸ��
 */

package Object;

public class Game{  
    User u=new User();  
    Computer c=new Computer();  
    public int times;  
      
    //��Ϸ��ʼ��  
    public void init(){  
        u.name="����";  
        u.score=0;  
        c.name="����";  
        u.score=0;  
        times=0;  
    }  
    public void computerPlayer(int input){  
        switch(input){  
        case 1:c.name="����";break;  
        case 2:c.name="��Ȩ";break;  
        case 3:c.name="�ܲ�";break;  
        }  
    }  
    public void user(String name){  
        u.name=name;  
    }  
    public void chuquan(int a){  
        if(a==1||a==2||a==3){  
            times+=1;  
            u.chuquan(a);  
            int b=(int)(Math.random()*3)+1;//����һ��1~3�������  
            c.chuquan(b); 
//            System.out.println("a���ڣ�"+a);
//            System.out.println("b���ڣ�"+b);
            if((a==1&&b==3)||(a==2&&b==1)||(a==3&&b==2)){//���û�Ӯ��������1  
                System.out.println("�û�Ӯ��");
            	u.score+=1;  
            }else if((a==3&&b==1)||(a==1&&b==2)||(a==2&&b==1)){//������Ӯ��������1  
            	System.out.println("����Ӯ��");
            	c.score+=1;  
            } else if((a==3&&b==3)||(a==2&&b==2)||(a==1&&b==1)){ 
            	System.out.println("ƽ��");  
            } 
            
            }else{  
                System.out.println("��������������һ��0~3��������");  
            }  
          
    }  
      
    public void jisuan(){  
        System.out.println("һ�����ˣ�"+times+" �Σ� "+u.name+" Ӯ�ˣ�"+u.score+"�Σ� "+c.name+" Ӯ�ˣ�"+c.score+"�Σ�");  
    }  
    public void result(){  
        System.out.println("�����Ϊ��\nһ�����ˣ�"+times+" �Σ� "+u.name+" Ӯ�ˣ�"+u.score+"�Σ� "+c.name+" Ӯ�ˣ�"+c.score+"�Σ�");  
    }  
}  