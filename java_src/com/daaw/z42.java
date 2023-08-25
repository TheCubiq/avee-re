package com.daaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class z42 {
    public s32 a;
    public s32 b;
    public final List c;

    public z42() {
        this.a = new s32("", 0L, null);
        this.b = new s32("", 0L, null);
        this.c = new ArrayList();
    }

    public z42(s32 s32Var) {
        this.a = s32Var;
        this.b = s32Var.clone();
        this.c = new ArrayList();
    }

    public final s32 a() {
        return this.a;
    }

    public final s32 b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        z42 z42Var = new z42(this.a.clone());
        for (s32 s32Var : this.c) {
            z42Var.c.add(s32Var.clone());
        }
        return z42Var;
    }

    public final void d(s32 s32Var) {
        this.a = s32Var;
        this.b = s32Var.clone();
        this.c.clear();
    }

    public final void e(String str, long j, Map map) {
        this.c.add(new s32(str, j, map));
    }

    public final void f(s32 s32Var) {
        this.b = s32Var;
    }
}
