package com.mpatric.mp3agic;

import java.io.UnsupportedEncodingException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
/* loaded from: classes2.dex */
public class BufferTools {
    protected static final String defaultCharsetName = "ISO-8859-1";

    public static boolean checkBit(byte b, int i) {
        return (b & (1 << i)) != 0;
    }

    public static byte[] packInteger(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte setBit(byte b, int i, boolean z) {
        return (byte) (z ? b | (1 << i) : b & ((1 << i) ^ (-1)));
    }

    public static int shiftByte(byte b, int i) {
        int i2 = b & 255;
        return i < 0 ? i2 << (-i) : i > 0 ? i2 >> i : i2;
    }

    public static String byteBufferToStringIgnoringEncodingIssues(byte[] bArr, int i, int i2) {
        try {
            return byteBufferToString(bArr, i, i2, "ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String byteBufferToString(byte[] bArr, int i, int i2) throws UnsupportedEncodingException {
        return byteBufferToString(bArr, i, i2, "ISO-8859-1");
    }

    public static String byteBufferToString(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return i2 < 1 ? "" : new String(bArr, i, i2, str);
    }

    public static byte[] stringToByteBufferIgnoringEncodingIssues(String str, int i, int i2) {
        try {
            return stringToByteBuffer(str, i, i2);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static byte[] stringToByteBuffer(String str, int i, int i2) throws UnsupportedEncodingException {
        return stringToByteBuffer(str, i, i2, "ISO-8859-1");
    }

    public static byte[] stringToByteBuffer(String str, int i, int i2, String str2) throws UnsupportedEncodingException {
        return str.substring(i, i2 + i).getBytes(str2);
    }

    public static void stringIntoByteBuffer(String str, int i, int i2, byte[] bArr, int i3) throws UnsupportedEncodingException {
        stringIntoByteBuffer(str, i, i2, bArr, i3, "ISO-8859-1");
    }

    public static void stringIntoByteBuffer(String str, int i, int i2, byte[] bArr, int i3, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str.substring(i, i2 + i).getBytes(str2);
        if (bytes.length > 0) {
            System.arraycopy(bytes, 0, bArr, i3, bytes.length);
        }
    }

    public static String trimStringRight(String str) {
        int length = str.length() - 1;
        while (length >= 0 && str.charAt(length) <= ' ') {
            length--;
        }
        return length == str.length() + (-1) ? str : length < 0 ? "" : str.substring(0, length + 1);
    }

    public static String padStringRight(String str, int i, char c) {
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        while (sb.length() < i) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static int unpackInteger(byte b, byte b2, byte b3, byte b4) {
        return (b4 & UByte.MAX_VALUE) + shiftByte(b3, -8) + shiftByte(b2, -16) + shiftByte(b, -24);
    }

    public static int unpackSynchsafeInteger(byte b, byte b2, byte b3, byte b4) {
        return ((byte) (b4 & ByteCompanionObject.MAX_VALUE)) + shiftByte((byte) (b3 & ByteCompanionObject.MAX_VALUE), -7) + shiftByte((byte) (b2 & ByteCompanionObject.MAX_VALUE), -14) + shiftByte((byte) (b & ByteCompanionObject.MAX_VALUE), -21);
    }

    public static byte[] packSynchsafeInteger(int i) {
        byte[] bArr = new byte[4];
        packSynchsafeInteger(i, bArr, 0);
        return bArr;
    }

    public static void packSynchsafeInteger(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i & 127);
        bArr[i2 + 2] = (byte) ((i >> 7) & 127);
        bArr[i2 + 1] = (byte) ((i >> 14) & 127);
        bArr[i2 + 0] = (byte) ((i >> 21) & 127);
    }

    public static byte[] copyBuffer(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        if (i2 > 0) {
            System.arraycopy(bArr, i, bArr2, 0, i2);
        }
        return bArr2;
    }

    public static void copyIntoByteBuffer(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 > 0) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
        }
    }

    public static int sizeUnsynchronisationWouldAdd(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < bArr.length - 1; i2++) {
            if (bArr[i2] == -1) {
                int i3 = i2 + 1;
                if ((bArr[i3] & (-32)) == -32 || bArr[i3] == 0) {
                    i++;
                }
            }
        }
        return (bArr.length <= 0 || bArr[bArr.length + (-1)] != -1) ? i : i + 1;
    }

    public static byte[] unsynchroniseBuffer(byte[] bArr) {
        int sizeUnsynchronisationWouldAdd = sizeUnsynchronisationWouldAdd(bArr);
        if (sizeUnsynchronisationWouldAdd == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length + sizeUnsynchronisationWouldAdd];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length - 1; i2++) {
            int i3 = i + 1;
            bArr2[i] = bArr[i2];
            if (bArr[i2] == -1) {
                int i4 = i2 + 1;
                if ((bArr[i4] & (-32)) == -32 || bArr[i4] == 0) {
                    i = i3 + 1;
                    bArr2[i3] = 0;
                }
            }
            i = i3;
        }
        int i5 = i + 1;
        bArr2[i] = bArr[bArr.length - 1];
        if (bArr[bArr.length - 1] == -1) {
            bArr2[i5] = 0;
        }
        return bArr2;
    }

    public static int sizeSynchronisationWouldSubtract(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < bArr.length - 2; i2++) {
            if (bArr[i2] == -1 && bArr[i2 + 1] == 0) {
                int i3 = i2 + 2;
                if ((bArr[i3] & (-32)) == -32 || bArr[i3] == 0) {
                    i++;
                }
            }
        }
        return (bArr.length > 1 && bArr[bArr.length + (-2)] == -1 && bArr[bArr.length - 1] == 0) ? i + 1 : i;
    }

    public static byte[] synchroniseBuffer(byte[] bArr) {
        int sizeSynchronisationWouldSubtract = sizeSynchronisationWouldSubtract(bArr);
        if (sizeSynchronisationWouldSubtract == 0) {
            return bArr;
        }
        int length = bArr.length - sizeSynchronisationWouldSubtract;
        byte[] bArr2 = new byte[length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i < i3) {
                bArr2[i] = bArr[i2];
                if (bArr[i2] == -1) {
                    int i4 = i2 + 1;
                    if (bArr[i4] == 0) {
                        int i5 = i2 + 2;
                        if ((bArr[i5] & (-32)) == -32 || bArr[i5] == 0) {
                            i2 = i4;
                        }
                    }
                }
                i2++;
                i++;
            } else {
                bArr2[i3] = bArr[i2];
                return bArr2;
            }
        }
    }

    public static String substitute(String str, String str2, String str3) {
        if (str2.length() < 1 || !str.contains(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf < 0) {
                break;
            }
            if (indexOf > i2) {
                sb.append(str.substring(i2, indexOf));
            }
            if (str3 != null) {
                sb.append(str3);
            }
            i2 = str2.length() + indexOf;
            i = indexOf + 1;
        }
        if (i2 < str.length()) {
            sb.append(str.substring(i2));
        }
        return sb.toString();
    }

    public static String asciiOnly(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~') {
                sb.append('?');
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static int indexOfTerminator(byte[] bArr) {
        return indexOfTerminator(bArr, 0);
    }

    public static int indexOfTerminator(byte[] bArr, int i) {
        return indexOfTerminator(bArr, 0, 1);
    }

    public static int indexOfTerminator(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 <= bArr.length - i2; i3++) {
            if ((i3 - i) % i2 == 0) {
                int i4 = 0;
                while (i4 < i2 && bArr[i3 + i4] == 0) {
                    i4++;
                }
                if (i4 == i2) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static int indexOfTerminatorForEncoding(byte[] bArr, int i, int i2) {
        int i3 = 2;
        if (i2 != 1 && i2 != 2) {
            i3 = 1;
        }
        return indexOfTerminator(bArr, i, i3);
    }
}
