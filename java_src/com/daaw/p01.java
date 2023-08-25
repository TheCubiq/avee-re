package com.daaw;

import com.daaw.ce0;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public class p01 implements ce0 {
    public int a = 0;
    public List<Integer> c = new ArrayList();
    public ce0.a b = null;

    @Override // com.daaw.ce0
    public int a() {
        return this.a;
    }

    @Override // com.daaw.ce0
    public void b(int i) {
        ListIterator<Integer> listIterator = this.c.listIterator();
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            if (listIterator.next().intValue() == i) {
                this.a = nextIndex;
                return;
            }
        }
    }

    @Override // com.daaw.ce0
    public boolean c(List<Integer> list, int i, int i2, boolean z, int i3) {
        ListIterator<Integer> listIterator = this.c.listIterator();
        boolean z2 = false;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int f = l01.f(listIterator.next().intValue(), list, i, i2, z);
            if (f < 0) {
                listIterator.remove();
                if (l01.j(this.a, nextIndex) < 0) {
                    this.a = nextIndex;
                    if (nextIndex < 0) {
                        this.a = 0;
                    }
                    if (this.a >= this.c.size()) {
                        this.a = this.c.size() - 1;
                    }
                    z2 = true;
                }
            } else {
                listIterator.set(Integer.valueOf(f));
            }
        }
        ce0.a aVar = this.b;
        if (aVar != null) {
            aVar.a(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.ce0
    public int d(int i) {
        return Math.min(this.c.size(), i);
    }

    @Override // com.daaw.ce0
    public boolean e(int i) {
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 >= this.c.size()) {
            this.a = this.c.size() - 1;
            return true;
        }
        return false;
    }

    @Override // com.daaw.ce0
    public int f(int i, int i2) {
        if (i < 0 || i >= this.c.size()) {
            return -1;
        }
        return this.c.get(i).intValue();
    }

    @Override // com.daaw.ce0
    public void g() {
        int i = this.a - 1;
        this.a = i;
        if (i < 0) {
            this.a = 0;
        }
    }

    @Override // com.daaw.ce0
    public int h(boolean z) {
        int i = this.a + 1;
        if (i < 0 || i >= this.c.size()) {
            return -1;
        }
        return this.c.get(i).intValue();
    }

    @Override // com.daaw.ce0
    public int i(boolean z) {
        int i = this.a;
        if (i < 0 || i >= this.c.size()) {
            return -1;
        }
        return this.c.get(this.a).intValue();
    }

    @Override // com.daaw.ce0
    public void j() {
        this.a = 0;
    }

    @Override // com.daaw.ce0
    public boolean k(int i, int i2, int i3, boolean z, int i4) {
        ListIterator<Integer> listIterator = this.c.listIterator();
        boolean z2 = false;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int h = l01.h(listIterator.next().intValue(), i, i2, i3, z);
            if (h < 0) {
                listIterator.remove();
                if (l01.g(this.a, nextIndex, -1) < 0) {
                    this.a = nextIndex;
                    if (nextIndex < 0) {
                        this.a = 0;
                    }
                    if (this.a >= this.c.size()) {
                        this.a = this.c.size() - 1;
                    }
                    z2 = true;
                }
            } else {
                listIterator.set(Integer.valueOf(h));
            }
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

    public void m(int i, List<Integer> list, ce0.a aVar) {
        this.b = aVar;
        this.c = list;
        this.a = 0;
        b(i);
        if (aVar != null) {
            aVar.a(this, false, true);
        }
    }
}
