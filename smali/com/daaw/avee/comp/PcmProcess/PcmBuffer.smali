.class public Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;
.super Ljava/lang/Object;
.source "PcmBuffer.java"


# static fields
.field private static lastBytesIgnoreCount:I = 0x1474


# instance fields
.field private bufferChannelCount:I

.field private bufferSampleRate:I

.field private currentBufferOffsetCorrection:J

.field private filePrefix:Ljava/lang/String;

.field private lastBufferPresentationTimeUs:J

.field private lastIndex:I

.field private lastReadRafFillPos:I

.field private final locker:Ljava/lang/Object;

.field private maxSizeInBytes:I

.field private raf:Lcom/daaw/avee/Common/RandomAccessFileTh;

.field private rafFillPos:I

.field private readBufferEntryTmp:Lcom/daaw/avee/comp/PcmProcess/BufferEntry;

.field private tmpBuff:[[B

.field private totalBufferTimeDurationUs:J

.field private zeroBuf:Ljava/nio/ByteBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 4

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x4e20

    .line 17
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->zeroBuf:Ljava/nio/ByteBuffer;

    .line 19
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->locker:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 21
    iput v0, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->lastIndex:I

    const-wide/16 v0, -0x1

    .line 22
    iput-wide v0, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->lastBufferPresentationTimeUs:J

    const/4 v0, 0x0

    .line 31
    iput v0, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->lastReadRafFillPos:I

    .line 35
    new-instance v1, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;

    invoke-direct {v1}, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->readBufferEntryTmp:Lcom/daaw/avee/comp/PcmProcess/BufferEntry;

    const/4 v1, 0x2

    new-array v2, v1, [I

    .line 37
    fill-array-data v2, :array_0

    const-class v3, B

    invoke-static {v3, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[B

    iput-object v2, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->tmpBuff:[[B

    .line 45
    iput-object p1, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->filePrefix:Ljava/lang/String;

    .line 46
    iput-wide p2, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->totalBufferTimeDurationUs:J

    const p1, 0xac44

    .line 47
    iput p1, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferSampleRate:I

    .line 48
    iput v1, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferChannelCount:I

    .line 49
    iput v0, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->maxSizeInBytes:I

    const/4 p1, 0x0

    .line 50
    iput-object p1, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->raf:Lcom/daaw/avee/Common/RandomAccessFileTh;

    .line 51
    iput v0, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->rafFillPos:I

    const-wide/16 p1, 0x0

    .line 52
    iput-wide p1, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->currentBufferOffsetCorrection:J

    return-void

    :array_0
    .array-data 4
        0x1
        0x0
    .end array-data
.end method

.method private createRaf(III)V
    .locals 6

    .line 63
    iput p1, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferSampleRate:I

    .line 64
    iput p2, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferChannelCount:I

    .line 66
    iget-wide v0, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->totalBufferTimeDurationUs:J

    int-to-long v4, p1

    move v2, p2

    move v3, p3

    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->durationUsToBytes(JIIJ)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->maxSizeInBytes:I

    const/4 p1, 0x0

    .line 68
    iput p1, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->rafFillPos:I

    .line 70
    iget-object p2, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->raf:Lcom/daaw/avee/Common/RandomAccessFileTh;

    if-eqz p2, :cond_0

    .line 71
    invoke-virtual {p2}, Lcom/daaw/avee/Common/RandomAccessFileTh;->close()V

    .line 75
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->filePrefix:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iget p3, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->maxSizeInBytes:I

    add-int/lit16 p3, p3, 0x1400

    invoke-static {p2, p3}, Lcom/daaw/avee/Common/RandomAccessFileTh;->createTemp(Ljava/lang/String;I)Lcom/daaw/avee/Common/RandomAccessFileTh;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->raf:Lcom/daaw/avee/Common/RandomAccessFileTh;

    add-int/lit8 p1, p1, 0x1

    if-nez p2, :cond_1

    const/4 p2, 0x3

    if-lt p1, p2, :cond_0

    :cond_1
    const-wide/16 p1, 0x0

    .line 79
    iput-wide p1, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->currentBufferOffsetCorrection:J

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->raf:Lcom/daaw/avee/Common/RandomAccessFileTh;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/Common/RandomAccessFileTh;->close()V

    :cond_0
    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->raf:Lcom/daaw/avee/Common/RandomAccessFileTh;

    return-void
.end method

.method public getVisData(JLcom/daaw/avee/comp/playback/AudioFrameData$Request;Lcom/daaw/avee/comp/playback/AudioFrameData;I)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 25

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v0, p3

    move-object/from16 v4, p4

    move/from16 v12, p5

    const/4 v14, 0x0

    .line 153
    iput-boolean v14, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataFully:Z

    .line 154
    iput-wide v2, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataPositionUs:J

    const-wide/16 v9, 0x0

    .line 155
    iput-wide v9, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->newestAvailableBufferPositionUs:J

    const-wide v5, 0x7fffffffffffffffL

    .line 156
    iput-wide v5, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->availableBuffersStartPositionUs:J

    const-wide/high16 v5, -0x8000000000000000L

    .line 157
    iput-wide v5, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->availableBuffersEndPositionUs:J

    .line 159
    iget-object v5, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->raf:Lcom/daaw/avee/Common/RandomAccessFileTh;

    if-nez v5, :cond_0

    return-object v4

    .line 162
    :cond_0
    iget v5, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferSampleRate:I

    iget v6, v0, Lcom/daaw/avee/comp/playback/AudioFrameData$Request;->audioChannelCount:I

    iget v7, v0, Lcom/daaw/avee/comp/playback/AudioFrameData$Request;->samplesCount:I

    iget-wide v9, v0, Lcom/daaw/avee/comp/playback/AudioFrameData$Request;->samplesCountUs:J

    iget v8, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferSampleRate:I

    int-to-long v14, v8

    .line 165
    invoke-static {v9, v10, v14, v15}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->durationUsToFrames(JJ)I

    move-result v8

    .line 162
    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/daaw/avee/comp/playback/AudioFrameData;->init(IIII)V

    .line 167
    iget v0, v0, Lcom/daaw/avee/comp/playback/AudioFrameData$Request;->audioOffsetMs:I

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v5, v0

    add-long/2addr v2, v5

    .line 172
    iget v7, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferChannelCount:I

    iget v0, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferSampleRate:I

    int-to-long v9, v0

    move-wide v5, v2

    move/from16 v8, p5

    const-wide/16 v13, 0x0

    invoke-static/range {v5 .. v10}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->durationUsToBytes(JIIJ)I

    move-result v0

    .line 173
    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/AudioFrameData;->getBufferSizeForCapture()I

    move-result v5

    int-to-long v5, v5

    iget v7, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferChannelCount:I

    invoke-static {v5, v6, v7, v12}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->framesToBytes(JII)I

    move-result v5

    .line 174
    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/AudioFrameData;->getBufferSizeForTimedResult()I

    move-result v6

    int-to-long v6, v6

    iget v8, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferChannelCount:I

    invoke-static {v6, v7, v8, v12}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->framesToBytes(JII)I

    move-result v6

    .line 176
    iget v7, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->lastReadRafFillPos:I

    sub-int v7, v0, v7

    int-to-long v7, v7

    .line 178
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    int-to-long v13, v12

    cmp-long v11, v9, v13

    if-gez v11, :cond_1

    .line 180
    iget v0, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->lastReadRafFillPos:I

    goto :goto_0

    :cond_1
    const-wide/16 v9, 0x0

    cmp-long v11, v7, v9

    if-eqz v11, :cond_2

    .line 183
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "! readPosDelta: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_2
    :goto_0
    add-int/2addr v6, v0

    .line 187
    iput v6, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->lastReadRafFillPos:I

    .line 190
    iget v6, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->maxSizeInBytes:I

    add-int v7, v0, v5

    sub-int v8, v6, v7

    sub-int/2addr v7, v6

    const/4 v6, 0x0

    .line 192
    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v14

    sub-int/2addr v5, v14

    .line 193
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int v6, v0, v5

    .line 199
    iget v7, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->rafFillPos:I

    add-int/lit8 v7, v7, -0xa

    const/4 v15, 0x1

    if-le v6, v7, :cond_5

    .line 200
    sget v7, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->lastBytesIgnoreCount:I

    if-gt v8, v7, :cond_3

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    .line 204
    :goto_1
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "need read to"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v7, :cond_4

    const-string v10, "/ignore: "

    goto :goto_2

    :cond_4
    const-string v10, ": "

    :goto_2
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "; raf filled to: "

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->rafFillPos:I

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "; maxBytes: "

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->maxSizeInBytes:I

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "; bytesTillEnd: "

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    if-nez v7, :cond_6

    return-object v4

    :cond_5
    const/4 v7, 0x0

    .line 210
    :cond_6
    iget-object v13, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->locker:Ljava/lang/Object;

    monitor-enter v13

    .line 211
    :try_start_0
    iget-object v6, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->raf:Lcom/daaw/avee/Common/RandomAccessFileTh;

    if-nez v6, :cond_7

    monitor-exit v13

    return-object v4

    :cond_7
    if-eqz v7, :cond_8

    .line 215
    iget-object v0, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->zeroBuf:Ljava/nio/ByteBuffer;

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 216
    iget-object v0, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->zeroBuf:Ljava/nio/ByteBuffer;

    goto :goto_3

    .line 218
    :cond_8
    iget-object v6, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->raf:Lcom/daaw/avee/Common/RandomAccessFileTh;

    invoke-virtual {v6, v0}, Lcom/daaw/avee/Common/RandomAccessFileTh;->readAsByteBufferNotThSafe(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    :goto_3
    move-object v6, v0

    .line 220
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    if-le v5, v0, :cond_9

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "readSizeInBytes ["

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "] > buf.remainingInBytes ["

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "]"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 222
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    move v11, v0

    goto :goto_4

    :cond_9
    move v11, v5

    .line 225
    :goto_4
    iget-object v5, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->readBufferEntryTmp:Lcom/daaw/avee/comp/PcmProcess/BufferEntry;

    const-wide/16 v7, 0x0

    iget v9, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferSampleRate:I

    iget v10, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferChannelCount:I

    iget-object v0, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->tmpBuff:[[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v12, p5

    move-object/from16 v16, v13

    move-object v13, v0

    :try_start_1
    invoke-virtual/range {v5 .. v13}, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->finishInit(Ljava/nio/ByteBuffer;JIIII[[B)V

    .line 226
    monitor-exit v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    new-array v0, v15, [J

    const/4 v5, 0x2

    new-array v5, v5, [S

    new-array v6, v15, [F

    .line 233
    iget-object v7, v1, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->readBufferEntryTmp:Lcom/daaw/avee/comp/PcmProcess/BufferEntry;

    iget-object v8, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBuffer:[S

    iget v9, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmBufferChannelCount:I

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    move/from16 v19, v9

    move-object/from16 v22, v5

    move-object/from16 v23, v6

    move-object/from16 v24, v0

    invoke-virtual/range {v17 .. v24}, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->getBufferData3([SIII[S[F[J)I

    move-result v0

    add-int/2addr v14, v0

    .line 241
    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/AudioFrameData;->getBufferSizeForCapture()I

    move-result v7

    if-lt v14, v7, :cond_a

    const/4 v7, 0x1

    goto :goto_5

    :cond_a
    const/4 v7, 0x0

    :goto_5
    iput-boolean v7, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataFully:Z

    .line 243
    iput v0, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->captureSamplesCount:I

    int-to-long v7, v0

    .line 244
    iget v0, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->sampleRate:I

    int-to-long v9, v0

    invoke-static {v7, v8, v9, v10}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->framesToDurationUs(JJ)J

    move-result-wide v7

    add-long/2addr v2, v7

    iput-wide v2, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->capturedDataPositionEndUs:J

    const/4 v0, 0x0

    .line 246
    aget-short v2, v5, v0

    iput-short v2, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->minPcmValue:S

    .line 247
    aget-short v2, v5, v15

    iput-short v2, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->maxPcmValue:S

    const/high16 v2, 0x3f800000    # 1.0f

    .line 248
    invoke-virtual/range {p4 .. p4}, Lcom/daaw/avee/comp/playback/AudioFrameData;->getBufferSizeForCapture()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    aget v0, v6, v0

    mul-float v2, v2, v0

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v0, v2

    iput v0, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->rms:F

    .line 249
    iput-boolean v15, v4, Lcom/daaw/avee/comp/playback/AudioFrameData;->valid:Z

    return-object v4

    :catchall_0
    move-exception v0

    move-object/from16 v16, v13

    .line 226
    :goto_6
    :try_start_2
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_6
.end method

.method public onNewSourceTh()V
    .locals 3

    .line 84
    iget-object v0, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->locker:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 85
    :try_start_0
    iput v1, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->rafFillPos:I

    const-wide/16 v1, 0x0

    .line 86
    iput-wide v1, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->currentBufferOffsetCorrection:J

    .line 87
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public onPcmData(Ljava/nio/ByteBuffer;JIIII)V
    .locals 8

    const-wide/16 v0, 0x0

    .line 97
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    .line 99
    iget v2, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->lastIndex:I

    if-ne v2, p4, :cond_0

    iget-wide v2, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->lastBufferPresentationTimeUs:J

    cmp-long v4, v2, p2

    if-nez v4, :cond_0

    return-void

    .line 102
    :cond_0
    iput-wide p2, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->lastBufferPresentationTimeUs:J

    .line 103
    iput p4, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->lastIndex:I

    .line 105
    iget-object p4, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->raf:Lcom/daaw/avee/Common/RandomAccessFileTh;

    if-eqz p4, :cond_1

    iget p4, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferSampleRate:I

    if-ne p4, p5, :cond_1

    iget p4, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferChannelCount:I

    if-eq p4, p6, :cond_2

    :cond_1
    const-string p4, "createRaf"

    .line 106
    invoke-static {p4}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 108
    iget-object p4, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->locker:Ljava/lang/Object;

    monitor-enter p4

    .line 109
    :try_start_0
    invoke-direct {p0, p5, p6, p7}, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->createRaf(III)V

    .line 110
    monitor-exit p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 113
    :cond_2
    iget-object p4, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->raf:Lcom/daaw/avee/Common/RandomAccessFileTh;

    if-nez p4, :cond_3

    return-void

    .line 117
    :cond_3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p4

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result p5

    sub-int/2addr p4, p5

    .line 119
    iget v4, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferChannelCount:I

    iget p5, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferSampleRate:I

    int-to-long v6, p5

    move-wide v2, p2

    move v5, p7

    invoke-static/range {v2 .. v7}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->durationUsToBytes(JIIJ)I

    move-result p5

    sub-int/2addr p5, p4

    if-gez p5, :cond_4

    .line 122
    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startByte: "

    invoke-virtual {p6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "; TimeUs: "

    invoke-virtual {p6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_4
    if-gez p5, :cond_5

    const/4 p5, 0x0

    .line 127
    :cond_5
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result p2

    .line 128
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p3

    const-wide/32 v2, 0x7a120

    .line 130
    iget v4, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferChannelCount:I

    iget p6, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->bufferSampleRate:I

    int-to-long v6, p6

    move v5, p7

    invoke-static/range {v2 .. v7}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->durationUsToBytes(JIIJ)I

    move-result p6

    .line 132
    iget-object p7, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->locker:Ljava/lang/Object;

    monitor-enter p7

    .line 133
    :try_start_1
    iget-object v2, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->raf:Lcom/daaw/avee/Common/RandomAccessFileTh;

    if-eqz v2, :cond_8

    .line 134
    iget v2, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->rafFillPos:I

    sub-int v2, p5, v2

    int-to-long v2, v2

    .line 135
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v4

    int-to-long v6, p6

    cmp-long p6, v4, v6

    if-gez p6, :cond_6

    .line 136
    iget p5, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->rafFillPos:I

    goto :goto_0

    :cond_6
    cmp-long p6, v2, v0

    if-eqz p6, :cond_7

    .line 139
    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "newDataFillDelta: "

    invoke-virtual {p6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    invoke-static {p6}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_7
    :goto_0
    add-int/2addr p4, p5

    .line 143
    iput p4, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->rafFillPos:I

    .line 144
    iget-object p4, p0, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->raf:Lcom/daaw/avee/Common/RandomAccessFileTh;

    invoke-virtual {p4, p5, p1}, Lcom/daaw/avee/Common/RandomAccessFileTh;->writeData(ILjava/nio/ByteBuffer;)V

    .line 146
    :cond_8
    monitor-exit p7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 149
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void

    :catchall_0
    move-exception p1

    .line 146
    :try_start_2
    monitor-exit p7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 110
    :try_start_3
    monitor-exit p4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method
