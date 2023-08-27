.class public Lcom/daaw/avee/comp/playback/ExoMediaPlayer/exoplayer2/MyRenderersFactory;
.super Lcom/google/android/exoplayer2/DefaultRenderersFactory;
.source "MyRenderersFactory.java"


# instance fields
.field private onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

.field private playerEntryIndexId:I

.field private visualizerData:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;ILandroid/content/Context;)V
    .locals 0

    .line 37
    invoke-direct {p0, p4}, Lcom/google/android/exoplayer2/DefaultRenderersFactory;-><init>(Landroid/content/Context;)V

    .line 38
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/exoplayer2/MyRenderersFactory;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    .line 39
    iput-object p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/exoplayer2/MyRenderersFactory;->visualizerData:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    .line 40
    iput p3, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/exoplayer2/MyRenderersFactory;->playerEntryIndexId:I

    return-void
.end method

.method public constructor <init>(Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;ILandroid/content/Context;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p4, p5}, Lcom/google/android/exoplayer2/DefaultRenderersFactory;-><init>(Landroid/content/Context;I)V

    .line 48
    iput-object p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/exoplayer2/MyRenderersFactory;->onNotifyListener:Lcom/daaw/avee/comp/playback/IMediaPlayerCore$OnNotifyListener;

    .line 49
    iput-object p2, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/exoplayer2/MyRenderersFactory;->visualizerData:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    .line 50
    iput p3, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/exoplayer2/MyRenderersFactory;->playerEntryIndexId:I

    return-void
.end method


# virtual methods
.method protected buildAudioRenderers(Landroid/content/Context;Lcom/google/android/exoplayer2/drm/DrmSessionManager;[Lcom/google/android/exoplayer2/audio/AudioProcessor;Landroid/os/Handler;Lcom/google/android/exoplayer2/audio/AudioRendererEventListener;ILjava/util/ArrayList;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/exoplayer2/drm/DrmSessionManager<",
            "Lcom/google/android/exoplayer2/drm/FrameworkMediaCrypto;",
            ">;[",
            "Lcom/google/android/exoplayer2/audio/AudioProcessor;",
            "Landroid/os/Handler;",
            "Lcom/google/android/exoplayer2/audio/AudioRendererEventListener;",
            "I",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/exoplayer2/Renderer;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 59
    new-instance v13, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;

    iget-object v2, v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/exoplayer2/MyRenderersFactory;->visualizerData:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    iget v3, v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/exoplayer2/MyRenderersFactory;->playerEntryIndexId:I

    new-instance v4, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v4, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sget-object v6, Lcom/google/android/exoplayer2/mediacodec/MediaCodecSelector;->DEFAULT:Lcom/google/android/exoplayer2/mediacodec/MediaCodecSelector;

    .line 68
    invoke-static {p1}, Lcom/google/android/exoplayer2/audio/AudioCapabilities;->getCapabilities(Landroid/content/Context;)Lcom/google/android/exoplayer2/audio/AudioCapabilities;

    move-result-object v11

    const/4 v8, 0x1

    move-object v1, v13

    move-object v5, p1

    move-object/from16 v7, p2

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v12, p3

    invoke-direct/range {v1 .. v12}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;-><init>(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;ILjava/lang/ref/WeakReference;Landroid/content/Context;Lcom/google/android/exoplayer2/mediacodec/MediaCodecSelector;Lcom/google/android/exoplayer2/drm/DrmSessionManager;ZLandroid/os/Handler;Lcom/google/android/exoplayer2/audio/AudioRendererEventListener;Lcom/google/android/exoplayer2/audio/AudioCapabilities;[Lcom/google/android/exoplayer2/audio/AudioProcessor;)V

    move-object/from16 v1, p7

    .line 71
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
