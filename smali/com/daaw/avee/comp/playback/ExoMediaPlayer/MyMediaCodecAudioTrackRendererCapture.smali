.class public Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;
.super Lcom/google/android/exoplayer2/audio/MediaCodecAudioRenderer;
.source "MyMediaCodecAudioTrackRendererCapture.java"


# static fields
.field private static final RENDERER_TIMESTAMP_OFFSET_US:I


# instance fields
.field bitDepth:I

.field private outputChannelCount:I

.field private outputMimeType:Ljava/lang/String;

.field private outputSampleRate:I

.field private playerEntryIndexId:I

.field playerIdentifier:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private visualizerDataListener:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;


# direct methods
.method public varargs constructor <init>(Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;ILjava/lang/ref/WeakReference;Landroid/content/Context;Lcom/google/android/exoplayer2/mediacodec/MediaCodecSelector;Lcom/google/android/exoplayer2/drm/DrmSessionManager;ZLandroid/os/Handler;Lcom/google/android/exoplayer2/audio/AudioRendererEventListener;Lcom/google/android/exoplayer2/audio/AudioCapabilities;[Lcom/google/android/exoplayer2/audio/AudioProcessor;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;",
            "I",
            "Ljava/lang/ref/WeakReference<",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/google/android/exoplayer2/mediacodec/MediaCodecSelector;",
            "Lcom/google/android/exoplayer2/drm/DrmSessionManager<",
            "Lcom/google/android/exoplayer2/drm/FrameworkMediaCrypto;",
            ">;Z",
            "Landroid/os/Handler;",
            "Lcom/google/android/exoplayer2/audio/AudioRendererEventListener;",
            "Lcom/google/android/exoplayer2/audio/AudioCapabilities;",
            "[",
            "Lcom/google/android/exoplayer2/audio/AudioProcessor;",
            ")V"
        }
    .end annotation

    move-object v9, p0

    move-object v10, p1

    move v11, p2

    move-object v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    .line 53
    invoke-direct/range {v0 .. v8}, Lcom/google/android/exoplayer2/audio/MediaCodecAudioRenderer;-><init>(Landroid/content/Context;Lcom/google/android/exoplayer2/mediacodec/MediaCodecSelector;Lcom/google/android/exoplayer2/drm/DrmSessionManager;ZLandroid/os/Handler;Lcom/google/android/exoplayer2/audio/AudioRendererEventListener;Lcom/google/android/exoplayer2/audio/AudioCapabilities;[Lcom/google/android/exoplayer2/audio/AudioProcessor;)V

    const v0, 0xac44

    .line 32
    iput v0, v9, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->outputSampleRate:I

    const/4 v0, 0x2

    .line 33
    iput v0, v9, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->outputChannelCount:I

    const-string v0, "audio/raw"

    .line 34
    iput-object v0, v9, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->outputMimeType:Ljava/lang/String;

    const/4 v0, 0x0

    .line 38
    iput v0, v9, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->playerEntryIndexId:I

    const/4 v1, 0x0

    .line 39
    iput-object v1, v9, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->visualizerDataListener:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    .line 70
    iput v0, v9, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->bitDepth:I

    move-object v0, p3

    .line 63
    iput-object v0, v9, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->playerIdentifier:Ljava/lang/ref/WeakReference;

    .line 64
    iput v11, v9, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->playerEntryIndexId:I

    .line 65
    iput-object v10, v9, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->visualizerDataListener:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    .line 66
    invoke-static {p0, p2, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/VisualizerDataCapturerLimiter;->assignInstance(Ljava/lang/Object;ILcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;)V

    return-void
.end method


# virtual methods
.method protected onAudioSessionId(I)V
    .locals 2

    .line 198
    invoke-super {p0, p1}, Lcom/google/android/exoplayer2/audio/MediaCodecAudioRenderer;->onAudioSessionId(I)V

    .line 200
    iget v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->playerEntryIndexId:I

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->visualizerDataListener:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    invoke-static {p0, v0, v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/VisualizerDataCapturerLimiter;->getListener(Ljava/lang/Object;ILcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;)Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 202
    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;->onAudioSessionId(I)V

    :cond_0
    return-void
.end method

.method protected onDisabled()V
    .locals 2

    .line 97
    iget v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->playerEntryIndexId:I

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->visualizerDataListener:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    invoke-static {p0, v0, v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/VisualizerDataCapturerLimiter;->getListener(Ljava/lang/Object;ILcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;)Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 98
    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;->onSetEnabled(Z)V

    .line 99
    :cond_0
    invoke-super {p0}, Lcom/google/android/exoplayer2/audio/MediaCodecAudioRenderer;->onDisabled()V

    return-void
.end method

.method protected onEnabled(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/ExoPlaybackException;
        }
    .end annotation

    .line 84
    iget v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->playerEntryIndexId:I

    iget-object v1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->visualizerDataListener:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    invoke-static {p0, v0, v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/VisualizerDataCapturerLimiter;->getListener(Ljava/lang/Object;ILcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;)Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 85
    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;->onSetEnabled(Z)V

    .line 86
    :cond_0
    invoke-super {p0, p1}, Lcom/google/android/exoplayer2/audio/MediaCodecAudioRenderer;->onEnabled(Z)V

    return-void
.end method

.method protected onInputFormatChanged(Lcom/google/android/exoplayer2/Format;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/ExoPlaybackException;
        }
    .end annotation

    .line 73
    invoke-super {p0, p1}, Lcom/google/android/exoplayer2/audio/MediaCodecAudioRenderer;->onInputFormatChanged(Lcom/google/android/exoplayer2/Format;)V

    .line 75
    iget v0, p1, Lcom/google/android/exoplayer2/Format;->bitrate:I

    if-gez v0, :cond_0

    const/16 p1, 0x10

    .line 76
    iput p1, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->bitDepth:I

    goto :goto_0

    .line 78
    :cond_0
    iget v0, p1, Lcom/google/android/exoplayer2/Format;->bitrate:I

    iget v1, p1, Lcom/google/android/exoplayer2/Format;->sampleRate:I

    div-int/2addr v0, v1

    iget p1, p1, Lcom/google/android/exoplayer2/Format;->channelCount:I

    div-int/2addr v0, p1

    iput v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->bitDepth:I

    :goto_0
    return-void
.end method

.method protected onOutputFormatChanged(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/ExoPlaybackException;
        }
    .end annotation

    const v0, 0xac44

    .line 144
    iput v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->outputSampleRate:I

    const/4 v0, 0x2

    .line 145
    iput v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->outputChannelCount:I

    const-string v0, "audio/raw"

    .line 146
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->outputMimeType:Ljava/lang/String;

    const-string v0, "sample-rate"

    .line 148
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 149
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->outputSampleRate:I

    :cond_0
    const-string v0, "channel-count"

    .line 150
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 151
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->outputChannelCount:I

    :cond_1
    const-string v0, "mime"

    .line 152
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 153
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->outputMimeType:Ljava/lang/String;

    .line 173
    :cond_2
    invoke-super {p0, p1, p2}, Lcom/google/android/exoplayer2/audio/MediaCodecAudioRenderer;->onOutputFormatChanged(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V

    return-void
.end method

.method protected onPositionReset(JZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/ExoPlaybackException;
        }
    .end annotation

    .line 91
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/audio/MediaCodecAudioRenderer;->onPositionReset(JZ)V

    return-void
.end method

.method protected processOutputBuffer(JJLandroid/media/MediaCodec;Ljava/nio/ByteBuffer;IIJZ)Z
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/exoplayer2/ExoPlaybackException;
        }
    .end annotation

    move-object v0, p0

    move/from16 v11, p7

    .line 114
    iget v1, v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->playerEntryIndexId:I

    iget-object v2, v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->visualizerDataListener:Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    invoke-static {p0, v1, v2}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/VisualizerDataCapturerLimiter;->getListener(Ljava/lang/Object;ILcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;)Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;

    move-result-object v1

    if-nez p11, :cond_1

    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    if-ltz v11, :cond_1

    const/16 v2, 0x2000

    if-ge v11, v2, :cond_1

    if-eqz p6, :cond_1

    const-wide/16 v2, 0x0

    sub-long v4, p9, v2

    .line 119
    iget v6, v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->outputSampleRate:I

    iget v7, v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->outputChannelCount:I

    iget v8, v0, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/MyMediaCodecAudioTrackRendererCapture;->bitDepth:I

    sub-long v9, p1, v2

    move-object/from16 v2, p6

    move-wide v3, v4

    move/from16 v5, p7

    invoke-interface/range {v1 .. v10}, Lcom/daaw/avee/comp/playback/ExoMediaPlayer/IVisualizerDataCapturer;->onPcmData(Ljava/nio/ByteBuffer;JIIIIJ)V

    .line 131
    :cond_1
    :goto_0
    invoke-super/range {p0 .. p11}, Lcom/google/android/exoplayer2/audio/MediaCodecAudioRenderer;->processOutputBuffer(JJLandroid/media/MediaCodec;Ljava/nio/ByteBuffer;IIJZ)Z

    move-result v1

    return v1
.end method
