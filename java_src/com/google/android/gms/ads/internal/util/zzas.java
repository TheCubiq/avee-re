package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.daaw.dh5;
import com.daaw.g77;
import com.daaw.g93;
import com.daaw.k04;
import com.daaw.z04;
import com.daaw.zg5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class zzas {
    public final Context a;
    public final dh5 b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    public PointF i;
    public PointF j;
    public Handler k;
    public Runnable l;

    public zzas(Context context) {
        this.g = 0;
        this.l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
            @Override // java.lang.Runnable
            public final void run() {
                zzas.this.g();
            }
        };
        this.a = context;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzt().zzb();
        this.k = com.google.android.gms.ads.internal.zzt.zzt().zza();
        this.b = com.google.android.gms.ads.internal.zzt.zzs().zza();
    }

    public zzas(Context context, String str) {
        this(context);
        this.c = str;
    }

    public static final int o(List list, String str, boolean z) {
        if (z) {
            list.add(str);
            return list.size() - 1;
        }
        return -1;
    }

    public final /* synthetic */ void a() {
        m(this.a);
    }

    public final /* synthetic */ void b() {
        m(this.a);
    }

    public final /* synthetic */ void c(g77 g77Var) {
        if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.a, this.d, this.e)) {
            g77Var.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                @Override // java.lang.Runnable
                public final void run() {
                    zzas.this.b();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzs().zzd(this.a, this.d, this.e);
        }
    }

    public final /* synthetic */ void d(g77 g77Var) {
        if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.a, this.d, this.e)) {
            g77Var.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaq
                @Override // java.lang.Runnable
                public final void run() {
                    zzas.this.f();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzs().zzd(this.a, this.d, this.e);
        }
    }

    public final /* synthetic */ void e() {
        com.google.android.gms.ads.internal.zzt.zzs().zzc(this.a);
    }

    public final /* synthetic */ void f() {
        com.google.android.gms.ads.internal.zzt.zzs().zzc(this.a);
    }

    public final /* synthetic */ void g() {
        this.g = 4;
        zzr();
    }

    public final /* synthetic */ void h(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        dh5 dh5Var;
        zg5 zg5Var;
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                dh5Var = this.b;
                zg5Var = zg5.SHAKE;
            } else if (atomicInteger.get() == i3) {
                dh5Var = this.b;
                zg5Var = zg5.FLICK;
            } else {
                dh5Var = this.b;
                zg5Var = zg5.NONE;
            }
            dh5Var.k(zg5Var);
        }
        zzr();
    }

    public final /* synthetic */ void i(String str, DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzQ(this.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final /* synthetic */ void j(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 != i) {
            if (i6 == i2) {
                k04.zze("Debug mode [Creative Preview] selected.");
                z04.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzac
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzas.this.l();
                    }
                });
            } else if (i6 == i3) {
                k04.zze("Debug mode [Troubleshooting] selected.");
                z04.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzas.this.k();
                    }
                });
            } else if (i6 == i4) {
                final g77 g77Var = z04.e;
                g77 g77Var2 = z04.a;
                if (this.b.n()) {
                    g77Var.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzan
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzas.this.e();
                        }
                    });
                } else {
                    g77Var2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzao
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzas.this.d(g77Var);
                        }
                    });
                }
            } else if (i6 == i5) {
                final g77 g77Var3 = z04.e;
                g77 g77Var4 = z04.a;
                if (this.b.n()) {
                    g77Var3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzas.this.a();
                        }
                    });
                } else {
                    g77Var4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzas.this.c(g77Var3);
                        }
                    });
                }
            }
        } else if (!(this.a instanceof Activity)) {
            k04.zzi("Can not create dialog without Activity Context");
        } else {
            String str = this.c;
            final String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                com.google.android.gms.ads.internal.zzt.zzp();
                Map zzL = zzs.zzL(build);
                for (String str3 : zzL.keySet()) {
                    sb.append(str3);
                    sb.append(" = ");
                    sb.append((String) zzL.get(str3));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder zzG = zzs.zzG(this.a);
            zzG.setMessage(str2);
            zzG.setTitle("Ad Information");
            zzG.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzad
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i7) {
                    zzas.this.i(str2, dialogInterface2, i7);
                }
            });
            zzG.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzae
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i7) {
                }
            });
            zzG.create().show();
        }
    }

    public final /* synthetic */ void k() {
        zzaw zzs = com.google.android.gms.ads.internal.zzt.zzs();
        Context context = this.a;
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f;
        boolean zzm = zzs.zzm();
        zzs.zzh(zzs.zzj(context, str, str2));
        if (!zzs.zzm()) {
            zzs.zzd(context, str, str2);
            return;
        }
        if (!zzm && !TextUtils.isEmpty(str3)) {
            zzs.zze(context, str2, str3, str);
        }
        k04.zze("Device is linked for debug signals.");
        zzs.a(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    public final /* synthetic */ void l() {
        zzaw zzs = com.google.android.gms.ads.internal.zzt.zzs();
        Context context = this.a;
        String str = this.d;
        String str2 = this.e;
        if (!zzs.b(context, str, str2)) {
            zzs.a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(zzs.f)) {
            k04.zze("Creative is not pushed for this device.");
            zzs.a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzs.f)) {
            k04.zze("The app is not linked for creative preview.");
            zzs.zzd(context, str, str2);
        } else if ("0".equals(zzs.f)) {
            k04.zze("Device is linked for in app preview.");
            zzs.a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void m(Context context) {
        ArrayList arrayList = new ArrayList();
        int o = o(arrayList, "None", true);
        final int o2 = o(arrayList, "Shake", true);
        final int o3 = o(arrayList, "Flick", true);
        zg5 zg5Var = zg5.NONE;
        int ordinal = this.b.a().ordinal();
        final int i = ordinal != 1 ? ordinal != 2 ? o : o3 : o2;
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzG = zzs.zzG(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        zzG.setTitle("Setup gesture");
        zzG.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        zzG.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                zzas.this.zzr();
            }
        });
        zzG.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzal
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                zzas.this.h(atomicInteger, i, o2, o3, dialogInterface, i2);
            }
        });
        zzG.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzam
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzas.this.zzr();
            }
        });
        zzG.create().show();
    }

    public final boolean n(float f, float f2, float f3, float f4) {
        return Math.abs(this.i.x - f) < ((float) this.h) && Math.abs(this.i.y - f2) < ((float) this.h) && Math.abs(this.j.x - f3) < ((float) this.h) && Math.abs(this.j.y - f4) < ((float) this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.c);
        sb.append(",DebugSignal: ");
        sb.append(this.f);
        sb.append(",AFMA Version: ");
        sb.append(this.e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.g;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.g = 5;
                this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.k.postDelayed(this.l, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.g4)).longValue());
            }
        } else if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !n(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (n(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.g = -1;
            this.k.removeCallbacks(this.l);
        }
    }

    public final void zzn(String str) {
        this.d = str;
    }

    public final void zzo(String str) {
        this.e = str;
    }

    public final void zzp(String str) {
        this.c = str;
    }

    public final void zzq(String str) {
        this.f = str;
    }

    public final void zzr() {
        try {
            if (!(this.a instanceof Activity)) {
                k04.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzs().zzb())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzt.zzs().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int o = o(arrayList, "Ad information", true);
            final int o2 = o(arrayList, str, true);
            final int o3 = o(arrayList, str2, true);
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.m8)).booleanValue();
            final int o4 = o(arrayList, "Open ad inspector", booleanValue);
            final int o5 = o(arrayList, "Ad inspector settings", booleanValue);
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder zzG = zzs.zzG(this.a);
            zzG.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzas.this.j(o, o2, o3, o4, o5, dialogInterface, i);
                }
            });
            zzG.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }
}
