import java.math.BigDecimal;
import java.math.BigInteger;

public class Sumator {



  public static Integer sum(Integer a, Integer b)
  {

      return a+b;
  }

    public static Double sum(Double a, Double b)
    {

        return a+b;
    }
    public static String sum(String a, String b)
    {

        return a+b;
    }
    public static BigInteger sum(BigInteger a, BigInteger b)
    {

        return a.add(b);

    }
    public static BigDecimal sum(BigDecimal a, BigDecimal b)
    {

        return a.add(b);
    }



}
