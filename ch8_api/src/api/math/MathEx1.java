package api.math;

public class MathEx1 {
    public static void main(String[] args) {
        System.out.println("random()0 ~ 1 " + Math.random());

        // 올림 , 반올림 ,버림
        double val = 90.7552;

        System.out.println("Math.ceil(val) " + Math.ceil(val)); // 올림
        System.out.println("Math.floor(val) " + Math.floor(val)); // 버림
        System.out.println("Math.round(val) " + Math.round(val)); // 반올림
        // ================================================================================
        System.out.println("Math.min(x,y) " + Math.min(val, 95.25)); // 비교 (작은거)
        System.out.println("Math.max(x,y) " + Math.max(val, 95.25)); // 비교 (큰거)

    }
}
