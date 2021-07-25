package lesson12_Composition_ReferenceVsPrimitive_Polymorphism;

public class App1_PrimitiveVsReference {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        b= 6;

        System.out.println("a= "+a+","+"b= "+b);

        Fruit f1 = new Fruit("Apple");
        Fruit f2 = f1;
        Fruit fruit = new Fruit(f1.getName());
        f2.setName("Pineapple");

        System.out.println("f1= "+f1.getName()+" ,f2= "+f2.getName());

        int[] arr1 = {1,2,1};
        int[] arr2 = arr1;
        arr2[0] = 5;
        System.out.println(arr1[0]);


        System.out.println(fruit.getName());

    }
}
