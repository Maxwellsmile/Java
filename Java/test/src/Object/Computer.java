/*
 * 2采用面向对象的思想，设计《猜拳游戏》
 */

package Object;

 public class Computer {  
     
	    public String name;  
	    public int score;  
	    public void chuquan(int i){  
	        switch(i){  
	        case 1:System.out.println("电脑出拳：剪刀");break;  
	        case 2:System.out.println("电脑出拳：石头");break;  
	        case 3:System.out.println("电脑出拳：布");break;  
	        }  
	    }  
	}  