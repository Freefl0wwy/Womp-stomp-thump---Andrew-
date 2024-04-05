import java.util.*; 
class Main {
  public static Scanner input= new Scanner(System.in);
  public static void main(String[] args) {
    while (true){
      System.out.println("Would you like a quote from:");
      System.out.println(" 1-Ponyo:");
      System.out.println("2-Xavier Renegade Angel:");
      System.out.println("3-Rezero:");
      int movie=input.nextInt();
      switch(movie){
          case 1:
          Ponyo();
          break;
        case 2:
          XavierRenegadeAngel();
          break;
        case 3:
          Rezero();
          break;
        default:
          System.out.println("That isn't a valid response. Try again.");
          input.next();
      }Good job
    }
  }
  public static void Ponyo(){
    System.out.println("You should never judge others by their looks.");
    input.nextLine();
    input.nextLine();
  }
  public static void XavierRenegadeAngel(){
    System.out.println("If these be my last words, then I’d like to leave this world with one final thought, ‘Me no wanna die, mommy! Waaahhh!.");
    input.nextLine();
    input.nextLine();
  }
  public static void Rezero(){
    System.out.println("It’s amazing that I can live like this and not feel ashamed!.");
    input.nextLine();
    input.nextLine();
  }}
