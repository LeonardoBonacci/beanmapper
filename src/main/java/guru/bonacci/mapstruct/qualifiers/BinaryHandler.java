package guru.bonacci.mapstruct.qualifiers;

@BinCoder
public class BinaryHandler {

    @BinDecoder
    public Integer decode(String src) {
    	System.out.println("calling decoder");
        return Integer.valueOf(src);
    }

    @BinEncoder
    public String encode(Integer i) {
    	System.out.println("calling encoder");
        return i.toString();
    }
}