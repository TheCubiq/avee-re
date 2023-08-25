package com.daaw;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class bv0 implements oe1 {

    /* renamed from: a */
    public transient pe1 f5199a = null;

    /* renamed from: b */
    public final List<String> f5200b = new ArrayList();

    @Override // com.daaw.oe1
    /* renamed from: a */
    public pe1 mo2137a() {
        return this.f5199a;
    }

    @Override // com.daaw.oe1
    /* renamed from: b */
    public void mo2136b(OutputStream outputStream, String str) {
        byte[] bArr = new byte[512];
        Arrays.fill(bArr, (byte) 0);
        bArr[4] = 105;
        bArr[5] = 114;
        bArr[6] = 105;
        bArr[7] = 118;
        bArr[8] = 101;
        bArr[9] = 114;
        bArr[10] = 32;
        bArr[11] = 85;
        bArr[12] = 77;
        bArr[13] = 83;
        bArr[14] = 32;
        bArr[15] = 80;
        bArr[16] = 76;
        bArr[17] = 65;
        int size = this.f5200b.size();
        bArr[3] = (byte) ((size & 255) >> 0);
        bArr[2] = (byte) ((size & 65280) >> 8);
        bArr[1] = (byte) ((16711680 & size) >> 16);
        bArr[0] = (byte) ((size & (-16777216)) >> 24);
        outputStream.write(bArr);
        for (String str2 : this.f5200b) {
            Arrays.fill(bArr, (byte) 0);
            int lastIndexOf = str2.lastIndexOf(47);
            int lastIndexOf2 = str2.lastIndexOf(92);
            int i = (lastIndexOf > lastIndexOf2 ? lastIndexOf + 1 : lastIndexOf2 > lastIndexOf ? lastIndexOf2 + 1 : 0) + 1;
            bArr[1] = (byte) ((i & 255) >> 0);
            bArr[0] = (byte) ((i & 65280) >> 8);
            byte[] bytes = str2.getBytes("UTF-16BE");
            System.arraycopy(bytes, 0, bArr, 2, bytes.length);
            outputStream.write(bArr);
        }
        outputStream.flush();
    }

    /* renamed from: c */
    public List<String> m25808c() {
        return this.f5200b;
    }

    /* renamed from: d */
    public void m25807d(pe1 pe1Var) {
        this.f5199a = pe1Var;
    }
}
