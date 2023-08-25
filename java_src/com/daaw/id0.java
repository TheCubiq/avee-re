package com.daaw;

import java.util.Arrays;
/* loaded from: classes2.dex */
public class id0 {

    /* renamed from: a */
    public String f13502a;

    /* renamed from: b */
    public int f13503b = 0;

    /* renamed from: c */
    public byte[] f13504c = null;

    /* renamed from: d */
    public boolean f13505d = false;

    /* renamed from: e */
    public boolean f13506e = false;

    /* renamed from: f */
    public boolean f13507f = false;

    /* renamed from: g */
    public boolean f13508g = false;

    /* renamed from: h */
    public boolean f13509h = false;

    /* renamed from: i */
    public boolean f13510i = false;

    /* renamed from: j */
    public boolean f13511j = false;

    /* renamed from: k */
    public boolean f13512k = false;

    public id0(byte[] bArr, int i) {
        m19918g(bArr, i);
    }

    /* renamed from: a */
    public byte[] m19922a() {
        return this.f13504c;
    }

    /* renamed from: b */
    public String m19921b() {
        return this.f13502a;
    }

    /* renamed from: c */
    public int mo17787c() {
        return this.f13503b + 10;
    }

    /* renamed from: d */
    public void m19920d() {
        for (int i = 0; i < this.f13502a.length(); i++) {
            if ((this.f13502a.charAt(i) < 'A' || this.f13502a.charAt(i) > 'Z') && (this.f13502a.charAt(i) < '0' || this.f13502a.charAt(i) > '9')) {
                throw new xg0("Not a valid frame - invalid tag " + this.f13502a);
            }
        }
    }

    /* renamed from: e */
    public void mo17786e(byte[] bArr, int i) {
        int i2 = i + 4;
        this.f13503b = C3419wc.m6192l(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            id0 id0Var = (id0) obj;
            if (this.f13509h == id0Var.f13509h && Arrays.equals(this.f13504c, id0Var.f13504c) && this.f13503b == id0Var.f13503b && this.f13512k == id0Var.f13512k && this.f13510i == id0Var.f13510i && this.f13508g == id0Var.f13508g) {
                String str = this.f13502a;
                if (str == null) {
                    if (id0Var.f13502a != null) {
                        return false;
                    }
                } else if (!str.equals(id0Var.f13502a)) {
                    return false;
                }
                return this.f13506e == id0Var.f13506e && this.f13505d == id0Var.f13505d && this.f13507f == id0Var.f13507f && this.f13511j == id0Var.f13511j;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final void m19919f(byte[] bArr, int i) {
        int i2 = i + 8;
        this.f13505d = C3419wc.m6200d(bArr[i2], 6);
        this.f13506e = C3419wc.m6200d(bArr[i2], 5);
        this.f13507f = C3419wc.m6200d(bArr[i2], 4);
        int i3 = i + 9;
        this.f13508g = C3419wc.m6200d(bArr[i3], 6);
        this.f13509h = C3419wc.m6200d(bArr[i3], 3);
        this.f13510i = C3419wc.m6200d(bArr[i3], 2);
        this.f13511j = C3419wc.m6200d(bArr[i3], 1);
        this.f13512k = C3419wc.m6200d(bArr[i3], 0);
    }

    /* renamed from: g */
    public final void m19918g(byte[] bArr, int i) {
        int mo17785h = mo17785h(bArr, i);
        m19920d();
        this.f13504c = C3419wc.m6199e(bArr, mo17785h, this.f13503b);
    }

    /* renamed from: h */
    public int mo17785h(byte[] bArr, int i) {
        this.f13502a = C3419wc.m6201c(bArr, i + 0, 4);
        mo17786e(bArr, i);
        m19919f(bArr, i);
        return i + 10;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f13509h ? 1231 : 1237) + 31) * 31) + Arrays.hashCode(this.f13504c)) * 31) + this.f13503b) * 31) + (this.f13512k ? 1231 : 1237)) * 31) + (this.f13510i ? 1231 : 1237)) * 31) + (this.f13508g ? 1231 : 1237)) * 31;
        String str = this.f13502a;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f13506e ? 1231 : 1237)) * 31) + (this.f13505d ? 1231 : 1237)) * 31) + (this.f13507f ? 1231 : 1237)) * 31) + (this.f13511j ? 1231 : 1237);
    }
}
