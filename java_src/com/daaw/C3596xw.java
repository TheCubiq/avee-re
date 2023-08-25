package com.daaw;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
/* renamed from: com.daaw.xw */
/* loaded from: classes2.dex */
public class C3596xw {

    /* renamed from: c */
    public static final String[] f33001c = {"ISO-8859-1", "UTF-16LE", "UTF-16BE", "UTF-8"};

    /* renamed from: d */
    public static final byte[] f33002d = {0, 2, 1, 3};

    /* renamed from: e */
    public static final byte[][] f33003e = {new byte[0], new byte[]{-1, -2}, new byte[]{-2, -1}, new byte[0]};

    /* renamed from: f */
    public static final byte[][] f33004f = {new byte[]{0}, new byte[]{0, 0}, new byte[]{0, 0}, new byte[]{0}};

    /* renamed from: a */
    public byte[] f33005a;

    /* renamed from: b */
    public byte f33006b;

    public C3596xw(byte b, String str) {
        this.f33006b = b;
        this.f33005a = m4476f(str, m4478d(b));
        m4475g();
    }

    public C3596xw(byte b, byte[] bArr) {
        if (b == 1 && m4474h(bArr) == 2) {
            this.f33006b = (byte) 2;
        } else {
            this.f33006b = b;
        }
        this.f33005a = bArr;
        m4475g();
    }

    /* renamed from: a */
    public static CharBuffer m4481a(byte[] bArr, String str) {
        return Charset.forName(str).newDecoder().decode(ByteBuffer.wrap(bArr));
    }

    /* renamed from: b */
    public static String m4480b(byte[] bArr, String str) {
        String charBuffer = m4481a(bArr, str).toString();
        int indexOf = charBuffer.indexOf(0);
        return indexOf == -1 ? charBuffer : charBuffer.substring(0, indexOf);
    }

    /* renamed from: c */
    public static byte[] m4479c(CharBuffer charBuffer, String str) {
        ByteBuffer encode = Charset.forName(str).newEncoder().encode(charBuffer);
        return C3419wc.m6199e(encode.array(), 0, encode.limit());
    }

    /* renamed from: d */
    public static String m4478d(byte b) {
        try {
            return f33001c[b];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("Invalid text encoding " + ((int) b));
        }
    }

    /* renamed from: f */
    public static byte[] m4476f(String str, String str2) {
        try {
            return m4479c(CharBuffer.wrap(str), str2);
        } catch (CharacterCodingException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static byte m4474h(byte[] bArr) {
        if (bArr.length >= 2 && bArr[0] == -1 && bArr[1] == -2) {
            return (byte) 1;
        }
        if (bArr.length >= 2 && bArr[0] == -2 && bArr[1] == -1) {
            return (byte) 2;
        }
        return (bArr.length >= 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) ? (byte) 3 : (byte) 0;
    }

    /* renamed from: e */
    public byte[] m4477e() {
        return f33004f[this.f33006b];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3596xw c3596xw = (C3596xw) obj;
            return this.f33006b == c3596xw.f33006b && Arrays.equals(this.f33005a, c3596xw.f33005a);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4475g() {
        int i;
        byte[] bArr = this.f33005a;
        int i2 = 3;
        boolean z = true;
        if (bArr.length >= 2 && ((bArr[0] == -2 && bArr[1] == -1) || (bArr[0] == -1 && bArr[1] == -2))) {
            i2 = 2;
        } else if (bArr.length < 3 || bArr[0] != -17 || bArr[1] != -69 || bArr[2] != -65) {
            i2 = 0;
        }
        byte[] bArr2 = f33004f[this.f33006b];
        if (bArr.length - i2 >= bArr2.length) {
            int i3 = 0;
            while (true) {
                if (i3 >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = this.f33005a;
                if (bArr3[(bArr3.length - bArr2.length) + i3] != bArr2[i3]) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (z) {
                i = bArr2.length;
                if (i2 + i <= 0) {
                    byte[] bArr4 = this.f33005a;
                    int length = (bArr4.length - i2) - i;
                    byte[] bArr5 = new byte[length];
                    if (length > 0) {
                        System.arraycopy(bArr4, i2, bArr5, 0, length);
                    }
                    this.f33005a = bArr5;
                    return;
                }
                return;
            }
        }
        i = 0;
        if (i2 + i <= 0) {
        }
    }

    public int hashCode() {
        return ((this.f33006b + 31) * 31) + Arrays.hashCode(this.f33005a);
    }

    public String toString() {
        try {
            return m4480b(this.f33005a, m4478d(this.f33006b));
        } catch (CharacterCodingException unused) {
            return null;
        }
    }
}
