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
    public static uw1<Context, i2, af0, Integer, Integer> a = new uw1<>();

    /* loaded from: classes.dex */
    public class a implements af0 {
        public Object a;
        public final /* synthetic */ e0 b;

        public a(e0 e0Var) {
            this.b = e0Var;
        }

        @Override // com.daaw.af0
        public void a(Object obj) {
            this.a = obj;
        }

        @Override // com.daaw.af0
        public void b(df0 df0Var, String str, String str2) {
            this.b.a(gr1.h(df0.g(df0Var)));
            df0.c(df0Var);
        }
    }

    public static void c(Context context, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(i);
        }
    }

    public static String d(Context context) {
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

    public static Notification e(final Context context, final int i, final String str, tx0.b bVar, boolean z, boolean z2, Class<?> cls, int i2, final w40<Handler> w40Var) {
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.notification_bar);
        k(context, remoteViews, bVar, z, z2, cls, i2, w40Var);
        Notification.Builder i3 = i(context, str);
        i3.setContent(remoteViews);
        l(context, remoteViews, bVar, new e0() { // from class: com.daaw.uo0
            @Override // com.daaw.e0
            public final void a(Object obj) {
                wo0.h(w40.this, remoteViews, context, str, i, (Bitmap) obj);
            }
        }, w40Var);
        return i3.build();
    }

    public static Notification f(Context context, int i, String str, tx0.b bVar, boolean z, boolean z2, Class<?> cls, int i2, w40<Handler> w40Var) {
        return e(context, i, str, bVar, z, z2, cls, i2, w40Var);
    }

    public static /* synthetic */ void g(Bitmap bitmap, RemoteViews remoteViews, Context context, String str, int i) {
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(R.id.imgArt, bitmap);
        } else {
            remoteViews.setImageViewResource(R.id.imgArt, R.drawable.placeholderart4);
        }
        ((NotificationManager) context.getSystemService("notification")).notify(i, i(context, str).setContent(remoteViews).build());
    }

    public static /* synthetic */ void h(w40 w40Var, final RemoteViews remoteViews, final Context context, final String str, final int i, final Bitmap bitmap) {
        Handler handler = (Handler) w40Var.a();
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.daaw.vo0
                @Override // java.lang.Runnable
                public final void run() {
                    wo0.g(bitmap, remoteViews, context, str, i);
                }
            });
        }
    }

    public static Notification.Builder i(Context context, String str) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(131072);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 67108864);
        Notification.Builder builder = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(context, str) : new Notification.Builder(context);
        builder.setSmallIcon(R.drawable.ic_launcher_mono_xs);
        builder.setContentIntent(activity);
        return builder;
    }

    public static void j(Context context, int i, String str, tx0.b bVar, boolean z, boolean z2, Class<?> cls, int i2, w40<Handler> w40Var) {
        ((NotificationManager) context.getSystemService("notification")).notify(i, f(context, i, str, bVar, z, z2, cls, i2, w40Var));
    }

    public static void k(Context context, RemoteViews remoteViews, tx0.b bVar, boolean z, boolean z2, Class<?> cls, int i, w40<Handler> w40Var) {
        remoteViews.setImageViewResource(R.id.imgArt, R.drawable.placeholderart4);
        String str = bVar.e;
        String str2 = bVar.h;
        String str3 = bVar.f;
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

    public static void l(Context context, RemoteViews remoteViews, tx0.b bVar, e0<Bitmap> e0Var, w40<Handler> w40Var) {
        new g2();
        a.a(context, new i2(bVar.a, bVar.d(), bVar.b()), new a(e0Var), 200, 200);
    }
}
