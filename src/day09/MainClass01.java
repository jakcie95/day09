package day09;
/*
 ���� ������
 - public : Ŭ���� ����, �ܺο��� ���� ����
 - private : Ŭ���� ���ο����� ���� ����
 - protected : ��ӹ��� �ڽ� �Ǵ� ���ο��� ���� ����
 - default : ���� ��Ű�� �ȿ��� ���� ����
 */
import test.Member;

public class MainClass01 {

	public static void main(String[] args) {
		Member m = new Member();
		m.name = "ȫ�浿";
		
		
		TestClass01 t = new TestClass01();
		//t �� TestClass01�� ��� �ڷḦ ��ӹ���
		//t. TestClass�� ������� �̿�
		t.name ="ȫ�浿";
		t.age = 20;
		System.out.println(t.name+t.age);

	}

}
