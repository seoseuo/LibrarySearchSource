package library;

public class Library {

	public static final int BOOK_DEFAULT_MAX = 10; //디폴트 길이
	public static final int ARRAY_INCREASE_RATE = 2;
	
	private Book[] book_list; //객체배열 생성
	private int num_of_book; //책 개수 count
	
	public Library() {
		book_list = new Book[BOOK_DEFAULT_MAX];
		num_of_book = 0;
	}
	
	public void add_book(String name, String writer, int ID) { //책 추가 기능 : 입력한 정보를 객체화 시켜서 객체배열에 저장
		
		if(num_of_book==BOOK_DEFAULT_MAX) {
			book_list = newBookList(book_list);
		}
		
		book_list[num_of_book] = new Book(name,writer,ID);
		num_of_book++;
		
	}
	
	public void add_book(Book newBook) { //book 객체 자체를 add
		
		if(num_of_book==BOOK_DEFAULT_MAX) {
			book_list = newBookList(book_list);
		}
		
		book_list[num_of_book] = newBook;	
		num_of_book++;
		
		
	}
		
	public void print_book() { //출력
		for(int i=0; i<num_of_book; i++) {
			book_list[i].print_info();
	
		}
	}
	
	private Book[] newBookList(Book[] old_book_list) { //책 count == length 새로운 library로 변경 (길이증가)
		Book new_book_list[] =new Book[old_book_list.length*ARRAY_INCREASE_RATE]; 
		
		for(int i=0; i<=old_book_list.length; i++) {
			new_book_list[i]=old_book_list[i];
		}
		return new_book_list;
	}
	
	public Book find_book(String name) { //책 이름으로 검색
		Book find_result = null;
		System.out.println("Book Name : " +name);
		
		for(int i=0; i<num_of_book; i++) {
			if(name.equals(book_list[i].getName())) {
				find_result=book_list[i];
			}
		}
		return find_result;
	}
	
	public Book find_book(int ID) { //id로 검색
		Book find_result = null;
		System.out.println("Book Name : " +ID);
		
		for(int i=0; i<num_of_book; i++) {
			if(ID==book_list[i].getID()) {
				find_result=book_list[i];
			}
		}
		return find_result;
	}
	
	public Library find_writer(String writer) { //작가로 검색
		System.out.println("Book Writer : " +writer);
		Library f_lib_list = new Library();
		
		for(int i=0; i<num_of_book; i++) {
			if(writer.equals(book_list[i].getWriter())) {
				f_lib_list.add_book(book_list[i]);
			}
		}
		return f_lib_list;
	}
	
	public void sort_ID() { //id순으로 오름차순
		
		Book temp;
		
		for(int i=0; i<num_of_book; i++) {
			for(int j=i+1; j<num_of_book; j++) {
				if(book_list[i].getID() > book_list[j].getID()) {
					temp = book_list[i];
					book_list[i]=book_list[j];
					book_list[j]=temp;
				}
			}
		}
	}
	
	public void reverse_book_list() { //역순으로
		Book r_list[] = new Book[num_of_book];

		int cnt = 0;
		for(int i=num_of_book-1; i>=0; i--) {
			r_list[cnt]=book_list[i];
			cnt++;
			}
		book_list = r_list;
		}
		
	

	public void changeBookName(String oldName, String newName) { //책 이름 바꾸기
		find_book(oldName).change_name(newName);
			}
	
	public void changeBookID(int oldID,int newID) { //
		find_book(oldID).change_ID(newID);
	}
	
	public void changeBookWriter(String oldWriter, String newWriter) { //

			Library fw_lib = find_writer(oldWriter);
			
			for(int i=0; i<fw_lib.num_of_book; i++) {
				fw_lib.book_list[i].change_writer(newWriter);
			
			}
			
		}
	}
	
	

		
	
