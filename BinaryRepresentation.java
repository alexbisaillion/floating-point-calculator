import java.util.ArrayList;

public class BinaryRepresentation {
    private String signBit;
    private String exponent;
    private String mantissa;
    private int excess;

    public BinaryRepresentation(String sb, String exp, String man, int exc) {
        signBit=sb;
        exponent=exp;
        mantissa=man;
        excess=exc;
    }

    private int radix() {
        String[] strArray = exponent.split("");
        int expVal = 0;
        for (int i = 0; i <exponent.length(); i++) {
            if (strArray[i].equals("1")) {
                expVal += (Math.pow(2, exponent.length()-i-1));
            }
        }
        expVal -= excess;
        return expVal;
    }

    private ArrayList<Integer> buildMantissa() {
        ArrayList<Integer> manArray = new ArrayList<Integer>();
        manArray.add(1);
        for(int i = 0; i<mantissa.length(); i++) {
            if(mantissa.charAt(i)==('1')) {
                manArray.add(1);
            }
            else {
                manArray.add(0);
            }
        }
        return manArray;
    }

    private ArrayList<Integer> adjustMantissa(ArrayList<Integer> manArray, int radix) {
        if(radix<0) {
            for(int i = 0; i>radix; i--) {
                manArray.add(0,0);
            }
        }
        else if(radix>0) {
            if(radix>=mantissa.length()) {
                for(int i = 0; i<(radix-mantissa.length()); i++) {
                    manArray.add(0);
                }
            }
        }
        return manArray;
    }

    protected float convertToFloat() {
        float value = 0;
        int radix = radix();
        ArrayList<Integer> manArray = buildMantissa();
        manArray=adjustMantissa(manArray,radix);

        for (int i = 0; i < manArray.size(); i++) {
            if(manArray.get(i)==1) {
                value += (Math.pow(2, radix - i));
            }
        }
        if(signBit.charAt(0)=='1') {
            value=0-value;
        }
        return value;
    }

    public static void main(String[] args) {
        BinaryRepresentation test = new BinaryRepresentation("1","110","1010",3);
        System.out.println(test.convertToFloat());
    }
}