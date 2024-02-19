package DesignPatterns.creational;


class Product{

	String value1;
	String value2;
	String value3;



	public Product(String value1, String value2, String value3) {
		super();
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	public void setValue3(String value3) {
		this.value3 = value3;
	}
	@Override
	public String toString() {
		return "Product [value1=" + value1 + ", value2=" + value2 + ", value3=" + value3 + "]";
	}

}

interface BuilderInterface{
	public BuilderInterface setValue1(String value1);
	public BuilderInterface setValue2(String value2);
	public BuilderInterface setValue3(String value3);
	public Product buildProduct();

}

class TestProduct implements BuilderInterface{

	String value1;
	String value2;
	String value3;


	@Override
	public BuilderInterface setValue1(String value1) {
		this.value1=value1+" with test product";
		return this;
	}
	@Override
	public BuilderInterface setValue2(String value2) {
		this.value2=value2+" with test product";
		return this;
	}
	@Override
	public BuilderInterface setValue3(String value3) {
		this.value3=value3+" with test product";
		return this;
	}



	@Override
	public Product buildProduct() {
		return new Product(value1,value2,value3);
	}

}


public class Builder {

	public static void main(String[] args) {

		Product testProduct = new TestProduct()
											.setValue1("added value 1")
											.setValue2("added value 2")
											.buildProduct();
		System.err.println(testProduct);
	}

}







