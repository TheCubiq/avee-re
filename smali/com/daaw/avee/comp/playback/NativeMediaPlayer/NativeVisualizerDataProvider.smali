.class public Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;
.super Ljava/lang/Object;
.source "NativeVisualizerDataProvider.java"


# instance fields
.field private bytesBuffer:[B

.field private currentAudioSessionId:I

.field private disableVisualizer:Z

.field private virtualizerEffect:Landroid/media/audiofx/Virtualizer;

.field private visualizer:Landroid/media/audiofx/Visualizer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 17
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->bytesBuffer:[B

    const/4 v0, -0x1

    .line 19
    iput v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->currentAudioSessionId:I

    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->virtualizerEffect:Landroid/media/audiofx/Virtualizer;

    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->disableVisualizer:Z

    return-void
.end method

.method static pow2roundup(I)I
    .locals 1

    if-gez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    add-int/lit8 p0, p0, -0x1

    shr-int/lit8 v0, p0, 0x1

    or-int/2addr p0, v0

    shr-int/lit8 v0, p0, 0x2

    or-int/2addr p0, v0

    shr-int/lit8 v0, p0, 0x4

    or-int/2addr p0, v0

    shr-int/lit8 v0, p0, 0x8

    or-int/2addr p0, v0

    shr-int/lit8 v0, p0, 0x10

    or-int/2addr p0, v0

    add-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public getVisData(JLcom/daaw/avee/comp/playback/AudioFrameData$Request;Lcom/daaw/avee/comp/playback/AudioFrameData;IZ)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 8

    .line 60
    iget-boolean p1, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->disableVisualizer:Z

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    return-object p2

    :cond_0
    const/4 p1, 0x0

    if-eqz p6, :cond_1

    const/4 p5, 0x0

    .line 73
    :cond_1
    iget-object p6, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->visualizer:Landroid/media/audiofx/Visualizer;

    const/4 v0, 0x1

    if-eqz p6, :cond_2

    iget p6, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->currentAudioSessionId:I

    if-eq p6, p5, :cond_3

    .line 76
    :cond_2
    :try_start_0
    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "### audioSessionId: "

    invoke-virtual {p6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    invoke-static {p6}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 79
    new-instance p6, Landroid/media/audiofx/Visualizer;

    invoke-direct {p6, p5}, Landroid/media/audiofx/Visualizer;-><init>(I)V

    iput-object p6, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->visualizer:Landroid/media/audiofx/Visualizer;

    .line 80
    iput p5, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->currentAudioSessionId:I

    .line 82
    invoke-virtual {p6, p1}, Landroid/media/audiofx/Visualizer;->setScalingMode(I)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p5

    .line 85
    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "### visualizer exception: "

    invoke-virtual {p6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 86
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->disableVisualizer:Z

    const/4 p5, -0x1

    .line 87
    iput p5, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->currentAudioSessionId:I

    .line 91
    :cond_3
    :goto_0
    iget-object p5, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->visualizer:Landroid/media/audiofx/Visualizer;

    if-nez p5, :cond_4

    return-object p2

    .line 95
    :cond_4
    invoke-virtual {p5}, Landroid/media/audiofx/Visualizer;->getCaptureSize()I

    move-result p2

    .line 97
    iget p5, p3, Lcom/daaw/avee/comp/playback/AudioFrameData$Request;->samplesCount:I

    invoke-static {p5}, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->pow2roundup(I)I

    move-result p5

    .line 98
    invoke-static {}, Landroid/media/audiofx/Visualizer;->getCaptureSizeRange()[I

    move-result-object p6

    .line 99
    aget v1, p6, p1

    aget p6, p6, v0

    invoke-static {p6, p5}, Ljava/lang/Math;->min(II)I

    move-result p5

    invoke-static {v1, p5}, Ljava/lang/Math;->max(II)I

    move-result p5

    const v3, 0xac44

    .line 101
    iget v4, p3, Lcom/daaw/avee/comp/playback/AudioFrameData$Request;->audioChannelCount:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p4

    move v5, p5

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/avee/comp/playback/AudioFrameData;->init(IIIIZ)V

    if-eq p5, p2, :cond_5

    .line 106
    iget-object p3, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->visualizer:Landroid/media/audiofx/Visualizer;

    invoke-virtual {p3, p1}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I

    .line 111
    :try_start_1
    iget-object p3, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->visualizer:Landroid/media/audiofx/Visualizer;

    invoke-virtual {p3, p5}, Landroid/media/audiofx/Visualizer;->setCaptureSize(I)I
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    move p2, p5

    goto :goto_1

    :catch_1
    nop

    .line 119
    :cond_5
    :goto_1
    iget-object p3, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->bytesBuffer:[B

    array-length p3, p3

    if-eq p3, p2, :cond_6

    .line 120
    new-array p2, p2, [B

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->bytesBuffer:[B

    .line 123
    :cond_6
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->visualizer:Landroid/media/audiofx/Visualizer;

    invoke-virtual {p2}, Landroid/media/audiofx/Visualizer;->getEnabled()Z

    move-result p2

    if-nez p2, :cond_7

    .line 124
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->visualizer:Landroid/media/audiofx/Visualizer;

    invoke-virtual {p2, v0}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I

    .line 128
    :cond_7
    :try_start_2
    iget-object p2, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->visualizer:Landroid/media/audiofx/Visualizer;

    iget-object p3, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->bytesBuffer:[B

    invoke-virtual {p2, p3}, Landroid/media/audiofx/Visualizer;->getWaveForm([B)I
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    nop

    :goto_2
    const/4 p2, 0x0

    .line 136
    iget-object p3, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->bytesBuffer:[B

    array-length p3, p3

    invoke-virtual {p4}, Lcom/daaw/avee/comp/playback/AudioFrameData;->getBufferSizeForCapture()I

    move-result p5

    invoke-static {p3, p5}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 138
    iget p5, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    const/high16 p6, 0x437f0000    # 255.0f

    const/4 v1, 0x2

    if-ne p5, v0, :cond_a

    :goto_3
    if-ge p1, p3, :cond_d

    .line 140
    iget-object p5, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->bytesBuffer:[B

    aget-byte p5, p5, p1

    and-int/lit16 p5, p5, 0xff

    add-int/lit8 p5, p5, -0x80

    int-to-short p5, p5

    mul-int/lit8 p5, p5, 0x2

    mul-int/lit16 p5, p5, 0x96

    int-to-short p5, p5

    .line 143
    iget-object v2, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    iget v3, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    mul-int v3, v3, p1

    aput-short p5, v2, v3

    .line 145
    iget-short v2, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->minPcmValue:S

    if-le v2, p5, :cond_8

    iput-short p5, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->minPcmValue:S

    .line 146
    :cond_8
    iget-short v2, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->maxPcmValue:S

    if-ge v2, p5, :cond_9

    iput-short p5, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->maxPcmValue:S

    .line 147
    :cond_9
    iget-object p5, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    iget v2, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    mul-int v2, v2, p1

    aget-short p5, p5, v2

    int-to-float p5, p5

    div-float/2addr p5, p6

    add-float/2addr p2, p5

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    .line 149
    :cond_a
    iget p5, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    if-ne p5, v1, :cond_d

    :goto_4
    if-ge p1, p3, :cond_d

    .line 151
    iget-object p5, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->bytesBuffer:[B

    aget-byte p5, p5, p1

    and-int/lit16 p5, p5, 0xff

    add-int/lit8 p5, p5, -0x80

    int-to-short p5, p5

    mul-int/lit8 p5, p5, 0x2

    mul-int/lit16 p5, p5, 0x96

    int-to-short p5, p5

    .line 154
    iget-object v2, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    iget v3, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    mul-int v3, v3, p1

    aput-short p5, v2, v3

    .line 155
    iget-object v2, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    iget v3, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    mul-int v3, v3, p1

    add-int/2addr v3, v0

    aput-short p5, v2, v3

    .line 157
    iget-short v2, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->minPcmValue:S

    if-le v2, p5, :cond_b

    iput-short p5, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->minPcmValue:S

    .line 158
    :cond_b
    iget-short v2, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->maxPcmValue:S

    if-ge v2, p5, :cond_c

    iput-short p5, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->maxPcmValue:S

    .line 159
    :cond_c
    iget-object p5, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    iget v2, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    mul-int v2, v2, p1

    aget-short p5, p5, v2

    int-to-float p5, p5

    div-float/2addr p5, p6

    add-float/2addr p2, p5

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    .line 163
    :cond_d
    invoke-virtual {p4}, Lcom/daaw/avee/comp/playback/AudioFrameData;->getBufferSizeForCapture()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p2, p1

    .line 164
    iput p2, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->rms:F

    .line 165
    iput-boolean v0, p4, Lcom/daaw/avee/comp/playback/AudioFrameData;->valid:Z

    return-object p4
.end method

.method public release()V
    .locals 3

    .line 39
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->visualizer:Landroid/media/audiofx/Visualizer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 40
    invoke-virtual {v0, v1}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I

    .line 41
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->visualizer:Landroid/media/audiofx/Visualizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Visualizer;->release()V

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->virtualizerEffect:Landroid/media/audiofx/Virtualizer;

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    .line 44
    invoke-virtual {v0, v2}, Landroid/media/audiofx/Virtualizer;->setEnabled(Z)I

    .line 45
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->virtualizerEffect:Landroid/media/audiofx/Virtualizer;

    invoke-virtual {v0, v1}, Landroid/media/audiofx/Virtualizer;->setEnabled(Z)I

    .line 46
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->virtualizerEffect:Landroid/media/audiofx/Virtualizer;

    invoke-virtual {v0}, Landroid/media/audiofx/Virtualizer;->release()V

    :cond_1
    return-void
.end method

.method reset()V
    .locals 1

    const/4 v0, 0x0

    .line 51
    iput-boolean v0, p0, Lcom/daaw/avee/comp/playback/NativeMediaPlayer/NativeVisualizerDataProvider;->disableVisualizer:Z

    return-void
.end method
