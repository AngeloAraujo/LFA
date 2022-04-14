
import java.util.Scanner;

public class Main
{
  private Main()
  {

  }
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Analise a senten�a: ");
    String palavra = scanner.nextLine().trim();

    scanner.close();

    if(palavra.indexOf("$") >= 0)
    {
      System.out.println("A palavra \"" + palavra + "\" � inv�lida");

      return;
    }

    AFD afd = new AFD();

    afd.verifica(palavra);
  }
}
