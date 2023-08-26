package com.mpatric.mp3agic;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class EncodedText {
    public static final String CHARSET_UTF_8 = "UTF-8";
    public static final byte TEXT_ENCODING_ISO_8859_1 = 0;
    public static final byte TEXT_ENCODING_UTF_16 = 1;
    public static final byte TEXT_ENCODING_UTF_16BE = 2;
    public static final byte TEXT_ENCODING_UTF_8 = 3;
    private byte textEncoding;
    private byte[] value;
    public static final String CHARSET_ISO_8859_1 = "ISO-8859-1";
    public static final String CHARSET_UTF_16 = "UTF-16LE";
    public static final String CHARSET_UTF_16BE = "UTF-16BE";
    private static final String[] characterSets = {CHARSET_ISO_8859_1, CHARSET_UTF_16, CHARSET_UTF_16BE, "UTF-8"};
    private static final byte[] textEncodingFallback = {0, 2, 1, 3};
    private static final byte[][] boms = {new byte[0], new byte[]{-1, -2}, new byte[]{-2, -1}, new byte[0]};
    private static final byte[][] terminators = {new byte[]{0}, new byte[]{0, 0}, new byte[]{0, 0}, new byte[]{0}};

    public EncodedText(byte b, byte[] bArr) {
        if (b == 1 && textEncodingForBytesFromBOM(bArr) == 2) {
            this.textEncoding = (byte) 2;
        } else {
            this.textEncoding = b;
        }
        this.value = bArr;
        stripBomAndTerminator();
    }

    public EncodedText(String str) throws IllegalArgumentException {
        byte[] bArr;
        for (byte b : textEncodingFallback) {
            this.textEncoding = b;
            byte[] stringToBytes = stringToBytes(str, characterSetForTextEncoding(b));
            this.value = stringToBytes;
            if (stringToBytes != null && toString() != null) {
                stripBomAndTerminator();
                return;
            }
        }
        throw new IllegalArgumentException("Invalid string, could not find appropriate encoding");
    }

    public EncodedText(String str, byte b) throws IllegalArgumentException, CharacterCodingException {
        this(str);
        setTextEncoding(b, true);
    }

    public EncodedText(byte b, String str) {
        this.textEncoding = b;
        this.value = stringToBytes(str, characterSetForTextEncoding(b));
        stripBomAndTerminator();
    }

    public EncodedText(byte[] bArr) {
        this(textEncodingForBytesFromBOM(bArr), bArr);
    }

    private static byte textEncodingForBytesFromBOM(byte[] bArr) {
        if (bArr.length >= 2 && bArr[0] == -1 && bArr[1] == -2) {
            return (byte) 1;
        }
        if (bArr.length >= 2 && bArr[0] == -2 && bArr[1] == -1) {
            return (byte) 2;
        }
        return (bArr.length >= 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) ? (byte) 3 : (byte) 0;
    }

    private static String characterSetForTextEncoding(byte b) {
        try {
            return characterSets[b];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("Invalid text encoding " + ((int) b));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r0[1] == (-2)) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void stripBomAndTerminator() {
        byte[] bArr;
        int i;
        byte[] bArr2 = this.value;
        int i2 = 3;
        boolean z = true;
        if (bArr2.length >= 2) {
            if (bArr2[0] != -2 || bArr2[1] != -1) {
                byte[] bArr3 = this.value;
                if (bArr3[0] == -1) {
                }
            }
            i2 = 2;
            bArr = terminators[this.textEncoding];
            if (this.value.length - i2 >= bArr.length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= bArr.length) {
                        break;
                    }
                    byte[] bArr4 = this.value;
                    if (bArr4[(bArr4.length - bArr.length) + i3] != bArr[i3]) {
                        z = false;
                        break;
                    }
                    i3++;
                }
                if (z) {
                    i = bArr.length;
                    if (i2 + i > 0) {
                        byte[] bArr5 = this.value;
                        int length = (bArr5.length - i2) - i;
                        byte[] bArr6 = new byte[length];
                        if (length > 0) {
                            System.arraycopy(bArr5, i2, bArr6, 0, length);
                        }
                        this.value = bArr6;
                        return;
                    }
                    return;
                }
            }
            i = 0;
            if (i2 + i > 0) {
            }
        }
        byte[] bArr7 = this.value;
        if (bArr7.length < 3 || bArr7[0] != -17 || bArr7[1] != -69 || bArr7[2] != -65) {
            i2 = 0;
        }
        bArr = terminators[this.textEncoding];
        if (this.value.length - i2 >= bArr.length) {
        }
        i = 0;
        if (i2 + i > 0) {
        }
    }

    public byte getTextEncoding() {
        return this.textEncoding;
    }

    public void setTextEncoding(byte b) throws CharacterCodingException {
        setTextEncoding(b, true);
    }

    public void setTextEncoding(byte b, boolean z) throws CharacterCodingException {
        byte b2 = this.textEncoding;
        if (b2 != b) {
            byte[] charBufferToBytes = charBufferToBytes(bytesToCharBuffer(this.value, characterSetForTextEncoding(b2)), characterSetForTextEncoding(b));
            this.textEncoding = b;
            this.value = charBufferToBytes;
        }
    }

    public byte[] getTerminator() {
        return terminators[this.textEncoding];
    }

    public byte[] toBytes() {
        return toBytes(false, false);
    }

    public byte[] toBytes(boolean z) {
        return toBytes(z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] toBytes(boolean z, boolean z2) {
        int i;
        byte[] bArr;
        characterSetForTextEncoding(this.textEncoding);
        int length = this.value.length + (z ? boms[this.textEncoding].length : 0) + (z2 ? getTerminator().length : 0);
        byte[] bArr2 = this.value;
        if (length == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[length];
        if (z) {
            byte[][] bArr4 = boms;
            byte b = this.textEncoding;
            if (bArr4[b].length > 0) {
                System.arraycopy(bArr4[b], 0, bArr3, 0, bArr4[b].length);
                i = boms[this.textEncoding].length + 0;
                bArr = this.value;
                if (bArr.length > 0) {
                    System.arraycopy(bArr, 0, bArr3, i, bArr.length);
                    i += this.value.length;
                }
                if (z2) {
                    byte[] terminator = getTerminator();
                    if (terminator.length > 0) {
                        System.arraycopy(terminator, 0, bArr3, i, terminator.length);
                    }
                }
                return bArr3;
            }
        }
        i = 0;
        bArr = this.value;
        if (bArr.length > 0) {
        }
        if (z2) {
        }
        return bArr3;
    }

    public String toString() {
        try {
            return bytesToString(this.value, characterSetForTextEncoding(this.textEncoding));
        } catch (CharacterCodingException unused) {
            return null;
        }
    }

    public String getCharacterSet() {
        return characterSetForTextEncoding(this.textEncoding);
    }

    public int hashCode() {
        return ((this.textEncoding + 31) * 31) + Arrays.hashCode(this.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EncodedText encodedText = (EncodedText) obj;
            return this.textEncoding == encodedText.textEncoding && Arrays.equals(this.value, encodedText.value);
        }
        return false;
    }

    private static String bytesToString(byte[] bArr, String str) throws CharacterCodingException {
        String charBuffer = bytesToCharBuffer(bArr, str).toString();
        int indexOf = charBuffer.indexOf(0);
        return indexOf == -1 ? charBuffer : charBuffer.substring(0, indexOf);
    }

    protected static CharBuffer bytesToCharBuffer(byte[] bArr, String str) throws CharacterCodingException {
        return Charset.forName(str).newDecoder().decode(ByteBuffer.wrap(bArr));
    }

    private static byte[] stringToBytes(String str, String str2) {
        try {
            return charBufferToBytes(CharBuffer.wrap(str), str2);
        } catch (CharacterCodingException unused) {
            return null;
        }
    }

    protected static byte[] charBufferToBytes(CharBuffer charBuffer, String str) throws CharacterCodingException {
        ByteBuffer encode = Charset.forName(str).newEncoder().encode(charBuffer);
        return BufferTools.copyBuffer(encode.array(), 0, encode.limit());
    }
}
