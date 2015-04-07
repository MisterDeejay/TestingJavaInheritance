public class Dog extends Pet implements Pettable {

  Dog() {
    this.name = null;
    this.age = 0;
  }

  Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void bark() {
    System.out.println("Woof!");
  }

  public void speak() {
    System.out.println("I'm a dog!");
  }

  public void superclassSpeak() {
    super.speak();
  }

  public static void main(String[] args) {
    Pet p = new Pet();
    Dog d = new Dog("Fido", 8);
    Pettable pt = new Dog();
    System.out.println(pt.SPECIES);

    System.out.println("### TESTING Inheritance Pt I ###\nVariable p is a " + p +
      "Variable d is a " + d);

    p = d;
    System.out.println("After assigning \'p = d\'\nVariable p is a " + p +
      "Variable d is a " + d);

    d = (Dog) p;
    System.out.println("Unless you typecast p: d = (Dog) p, \'d = p\' will" +
    " give a compile-time error.\n" + p + d);

    System.out.println("### TESTING Inheritance with Arrays Pt I ###\n");

    Dog[] dogA = {new Dog(), new Dog()};
    Pet[] petA = dogA;
    System.out.println("Pet Array");
    for (int i = 0; i < petA.length; i++) {
      System.out.println(petA[i]);
    }

    System.out.println("Dog Array");
    for (int i = 0; i < dogA.length; i++) {
      System.out.println(dogA[i]);
    }

    petA = dogA;
    System.out.println("After assigning \'petA = dogA\'");
    System.out.println("Pet Array");
    for (int i = 0; i < petA.length; i++) {
      System.out.println(petA[i]);
    }

    System.out.println("Dog Array");
    for (int i = 0; i < dogA.length; i++) {
      System.out.println(dogA[i]);
    }

    System.out.println("Cannot assign \'dogA = (Dog) petA\' at compile-time or " +
     "run-time even with a cast unless petA is an array of Dogs and you loop " +
     "through array and cast each individual element");

    System.out.println("### TESTING Inheritance Pt IV.A ###\n");
    Dog dog = new Dog();
    System.out.println("When dog has static class Dog it says: ");
    dog.speak();

    System.out.println("When dog has static class Pet is says: ");
    ((Pet) dog).speak();

    // System.out.println("### TESTING Inheritance Pt IV.B ###\n");
    // Pet pet = new Pet();
    // System.out.println("When pet has static class Pet it says: ");
    // pet.speak();
    //
    // System.out.println("When pet has static class Pet is says: ");
    // ((Dog) pet).speak();

    System.out.println("### TESTING Inheritance Pt IV.C ###\n");
    Dog d2 = new Dog();
    System.out.println("When d2 has static class Dog it says: ");
    d2.speak();

    System.out.println("When d2.superclassSpeak() is called it says: ");
    d2.superclassSpeak();
  }
}
