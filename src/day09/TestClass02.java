package day09;

public class TestClass02 {
	// ���������� ��ȯŸ�� �޼ҵ� ��(�Ű�����(argument))
		public  void   	test   (   ) {
		test2();
			System.out.println("test �޼ҵ� ����");
	}
		public  void   	test1   (   ) {
			System.out.println("test1 �޼ҵ� ����");
		}
		public  void   	test2   (   ) {
			test1();
			System.out.println("test2 �޼ҵ� ����");
		}
		
}
