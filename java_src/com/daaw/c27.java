package com.daaw;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class c27 extends r17 {
    @CheckForNull

    /* renamed from: d */
    public Object[] f5407d;

    /* renamed from: e */
    public int f5408e;

    public c27(int i) {
        super(i);
        this.f5407d = new Object[d27.m24765n(i)];
    }

    @Override // com.daaw.s17
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ s17 mo7549a(Object obj) {
        m25672f(obj);
        return this;
    }

    /* renamed from: f */
    public final c27 m25672f(Object obj) {
        Objects.requireNonNull(obj);
        if (this.f5407d != null) {
            int m24765n = d27.m24765n(this.f24734b);
            int length = this.f5407d.length;
            if (m24765n <= length) {
                int i = length - 1;
                int hashCode = obj.hashCode();
                int m12804a = q17.m12804a(hashCode);
                while (true) {
                    int i2 = m12804a & i;
                    Object[] objArr = this.f5407d;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        m12804a = i2 + 1;
                    } else {
                        objArr[i2] = obj;
                        this.f5408e += hashCode;
                        super.m11837c(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.f5407d = null;
        super.m11837c(obj);
        return this;
    }

    /* renamed from: g */
    public final c27 m25671g(Iterable iterable) {
        if (this.f5407d != null) {
            for (Object obj : iterable) {
                m25672f(obj);
            }
        } else {
            super.m11836d(iterable);
        }
        return this;
    }

    /* renamed from: h */
    public final d27 m25670h() {
        d27 m24757x;
        boolean m24756y;
        int i = this.f24734b;
        if (i != 0) {
            if (i == 1) {
                Object obj = this.f24733a[0];
                obj.getClass();
                return new z37(obj);
            }
            if (this.f5407d == null || d27.m24765n(i) != this.f5407d.length) {
                m24757x = d27.m24757x(this.f24734b, this.f24733a);
                this.f24734b = m24757x.size();
            } else {
                int i2 = this.f24734b;
                Object[] objArr = this.f24733a;
                m24756y = d27.m24756y(i2, objArr.length);
                if (m24756y) {
                    objArr = Arrays.copyOf(objArr, i2);
                }
                int i3 = this.f5408e;
                Object[] objArr2 = this.f5407d;
                m24757x = new s37(objArr, i3, objArr2, objArr2.length - 1, this.f24734b);
            }
            this.f24735c = true;
            this.f5407d = null;
            return m24757x;
        }
        return s37.f25842x;
    }
}
