package com.daaw;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class xd7 {

    /* renamed from: a */
    public final dq7 f32596a;

    /* renamed from: b */
    public final Class f32597b;

    public /* synthetic */ xd7(dq7 dq7Var, Class cls, wd7 wd7Var) {
        this.f32596a = dq7Var;
        this.f32597b = cls;
    }

    /* renamed from: b */
    public static xd7 m5202b(sd7 sd7Var, dq7 dq7Var, Class cls) {
        return new rd7(dq7Var, cls, sd7Var);
    }

    /* renamed from: a */
    public abstract m87 mo5203a(gf7 gf7Var, @Nullable x97 x97Var);

    /* renamed from: c */
    public final dq7 m5201c() {
        return this.f32596a;
    }

    /* renamed from: d */
    public final Class m5200d() {
        return this.f32597b;
    }
}
