package com.daaw.avee.comp.playback.view;

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
import androidx.recyclerview.widget.ItemTouchHelper;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Events.WeakEvent5;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.comp.AlbumArt.AlbumArtFactory;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.AlbumArt.ImageLoadedListener;
import com.daaw.avee.comp.AlbumArt.ImageResult;
import com.daaw.avee.comp.playback.MediaPlaybackServiceDefs;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
/* loaded from: classes.dex */
public class MediaPlaybackNotification {
    public static WeakEvent5<Context, AlbumArtRequest, ImageLoadedListener, Integer, Integer> onRequestAlbumArtLarge = new WeakEvent5<>();

    public static Notification getOrCreateNotification(Context context, int i, String str, PlaylistSong.Data data, boolean z, boolean z2, Class<?> cls, int i2, Func<Handler> func) {
        return createNotificationInternal(context, i, str, data, z, z2, cls, i2, func);
    }

    public static void updateNotification(Context context, int i, String str, PlaylistSong.Data data, boolean z, boolean z2, Class<?> cls, int i2, Func<Handler> func) {
        ((NotificationManager) context.getSystemService("notification")).notify(i, getOrCreateNotification(context, i, str, data, z, z2, cls, i2, func));
    }

    public static void CancelNotification(Context context, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(i);
        }
    }

    public static String createNotificationChannel(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            String string = context.getString(R.string.playback_service_notif_channel_name);
            NotificationChannel notificationChannel = new NotificationChannel(string, MediaPlaybackServiceDefs.NOTIFICATION_CHANNEL_NAME, 2);
            notificationChannel.setLockscreenVisibility(0);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
            return string;
        }
        return null;
    }

    private static Notification createNotificationInternal(final Context context, final int i, String str, PlaylistSong.Data data, boolean z, boolean z2, Class<?> cls, int i2, final Func<Handler> func) {
        Notification.Builder builder;
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.notification_bar);
        updateNotificationViews(context, remoteViews, data, z, z2, cls, i2, func);
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(131072);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 0);
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(context, str);
        } else {
            builder = new Notification.Builder(context);
        }
        final Notification.Builder builder2 = builder;
        builder2.setContent(remoteViews);
        builder2.setSmallIcon(R.drawable.ic_launcher_mono_xs);
        builder2.setContentIntent(activity);
        updateNotificationViewsImg(context, remoteViews, data, new Action1<Bitmap>() { // from class: com.daaw.avee.comp.playback.view.MediaPlaybackNotification.1
            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(final Bitmap bitmap) {
                Handler handler = (Handler) Func.this.onInvoke();
                if (handler != null) {
                    handler.post(new Runnable() { // from class: com.daaw.avee.comp.playback.view.MediaPlaybackNotification.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (bitmap != null) {
                                remoteViews.setImageViewBitmap(R.id.imgArt, bitmap);
                            } else {
                                remoteViews.setImageViewResource(R.id.imgArt, R.drawable.placeholderart4);
                            }
                            builder2.setContent(remoteViews);
                            ((NotificationManager) context.getSystemService("notification")).notify(i, builder2.build());
                        }
                    });
                }
            }
        }, func);
        return builder2.build();
    }

    public static void updateNotificationViews(Context context, RemoteViews remoteViews, PlaylistSong.Data data, boolean z, boolean z2, Class<?> cls, int i, Func<Handler> func) {
        remoteViews.setImageViewResource(R.id.imgArt, R.drawable.placeholderart4);
        String str = data.trackName;
        String str2 = data.artistName;
        String str3 = data.albumName;
        if (str2 == null || str2.equals("<unknown>")) {
            str2 = context.getString(R.string.unknown_artist_name);
        }
        if (str3 == null || str3.equals("<unknown>")) {
            context.getString(R.string.unknown_album_name);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            remoteViews.setImageViewResource(R.id.btnPlayPause, z2 ? R.drawable.ic_ctrl_pause_s : R.drawable.ic_ctrl_play_s);
            ComponentName componentName = new ComponentName(context, cls);
            Intent intent = new Intent(MediaPlaybackServiceDefs.PREVIOUS_ACTION);
            intent.setComponent(componentName);
            remoteViews.setOnClickPendingIntent(R.id.btnPrev, PendingIntent.getService(context, 0, intent, 0));
            Intent intent2 = new Intent(MediaPlaybackServiceDefs.TOGGLE_PAUSE_ACTION);
            intent2.setComponent(componentName);
            remoteViews.setOnClickPendingIntent(R.id.btnPlayPause, PendingIntent.getService(context, 0, intent2, 0));
            Intent intent3 = new Intent(MediaPlaybackServiceDefs.NEXT_ACTION);
            intent3.setComponent(componentName);
            remoteViews.setOnClickPendingIntent(R.id.btnNext, PendingIntent.getService(context, 0, intent3, 0));
            Intent intent4 = new Intent(MediaPlaybackServiceDefs.ACTIVITY_AND_SERVICE_EXIT_ACTION);
            intent4.setComponent(componentName);
            remoteViews.setOnClickPendingIntent(R.id.btnClose, PendingIntent.getService(context, 0, intent4, 0));
        }
        remoteViews.setTextViewText(R.id.txtSongTitle, str);
        remoteViews.setTextViewText(R.id.txtSongArtist, str2);
    }

    public static void updateNotificationViewsImg(Context context, RemoteViews remoteViews, PlaylistSong.Data data, final Action1<Bitmap> action1, Func<Handler> func) {
        if (AlbumArtFactory.getInstance() != null) {
            onRequestAlbumArtLarge.invoke(context, new AlbumArtRequest(data.dataSource, data.getAlbumArtPath0Str(), data.getAlbumArtPath1Str(), data.getAlbumArtGenerateStr()), new ImageLoadedListener() { // from class: com.daaw.avee.comp.playback.view.MediaPlaybackNotification.2
                private Object object1;

                @Override // com.daaw.avee.comp.AlbumArt.ImageLoadedListener
                public void onBitmapLoaded(ImageResult imageResult, String str, String str2, String str3) {
                    Action1.this.onInvoke(UtilsUI.copyBitmapSafe(ImageResult.getNonPersistentBitmapSafe(imageResult)));
                    ImageResult.closeSafe(imageResult);
                }

                @Override // com.daaw.avee.comp.AlbumArt.ImageLoadedListener
                public void setUserObject1(Object obj) {
                    this.object1 = obj;
                }
            }, Integer.valueOf((int) ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION), Integer.valueOf((int) ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION));
        }
    }
}
