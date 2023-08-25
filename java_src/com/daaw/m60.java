package com.daaw;

import android.graphics.Bitmap;
import java.util.Objects;
/* loaded from: classes.dex */
public class m60 implements z41<k60> {

    /* renamed from: a */
    public final k60 f18472a;

    public m60(k60 k60Var) {
        Objects.requireNonNull(k60Var, "Data must not be null");
        this.f18472a = k60Var;
    }

    @Override // com.daaw.z41
    /* renamed from: a */
    public int mo2828a() {
        return this.f18472a.m18033c();
    }

    @Override // com.daaw.z41
    /* renamed from: b */
    public k60 get() {
        return this.f18472a;
    }

    @Override // com.daaw.z41
    /* renamed from: c */
    public void mo2827c() {
        z41<Bitmap> m18035a = this.f18472a.m18035a();
        if (m18035a != null) {
            m18035a.mo2827c();
        }
        z41<s60> m18034b = this.f18472a.m18034b();
        if (m18034b != null) {
            m18034b.mo2827c();
        }
    }
}
