package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public class gj4 {

    /* renamed from: a */
    public final xl4 f11362a;

    /* renamed from: b */
    public final View f11363b;

    /* renamed from: c */
    public final uh6 f11364c;

    /* renamed from: d */
    public final a74 f11365d;

    public gj4(View view, a74 a74Var, xl4 xl4Var, uh6 uh6Var) {
        this.f11363b = view;
        this.f11365d = a74Var;
        this.f11362a = xl4Var;
        this.f11364c = uh6Var;
    }

    /* renamed from: f */
    public static final ly4 m21561f(final Context context, final zzchu zzchuVar, final th6 th6Var, final ri6 ri6Var) {
        return new ly4(new fs4() { // from class: com.daaw.ej4
            @Override // com.daaw.fs4
            public final void zzn() {
                zzt.zzs().zzn(context, zzchuVar.f36993p, th6Var.f27657D.toString(), ri6Var.f25346f);
            }
        }, z04.f34310f);
    }

    /* renamed from: g */
    public static final Set m21560g(ol4 ol4Var) {
        return Collections.singleton(new ly4(ol4Var, z04.f34310f));
    }

    /* renamed from: h */
    public static final ly4 m21559h(ml4 ml4Var) {
        return new ly4(ml4Var, z04.f34309e);
    }

    /* renamed from: a */
    public final View m21565a() {
        return this.f11363b;
    }

    /* renamed from: b */
    public final a74 m21564b() {
        return this.f11365d;
    }

    /* renamed from: c */
    public final xl4 m21563c() {
        return this.f11362a;
    }

    /* renamed from: d */
    public as4 mo8754d(Set set) {
        return new as4(set);
    }

    /* renamed from: e */
    public final uh6 m21562e() {
        return this.f11364c;
    }
}
