import java.util.Scanner;

public class One {
	public static void main (String[] agre) {		
		
		Scanner scn = new Scanner(System.in);
 		System.out.println("���� ���� ���α׷� �Դϴ�..");
		int user = 0;
		while(user != 5){
			int type;
			System.out.println("�뿩 ����(1), �ݳ� ����(2), ȸ�� ����(3), å����(4) ������(5)");
			user = scn.nextInt();
			switch(user){
			case 1: // �뿩 ����
				System.out.println("�뿩�� å ��¥(1), �뿩�� ȸ�� ����(2) ���� ������.");
				type = scn.nextInt();
				if(type <1 || type >2){
					System.out.println("�߸������ϼ̽��ϴ�.");
					break;
				}
				break;			
			case 2: // �ݳ� ����
				System.out.println("�ݳ��� ��¥(1), ��ü�� ȸ�� ����(2) ���� ������.");
				type = scn.nextInt();
				if(type <1 || type >2){
					System.out.println("�߸������ϼ̽��ϴ�.");
					break;
				}
				break;
			case 3: // ȸ�� ����
				System.out.println("ȸ�� �������(1), ȸ�� ���� ��¥(2), ȸ���� ������ å ��ȸ(3) ���� ������.");
				type = scn.nextInt();
				if(type <1 || type >3){
					System.out.println("�߸������ϼ̽��ϴ�.");
					break;
				}
				break;
			case 4: // å ����
				System.out.println("å ����(1), å ���(2), ����(3), ���ǻ�(4) ���� ������.");
				type = scn.nextInt();
				if(type <1 || type >4){
					System.out.println("�߸������ϼ̽��ϴ�.");
					break;
				}
			case 5: // ������
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			
			}	
		}

	}
}
