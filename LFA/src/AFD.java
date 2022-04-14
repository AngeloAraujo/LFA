import java.util.HashMap;
import java.util.Map;


public class AFD
{
 
  private Map<Integer, Estado> estados;


  public AFD()
  {
    estados = new HashMap<>();

    Estado q0 = new Estado(false);
    q0.addTransicao('i', 1);
    q0.addTransicao('f', 9 );
    q0.addTransicao('w', 3);
    q0.addTransicao('a', 8);
    q0.addTransicao('b', 8);
    q0.addTransicao('c', 8);
    q0.addTransicao('d', 8);
    q0.addTransicao('e', 8);
    q0.addTransicao('g', 8);
    q0.addTransicao('h', 8);
    q0.addTransicao('j', 8);
    q0.addTransicao('k', 8);
    q0.addTransicao('l', 8);
    q0.addTransicao('m', 8);
    q0.addTransicao('n', 8);
    q0.addTransicao('o', 8);
    q0.addTransicao('p', 8);
    q0.addTransicao('q', 8);
    q0.addTransicao('r', 8);
    q0.addTransicao('s', 8);
    q0.addTransicao('t', 8);
    q0.addTransicao('u', 8);
    q0.addTransicao('v', 8);
    q0.addTransicao('y', 8);
    q0.addTransicao('x', 8);
    q0.addTransicao('z', 8);
    q0.addTransicao('0', 12);
    q0.addTransicao('1', 12);
    q0.addTransicao('2', 12);
    q0.addTransicao('3', 12);
    q0.addTransicao('4', 12);
    q0.addTransicao('5', 12);
    q0.addTransicao('6', 12);
    q0.addTransicao('7', 12);
    q0.addTransicao('8', 12);
    q0.addTransicao('9', 12);
    estados.put(0, q0);

    Estado q1 = new Estado(false);
    q1.addTransicao('f', 2);
    estados.put(1, q1);

    Estado q2 = new Estado(true);
    q2.addTransicao('i', 2);
    q2.addTransicao('f', 2 );
    q2.addTransicao('w', 2);
    q2.addTransicao('a', 2);
    q2.addTransicao('b', 2);
    q2.addTransicao('c', 2);
    q2.addTransicao('d', 2);
    q2.addTransicao('e', 2);
    q2.addTransicao('g', 2);
    q2.addTransicao('h', 2);
    q2.addTransicao('j', 2);
    q2.addTransicao('k', 2);
    q2.addTransicao('l', 2);
    q2.addTransicao('m', 2);
    q2.addTransicao('n', 2);
    q2.addTransicao('o', 2);
    q2.addTransicao('p', 2);
    q2.addTransicao('q', 2);
    q2.addTransicao('r', 2);
    q2.addTransicao('s', 2);
    q2.addTransicao('t', 2);
    q2.addTransicao('u', 2);
    q2.addTransicao('v', 2);
    q2.addTransicao('y', 2);
    q2.addTransicao('x', 2);
    q2.addTransicao('z', 2);
    q2.addTransicao('$', 2);
    estados.put(2, q2);
    
    Estado q3 = new Estado(false);
    q3.addTransicao('h', 4);
    estados.put(3, q3);

    Estado q4 = new Estado(false);
    q4.addTransicao('i', 5);
    estados.put(4, q4);

    Estado q5 = new Estado(true);
    q5.addTransicao('l', 6);
    estados.put(5, q5);
    
    Estado q6 = new Estado(true);
    q6.addTransicao('e', 7);
    estados.put(6, q6);
    
    Estado q7 = new Estado(true);
    q7.addTransicao('i', 7);
    q7.addTransicao('f', 7 );
    q7.addTransicao('w', 7);
    q7.addTransicao('a', 7);
    q7.addTransicao('b', 7);
    q7.addTransicao('c', 7);
    q7.addTransicao('d', 7);
    q7.addTransicao('e', 7);
    q7.addTransicao('g', 7);
    q7.addTransicao('h', 7);
    q7.addTransicao('j', 7);
    q7.addTransicao('k', 7);
    q7.addTransicao('l', 7);
    q7.addTransicao('m', 7);
    q7.addTransicao('n', 7);
    q7.addTransicao('o', 7);
    q7.addTransicao('p', 7);
    q7.addTransicao('q', 7);
    q7.addTransicao('r', 7);
    q7.addTransicao('s', 7);
    q7.addTransicao('t', 7);
    q7.addTransicao('u', 7);
    q7.addTransicao('v', 7);
    q7.addTransicao('y', 7);
    q7.addTransicao('x', 7);
    q7.addTransicao('z', 7);
    q7.addTransicao('0', 7);
    q7.addTransicao('1', 7);
    q7.addTransicao('7', 7);
    q7.addTransicao('3', 7);
    q7.addTransicao('4', 7);
    q7.addTransicao('5', 7);
    q7.addTransicao('6', 7);
    q7.addTransicao('7', 7);
    q7.addTransicao('8', 7);
    q7.addTransicao('9', 7);
    q7.addTransicao('$', 7);
    estados.put(7, q7);
    
    Estado q9 = new Estado(true);
    q9.addTransicao('o', 10);
    estados.put(9, q9);
    
    Estado q10 = new Estado(true);
    q10.addTransicao('r', 11);
    estados.put(10, q10);
    
    Estado q11 = new Estado(true);
    q11.addTransicao('i', 11);
    q11.addTransicao('f', 11 );
    q11.addTransicao('w', 11);
    q11.addTransicao('a', 11);
    q11.addTransicao('b', 11);
    q11.addTransicao('c', 11);
    q11.addTransicao('d', 11);
    q11.addTransicao('e', 11);
    q11.addTransicao('g', 11);
    q11.addTransicao('h', 11);
    q11.addTransicao('j', 11);
    q11.addTransicao('k', 11);
    q11.addTransicao('l', 11);
    q11.addTransicao('m', 11);
    q11.addTransicao('n', 11);
    q11.addTransicao('o', 11);
    q11.addTransicao('p', 11);
    q11.addTransicao('q', 11);
    q11.addTransicao('r', 11);
    q11.addTransicao('s', 11);
    q11.addTransicao('t', 11);
    q11.addTransicao('u', 11);
    q11.addTransicao('v', 11);
    q11.addTransicao('y', 11);
    q11.addTransicao('x', 11);
    q11.addTransicao('z', 11);
    q11.addTransicao('0', 11);
    q11.addTransicao('1', 11);
    q11.addTransicao('2', 11);
    q11.addTransicao('3', 11);
    q11.addTransicao('4', 11);
    q11.addTransicao('5', 11);
    q11.addTransicao('6', 11);
    q11.addTransicao('7', 11);
    q11.addTransicao('8', 11);
    q11.addTransicao('9', 11);
    q11.addTransicao('$', 11);

    estados.put(11, q11);
    
    Estado q12 = new Estado(true);
    q12.addTransicao('0', 12);
    q12.addTransicao('1', 12);
    q12.addTransicao('2', 12);
    q12.addTransicao('3', 12);
    q12.addTransicao('4', 12);
    q12.addTransicao('5', 12);
    q12.addTransicao('6', 12);
    q12.addTransicao('7', 12);
    q12.addTransicao('8', 12);
    q12.addTransicao('9', 12);
    q12.addTransicao('$', 12);

    estados.put(12, q12);
    
    Estado q8 = new Estado(false);
    q8.addTransicao('i', 1);
    q8.addTransicao('f', 9 );
    q8.addTransicao('w', 3);
    q8.addTransicao('i', 8);
    q8.addTransicao('f', 8 );
    q8.addTransicao('w', 8);
    q8.addTransicao('a', 8);
    q8.addTransicao('b', 8);
    q8.addTransicao('c', 8);
    q8.addTransicao('d', 8);
    q8.addTransicao('e', 8);
    q8.addTransicao('g', 8);
    q8.addTransicao('h', 8);
    q8.addTransicao('j', 8);
    q8.addTransicao('k', 8);
    q8.addTransicao('l', 8);
    q8.addTransicao('m', 8);
    q8.addTransicao('n', 8);
    q8.addTransicao('o', 8);
    q8.addTransicao('p', 8);
    q8.addTransicao('q', 8);
    q8.addTransicao('r', 8);
    q8.addTransicao('s', 8);
    q8.addTransicao('t', 8);
    q8.addTransicao('u', 8);
    q8.addTransicao('v', 8);
    q8.addTransicao('y', 8);
    q8.addTransicao('x', 8);
    q8.addTransicao('z', 8);
    q8.addTransicao('0', 12);
    q8.addTransicao('1', 12);
    q8.addTransicao('2', 12);
    q8.addTransicao('3', 12);
    q8.addTransicao('4', 12);
    q8.addTransicao('5', 12);
    q8.addTransicao('6', 12);
    q8.addTransicao('7', 12);
    q8.addTransicao('8', 12);
    q8.addTransicao('9', 12);
    q8.addTransicao('$', 12);
    estados.put(8, q8);
  }

  private String formatEstado(Integer estado)
  {
    if((estados.size() < 100) && (estado < 10))
    {
      return "\nq" + estado + "  - ";
    }

    return "\nq" + estado + " - ";
  }


  public boolean verifica (String palavra)
  {
    String input = palavra + "$";

    System.out.print("Observação: \"$\" representa o fim da sentença");

    Integer estado = 0;

    int length = input.length();

    for(int symbol = 0; symbol < length; symbol++)
    {
      System.out.print(formatEstado(estado));

      for(int i = 0; i < length; i++)
      {
        if(i != symbol)
        {
          System.out.print(" " + input.charAt(i) + " ");
        }
        else
        {
          System.out.print("[" + input.charAt(i) + "]");
        }
      }

      estado = estados.get(estado).getTransicao(input.charAt(symbol));

      if(estado == null)
      {
        System.out.println(" - Palavra rejeitada");

        return false;
      }
    }

    if(estados.get(estado).estaAceito())
    {
      System.out.println(" - Palavra aceita");
    }
    else
    {
      System.out.println(" - Palavra rejeitada");
    }

    return estados.get(estado).estaAceito();
  }
}
