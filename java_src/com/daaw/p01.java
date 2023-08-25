package com.daaw;

import com.daaw.ce0;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public class p01 implements ce0 {

    /* renamed from: a */
    public int f22171a = 0;

    /* renamed from: c */
    public List<Integer> f22173c = new ArrayList();

    /* renamed from: b */
    public ce0.InterfaceC0949a f22172b = null;

    @Override // com.daaw.ce0
    /* renamed from: a */
    public int mo13787a() {
        return this.f22171a;
    }

    @Override // com.daaw.ce0
    /* renamed from: b */
    public void mo13786b(int i) {
        ListIterator<Integer> listIterator = this.f22173c.listIterator();
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            if (listIterator.next().intValue() == i) {
                this.f22171a = nextIndex;
                return;
            }
        }
    }

    @Override // com.daaw.ce0
    /* renamed from: c */
    public boolean mo13785c(List<Integer> list, int i, int i2, boolean z, int i3) {
        ListIterator<Integer> listIterator = this.f22173c.listIterator();
        boolean z2 = false;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int m17246f = l01.m17246f(listIterator.next().intValue(), list, i, i2, z);
            if (m17246f < 0) {
                listIterator.remove();
                if (l01.m17242j(this.f22171a, nextIndex) < 0) {
                    this.f22171a = nextIndex;
                    if (nextIndex < 0) {
                        this.f22171a = 0;
                    }
                    if (this.f22171a >= this.f22173c.size()) {
                        this.f22171a = this.f22173c.size() - 1;
                    }
                    z2 = true;
                }
            } else {
                listIterator.set(Integer.valueOf(m17246f));
            }
        }
        ce0.InterfaceC0949a interfaceC0949a = this.f22172b;
        if (interfaceC0949a != null) {
            interfaceC0949a.mo17251a(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.ce0
    /* renamed from: d */
    public int mo13784d(int i) {
        return Math.min(this.f22173c.size(), i);
    }

    @Override // com.daaw.ce0
    /* renamed from: e */
    public boolean mo13783e(int i) {
        int i2 = this.f22171a + 1;
        this.f22171a = i2;
        if (i2 >= this.f22173c.size()) {
            this.f22171a = this.f22173c.size() - 1;
            return true;
        }
        return false;
    }

    @Override // com.daaw.ce0
    /* renamed from: f */
    public int mo13782f(int i, int i2) {
        if (i < 0 || i >= this.f22173c.size()) {
            return -1;
        }
        return this.f22173c.get(i).intValue();
    }

    @Override // com.daaw.ce0
    /* renamed from: g */
    public void mo13781g() {
        int i = this.f22171a - 1;
        this.f22171a = i;
        if (i < 0) {
            this.f22171a = 0;
        }
    }

    @Override // com.daaw.ce0
    /* renamed from: h */
    public int mo13780h(boolean z) {
        int i = this.f22171a + 1;
        if (i < 0 || i >= this.f22173c.size()) {
            return -1;
        }
        return this.f22173c.get(i).intValue();
    }

    @Override // com.daaw.ce0
    /* renamed from: i */
    public int mo13779i(boolean z) {
        int i = this.f22171a;
        if (i < 0 || i >= this.f22173c.size()) {
            return -1;
        }
        return this.f22173c.get(this.f22171a).intValue();
    }

    @Override // com.daaw.ce0
    /* renamed from: j */
    public void mo13778j() {
        this.f22171a = 0;
    }

    @Override // com.daaw.ce0
    /* renamed from: k */
    public boolean mo13777k(int i, int i2, int i3, boolean z, int i4) {
        ListIterator<Integer> listIterator = this.f22173c.listIterator();
        boolean z2 = false;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int m17244h = l01.m17244h(listIterator.next().intValue(), i, i2, i3, z);
            if (m17244h < 0) {
                listIterator.remove();
                if (l01.m17245g(this.f22171a, nextIndex, -1) < 0) {
                    this.f22171a = nextIndex;
                    if (nextIndex < 0) {
                        this.f22171a = 0;
                    }
                    if (this.f22171a >= this.f22173c.size()) {
                        this.f22171a = this.f22173c.size() - 1;
                    }
                    z2 = true;
                }
            } else {
                listIterator.set(Integer.valueOf(m17244h));
            }
        }
        ce0.InterfaceC0949a interfaceC0949a = this.f22172b;
        if (interfaceC0949a != null) {
            interfaceC0949a.mo17251a(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.ce0
    /* renamed from: l */
    public void mo13776l(int i) {
        this.f22171a = i;
    }

    /* renamed from: m */
    public void m13775m(int i, List<Integer> list, ce0.InterfaceC0949a interfaceC0949a) {
        this.f22172b = interfaceC0949a;
        this.f22173c = list;
        this.f22171a = 0;
        mo13786b(i);
        if (interfaceC0949a != null) {
            interfaceC0949a.mo17251a(this, false, true);
        }
    }
}
