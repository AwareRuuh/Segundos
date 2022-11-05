class Main {
  public static void main(String[] args) {
  int segundos = 86399;
  int horas = segundos / 3600;
    segundos %= 3600;
  int minutos = segundos / 60;
    segundos %= 60;
System.out.print("Tempo total: ");
if (horas >= 0)
    System.out.printf("%d:", horas);
if (minutos >= 0)
    System.out.printf("%d:", minutos);
if (segundos >= 0)
    System.out.printf("%d:", segundos);
  }
}