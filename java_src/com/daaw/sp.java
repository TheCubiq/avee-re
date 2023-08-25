package com.daaw;

import android.content.Context;
import com.daaw.b61;
import com.daaw.ki1;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class sp {
    public final ki1.c a;
    public final Context b;
    public final String c;
    public final b61.d d;
    public final List<b61.b> e;
    public final boolean f;
    public final b61.c g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final Set<Integer> m;
    public final String n;
    public final File o;

    public sp(Context context, String str, ki1.c cVar, b61.d dVar, List<b61.b> list, boolean z, b61.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.a = cVar;
        this.b = context;
        this.c = str;
        this.d = dVar;
        this.e = list;
        this.f = z;
        this.g = cVar2;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = set;
        this.n = str2;
        this.o = file;
    }

    public boolean a(int i, int i2) {
        Set<Integer> set;
        return !((i > i2) && this.l) && this.k && ((set = this.m) == null || !set.contains(Integer.valueOf(i)));
    }
}
