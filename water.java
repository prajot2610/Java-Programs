
class water {
    public boolean canMeasureWater(int jug1, int jug2, int target) {
      return target == 0 || jug1 + jug2>= target &&
                                        target % gcd(jug1, jug2) == 0;
    }
  
    private int gcd(int a, int b) {
      return b == 0 ? a : gcd(b, a % b);
    }
  }
  