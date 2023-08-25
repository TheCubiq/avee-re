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

    /* renamed from: a */
    public final Context f36243a;

    /* renamed from: b */
    public final dh5 f36244b;

    /* renamed from: c */
    public String f36245c;

    /* renamed from: d */
    public String f36246d;

    /* renamed from: e */
    public String f36247e;

    /* renamed from: f */
    public String f36248f;

    /* renamed from: g */
    public int f36249g;

    /* renamed from: h */
    public int f36250h;

    /* renamed from: i */
    public PointF f36251i;

    /* renamed from: j */
    public PointF f36252j;

    /* renamed from: k */
    public Handler f36253k;

    /* renamed from: l */
    public Runnable f36254l;

    public zzas(Context context) {
        this.f36249g = 0;
        this.f36254l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
            @Override // java.lang.Runnable
            public final void run() {
                zzas.this.m1366g();
            }
        };
        this.f36243a = context;
        this.f36250h = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzt().zzb();
        this.f36253k = com.google.android.gms.ads.internal.zzt.zzt().zza();
        this.f36244b = com.google.android.gms.ads.internal.zzt.zzs().zza();
    }

    public zzas(Context context, String str) {
        this(context);
        this.f36245c = str;
    }

    /* renamed from: o */
    public static final int m1358o(List list, String str, boolean z) {
        if (z) {
            list.add(str);
            return list.size() - 1;
        }
        return -1;
    }

    /* renamed from: a */
    public final /* synthetic */ void m1372a() {
        m1360m(this.f36243a);
    }

    /* renamed from: b */
    public final /* synthetic */ void m1371b() {
        m1360m(this.f36243a);
    }

    /* renamed from: c */
    public final /* synthetic */ void m1370c(g77 g77Var) {
        if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.f36243a, this.f36246d, this.f36247e)) {
            g77Var.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                @Override // java.lang.Runnable
                public final void run() {
                    zzas.this.m1371b();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzs().zzd(this.f36243a, this.f36246d, this.f36247e);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m1369d(g77 g77Var) {
        if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.f36243a, this.f36246d, this.f36247e)) {
            g77Var.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaq
                @Override // java.lang.Runnable
                public final void run() {
                    zzas.this.m1367f();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzs().zzd(this.f36243a, this.f36246d, this.f36247e);
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void m1368e() {
        com.google.android.gms.ads.internal.zzt.zzs().zzc(this.f36243a);
    }

    /* renamed from: f */
    public final /* synthetic */ void m1367f() {
        com.google.android.gms.ads.internal.zzt.zzs().zzc(this.f36243a);
    }

    /* renamed from: g */
    public final /* synthetic */ void m1366g() {
        this.f36249g = 4;
        zzr();
    }

    /* renamed from: h */
    public final /* synthetic */ void m1365h(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        dh5 dh5Var;
        zg5 zg5Var;
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                dh5Var = this.f36244b;
                zg5Var = zg5.SHAKE;
            } else if (atomicInteger.get() == i3) {
                dh5Var = this.f36244b;
                zg5Var = zg5.FLICK;
            } else {
                dh5Var = this.f36244b;
                zg5Var = zg5.NONE;
            }
            dh5Var.m24400k(zg5Var);
        }
        zzr();
    }

    /* renamed from: i */
    public final /* synthetic */ void m1364i(String str, DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzQ(this.f36243a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* renamed from: j */
    public final /* synthetic */ void m1363j(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 != i) {
            if (i6 == i2) {
                k04.zze("Debug mode [Creative Preview] selected.");
                z04.f34305a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzac
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzas.this.m1361l();
                    }
                });
            } else if (i6 == i3) {
                k04.zze("Debug mode [Troubleshooting] selected.");
                z04.f34305a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzas.this.m1362k();
                    }
                });
            } else if (i6 == i4) {
                final g77 g77Var = z04.f34309e;
                g77 g77Var2 = z04.f34305a;
                if (this.f36244b.m24397n()) {
                    g77Var.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzan
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzas.this.m1368e();
                        }
                    });
                } else {
                    g77Var2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzao
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzas.this.m1369d(g77Var);
                        }
                    });
                }
            } else if (i6 == i5) {
                final g77 g77Var3 = z04.f34309e;
                g77 g77Var4 = z04.f34305a;
                if (this.f36244b.m24397n()) {
                    g77Var3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzas.this.m1372a();
                        }
                    });
                } else {
                    g77Var4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzas.this.m1370c(g77Var3);
                        }
                    });
                }
            }
        } else if (!(this.f36243a instanceof Activity)) {
            k04.zzi("Can not create dialog without Activity Context");
        } else {
            String str = this.f36245c;
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
            AlertDialog.Builder zzG = zzs.zzG(this.f36243a);
            zzG.setMessage(str2);
            zzG.setTitle("Ad Information");
            zzG.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzad
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i7) {
                    zzas.this.m1364i(str2, dialogInterface2, i7);
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

    /* renamed from: k */
    public final /* synthetic */ void m1362k() {
        zzaw zzs = com.google.android.gms.ads.internal.zzt.zzs();
        Context context = this.f36243a;
        String str = this.f36246d;
        String str2 = this.f36247e;
        String str3 = this.f36248f;
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
        zzs.m1357a(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    /* renamed from: l */
    public final /* synthetic */ void m1361l() {
        zzaw zzs = com.google.android.gms.ads.internal.zzt.zzs();
        Context context = this.f36243a;
        String str = this.f36246d;
        String str2 = this.f36247e;
        if (!zzs.m1356b(context, str, str2)) {
            zzs.m1357a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(zzs.f36260f)) {
            k04.zze("Creative is not pushed for this device.");
            zzs.m1357a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzs.f36260f)) {
            k04.zze("The app is not linked for creative preview.");
            zzs.zzd(context, str, str2);
        } else if ("0".equals(zzs.f36260f)) {
            k04.zze("Device is linked for in app preview.");
            zzs.m1357a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* renamed from: m */
    public final void m1360m(Context context) {
        ArrayList arrayList = new ArrayList();
        int m1358o = m1358o(arrayList, "None", true);
        final int m1358o2 = m1358o(arrayList, "Shake", true);
        final int m1358o3 = m1358o(arrayList, "Flick", true);
        zg5 zg5Var = zg5.NONE;
        int ordinal = this.f36244b.m24410a().ordinal();
        final int i = ordinal != 1 ? ordinal != 2 ? m1358o : m1358o3 : m1358o2;
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
                zzas.this.m1365h(atomicInteger, i, m1358o2, m1358o3, dialogInterface, i2);
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

    /* renamed from: n */
    public final boolean m1359n(float f, float f2, float f3, float f4) {
        return Math.abs(this.f36251i.x - f) < ((float) this.f36250h) && Math.abs(this.f36251i.y - f2) < ((float) this.f36250h) && Math.abs(this.f36252j.x - f3) < ((float) this.f36250h) && Math.abs(this.f36252j.y - f4) < ((float) this.f36250h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f36245c);
        sb.append(",DebugSignal: ");
        sb.append(this.f36248f);
        sb.append(",AFMA Version: ");
        sb.append(this.f36247e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f36246d);
        sb.append("}");
        return sb.toString();
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f36249g = 0;
            this.f36251i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f36249g;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.f36249g = 5;
                this.f36252j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f36253k.postDelayed(this.f36254l, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10692g4)).longValue());
            }
        } else if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !m1359n(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (m1359n(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.f36249g = -1;
            this.f36253k.removeCallbacks(this.f36254l);
        }
    }

    public final void zzn(String str) {
        this.f36246d = str;
    }

    public final void zzo(String str) {
        this.f36247e = str;
    }

    public final void zzp(String str) {
        this.f36245c = str;
    }

    public final void zzq(String str) {
        this.f36248f = str;
    }

    public final void zzr() {
        try {
            if (!(this.f36243a instanceof Activity)) {
                k04.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzs().zzb())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzt.zzs().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int m1358o = m1358o(arrayList, "Ad information", true);
            final int m1358o2 = m1358o(arrayList, str, true);
            final int m1358o3 = m1358o(arrayList, str2, true);
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10762m8)).booleanValue();
            final int m1358o4 = m1358o(arrayList, "Open ad inspector", booleanValue);
            final int m1358o5 = m1358o(arrayList, "Ad inspector settings", booleanValue);
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder zzG = zzs.zzG(this.f36243a);
            zzG.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzas.this.m1363j(m1358o, m1358o2, m1358o3, m1358o4, m1358o5, dialogInterface, i);
                }
            });
            zzG.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }
}
