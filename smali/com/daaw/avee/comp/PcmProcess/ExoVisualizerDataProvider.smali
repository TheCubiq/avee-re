.class public Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;
.super Ljava/lang/Object;
.source "ExoVisualizerDataProvider.java"


# static fields
.field private static final MAX_BUFFER_COUNT:I = 0x12c


# instance fields
.field private buffersList:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/daaw/avee/comp/PcmProcess/BufferEntry;",
            ">;"
        }
    .end annotation
.end field

.field private doClearBuffers:Z

.field private volatile doResetBuffers:I

.field private lastBufferPresentationTimeUs:J

.field private lastIndex:I

.field private lastREndUs:J

.field private lockBuffersList:Ljava/util/concurrent/locks/Lock;

.field private newestPresentationTimeUs:J

.field tmpBuff:[[B

.field private validBuffers:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 41
    iput-wide v0, p0, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->newestPresentationTimeUs:J

    .line 44
    new-instance v2, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lockBuffersList:Ljava/util/concurrent/locks/Lock;

    .line 46
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->buffersList:Ljava/util/LinkedList;

    const/4 v2, 0x0

    .line 48
    iput v2, p0, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->doResetBuffers:I

    const/4 v2, 0x1

    .line 49
    iput-boolean v2, p0, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->doClearBuffers:Z

    const/4 v2, -0x1

    .line 50
    iput v2, p0, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lastIndex:I

    const-wide/16 v2, -0x1

    .line 51
    iput-wide v2, p0, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lastBufferPresentationTimeUs:J

    .line 53
    iput-wide v0, p0, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lastREndUs:J

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 55
    fill-array-data v0, :array_0

    const-class v1, B

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[B

    iput-object v0, p0, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->tmpBuff:[[B

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x0
    .end array-data
.end method

.method private addNewBufferEntry(Lcom/daaw/avee/comp/PcmProcess/BufferEntry;)V
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->buffersList:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private findBufferByTime(IJ[JLcom/daaw/avee/comp/PcmProcess/BufferEntry;)Lcom/daaw/avee/comp/PcmProcess/BufferEntry;
    .locals 9

    .line 417
    iget-object p1, p0, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->buffersList:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide v0, 0x7fffffffffffffffL

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;

    if-ne p5, v3, :cond_1

    goto :goto_0

    .line 420
    :cond_1
    invoke-virtual {v3}, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    .line 430
    :cond_2
    iget-wide v4, v3, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->bufferStartTime:J

    sub-long v4, p2, v4

    const-wide/16 v6, -0x1

    cmp-long v8, v4, v6

    if-ltz v8, :cond_0

    .line 434
    iget-wide v6, v3, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->bufferPresentationTimeUs:J

    cmp-long v8, p2, v6

    if-gtz v8, :cond_0

    cmp-long v6, v0, v4

    if-lez v6, :cond_0

    move-object v2, v3

    move-wide v0, v4

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    const-wide/16 p2, 0x0

    cmp-long p5, v0, p2

    if-gez p5, :cond_4

    move-wide v0, p2

    .line 454
    :cond_4
    aput-wide v0, p4, p1

    return-object v2
.end method

.method private static resampleTo16BitPcm(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 7

    .line 576
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    .line 577
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    sub-int v2, v1, v0

    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v4, -0x80000000

    const/4 v5, 0x3

    if-eq p1, v4, :cond_1

    if-eq p1, v5, :cond_2

    if-ne p1, v3, :cond_0

    .line 589
    div-int/lit8 v2, v2, 0x2

    goto :goto_0

    .line 593
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    .line 586
    :cond_1
    div-int/2addr v2, v5

    :cond_2
    mul-int/lit8 v2, v2, 0x2

    :goto_0
    if-eqz p2, :cond_3

    .line 597
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v6

    if-ge v6, v2, :cond_4

    .line 598
    :cond_3
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    :cond_4
    const/4 v6, 0x0

    .line 600
    invoke-virtual {p2, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 601
    invoke-virtual {p2, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    if-eq p1, v4, :cond_7

    if-eq p1, v5, :cond_6

    if-ne p1, v3, :cond_5

    :goto_1
    if-ge v0, v1, :cond_8

    add-int/lit8 p1, v0, 0x2

    .line 622
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 p1, v0, 0x3

    .line 623
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x4

    goto :goto_1

    .line 628
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_6
    :goto_2
    if-ge v0, v1, :cond_8

    .line 608
    invoke-virtual {p2, v6}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 609
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    add-int/lit8 p1, p1, -0x80

    int-to-byte p1, p1

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    :goto_3
    if-ge v0, v1, :cond_8

    add-int/lit8 p1, v0, 0x1

    .line 615
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 p1, v0, 0x2

    .line 616
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v0, 0x3

    goto :goto_3

    .line 631
    :cond_8
    invoke-virtual {p2, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-object p2
.end method

.method private resetBuffers()V
    .locals 2

    .line 170
    iget-object v0, p0, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->buffersList:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;

    .line 171
    invoke-virtual {v1}, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->setToEmpty()V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public clone(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 2

    if-eqz p2, :cond_0

    .line 88
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 89
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result p2

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 90
    :cond_1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 91
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 92
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 93
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 94
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-object p2
.end method

.method public getVisData(JLcom/daaw/avee/comp/playback/AudioFrameData$Request;Lcom/daaw/avee/comp/playback/AudioFrameData;Z)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 25

    move-object/from16 v7, p0

    move-object/from16 v0, p3

    move-object/from16 v8, p4

    .line 249
    iget v1, v0, Lcom/daaw/avee/comp/playback/AudioFrameData$Request;->audioOffsetMs:I

    mul-int/lit16 v1, v1, 0x3e8

    int-to-long v1, v1

    add-long v9, p1, v1

    .line 251
    iget-boolean v1, v7, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->validBuffers:Z

    const/4 v11, 0x0

    if-nez v1, :cond_0

    .line 252
    iput-boolean v11, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->valid:Z

    return-object v8

    .line 256
    :cond_0
    iput-boolean v11, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataFully:Z

    .line 257
    iput-wide v9, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataPositionUs:J

    .line 258
    iget-wide v1, v7, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->newestPresentationTimeUs:J

    iput-wide v1, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->newestAvailableBufferPositionUs:J

    const-wide v1, 0x7fffffffffffffffL

    .line 259
    iput-wide v1, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->availableBuffersStartPositionUs:J

    const-wide/high16 v1, -0x8000000000000000L

    .line 260
    iput-wide v1, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->availableBuffersEndPositionUs:J

    const/4 v12, 0x1

    new-array v13, v12, [J

    new-array v15, v12, [J

    const/4 v14, 0x2

    new-array v6, v14, [S

    new-array v5, v12, [F

    const/4 v1, 0x0

    aput v1, v5, v11

    .line 273
    :try_start_0
    iget-object v1, v7, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lockBuffersList:Ljava/util/concurrent/locks/Lock;

    const-wide/16 v2, 0x1f4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4}, Ljava/util/concurrent/locks/Lock;->tryLock(JLjava/util/concurrent/TimeUnit;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object/from16 v22, v5

    move-object/from16 v23, v6

    goto/16 :goto_9

    :catch_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_a

    if-eqz p5, :cond_1

    .line 280
    :try_start_1
    invoke-direct/range {p0 .. p0}, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->resetBuffers()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v22, v5

    move-object/from16 v23, v6

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    move-object/from16 v22, v5

    move-object/from16 v23, v6

    goto/16 :goto_8

    :cond_1
    const/16 v16, 0x0

    const/4 v2, 0x0

    move-object/from16 v1, p0

    move-wide v3, v9

    move-object/from16 v22, v5

    move-object v5, v13

    move-object/from16 v23, v6

    move-object/from16 v6, v16

    .line 309
    :try_start_2
    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->findBufferByTime(IJ[JLcom/daaw/avee/comp/PcmProcess/BufferEntry;)Lcom/daaw/avee/comp/PcmProcess/BufferEntry;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 311
    iget v2, v1, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->sampleRate:I

    iget v3, v0, Lcom/daaw/avee/comp/playback/AudioFrameData$Request;->audioChannelCount:I

    iget v4, v0, Lcom/daaw/avee/comp/playback/AudioFrameData$Request;->samplesCount:I

    iget-wide v5, v0, Lcom/daaw/avee/comp/playback/AudioFrameData$Request;->samplesCountUs:J

    iget v0, v1, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->sampleRate:I

    move-object/from16 v16, v15

    int-to-long v14, v0

    invoke-static {v5, v6, v14, v15}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->durationUsToFrames(JJ)I

    move-result v0

    invoke-virtual {v8, v2, v3, v4, v0}, Lcom/daaw/avee/comp/playback/AudioFrameData;->init(IIII)V

    goto :goto_1

    :cond_2
    move-object/from16 v16, v15

    .line 313
    :goto_1
    iget-short v0, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->minPcmValue:S

    aput-short v0, v23, v11

    .line 314
    iget-short v0, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->maxPcmValue:S

    aput-short v0, v23, v12

    move-object v6, v1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    if-eqz v6, :cond_7

    .line 321
    aget-wide v2, v13, v11

    iget v4, v6, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->sampleRate:I

    int-to-long v4, v4

    invoke-static {v2, v3, v4, v5}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->durationUsToFrames(JJ)I

    move-result v2

    if-lez v0, :cond_3

    if-eqz v2, :cond_3

    .line 323
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "t["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "]; startFrameOffsetBuffer != 0; totalSamplesGot: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " startFrameOffsetBuffer: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " startOffsetTime: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-wide v4, v13, v11

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 326
    :cond_3
    iget-object v15, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    iget v3, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    const/4 v5, 0x2

    move-object v14, v6

    move-object/from16 v24, v16

    move/from16 v16, v3

    move/from16 v17, v1

    move/from16 v18, v2

    move-object/from16 v19, v23

    move-object/from16 v20, v22

    move-object/from16 v21, v24

    invoke-virtual/range {v14 .. v21}, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->getBufferData3([SIII[S[F[J)I

    move-result v3

    add-int v14, v1, v3

    .line 339
    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/AudioFrameData;->getBufferSizeForCapture()I

    move-result v1

    if-lt v14, v1, :cond_4

    add-int/2addr v2, v3

    int-to-long v0, v2

    .line 342
    iget v2, v6, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->sampleRate:I

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->framesToDurationUs(JJ)J

    move-result-wide v0

    .line 343
    iget-wide v2, v6, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->bufferStartTime:J

    add-long/2addr v2, v0

    iput-wide v2, v7, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lastREndUs:J

    .line 347
    iput-boolean v12, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataFully:Z

    goto :goto_4

    .line 350
    :cond_4
    aget-wide v1, v24, v11

    const-wide/16 v3, -0x1

    cmp-long v15, v1, v3

    if-eqz v15, :cond_5

    const/4 v1, 0x1

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    invoke-static {v1}, Ljunit/framework/Assert;->assertTrue(Z)V

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x9

    if-lt v0, v1, :cond_6

    :goto_4
    move v1, v14

    goto :goto_5

    .line 370
    :cond_6
    aget-wide v3, v24, v11

    move-object/from16 v1, p0

    move v2, v0

    const/4 v15, 0x2

    move-object v5, v13

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->findBufferByTime(IJ[JLcom/daaw/avee/comp/PcmProcess/BufferEntry;)Lcom/daaw/avee/comp/PcmProcess/BufferEntry;

    move-result-object v6

    move v1, v14

    move-object/from16 v16, v24

    goto/16 :goto_2

    :cond_7
    :goto_5
    const/4 v15, 0x2

    .line 375
    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/AudioFrameData;->getBufferSizeForCapture()I

    move-result v0

    if-lt v1, v0, :cond_8

    .line 376
    iput-boolean v12, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataFully:Z

    goto :goto_6

    .line 378
    :cond_8
    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/AudioFrameData;->getBufferSizeForCapture()I

    move-result v0

    if-le v0, v15, :cond_9

    .line 379
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "totalSamplesGot: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " need: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/AudioFrameData;->getBufferSizeForCapture()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 382
    :cond_9
    :goto_6
    iput v1, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->captureSamplesCount:I

    int-to-long v0, v1

    .line 383
    iget v2, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->sampleRate:I

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->framesToDurationUs(JJ)J

    move-result-wide v0

    add-long/2addr v9, v0

    iput-wide v9, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataPositionEndUs:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 387
    :goto_7
    :try_start_3
    iget-object v0, v7, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lockBuffersList:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_a

    :catch_2
    move-exception v0

    goto :goto_9

    :catchall_1
    move-exception v0

    :goto_8
    iget-object v1, v7, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lockBuffersList:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 392
    :goto_9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    goto :goto_a

    :cond_a
    move-object/from16 v22, v5

    move-object/from16 v23, v6

    .line 395
    :goto_a
    aget-short v0, v23, v11

    iput-short v0, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->minPcmValue:S

    .line 396
    aget-short v0, v23, v12

    iput-short v0, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->maxPcmValue:S

    const/high16 v0, 0x3f800000    # 1.0f

    .line 397
    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/AudioFrameData;->getBufferSizeForCapture()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    aget v1, v22, v11

    mul-float v0, v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->rms:F

    .line 398
    iput-boolean v12, v8, Lcom/daaw/avee/comp/playback/AudioFrameData;->valid:Z

    return-object v8
.end method

.method public onNewSourceTh()V
    .locals 1

    const/4 v0, 0x1

    .line 100
    iput v0, p0, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->doResetBuffers:I

    return-void
.end method

.method public onPcmData(Ljava/nio/ByteBuffer;JIIII)V
    .locals 12

    move-object v1, p0

    move/from16 v0, p4

    const-wide/16 v2, 0x0

    move-wide v4, p2

    .line 110
    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    if-lez v0, :cond_0

    .line 112
    iget v2, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lastIndex:I

    if-ne v2, v0, :cond_0

    iget-wide v2, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lastBufferPresentationTimeUs:J

    cmp-long v4, v2, v6

    if-nez v4, :cond_0

    return-void

    .line 116
    :cond_0
    iput-wide v6, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lastBufferPresentationTimeUs:J

    .line 117
    iput v0, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lastIndex:I

    .line 118
    iput-wide v6, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->newestPresentationTimeUs:J

    const/4 v0, 0x0

    .line 122
    :try_start_0
    iget-object v2, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lockBuffersList:Ljava/util/concurrent/locks/Lock;

    const-wide/16 v3, 0x1f4

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v3, v4, v5}, Ljava/util/concurrent/locks/Lock;->tryLock(JLjava/util/concurrent/TimeUnit;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    .line 129
    :try_start_1
    iget v2, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->doResetBuffers:I

    if-lez v2, :cond_1

    .line 130
    invoke-direct {p0}, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->resetBuffers()V

    .line 131
    iput v0, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->doResetBuffers:I

    :cond_1
    const/4 v0, 0x0

    .line 137
    iget-object v2, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->buffersList:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    move-result v2

    if-lez v2, :cond_2

    iget-object v2, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->buffersList:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    move-result v2

    const/16 v3, 0x12c

    if-lt v2, v3, :cond_2

    .line 138
    iget-object v0, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->buffersList:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;

    :cond_2
    if-nez v0, :cond_3

    .line 142
    new-instance v0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;

    invoke-direct {v0}, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;-><init>()V

    .line 145
    :cond_3
    iget-object v11, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->tmpBuff:[[B

    move-object v4, v0

    move-object v5, p1

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    invoke-virtual/range {v4 .. v11}, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->finishInit(Ljava/nio/ByteBuffer;JIII[[B)V

    .line 147
    iget-object v2, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->buffersList:Ljava/util/LinkedList;

    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 151
    iput-boolean v0, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->validBuffers:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    .line 154
    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 155
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 157
    :goto_1
    iget-object v0, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lockBuffersList:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_3

    :goto_2
    iget-object v2, v1, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->lockBuffersList:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_4
    const-string v0, "thread lock timeout 1"

    .line 160
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :goto_3
    return-void
.end method

.method public release()V
    .locals 0

    return-void
.end method
