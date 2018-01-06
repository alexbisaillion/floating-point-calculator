public class FloatRepresentation {
    public int expLength;
    public int manLength;
    public int excess;
    public float floatRep;

    public FloatRepresentation(int el, int ml, int e, float fr) {
        expLength=el;
        manLength=ml;
        excess=e;
        floatRep=fr;
    }

    public char signBit() {
        if(floatRep<0) {
            return '1';
        }
        return '0';
    }

    public String convertIntegerPart() {
        int temp = (int)floatRep;
        String binaryRep = "";
        while(temp>0) {
            binaryRep = temp%2 + binaryRep;
            temp = temp/2;
        }
        return binaryRep;
    }
    public String convertFractionalPart() {
        float temp = floatRep - (int)floatRep;
        String binaryRep = "";
        while((temp-(int)temp)!=0) {
            temp = temp*2;
            binaryRep+=((int)temp);
            temp = temp - (int)temp;
        }
        return binaryRep;
    }

    public int radix() {
        String integerPart = convertIntegerPart();
        String fractionalPart = convertFractionalPart();
        String combo = integerPart + fractionalPart;
        String[] strArray = combo.split("");
        int count = 0;
        int radix = 0;
        for(String s:strArray) {
            count++;
            if (s.equals("1")) {
                break;
            }
        }
        radix=(integerPart.length()-count);
        radix+=excess;
        return radix;
    }

    public String exponent() {
        int temp = radix();
        String binaryRep = "";
        while(temp>0) {
            binaryRep = temp%2 + binaryRep;
            temp = temp/2;
        }
        if(binaryRep.length()<expLength) {
            while(binaryRep.length()<expLength) {
                binaryRep = "0" + binaryRep;
            }
        }
        return binaryRep;
    }

    public String mantissa() {
        String combo = convertIntegerPart() + convertFractionalPart();
        String[] strArray = combo.split("");
        int count = 0;
        for(String s:strArray) {
            count++;
            if (s.equals("1")) {
                break;
            }
        }
        String binaryRep = combo.substring(count);
        if(binaryRep.length()<manLength) {
            while(binaryRep.length()<manLength) {
                binaryRep = "0" + binaryRep;
            }
        }
        return binaryRep;
    }

    public String convertToBinaryRep() {
        return signBit() + exponent() + mantissa();
    }
    public static void main (String[] args) {
        FloatRepresentation test = new FloatRepresentation(3,4,3,(float)3.125);
        System.out.println(test.convertToBinaryRep());
    }
}
