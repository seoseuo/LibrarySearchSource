package library;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library lib = new Library();
		
		lib.add_book("�ظ����� ����� ��","JK �Ѹ�",10110100);
		lib.add_book("�ٺ�ġ�ڵ�","�� ����",10110011);
		lib.add_book("�ظ����� ������ ����","JK �Ѹ�",10110101);
		lib.add_book("� ����","�������丮",10110010);

		lib.changeBookName("� ����", "� ����");
		lib.changeBookID(10110011, 1000000);
		//lib.changeBookWriter("JK �Ѹ�","�Ѹ�");
		//lib.print_book();
		

	}
}
