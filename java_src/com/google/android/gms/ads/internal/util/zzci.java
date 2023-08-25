package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.daaw.m14;
/* loaded from: classes.dex */
public final class zzci {

    /* renamed from: a */
    public final View f36300a;

    /* renamed from: b */
    public Activity f36301b;

    /* renamed from: c */
    public boolean f36302c;

    /* renamed from: d */
    public boolean f36303d;

    /* renamed from: e */
    public boolean f36304e;

    /* renamed from: f */
    public final ViewTreeObserver.OnGlobalLayoutListener f36305f;

    public zzci(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f36301b = activity;
        this.f36300a = view;
        this.f36305f = onGlobalLayoutListener;
    }

    /* renamed from: a */
    public static ViewTreeObserver m1338a(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* renamed from: b */
    public final void m1337b() {
        if (this.f36302c) {
            return;
        }
        Activity activity = this.f36301b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f36305f;
            ViewTreeObserver m1338a = m1338a(activity);
            if (m1338a != null) {
                m1338a.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        com.google.android.gms.ads.internal.zzt.zzx();
        m14.m16299a(this.f36300a, this.f36305f);
        this.f36302c = true;
    }

    /* renamed from: c */
    public final void m1336c() {
        Activity activity = this.f36301b;
        if (activity != null && this.f36302c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f36305f;
            ViewTreeObserver m1338a = m1338a(activity);
            if (m1338a != null) {
                m1338a.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f36302c = false;
        }
    }

    public final void zza() {
        this.f36304e = false;
        m1336c();
    }

    public final void zzb() {
        this.f36304e = true;
        if (this.f36303d) {
            m1337b();
        }
    }

    public final void zzc() {
        this.f36303d = true;
        if (this.f36304e) {
            m1337b();
        }
    }

    public final void zzd() {
        this.f36303d = false;
        m1336c();
    }

    public final void zze(Activity activity) {
        this.f36301b = activity;
    }
}
