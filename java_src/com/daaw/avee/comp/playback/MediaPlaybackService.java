package com.daaw.avee.comp.playback;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import com.AOSP.MyIntentService;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEvent5;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.MediaStoreUtils;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.EventsGlobal.EventsGlobalNotificationUI;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.AlbumArt.ImageLoadedListener;
import com.daaw.avee.comp.AlbumArt.ImageResult;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.ExoPcmData;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.PlaybackQueue.QueueCore;
import com.daaw.avee.comp.PlaybackQueue.QueueItemIdentifier;
import com.daaw.avee.comp.playback.AudioFrameData;
import com.daaw.avee.comp.playback.BaseEqualizerEffect;
import com.daaw.avee.comp.playback.ExoMediaPlayer.ExoMediaPlayerCore;
import com.daaw.avee.comp.playback.IMediaPlayerCore;
import com.daaw.avee.comp.playback.NativeMediaPlayer.NativeMediaPlayerCore;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import com.daaw.avee.comp.playback.view.MediaAppWidgetProvider;
import com.daaw.avee.comp.playback.view.MediaPlaybackNotification;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class MediaPlaybackService extends MyIntentService implements MediaPlaybackServiceDefs, AudioManager.OnAudioFocusChangeListener {
    private AudioManager audioManager;
    private int bufferingPercent;
    private boolean bufferingState;
    private int cardId;
    private FadeMediaPlayer fadePlayer;
    private boolean haveAudioFocus;
    Runnable idleTimeoutRunnable;
    private ImageLoadedListener imageLoadedListener;
    private BaseEqualizerEffect.EqualizerDesc lastEqualizerDesc;
    PlaylistSong lastUpdatedMetadataSong;
    private int lastestStartId;
    private boolean lostAudioFocusWhilePlaying;
    private ComponentName mediaButtonEventReceiverName;
    private MediaEventReceiver mediaEventReceiver;
    private int myRunnableNextDataSourceToken;
    String notificationChannelId;
    IMediaPlayerCore.OnNotifyListener onNotifyListener;
    private Tuple2<PlaylistSong, IItemIdentifier> openedEntry;
    private boolean openedSongIsPreview;
    private boolean pausedWhenAudioBecomingNoisy;
    private Object playbackQueueRefHolder;
    private PlayerCore playerCoreReference;
    Runnable positionRefresh;
    private RemoteControlClient remoteControlClient;
    private int repeatMode;
    private RunnableNextDataSource runnableNextDataSource;
    private boolean serviceActiveForegroundState;
    private boolean serviceValidState;
    final Runnable taskDeInitialize;
    private final boolean[] taskDeInitializeDone;
    final Runnable taskInitialize;
    private final boolean[] taskInitializeDone;
    private boolean timeoutEnabled;
    private boolean wantsPlay;
    public static WeakEvent1<Context> onCreateEarly = new WeakEvent1<>();
    public static WeakEvent1<Context> onServiceDestroying = new WeakEvent1<>();
    public static WeakEvent1<Context> onDestroyed = new WeakEvent1<>();
    public static WeakEventR<Integer> onRequestSelectMediaPlayerCoreIndex = new WeakEventR<>();
    public static WeakEventR<Boolean> onRequestTimeoutEnabled = new WeakEventR<>();
    public static WeakEvent5<Boolean, Boolean, Integer, String, PlaylistSong> onPlayStateChanged = new WeakEvent5<>();
    public static WeakEvent4<PlaylistSong, IItemIdentifier, PlaylistSong.Data, PlayingMediaInfo> onDisplayMetaDataStateChanged = new WeakEvent4<>();
    public static WeakEvent1<Integer> onRepeatModeChanged = new WeakEvent1<>();
    public static WeakEvent1<Integer> onVolumeMaxChanged = new WeakEvent1<>();
    public static WeakEvent1<Boolean> onVolumeMuteChanged = new WeakEvent1<>();
    public static WeakEventR<Boolean> onRequestVolumeMuteState = new WeakEventR<>();
    public static WeakEventR<Float> onRequestVolumeStereoBalance = new WeakEventR<>();
    public static WeakEventR<Float> onRequestCrossfadeValue = new WeakEventR<>();
    public static WeakEvent onHeadsetAssistAction = new WeakEvent();
    public static WeakEvent5<Integer, Boolean, Long, Boolean, PlaylistSong> onPlaybackCompleted = new WeakEvent5<>();
    public static WeakEvent onUINextAction = new WeakEvent();
    public static WeakEvent onUIPrevAction = new WeakEvent();
    public static WeakEvent1<Long> onTrackPositionChanged = new WeakEvent1<>();
    public static WeakEvent3<Integer, Integer, Float> onVideoSizeChanged = new WeakEvent3<>();
    public static WeakEventR<SurfaceHolder> onRequestVideoSurfaceHolder = new WeakEventR<>();
    public static WeakEventR<Integer> onRequestVideoScalingMode = new WeakEventR<>();
    public static WeakEventR1<String, BaseEqualizerEffect.EqualizerSettings> onRequestEqualizerSettings = new WeakEventR1<>();
    public static WeakEventR1<String, Boolean> onRequestEqualizerIsEnabled = new WeakEventR1<>();
    public static WeakEvent1<BaseEqualizerEffect.EqualizerDesc> onEqualizerDescChanged = new WeakEvent1<>();
    public static WeakEvent5<Context, AlbumArtRequest, ImageLoadedListener, Integer, Integer> onRequestAlbumArtLarge = new WeakEvent5<>();
    public static WeakEvent onExoPcmDataNewSource = new WeakEvent();
    public static WeakEvent1<ExoPcmData> onExoPcmData = new WeakEvent1<>();
    private static volatile WeakReference<MediaPlaybackService> instanceWeak = new WeakReference<>(null);

    public MediaPlaybackService() {
        super("MediaPlaybackService");
        this.taskInitializeDone = new boolean[1];
        this.taskDeInitializeDone = new boolean[1];
        this.serviceValidState = false;
        this.lastestStartId = -1;
        this.openedSongIsPreview = false;
        this.openedEntry = null;
        this.haveAudioFocus = false;
        this.lostAudioFocusWhilePlaying = false;
        this.pausedWhenAudioBecomingNoisy = false;
        this.bufferingState = false;
        this.bufferingPercent = -1;
        this.wantsPlay = false;
        this.runnableNextDataSource = new RunnableNextDataSource(0L, false, null);
        this.myRunnableNextDataSourceToken = 4;
        this.serviceActiveForegroundState = false;
        this.timeoutEnabled = true;
        this.repeatMode = -1;
        this.cardId = 0;
        this.lastEqualizerDesc = null;
        this.playerCoreReference = null;
        this.notificationChannelId = null;
        this.idleTimeoutRunnable = new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.1
            @Override // java.lang.Runnable
            public void run() {
                MediaPlaybackService.this.stopService();
            }
        };
        this.positionRefresh = new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.2
            @Override // java.lang.Runnable
            public void run() {
                MediaPlaybackService.onTrackPositionChanged.invoke(Long.valueOf(MediaPlaybackService.this.positionSafe()));
                MediaPlaybackService.this.queuePositionRefresh(100L);
            }
        };
        this.onNotifyListener = new IMediaPlayerCore.OnNotifyListener() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.3
            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void requestNextDataDelay(boolean z) {
                MediaPlaybackService.this.mpRequestNextDataDelay(z);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void requestNextDataNow() {
                MediaPlaybackService.this.mpRequestNextDataNow();
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void requestNextDataAtTime(long j) {
                MediaPlaybackService.this.mpRequestNextDataAtTime(j);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public boolean onRequestAudioFocus() {
                return MediaPlaybackService.this.requestAudioFocus();
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onVolumeMuteStateChanged(boolean z) {
                MediaPlaybackService.onVolumeMuteChanged.invoke(Boolean.valueOf(z));
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onMpPlaystateOrMetaChanged(boolean z, String str) {
                MediaPlaybackService.this.notifyPlaystateOrMetaChanged(z, str);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onBufferingUpdate(boolean z, int i) {
                MediaPlaybackService.this.notifyBufferingUpdate(z, i);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onNotifyVideoSizeChanged(int i, int i2, float f) {
                MediaPlaybackService.onVideoSizeChanged.invoke(Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f));
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public int getVideoScalingMode() {
                return MediaPlaybackService.onRequestVideoScalingMode.invoke(0).intValue();
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public SurfaceHolder onRequestVideoSurfaceHolder() {
                return MediaPlaybackService.onRequestVideoSurfaceHolder.invoke(null);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public BaseEqualizerEffect.EqualizerSettings getEqualizerSettings(String str) {
                return MediaPlaybackService.onRequestEqualizerSettings.invoke(str, null);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public boolean getEqualizerEnabled(String str) {
                return MediaPlaybackService.onRequestEqualizerIsEnabled.invoke(str, false).booleanValue();
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onEqualizerDescChanged(BaseEqualizerEffect.EqualizerDesc equalizerDesc) {
                MediaPlaybackService.this.lastEqualizerDesc = equalizerDesc;
                MediaPlaybackService.onEqualizerDescChanged.invoke(equalizerDesc);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onExoPcmDataNewSource() {
                MediaPlaybackService.onExoPcmDataNewSource.invoke();
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onExoPcmData(ExoPcmData exoPcmData) {
                MediaPlaybackService.onExoPcmData.invoke(exoPcmData);
            }
        };
        this.taskInitialize = new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.4
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    MediaPlaybackService.this.initialize();
                    notifyAll();
                    MediaPlaybackService.this.taskInitializeDone[0] = true;
                }
            }
        };
        this.taskDeInitialize = new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.5
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    MediaPlaybackService.this.deInitialize();
                    notifyAll();
                    MediaPlaybackService.this.taskDeInitializeDone[0] = true;
                }
            }
        };
        this.lastUpdatedMetadataSong = null;
        setIntentRedelivery(false);
        this.fadePlayer = new FadeMediaPlayer(IMediaPlayerCore.Empty, this.onNotifyListener, 0L);
    }

    public static MediaPlaybackService getInstance() {
        return instanceWeak.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queuePositionRefresh(long j) {
        this.mServiceHandler.removeCallbacks(this.positionRefresh);
        if (this.serviceValidState) {
            this.mServiceHandler.postDelayed(this.positionRefresh, j);
        }
    }

    @Override // com.AOSP.MyIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        instanceWeak = new WeakReference<>(this);
        this.playerCoreReference = PlayerCore.s();
        this.serviceActiveForegroundState = false;
        goActiveService();
        this.taskInitializeDone[0] = false;
        this.mServiceHandler.post(this.taskInitialize);
        synchronized (this.taskInitialize) {
            if (!this.taskInitializeDone[0]) {
                try {
                    this.taskInitialize.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.AOSP.MyIntentService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        goActiveService();
        return super.onStartCommand(intent, i, i2);
    }

    void initialize() {
        this.serviceActiveForegroundState = false;
        onCreateEarly.invoke(this);
        selectMediaPlayerCoreIndex(onRequestSelectMediaPlayerCoreIndex.invoke(-1).intValue());
        this.audioManager = (AudioManager) getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.mediaEventReceiver = new MediaEventReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        if (Build.VERSION.SDK_INT >= 21) {
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        }
        registerReceiver(this.mediaEventReceiver, intentFilter);
        ComponentName componentName = new ComponentName(this, MediaButtonEventReceiver.class);
        this.mediaButtonEventReceiverName = componentName;
        try {
            this.audioManager.registerMediaButtonEventReceiver(componentName);
        } catch (Exception e) {
            tlog.w("registerMediaButtonEventReceiver failed: " + e.getMessage());
        }
        try {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(this.mediaButtonEventReceiverName);
            RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(getApplicationContext(), 0, intent, 0));
            this.remoteControlClient = remoteControlClient;
            this.audioManager.registerRemoteControlClient(remoteControlClient);
            this.remoteControlClient.setTransportControlFlags(PsExtractor.PRIVATE_STREAM_1);
        } catch (Exception e2) {
            tlog.w("remoteControlClient failed: " + e2.getMessage());
        }
        onVolumeMaxChanged.invoke(Integer.valueOf(getVolumeMax()));
        this.cardId = getCardId(this);
        setRepeatMode(0, false);
        this.serviceValidState = true;
        reloadPreferences();
        updateServiceState();
        notifyPlaystateOrMetaChanged(true, null);
        onVolumeMuteChanged.invoke(Boolean.valueOf(getPlayer().isMuted()));
        setTimeoutEnable(onRequestTimeoutEnabled.invoke(true).booleanValue());
        this.playbackQueueRefHolder = QueueCore.createOrGetInstance();
    }

    @Override // com.AOSP.MyIntentService, android.app.Service
    public void onDestroy() {
        this.serviceValidState = false;
        onServiceDestroying.invoke(this);
        this.taskDeInitializeDone[0] = false;
        this.mServiceHandler.post(this.taskDeInitialize);
        synchronized (this.taskDeInitialize) {
            if (!this.taskDeInitializeDone[0]) {
                try {
                    this.taskDeInitialize.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        super.onDestroy();
        this.playerCoreReference = null;
    }

    void deInitialize() {
        updateServiceState(true);
        this.serviceValidState = false;
        instanceWeak = new WeakReference<>(null);
        savePreferences();
        onDestroyed.invoke(this);
        abandonAudioFocus(true);
        RemoteControlClient remoteControlClient = this.remoteControlClient;
        if (remoteControlClient != null) {
            try {
                this.audioManager.unregisterRemoteControlClient(remoteControlClient);
            } catch (Exception e) {
                tlog.w("unregisterRemoteControlClient failed: " + e.getMessage());
                e.printStackTrace();
            }
            try {
                this.audioManager.unregisterMediaButtonEventReceiver(this.mediaButtonEventReceiverName);
            } catch (IllegalArgumentException e2) {
                tlog.w("unregisterMediaButtonEventReceiver failed: " + e2.getMessage());
            }
        }
        try {
            unregisterReceiver(this.mediaEventReceiver);
        } catch (IllegalArgumentException unused) {
        }
        this.fadePlayer.release();
        this.fadePlayer = new FadeMediaPlayer(IMediaPlayerCore.Empty, this.onNotifyListener, 0L);
        MediaAppWidgetProvider.getInstance().notifyChange(this, getOpenedOrSupposedOrEmptySong().getData(), false, false, MediaPlaybackService.class);
    }

    @Override // com.AOSP.MyIntentService, android.app.Service
    public void onStart(Intent intent, int i) {
        this.lastestStartId = i;
        super.onStart(intent, i);
    }

    @Override // com.AOSP.MyIntentService
    protected void onHandleIntent(Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            char c = 65535;
            switch (action.hashCode()) {
                case -2097438802:
                    if (action.equals(MediaPlaybackServiceDefs.REPEAT_MODE_ACTION)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1938038665:
                    if (action.equals(MediaPlaybackServiceDefs.EXIT_ACTION)) {
                        c = 18;
                        break;
                    }
                    break;
                case -1752305187:
                    if (action.equals(MediaPlaybackServiceDefs.SEEK_ACTION)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1676449846:
                    if (action.equals(MediaPlaybackServiceDefs.TOGGLE_PAUSE_ACTION)) {
                        c = 14;
                        break;
                    }
                    break;
                case -1322125647:
                    if (action.equals(MediaPlaybackServiceDefs.TOGGLE_MUTE_ACTION)) {
                        c = 6;
                        break;
                    }
                    break;
                case -1175598829:
                    if (action.equals(MediaPlaybackServiceDefs.STOP_ACTION)) {
                        c = '\f';
                        break;
                    }
                    break;
                case -1158831722:
                    if (action.equals(MediaPlaybackServiceDefs.VIDEO_SCALING_MODE_ACTION)) {
                        c = 2;
                        break;
                    }
                    break;
                case -1067871585:
                    if (action.equals(MediaPlaybackServiceDefs.SET_MUTE_ACTION)) {
                        c = 5;
                        break;
                    }
                    break;
                case -925317648:
                    if (action.equals(MediaPlaybackServiceDefs.PLAY_DATA_SOURCE_ACTION)) {
                        c = '\t';
                        break;
                    }
                    break;
                case -493826641:
                    if (action.equals(MediaPlaybackServiceDefs.HEADSET_ASSIST_ACTION)) {
                        c = 21;
                        break;
                    }
                    break;
                case -467621471:
                    if (action.equals(MediaPlaybackServiceDefs.PLAY_ACTION)) {
                        c = '\r';
                        break;
                    }
                    break;
                case -315510936:
                    if (action.equals(MediaPlaybackServiceDefs.CROSS_FADE_VALUE_ACTION)) {
                        c = '\b';
                        break;
                    }
                    break;
                case 98687563:
                    if (action.equals(MediaPlaybackServiceDefs.TIMEOUT_DISABLE_ACTION)) {
                        c = 20;
                        break;
                    }
                    break;
                case 507578587:
                    if (action.equals(MediaPlaybackServiceDefs.VOLUME_STEREO_BALANCE_ACTION)) {
                        c = 7;
                        break;
                    }
                    break;
                case 560451710:
                    if (action.equals(MediaPlaybackServiceDefs.PREVIOUS_ACTION)) {
                        c = 16;
                        break;
                    }
                    break;
                case 905399829:
                    if (action.equals(MediaPlaybackServiceDefs.ACTIVITY_AND_SERVICE_EXIT_ACTION)) {
                        c = 19;
                        break;
                    }
                    break;
                case 1439154582:
                    if (action.equals(MediaPlaybackServiceDefs.VOLUME_PERCENTAGE_ACTION)) {
                        c = 3;
                        break;
                    }
                    break;
                case 1461011714:
                    if (action.equals(MediaPlaybackServiceDefs.NEXT_ACTION)) {
                        c = 17;
                        break;
                    }
                    break;
                case 1956224089:
                    if (action.equals(MediaPlaybackServiceDefs.AUDIO_BECOMING_NOISY_ACTION)) {
                        c = '\n';
                        break;
                    }
                    break;
                case 2013996223:
                    if (action.equals(MediaPlaybackServiceDefs.PAUSE_ACTION)) {
                        c = 15;
                        break;
                    }
                    break;
                case 2051860114:
                    if (action.equals(MediaPlaybackServiceDefs.ACTION_HEADSET_PLUGGED_IN)) {
                        c = 11;
                        break;
                    }
                    break;
                case 2090255099:
                    if (action.equals(MediaPlaybackServiceDefs.VOLUME_ACTION)) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    seek(intent.getLongExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1, 0L));
                    return;
                case 1:
                    setRepeatMode(intent.getIntExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1, 0), true);
                    return;
                case 2:
                    setVideoScalingMode(intent.getIntExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1, 0));
                    return;
                case 3:
                    setVolumePercentage(intent.getFloatExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1, 20.0f));
                    return;
                case 4:
                    setVolume(intent.getIntExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1, 0));
                    return;
                case 5:
                    setVolumeMute(intent.getBooleanExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1, false));
                    return;
                case 6:
                    toggleVolumeMute();
                    return;
                case 7:
                    setVolumeStereoBalance(intent.getFloatExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1, 0.0f));
                    return;
                case '\b':
                    setCrossFadeValue(intent.getFloatExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1, -1.0f));
                    return;
                case '\t':
                    String stringExtra = intent.getStringExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1);
                    PlaylistSong playlistSong = stringExtra != null ? new PlaylistSong(stringExtra) : null;
                    boolean booleanExtra = intent.getBooleanExtra(MediaPlaybackServiceDefs.EXTRA_ARG_2, false);
                    long longExtra = intent.getLongExtra(MediaPlaybackServiceDefs.EXTRA_ARG_3, 0L);
                    long longExtra2 = intent.getLongExtra(MediaPlaybackServiceDefs.EXTRA_ARG_4, 0L);
                    Tuple2<PlaylistSong, IItemIdentifier> tuple2 = playlistSong != null ? new Tuple2<>(playlistSong, null) : null;
                    setWantsPlaying(booleanExtra);
                    openAndPlaySongIndex(tuple2, longExtra, longExtra2);
                    return;
                case '\n':
                    pause(true);
                    return;
                case 11:
                    boolean preferencesGetBoolSafe = AppPreferences.createOrGetInstance().preferencesGetBoolSafe(getApplicationContext(), "pref_resumeWhenHeadsetPluggedIn", true);
                    if (this.pausedWhenAudioBecomingNoisy && preferencesGetBoolSafe) {
                        play();
                        return;
                    }
                    return;
                case '\f':
                    stop();
                    return;
                case '\r':
                    play();
                    return;
                case 14:
                    togglePause();
                    return;
                case 15:
                    pause(false);
                    return;
                case 16:
                    onUIPrevAction.invoke();
                    return;
                case 17:
                    onUINextAction.invoke();
                    return;
                case 18:
                    stopService();
                    return;
                case 19:
                    EventsGlobalNotificationUI.onExitAction.invoke();
                    stopService();
                    return;
                case 20:
                    setTimeoutEnable(false);
                    return;
                case 21:
                    onHeadsetAssistAction.invoke();
                    return;
                default:
                    return;
            }
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (i == -2 || i == -1) {
            if (getPlayer() != null) {
                boolean preferencesGetBoolSafe = AppPreferences.createOrGetInstance().preferencesGetBoolSafe(getApplicationContext(), "pref_fadePlayPause", true);
                this.lostAudioFocusWhilePlaying = getPlayer().isPreparingOrStared();
                if (preferencesGetBoolSafe) {
                    this.fadePlayer.pauseFadeAll();
                } else {
                    getPlayer().pause();
                }
            } else {
                this.lostAudioFocusWhilePlaying = false;
            }
            updateServiceState();
        } else if (i != 1) {
        } else {
            boolean preferencesGetBoolSafe2 = AppPreferences.createOrGetInstance().preferencesGetBoolSafe(getApplicationContext(), "pref_resumePlayingAfterAudioFocusGained", true);
            if (this.lostAudioFocusWhilePlaying && preferencesGetBoolSafe2) {
                if (getPlayer() != null) {
                    if (AppPreferences.createOrGetInstance().preferencesGetBoolSafe(getApplicationContext(), "pref_fadePlayPause", true)) {
                        this.fadePlayer.startFadeAll();
                    } else {
                        getPlayer().start();
                    }
                }
                this.lostAudioFocusWhilePlaying = false;
            }
        }
    }

    void mpRequestNextDataDelay(boolean z) {
        this.mServiceHandler.removeCallbacksAndMessages(Integer.valueOf(this.myRunnableNextDataSourceToken));
        this.mServiceHandler.postAtTime(new RunnableNextDataSource(0L, z, getCurrentSong()), Integer.valueOf(this.myRunnableNextDataSourceToken), SystemClock.uptimeMillis() + 1000);
    }

    void mpRequestNextDataNow() {
        this.mServiceHandler.removeCallbacksAndMessages(Integer.valueOf(this.myRunnableNextDataSourceToken));
        this.mServiceHandler.postAtTime(this.runnableNextDataSource, Integer.valueOf(this.myRunnableNextDataSourceToken), 0L);
    }

    void mpRequestNextDataAtTime(long j) {
        this.mServiceHandler.removeCallbacksAndMessages(Integer.valueOf(this.myRunnableNextDataSourceToken));
        this.mServiceHandler.postAtTime(new RunnableNextDataSource(j, false, null), Integer.valueOf(this.myRunnableNextDataSourceToken), 0L);
    }

    public boolean requestAudioFocus() {
        if (this.audioManager.requestAudioFocus(this, 3, 1) == 1) {
            this.haveAudioFocus = true;
            return true;
        }
        tlog.w("requestAudioFocus failed");
        this.haveAudioFocus = false;
        return false;
    }

    public void requestAudioLowerFocus() {
        if (!this.haveAudioFocus || this.lostAudioFocusWhilePlaying) {
            return;
        }
        tlog.d("requestAudioLowerFocus, haveAudioFocus: " + this.haveAudioFocus + "; lostAudioFocusWhilePlaying: " + this.lostAudioFocusWhilePlaying);
        if (this.audioManager.requestAudioFocus(this, 3, 3) == 1) {
            return;
        }
        tlog.w("requestAudioLowerFocus failed");
    }

    public void abandonAudioFocus(boolean z) {
        RemoteControlClient remoteControlClient;
        tlog.d("abandonAudioFocus");
        if (!z && (remoteControlClient = this.remoteControlClient) != null) {
            remoteControlClient.setPlaybackState(2);
        }
        this.haveAudioFocus = false;
        this.audioManager.abandonAudioFocus(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopService() {
        if (getPlayer() != null) {
            getPlayer().stop();
        }
        stopSelf(this.lastestStartId);
        this.serviceActiveForegroundState = false;
    }

    public void stopServiceThSafe() {
        this.mServiceHandler.post(new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.6
            @Override // java.lang.Runnable
            public void run() {
                MediaPlaybackService.this.stopService();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeoutEnable(boolean z) {
        this.timeoutEnabled = z;
        updateServiceState();
    }

    public void setTimeoutEnableThSafe(final boolean z) {
        this.mServiceHandler.post(new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.7
            @Override // java.lang.Runnable
            public void run() {
                MediaPlaybackService.this.setTimeoutEnable(z);
            }
        });
    }

    public void goIdleService(boolean z) {
        if (z) {
            tlog.d("idle state");
            this.serviceActiveForegroundState = false;
            this.mServiceHandler.removeCallbacks(this.idleTimeoutRunnable);
            this.mServiceHandler.postDelayed(this.idleTimeoutRunnable, getResources().getInteger(R.integer.service_idle_timeout));
            stopForeground(z);
            if (z) {
                MediaPlaybackNotification.CancelNotification(this, 1);
            }
        }
    }

    public boolean goActiveService() {
        if (this.serviceActiveForegroundState) {
            return false;
        }
        tlog.d("active state");
        this.mServiceHandler.removeCallbacks(this.idleTimeoutRunnable);
        PlaylistSong.Data dataBlocking = getOpenedOrSupposedOrEmptySong().getDataBlocking(getApplicationContext());
        if (this.notificationChannelId == null) {
            this.notificationChannelId = MediaPlaybackNotification.createNotificationChannel(this);
        }
        startForeground(1, MediaPlaybackNotification.getOrCreateNotification(this, 1, this.notificationChannelId, dataBlocking, isPlaying(), wantsPlaying(), MediaPlaybackService.class, 0, new Func() { // from class: com.daaw.avee.comp.playback.-$$Lambda$MediaPlaybackService$b6844qXj7EfJHDuAxF5z5oKN1bs
            @Override // com.daaw.avee.Common.Func.Func
            public final Object onInvoke() {
                return MediaPlaybackService.this.lambda$goActiveService$0$MediaPlaybackService();
            }
        }));
        this.serviceActiveForegroundState = true;
        return true;
    }

    public /* synthetic */ Handler lambda$goActiveService$0$MediaPlaybackService() {
        if (this.serviceValidState) {
            return this.mServiceHandler;
        }
        return null;
    }

    private boolean updateServiceState() {
        return updateServiceState(false);
    }

    private boolean updateServiceState(boolean z) {
        boolean z2 = true;
        boolean z3 = this.lostAudioFocusWhilePlaying && AppPreferences.createOrGetInstance().preferencesGetBoolSafe(getApplicationContext(), "pref_resumePlayingAfterAudioFocusGained", true);
        if (this.timeoutEnabled && ((getPlayer() == null || !getPlayer().isPreparingOrStared()) && !z3)) {
            z2 = false;
        }
        if (z2 && !z) {
            if (getPlayer() == null || !getPlayer().isPreparingOrStared()) {
                requestAudioLowerFocus();
            }
            return goActiveService();
        }
        if (!z) {
            requestAudioLowerFocus();
        }
        goIdleService(z);
        return false;
    }

    public void setRepeatMode(int i, boolean z) {
        if (this.repeatMode == i) {
            return;
        }
        this.repeatMode = i;
        if (z) {
            if (i == 0) {
                notifyMessage(getString(R.string.playback_repeat_off));
            } else if (i == 1) {
                notifyMessage(getString(R.string.playback_repeat_current));
            } else if (i == 2) {
                notifyMessage(getString(R.string.playback_repeat_all));
            }
        }
        onRepeatModeChanged.invoke(Integer.valueOf(this.repeatMode));
    }

    public void previewOpen(List<PlaylistSong> list, int i) {
        previewOpenAndPlaySong(list.get(0), false);
    }

    public void openAndPlaySongIndex(Tuple2<PlaylistSong, IItemIdentifier> tuple2) {
        openAndPlaySongIndex(tuple2, 0L, 0L);
    }

    public void openAndPlaySongIndex(Tuple2<PlaylistSong, IItemIdentifier> tuple2, long j) {
        openAndPlaySongIndex(tuple2, j, 0L);
    }

    public void openAndPlaySongIndex(Tuple2<PlaylistSong, IItemIdentifier> tuple2, long j, long j2) {
        queuePositionRefresh(100L);
        this.lostAudioFocusWhilePlaying = false;
        this.pausedWhenAudioBecomingNoisy = false;
        this.mServiceHandler.removeCallbacksAndMessages(Integer.valueOf(this.myRunnableNextDataSourceToken));
        this.openedSongIsPreview = false;
        this.openedEntry = tuple2;
        PlaylistSong currentSong = getCurrentSong();
        if (currentSong != null) {
            if (j2 <= 0) {
                this.fadePlayer.playNext(currentSong.getMediaDataSource(), this.wantsPlay, j);
            } else {
                this.fadePlayer.playNextAtTime(currentSong.getMediaDataSource(), this.wantsPlay, j, j2);
            }
            notifyPlaystateOrMetaChanged(true, null);
            return;
        }
        this.fadePlayer.stop();
    }

    public void previewOpenAndPlaySong(PlaylistSong playlistSong, boolean z) {
        this.openedSongIsPreview = true;
        this.openedEntry = new Tuple2<>(playlistSong, new QueueItemIdentifier());
        PlaylistSong currentSong = getCurrentSong();
        if (currentSong != null) {
            this.fadePlayer.playNext(currentSong.getMediaDataSource(), !z, 0L);
            notifyPlaystateOrMetaChanged(true, null);
            return;
        }
        this.fadePlayer.stop();
    }

    public int getSelectedMediaPlayerCoreIndex() {
        IMediaPlayerCore mediaPlayerCore = this.fadePlayer.getMediaPlayerCore();
        if (mediaPlayerCore instanceof NativeMediaPlayerCore) {
            return 0;
        }
        return mediaPlayerCore instanceof ExoMediaPlayerCore ? 1 : -1;
    }

    void restartMediaPlayerCore() {
        selectMediaPlayerCoreIndex(getSelectedMediaPlayerCoreIndex(), true);
    }

    public void restartMediaPlayerCoreThSafe() {
        this.mServiceHandler.post(new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.8
            @Override // java.lang.Runnable
            public void run() {
                MediaPlaybackService.this.restartMediaPlayerCore();
            }
        });
    }

    public void selectMediaPlayerCoreIndexThSafe(final int i) {
        this.mServiceHandler.post(new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.9
            @Override // java.lang.Runnable
            public void run() {
                MediaPlaybackService.this.selectMediaPlayerCoreIndex(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectMediaPlayerCoreIndex(int i) {
        selectMediaPlayerCoreIndex(i, false);
    }

    private void selectMediaPlayerCoreIndex(int i, boolean z) {
        int selectedMediaPlayerCoreIndex;
        if (z || (selectedMediaPlayerCoreIndex = getSelectedMediaPlayerCoreIndex()) < 0 || selectedMediaPlayerCoreIndex != i) {
            boolean booleanValue = onRequestVolumeMuteState.invoke(false).booleanValue();
            float floatValue = onRequestVolumeStereoBalance.invoke(Float.valueOf(0.0f)).floatValue();
            float floatValue2 = onRequestCrossfadeValue.invoke(Float.valueOf(-1.0f)).floatValue();
            long position = this.fadePlayer.getMediaPlayerCore().position();
            this.fadePlayer.release();
            if (i == 1) {
                this.fadePlayer = new FadeMediaPlayer(new ExoMediaPlayerCore(this, getResources().getString(R.string.musicSys_exo), this.onNotifyListener), this.onNotifyListener, floatValue2 * 1000.0f);
            } else {
                this.fadePlayer = new FadeMediaPlayer(new NativeMediaPlayerCore(this, getResources().getString(R.string.musicSys_native), this.onNotifyListener), this.onNotifyListener, floatValue2 * 1000.0f);
            }
            this.fadePlayer.getMediaPlayerCore().setMute(booleanValue);
            this.fadePlayer.getMediaPlayerCore().setVolumeStereoBalance(floatValue);
            openAndPlaySongIndex(this.openedEntry, position);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IMediaPlayerCore getPlayer() {
        return this.fadePlayer.getMediaPlayerCore();
    }

    public void play() {
        setWantsPlaying(true);
        queuePositionRefresh(100L);
        this.lostAudioFocusWhilePlaying = false;
        this.pausedWhenAudioBecomingNoisy = false;
        if (!getPlayer().isPreparingOrAbove()) {
            openAndPlaySongIndex(this.openedEntry);
        }
        if (AppPreferences.createOrGetInstance().preferencesGetBoolSafe(getApplicationContext(), "pref_fadePlayPause", true)) {
            this.fadePlayer.startFadeAll();
        } else {
            getPlayer().start();
        }
    }

    public void pause(boolean z) {
        this.pausedWhenAudioBecomingNoisy = z && wantsPlaying();
        setWantsPlaying(false);
        queuePositionRefresh(100L);
        this.lostAudioFocusWhilePlaying = false;
        if (AppPreferences.createOrGetInstance().preferencesGetBoolSafe(getApplicationContext(), "pref_fadePlayPause", true)) {
            this.fadePlayer.pauseFadeAll();
        } else {
            getPlayer().pause();
        }
    }

    public void togglePause() {
        if (wantsPlaying()) {
            pause(false);
        } else {
            play();
        }
    }

    public void stop() {
        setWantsPlaying(false);
        this.lostAudioFocusWhilePlaying = false;
        this.pausedWhenAudioBecomingNoisy = false;
        if (AppPreferences.createOrGetInstance().preferencesGetBoolSafe(getApplicationContext(), "pref_fadePlayPause", true)) {
            this.fadePlayer.stopFadeAll();
        } else {
            this.fadePlayer.stop();
        }
    }

    public boolean isPlaying() {
        return getPlayer().isPreparingOrStared();
    }

    public boolean wantsPlaying() {
        return this.wantsPlay;
    }

    private void setWantsPlaying(boolean z) {
        this.wantsPlay = z;
        onPlayStateChanged.invoke(Boolean.valueOf(isPlaying()), Boolean.valueOf(wantsPlaying()), Integer.valueOf(this.bufferingPercent), null, null);
    }

    public PlaylistSong getCurrentSong() {
        Tuple2<PlaylistSong, IItemIdentifier> tuple2 = this.openedEntry;
        if (tuple2 == null) {
            return null;
        }
        return tuple2.obj1;
    }

    public PlaylistSong getOpenedSongOrEmpty() {
        PlaylistSong currentSong = getCurrentSong();
        return currentSong == null ? PlaylistSong.EmptySong : currentSong;
    }

    public Tuple2<PlaylistSong, IItemIdentifier> getOpenedOrSupposedOrNullEntry() {
        Tuple2<PlaylistSong, IItemIdentifier> tuple2 = this.openedEntry;
        if (tuple2 != null) {
            return tuple2;
        }
        return null;
    }

    public PlaylistSong getOpenedOrSupposedOrEmptySong() {
        Tuple2<PlaylistSong, IItemIdentifier> openedOrSupposedOrNullEntry = getOpenedOrSupposedOrNullEntry();
        if (openedOrSupposedOrNullEntry != null) {
            return openedOrSupposedOrNullEntry.obj1;
        }
        return PlaylistSong.EmptySong;
    }

    public long duration() {
        IMediaPlayerCore player = getPlayer();
        if (player == null) {
            return 0L;
        }
        return player.duration();
    }

    public long position() {
        IMediaPlayerCore player = getPlayer();
        if (player == null) {
            return 0L;
        }
        return player.position();
    }

    public long positionSafe() {
        if (getPlayer() == null) {
            return 0L;
        }
        return getPlayer().position();
    }

    public void seek(long j) {
        this.lostAudioFocusWhilePlaying = false;
        this.pausedWhenAudioBecomingNoisy = false;
        if (getPlayer() == null) {
            return;
        }
        if (j < 0) {
            j = 0;
        }
        if (j > getPlayer().duration()) {
            j = getPlayer().duration();
        }
        getPlayer().seek(j);
    }

    public void savePreferencesThSafe() {
        this.mServiceHandler.post(new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.10
            @Override // java.lang.Runnable
            public void run() {
                MediaPlaybackService.this.savePreferences();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void savePreferences() {
        SharedPreferences.Editor edit = AppPreferences.createOrGetInstance().getPreferences(getApplicationContext()).edit();
        edit.putInt("cardid", this.cardId);
        edit.putLong("seekpos", getPlayer().position());
        edit.putInt("repeatmode", this.repeatMode);
        Tuple2<PlaylistSong, IItemIdentifier> tuple2 = this.openedEntry;
        edit.putString("openedPath", (tuple2 == null || tuple2.obj1 == null) ? "" : this.openedEntry.obj1.getConstrucPath());
        edit.apply();
    }

    private void reloadPreferences() {
        SharedPreferences preferences = AppPreferences.createOrGetInstance().getPreferences(getApplicationContext());
        int preferencesGetIntSafe = AppPreferences.preferencesGetIntSafe(preferences, "repeatmode", 0);
        if (preferencesGetIntSafe != 2 && preferencesGetIntSafe != 1) {
            preferencesGetIntSafe = 0;
        }
        setRepeatMode(preferencesGetIntSafe, false);
        long preferencesGetLongSafe = AppPreferences.preferencesGetLongSafe(preferences, "seekpos", 0L);
        Tuple2<PlaylistSong, IItemIdentifier> tuple2 = new Tuple2<>(new PlaylistSong(AppPreferences.preferencesGetStringSafe(preferences, "openedPath", "")), new QueueItemIdentifier());
        if (this.openedSongIsPreview) {
            return;
        }
        setWantsPlaying(false);
        openAndPlaySongIndex(tuple2, preferencesGetLongSafe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPlaystateOrMetaChanged(boolean z, String str) {
        PlaylistSong.Data data;
        boolean updateServiceState = updateServiceState();
        PlaylistSong playlistSong = PlaylistSong.EmptySong;
        Tuple2<PlaylistSong, IItemIdentifier> openedOrSupposedOrNullEntry = getOpenedOrSupposedOrNullEntry();
        if (openedOrSupposedOrNullEntry != null) {
            playlistSong = openedOrSupposedOrNullEntry.obj1;
        }
        PlaylistSong playlistSong2 = playlistSong;
        PlaylistSong playlistSong3 = this.lastUpdatedMetadataSong;
        boolean z2 = playlistSong3 == null || !playlistSong3.equals(playlistSong2);
        if (z) {
            this.lastUpdatedMetadataSong = playlistSong2;
        }
        if (updateServiceState) {
            data = null;
        } else {
            data = playlistSong2.getDataBlocking(getApplicationContext());
            MediaPlaybackNotification.updateNotification(this, 1, this.notificationChannelId, data, isPlaying(), wantsPlaying(), MediaPlaybackService.class, 0, new Func() { // from class: com.daaw.avee.comp.playback.-$$Lambda$MediaPlaybackService$1b87wyM-2ddSfa5U5UEUDJmNQPM
                @Override // com.daaw.avee.Common.Func.Func
                public final Object onInvoke() {
                    return MediaPlaybackService.this.lambda$notifyPlaystateOrMetaChanged$1$MediaPlaybackService();
                }
            });
        }
        if (data == null) {
            data = playlistSong2.getDataBlocking(getApplicationContext());
        }
        MediaAppWidgetProvider.getInstance().notifyChange(this, data, isPlaying(), wantsPlaying(), MediaPlaybackService.class);
        if (data == null) {
            data = playlistSong2.getDataBlocking(getApplicationContext());
        }
        PlaylistSong.Data data2 = data;
        if (data2 != PlaylistSong.emptyData) {
            Intent intent = new Intent("com.android.music.metachanged");
            intent.putExtra("playing", isPlaying());
            intent.putExtra("track", data2.trackName);
            intent.putExtra("album", data2.albumName);
            intent.putExtra("artist", data2.artistName);
            intent.putExtra("songid", data2.audioId);
            intent.putExtra("albumid", data2.albumId);
            intent.putExtra(TtmlNode.ATTR_ID, data2.albumId);
            sendBroadcast(intent);
        }
        RemoteControlClient remoteControlClient = this.remoteControlClient;
        if (remoteControlClient != null) {
            remoteControlClient.setPlaybackState(isPlaying() ? 3 : 2);
            if (z && z2) {
                if (data2 == null) {
                    data2 = playlistSong2.getDataBlocking(getApplicationContext());
                }
                PlaylistSong.Data data3 = data2;
                RemoteControlClient.MetadataEditor editMetadata = this.remoteControlClient.editMetadata(false);
                editMetadata.putString(7, data3.trackName);
                editMetadata.putString(1, data3.albumName);
                editMetadata.putString(2, data3.artistName);
                editMetadata.putLong(9, duration());
                editMetadata.apply();
                this.imageLoadedListener = new ImageLoadedListener() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.11
                    Object object1;

                    @Override // com.daaw.avee.comp.AlbumArt.ImageLoadedListener
                    public void onBitmapLoaded(ImageResult imageResult, String str2, String str3, String str4) {
                        MediaPlaybackService.this.setMetadataArtworkTh(UtilsUI.copyBitmapSafe(ImageResult.getNonPersistentBitmapSafe(imageResult)));
                        ImageResult.closeSafe(imageResult);
                    }

                    @Override // com.daaw.avee.comp.AlbumArt.ImageLoadedListener
                    public void setUserObject1(Object obj) {
                        this.object1 = obj;
                    }
                };
                onRequestAlbumArtLarge.invoke(this, new AlbumArtRequest(data3.dataSource, data3.getAlbumArtPath0Str(), data3.getAlbumArtPath1Str(), data3.getAlbumArtGenerateStr()), this.imageLoadedListener, 700, 700);
                data2 = data3;
            }
        }
        if (z) {
            if (data2 == null) {
                data2 = playlistSong2.getDataBlocking(getApplicationContext());
            }
            IItemIdentifier iItemIdentifier = openedOrSupposedOrNullEntry != null ? openedOrSupposedOrNullEntry.obj2 : null;
            PlayingMediaInfo playingMediaInfo = getPlayer().getPlayingMediaInfo();
            if (playingMediaInfo == null) {
                playingMediaInfo = PlayingMediaInfo.empty;
            }
            onDisplayMetaDataStateChanged.invoke(playlistSong2, iItemIdentifier, data2, playingMediaInfo);
        }
        onPlayStateChanged.invoke(Boolean.valueOf(isPlaying()), Boolean.valueOf(wantsPlaying()), Integer.valueOf(this.bufferingPercent), str, playlistSong2);
    }

    public /* synthetic */ Handler lambda$notifyPlaystateOrMetaChanged$1$MediaPlaybackService() {
        if (this.serviceValidState) {
            return this.mServiceHandler;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataArtworkTh(final Bitmap bitmap) {
        this.mServiceHandler.post(new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.12
            @Override // java.lang.Runnable
            public void run() {
                MediaPlaybackService.this.setMetadataArtwork(bitmap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataArtwork(Bitmap bitmap) {
        RemoteControlClient.MetadataEditor editMetadata = this.remoteControlClient.editMetadata(false);
        editMetadata.putBitmap(100, bitmap);
        editMetadata.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBufferingUpdate(boolean z, int i) {
        this.bufferingState = z;
        this.bufferingPercent = i;
        if (!z) {
            this.bufferingPercent = 101;
        }
        onPlayStateChanged.invoke(Boolean.valueOf(isPlaying()), Boolean.valueOf(wantsPlaying()), Integer.valueOf(this.bufferingPercent), null, null);
    }

    private void notifyMessage(String str) {
        EventsGlobalTextNotifier.onTextMsg.invoke(str);
    }

    public void setVideoScalingMode(int i) {
        this.fadePlayer.getMediaPlayerCore().setVideoScalingMode(i);
        if (getSelectedMediaPlayerCoreIndex() == 1) {
            restartMediaPlayerCore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.fadePlayer.getMediaPlayerCore().setVideoSurfaceHolder(surfaceHolder);
    }

    public void setVideoSurfaceHolderThSafe(final SurfaceHolder surfaceHolder) {
        this.mServiceHandler.post(new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.13
            @Override // java.lang.Runnable
            public void run() {
                MediaPlaybackService.this.setVideoSurfaceHolder(surfaceHolder);
            }
        });
    }

    public float getVolumePercentage() {
        return this.audioManager.getStreamVolume(3) / this.audioManager.getStreamMaxVolume(3);
    }

    public void setVolumePercentage(float f) {
        this.audioManager.setStreamVolume(3, (int) (this.audioManager.getStreamMaxVolume(3) * f), 0);
    }

    public int getVolumeMax() {
        return this.audioManager.getStreamMaxVolume(3);
    }

    public int getVolume() {
        return this.audioManager.getStreamVolume(3);
    }

    public void setVolume(int i) {
        this.audioManager.setStreamVolume(3, i, 0);
    }

    public void setVolumeMute(boolean z) {
        if (getPlayer() != null) {
            getPlayer().setMute(z);
        }
    }

    public void toggleVolumeMute() {
        if (getPlayer() != null) {
            getPlayer().setMute(!getPlayer().isMuted());
        }
    }

    public void setVolumeStereoBalance(float f) {
        if (getPlayer() != null) {
            getPlayer().setVolumeStereoBalance(f);
        }
    }

    public void setCrossFadeValue(float f) {
        this.fadePlayer.setCrossFade(f * 1000.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetVisualizer() {
        IMediaPlayerCore player = getPlayer();
        if (player != null) {
            player.resetVisualizer();
        }
    }

    public void resetVisualizerThSafe() {
        this.mServiceHandler.post(new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.14
            @Override // java.lang.Runnable
            public void run() {
                MediaPlaybackService.this.resetVisualizer();
            }
        });
    }

    public AudioFrameData getVisualizationData(AudioFrameData audioFrameData, AudioFrameData.Request2 request2) {
        IMediaPlayerCore player = getPlayer();
        if (player != null) {
            return player.getVisualizationData(audioFrameData, request2);
        }
        return null;
    }

    public BaseEqualizerEffect.EqualizerDesc getEqualizerDescThSafe() {
        this.mServiceHandler.post(new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.15
            @Override // java.lang.Runnable
            public void run() {
                IMediaPlayerCore player = MediaPlaybackService.this.getPlayer();
                if (player != null) {
                    player.getEqualizerDesc();
                }
            }
        });
        return this.lastEqualizerDesc;
    }

    public void setEqualizerSettingsThSafe(final BaseEqualizerEffect.EqualizerSettings equalizerSettings) {
        this.mServiceHandler.post(new Runnable() { // from class: com.daaw.avee.comp.playback.MediaPlaybackService.16
            @Override // java.lang.Runnable
            public void run() {
                MediaPlaybackService.this.setEqualizerSettings(equalizerSettings);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEqualizerSettings(BaseEqualizerEffect.EqualizerSettings equalizerSettings) {
        IMediaPlayerCore player = getPlayer();
        if (player != null) {
            player.setEqualizerSettings(equalizerSettings);
        }
    }

    static int getCardId(Context context) {
        Cursor querySafe = MediaStoreUtils.querySafe(context.getContentResolver(), Uri.parse("content://media/external/fs_id"), null, null, null, null);
        if (querySafe != null) {
            querySafe.moveToFirst();
            int i = querySafe.getInt(0);
            querySafe.close();
            return i;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class RunnableNextDataSource implements Runnable {
        private final long atTime;
        private final boolean isErrorState;
        private PlaylistSong songForErrorState;

        RunnableNextDataSource(long j, boolean z, PlaylistSong playlistSong) {
            this.atTime = j;
            this.isErrorState = z;
            this.songForErrorState = playlistSong;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MediaPlaybackService.this.serviceValidState) {
                MediaPlaybackService.onPlaybackCompleted.invoke(Integer.valueOf(MediaPlaybackService.this.repeatMode), Boolean.valueOf(MediaPlaybackService.this.wantsPlay), Long.valueOf(this.atTime), Boolean.valueOf(this.isErrorState), this.songForErrorState);
            }
        }
    }
}
