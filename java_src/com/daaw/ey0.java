package com.daaw;
/* loaded from: classes.dex */
public class ey0<T> implements cy0<T> {
    public final Object[] a;
    public int b;

    public ey0(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i];
    }

    @Override // com.daaw.cy0
    public boolean a(T t) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.b = i + 1;
            return true;
        }
        return false;
    }

    @Override // com.daaw.cy0
    public T b() {
        int i = this.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.b = i - 1;
            return t;
        }
        return null;
    }

    @Override // com.daaw.cy0
    public void c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.b;
            Object[] objArr = this.a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.b = i3 + 1;
            }
        }
    }
}
