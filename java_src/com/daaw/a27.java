package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class a27 {

    /* renamed from: a */
    public Object[] f2715a;

    /* renamed from: b */
    public int f2716b;

    /* renamed from: c */
    public z17 f2717c;

    public a27() {
        this(4);
    }

    public a27(int i) {
        this.f2715a = new Object[i + i];
        this.f2716b = 0;
    }

    /* renamed from: a */
    public final a27 m27748a(Object obj, Object obj2) {
        m27745d(this.f2716b + 1);
        k07.m18088b(obj, obj2);
        Object[] objArr = this.f2715a;
        int i = this.f2716b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.f2716b = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final a27 m27747b(Iterable iterable) {
        if (iterable instanceof Collection) {
            m27745d(this.f2716b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m27748a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    /* renamed from: c */
    public final b27 m27746c() {
        z17 z17Var = this.f2717c;
        if (z17Var == null) {
            r37 m11785i = r37.m11785i(this.f2716b, this.f2715a, this);
            z17 z17Var2 = this.f2717c;
            if (z17Var2 == null) {
                return m11785i;
            }
            throw z17Var2.m2981a();
        }
        throw z17Var.m2981a();
    }

    /* renamed from: d */
    public final void m27745d(int i) {
        int i2 = i + i;
        Object[] objArr = this.f2715a;
        int length = objArr.length;
        if (i2 > length) {
            this.f2715a = Arrays.copyOf(objArr, s17.m10754b(length, i2));
        }
    }
}
