package com.daaw;

import com.daaw.ce0;
import java.util.List;
/* loaded from: classes.dex */
public class o01 implements ce0 {
    public ce0.a b = null;
    public int a = 0;

    @Override // com.daaw.ce0
    public int a() {
        return this.a;
    }

    @Override // com.daaw.ce0
    public void b(int i) {
        this.a = i;
    }

    @Override // com.daaw.ce0
    public boolean c(List<Integer> list, int i, int i2, boolean z, int i3) {
        boolean z2;
        int f = l01.f(this.a, list, i, i2, z);
        this.a = f;
        if (f < 0) {
            this.a = l01.i(f, list, i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.a < 0) {
            this.a = 0;
            z2 = true;
        }
        if (this.a >= i3) {
            this.a = i3 - 1;
            z2 = true;
        }
        ce0.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.ce0
    public int d(int i) {
        return i;
    }

    @Override // com.daaw.ce0
    public boolean e(int i) {
        int h = h(false);
        this.a = h;
        if (h >= i) {
            this.a = i - 1;
            return true;
        }
        return false;
    }

    @Override // com.daaw.ce0
    public int f(int i, int i2) {
        return i;
    }

    @Override // com.daaw.ce0
    public void g() {
        int m = m(false);
        this.a = m;
        if (m < 0) {
            this.a = 0;
        }
    }

    @Override // com.daaw.ce0
    public int h(boolean z) {
        return this.a + 1;
    }

    @Override // com.daaw.ce0
    public int i(boolean z) {
        return this.a;
    }

    @Override // com.daaw.ce0
    public void j() {
        this.a = 0;
    }

    @Override // com.daaw.ce0
    public boolean k(int i, int i2, int i3, boolean z, int i4) {
        boolean z2;
        int h = l01.h(this.a, i, i2, i3, z);
        this.a = h;
        if (h < 0) {
            this.a = i - 1;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.a < 0) {
            this.a = 0;
            z2 = true;
        }
        if (this.a >= i4) {
            this.a = i4 - 1;
            z2 = true;
        }
        ce0.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.ce0
    public void l(int i) {
        this.a = i;
    }

    public int m(boolean z) {
        return this.a - 1;
    }

    public void n(int i, ce0.a aVar) {
        this.b = aVar;
        this.a = 0;
        b(i);
        if (aVar != null) {
            aVar.a(this, false, true);
        }
    }
}
