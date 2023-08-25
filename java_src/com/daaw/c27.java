package com.daaw;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class c27 extends r17 {
    @CheckForNull
    public Object[] d;
    public int e;

    public c27(int i) {
        super(i);
        this.d = new Object[d27.n(i)];
    }

    @Override // com.daaw.s17
    public final /* bridge */ /* synthetic */ s17 a(Object obj) {
        f(obj);
        return this;
    }

    public final c27 f(Object obj) {
        Objects.requireNonNull(obj);
        if (this.d != null) {
            int n = d27.n(this.b);
            int length = this.d.length;
            if (n <= length) {
                int i = length - 1;
                int hashCode = obj.hashCode();
                int a = q17.a(hashCode);
                while (true) {
                    int i2 = a & i;
                    Object[] objArr = this.d;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a = i2 + 1;
                    } else {
                        objArr[i2] = obj;
                        this.e += hashCode;
                        super.c(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.d = null;
        super.c(obj);
        return this;
    }

    public final c27 g(Iterable iterable) {
        if (this.d != null) {
            for (Object obj : iterable) {
                f(obj);
            }
        } else {
            super.d(iterable);
        }
        return this;
    }

    public final d27 h() {
        d27 x;
        boolean y;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                Object obj = this.a[0];
                obj.getClass();
                return new z37(obj);
            }
            if (this.d == null || d27.n(i) != this.d.length) {
                x = d27.x(this.b, this.a);
                this.b = x.size();
            } else {
                int i2 = this.b;
                Object[] objArr = this.a;
                y = d27.y(i2, objArr.length);
                if (y) {
                    objArr = Arrays.copyOf(objArr, i2);
                }
                int i3 = this.e;
                Object[] objArr2 = this.d;
                x = new s37(objArr, i3, objArr2, objArr2.length - 1, this.b);
            }
            this.c = true;
            this.d = null;
            return x;
        }
        return s37.x;
    }
}
