package com.daaw;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class f45 extends ed3 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, k55 {
    public final WeakReference p;
    public final Map q = new HashMap();
    public final Map r = new HashMap();
    public final Map s = new HashMap();
    @GuardedBy("this")
    public e35 t;
    public r03 u;

    public f45(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzt.zzx();
        m14.a(view, this);
        zzt.zzx();
        m14.b(view, this);
        this.p = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.q.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.s.putAll(this.q);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.r.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.s.putAll(this.r);
        this.u = new r03(view.getContext(), view);
    }

    @Override // com.daaw.k55
    public final synchronized void D(String str, View view, boolean z) {
        this.s.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.q.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        e35 e35Var = this.t;
        if (e35Var != null) {
            e35Var.Z(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        e35 e35Var = this.t;
        if (e35Var != null) {
            e35Var.X(zzf(), zzl(), zzm(), e35.A(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        e35 e35Var = this.t;
        if (e35Var != null) {
            e35Var.X(zzf(), zzl(), zzm(), e35.A(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        e35 e35Var = this.t;
        if (e35Var != null) {
            e35Var.n(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.daaw.k55
    public final synchronized View s(String str) {
        WeakReference weakReference = (WeakReference) this.s.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.daaw.fd3
    public final synchronized void zzb(yd0 yd0Var) {
        if (this.t != null) {
            Object M = nt0.M(yd0Var);
            if (!(M instanceof View)) {
                k04.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.t.p((View) M);
        }
    }

    @Override // com.daaw.fd3
    public final synchronized void zzc(yd0 yd0Var) {
        Object M = nt0.M(yd0Var);
        if (!(M instanceof e35)) {
            k04.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        e35 e35Var = this.t;
        if (e35Var != null) {
            e35Var.v(this);
        }
        e35 e35Var2 = (e35) M;
        if (!e35Var2.w()) {
            k04.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.t = e35Var2;
        e35Var2.u(this);
        this.t.m(zzf());
    }

    @Override // com.daaw.fd3
    public final synchronized void zzd() {
        e35 e35Var = this.t;
        if (e35Var != null) {
            e35Var.v(this);
            this.t = null;
        }
    }

    @Override // com.daaw.k55
    public final View zzf() {
        return (View) this.p.get();
    }

    @Override // com.daaw.k55
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.daaw.k55
    public final r03 zzi() {
        return this.u;
    }

    @Override // com.daaw.k55
    public final synchronized yd0 zzj() {
        return null;
    }

    @Override // com.daaw.k55
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.daaw.k55
    public final synchronized Map zzl() {
        return this.s;
    }

    @Override // com.daaw.k55
    public final synchronized Map zzm() {
        return this.q;
    }

    @Override // com.daaw.k55
    public final synchronized Map zzn() {
        return this.r;
    }

    @Override // com.daaw.k55
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.daaw.k55
    public final synchronized JSONObject zzp() {
        e35 e35Var = this.t;
        if (e35Var != null) {
            return e35Var.N(zzf(), zzl(), zzm());
        }
        return null;
    }
}
