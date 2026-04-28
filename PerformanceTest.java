package mypackage;

public class PerformanceTest {
    public static void main(String[] args) {

        int iterations = 10000;

        // Test for StringBuffer
        StringBuffer sbuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbuffer.append("AIET");
        }

        long endTimeBuffer = System.nanoTime();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        System.out.println("StringBuffer Time: " + timeBuffer + " ns");

        // Test for StringBuilder
        StringBuilder sbuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbuilder.append("AIET");
        }

        long endTimeBuilder = System.nanoTime();
        long timeBuilder = endTimeBuilder - startTimeBuilder;

        System.out.println("StringBuilder Time: " + timeBuilder + " ns");

        // Comparison
        if (timeBuilder < timeBuffer) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
}