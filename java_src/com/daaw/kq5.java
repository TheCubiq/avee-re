package com.daaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import com.daaw.dt0;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class kq5 extends zq3 {
    public final Context p;
    public final kd5 q;
    public final p04 r;
    public final cq5 s;
    public final on6 t;

    public kq5(Context context, cq5 cq5Var, p04 p04Var, kd5 kd5Var, on6 on6Var) {
        this.p = context;
        this.q = kd5Var;
        this.r = p04Var;
        this.s = cq5Var;
        this.t = on6Var;
    }

    public static void h3(Context context, kd5 kd5Var, on6 on6Var, cq5 cq5Var, String str, String str2) {
        i3(context, kd5Var, on6Var, cq5Var, str, str2, new HashMap());
    }

    public static void i3(Context context, kd5 kd5Var, on6 on6Var, cq5 cq5Var, String str, String str2, Map map) {
        String f;
        if (((Boolean) zzba.zzc().b(g93.K7)).booleanValue()) {
            nn6 b = nn6.b(str2);
            b.a("gqi", str);
            b.a("device_connectivity", true == zzt.zzo().x(context) ? "online" : "offline");
            b.a("event_timestamp", String.valueOf(zzt.zzB().a()));
            for (Map.Entry entry : map.entrySet()) {
                b.a((String) entry.getKey(), (String) entry.getValue());
            }
            f = on6Var.b(b);
        } else {
            jd5 a = kd5Var.a();
            a.b("gqi", str);
            a.b("action", str2);
            a.b("device_connectivity", true == zzt.zzo().x(context) ? "online" : "offline");
            a.b("event_timestamp", String.valueOf(zzt.zzB().a()));
            for (Map.Entry entry2 : map.entrySet()) {
                a.b((String) entry2.getKey(), (String) entry2.getValue());
            }
            f = a.f();
        }
        cq5Var.u(new eq5(zzt.zzB().a(), str, f, 2));
    }

    public static void j3(final Activity activity, final zzl zzlVar, final zzbr zzbrVar, final cq5 cq5Var, final kd5 kd5Var, final on6 on6Var, final String str, final String str2) {
        zzt.zzp();
        AlertDialog.Builder zzG = zzs.zzG(activity);
        final Resources d = zzt.zzo().d();
        zzG.setTitle(d == null ? "Open ad when you're back online." : d.getString(R.string.offline_opt_in_title)).setMessage(d == null ? "We'll send you a notification with a link to the advertiser site." : d.getString(R.string.offline_opt_in_message)).setPositiveButton(d == null ? "OK" : d.getString(R.string.offline_opt_in_confirm), new DialogInterface.OnClickListener() { // from class: com.daaw.gq5
            /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
                if (r0.zzf(com.daaw.nt0.g3(r10), r14, r13) == false) goto L14;
             */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.content.DialogInterface r19, int r20) {
                /*
                    r18 = this;
                    r1 = r18
                    com.daaw.kd5 r9 = com.daaw.kd5.this
                    android.app.Activity r10 = r2
                    com.daaw.on6 r11 = r3
                    com.daaw.cq5 r12 = r4
                    java.lang.String r13 = r5
                    com.google.android.gms.ads.internal.util.zzbr r0 = r6
                    java.lang.String r14 = r7
                    android.content.res.Resources r15 = r8
                    com.google.android.gms.ads.internal.overlay.zzl r8 = r9
                    if (r9 == 0) goto L34
                    java.util.HashMap r7 = new java.util.HashMap
                    r7.<init>()
                    java.lang.String r2 = "dialog_action"
                    java.lang.String r3 = "confirm"
                    r7.put(r2, r3)
                    java.lang.String r16 = "dialog_click"
                    r2 = r10
                    r3 = r9
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    r17 = r7
                    r7 = r16
                    r1 = r8
                    r8 = r17
                    com.daaw.kq5.i3(r2, r3, r4, r5, r6, r7, r8)
                    goto L35
                L34:
                    r1 = r8
                L35:
                    com.daaw.yd0 r2 = com.daaw.nt0.g3(r10)     // Catch: android.os.RemoteException -> L40
                    boolean r0 = r0.zzf(r2, r14, r13)     // Catch: android.os.RemoteException -> L40
                    if (r0 != 0) goto L55
                    goto L46
                L40:
                    r0 = move-exception
                    java.lang.String r2 = "Failed to schedule offline notification poster."
                    com.daaw.k04.zzh(r2, r0)
                L46:
                    r12.q(r13)
                    if (r9 == 0) goto L55
                    java.lang.String r7 = "offline_notification_worker_not_scheduled"
                    r2 = r10
                    r3 = r9
                    r4 = r11
                    r5 = r12
                    r6 = r13
                    com.daaw.kq5.h3(r2, r3, r4, r5, r6, r7)
                L55:
                    com.google.android.gms.ads.internal.zzt.zzp()
                    android.app.AlertDialog$Builder r0 = com.google.android.gms.ads.internal.util.zzs.zzG(r10)
                    if (r15 != 0) goto L61
                    java.lang.String r2 = "You'll get a notification with the link when you're back online"
                    goto L67
                L61:
                    int r2 = com.google.android.gms.ads.impl.R.string.offline_opt_in_confirmation
                    java.lang.String r2 = r15.getString(r2)
                L67:
                    android.app.AlertDialog$Builder r2 = r0.setMessage(r2)
                    com.daaw.fq5 r3 = new com.daaw.fq5
                    r3.<init>()
                    r2.setOnCancelListener(r3)
                    android.app.AlertDialog r0 = r0.create()
                    r0.show()
                    java.util.Timer r2 = new java.util.Timer
                    r2.<init>()
                    com.daaw.jq5 r3 = new com.daaw.jq5
                    r3.<init>(r0, r2, r1)
                    r0 = 3000(0xbb8, double:1.482E-320)
                    r2.schedule(r3, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.gq5.onClick(android.content.DialogInterface, int):void");
            }
        }).setNegativeButton(d == null ? "No thanks" : d.getString(R.string.offline_opt_in_decline), new DialogInterface.OnClickListener() { // from class: com.daaw.hq5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                cq5 cq5Var2 = cq5.this;
                String str3 = str;
                kd5 kd5Var2 = kd5Var;
                Activity activity2 = activity;
                on6 on6Var2 = on6Var;
                zzl zzlVar2 = zzlVar;
                cq5Var2.q(str3);
                if (kd5Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    kq5.i3(activity2, kd5Var2, on6Var2, cq5Var2, str3, "dialog_click", hashMap);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.daaw.iq5
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                cq5 cq5Var2 = cq5.this;
                String str3 = str;
                kd5 kd5Var2 = kd5Var;
                Activity activity2 = activity;
                on6 on6Var2 = on6Var;
                zzl zzlVar2 = zzlVar;
                cq5Var2.q(str3);
                if (kd5Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    kq5.i3(activity2, kd5Var2, on6Var2, cq5Var2, str3, "dialog_click", hashMap);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        zzG.create().show();
    }

    public static final PendingIntent l3(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, AdService.CLASS_NAME);
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        return pv6.a(context, 0, intent, pv6.a | 1073741824, 0);
    }

    @Override // com.daaw.ar3
    public final void N(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean x = zzt.zzo().x(this.p);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == x ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.p;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            k3(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.s.getWritableDatabase();
                if (r8 == 1) {
                    this.s.E(writableDatabase, this.r, stringExtra2);
                } else {
                    cq5.L(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                k04.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    public final void k3(String str, String str2, Map map) {
        i3(this.p, this.q, this.t, this.s, str, str2, map);
    }

    @Override // com.daaw.ar3
    public final void l1(yd0 yd0Var, String str, String str2) {
        String str3;
        Context context = (Context) nt0.M(yd0Var);
        zzt.zzq().zzg(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent l3 = l3(context, "offline_notification_clicked", str2, str);
        PendingIntent l32 = l3(context, "offline_notification_dismissed", str2, str);
        Resources d = zzt.zzo().d();
        dt0.d n = new dt0.d(context, "offline_notification_channel").i(d == null ? "View the ad you saved when you were offline" : d.getString(R.string.offline_notification_title)).h(d == null ? "Tap to open ad" : d.getString(R.string.offline_notification_text)).e(true).j(l32).g(l3).n(context.getApplicationInfo().icon);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap = new HashMap();
        try {
            notificationManager.notify(str2, 54321, n.b());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            hashMap.put("notification_not_shown_reason", e.getMessage());
            str3 = "offline_notification_failed";
        }
        k3(str2, str3, hashMap);
    }

    @Override // com.daaw.ar3
    public final void zzf() {
        cq5 cq5Var = this.s;
        final p04 p04Var = this.r;
        cq5Var.w(new em6() { // from class: com.daaw.vp5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                cq5.n(p04.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }
}
