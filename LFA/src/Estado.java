import java.util.HashMap;
import java.util.Map;

public class Estado
{
  
  private boolean aceito;

  private Map<Character, Integer> transicao;

  public Estado(boolean aceito)
  {
    this.aceito = aceito;

    transicao = new HashMap<>();
  }

 
  public boolean estaAceito()
  {
    return aceito;
  }

 
  public void addTransicao(Character simbolo, Integer estado)
  {
    transicao.put(simbolo, estado);
  }


  public Integer getTransicao(Character simbolo)
  {
    return transicao.get(simbolo);
  }
}