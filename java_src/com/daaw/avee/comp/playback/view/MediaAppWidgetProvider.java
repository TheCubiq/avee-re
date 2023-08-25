package com.daaw.avee.comp.playback.view;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.daaw.InterfaceC1153e0;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.ix1;
import com.daaw.tx0;
import com.daaw.wo0;
/* loaded from: classes.dex */
public class MediaAppWidgetProvider extends AppWidgetProvider {

    /* renamed from: a */
    public static MediaAppWidgetProvider f4045a;

    /* renamed from: com.daaw.avee.comp.playback.view.MediaAppWidgetProvider$a */
    /* loaded from: classes.dex */
    public class C0774a implements InterfaceC1153e0<Bitmap> {

        /* renamed from: a */
        public final /* synthetic */ RemoteViews f4046a;

        /* renamed from: b */
        public final /* synthetic */ Context f4047b;

        /* renamed from: c */
        public final /* synthetic */ int[] f4048c;

        public C0774a(RemoteViews remoteViews, Context context, int[] iArr) {
            this.f4046a = remoteViews;
            this.f4047b = context;
            this.f4048c = iArr;
        }

        @Override // com.daaw.InterfaceC1153e0
        /* renamed from: b */
        public void mo7884a(Bitmap bitmap) {
            if (bitmap != null) {
                this.f4046a.setImageViewBitmap(R.id.imgArt, bitmap);
            } else {
                this.f4046a.setImageViewResource(R.id.imgArt, R.drawable.placeholderart4);
            }
            MediaAppWidgetProvider.this.m26636g(this.f4047b, this.f4048c, this.f4046a);
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.view.MediaAppWidgetProvider$b */
    /* loaded from: classes.dex */
    public class C0775b implements InterfaceC1153e0<Bitmap> {

        /* renamed from: a */
        public final /* synthetic */ RemoteViews f4050a;

        /* renamed from: b */
        public final /* synthetic */ Context f4051b;

        /* renamed from: c */
        public final /* synthetic */ int[] f4052c;

        public C0775b(RemoteViews remoteViews, Context context, int[] iArr) {
            this.f4050a = remoteViews;
            this.f4051b = context;
            this.f4052c = iArr;
        }

        @Override // com.daaw.InterfaceC1153e0
        /* renamed from: b */
        public void mo7884a(Bitmap bitmap) {
            if (bitmap != null) {
                this.f4050a.setImageViewBitmap(R.id.imgArt, bitmap);
            } else {
                this.f4050a.setImageViewResource(R.id.imgArt, R.drawable.placeholderart4);
            }
            MediaAppWidgetProvider.this.m26636g(this.f4051b, this.f4052c, this.f4050a);
        }
    }

    public MediaAppWidgetProvider() {
        ix1.m19300a();
    }

    /* renamed from: c */
    public static synchronized MediaAppWidgetProvider m26640c() {
        MediaAppWidgetProvider mediaAppWidgetProvider;
        synchronized (MediaAppWidgetProvider.class) {
            if (f4045a == null) {
                f4045a = new MediaAppWidgetProvider();
            }
            mediaAppWidgetProvider = f4045a;
        }
        return mediaAppWidgetProvider;
    }

    /* renamed from: b */
    public final void m26641b(Context context, int[] iArr, Class<?> cls) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.notification_bar_widget);
        tx0.C3143b c3143b = tx0.f28188h;
        m26635h(context, remoteViews, c3143b, false, false, cls, 0);
        wo0.m5909l(context, remoteViews, c3143b, new C0774a(remoteViews, context, iArr), null);
        m26636g(context, iArr, remoteViews);
    }

    /* renamed from: d */
    public final boolean m26639d(Context context) {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, getClass())).length > 0;
    }

    /* renamed from: e */
    public void m26638e(Context context, tx0.C3143b c3143b, boolean z, boolean z2, Class<?> cls) {
        if (m26639d(context)) {
            m26637f(context, null, c3143b, z, z2, cls);
        }
    }

    /* renamed from: f */
    public void m26637f(Context context, int[] iArr, tx0.C3143b c3143b, boolean z, boolean z2, Class<?> cls) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.notification_bar_widget);
        m26635h(context, remoteViews, c3143b, z, z2, cls, 0);
        wo0.m5909l(context, remoteViews, c3143b, new C0775b(remoteViews, context, iArr), null);
        m26636g(context, iArr, remoteViews);
    }

    /* renamed from: g */
    public final void m26636g(Context context, int[] iArr, RemoteViews remoteViews) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (iArr != null) {
            appWidgetManager.updateAppWidget(iArr, remoteViews);
        } else {
            appWidgetManager.updateAppWidget(new ComponentName(context, getClass()), remoteViews);
        }
    }

    /* renamed from: h */
    public void m26635h(Context context, RemoteViews remoteViews, tx0.C3143b c3143b, boolean z, boolean z2, Class<?> cls, int i) {
        wo0.m5910k(context, remoteViews, c3143b, z, z2, cls, i, null);
        remoteViews.setViewVisibility(R.id.btnClose, 8);
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(131072);
        remoteViews.setOnClickPendingIntent(R.id.artGroup, PendingIntent.getActivity(context, 0, intent, 67108864));
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        m26641b(context, iArr, MediaPlaybackService.class);
        Intent intent = new Intent("APP_WIDGET_UPDATE_ACTION");
        intent.putExtra("appWidgetIds", iArr);
        intent.addFlags(1073741824);
        context.sendBroadcast(intent);
    }
}
