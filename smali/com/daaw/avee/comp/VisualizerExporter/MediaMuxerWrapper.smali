.class public Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;
.super Ljava/lang/Object;
.source "MediaMuxerWrapper.java"


# instance fields
.field private expectedTrackCount:I

.field private mMuxer:Landroid/media/MediaMuxer;

.field private mMuxerStarted:Z

.field final muxerLock:Ljava/lang/Object;

.field private trackCount:I


# direct methods
.method public constructor <init>(Ljava/io/File;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxerStarted:Z

    .line 25
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->muxerLock:Ljava/lang/Object;

    .line 31
    new-instance v1, Landroid/media/MediaMuxer;

    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Landroid/media/MediaMuxer;-><init>(Ljava/lang/String;I)V

    iput-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxer:Landroid/media/MediaMuxer;

    .line 36
    iput-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxerStarted:Z

    .line 38
    iput p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->expectedTrackCount:I

    .line 39
    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->trackCount:I

    return-void
.end method


# virtual methods
.method public addTrack(Landroid/media/MediaFormat;Ljava/lang/String;)I
    .locals 3

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "#####  addTrack: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " trackCount: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->trackCount:I

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    .line 86
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->muxerLock:Ljava/lang/Object;

    monitor-enter p2

    .line 87
    :try_start_0
    iget-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxerStarted:Z

    if-nez v0, :cond_2

    .line 91
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxer:Landroid/media/MediaMuxer;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    monitor-exit p2

    return p1

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxer:Landroid/media/MediaMuxer;

    invoke-virtual {v0, p1}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result p1

    .line 95
    iget v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->trackCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->trackCount:I

    .line 96
    iget v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->expectedTrackCount:I

    if-ne v0, v2, :cond_1

    .line 97
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxer:Landroid/media/MediaMuxer;

    invoke-virtual {v0}, Landroid/media/MediaMuxer;->start()V

    .line 98
    iput-boolean v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxerStarted:Z

    .line 99
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->muxerLock:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 103
    :cond_1
    monitor-exit p2

    return p1

    .line 88
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "format changed twice"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 104
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public isMuxerStarted()Z
    .locals 5

    .line 44
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->muxerLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 47
    :goto_0
    :try_start_0
    iget-boolean v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxerStarted:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    const/4 v2, 0x5

    if-ge v1, v2, :cond_0

    .line 50
    :try_start_1
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->muxerLock:Ljava/lang/Object;

    const-wide/16 v3, 0x3e8

    invoke-virtual {v2, v3, v4}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 57
    :cond_0
    :try_start_2
    iget-boolean v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxerStarted:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 58
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method public release()V
    .locals 4

    .line 62
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->muxerLock:Ljava/lang/Object;

    monitor-enter v0

    .line 63
    :try_start_0
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxer:Landroid/media/MediaMuxer;

    if-eqz v1, :cond_1

    .line 65
    iget-boolean v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxerStarted:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 67
    :try_start_1
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxer:Landroid/media/MediaMuxer;

    invoke-virtual {v1}, Landroid/media/MediaMuxer;->stop()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 69
    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mMuxer stop exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    :cond_0
    :goto_0
    :try_start_3
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxer:Landroid/media/MediaMuxer;

    invoke-virtual {v1}, Landroid/media/MediaMuxer;->release()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_1
    move-exception v1

    .line 75
    :try_start_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mMuxer release exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :goto_1
    const/4 v1, 0x0

    .line 77
    iput-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxer:Landroid/media/MediaMuxer;

    .line 79
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method

.method public writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    .locals 5

    .line 110
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->muxerLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 113
    :goto_0
    :try_start_0
    iget-boolean v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxerStarted:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    const/4 v2, 0x5

    if-ge v1, v2, :cond_0

    .line 116
    :try_start_1
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->muxerLock:Ljava/lang/Object;

    const-wide/16 v3, 0x3e8

    invoke-virtual {v2, v3, v4}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 123
    :cond_0
    :try_start_2
    iget-boolean v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxerStarted:Z

    if-eqz v1, :cond_1

    .line 127
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/MediaMuxerWrapper;->mMuxer:Landroid/media/MediaMuxer;

    invoke-virtual {v1, p1, p2, p3}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    .line 128
    monitor-exit v0

    return-void

    .line 124
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "muxer hasn\'t started"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 128
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
