package org.jesperancinha.java11.boxing;

public class BoxingRunner {
    public static void main(String[] args) {
        Double saleNumberForGatecrashingD = 100.000;
        Float saleNumberForGatecrashingF = 100.000f;
        Character saleNumberForGatecrashingC = 100;
        Short saleNumberForGatecrashingS = 100;
        Integer saleNumberForGatecrashingI = 100_000;
        Long saleNumberForGatecrashingL = 100_000L;
        Byte saleNumberForGatecrashingB = 100;

        System.out.printf("Gatecrashing came out in June 1989 and it sold %f copies earning the album the gold certification\n", saleNumberForGatecrashingD);
        System.out.printf("Gatecrashing came out in June 1989 and it sold %f copies earning the album the gold certification\n", saleNumberForGatecrashingF);
        System.out.printf("Gatecrashing came out in June 1989 and it sold %s copies earning the album the gold certification\n", saleNumberForGatecrashingC);
        System.out.printf("Gatecrashing came out in June 1989 and it sold %d copies earning the album the gold certification\n", saleNumberForGatecrashingS);
        System.out.printf("Gatecrashing came out in June 1989 and it sold %d copies earning the album the gold certification\n", saleNumberForGatecrashingI);
        System.out.printf("Gatecrashing came out in June 1989 and it sold %d copies earning the album the gold certification\n", saleNumberForGatecrashingL);
        System.out.printf("Gatecrashing came out in June 1989 and it sold %d copies earning the album the gold certification\n", saleNumberForGatecrashingB);

        double saleNumberForGatecrashingDPrimitive = 100.000;
        float saleNumberForGatecrashingFPrimitive = 100.000f;
        char saleNumberForGatecrashingCPrimitive = 100;
        short saleNumberForGatecrashingSPrimitive = 100;
        int saleNumberForGatecrashingIPrimitive = 100_000;
        long saleNumberForGatecrashingLPrimitive = 100_000;
        long saleNumberForGatecrashingL2Primitive = 100_000L;
        byte saleNumberForGatecrashingBPrimitive = 100;

        System.out.printf("Gatecrashing came out in June 1989 and it sold %f copies earning the album the gold certification\n", saleNumberForGatecrashingDPrimitive);
        System.out.printf("Gatecrashing came out in June 1989 and it sold %f copies earning the album the gold certification\n", saleNumberForGatecrashingFPrimitive);
        System.out.printf("Gatecrashing came out in June 1989 and it sold %s copies earning the album the gold certification\n", saleNumberForGatecrashingCPrimitive);
        System.out.printf("Gatecrashing came out in June 1989 and it sold %d copies earning the album the gold certification\n", saleNumberForGatecrashingSPrimitive);
        System.out.printf("Gatecrashing came out in June 1989 and it sold %d copies earning the album the gold certification\n", saleNumberForGatecrashingIPrimitive);
        System.out.printf("Gatecrashing came out in June 1989 and it sold %d copies earning the album the gold certification\n", saleNumberForGatecrashingLPrimitive);
        System.out.printf("Gatecrashing came out in June 1989 and it sold %d copies earning the album the gold certification. Notice that we didn't use L before and in this case we do!\n", saleNumberForGatecrashingL2Primitive);
        System.out.printf("Gatecrashing came out in June 1989 and it sold %d copies earning the album the gold certification\n", saleNumberForGatecrashingBPrimitive);
    }
}
