package com.daaw;
/* loaded from: classes.dex */
public final class gp8 extends Exception {
    public final String p;
    public final boolean q;
    public final ep8 r;
    public final String s;
    public final gp8 t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gp8(com.daaw.f92 r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r13 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder init failed: ["
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = "], "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r5 = r11.l
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r3 = r0.toString()
            java.lang.String r8 = r13.toString()
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.gp8.<init>(com.daaw.f92, java.lang.Throwable, boolean, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gp8(com.daaw.f92 r11, java.lang.Throwable r12, boolean r13, com.daaw.ep8 r14) {
        /*
            r10 = this;
            java.lang.String r13 = r14.a
            java.lang.String r0 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Decoder init failed: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = ", "
            r1.append(r13)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = r11.l
            int r11 = com.daaw.it5.a
            r13 = 0
            r0 = 21
            if (r11 < r0) goto L35
            boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
            if (r11 == 0) goto L35
            r11 = r12
            android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
            java.lang.String r11 = r11.getDiagnosticInfo()
            r8 = r11
            goto L36
        L35:
            r8 = r13
        L36:
            r6 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.gp8.<init>(com.daaw.f92, java.lang.Throwable, boolean, com.daaw.ep8):void");
    }

    public gp8(String str, Throwable th, String str2, boolean z, ep8 ep8Var, String str3, gp8 gp8Var) {
        super(str, th);
        this.p = str2;
        this.q = false;
        this.r = ep8Var;
        this.s = str3;
        this.t = gp8Var;
    }

    public static /* bridge */ /* synthetic */ gp8 a(gp8 gp8Var, gp8 gp8Var2) {
        return new gp8(gp8Var.getMessage(), gp8Var.getCause(), gp8Var.p, false, gp8Var.r, gp8Var.s, gp8Var2);
    }
}
