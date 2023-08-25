package com.daaw;

import android.content.Context;
import com.daaw.b61;
import com.daaw.ki1;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* renamed from: com.daaw.sp */
/* loaded from: classes.dex */
public class C2963sp {

    /* renamed from: a */
    public final ki1.InterfaceC1952c f26464a;

    /* renamed from: b */
    public final Context f26465b;

    /* renamed from: c */
    public final String f26466c;

    /* renamed from: d */
    public final b61.C0820d f26467d;

    /* renamed from: e */
    public final List<b61.AbstractC0818b> f26468e;

    /* renamed from: f */
    public final boolean f26469f;

    /* renamed from: g */
    public final b61.EnumC0819c f26470g;

    /* renamed from: h */
    public final Executor f26471h;

    /* renamed from: i */
    public final Executor f26472i;

    /* renamed from: j */
    public final boolean f26473j;

    /* renamed from: k */
    public final boolean f26474k;

    /* renamed from: l */
    public final boolean f26475l;

    /* renamed from: m */
    public final Set<Integer> f26476m;

    /* renamed from: n */
    public final String f26477n;

    /* renamed from: o */
    public final File f26478o;

    public C2963sp(Context context, String str, ki1.InterfaceC1952c interfaceC1952c, b61.C0820d c0820d, List<b61.AbstractC0818b> list, boolean z, b61.EnumC0819c enumC0819c, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.f26464a = interfaceC1952c;
        this.f26465b = context;
        this.f26466c = str;
        this.f26467d = c0820d;
        this.f26468e = list;
        this.f26469f = z;
        this.f26470g = enumC0819c;
        this.f26471h = executor;
        this.f26472i = executor2;
        this.f26473j = z2;
        this.f26474k = z3;
        this.f26475l = z4;
        this.f26476m = set;
        this.f26477n = str2;
        this.f26478o = file;
    }

    /* renamed from: a */
    public boolean m10096a(int i, int i2) {
        Set<Integer> set;
        return !((i > i2) && this.f26475l) && this.f26474k && ((set = this.f26476m) == null || !set.contains(Integer.valueOf(i)));
    }
}
