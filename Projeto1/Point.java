/*
(1) Implemente um construtor para que seja possivel criar uma instancia de Point da seguinte forma: Point p = new Point(10, 10);
(2) Verifique questao de "data hiding" para assegurar um encapsulamento onde os fields nao sejam visiveis fora do modulo
(3) Existe um contrato [invariante de classe] que exige que as coordenadas representadas pela classe Point sejam positivas e menores ou iguais a 400, ou seja, (x >=0 && x <= 400) && (y >=0 && y <= 400). Assegure para que a classe mantenha essa integridade ao ser manipulada por codigo clientes.

(4) Ao finalizar, favor finalizar essa task e submeter a sua versao da classe Point final.
***OBS: Pode submeter um arquivo .txt com o codigo da classe ou apenas o texto da mesma.
*/

public class Point {

  //Colocando os fields como private para garantir o "data hiding" 
  private int x = 0, y = 0;
  
  //Construtor
  public Point(int coordenadaX, int coordenadaY){
    this.x=coordenadaX;
    this.y=coordenadaY;
  }

  public int getX() { 
    return x; 
  }
  public int getY() { 
    return y; 
  }

  public void setX(int x) { 
    //Garantindo que sejam positivas e menores ou iguais a 400
    if(x >=0 && x <= 400)
      this.x = x; 
    else
      System.out.println("O valor deve ser positivo e menor ou igual que 400");
  }
  public void setY(int y) { 
    //Garantindo que sejam positivas e menores ou iguais a 400
    if (y >=0 && y <= 400)
      this.y = y; 
    else
      System.out.println("O valor deve ser positivo e menor ou igual que 400");
  }

  public void moveBy(int dx, int dy) {
      setX(getX() + dx);
      setY(getY() + dy);
  }
}