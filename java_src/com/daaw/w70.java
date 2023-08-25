package com.daaw;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.daaw.dt0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
/* loaded from: classes.dex */
public class w70 extends x70 {

    /* renamed from: c */
    public String f30969c;

    /* renamed from: e */
    public static final Object f30967e = new Object();

    /* renamed from: f */
    public static final w70 f30968f = new w70();

    /* renamed from: d */
    public static final int f30966d = x70.f32161a;

    /* renamed from: m */
    public static w70 m6477m() {
        return f30968f;
    }

    @Override // com.daaw.x70
    /* renamed from: b */
    public Intent mo5496b(Context context, int i, String str) {
        return super.mo5496b(context, i, str);
    }

    @Override // com.daaw.x70
    /* renamed from: c */
    public PendingIntent mo5495c(Context context, int i, int i2) {
        return super.mo5495c(context, i, i2);
    }

    @Override // com.daaw.x70
    /* renamed from: e */
    public final String mo5493e(int i) {
        return super.mo5493e(i);
    }

    @Override // com.daaw.x70
    /* renamed from: g */
    public int mo5491g(Context context) {
        return super.mo5491g(context);
    }

    @Override // com.daaw.x70
    /* renamed from: h */
    public int mo5490h(Context context, int i) {
        return super.mo5490h(context, i);
    }

    @Override // com.daaw.x70
    /* renamed from: j */
    public final boolean mo5488j(int i) {
        return super.mo5488j(i);
    }

    /* renamed from: k */
    public Dialog m6479k(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m6474p(activity, i, u12.m8638b(activity, mo5496b(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: l */
    public PendingIntent m6478l(Context context, ConnectionResult connectionResult) {
        return connectionResult.m1206t() ? connectionResult.m1207s() : mo5495c(context, connectionResult.m1209h(), 0);
    }

    /* renamed from: n */
    public boolean m6476n(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m6479k = m6479k(activity, i, i2, onCancelListener);
        if (m6479k == null) {
            return false;
        }
        m6471s(activity, m6479k, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: o */
    public void m6475o(Context context, int i) {
        m6470t(context, i, null, m5494d(context, i, 0, "n"));
    }

    /* renamed from: p */
    public final Dialog m6474p(Context context, int i, u12 u12Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(r02.m11882d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String m11883c = r02.m11883c(context, i);
        if (m11883c != null) {
            builder.setPositiveButton(m11883c, u12Var);
        }
        String m11879g = r02.m11879g(context, i);
        if (m11879g != null) {
            builder.setTitle(m11879g);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i));
        new IllegalArgumentException();
        return builder.create();
    }

    /* renamed from: q */
    public final Dialog m6473q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(r02.m11882d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m6471s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: r */
    public final p02 m6472r(Context context, o02 o02Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        p02 p02Var = new p02(o02Var);
        context.registerReceiver(p02Var, intentFilter);
        p02Var.m13774a(context);
        if (m5489i(context, "com.google.android.gms")) {
            return p02Var;
        }
        o02Var.mo14658a();
        p02Var.m13773b();
        return null;
    }

    /* renamed from: s */
    public final void m6471s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof p30) {
                ei1.m23466V1(dialog, onCancelListener).mo13989U1(((p30) activity).m13655x(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC3141tx.m8752a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: t */
    public final void m6470t(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null);
        new IllegalArgumentException();
        if (i == 18) {
            m6469u(context);
        } else if (pendingIntent == null) {
        } else {
            String m11880f = r02.m11880f(context, i);
            String m11881e = r02.m11881e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) ry0.m10830j(context.getSystemService("notification"));
            dt0.C1136d m23963o = new dt0.C1136d(context).m23966l(true).m23973e(true).m23969i(m11880f).m23963o(new dt0.C1134b().m23979h(m11881e));
            if (C2365nt.m14835f(context)) {
                ry0.m10827m(vw0.m6700e());
                m23963o.m23964n(context.getApplicationInfo().icon).m23965m(2);
                if (C2365nt.m14834g(context)) {
                    m23963o.m23977a(i11.common_full_open_on_phone, resources.getString(f21.common_open_on_phone), pendingIntent);
                } else {
                    m23963o.m23971g(pendingIntent);
                }
            } else {
                m23963o.m23964n(17301642).m23962p(resources.getString(f21.common_google_play_services_notification_ticker)).m23961q(System.currentTimeMillis()).m23971g(pendingIntent).m23970h(m11881e);
            }
            if (vw0.m6696i()) {
                ry0.m10827m(vw0.m6696i());
                synchronized (f30967e) {
                    str2 = this.f30969c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String m11884b = r02.m11884b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel("com.google.android.gms.availability", m11884b, 4);
                    } else if (!m11884b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(m11884b);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                m23963o.m23972f(str2);
            }
            Notification m23976b = m23963o.m23976b();
            if (i == 1 || i == 2 || i == 3) {
                c80.f5614b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, m23976b);
        }
    }

    /* renamed from: u */
    public final void m6469u(Context context) {
        new v02(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: v */
    public final boolean m6468v(Activity activity, pj0 pj0Var, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m6474p = m6474p(activity, i, u12.m8637c(pj0Var, mo5496b(activity, i, "d"), 2), onCancelListener);
        if (m6474p == null) {
            return false;
        }
        m6471s(activity, m6474p, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: w */
    public final boolean m6467w(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent m6478l;
        if (lg0.m16965a(context) || (m6478l = m6478l(context, connectionResult)) == null) {
            return false;
        }
        m6470t(context, connectionResult.m1209h(), null, e22.m23790a(context, 0, GoogleApiActivity.m1201a(context, m6478l, i, true), e22.f8048a | 134217728));
        return true;
    }
}
