package Collections;
class Generics<T>{
	private T age;

	public T getAge() {
		return age;
	}

	public void setAge(T i) {
		this.age = i;
	}
	public static void main(String[] args) {
		
	Generics<Integer> g=new Generics<>();
	g.setAge(10);
	System.out.println(g.getAge());
}
}