import java.util.Objects;

public class Hash {

    public static byte[] simpleHash(byte[] input) {

        if (Objects.isNull(input)) {
            throw new IllegalArgumentException("Input string can not be null");
        }

        byte[] hash = new byte[32];

        for (int i = 0; i < input.length; i++) {
            int index = i % 32;
            hash[index] ^= input[i];
            hash[index] = (byte)((hash[index] * 31 + i) & 0xFF);
        }

        return hash;
    }
}
