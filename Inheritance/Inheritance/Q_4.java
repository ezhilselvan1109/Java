//Write a program to illustrate about the Object class, using
// toString(), getClass(), equals(), hashCode() and finalize().

class ObjectClass {
    private  int id;
    private  String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ObjectClass() {
        super();
    }
    public String toString() {
        return "Id: "+id +" Name: "+name;
    }
    public int hashCode() {
        return super.hashCode();
    }
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) throws Throwable {
        ObjectClass obj1=new ObjectClass(1,"Ezhil");
        ObjectClass obj2=new ObjectClass(2,"Selvan");
        ObjectClass obj3=new ObjectClass(3,"Ezhil Selvan");
        ObjectClass obj4=obj3;
        System.out.println(obj1);
        System.out.println(obj2.toString());
        System.out.println(obj3);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj1.equals(obj2));
        System.out.println(obj3.equals(obj4));
        obj1.finalize();
        System.out.println("Finalize");
        //ObjectClass obj1=new ObjectClass(1,"Ezhil");
        System.out.println("getClass() - "+obj2.getClass());
        System.out.println("getName() - "+obj2.getName());
        System.out.println("clone() - "+obj2.clone());
    }
}
