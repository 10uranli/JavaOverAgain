package v9.v3.Variable;

class Foo {
	private String _someValue = "oldValue";

	public Foo() {
	}

	public String getSomeValue() {
		return _someValue;
	}

	public void setSomeValue(String someValue) {
		_someValue = someValue;
	}
}



class TestFoo 
{


public static void main(String[] args)
     {
       Foo f = new Foo();
       System.out.println("Foo value -> "+f.getSomeValue());
       System.out.println("In main --> "+f);
       changeFoo(f);
       System.out.println("Foo value -> "+f.getSomeValue());
     }



private static void changeFoo(Foo foo)
     {
      System.out.println("In method [1] --> "+foo);
      foo.setSomeValue("newValue");
      foo = new Foo();
      System.out.println("In method [2]--> "+foo);
      foo.setSomeValue("dummyValue");
      System.out.println("Foo value -> "+foo.getSomeValue());
     }
   }
