package com.daaw;
/* loaded from: classes.dex */
public class dy0<T> implements by0<T> {

    /* renamed from: a */
    public final Object[] f7973a;

    /* renamed from: b */
    public int f7974b;

    public dy0(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f7973a = new Object[i];
    }

    @Override // com.daaw.by0
    /* renamed from: a */
    public boolean mo22137a(T t) {
        if (m23816c(t)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.f7974b;
        Object[] objArr = this.f7973a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.f7974b = i + 1;
            return true;
        }
        return false;
    }

    @Override // com.daaw.by0
    /* renamed from: b */
    public T mo22136b() {
        int i = this.f7974b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f7973a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f7974b = i - 1;
            return t;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m23816c(T t) {
        for (int i = 0; i < this.f7974b; i++) {
            if (this.f7973a[i] == t) {
                return true;
            }
        }
        return false;
    }
}
