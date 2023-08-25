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

    /* renamed from: D */
    public static final y17 f12041D = y17.m4257x("2011", "1009", "3010");

    /* renamed from: A */
    public boolean f12042A;

    /* renamed from: C */
    public GestureDetector f12044C;

    /* renamed from: p */
    public final String f12045p;

    /* renamed from: r */
    public FrameLayout f12047r;

    /* renamed from: s */
    public FrameLayout f12048s;

    /* renamed from: t */
    public final g77 f12049t;

    /* renamed from: u */
    public View f12050u;
    @GuardedBy("this")

    /* renamed from: w */
    public e35 f12052w;

    /* renamed from: x */
    public r03 f12053x;

    /* renamed from: z */
    public sc3 f12055z;
    @GuardedBy("this")

    /* renamed from: q */
    public Map f12046q = new HashMap();

    /* renamed from: y */
    public yd0 f12054y = null;

    /* renamed from: B */
    public boolean f12043B = false;

    /* renamed from: v */
    public final int f12051v = 224400000;

    public h45(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        this.f12047r = frameLayout;
        this.f12048s = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.f12045p = str;
        zzt.zzx();
        m14.m16299a(frameLayout, this);
        zzt.zzx();
        m14.m16298b(frameLayout, this);
        this.f12049t = z04.f34309e;
        this.f12053x = new r03(this.f12047r.getContext(), this.f12047r);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.daaw.k55
    /* renamed from: D */
    public final synchronized void mo18043D(String str, View view, boolean z) {
        if (this.f12043B) {
            return;
        }
        if (view == null) {
            this.f12046q.remove(str);
            return;
        }
        this.f12046q.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            if (zzbx.zzi(this.f12051v)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    /* renamed from: b */
    public final synchronized void m21035b() {
        this.f12049t.execute(new Runnable() { // from class: com.daaw.g45
            @Override // java.lang.Runnable
            public final void run() {
                h45.this.zzs();
            }
        });
    }

    /* renamed from: g3 */
    public final FrameLayout m21034g3() {
        return this.f12047r;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        e35 e35Var = this.f12052w;
        if (e35Var == null || !e35Var.m23736x()) {
            return;
        }
        this.f12052w.m23762Q();
        this.f12052w.m23753Z(view, this.f12047r, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        e35 e35Var = this.f12052w;
        if (e35Var != null) {
            FrameLayout frameLayout = this.f12047r;
            e35Var.m23755X(frameLayout, zzl(), zzm(), e35.m23778A(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        e35 e35Var = this.f12052w;
        if (e35Var != null) {
            FrameLayout frameLayout = this.f12047r;
            e35Var.m23755X(frameLayout, zzl(), zzm(), e35.m23778A(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        e35 e35Var = this.f12052w;
        if (e35Var == null) {
            return false;
        }
        e35Var.m23746n(view, motionEvent, this.f12047r);
        if (((Boolean) zzba.zzc().m23658b(g93.f10873w9)).booleanValue() && this.f12044C != null && this.f12052w.m23771H() != 0) {
            this.f12044C.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.daaw.k55
    /* renamed from: s */
    public final synchronized View mo18042s(String str) {
        if (this.f12043B) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.f12046q.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.daaw.zc3
    public final synchronized yd0 zzb(String str) {
        return nt0.m14830g3(mo18042s(str));
    }

    @Override // com.daaw.zc3
    public final synchronized void zzbA(sc3 sc3Var) {
        if (this.f12043B) {
            return;
        }
        this.f12042A = true;
        this.f12055z = sc3Var;
        e35 e35Var = this.f12052w;
        if (e35Var != null) {
            e35Var.m23770I().m22050b(sc3Var);
        }
    }

    @Override // com.daaw.zc3
    public final synchronized void zzbB(yd0 yd0Var) {
        if (this.f12043B) {
            return;
        }
        this.f12054y = yd0Var;
    }

    @Override // com.daaw.zc3
    public final synchronized void zzbC(yd0 yd0Var) {
        if (this.f12043B) {
            return;
        }
        Object m14831M = nt0.m14831M(yd0Var);
        if (!(m14831M instanceof e35)) {
            k04.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        e35 e35Var = this.f12052w;
        if (e35Var != null) {
            e35Var.m23738v(this);
        }
        m21035b();
        e35 e35Var2 = (e35) m14831M;
        this.f12052w = e35Var2;
        e35Var2.m23739u(this);
        this.f12052w.m23747m(this.f12047r);
        this.f12052w.m23763P(this.f12048s);
        if (this.f12042A) {
            this.f12052w.m23770I().m22050b(this.f12055z);
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10834t3)).booleanValue() && !TextUtils.isEmpty(this.f12052w.m23768K())) {
            zzt(this.f12052w.m23768K());
        }
        zzv();
    }

    @Override // com.daaw.zc3
    public final synchronized void zzby(String str, yd0 yd0Var) {
        mo18043D(str, (View) nt0.m14831M(yd0Var), true);
    }

    @Override // com.daaw.zc3
    public final synchronized void zzbz(yd0 yd0Var) {
        this.f12052w.m23744p((View) nt0.m14831M(yd0Var));
    }

    @Override // com.daaw.zc3
    public final synchronized void zzc() {
        if (this.f12043B) {
            return;
        }
        e35 e35Var = this.f12052w;
        if (e35Var != null) {
            e35Var.m23738v(this);
            this.f12052w = null;
        }
        this.f12046q.clear();
        this.f12047r.removeAllViews();
        this.f12048s.removeAllViews();
        this.f12046q = null;
        this.f12047r = null;
        this.f12048s = null;
        this.f12050u = null;
        this.f12053x = null;
        this.f12043B = true;
    }

    @Override // com.daaw.zc3
    public final void zzd(yd0 yd0Var) {
        onTouch(this.f12047r, (MotionEvent) nt0.m14831M(yd0Var));
    }

    @Override // com.daaw.zc3
    public final synchronized void zze(yd0 yd0Var, int i) {
    }

    @Override // com.daaw.k55
    public final /* synthetic */ View zzf() {
        return this.f12047r;
    }

    @Override // com.daaw.k55
    public final FrameLayout zzh() {
        return this.f12048s;
    }

    @Override // com.daaw.k55
    public final r03 zzi() {
        return this.f12053x;
    }

    @Override // com.daaw.k55
    public final yd0 zzj() {
        return this.f12054y;
    }

    @Override // com.daaw.k55
    public final synchronized String zzk() {
        return this.f12045p;
    }

    @Override // com.daaw.k55
    public final synchronized Map zzl() {
        return this.f12046q;
    }

    @Override // com.daaw.k55
    public final synchronized Map zzm() {
        return this.f12046q;
    }

    @Override // com.daaw.k55
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.daaw.k55
    public final synchronized JSONObject zzo() {
        e35 e35Var = this.f12052w;
        if (e35Var != null) {
            return e35Var.m23766M(this.f12047r, zzl(), zzm());
        }
        return null;
    }

    @Override // com.daaw.k55
    public final synchronized JSONObject zzp() {
        e35 e35Var = this.f12052w;
        if (e35Var != null) {
            return e35Var.m23765N(this.f12047r, zzl(), zzm());
        }
        return null;
    }

    public final /* synthetic */ void zzs() {
        if (this.f12050u == null) {
            View view = new View(this.f12047r.getContext());
            this.f12050u = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f12047r != this.f12050u.getParent()) {
            this.f12047r.addView(this.f12050u);
        }
    }

    public final synchronized void zzt(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.f12048s.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.f12048s.getContext();
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
        this.f12048s.addView(frameLayout);
    }

    public final synchronized void zzv() {
        if (!((Boolean) zzba.zzc().m23658b(g93.f10873w9)).booleanValue() || this.f12052w.m23771H() == 0) {
            return;
        }
        this.f12044C = new GestureDetector(this.f12047r.getContext(), new n45(this.f12052w, this));
    }
}
