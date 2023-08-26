.class public Lcom/daaw/avee/comp/PcmProcess/BufferEntry;
.super Ljava/lang/Object;
.source "BufferEntry.java"


# instance fields
.field private buffer:[S

.field public bufferPresentationTimeUs:J

.field public bufferStartTime:J

.field public channelCount:I

.field entryBufferSize:I

.field public sampleRate:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [S

    .line 15
    iput-object v0, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->buffer:[S

    .line 19
    invoke-virtual {p0}, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->setToEmpty()V

    const-wide/16 v0, 0x0

    .line 20
    invoke-virtual {p0, v0, v1}, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->finishInit(J)V

    return-void
.end method


# virtual methods
.method public finishInit(J)V
    .locals 4

    .line 183
    iget-wide v0, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->bufferPresentationTimeUs:J

    iget v2, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->sampleRate:I

    int-to-long v2, v2

    .line 184
    invoke-static {p1, p2, v2, v3}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->framesToDurationUs(JJ)J

    move-result-wide p1

    sub-long/2addr v0, p1

    iput-wide v0, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->bufferStartTime:J

    return-void
.end method

.method public finishInit(Ljava/nio/ByteBuffer;JIIII[[B)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p5

    move/from16 v3, p6

    move/from16 v4, p7

    const/4 v5, 0x0

    .line 132
    aget-object v6, p8, v5

    move-wide/from16 v7, p2

    .line 134
    iput-wide v7, v1, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->bufferPresentationTimeUs:J

    move/from16 v7, p4

    .line 135
    iput v7, v1, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->sampleRate:I

    .line 136
    iput v0, v1, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->channelCount:I

    .line 138
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v7

    .line 139
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v8

    int-to-long v9, v3

    .line 141
    invoke-static {v9, v10, v0, v4}, Lcom/daaw/avee/comp/PcmProcess/UtilsVisualizerDataProvider;->bytesToFrames(JII)J

    move-result-wide v9

    long-to-int v11, v9

    mul-int v11, v11, v0

    .line 142
    iput v11, v1, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->entryBufferSize:I

    .line 143
    iget-object v12, v1, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->buffer:[S

    array-length v13, v12

    const/4 v14, 0x2

    if-lt v13, v11, :cond_0

    array-length v12, v12

    mul-int/lit8 v11, v11, 0x2

    if-le v12, v11, :cond_1

    .line 144
    :cond_0
    iget v11, v1, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->entryBufferSize:I

    new-array v11, v11, [S

    iput-object v11, v1, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->buffer:[S

    .line 147
    :cond_1
    array-length v11, v6

    if-lt v11, v3, :cond_2

    array-length v11, v6

    mul-int/lit8 v12, v3, 0x2

    if-le v11, v12, :cond_3

    .line 148
    :cond_2
    new-array v6, v3, [B

    .line 150
    :cond_3
    invoke-virtual {v2, v6, v5, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 152
    rem-int v0, v3, v0

    if-eqz v0, :cond_4

    const-string v0, "tmpBuffDataLength mismatch"

    .line 153
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 156
    :cond_4
    div-int/lit8 v4, v4, 0x8

    const/4 v0, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v0, v3, :cond_5

    add-int/2addr v0, v4

    add-int/lit8 v12, v0, -0x1

    add-int/lit8 v13, v0, -0x2

    .line 164
    :try_start_0
    iget-object v15, v1, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->buffer:[S

    aget-byte v13, v6, v13

    and-int/lit16 v13, v13, 0xff

    aget-byte v12, v6, v12

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x8

    or-int/2addr v12, v13

    int-to-short v12, v12

    aput-short v12, v15, v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    new-array v3, v14, [Ljava/lang/Object;

    .line 170
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const-string v0, "Oh, well: %d, %s"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "BufferEntry"

    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 173
    :cond_5
    invoke-virtual {v2, v8}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 174
    invoke-virtual {v2, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 176
    invoke-virtual {v1, v9, v10}, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->finishInit(J)V

    .line 178
    aput-object v6, p8, v5

    return-void
.end method

.method public finishInit(Ljava/nio/ByteBuffer;JIII[[B)V
    .locals 11

    .line 127
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    sub-int v8, v0, v1

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move v6, p4

    move/from16 v7, p5

    move/from16 v9, p6

    move-object/from16 v10, p7

    invoke-virtual/range {v2 .. v10}, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->finishInit(Ljava/nio/ByteBuffer;JIIII[[B)V

    return-void
.end method

.method public getBufferData3([SIII[S[F[J)I
    .locals 8

    .line 33
    iget v0, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->channelCount:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_9

    if-ne p2, v3, :cond_4

    move v0, p3

    .line 37
    :goto_0
    iget v1, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->channelCount:I

    mul-int v1, v1, p4

    iget v4, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->entryBufferSize:I

    if-lt v1, v4, :cond_0

    goto/16 :goto_4

    :cond_0
    mul-int v1, v0, p2

    .line 40
    array-length v4, p1

    if-lt v1, v4, :cond_1

    goto/16 :goto_4

    .line 44
    :cond_1
    iget-object v4, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->buffer:[S

    aget-short v4, v4, p4

    aput-short v4, p1, v1

    .line 46
    aget-short v4, p5, v2

    aget-short v5, p1, v1

    if-le v4, v5, :cond_2

    aget-short v4, p1, v1

    aput-short v4, p5, v2

    .line 47
    :cond_2
    aget-short v4, p5, v3

    aget-short v5, p1, v1

    if-ge v4, v5, :cond_3

    aget-short v4, p1, v1

    aput-short v4, p5, v3

    .line 48
    :cond_3
    aget v4, p6, v2

    aget-short v5, p1, v1

    aget-short v1, p1, v1

    mul-int v5, v5, v1

    int-to-float v1, v5

    add-float/2addr v4, v1

    aput v4, p6, v2

    add-int/lit8 p4, p4, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    if-ne p2, v1, :cond_13

    move v0, p3

    .line 55
    :goto_1
    iget v1, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->channelCount:I

    mul-int v1, v1, p4

    iget v4, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->entryBufferSize:I

    if-lt v1, v4, :cond_5

    goto/16 :goto_4

    :cond_5
    mul-int v1, v0, p2

    add-int/lit8 v4, v1, 0x1

    .line 58
    array-length v5, p1

    if-lt v4, v5, :cond_6

    goto/16 :goto_4

    .line 62
    :cond_6
    iget-object v5, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->buffer:[S

    aget-short v6, v5, p4

    aput-short v6, p1, v1

    .line 63
    aget-short v5, v5, p4

    aput-short v5, p1, v4

    .line 65
    aget-short v4, p5, v2

    aget-short v5, p1, v1

    if-le v4, v5, :cond_7

    aget-short v4, p1, v1

    aput-short v4, p5, v2

    .line 66
    :cond_7
    aget-short v4, p5, v3

    aget-short v5, p1, v1

    if-ge v4, v5, :cond_8

    aget-short v4, p1, v1

    aput-short v4, p5, v3

    .line 67
    :cond_8
    aget v4, p6, v2

    aget-short v5, p1, v1

    aget-short v1, p1, v1

    mul-int v5, v5, v1

    int-to-float v1, v5

    add-float/2addr v4, v1

    aput v4, p6, v2

    add-int/lit8 p4, p4, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_9
    if-ne p2, v3, :cond_e

    move v0, p3

    .line 78
    :goto_2
    iget v4, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->channelCount:I

    mul-int v5, p4, v4

    add-int/2addr v5, v3

    iget v6, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->entryBufferSize:I

    if-lt v5, v6, :cond_a

    goto/16 :goto_4

    :cond_a
    mul-int v5, v0, p2

    .line 81
    array-length v6, p1

    if-lt v5, v6, :cond_b

    goto/16 :goto_4

    .line 85
    :cond_b
    iget-object v6, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->buffer:[S

    mul-int v7, p4, v4

    aget-short v7, v6, v7

    mul-int v4, v4, p4

    add-int/2addr v4, v3

    aget-short v4, v6, v4

    add-int/2addr v7, v4

    div-int/2addr v7, v1

    int-to-short v4, v7

    aput-short v4, p1, v5

    .line 88
    aget-short v4, p5, v2

    aget-short v6, p1, v5

    if-le v4, v6, :cond_c

    aget-short v4, p1, v5

    aput-short v4, p5, v2

    .line 89
    :cond_c
    aget-short v4, p5, v3

    aget-short v6, p1, v5

    if-ge v4, v6, :cond_d

    aget-short v4, p1, v5

    aput-short v4, p5, v3

    .line 90
    :cond_d
    aget v4, p6, v2

    aget-short v6, p1, v5

    aget-short v5, p1, v5

    mul-int v6, v6, v5

    int-to-float v5, v6

    add-float/2addr v4, v5

    aput v4, p6, v2

    add-int/lit8 p4, p4, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_e
    if-ne p2, v1, :cond_13

    move v0, p3

    .line 99
    :goto_3
    iget v1, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->channelCount:I

    mul-int v4, p4, v1

    add-int/2addr v4, v3

    iget v5, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->entryBufferSize:I

    if-lt v4, v5, :cond_f

    goto :goto_4

    :cond_f
    mul-int v4, v0, p2

    add-int/lit8 v5, v4, 0x1

    .line 102
    array-length v6, p1

    if-lt v5, v6, :cond_10

    goto :goto_4

    .line 106
    :cond_10
    iget-object v6, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->buffer:[S

    mul-int v7, p4, v1

    aget-short v7, v6, v7

    aput-short v7, p1, v4

    mul-int v1, v1, p4

    add-int/2addr v1, v3

    .line 107
    aget-short v1, v6, v1

    aput-short v1, p1, v5

    .line 109
    aget-short v1, p5, v2

    aget-short v5, p1, v4

    if-le v1, v5, :cond_11

    aget-short v1, p1, v4

    aput-short v1, p5, v2

    .line 110
    :cond_11
    aget-short v1, p5, v3

    aget-short v5, p1, v4

    if-ge v1, v5, :cond_12

    aget-short v1, p1, v4

    aput-short v1, p5, v3

    .line 111
    :cond_12
    aget v1, p6, v2

    aget-short v5, p1, v4

    aget-short v4, p1, v4

    mul-int v5, v5, v4

    int-to-float v4, v5

    add-float/2addr v1, v4

    aput v1, p6, v2

    add-int/lit8 p4, p4, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_13
    move v0, p3

    .line 121
    :goto_4
    iget p1, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->channelCount:I

    mul-int p4, p4, p1

    iget p1, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->entryBufferSize:I

    sub-int/2addr p1, v3

    if-lt p4, p1, :cond_14

    iget-wide p1, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->bufferPresentationTimeUs:J

    goto :goto_5

    :cond_14
    const-wide/16 p1, -0x1

    :goto_5
    aput-wide p1, p7, v2

    sub-int/2addr v0, p3

    return v0
.end method

.method public isEmpty()Z
    .locals 2

    .line 199
    iget v0, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->entryBufferSize:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public setToEmpty()V
    .locals 2

    const/4 v0, 0x1

    .line 190
    iput v0, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->sampleRate:I

    .line 191
    iput v0, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->channelCount:I

    const/4 v0, 0x0

    .line 192
    iput v0, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->entryBufferSize:I

    const-wide/high16 v0, -0x8000000000000000L

    .line 193
    iput-wide v0, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->bufferPresentationTimeUs:J

    .line 194
    iput-wide v0, p0, Lcom/daaw/avee/comp/PcmProcess/BufferEntry;->bufferStartTime:J

    return-void
.end method
