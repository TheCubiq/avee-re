package com.daaw;

import com.daaw.ce0;
import java.util.List;
/* loaded from: classes.dex */
public class o01 implements ce0 {

    /* renamed from: b */
    public ce0.InterfaceC0949a f20907b = null;

    /* renamed from: a */
    public int f20906a = 0;

    @Override // com.daaw.ce0
    /* renamed from: a */
    public int mo13787a() {
        return this.f20906a;
    }

    @Override // com.daaw.ce0
    /* renamed from: b */
    public void mo13786b(int i) {
        this.f20906a = i;
    }

    @Override // com.daaw.ce0
    /* renamed from: c */
    public boolean mo13785c(List<Integer> list, int i, int i2, boolean z, int i3) {
        boolean z2;
        int m17246f = l01.m17246f(this.f20906a, list, i, i2, z);
        this.f20906a = m17246f;
        if (m17246f < 0) {
            this.f20906a = l01.m17243i(m17246f, list, i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f20906a < 0) {
            this.f20906a = 0;
            z2 = true;
        }
        if (this.f20906a >= i3) {
            this.f20906a = i3 - 1;
            z2 = true;
        }
        ce0.InterfaceC0949a interfaceC0949a = this.f20907b;
        if (interfaceC0949a != null) {
            interfaceC0949a.mo17251a(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.ce0
    /* renamed from: d */
    public int mo13784d(int i) {
        return i;
    }

    @Override // com.daaw.ce0
    /* renamed from: e */
    public boolean mo13783e(int i) {
        int mo13780h = mo13780h(false);
        this.f20906a = mo13780h;
        if (mo13780h >= i) {
            this.f20906a = i - 1;
            return true;
        }
        return false;
    }

    @Override // com.daaw.ce0
    /* renamed from: f */
    public int mo13782f(int i, int i2) {
        return i;
    }

    @Override // com.daaw.ce0
    /* renamed from: g */
    public void mo13781g() {
        int m14660m = m14660m(false);
        this.f20906a = m14660m;
        if (m14660m < 0) {
            this.f20906a = 0;
        }
    }

    @Override // com.daaw.ce0
    /* renamed from: h */
    public int mo13780h(boolean z) {
        return this.f20906a + 1;
    }

    @Override // com.daaw.ce0
    /* renamed from: i */
    public int mo13779i(boolean z) {
        return this.f20906a;
    }

    @Override // com.daaw.ce0
    /* renamed from: j */
    public void mo13778j() {
        this.f20906a = 0;
    }

    @Override // com.daaw.ce0
    /* renamed from: k */
    public boolean mo13777k(int i, int i2, int i3, boolean z, int i4) {
        boolean z2;
        int m17244h = l01.m17244h(this.f20906a, i, i2, i3, z);
        this.f20906a = m17244h;
        if (m17244h < 0) {
            this.f20906a = i - 1;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f20906a < 0) {
            this.f20906a = 0;
            z2 = true;
        }
        if (this.f20906a >= i4) {
            this.f20906a = i4 - 1;
            z2 = true;
        }
        ce0.InterfaceC0949a interfaceC0949a = this.f20907b;
        if (interfaceC0949a != null) {
            interfaceC0949a.mo17251a(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.ce0
    /* renamed from: l */
    public void mo13776l(int i) {
        this.f20906a = i;
    }

    /* renamed from: m */
    public int m14660m(boolean z) {
        return this.f20906a - 1;
    }

    /* renamed from: n */
    public void m14659n(int i, ce0.InterfaceC0949a interfaceC0949a) {
        this.f20907b = interfaceC0949a;
        this.f20906a = 0;
        mo13786b(i);
        if (interfaceC0949a != null) {
            interfaceC0949a.mo17251a(this, false, true);
        }
    }
}
