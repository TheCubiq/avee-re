package com.daaw.avee.comp.playback.view;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.e0;
import com.daaw.ix1;
import com.daaw.tx0;
import com.daaw.wo0;
/* loaded from: classes.dex */
public class MediaAppWidgetProvider extends AppWidgetProvider {
    public static MediaAppWidgetProvider a;

    /* loaded from: classes.dex */
    public class a implements e0<Bitmap> {
        public final /* synthetic */ RemoteViews a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ int[] c;

        public a(RemoteViews remoteViews, Context context, int[] iArr) {
            this.a = remoteViews;
            this.b = context;
            this.c = iArr;
        }

        @Override // com.daaw.e0
        /* renamed from: b */
        public void a(Bitmap bitmap) {
            if (bitmap != null) {
                this.a.setImageViewBitmap(R.id.imgArt, bitmap);
            } else {
                this.a.setImageViewResource(R.id.imgArt, R.drawable.placeholderart4);
            }
            MediaAppWidgetProvider.this.g(this.b, this.c, this.a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements e0<Bitmap> {
        public final /* synthetic */ RemoteViews a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ int[] c;

        public b(RemoteViews remoteViews, Context context, int[] iArr) {
            this.a = remoteViews;
            this.b = context;
            this.c = iArr;
        }

        @Override // com.daaw.e0
        /* renamed from: b */
        public void a(Bitmap bitmap) {
            if (bitmap != null) {
                this.a.setImageViewBitmap(R.id.imgArt, bitmap);
            } else {
                this.a.setImageViewResource(R.id.imgArt, R.drawable.placeholderart4);
            }
            MediaAppWidgetProvider.this.g(this.b, this.c, this.a);
        }
    }

    public MediaAppWidgetProvider() {
        ix1.a();
    }

    public static synchronized MediaAppWidgetProvider c() {
        MediaAppWidgetProvider mediaAppWidgetProvider;
        synchronized (MediaAppWidgetProvider.class) {
            if (a == null) {
                a = new MediaAppWidgetProvider();
            }
            mediaAppWidgetProvider = a;
        }
        return mediaAppWidgetProvider;
    }

    public final void b(Context context, int[] iArr, Class<?> cls) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.notification_bar_widget);
        tx0.b bVar = tx0.h;
        h(context, remoteViews, bVar, false, false, cls, 0);
        wo0.l(context, remoteViews, bVar, new a(remoteViews, context, iArr), null);
        g(context, iArr, remoteViews);
    }

    public final boolean d(Context context) {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, getClass())).length > 0;
    }

    public void e(Context context, tx0.b bVar, boolean z, boolean z2, Class<?> cls) {
        if (d(context)) {
            f(context, null, bVar, z, z2, cls);
        }
    }

    public void f(Context context, int[] iArr, tx0.b bVar, boolean z, boolean z2, Class<?> cls) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.notification_bar_widget);
        h(context, remoteViews, bVar, z, z2, cls, 0);
        wo0.l(context, remoteViews, bVar, new b(remoteViews, context, iArr), null);
        g(context, iArr, remoteViews);
    }

    public final void g(Context context, int[] iArr, RemoteViews remoteViews) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (iArr != null) {
            appWidgetManager.updateAppWidget(iArr, remoteViews);
        } else {
            appWidgetManager.updateAppWidget(new ComponentName(context, getClass()), remoteViews);
        }
    }

    public void h(Context context, RemoteViews remoteViews, tx0.b bVar, boolean z, boolean z2, Class<?> cls, int i) {
        wo0.k(context, remoteViews, bVar, z, z2, cls, i, null);
        remoteViews.setViewVisibility(R.id.btnClose, 8);
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(131072);
        remoteViews.setOnClickPendingIntent(R.id.artGroup, PendingIntent.getActivity(context, 0, intent, 67108864));
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        b(context, iArr, MediaPlaybackService.class);
        Intent intent = new Intent("APP_WIDGET_UPDATE_ACTION");
        intent.putExtra("appWidgetIds", iArr);
        intent.addFlags(1073741824);
        context.sendBroadcast(intent);
    }
}
