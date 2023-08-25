package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzblz;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class l45 {

    /* renamed from: k */
    public static final ImageView.ScaleType f17051k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a */
    public final zzg f17052a;

    /* renamed from: b */
    public final ri6 f17053b;

    /* renamed from: c */
    public final o35 f17054c;

    /* renamed from: d */
    public final j35 f17055d;

    /* renamed from: e */
    public final x45 f17056e;

    /* renamed from: f */
    public final i55 f17057f;

    /* renamed from: g */
    public final Executor f17058g;

    /* renamed from: h */
    public final Executor f17059h;

    /* renamed from: i */
    public final zzblz f17060i;

    /* renamed from: j */
    public final g35 f17061j;

    public l45(zzg zzgVar, ri6 ri6Var, o35 o35Var, j35 j35Var, x45 x45Var, i55 i55Var, Executor executor, Executor executor2, g35 g35Var) {
        this.f17052a = zzgVar;
        this.f17053b = ri6Var;
        this.f17060i = ri6Var.f25349i;
        this.f17054c = o35Var;
        this.f17055d = j35Var;
        this.f17056e = x45Var;
        this.f17057f = i55Var;
        this.f17058g = executor;
        this.f17059h = executor2;
        this.f17061j = g35Var;
    }

    /* renamed from: g */
    public static void m17136g(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void m17142a(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        j35 j35Var = this.f17055d;
        if (j35Var.m19142N() != null) {
            if (j35Var.m19145K() == 2 || j35Var.m19145K() == 1) {
                this.f17052a.zzI(this.f17053b.f25346f, String.valueOf(j35Var.m19145K()), z);
            } else if (j35Var.m19145K() == 6) {
                this.f17052a.zzI(this.f17053b.f25346f, "2", z);
                this.f17052a.zzI(this.f17053b.f25346f, "1", z);
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void m17141b(k55 k55Var) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        sc3 m22051a;
        Drawable drawable;
        ImageView.ScaleType scaleType;
        if (this.f17054c.mo14577f() || this.f17054c.mo14578e()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View mo18042s = k55Var.mo18042s(strArr[i]);
                if (mo18042s != null && (mo18042s instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) mo18042s;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = k55Var.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        j35 j35Var = this.f17055d;
        if (j35Var.m19143M() != null) {
            view = j35Var.m19143M();
            zzblz zzblzVar = this.f17060i;
            if (zzblzVar != null && viewGroup == null) {
                m17136g(layoutParams, zzblzVar.f36847t);
                view.setLayoutParams(layoutParams);
            }
        } else if (j35Var.m19136T() instanceof ac3) {
            ac3 ac3Var = (ac3) j35Var.m19136T();
            if (viewGroup == null) {
                m17136g(layoutParams, ac3Var.zzc());
            }
            View bc3Var = new bc3(context, ac3Var, layoutParams);
            bc3Var.setContentDescription((CharSequence) zzba.zzc().m23658b(g93.f10757m3));
            view = bc3Var;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                zza zzaVar = new zza(k55Var.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = k55Var.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            k55Var.mo18043D(k55Var.zzk(), view, true);
        }
        y17 y17Var = h45.f12041D;
        int size = y17Var.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View mo18042s2 = k55Var.mo18042s((String) y17Var.get(i2));
            i2++;
            if (mo18042s2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) mo18042s2;
                break;
            }
        }
        this.f17059h.execute(new Runnable() { // from class: com.daaw.i45
            @Override // java.lang.Runnable
            public final void run() {
                l45.this.m17142a(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (m17135h(viewGroup2, true)) {
            j35 j35Var2 = this.f17055d;
            if (j35Var2.m19130Z() != null) {
                j35Var2.m19130Z().mo6454I(new k45(k55Var, viewGroup2));
            }
        } else if (((Boolean) zzba.zzc().m23658b(g93.f10470K8)).booleanValue() && m17135h(viewGroup2, false)) {
            j35 j35Var3 = this.f17055d;
            if (j35Var3.m19132X() != null) {
                j35Var3.m19132X().mo6454I(new k45(k55Var, viewGroup2));
            }
        } else {
            viewGroup2.removeAllViews();
            View zzf = k55Var.zzf();
            Context context2 = zzf != null ? zzf.getContext() : null;
            if (context2 == null || (m22051a = this.f17061j.m22051a()) == null) {
                return;
            }
            try {
                yd0 zzi = m22051a.zzi();
                if (zzi == null || (drawable = (Drawable) nt0.m14831M(zzi)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                yd0 zzj = k55Var.zzj();
                if (zzj != null) {
                    if (((Boolean) zzba.zzc().m23658b(g93.f10397D5)).booleanValue()) {
                        scaleType = (ImageView.ScaleType) nt0.m14831M(zzj);
                        imageView.setScaleType(scaleType);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(imageView);
                    }
                }
                scaleType = f17051k;
                imageView.setScaleType(scaleType);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            } catch (RemoteException unused) {
                k04.zzj("Could not get main image drawable");
            }
        }
    }

    /* renamed from: c */
    public final void m17140c(k55 k55Var) {
        if (k55Var == null || this.f17056e == null || k55Var.zzh() == null || !this.f17054c.mo14576g()) {
            return;
        }
        try {
            k55Var.zzh().addView(this.f17056e.m5539a());
        } catch (l74 e) {
            zze.zzb("web view can not be obtained", e);
        }
    }

    /* renamed from: d */
    public final void m17139d(k55 k55Var) {
        if (k55Var == null) {
            return;
        }
        Context context = k55Var.zzf().getContext();
        if (zzbx.zzh(context, this.f17054c.f21011a)) {
            if (!(context instanceof Activity)) {
                k04.zze("Activity context is needed for policy validator.");
            } else if (this.f17057f == null || k55Var.zzh() == null) {
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.f17057f.m20118a(k55Var.zzh(), windowManager), zzbx.zzb());
                } catch (l74 e) {
                    zze.zzb("web view can not be obtained", e);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m17138e(final k55 k55Var) {
        this.f17058g.execute(new Runnable() { // from class: com.daaw.j45
            @Override // java.lang.Runnable
            public final void run() {
                l45.this.m17141b(k55Var);
            }
        });
    }

    /* renamed from: f */
    public final boolean m17137f(ViewGroup viewGroup) {
        return m17135h(viewGroup, true);
    }

    /* renamed from: h */
    public final boolean m17135h(ViewGroup viewGroup, boolean z) {
        View m19142N = z ? this.f17055d.m19142N() : this.f17055d.m19141O();
        if (m19142N == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (m19142N.getParent() instanceof ViewGroup) {
            ((ViewGroup) m19142N.getParent()).removeView(m19142N);
        }
        viewGroup.addView(m19142N, ((Boolean) zzba.zzc().m23658b(g93.f10779o3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
