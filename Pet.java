public class Pet {
  protected String name;
  protected int age;

  Pet() {
    name = null;
    age = 0;
  }

  Pet(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static final String SPECIES = "Mammal";

  public String toString() {
    StringBuilder result = new StringBuilder();
    String NEW_LINE = System.getProperty("line.separator");

    result.append(this.getClass().getName() + " Object {" + NEW_LINE);
    result.append("  Name: " + name + NEW_LINE);
    result.append("  Age: " + Integer.toString(age) + NEW_LINE);
    result.append("}" + NEW_LINE);

    return result.toString();
  }

  public void speak() {
    System.out.println("I'm a Pet!");
  }

  public void pet(int num, String w) {
    System.out.println("Ooo, feels great!");
  }
}
