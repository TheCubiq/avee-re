package com.daaw.avee.comp.playback.view;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Design.WidgetAndNotificationDesign;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.MediaPlaybackServiceDefs;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
/* loaded from: classes.dex */
public class MediaAppWidgetProvider extends AppWidgetProvider {
    private static MediaAppWidgetProvider sInstance;

    public static synchronized MediaAppWidgetProvider getInstance() {
        MediaAppWidgetProvider mediaAppWidgetProvider;
        synchronized (MediaAppWidgetProvider.class) {
            if (sInstance == null) {
                sInstance = new MediaAppWidgetProvider();
            }
            mediaAppWidgetProvider = sInstance;
        }
        return mediaAppWidgetProvider;
    }

    public MediaAppWidgetProvider() {
        WidgetAndNotificationDesign.createInstance();
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        defaultAppWidget(context, iArr, MediaPlaybackService.class);
        Intent intent = new Intent(MediaPlaybackServiceDefs.APP_WIDGET_UPDATE_ACTION);
        intent.putExtra("appWidgetIds", iArr);
        intent.addFlags(1073741824);
        context.sendBroadcast(intent);
    }

    private void defaultAppWidget(final Context context, final int[] iArr, Class<?> cls) {
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.notification_bar_widget);
        updateNotificationViews(context, remoteViews, PlaylistSong.emptyData, false, false, cls, 0);
        MediaPlaybackNotification.updateNotificationViewsImg(context, remoteViews, PlaylistSong.emptyData, new Action1<Bitmap>() { // from class: com.daaw.avee.comp.playback.view.MediaAppWidgetProvider.1
            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(Bitmap bitmap) {
                if (bitmap != null) {
                    remoteViews.setImageViewBitmap(R.id.imgArt, bitmap);
                } else {
                    remoteViews.setImageViewResource(R.id.imgArt, R.drawable.placeholderart4);
                }
                MediaAppWidgetProvider.this.pushUpdate(context, iArr, remoteViews);
            }
        }, null);
        pushUpdate(context, iArr, remoteViews);
    }

    void performUpdate(final Context context, final int[] iArr, PlaylistSong.Data data, boolean z, boolean z2, Class<?> cls) {
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.notification_bar_widget);
        updateNotificationViews(context, remoteViews, data, z, z2, cls, 0);
        MediaPlaybackNotification.updateNotificationViewsImg(context, remoteViews, data, new Action1<Bitmap>() { // from class: com.daaw.avee.comp.playback.view.MediaAppWidgetProvider.2
            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(Bitmap bitmap) {
                if (bitmap != null) {
                    remoteViews.setImageViewBitmap(R.id.imgArt, bitmap);
                } else {
                    remoteViews.setImageViewResource(R.id.imgArt, R.drawable.placeholderart4);
                }
                MediaAppWidgetProvider.this.pushUpdate(context, iArr, remoteViews);
            }
        }, null);
        pushUpdate(context, iArr, remoteViews);
    }

    public void updateNotificationViews(Context context, RemoteViews remoteViews, PlaylistSong.Data data, boolean z, boolean z2, Class<?> cls, int i) {
        MediaPlaybackNotification.updateNotificationViews(context, remoteViews, data, z, z2, cls, i, null);
        remoteViews.setViewVisibility(R.id.btnClose, 8);
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(131072);
        remoteViews.setOnClickPendingIntent(R.id.artGroup, PendingIntent.getActivity(context, 0, intent, 0));
    }

    public void notifyChange(Context context, PlaylistSong.Data data, boolean z, boolean z2, Class<?> cls) {
        if (hasInstances(context)) {
            performUpdate(context, null, data, z, z2, cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pushUpdate(Context context, int[] iArr, RemoteViews remoteViews) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (iArr != null) {
            appWidgetManager.updateAppWidget(iArr, remoteViews);
        } else {
            appWidgetManager.updateAppWidget(new ComponentName(context, getClass()), remoteViews);
        }
    }

    private boolean hasInstances(Context context) {
        return AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, getClass())).length > 0;
    }
}
