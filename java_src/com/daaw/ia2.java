package com.daaw;
/* loaded from: classes.dex */
public final class ia2 {

    /* renamed from: a */
    public final boolean f13392a;

    /* renamed from: b */
    public final String f13393b;

    /* renamed from: c */
    public final l42 f13394c;

    /* renamed from: d */
    public final int f13395d;

    /* renamed from: e */
    public final byte[] f13396e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r6.equals("cenc") != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ia2(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        char c = 0;
        int i4 = 1;
        uo4.m7874d((i == 0) ^ (bArr2 == null));
        this.f13392a = z;
        this.f13393b = str;
        this.f13395d = i;
        this.f13396e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals("cbc1")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049879:
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0 && c != 1) {
                if (c == 2 || c == 3) {
                    i4 = 2;
                } else {
                    s95.m10493e("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                }
            }
        }
        this.f13394c = new l42(i4, bArr, i2, i3);
    }
}
