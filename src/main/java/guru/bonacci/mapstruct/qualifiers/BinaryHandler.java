package guru.bonacci.mapstruct.qualifiers;

import java.util.Base64;

@BinCoder
public class BinaryHandler {

    @BinDecoder
    public byte[] decode(String src) {
    	System.out.println("calling decoder");
        return Base64.getDecoder().decode(src);
    }

    @BinEncoder
    public String encode(byte[] bytes) {
    	System.out.println("calling encoder");
        return Base64.getEncoder().encodeToString(bytes);
    }
}