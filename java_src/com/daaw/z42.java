package com.daaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class z42 {

    /* renamed from: a */
    public s32 f34446a;

    /* renamed from: b */
    public s32 f34447b;

    /* renamed from: c */
    public final List f34448c;

    public z42() {
        this.f34446a = new s32("", 0L, null);
        this.f34447b = new s32("", 0L, null);
        this.f34448c = new ArrayList();
    }

    public z42(s32 s32Var) {
        this.f34446a = s32Var;
        this.f34447b = s32Var.clone();
        this.f34448c = new ArrayList();
    }

    /* renamed from: a */
    public final s32 m2826a() {
        return this.f34446a;
    }

    /* renamed from: b */
    public final s32 m2825b() {
        return this.f34447b;
    }

    /* renamed from: c */
    public final List m2824c() {
        return this.f34448c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        z42 z42Var = new z42(this.f34446a.clone());
        for (s32 s32Var : this.f34448c) {
            z42Var.f34448c.add(s32Var.clone());
        }
        return z42Var;
    }

    /* renamed from: d */
    public final void m2823d(s32 s32Var) {
        this.f34446a = s32Var;
        this.f34447b = s32Var.clone();
        this.f34448c.clear();
    }

    /* renamed from: e */
    public final void m2822e(String str, long j, Map map) {
        this.f34448c.add(new s32(str, j, map));
    }

    /* renamed from: f */
    public final void m2821f(s32 s32Var) {
        this.f34447b = s32Var;
    }
}
