package premnirmal;
/* loaded from: classes2.dex */
public class XORCrypt {
    static String keyval = "thisIsAKey";
    static String value = "SampleStringToBeEncrypted";

    public static void main(String[] strArr) {
        int[] encrypt = encrypt(value, keyval);
        for (int i = 0; i < encrypt.length; i++) {
            System.out.printf("%d,", Integer.valueOf(encrypt[i]));
        }
        System.out.println("");
        System.out.println(decrypt(encrypt, keyval));
    }

    private static int[] encrypt(String str, String str2) {
        int[] iArr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            iArr[i] = (str.charAt(i) ^ str2.charAt(i % (str2.length() - 1))) + 48;
        }
        return iArr;
    }

    private static int[] string2Arr(String str) {
        String[] split = str.split(",");
        int length = split.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = Integer.valueOf(split[i]).intValue();
        }
        return iArr;
    }

    private static String decrypt(int[] iArr, String str) {
        String str2 = "";
        for (int i = 0; i < iArr.length; i++) {
            str2 = str2 + ((char) ((iArr[i] - 48) ^ str.charAt(i % (str.length() - 1))));
        }
        return str2;
    }
}
