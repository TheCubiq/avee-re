package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class h06 implements i76 {

    /* renamed from: a */
    public final g77 f11929a;

    /* renamed from: b */
    public final g77 f11930b;

    /* renamed from: c */
    public final Context f11931c;

    /* renamed from: d */
    public final ri6 f11932d;

    /* renamed from: e */
    public final View f11933e;

    public h06(g77 g77Var, g77 g77Var2, Context context, ri6 ri6Var, ViewGroup viewGroup) {
        this.f11929a = g77Var;
        this.f11930b = g77Var2;
        this.f11931c = context;
        this.f11932d = ri6Var;
        this.f11933e = viewGroup;
    }

    /* renamed from: a */
    public final /* synthetic */ i06 m21119a() {
        return new i06(this.f11931c, this.f11932d.f25345e, m21117c());
    }

    /* renamed from: b */
    public final /* synthetic */ i06 m21118b() {
        return new i06(this.f11931c, this.f11932d.f25345e, m21117c());
    }

    /* renamed from: c */
    public final List m21117c() {
        ArrayList arrayList = new ArrayList();
        View view = this.f11933e;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 3;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        g77 g77Var;
        Callable callable;
        g93.m21879c(this.f11931c);
        if (((Boolean) zzba.zzc().m23658b(g93.f10697g9)).booleanValue()) {
            g77Var = this.f11930b;
            callable = new Callable() { // from class: com.daaw.f06
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h06.this.m21119a();
                }
            };
        } else {
            g77Var = this.f11929a;
            callable = new Callable() { // from class: com.daaw.g06
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h06.this.m21118b();
                }
            };
        }
        return g77Var.mo20112M(callable);
    }
}
