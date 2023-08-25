package com.daaw;

import java.io.OutputStream;
/* loaded from: classes.dex */
public class it0<T> implements zw<T> {
    public static final it0<?> a = new it0<>();

    public static <T> zw<T> b() {
        return a;
    }

    @Override // com.daaw.zw
    public boolean a(T t, OutputStream outputStream) {
        return false;
    }

    @Override // com.daaw.zw
    public String getId() {
        return "";
    }
}
