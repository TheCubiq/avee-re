package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h45 extends yc3 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, k55 {
    public static final y17 D = y17.x("2011", "1009", "3010");
    public boolean A;
    public GestureDetector C;
    public final String p;
    public FrameLayout r;
    public FrameLayout s;
    public final g77 t;
    public View u;
    @GuardedBy("this")
    public e35 w;
    public r03 x;
    public sc3 z;
    @GuardedBy("this")
    public Map q = new HashMap();
    public yd0 y = null;
    public boolean B = false;
    public final int v = 224400000;

    public h45(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        this.r = frameLayout;
        this.s = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.p = str;
        zzt.zzx();
        m14.a(frameLayout, this);
        zzt.zzx();
        m14.b(frameLayout, this);
        this.t = z04.e;
        this.x = new r03(this.r.getContext(), this.r);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.daaw.k55
    public final synchronized void D(String str, View view, boolean z) {
        if (this.B) {
            return;
        }
        if (view == null) {
            this.q.remove(str);
            return;
        }
        this.q.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            if (zzbx.zzi(this.v)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    public final synchronized void b() {
        this.t.execute(new Runnable() { // from class: com.daaw.g45
            @Override // java.lang.Runnable
            public final void run() {
                h45.this.zzs();
            }
        });
    }

    public final FrameLayout g3() {
        return this.r;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        e35 e35Var = this.w;
        if (e35Var == null || !e35Var.x()) {
            return;
        }
        this.w.Q();
        this.w.Z(view, this.r, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        e35 e35Var = this.w;
        if (e35Var != null) {
            FrameLayout frameLayout = this.r;
            e35Var.X(frameLayout, zzl(), zzm(), e35.A(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        e35 e35Var = this.w;
        if (e35Var != null) {
            FrameLayout frameLayout = this.r;
            e35Var.X(frameLayout, zzl(), zzm(), e35.A(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        e35 e35Var = this.w;
        if (e35Var == null) {
            return false;
        }
        e35Var.n(view, motionEvent, this.r);
        if (((Boolean) zzba.zzc().b(g93.w9)).booleanValue() && this.C != null && this.w.H() != 0) {
            this.C.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.daaw.k55
    public final synchronized View s(String str) {
        if (this.B) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.q.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.daaw.zc3
    public final synchronized yd0 zzb(String str) {
        return nt0.g3(s(str));
    }

    @Override // com.daaw.zc3
    public final synchronized void zzbA(sc3 sc3Var) {
        if (this.B) {
            return;
        }
        this.A = true;
        this.z = sc3Var;
        e35 e35Var = this.w;
        if (e35Var != null) {
            e35Var.I().b(sc3Var);
        }
    }

    @Override // com.daaw.zc3
    public final synchronized void zzbB(yd0 yd0Var) {
        if (this.B) {
            return;
        }
        this.y = yd0Var;
    }

    @Override // com.daaw.zc3
    public final synchronized void zzbC(yd0 yd0Var) {
        if (this.B) {
            return;
        }
        Object M = nt0.M(yd0Var);
        if (!(M instanceof e35)) {
            k04.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        e35 e35Var = this.w;
        if (e35Var != null) {
            e35Var.v(this);
        }
        b();
        e35 e35Var2 = (e35) M;
        this.w = e35Var2;
        e35Var2.u(this);
        this.w.m(this.r);
        this.w.P(this.s);
        if (this.A) {
            this.w.I().b(this.z);
        }
        if (((Boolean) zzba.zzc().b(g93.t3)).booleanValue() && !TextUtils.isEmpty(this.w.K())) {
            zzt(this.w.K());
        }
        zzv();
    }

    @Override // com.daaw.zc3
    public final synchronized void zzby(String str, yd0 yd0Var) {
        D(str, (View) nt0.M(yd0Var), true);
    }

    @Override // com.daaw.zc3
    public final synchronized void zzbz(yd0 yd0Var) {
        this.w.p((View) nt0.M(yd0Var));
    }

    @Override // com.daaw.zc3
    public final synchronized void zzc() {
        if (this.B) {
            return;
        }
        e35 e35Var = this.w;
        if (e35Var != null) {
            e35Var.v(this);
            this.w = null;
        }
        this.q.clear();
        this.r.removeAllViews();
        this.s.removeAllViews();
        this.q = null;
        this.r = null;
        this.s = null;
        this.u = null;
        this.x = null;
        this.B = true;
    }

    @Override // com.daaw.zc3
    public final void zzd(yd0 yd0Var) {
        onTouch(this.r, (MotionEvent) nt0.M(yd0Var));
    }

    @Override // com.daaw.zc3
    public final synchronized void zze(yd0 yd0Var, int i) {
    }

    @Override // com.daaw.k55
    public final /* synthetic */ View zzf() {
        return this.r;
    }

    @Override // com.daaw.k55
    public final FrameLayout zzh() {
        return this.s;
    }

    @Override // com.daaw.k55
    public final r03 zzi() {
        return this.x;
    }

    @Override // com.daaw.k55
    public final yd0 zzj() {
        return this.y;
    }

    @Override // com.daaw.k55
    public final synchronized String zzk() {
        return this.p;
    }

    @Override // com.daaw.k55
    public final synchronized Map zzl() {
        return this.q;
    }

    @Override // com.daaw.k55
    public final synchronized Map zzm() {
        return this.q;
    }

    @Override // com.daaw.k55
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.daaw.k55
    public final synchronized JSONObject zzo() {
        e35 e35Var = this.w;
        if (e35Var != null) {
            return e35Var.M(this.r, zzl(), zzm());
        }
        return null;
    }

    @Override // com.daaw.k55
    public final synchronized JSONObject zzp() {
        e35 e35Var = this.w;
        if (e35Var != null) {
            return e35Var.N(this.r, zzl(), zzm());
        }
        return null;
    }

    public final /* synthetic */ void zzs() {
        if (this.u == null) {
            View view = new View(this.r.getContext());
            this.u = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.r != this.u.getParent()) {
            this.r.addView(this.u);
        }
    }

    public final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.s.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.s.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e) {
                    k04.zzk("Encountered invalid base64 watermark.", e);
                }
            }
        }
        this.s.addView(frameLayout);
    }

    public final synchronized void zzv() {
        if (!((Boolean) zzba.zzc().b(g93.w9)).booleanValue() || this.w.H() == 0) {
            return;
        }
        this.C = new GestureDetector(this.r.getContext(), new n45(this.w, this));
    }
}
