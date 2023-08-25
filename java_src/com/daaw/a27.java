package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class a27 {
    public Object[] a;
    public int b;
    public z17 c;

    public a27() {
        this(4);
    }

    public a27(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }

    public final a27 a(Object obj, Object obj2) {
        d(this.b + 1);
        k07.b(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a27 b(Iterable iterable) {
        if (iterable instanceof Collection) {
            d(this.b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final b27 c() {
        z17 z17Var = this.c;
        if (z17Var == null) {
            r37 i = r37.i(this.b, this.a, this);
            z17 z17Var2 = this.c;
            if (z17Var2 == null) {
                return i;
            }
            throw z17Var2.a();
        }
        throw z17Var.a();
    }

    public final void d(int i) {
        int i2 = i + i;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, s17.b(length, i2));
        }
    }
}
