public class main
{
  public static void main(String[]args)
  {
    Shinobi[] m = new Shinobi[3];

    m[0] = new Shinobi();
    m[0].setnoregistrasi("012606");
    m[0].setnama("Uchiha Sasuke");
    m[0].setperingkat("Genin");

    m[1] = new Shinobi();
    m[1].setnoregistrasi("012607");
    m[1].setnama("Uzumaki Naruto");
    m[1].setperingkat("Genin");

    m[2] = new Shinobi();
    m[2].setnoregistrasi("012601");
    m[2].setnama("Haruno Sakura");
    m[2].setperingkat("Chunin");

    System.out.println("Data Shinobi\n");
    for(Shinobi x:m)
    {
      System.out.println("Nomor Registrasi: "+x.getnoregistrasi());
      System.out.println("Nama: "+x.getnama());
      System.out.println("Peringkat: "+x.getperingkat());
      System.out.println();
    }
  }
}
