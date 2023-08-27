.class public Lcom/android/grafika/TextureMovieEncoder2;
.super Ljava/lang/Object;
.source "TextureMovieEncoder2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;
    }
.end annotation


# static fields
.field private static final MSG_FRAME_AVAILABLE:I = 0x2

.field private static final MSG_STOP_RECORDING:I = 0x1

.field private static final TAG:Ljava/lang/String; = "TextureMovieEncoder2"

.field private static final VERBOSE:Z = false


# instance fields
.field private volatile mHandler:Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;

.field private mReady:Z

.field private mReadyFence:Ljava/lang/Object;

.field private mRunning:Z

.field private mVideoEncoder:Lcom/android/grafika/VideoEncoderCore;


# direct methods
.method public constructor <init>(Lcom/android/grafika/VideoEncoderCore;)V
    .locals 2

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mReadyFence:Ljava/lang/Object;

    const-string v0, "TextureMovieEncoder2"

    const-string v1, "Encoder: startRecording()"

    .line 74
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    iput-object p1, p0, Lcom/android/grafika/TextureMovieEncoder2;->mVideoEncoder:Lcom/android/grafika/VideoEncoderCore;

    .line 78
    iget-object p1, p0, Lcom/android/grafika/TextureMovieEncoder2;->mReadyFence:Ljava/lang/Object;

    monitor-enter p1

    .line 79
    :try_start_0
    iget-boolean v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mRunning:Z

    if-eqz v0, :cond_0

    const-string v0, "TextureMovieEncoder2"

    const-string v1, "Encoder thread already running"

    .line 80
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    monitor-exit p1

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 83
    iput-boolean v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mRunning:Z

    .line 84
    new-instance v0, Ljava/lang/Thread;

    const-string v1, "TextureMovieEncoder"

    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 85
    :catch_0
    :goto_0
    iget-boolean v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mReady:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 87
    :try_start_1
    iget-object v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mReadyFence:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 92
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

.method static synthetic access$000(Lcom/android/grafika/TextureMovieEncoder2;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/android/grafika/TextureMovieEncoder2;->handleStopRecording()V

    return-void
.end method

.method static synthetic access$100(Lcom/android/grafika/TextureMovieEncoder2;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/android/grafika/TextureMovieEncoder2;->handleFrameAvailable()V

    return-void
.end method

.method private handleFrameAvailable()V
    .locals 2

    .line 199
    iget-object v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mVideoEncoder:Lcom/android/grafika/VideoEncoderCore;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/android/grafika/VideoEncoderCore;->drainEncoder(Z)V

    return-void
.end method

.method private handleStopRecording()V
    .locals 4

    const-string v0, "TextureMovieEncoder2"

    :try_start_0
    const-string v1, "handleStopRecording"

    .line 207
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 208
    iget-object v1, p0, Lcom/android/grafika/TextureMovieEncoder2;->mVideoEncoder:Lcom/android/grafika/VideoEncoderCore;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/android/grafika/VideoEncoderCore;->drainEncoder(Z)V

    .line 209
    iget-object v1, p0, Lcom/android/grafika/TextureMovieEncoder2;->mVideoEncoder:Lcom/android/grafika/VideoEncoderCore;

    invoke-virtual {v1}, Lcom/android/grafika/VideoEncoderCore;->release()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 211
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mVideoEncoder exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method


# virtual methods
.method public frameAvailableSoon()V
    .locals 3

    .line 126
    iget-object v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mReadyFence:Ljava/lang/Object;

    monitor-enter v0

    .line 127
    :try_start_0
    iget-boolean v1, p0, Lcom/android/grafika/TextureMovieEncoder2;->mReady:Z

    if-nez v1, :cond_0

    .line 128
    monitor-exit v0

    return-void

    .line 130
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    iget-object v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mHandler:Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;

    iget-object v1, p0, Lcom/android/grafika/TextureMovieEncoder2;->mHandler:Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception v1

    .line 130
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public isRecording()Z
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mReadyFence:Ljava/lang/Object;

    monitor-enter v0

    .line 115
    :try_start_0
    iget-boolean v1, p0, Lcom/android/grafika/TextureMovieEncoder2;->mRunning:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 116
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public run()V
    .locals 2

    .line 143
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 144
    iget-object v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mReadyFence:Ljava/lang/Object;

    monitor-enter v0

    .line 145
    :try_start_0
    new-instance v1, Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;

    invoke-direct {v1, p0}, Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;-><init>(Lcom/android/grafika/TextureMovieEncoder2;)V

    iput-object v1, p0, Lcom/android/grafika/TextureMovieEncoder2;->mHandler:Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;

    const/4 v1, 0x1

    .line 146
    iput-boolean v1, p0, Lcom/android/grafika/TextureMovieEncoder2;->mReady:Z

    .line 147
    iget-object v1, p0, Lcom/android/grafika/TextureMovieEncoder2;->mReadyFence:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 148
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 149
    invoke-static {}, Landroid/os/Looper;->loop()V

    const-string v0, "TextureMovieEncoder2"

    const-string v1, "Encoder thread exiting"

    .line 151
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    iget-object v1, p0, Lcom/android/grafika/TextureMovieEncoder2;->mReadyFence:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    .line 153
    :try_start_1
    iput-boolean v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mRunning:Z

    iput-boolean v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mReady:Z

    const/4 v0, 0x0

    .line 154
    iput-object v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mHandler:Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;

    .line 155
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

    .line 148
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public stopRecording()V
    .locals 3

    .line 105
    iget-object v0, p0, Lcom/android/grafika/TextureMovieEncoder2;->mHandler:Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;

    iget-object v1, p0, Lcom/android/grafika/TextureMovieEncoder2;->mHandler:Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/grafika/TextureMovieEncoder2$EncoderHandler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
