.class public Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;
.super Ljava/lang/Object;
.source "AudioEncoderManager2B.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;
    }
.end annotation


# static fields
.field private static final MSG_FRAME_AVAILABLE:I = 0x2

.field private static final MSG_STOP_RECORDING:I = 0x1

.field private static final TAG:Ljava/lang/String; = "AudioEncoderManager2B"

.field private static final VERBOSE:Z = false


# instance fields
.field private audioEncodeFrameFailed:Ljava/util/concurrent/atomic/AtomicInteger;

.field private volatile mHandler:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;

.field private mReady:Z

.field private mReadyFence:Ljava/lang/Object;

.field private mRunning:Z

.field private mVideoEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;)V
    .locals 2

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mReadyFence:Ljava/lang/Object;

    .line 68
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->audioEncodeFrameFailed:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v0, "AudioEncoderManager2B"

    const-string v1, "Encoder: startRecording()"

    .line 79
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mVideoEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;

    .line 83
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mReadyFence:Ljava/lang/Object;

    monitor-enter p1

    .line 84
    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mRunning:Z

    if-eqz v0, :cond_0

    const-string v0, "AudioEncoderManager2B"

    const-string v1, "Encoder thread already running"

    .line 85
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    monitor-exit p1

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 88
    iput-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mRunning:Z

    .line 89
    new-instance v0, Ljava/lang/Thread;

    const-string v1, "AudioTextureMovieEncoder2B"

    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 90
    :catch_0
    :goto_0
    iget-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mReady:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 92
    :try_start_1
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mReadyFence:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 97
    :cond_1
    :try_start_2
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->handleStopRecording()V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;Z)Z
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->handleFrameAvailable(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;Z)Z

    move-result p0

    return p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->audioEncodeFrameFailed:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method private handleFrameAvailable(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;Z)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_2

    .line 216
    :try_start_0
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mVideoEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;

    const/4 v3, 0x1

    if-nez v1, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v2, p1, p2, v4}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;->encode(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;ZZ)Z

    move-result v2

    .line 218
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mVideoEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;

    invoke-virtual {v4, v0, v0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;->drainEncoder(ZZ)V

    if-eqz v2, :cond_1

    return v3

    .line 222
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "############### ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] encode tried failed "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const-string p2, "encode failed, INFO_TRY_AGAIN_LATER?"

    .line 225
    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 226
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "encode failed, presentationTimeUs: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p1, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;->presentationTimeUs:J

    invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " length: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;->length:I

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    const-string p2, ""

    .line 228
    invoke-static {p1, p2}, Lcom/daaw/avee/Common/tlog;->e(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_2
    return v0
.end method

.method private handleStopRecording()V
    .locals 2

    :try_start_0
    const-string v0, "AudioEncoderManager2B"

    const-string v1, "handleStopRecording"

    .line 239
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 240
    new-instance v0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;

    invoke-direct {v0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;-><init>()V

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->handleFrameAvailable(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;Z)Z

    .line 241
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mVideoEncoder:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;->release()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, ""

    .line 243
    invoke-static {v0, v1}, Lcom/daaw/avee/Common/tlog;->e(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public frameAvailableSoon(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;)V
    .locals 3

    .line 131
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mReadyFence:Ljava/lang/Object;

    monitor-enter v0

    .line 132
    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mReady:Z

    if-nez v1, :cond_0

    .line 133
    monitor-exit v0

    return-void

    .line 135
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mHandler:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mHandler:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, p1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception p1

    .line 135
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public isRecording()Z
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mReadyFence:Ljava/lang/Object;

    monitor-enter v0

    .line 120
    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mRunning:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 121
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public reportMessages(Lcom/daaw/avee/Common/StatusMsg;)V
    .locals 3

    .line 166
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->audioEncodeFrameFailed:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    .line 168
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "audioEncodeFrameFailed ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/StatusMsg;->addErrorMessage(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public run()V
    .locals 2

    .line 147
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 148
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mReadyFence:Ljava/lang/Object;

    monitor-enter v0

    .line 149
    :try_start_0
    new-instance v1, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;-><init>(Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;)V

    iput-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mHandler:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;

    const/4 v1, 0x1

    .line 150
    iput-boolean v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mReady:Z

    .line 151
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mReadyFence:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 152
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 153
    invoke-static {}, Landroid/os/Looper;->loop()V

    const-string v0, "AudioEncoderManager2B"

    const-string v1, "Encoder thread exiting"

    .line 157
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 158
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mReadyFence:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    .line 159
    :try_start_1
    iput-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mRunning:Z

    iput-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mReady:Z

    const/4 v0, 0x0

    .line 160
    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mHandler:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;

    .line 161
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    .line 152
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public stopRecording()V
    .locals 3

    .line 110
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mHandler:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B;->mHandler:Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderManager2B$EncoderHandler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
