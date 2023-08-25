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
    public String c;
    public static final Object e = new Object();
    public static final w70 f = new w70();
    public static final int d = x70.a;

    public static w70 m() {
        return f;
    }

    @Override // com.daaw.x70
    public Intent b(Context context, int i, String str) {
        return super.b(context, i, str);
    }

    @Override // com.daaw.x70
    public PendingIntent c(Context context, int i, int i2) {
        return super.c(context, i, i2);
    }

    @Override // com.daaw.x70
    public final String e(int i) {
        return super.e(i);
    }

    @Override // com.daaw.x70
    public int g(Context context) {
        return super.g(context);
    }

    @Override // com.daaw.x70
    public int h(Context context, int i) {
        return super.h(context, i);
    }

    @Override // com.daaw.x70
    public final boolean j(int i) {
        return super.j(i);
    }

    public Dialog k(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i, u12.b(activity, b(activity, i, "d"), i2), onCancelListener);
    }

    public PendingIntent l(Context context, ConnectionResult connectionResult) {
        return connectionResult.t() ? connectionResult.s() : c(context, connectionResult.h(), 0);
    }

    public boolean n(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog k = k(activity, i, i2, onCancelListener);
        if (k == null) {
            return false;
        }
        s(activity, k, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int i) {
        t(context, i, null, d(context, i, 0, "n"));
    }

    public final Dialog p(Context context, int i, u12 u12Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(r02.d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = r02.c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, u12Var);
        }
        String g = r02.g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i));
        new IllegalArgumentException();
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(r02.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final p02 r(Context context, o02 o02Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        p02 p02Var = new p02(o02Var);
        context.registerReceiver(p02Var, intentFilter);
        p02Var.a(context);
        if (i(context, "com.google.android.gms")) {
            return p02Var;
        }
        o02Var.a();
        p02Var.b();
        return null;
    }

    public final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof p30) {
                ei1.V1(dialog, onCancelListener).U1(((p30) activity).x(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        tx.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    public final void t(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null);
        new IllegalArgumentException();
        if (i == 18) {
            u(context);
        } else if (pendingIntent == null) {
        } else {
            String f2 = r02.f(context, i);
            String e2 = r02.e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) ry0.j(context.getSystemService("notification"));
            dt0.d o = new dt0.d(context).l(true).e(true).i(f2).o(new dt0.b().h(e2));
            if (nt.f(context)) {
                ry0.m(vw0.e());
                o.n(context.getApplicationInfo().icon).m(2);
                if (nt.g(context)) {
                    o.a(i11.common_full_open_on_phone, resources.getString(f21.common_open_on_phone), pendingIntent);
                } else {
                    o.g(pendingIntent);
                }
            } else {
                o.n(17301642).p(resources.getString(f21.common_google_play_services_notification_ticker)).q(System.currentTimeMillis()).g(pendingIntent).h(e2);
            }
            if (vw0.i()) {
                ry0.m(vw0.i());
                synchronized (e) {
                    str2 = this.c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String b = r02.b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel("com.google.android.gms.availability", b, 4);
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                o.f(str2);
            }
            Notification b2 = o.b();
            if (i == 1 || i == 2 || i == 3) {
                c80.b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b2);
        }
    }

    public final void u(Context context) {
        new v02(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(Activity activity, pj0 pj0Var, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog p = p(activity, i, u12.c(pj0Var, b(activity, i, "d"), 2), onCancelListener);
        if (p == null) {
            return false;
        }
        s(activity, p, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent l;
        if (lg0.a(context) || (l = l(context, connectionResult)) == null) {
            return false;
        }
        t(context, connectionResult.h(), null, e22.a(context, 0, GoogleApiActivity.a(context, l, i, true), e22.a | 134217728));
        return true;
    }
}
