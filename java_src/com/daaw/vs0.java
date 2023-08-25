package com.daaw;

import com.daaw.f70;
/* loaded from: classes.dex */
public class vs0<R> implements f70<R> {
    public static final vs0<?> a = new vs0<>();
    public static final g70<?> b = new a();

    /* loaded from: classes.dex */
    public static class a<R> implements g70<R> {
        @Override // com.daaw.g70
        public f70<R> a(boolean z, boolean z2) {
            return vs0.a;
        }
    }

    public static <R> f70<R> c() {
        return a;
    }

    public static <R> g70<R> d() {
        return (g70<R>) b;
    }

    @Override // com.daaw.f70
    public boolean a(Object obj, f70.a aVar) {
        return false;
    }
}
