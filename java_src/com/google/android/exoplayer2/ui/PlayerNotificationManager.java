package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.media.app.NotificationCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public class PlayerNotificationManager {
    public static final String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
    public static final String ACTION_NEXT = "com.google.android.exoplayer.next";
    public static final String ACTION_PAUSE = "com.google.android.exoplayer.pause";
    public static final String ACTION_PLAY = "com.google.android.exoplayer.play";
    public static final String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
    public static final String ACTION_REWIND = "com.google.android.exoplayer.rewind";
    public static final String ACTION_STOP = "com.google.android.exoplayer.stop";
    public static final int DEFAULT_FAST_FORWARD_MS = 15000;
    public static final int DEFAULT_REWIND_MS = 5000;
    private static final long MAX_POSITION_FOR_SEEK_TO_PREVIOUS = 3000;
    private int badgeIconType;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private ControlDispatcher controlDispatcher;
    private int currentNotificationTag;
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, NotificationCompat.Action> customActions;
    private int defaults;
    private long fastForwardMs;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private int lastPlaybackState;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;
    private MediaSessionCompat.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;
    private NotificationListener notificationListener;
    private final NotificationManagerCompat notificationManager;
    private boolean ongoing;
    private final Map<String, NotificationCompat.Action> playbackActions;
    private Player player;
    private final Player.EventListener playerListener;
    private int priority;
    private long rewindMs;
    private int smallIconResourceId;
    private String stopAction;
    private PendingIntent stopPendingIntent;
    private boolean useChronometer;
    private boolean useNavigationActions;
    private boolean usePlayPauseActions;
    private int visibility;
    private boolean wasPlayWhenReady;

    /* loaded from: classes.dex */
    public interface CustomActionReceiver {
        Map<String, NotificationCompat.Action> createCustomActions(Context context);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    /* loaded from: classes.dex */
    public interface MediaDescriptionAdapter {
        PendingIntent createCurrentContentIntent(Player player);

        String getCurrentContentText(Player player);

        String getCurrentContentTitle(Player player);

        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);
    }

    /* loaded from: classes.dex */
    public interface NotificationListener {
        void onNotificationCancelled(int i);

        void onNotificationStarted(int i, Notification notification);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Priority {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Visibility {
    }

    /* loaded from: classes.dex */
    public final class BitmapCallback {
        private final int notificationTag;

        private BitmapCallback(int i) {
            this.notificationTag = i;
        }

        public void onBitmap(final Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.mainHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.PlayerNotificationManager.BitmapCallback.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (PlayerNotificationManager.this.player != null && BitmapCallback.this.notificationTag == PlayerNotificationManager.this.currentNotificationTag && PlayerNotificationManager.this.isNotificationStarted) {
                            PlayerNotificationManager.this.updateNotification(bitmap);
                        }
                    }
                });
            }
        }
    }

    public static PlayerNotificationManager createWithNotificationChannel(Context context, String str, int i, int i2, MediaDescriptionAdapter mediaDescriptionAdapter) {
        NotificationUtil.createNotificationChannel(context, str, i, 2);
        return new PlayerNotificationManager(context, str, i2, mediaDescriptionAdapter);
    }

    public PlayerNotificationManager(Context context, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter) {
        this(context, str, i, mediaDescriptionAdapter, null);
    }

    public PlayerNotificationManager(Context context, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter, CustomActionReceiver customActionReceiver) {
        Map<String, NotificationCompat.Action> emptyMap;
        this.context = context.getApplicationContext();
        this.channelId = str;
        this.notificationId = i;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        this.customActionReceiver = customActionReceiver;
        this.controlDispatcher = new DefaultControlDispatcher();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.notificationManager = NotificationManagerCompat.from(context);
        this.playerListener = new PlayerListener();
        this.notificationBroadcastReceiver = new NotificationBroadcastReceiver();
        this.intentFilter = new IntentFilter();
        this.useNavigationActions = true;
        this.usePlayPauseActions = true;
        this.ongoing = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.smallIconResourceId = R.drawable.exo_notification_small_icon;
        this.defaults = 0;
        this.priority = -1;
        this.fastForwardMs = 15000L;
        this.rewindMs = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        this.stopAction = ACTION_STOP;
        this.badgeIconType = 1;
        this.visibility = 1;
        Map<String, NotificationCompat.Action> createPlaybackActions = createPlaybackActions(context);
        this.playbackActions = createPlaybackActions;
        for (String str2 : createPlaybackActions.keySet()) {
            this.intentFilter.addAction(str2);
        }
        if (customActionReceiver != null) {
            emptyMap = customActionReceiver.createCustomActions(context);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.customActions = emptyMap;
        for (String str3 : emptyMap.keySet()) {
            this.intentFilter.addAction(str3);
        }
        this.stopPendingIntent = ((NotificationCompat.Action) Assertions.checkNotNull(this.playbackActions.get(ACTION_STOP))).actionIntent;
    }

    public final void setPlayer(Player player) {
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.playerListener);
            if (player == null) {
                stopNotification();
            }
        }
        this.player = player;
        if (player != null) {
            this.wasPlayWhenReady = player.getPlayWhenReady();
            this.lastPlaybackState = player.getPlaybackState();
            player.addListener(this.playerListener);
            if (this.lastPlaybackState != 1) {
                startOrUpdateNotification();
            }
        }
    }

    public final void setControlDispatcher(ControlDispatcher controlDispatcher) {
        if (controlDispatcher == null) {
            controlDispatcher = new DefaultControlDispatcher();
        }
        this.controlDispatcher = controlDispatcher;
    }

    public final void setNotificationListener(NotificationListener notificationListener) {
        this.notificationListener = notificationListener;
    }

    public final void setFastForwardIncrementMs(long j) {
        if (this.fastForwardMs == j) {
            return;
        }
        this.fastForwardMs = j;
        maybeUpdateNotification();
    }

    public final void setRewindIncrementMs(long j) {
        if (this.rewindMs == j) {
            return;
        }
        this.rewindMs = j;
        maybeUpdateNotification();
    }

    public final void setUseNavigationActions(boolean z) {
        if (this.useNavigationActions != z) {
            this.useNavigationActions = z;
            maybeUpdateNotification();
        }
    }

    public final void setUsePlayPauseActions(boolean z) {
        if (this.usePlayPauseActions != z) {
            this.usePlayPauseActions = z;
            maybeUpdateNotification();
        }
    }

    public final void setStopAction(String str) {
        if (Util.areEqual(str, this.stopAction)) {
            return;
        }
        this.stopAction = str;
        if (ACTION_STOP.equals(str)) {
            this.stopPendingIntent = ((NotificationCompat.Action) Assertions.checkNotNull(this.playbackActions.get(ACTION_STOP))).actionIntent;
        } else if (str != null) {
            this.stopPendingIntent = ((NotificationCompat.Action) Assertions.checkNotNull(this.customActions.get(str))).actionIntent;
        } else {
            this.stopPendingIntent = null;
        }
        maybeUpdateNotification();
    }

    public final void setMediaSessionToken(MediaSessionCompat.Token token) {
        if (Util.areEqual(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        maybeUpdateNotification();
    }

    public final void setBadgeIconType(int i) {
        if (this.badgeIconType == i) {
            return;
        }
        if (i == 0 || i == 1 || i == 2) {
            this.badgeIconType = i;
            maybeUpdateNotification();
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void setColorized(boolean z) {
        if (this.colorized != z) {
            this.colorized = z;
            maybeUpdateNotification();
        }
    }

    public final void setDefaults(int i) {
        if (this.defaults != i) {
            this.defaults = i;
            maybeUpdateNotification();
        }
    }

    public final void setColor(int i) {
        if (this.color != i) {
            this.color = i;
            maybeUpdateNotification();
        }
    }

    public final void setOngoing(boolean z) {
        if (this.ongoing != z) {
            this.ongoing = z;
            maybeUpdateNotification();
        }
    }

    public final void setPriority(int i) {
        if (this.priority == i) {
            return;
        }
        if (i == -2 || i == -1 || i == 0 || i == 1 || i == 2) {
            this.priority = i;
            maybeUpdateNotification();
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void setSmallIcon(int i) {
        if (this.smallIconResourceId != i) {
            this.smallIconResourceId = i;
            maybeUpdateNotification();
        }
    }

    public final void setUseChronometer(boolean z) {
        if (this.useChronometer != z) {
            this.useChronometer = z;
            maybeUpdateNotification();
        }
    }

    public final void setVisibility(int i) {
        if (this.visibility == i) {
            return;
        }
        if (i == -1 || i == 0 || i == 1) {
            this.visibility = i;
            maybeUpdateNotification();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"player"})
    public Notification updateNotification(Bitmap bitmap) {
        Notification createNotification = createNotification(this.player, bitmap);
        this.notificationManager.notify(this.notificationId, createNotification);
        return createNotification;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startOrUpdateNotification() {
        if (this.player != null) {
            Notification updateNotification = updateNotification(null);
            if (this.isNotificationStarted) {
                return;
            }
            this.isNotificationStarted = true;
            this.context.registerReceiver(this.notificationBroadcastReceiver, this.intentFilter);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationStarted(this.notificationId, updateNotification);
            }
        }
    }

    private void maybeUpdateNotification() {
        if (!this.isNotificationStarted || this.player == null) {
            return;
        }
        updateNotification(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotification() {
        if (this.isNotificationStarted) {
            this.notificationManager.cancel(this.notificationId);
            this.isNotificationStarted = false;
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId);
            }
        }
    }

    protected Notification createNotification(Player player, Bitmap bitmap) {
        PendingIntent pendingIntent;
        NotificationCompat.Action action;
        boolean isPlayingAd = player.isPlayingAd();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this.context, this.channelId);
        List<String> actions = getActions(player);
        for (int i = 0; i < actions.size(); i++) {
            String str = actions.get(i);
            if (this.playbackActions.containsKey(str)) {
                action = this.playbackActions.get(str);
            } else {
                action = this.customActions.get(str);
            }
            if (action != null) {
                builder.addAction(action);
            }
        }
        NotificationCompat.MediaStyle mediaStyle = new NotificationCompat.MediaStyle();
        builder.setStyle(mediaStyle);
        MediaSessionCompat.Token token = this.mediaSessionToken;
        if (token != null) {
            mediaStyle.setMediaSession(token);
        }
        mediaStyle.setShowActionsInCompactView(getActionIndicesForCompactView(player));
        boolean z = (this.stopAction == null || isPlayingAd) ? false : true;
        mediaStyle.setShowCancelButton(z);
        if (z && (pendingIntent = this.stopPendingIntent) != null) {
            builder.setDeleteIntent(pendingIntent);
            mediaStyle.setCancelButtonIntent(this.stopPendingIntent);
        }
        builder.setBadgeIconType(this.badgeIconType).setOngoing(this.ongoing).setColor(this.color).setColorized(this.colorized).setSmallIcon(this.smallIconResourceId).setVisibility(this.visibility).setPriority(this.priority).setDefaults(this.defaults);
        if (this.useChronometer && !player.isCurrentWindowDynamic() && player.getPlayWhenReady() && player.getPlaybackState() == 3) {
            builder.setWhen(System.currentTimeMillis() - player.getContentPosition()).setShowWhen(true).setUsesChronometer(true);
        } else {
            builder.setShowWhen(false).setUsesChronometer(false);
        }
        builder.setContentTitle(this.mediaDescriptionAdapter.getCurrentContentTitle(player));
        builder.setContentText(this.mediaDescriptionAdapter.getCurrentContentText(player));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i2 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i2;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i2));
        }
        if (bitmap != null) {
            builder.setLargeIcon(bitmap);
        }
        PendingIntent createCurrentContentIntent = this.mediaDescriptionAdapter.createCurrentContentIntent(player);
        if (createCurrentContentIntent != null) {
            builder.setContentIntent(createCurrentContentIntent);
        }
        return builder.build();
    }

    protected List<String> getActions(Player player) {
        ArrayList arrayList = new ArrayList();
        if (!player.isPlayingAd()) {
            if (this.useNavigationActions) {
                arrayList.add(ACTION_PREVIOUS);
            }
            if (this.rewindMs > 0) {
                arrayList.add(ACTION_REWIND);
            }
            if (this.usePlayPauseActions) {
                if (player.getPlayWhenReady()) {
                    arrayList.add(ACTION_PAUSE);
                } else {
                    arrayList.add(ACTION_PLAY);
                }
            }
            if (this.fastForwardMs > 0) {
                arrayList.add(ACTION_FAST_FORWARD);
            }
            if (this.useNavigationActions && player.getNextWindowIndex() != -1) {
                arrayList.add(ACTION_NEXT);
            }
            CustomActionReceiver customActionReceiver = this.customActionReceiver;
            if (customActionReceiver != null) {
                arrayList.addAll(customActionReceiver.getCustomActions(player));
            }
            if (ACTION_STOP.equals(this.stopAction)) {
                arrayList.add(this.stopAction);
            }
        }
        return arrayList;
    }

    protected int[] getActionIndicesForCompactView(Player player) {
        if (this.usePlayPauseActions) {
            return new int[]{(this.useNavigationActions ? 1 : 0) + (this.fastForwardMs > 0 ? 1 : 0)};
        }
        return new int[0];
    }

    private static Map<String, NotificationCompat.Action> createPlaybackActions(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION_PLAY, new NotificationCompat.Action(R.drawable.exo_notification_play, context.getString(R.string.exo_controls_play_description), PendingIntent.getBroadcast(context, 0, new Intent(ACTION_PLAY).setPackage(context.getPackageName()), 268435456)));
        hashMap.put(ACTION_PAUSE, new NotificationCompat.Action(R.drawable.exo_notification_pause, context.getString(R.string.exo_controls_pause_description), PendingIntent.getBroadcast(context, 0, new Intent(ACTION_PAUSE).setPackage(context.getPackageName()), 268435456)));
        hashMap.put(ACTION_STOP, new NotificationCompat.Action(R.drawable.exo_notification_stop, context.getString(R.string.exo_controls_stop_description), PendingIntent.getBroadcast(context, 0, new Intent(ACTION_STOP).setPackage(context.getPackageName()), 268435456)));
        hashMap.put(ACTION_REWIND, new NotificationCompat.Action(R.drawable.exo_notification_rewind, context.getString(R.string.exo_controls_rewind_description), PendingIntent.getBroadcast(context, 0, new Intent(ACTION_REWIND).setPackage(context.getPackageName()), 268435456)));
        hashMap.put(ACTION_FAST_FORWARD, new NotificationCompat.Action(R.drawable.exo_notification_fastforward, context.getString(R.string.exo_controls_fastforward_description), PendingIntent.getBroadcast(context, 0, new Intent(ACTION_FAST_FORWARD).setPackage(context.getPackageName()), 268435456)));
        hashMap.put(ACTION_PREVIOUS, new NotificationCompat.Action(R.drawable.exo_notification_previous, context.getString(R.string.exo_controls_previous_description), PendingIntent.getBroadcast(context, 0, new Intent(ACTION_PREVIOUS).setPackage(context.getPackageName()), 268435456)));
        hashMap.put(ACTION_NEXT, new NotificationCompat.Action(R.drawable.exo_notification_next, context.getString(R.string.exo_controls_next_description), PendingIntent.getBroadcast(context, 0, new Intent(ACTION_NEXT).setPackage(context.getPackageName()), 268435456)));
        return hashMap;
    }

    /* loaded from: classes.dex */
    private class PlayerListener extends Player.DefaultEventListener {
        private PlayerListener() {
        }

        @Override // com.google.android.exoplayer2.Player.DefaultEventListener, com.google.android.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean z, int i) {
            if ((PlayerNotificationManager.this.wasPlayWhenReady != z && i != 1) || PlayerNotificationManager.this.lastPlaybackState != i) {
                PlayerNotificationManager.this.startOrUpdateNotification();
            }
            PlayerNotificationManager.this.wasPlayWhenReady = z;
            PlayerNotificationManager.this.lastPlaybackState = i;
        }

        @Override // com.google.android.exoplayer2.Player.DefaultEventListener, com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, Object obj, int i) {
            if (PlayerNotificationManager.this.player == null || PlayerNotificationManager.this.player.getPlaybackState() == 1) {
                return;
            }
            PlayerNotificationManager.this.startOrUpdateNotification();
        }

        @Override // com.google.android.exoplayer2.Player.DefaultEventListener, com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            if (PlayerNotificationManager.this.player == null || PlayerNotificationManager.this.player.getPlaybackState() == 1) {
                return;
            }
            PlayerNotificationManager.this.startOrUpdateNotification();
        }

        @Override // com.google.android.exoplayer2.Player.DefaultEventListener, com.google.android.exoplayer2.Player.EventListener
        public void onPositionDiscontinuity(int i) {
            PlayerNotificationManager.this.startOrUpdateNotification();
        }

        @Override // com.google.android.exoplayer2.Player.DefaultEventListener, com.google.android.exoplayer2.Player.EventListener
        public void onRepeatModeChanged(int i) {
            if (PlayerNotificationManager.this.player == null || PlayerNotificationManager.this.player.getPlaybackState() == 1) {
                return;
            }
            PlayerNotificationManager.this.startOrUpdateNotification();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        private final Timeline.Window window = new Timeline.Window();

        public NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.player;
            if (player == null || !PlayerNotificationManager.this.isNotificationStarted) {
                return;
            }
            String action = intent.getAction();
            if (PlayerNotificationManager.ACTION_PLAY.equals(action) || PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                PlayerNotificationManager.this.controlDispatcher.dispatchSetPlayWhenReady(player, PlayerNotificationManager.ACTION_PLAY.equals(action));
            } else if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action) || PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                PlayerNotificationManager.this.controlDispatcher.dispatchSeekTo(player, player.getCurrentWindowIndex(), player.getCurrentPosition() + (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action) ? PlayerNotificationManager.this.fastForwardMs : -PlayerNotificationManager.this.rewindMs));
            } else if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                int nextWindowIndex = player.getNextWindowIndex();
                if (nextWindowIndex != -1) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchSeekTo(player, nextWindowIndex, C.TIME_UNSET);
                }
            } else if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                player.getCurrentTimeline().getWindow(player.getCurrentWindowIndex(), this.window);
                int previousWindowIndex = player.getPreviousWindowIndex();
                if (previousWindowIndex == -1 || (player.getCurrentPosition() > PlayerNotificationManager.MAX_POSITION_FOR_SEEK_TO_PREVIOUS && (!this.window.isDynamic || this.window.isSeekable))) {
                    PlayerNotificationManager.this.controlDispatcher.dispatchSeekTo(player, player.getCurrentWindowIndex(), C.TIME_UNSET);
                } else {
                    PlayerNotificationManager.this.controlDispatcher.dispatchSeekTo(player, previousWindowIndex, C.TIME_UNSET);
                }
            } else if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                PlayerNotificationManager.this.controlDispatcher.dispatchStop(player, true);
                PlayerNotificationManager.this.stopNotification();
            } else if (PlayerNotificationManager.this.customActionReceiver == null || !PlayerNotificationManager.this.customActions.containsKey(action)) {
            } else {
                PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
            }
        }
    }
}
