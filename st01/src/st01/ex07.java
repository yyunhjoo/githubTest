/* 메서드 */
//다른 패키지에 있는 메소드 사용할시
//import 패키지명.메소드명
package st01;

public class ex07 {
	public static void main(String[] args) {
		add(10, 20);
		add(10, 30);
		System.out.println(add2(10, 40));
		add2(10, 20, 30);
		add2(1,2,3,4,5);
		
		Person person = new Person();
		Person person2 = new Person("윤현종", 27);
		System.out.println(person);
		System.out.println(person2);
		
	}//main
	
	public static void add(int x, int y) {
		System.out.println(x + y);
	}
	public static int add2(int x, int y) {
		return x + y;
	}

	/* 오버로드 */
	public static int add2(int x, int y, int z) {
		return x + y + z;
	}
	public static int add2(int... numbers) {
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			sum = sum + i;
		}
		return sum;
	}

}

class Person{
	private String name;
	private int age;
	
	/* 생성자 */
	//클래스이름과 같은 기본생성자
	Person(){
		
	}
	//필드에서 전달받은 오버로드 된 생성자
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/* 오버로드된 getter,setter */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}