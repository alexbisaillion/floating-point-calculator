import java.util.ArrayList;

/**
 * Created by abisa on 12/29/2017.
 */
public class FloatingPointRepresentation {
    public String signBit;
    public String exponent;
    public String mantissa;
    public int excess;

    public FloatingPointRepresentation(String sb, String exp, String man, int exc) {
        signBit=sb;
        exponent=exp;
        mantissa=man;
        excess=exc;
    }

    public int radix() {
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

    public void convertToFloat() {
        int radix = radix();
        float val = 0;
        System.out.println(radix);
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

        System.out.println(manArray);
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
        System.out.println(manArray);
        for (int i = 0; i < manArray.size(); i++) {
            System.out.println(radix-i);
            val += (Math.pow(2, radix - i));
        }
    }
    public static void main(String[] args) {
        FloatingPointRepresentation test = new FloatingPointRepresentation("0","111","0000",2);
        test.convertToFloat();
    }
}