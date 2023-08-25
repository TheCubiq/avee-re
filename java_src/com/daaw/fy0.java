package com.daaw;
/* loaded from: classes.dex */
public class fy0<T> extends dy0<T> {

    /* renamed from: c */
    public final Object f10090c;

    public fy0(int i) {
        super(i);
        this.f10090c = new Object();
    }

    @Override // com.daaw.dy0, com.daaw.by0
    /* renamed from: a */
    public boolean mo22137a(T t) {
        boolean mo22137a;
        synchronized (this.f10090c) {
            mo22137a = super.mo22137a(t);
        }
        return mo22137a;
    }

    @Override // com.daaw.dy0, com.daaw.by0
    /* renamed from: b */
    public T mo22136b() {
        T t;
        synchronized (this.f10090c) {
            t = (T) super.mo22136b();
        }
        return t;
    }
}
