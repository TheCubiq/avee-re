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

    /* renamed from: p */
    public final WeakReference f9098p;

    /* renamed from: q */
    public final Map f9099q = new HashMap();

    /* renamed from: r */
    public final Map f9100r = new HashMap();

    /* renamed from: s */
    public final Map f9101s = new HashMap();
    @GuardedBy("this")

    /* renamed from: t */
    public e35 f9102t;

    /* renamed from: u */
    public r03 f9103u;

    public f45(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzt.zzx();
        m14.m16299a(view, this);
        zzt.zzx();
        m14.m16298b(view, this);
        this.f9098p = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f9099q.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f9101s.putAll(this.f9099q);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.f9100r.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f9101s.putAll(this.f9100r);
        this.f9103u = new r03(view.getContext(), view);
    }

    @Override // com.daaw.k55
    /* renamed from: D */
    public final synchronized void mo18043D(String str, View view, boolean z) {
        this.f9101s.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.f9099q.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        e35 e35Var = this.f9102t;
        if (e35Var != null) {
            e35Var.m23753Z(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        e35 e35Var = this.f9102t;
        if (e35Var != null) {
            e35Var.m23755X(zzf(), zzl(), zzm(), e35.m23778A(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        e35 e35Var = this.f9102t;
        if (e35Var != null) {
            e35Var.m23755X(zzf(), zzl(), zzm(), e35.m23778A(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        e35 e35Var = this.f9102t;
        if (e35Var != null) {
            e35Var.m23746n(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.daaw.k55
    /* renamed from: s */
    public final synchronized View mo18042s(String str) {
        WeakReference weakReference = (WeakReference) this.f9101s.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.daaw.fd3
    public final synchronized void zzb(yd0 yd0Var) {
        if (this.f9102t != null) {
            Object m14831M = nt0.m14831M(yd0Var);
            if (!(m14831M instanceof View)) {
                k04.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f9102t.m23744p((View) m14831M);
        }
    }

    @Override // com.daaw.fd3
    public final synchronized void zzc(yd0 yd0Var) {
        Object m14831M = nt0.m14831M(yd0Var);
        if (!(m14831M instanceof e35)) {
            k04.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        e35 e35Var = this.f9102t;
        if (e35Var != null) {
            e35Var.m23738v(this);
        }
        e35 e35Var2 = (e35) m14831M;
        if (!e35Var2.m23737w()) {
            k04.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f9102t = e35Var2;
        e35Var2.m23739u(this);
        this.f9102t.m23747m(zzf());
    }

    @Override // com.daaw.fd3
    public final synchronized void zzd() {
        e35 e35Var = this.f9102t;
        if (e35Var != null) {
            e35Var.m23738v(this);
            this.f9102t = null;
        }
    }

    @Override // com.daaw.k55
    public final View zzf() {
        return (View) this.f9098p.get();
    }

    @Override // com.daaw.k55
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.daaw.k55
    public final r03 zzi() {
        return this.f9103u;
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
        return this.f9101s;
    }

    @Override // com.daaw.k55
    public final synchronized Map zzm() {
        return this.f9099q;
    }

    @Override // com.daaw.k55
    public final synchronized Map zzn() {
        return this.f9100r;
    }

    @Override // com.daaw.k55
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.daaw.k55
    public final synchronized JSONObject zzp() {
        e35 e35Var = this.f9102t;
        if (e35Var != null) {
            return e35Var.m23765N(zzf(), zzl(), zzm());
        }
        return null;
    }
}
