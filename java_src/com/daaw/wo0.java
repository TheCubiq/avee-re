package com.daaw;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.widget.RemoteViews;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.tx0;
/* loaded from: classes.dex */
public class wo0 {

    /* renamed from: a */
    public static uw1<Context, C1652i2, af0, Integer, Integer> f31412a = new uw1<>();

    /* renamed from: com.daaw.wo0$a */
    /* loaded from: classes.dex */
    public class C3457a implements af0 {

        /* renamed from: a */
        public Object f31413a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC1153e0 f31414b;

        public C3457a(InterfaceC1153e0 interfaceC1153e0) {
            this.f31414b = interfaceC1153e0;
        }

        @Override // com.daaw.af0
        /* renamed from: a */
        public void mo5908a(Object obj) {
            this.f31413a = obj;
        }

        @Override // com.daaw.af0
        /* renamed from: b */
        public void mo5907b(df0 df0Var, String str, String str2) {
            this.f31414b.mo7884a(gr1.m21327h(df0.m24431g(df0Var)));
            df0.m24433c(df0Var);
        }
    }

    /* renamed from: c */
    public static void m5918c(Context context, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(i);
        }
    }

    /* renamed from: d */
    public static String m5917d(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            String string = context.getString(R.string.playback_service_notif_channel_name);
            NotificationChannel notificationChannel = new NotificationChannel(string, "Playback Service", 2);
            notificationChannel.setLockscreenVisibility(0);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
            return string;
        }
        return null;
    }

    /* renamed from: e */
    public static Notification m5916e(final Context context, final int i, final String str, tx0.C3143b c3143b, boolean z, boolean z2, Class<?> cls, int i2, final w40<Handler> w40Var) {
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.notification_bar);
        m5910k(context, remoteViews, c3143b, z, z2, cls, i2, w40Var);
        Notification.Builder m5912i = m5912i(context, str);
        m5912i.setContent(remoteViews);
        m5909l(context, remoteViews, c3143b, new InterfaceC1153e0() { // from class: com.daaw.uo0
            @Override // com.daaw.InterfaceC1153e0
            /* renamed from: a */
            public final void mo7884a(Object obj) {
                wo0.m5913h(w40.this, remoteViews, context, str, i, (Bitmap) obj);
            }
        }, w40Var);
        return m5912i.build();
    }

    /* renamed from: f */
    public static Notification m5915f(Context context, int i, String str, tx0.C3143b c3143b, boolean z, boolean z2, Class<?> cls, int i2, w40<Handler> w40Var) {
        return m5916e(context, i, str, c3143b, z, z2, cls, i2, w40Var);
    }

    /* renamed from: g */
    public static /* synthetic */ void m5914g(Bitmap bitmap, RemoteViews remoteViews, Context context, String str, int i) {
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(R.id.imgArt, bitmap);
        } else {
            remoteViews.setImageViewResource(R.id.imgArt, R.drawable.placeholderart4);
        }
        ((NotificationManager) context.getSystemService("notification")).notify(i, m5912i(context, str).setContent(remoteViews).build());
    }

    /* renamed from: h */
    public static /* synthetic */ void m5913h(w40 w40Var, final RemoteViews remoteViews, final Context context, final String str, final int i, final Bitmap bitmap) {
        Handler handler = (Handler) w40Var.mo3478a();
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.vo0
                @Override // java.lang.Runnable
                public final void run() {
                    wo0.m5914g(bitmap, remoteViews, context, str, i);
                }
            });
        }
    }

    /* renamed from: i */
    public static Notification.Builder m5912i(Context context, String str) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(131072);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 67108864);
        Notification.Builder builder = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(context, str) : new Notification.Builder(context);
        builder.setSmallIcon(R.drawable.ic_launcher_mono_xs);
        builder.setContentIntent(activity);
        return builder;
    }

    /* renamed from: j */
    public static void m5911j(Context context, int i, String str, tx0.C3143b c3143b, boolean z, boolean z2, Class<?> cls, int i2, w40<Handler> w40Var) {
        ((NotificationManager) context.getSystemService("notification")).notify(i, m5915f(context, i, str, c3143b, z, z2, cls, i2, w40Var));
    }

    /* renamed from: k */
    public static void m5910k(Context context, RemoteViews remoteViews, tx0.C3143b c3143b, boolean z, boolean z2, Class<?> cls, int i, w40<Handler> w40Var) {
        remoteViews.setImageViewResource(R.id.imgArt, R.drawable.placeholderart4);
        String str = c3143b.f28207e;
        String str2 = c3143b.f28210h;
        String str3 = c3143b.f28208f;
        if (str2 == null || str2.equals("<unknown>")) {
            str2 = context.getString(R.string.unknown_artist_name);
        }
        if (str3 == null || str3.equals("<unknown>")) {
            context.getString(R.string.unknown_album_name);
        }
        int i2 = Build.VERSION.SDK_INT;
        remoteViews.setImageViewResource(R.id.btnPlayPause, z2 ? R.drawable.ic_ctrl_pause_s : R.drawable.ic_ctrl_play_s);
        ComponentName componentName = new ComponentName(context, cls);
        Intent intent = new Intent("PREVIOUS_ACTION");
        int i3 = i2 >= 23 ? 67108864 : 0;
        intent.setComponent(componentName);
        remoteViews.setOnClickPendingIntent(R.id.btnPrev, PendingIntent.getService(context, 0, intent, i3));
        Intent intent2 = new Intent("TOGGLE_PAUSE_ACTION");
        intent2.setComponent(componentName);
        remoteViews.setOnClickPendingIntent(R.id.btnPlayPause, PendingIntent.getService(context, 0, intent2, i3));
        Intent intent3 = new Intent("NEXT_ACTION");
        intent3.setComponent(componentName);
        remoteViews.setOnClickPendingIntent(R.id.btnNext, PendingIntent.getService(context, 0, intent3, i3));
        Intent intent4 = new Intent("ACTIVITY_AND_SERVICE_EXIT_ACTION");
        intent4.setComponent(componentName);
        remoteViews.setOnClickPendingIntent(R.id.btnClose, PendingIntent.getService(context, 0, intent4, i3));
        remoteViews.setTextViewText(R.id.txtSongTitle, str);
        remoteViews.setTextViewText(R.id.txtSongArtist, str2);
    }

    /* renamed from: l */
    public static void m5909l(Context context, RemoteViews remoteViews, tx0.C3143b c3143b, InterfaceC1153e0<Bitmap> interfaceC1153e0, w40<Handler> w40Var) {
        new C1354g2();
        f31412a.m7667a(context, new C1652i2(c3143b.f28203a, c3143b.m8729d(), c3143b.m8731b()), new C3457a(interfaceC1153e0), 200, 200);
    }
}
