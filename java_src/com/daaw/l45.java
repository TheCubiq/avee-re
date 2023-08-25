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
    public static final ImageView.ScaleType k = ImageView.ScaleType.CENTER_INSIDE;
    public final zzg a;
    public final ri6 b;
    public final o35 c;
    public final j35 d;
    public final x45 e;
    public final i55 f;
    public final Executor g;
    public final Executor h;
    public final zzblz i;
    public final g35 j;

    public l45(zzg zzgVar, ri6 ri6Var, o35 o35Var, j35 j35Var, x45 x45Var, i55 i55Var, Executor executor, Executor executor2, g35 g35Var) {
        this.a = zzgVar;
        this.b = ri6Var;
        this.i = ri6Var.i;
        this.c = o35Var;
        this.d = j35Var;
        this.e = x45Var;
        this.f = i55Var;
        this.g = executor;
        this.h = executor2;
        this.j = g35Var;
    }

    public static void g(RelativeLayout.LayoutParams layoutParams, int i) {
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

    public final /* synthetic */ void a(ViewGroup viewGroup) {
        boolean z = viewGroup != null;
        j35 j35Var = this.d;
        if (j35Var.N() != null) {
            if (j35Var.K() == 2 || j35Var.K() == 1) {
                this.a.zzI(this.b.f, String.valueOf(j35Var.K()), z);
            } else if (j35Var.K() == 6) {
                this.a.zzI(this.b.f, "2", z);
                this.a.zzI(this.b.f, "1", z);
            }
        }
    }

    public final /* synthetic */ void b(k55 k55Var) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        sc3 a;
        Drawable drawable;
        ImageView.ScaleType scaleType;
        if (this.c.f() || this.c.e()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View s = k55Var.s(strArr[i]);
                if (s != null && (s instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) s;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = k55Var.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        j35 j35Var = this.d;
        if (j35Var.M() != null) {
            view = j35Var.M();
            zzblz zzblzVar = this.i;
            if (zzblzVar != null && viewGroup == null) {
                g(layoutParams, zzblzVar.t);
                view.setLayoutParams(layoutParams);
            }
        } else if (j35Var.T() instanceof ac3) {
            ac3 ac3Var = (ac3) j35Var.T();
            if (viewGroup == null) {
                g(layoutParams, ac3Var.zzc());
            }
            View bc3Var = new bc3(context, ac3Var, layoutParams);
            bc3Var.setContentDescription((CharSequence) zzba.zzc().b(g93.m3));
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
            k55Var.D(k55Var.zzk(), view, true);
        }
        y17 y17Var = h45.D;
        int size = y17Var.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View s2 = k55Var.s((String) y17Var.get(i2));
            i2++;
            if (s2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) s2;
                break;
            }
        }
        this.h.execute(new Runnable() { // from class: com.daaw.i45
            @Override // java.lang.Runnable
            public final void run() {
                l45.this.a(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (h(viewGroup2, true)) {
            j35 j35Var2 = this.d;
            if (j35Var2.Z() != null) {
                j35Var2.Z().I(new k45(k55Var, viewGroup2));
            }
        } else if (((Boolean) zzba.zzc().b(g93.K8)).booleanValue() && h(viewGroup2, false)) {
            j35 j35Var3 = this.d;
            if (j35Var3.X() != null) {
                j35Var3.X().I(new k45(k55Var, viewGroup2));
            }
        } else {
            viewGroup2.removeAllViews();
            View zzf = k55Var.zzf();
            Context context2 = zzf != null ? zzf.getContext() : null;
            if (context2 == null || (a = this.j.a()) == null) {
                return;
            }
            try {
                yd0 zzi = a.zzi();
                if (zzi == null || (drawable = (Drawable) nt0.M(zzi)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                yd0 zzj = k55Var.zzj();
                if (zzj != null) {
                    if (((Boolean) zzba.zzc().b(g93.D5)).booleanValue()) {
                        scaleType = (ImageView.ScaleType) nt0.M(zzj);
                        imageView.setScaleType(scaleType);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(imageView);
                    }
                }
                scaleType = k;
                imageView.setScaleType(scaleType);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            } catch (RemoteException unused) {
                k04.zzj("Could not get main image drawable");
            }
        }
    }

    public final void c(k55 k55Var) {
        if (k55Var == null || this.e == null || k55Var.zzh() == null || !this.c.g()) {
            return;
        }
        try {
            k55Var.zzh().addView(this.e.a());
        } catch (l74 e) {
            zze.zzb("web view can not be obtained", e);
        }
    }

    public final void d(k55 k55Var) {
        if (k55Var == null) {
            return;
        }
        Context context = k55Var.zzf().getContext();
        if (zzbx.zzh(context, this.c.a)) {
            if (!(context instanceof Activity)) {
                k04.zze("Activity context is needed for policy validator.");
            } else if (this.f == null || k55Var.zzh() == null) {
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.f.a(k55Var.zzh(), windowManager), zzbx.zzb());
                } catch (l74 e) {
                    zze.zzb("web view can not be obtained", e);
                }
            }
        }
    }

    public final void e(final k55 k55Var) {
        this.g.execute(new Runnable() { // from class: com.daaw.j45
            @Override // java.lang.Runnable
            public final void run() {
                l45.this.b(k55Var);
            }
        });
    }

    public final boolean f(ViewGroup viewGroup) {
        return h(viewGroup, true);
    }

    public final boolean h(ViewGroup viewGroup, boolean z) {
        View N = z ? this.d.N() : this.d.O();
        if (N == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (N.getParent() instanceof ViewGroup) {
            ((ViewGroup) N.getParent()).removeView(N);
        }
        viewGroup.addView(N, ((Boolean) zzba.zzc().b(g93.o3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
