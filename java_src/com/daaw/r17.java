package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
/* loaded from: classes.dex */
public class r17 extends s17 {
    public Object[] a;
    public int b = 0;
    public boolean c;

    public r17(int i) {
        this.a = new Object[i];
    }

    public final r17 c(Object obj) {
        Objects.requireNonNull(obj);
        e(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
        return this;
    }

    public final s17 d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(this.b + collection.size());
            if (collection instanceof t17) {
                this.b = ((t17) collection).d(this.a, this.b);
                return this;
            }
        }
        for (Object obj : iterable) {
            a(obj);
        }
        return this;
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            this.a = Arrays.copyOf(objArr, s17.b(length, i));
        } else if (!this.c) {
            return;
        } else {
            this.a = (Object[]) objArr.clone();
        }
        this.c = false;
    }
}
