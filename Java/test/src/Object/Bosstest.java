package Object;

public class Bosstest {
	public static void main(String[] args) {
		
		Boss boss=new Boss();
		boss.name="����";
		boss.position="boss";
		boss.recruit();
		boss.recruitwork();
		boss.work();
		System.out.println("-----------------------");
		Manager manager=new Manager();
		manager.name="����";
		manager.position="manager";		
		manager.recruitwork();
		manager.work();
		System.out.println("-----------------------");
		Worker worker=new Worker();
		worker.name="����";
		worker.position="worker";		
//		worker.recruitwork();
		worker.work();
		
		
	}
}
