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
import android.os.RemoteException;
import com.daaw.dt0;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.C3985R;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
/* loaded from: classes.dex */
public final class kq5 extends zq3 {

    /* renamed from: p */
    public final Context f16699p;

    /* renamed from: q */
    public final kd5 f16700q;

    /* renamed from: r */
    public final p04 f16701r;

    /* renamed from: s */
    public final cq5 f16702s;

    /* renamed from: t */
    public final on6 f16703t;

    public kq5(Context context, cq5 cq5Var, p04 p04Var, kd5 kd5Var, on6 on6Var) {
        this.f16699p = context;
        this.f16700q = kd5Var;
        this.f16701r = p04Var;
        this.f16702s = cq5Var;
        this.f16703t = on6Var;
    }

    /* renamed from: h3 */
    public static void m17485h3(Context context, kd5 kd5Var, on6 on6Var, cq5 cq5Var, String str, String str2) {
        m17484i3(context, kd5Var, on6Var, cq5Var, str, str2, new HashMap());
    }

    /* renamed from: i3 */
    public static void m17484i3(Context context, kd5 kd5Var, on6 on6Var, cq5 cq5Var, String str, String str2, Map map) {
        String m18586f;
        if (((Boolean) zzba.zzc().m23658b(g93.f10469K7)).booleanValue()) {
            nn6 m14953b = nn6.m14953b(str2);
            m14953b.m14954a("gqi", str);
            m14953b.m14954a("device_connectivity", true == zzt.zzo().m11899x(context) ? "online" : "offline");
            m14953b.m14954a("event_timestamp", String.valueOf(zzt.zzB().mo15860a()));
            for (Map.Entry entry : map.entrySet()) {
                m14953b.m14954a((String) entry.getKey(), (String) entry.getValue());
            }
            m18586f = on6Var.mo7888b(m14953b);
        } else {
            jd5 m17776a = kd5Var.m17776a();
            m17776a.m18590b("gqi", str);
            m17776a.m18590b("action", str2);
            m17776a.m18590b("device_connectivity", true == zzt.zzo().m11899x(context) ? "online" : "offline");
            m17776a.m18590b("event_timestamp", String.valueOf(zzt.zzB().mo15860a()));
            for (Map.Entry entry2 : map.entrySet()) {
                m17776a.m18590b((String) entry2.getKey(), (String) entry2.getValue());
            }
            m18586f = m17776a.m18586f();
        }
        cq5Var.m25118u(new eq5(zzt.zzB().mo15860a(), str, m18586f, 2));
    }

    /* renamed from: j3 */
    public static void m17483j3(final Activity activity, final zzl zzlVar, final zzbr zzbrVar, final cq5 cq5Var, final kd5 kd5Var, final on6 on6Var, final String str, final String str2) {
        zzt.zzp();
        AlertDialog.Builder zzG = zzs.zzG(activity);
        final Resources m11919d = zzt.zzo().m11919d();
        zzG.setTitle(m11919d == null ? "Open ad when you're back online." : m11919d.getString(C3985R.string.offline_opt_in_title)).setMessage(m11919d == null ? "We'll send you a notification with a link to the advertiser site." : m11919d.getString(C3985R.string.offline_opt_in_message)).setPositiveButton(m11919d == null ? "OK" : m11919d.getString(C3985R.string.offline_opt_in_confirm), new DialogInterface.OnClickListener() { // from class: com.daaw.gq5
            /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
                if (r0.zzf(com.daaw.nt0.m14830g3(r10), r14, r13) == false) goto L14;
             */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(DialogInterface dialogInterface, int i) {
                final zzl zzlVar2;
                kd5 kd5Var2 = kd5.this;
                Activity activity2 = activity;
                on6 on6Var2 = on6Var;
                cq5 cq5Var2 = cq5Var;
                String str3 = str;
                zzbr zzbrVar2 = zzbrVar;
                String str4 = str2;
                Resources resources = m11919d;
                zzl zzlVar3 = zzlVar;
                if (kd5Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "confirm");
                    zzlVar2 = zzlVar3;
                    kq5.m17484i3(activity2, kd5Var2, on6Var2, cq5Var2, str3, "dialog_click", hashMap);
                } else {
                    zzlVar2 = zzlVar3;
                }
                try {
                } catch (RemoteException e) {
                    k04.zzh("Failed to schedule offline notification poster.", e);
                }
                cq5Var2.m25119q(str3);
                if (kd5Var2 != null) {
                    kq5.m17485h3(activity2, kd5Var2, on6Var2, cq5Var2, str3, "offline_notification_worker_not_scheduled");
                }
                zzt.zzp();
                AlertDialog.Builder zzG2 = zzs.zzG(activity2);
                zzG2.setMessage(resources == null ? "You'll get a notification with the link when you're back online" : resources.getString(C3985R.string.offline_opt_in_confirmation)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.daaw.fq5
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface2) {
                        zzl zzlVar4 = zzl.this;
                        if (zzlVar4 != null) {
                            zzlVar4.zzb();
                        }
                    }
                });
                AlertDialog create = zzG2.create();
                create.show();
                Timer timer = new Timer();
                timer.schedule(new jq5(create, timer, zzlVar2), 3000L);
            }
        }).setNegativeButton(m11919d == null ? "No thanks" : m11919d.getString(C3985R.string.offline_opt_in_decline), new DialogInterface.OnClickListener() { // from class: com.daaw.hq5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                cq5 cq5Var2 = cq5.this;
                String str3 = str;
                kd5 kd5Var2 = kd5Var;
                Activity activity2 = activity;
                on6 on6Var2 = on6Var;
                zzl zzlVar2 = zzlVar;
                cq5Var2.m25119q(str3);
                if (kd5Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    kq5.m17484i3(activity2, kd5Var2, on6Var2, cq5Var2, str3, "dialog_click", hashMap);
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
                cq5Var2.m25119q(str3);
                if (kd5Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    kq5.m17484i3(activity2, kd5Var2, on6Var2, cq5Var2, str3, "dialog_click", hashMap);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        zzG.create().show();
    }

    /* renamed from: l3 */
    public static final PendingIntent m17481l3(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, AdService.CLASS_NAME);
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        return pv6.m13017a(context, 0, intent, pv6.f23416a | 1073741824, 0);
    }

    @Override // com.daaw.ar3
    /* renamed from: N */
    public final void mo3432N(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean m11899x = zzt.zzo().m11899x(this.f16699p);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == m11899x ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.f16699p;
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
            m17482k3(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.f16702s.getWritableDatabase();
                if (r8 == 1) {
                    this.f16702s.m25125E(writableDatabase, this.f16701r, stringExtra2);
                } else {
                    cq5.m25123L(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                k04.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    /* renamed from: k3 */
    public final void m17482k3(String str, String str2, Map map) {
        m17484i3(this.f16699p, this.f16700q, this.f16703t, this.f16702s, str, str2, map);
    }

    @Override // com.daaw.ar3
    /* renamed from: l1 */
    public final void mo3431l1(yd0 yd0Var, String str, String str2) {
        String str3;
        Context context = (Context) nt0.m14831M(yd0Var);
        zzt.zzq().zzg(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent m17481l3 = m17481l3(context, "offline_notification_clicked", str2, str);
        PendingIntent m17481l32 = m17481l3(context, "offline_notification_dismissed", str2, str);
        Resources m11919d = zzt.zzo().m11919d();
        dt0.C1136d m23964n = new dt0.C1136d(context, "offline_notification_channel").m23969i(m11919d == null ? "View the ad you saved when you were offline" : m11919d.getString(C3985R.string.offline_notification_title)).m23970h(m11919d == null ? "Tap to open ad" : m11919d.getString(C3985R.string.offline_notification_text)).m23973e(true).m23968j(m17481l32).m23971g(m17481l3).m23964n(context.getApplicationInfo().icon);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap = new HashMap();
        try {
            notificationManager.notify(str2, 54321, m23964n.m23976b());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            hashMap.put("notification_not_shown_reason", e.getMessage());
            str3 = "offline_notification_failed";
        }
        m17482k3(str2, str3, hashMap);
    }

    @Override // com.daaw.ar3
    public final void zzf() {
        cq5 cq5Var = this.f16702s;
        final p04 p04Var = this.f16701r;
        cq5Var.m25117w(new em6() { // from class: com.daaw.vp5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                cq5.m25120n(p04.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }
}
