package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
/* loaded from: classes.dex */
public class r17 extends s17 {

    /* renamed from: a */
    public Object[] f24733a;

    /* renamed from: b */
    public int f24734b = 0;

    /* renamed from: c */
    public boolean f24735c;

    public r17(int i) {
        this.f24733a = new Object[i];
    }

    /* renamed from: c */
    public final r17 m11837c(Object obj) {
        Objects.requireNonNull(obj);
        m11835e(this.f24734b + 1);
        Object[] objArr = this.f24733a;
        int i = this.f24734b;
        this.f24734b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* renamed from: d */
    public final s17 m11836d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m11835e(this.f24734b + collection.size());
            if (collection instanceof t17) {
                this.f24734b = ((t17) collection).mo2850d(this.f24733a, this.f24734b);
                return this;
            }
        }
        for (Object obj : iterable) {
            mo7549a(obj);
        }
        return this;
    }

    /* renamed from: e */
    public final void m11835e(int i) {
        Object[] objArr = this.f24733a;
        int length = objArr.length;
        if (length < i) {
            this.f24733a = Arrays.copyOf(objArr, s17.m10754b(length, i));
        } else if (!this.f24735c) {
            return;
        } else {
            this.f24733a = (Object[]) objArr.clone();
        }
        this.f24735c = false;
    }
}
