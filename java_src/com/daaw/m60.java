package com.daaw;

import android.graphics.Bitmap;
import java.util.Objects;
/* loaded from: classes.dex */
public class m60 implements z41<k60> {
    public final k60 a;

    public m60(k60 k60Var) {
        Objects.requireNonNull(k60Var, "Data must not be null");
        this.a = k60Var;
    }

    @Override // com.daaw.z41
    public int a() {
        return this.a.c();
    }

    @Override // com.daaw.z41
    /* renamed from: b */
    public k60 get() {
        return this.a;
    }

    @Override // com.daaw.z41
    public void c() {
        z41<Bitmap> a = this.a.a();
        if (a != null) {
            a.c();
        }
        z41<s60> b = this.a.b();
        if (b != null) {
            b.c();
        }
    }
}
