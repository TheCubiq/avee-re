package com.daaw;
/* loaded from: classes.dex */
public class ey0<T> implements cy0<T> {

    /* renamed from: a */
    public final Object[] f8933a;

    /* renamed from: b */
    public int f8934b;

    public ey0(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f8933a = new Object[i];
    }

    @Override // com.daaw.cy0
    /* renamed from: a */
    public boolean mo23015a(T t) {
        int i = this.f8934b;
        Object[] objArr = this.f8933a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.f8934b = i + 1;
            return true;
        }
        return false;
    }

    @Override // com.daaw.cy0
    /* renamed from: b */
    public T mo23014b() {
        int i = this.f8934b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f8933a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f8934b = i - 1;
            return t;
        }
        return null;
    }

    @Override // com.daaw.cy0
    /* renamed from: c */
    public void mo23013c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f8934b;
            Object[] objArr = this.f8933a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f8934b = i3 + 1;
            }
        }
    }
}
