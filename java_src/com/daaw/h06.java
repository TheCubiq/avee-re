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
    public final g77 a;
    public final g77 b;
    public final Context c;
    public final ri6 d;
    public final View e;

    public h06(g77 g77Var, g77 g77Var2, Context context, ri6 ri6Var, ViewGroup viewGroup) {
        this.a = g77Var;
        this.b = g77Var2;
        this.c = context;
        this.d = ri6Var;
        this.e = viewGroup;
    }

    public final /* synthetic */ i06 a() {
        return new i06(this.c, this.d.e, c());
    }

    public final /* synthetic */ i06 b() {
        return new i06(this.c, this.d.e, c());
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        View view = this.e;
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
        g93.c(this.c);
        if (((Boolean) zzba.zzc().b(g93.g9)).booleanValue()) {
            g77Var = this.b;
            callable = new Callable() { // from class: com.daaw.f06
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h06.this.a();
                }
            };
        } else {
            g77Var = this.a;
            callable = new Callable() { // from class: com.daaw.g06
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h06.this.b();
                }
            };
        }
        return g77Var.M(callable);
    }
}
