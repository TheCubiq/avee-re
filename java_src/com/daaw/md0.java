package com.daaw;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class md0 extends AbstractC1892k {

    /* renamed from: b */
    public String f18799b;

    /* renamed from: c */
    public byte f18800c;

    /* renamed from: d */
    public C3596xw f18801d;

    /* renamed from: e */
    public byte[] f18802e;

    public md0(boolean z, byte[] bArr) {
        super(z);
        m18114a(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    @Override // com.daaw.AbstractC1892k
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16087b(byte[] bArr) {
        int m6197g;
        int m6198f = C3419wc.m6198f(bArr, 1, 1);
        if (m6198f >= 0) {
            try {
                this.f18799b = C3419wc.m6203a(bArr, 1, m6198f - 1);
            } catch (UnsupportedEncodingException unused) {
            }
            this.f18800c = bArr[m6198f + 1];
            int i = m6198f + 2;
            m6197g = C3419wc.m6197g(bArr, i, bArr[0]);
            if (m6197g < 0) {
                C3596xw c3596xw = new C3596xw(bArr[0], C3419wc.m6199e(bArr, i, m6197g - i));
                this.f18801d = c3596xw;
                i = m6197g + c3596xw.m4477e().length;
            } else {
                this.f18801d = new C3596xw(bArr[0], "");
            }
            this.f18802e = C3419wc.m6199e(bArr, i, bArr.length - i);
        }
        this.f18799b = "image/unknown";
        this.f18800c = bArr[m6198f + 1];
        int i2 = m6198f + 2;
        m6197g = C3419wc.m6197g(bArr, i2, bArr[0]);
        if (m6197g < 0) {
        }
        this.f18802e = C3419wc.m6199e(bArr, i2, bArr.length - i2);
    }

    /* renamed from: c */
    public byte[] m16086c() {
        return this.f18802e;
    }

    @Override // com.daaw.AbstractC1892k
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && getClass() == obj.getClass()) {
            md0 md0Var = (md0) obj;
            C3596xw c3596xw = this.f18801d;
            if (c3596xw == null) {
                if (md0Var.f18801d != null) {
                    return false;
                }
            } else if (!c3596xw.equals(md0Var.f18801d)) {
                return false;
            }
            if (Arrays.equals(this.f18802e, md0Var.f18802e)) {
                String str = this.f18799b;
                if (str == null) {
                    if (md0Var.f18799b != null) {
                        return false;
                    }
                } else if (!str.equals(md0Var.f18799b)) {
                    return false;
                }
                return this.f18800c == md0Var.f18800c;
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.AbstractC1892k
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        C3596xw c3596xw = this.f18801d;
        int hashCode2 = (((hashCode + (c3596xw == null ? 0 : c3596xw.hashCode())) * 31) + Arrays.hashCode(this.f18802e)) * 31;
        String str = this.f18799b;
        return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f18800c;
    }
}
