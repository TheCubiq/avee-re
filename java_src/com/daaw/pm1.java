package com.daaw;

import com.daaw.sm1;
/* loaded from: classes.dex */
public final class pm1 {

    /* renamed from: a */
    public final boolean f23051a;

    /* renamed from: b */
    public final String f23052b;

    /* renamed from: c */
    public final sm1.C2956a f23053c;

    /* renamed from: d */
    public final int f23054d;

    /* renamed from: e */
    public final byte[] f23055e;

    public pm1(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        C2914s6.m10690a((bArr2 == null) ^ (i == 0));
        this.f23051a = z;
        this.f23052b = str;
        this.f23054d = i;
        this.f23055e = bArr2;
        this.f23053c = new sm1.C2956a(m13289a(str), bArr, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m13289a(String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported protection scheme type '");
                sb.append(str);
                sb.append("'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
