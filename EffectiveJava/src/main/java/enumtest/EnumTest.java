package enumtest;

public class EnumTest {
    // C언어 스타일의 상수 정의
    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMITH= 2;

    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;

    public enum Apple { FUJI, PIPPIN, GRANNY_SMITH }

    public enum Planet {
        MERCURY(3.302e+23,2.439e6),
        VENUS(4.869+24,6.052e6),
        EARTH(5.975e+24,6.378e6);

        // 내부 상수 선언 가능
        private static final double G = 6.673E-11;

        // 멤버변수 선언 가능
        private final double mass;
        private double radius;
        private final double surfaceGravity;

        // 생성자 선언 가능
        Planet(double mass,double radius) {
            this.mass = mass;
            this.radius = radius;
            surfaceGravity = G * mass / (radius * radius);
        }

        // 메서드 선언 가능
        public double mass() {return mass;}
        public double radius() {return radius;}
        public double surfaceGravity() { return surfaceGravity;}

        public double surfaceWeight(double mass) {
            return mass * surfaceGravity;
        }

    }
}
