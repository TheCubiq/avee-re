package com.daaw;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class xw {
    public static final String[] c = {"ISO-8859-1", "UTF-16LE", "UTF-16BE", "UTF-8"};
    public static final byte[] d = {0, 2, 1, 3};
    public static final byte[][] e = {new byte[0], new byte[]{-1, -2}, new byte[]{-2, -1}, new byte[0]};
    public static final byte[][] f = {new byte[]{0}, new byte[]{0, 0}, new byte[]{0, 0}, new byte[]{0}};
    public byte[] a;
    public byte b;

    public xw(byte b, String str) {
        this.b = b;
        this.a = f(str, d(b));
        g();
    }

    public xw(byte b, byte[] bArr) {
        if (b == 1 && h(bArr) == 2) {
            this.b = (byte) 2;
        } else {
            this.b = b;
        }
        this.a = bArr;
        g();
    }

    public static CharBuffer a(byte[] bArr, String str) {
        return Charset.forName(str).newDecoder().decode(ByteBuffer.wrap(bArr));
    }

    public static String b(byte[] bArr, String str) {
        String charBuffer = a(bArr, str).toString();
        int indexOf = charBuffer.indexOf(0);
        return indexOf == -1 ? charBuffer : charBuffer.substring(0, indexOf);
    }

    public static byte[] c(CharBuffer charBuffer, String str) {
        ByteBuffer encode = Charset.forName(str).newEncoder().encode(charBuffer);
        return wc.e(encode.array(), 0, encode.limit());
    }

    public static String d(byte b) {
        try {
            return c[b];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("Invalid text encoding " + ((int) b));
        }
    }

    public static byte[] f(String str, String str2) {
        try {
            return c(CharBuffer.wrap(str), str2);
        } catch (CharacterCodingException unused) {
            return null;
        }
    }

    public static byte h(byte[] bArr) {
        if (bArr.length >= 2 && bArr[0] == -1 && bArr[1] == -2) {
            return (byte) 1;
        }
        if (bArr.length >= 2 && bArr[0] == -2 && bArr[1] == -1) {
            return (byte) 2;
        }
        return (bArr.length >= 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) ? (byte) 3 : (byte) 0;
    }

    public byte[] e() {
        return f[this.b];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            xw xwVar = (xw) obj;
            return this.b == xwVar.b && Arrays.equals(this.a, xwVar.a);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r8 = this;
            byte[] r0 = r8.a
            int r1 = r0.length
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 < r3) goto L1d
            r1 = r0[r5]
            r6 = -1
            r7 = -2
            if (r1 != r7) goto L13
            r1 = r0[r4]
            if (r1 == r6) goto L1b
        L13:
            r1 = r0[r5]
            if (r1 != r6) goto L1d
            r1 = r0[r4]
            if (r1 != r7) goto L1d
        L1b:
            r2 = 2
            goto L34
        L1d:
            int r1 = r0.length
            if (r1 < r2) goto L33
            r1 = r0[r5]
            r6 = -17
            if (r1 != r6) goto L33
            r1 = r0[r4]
            r6 = -69
            if (r1 != r6) goto L33
            r1 = r0[r3]
            r3 = -65
            if (r1 != r3) goto L33
            goto L34
        L33:
            r2 = 0
        L34:
            byte[][] r1 = com.daaw.xw.f
            byte r3 = r8.b
            r1 = r1[r3]
            int r0 = r0.length
            int r0 = r0 - r2
            int r3 = r1.length
            if (r0 < r3) goto L58
            r0 = 0
        L40:
            int r3 = r1.length
            if (r0 >= r3) goto L54
            byte[] r3 = r8.a
            int r6 = r3.length
            int r7 = r1.length
            int r6 = r6 - r7
            int r6 = r6 + r0
            r3 = r3[r6]
            r6 = r1[r0]
            if (r3 == r6) goto L51
            r4 = 0
            goto L54
        L51:
            int r0 = r0 + 1
            goto L40
        L54:
            if (r4 == 0) goto L58
            int r0 = r1.length
            goto L59
        L58:
            r0 = 0
        L59:
            int r1 = r2 + r0
            if (r1 <= 0) goto L6b
            byte[] r1 = r8.a
            int r3 = r1.length
            int r3 = r3 - r2
            int r3 = r3 - r0
            byte[] r0 = new byte[r3]
            if (r3 <= 0) goto L69
            java.lang.System.arraycopy(r1, r2, r0, r5, r3)
        L69:
            r8.a = r0
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.xw.g():void");
    }

    public int hashCode() {
        return ((this.b + 31) * 31) + Arrays.hashCode(this.a);
    }

    public String toString() {
        try {
            return b(this.a, d(this.b));
        } catch (CharacterCodingException unused) {
            return null;
        }
    }
}
