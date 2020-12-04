class Main {
  public static void main(String[] args) {
  String [] roster1 = new String[10];
  String [] roster2 = {"Jeff", "Daniel", "Manny", "Dan", "David", "Sofia", "Stella", "Bella", "Blake", "Robin"};

  for (int index = 0; index < roster1.length; index++)
  {
    roster1[index] = roster2[index];
    System.out.println(roster1[index]);
  }
  }
}
