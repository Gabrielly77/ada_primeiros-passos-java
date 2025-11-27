public class Main {
  public static void main (String[] args) {
          //código que serão sempre executados
          }
        */

  try {
      int resultado = dividir ( a:10, b: 2);
      System.out.println("Resultado: " + resultado)
  } catch (ArithmeException e) {
      System.out.println("Erro: divisão por zero.");
  } finally {
      Sysrem.out.println("Bloco finally sendo executado");
  }
  }
  public static int dividir (int a, int b) { 1 usage
      return a / b;
  }


  }










}
