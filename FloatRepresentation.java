/**
 * Created by abisa on 1/3/2018.
 */
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
        System.out.println(temp);
        String binaryRep = "";
        while((temp-(int)temp)!=0) {
            temp = temp*2;
            binaryRep+=((int)temp);
        }
        return binaryRep;
    }
    public static void main (String[] args) {
        FloatRepresentation test = new FloatRepresentation(3,4,3,(float)230.25);
        System.out.println(test.convertIntegerPart());
        System.out.println(test.convertFractionalPart());
    }
}
