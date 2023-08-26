.class public final Lcom/google/android/exoplayer2/extractor/ts/H262Reader;
.super Ljava/lang/Object;
.source "H262Reader.java"

# interfaces
.implements Lcom/google/android/exoplayer2/extractor/ts/ElementaryStreamReader;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;
    }
.end annotation


# static fields
.field private static final FRAME_RATE_VALUES:[D

.field private static final START_EXTENSION:I = 0xb5

.field private static final START_GROUP:I = 0xb8

.field private static final START_PICTURE:I = 0x0

.field private static final START_SEQUENCE_HEADER:I = 0xb3


# instance fields
.field private final csdBuffer:Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;

.field private formatId:Ljava/lang/String;

.field private frameDurationUs:J

.field private hasOutputFormat:Z

.field private output:Lcom/google/android/exoplayer2/extractor/TrackOutput;

.field private pesTimeUs:J

.field private final prefixFlags:[Z

.field private sampleHasPicture:Z

.field private sampleIsKeyframe:Z

.field private samplePosition:J

.field private sampleTimeUs:J

.field private startedFirstSample:Z

.field private totalBytesWritten:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [D

    .line 44
    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->FRAME_RATE_VALUES:[D

    return-void

    :array_0
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Z

    .line 67
    iput-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->prefixFlags:[Z

    .line 68
    new-instance v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->csdBuffer:Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;

    return-void
.end method

.method private static parseCsdBuffer(Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;Ljava/lang/String;)Landroid/util/Pair;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Lcom/google/android/exoplayer2/Format;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 174
    iget-object v1, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;->data:[B

    iget v2, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;->length:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    const/4 v2, 0x4

    .line 176
    aget-byte v3, v1, v2

    and-int/lit16 v3, v3, 0xff

    const/4 v4, 0x5

    .line 177
    aget-byte v5, v1, v4

    and-int/lit16 v5, v5, 0xff

    const/4 v6, 0x6

    .line 178
    aget-byte v6, v1, v6

    and-int/lit16 v6, v6, 0xff

    shl-int/2addr v3, v2

    shr-int/lit8 v7, v5, 0x4

    or-int v13, v3, v7

    and-int/lit8 v3, v5, 0xf

    shl-int/lit8 v3, v3, 0x8

    or-int v14, v3, v6

    const/4 v3, 0x7

    .line 183
    aget-byte v5, v1, v3

    and-int/lit16 v5, v5, 0xf0

    shr-int/2addr v5, v2

    const/4 v6, 0x2

    if-eq v5, v6, :cond_2

    const/4 v6, 0x3

    if-eq v5, v6, :cond_1

    if-eq v5, v2, :cond_0

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v18, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_0
    mul-int/lit8 v2, v14, 0x79

    int-to-float v2, v2

    mul-int/lit8 v5, v13, 0x64

    goto :goto_0

    :cond_1
    mul-int/lit8 v2, v14, 0x10

    int-to-float v2, v2

    mul-int/lit8 v5, v13, 0x9

    goto :goto_0

    :cond_2
    mul-int/lit8 v2, v14, 0x4

    int-to-float v2, v2

    mul-int/lit8 v5, v13, 0x3

    :goto_0
    int-to-float v5, v5

    div-float/2addr v2, v5

    move/from16 v18, v2

    :goto_1
    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, -0x1

    const/high16 v15, -0x40800000    # -1.0f

    .line 201
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    const/16 v17, -0x1

    const/16 v19, 0x0

    const-string v9, "video/mpeg2"

    move-object/from16 v8, p1

    .line 199
    invoke-static/range {v8 .. v19}, Lcom/google/android/exoplayer2/Format;->createVideoSampleFormat(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIFLjava/util/List;IFLcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v2

    const-wide/16 v5, 0x0

    .line 204
    aget-byte v3, v1, v3

    and-int/lit8 v3, v3, 0xf

    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_4

    .line 205
    sget-object v7, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->FRAME_RATE_VALUES:[D

    array-length v8, v7

    if-ge v3, v8, :cond_4

    .line 206
    aget-wide v5, v7, v3

    .line 207
    iget v0, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;->sequenceExtensionPosition:I

    add-int/lit8 v0, v0, 0x9

    .line 208
    aget-byte v3, v1, v0

    and-int/lit8 v3, v3, 0x60

    shr-int/2addr v3, v4

    .line 209
    aget-byte v0, v1, v0

    and-int/lit8 v0, v0, 0x1f

    if-eq v3, v0, :cond_3

    int-to-double v3, v3

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 211
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v3, v7

    add-int/lit8 v0, v0, 0x1

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v0

    mul-double v5, v5, v3

    :cond_3
    const-wide v0, 0x412e848000000000L    # 1000000.0

    div-double/2addr v0, v5

    double-to-long v5, v0

    .line 216
    :cond_4
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public consume(Lcom/google/android/exoplayer2/util/ParsableByteArray;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 93
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->getPosition()I

    move-result v2

    .line 94
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->limit()I

    move-result v3

    .line 95
    iget-object v4, v1, Lcom/google/android/exoplayer2/util/ParsableByteArray;->data:[B

    .line 98
    iget-wide v5, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->totalBytesWritten:J

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->bytesLeft()I

    move-result v7

    int-to-long v7, v7

    add-long/2addr v5, v7

    iput-wide v5, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->totalBytesWritten:J

    .line 99
    iget-object v5, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->output:Lcom/google/android/exoplayer2/extractor/TrackOutput;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->bytesLeft()I

    move-result v6

    invoke-interface {v5, v1, v6}, Lcom/google/android/exoplayer2/extractor/TrackOutput;->sampleData(Lcom/google/android/exoplayer2/util/ParsableByteArray;I)V

    .line 102
    :goto_0
    iget-object v5, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->prefixFlags:[Z

    invoke-static {v4, v2, v3, v5}, Lcom/google/android/exoplayer2/util/NalUnitUtil;->findNalUnit([BII[Z)I

    move-result v5

    if-ne v5, v3, :cond_1

    .line 106
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->hasOutputFormat:Z

    if-nez v1, :cond_0

    .line 107
    iget-object v1, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->csdBuffer:Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;

    invoke-virtual {v1, v4, v2, v3}, Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;->onData([BII)V

    :cond_0
    return-void

    .line 113
    :cond_1
    iget-object v6, v1, Lcom/google/android/exoplayer2/util/ParsableByteArray;->data:[B

    add-int/lit8 v7, v5, 0x3

    aget-byte v6, v6, v7

    and-int/lit16 v6, v6, 0xff

    .line 115
    iget-boolean v8, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->hasOutputFormat:Z

    const/4 v10, 0x1

    if-nez v8, :cond_4

    sub-int v8, v5, v2

    if-lez v8, :cond_2

    .line 120
    iget-object v11, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->csdBuffer:Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;

    invoke-virtual {v11, v4, v2, v5}, Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;->onData([BII)V

    :cond_2
    if-gez v8, :cond_3

    neg-int v2, v8

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    .line 125
    :goto_1
    iget-object v8, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->csdBuffer:Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;

    invoke-virtual {v8, v6, v2}, Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;->onStartCode(II)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 127
    iget-object v2, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->csdBuffer:Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;

    iget-object v8, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->formatId:Ljava/lang/String;

    invoke-static {v2, v8}, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->parseCsdBuffer(Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v2

    .line 128
    iget-object v8, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->output:Lcom/google/android/exoplayer2/extractor/TrackOutput;

    iget-object v11, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v11, Lcom/google/android/exoplayer2/Format;

    invoke-interface {v8, v11}, Lcom/google/android/exoplayer2/extractor/TrackOutput;->format(Lcom/google/android/exoplayer2/Format;)V

    .line 129
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    iput-wide v11, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->frameDurationUs:J

    .line 130
    iput-boolean v10, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->hasOutputFormat:Z

    :cond_4
    if-eqz v6, :cond_6

    const/16 v2, 0xb3

    if-ne v6, v2, :cond_5

    goto :goto_2

    :cond_5
    const/16 v2, 0xb8

    if-ne v6, v2, :cond_d

    .line 153
    iput-boolean v10, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->sampleIsKeyframe:Z

    goto :goto_7

    :cond_6
    :goto_2
    sub-int v2, v3, v5

    .line 136
    iget-boolean v5, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->startedFirstSample:Z

    if-eqz v5, :cond_7

    iget-boolean v5, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->sampleHasPicture:Z

    if-eqz v5, :cond_7

    iget-boolean v5, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->hasOutputFormat:Z

    if-eqz v5, :cond_7

    .line 138
    iget-boolean v14, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->sampleIsKeyframe:Z

    .line 139
    iget-wide v11, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->totalBytesWritten:J

    iget-wide v9, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->samplePosition:J

    sub-long/2addr v11, v9

    long-to-int v9, v11

    sub-int v15, v9, v2

    .line 140
    iget-object v11, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->output:Lcom/google/android/exoplayer2/extractor/TrackOutput;

    iget-wide v12, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->sampleTimeUs:J

    const/16 v17, 0x0

    move/from16 v16, v2

    invoke-interface/range {v11 .. v17}, Lcom/google/android/exoplayer2/extractor/TrackOutput;->sampleMetadata(JIIILcom/google/android/exoplayer2/extractor/TrackOutput$CryptoData;)V

    .line 142
    :cond_7
    iget-boolean v9, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->startedFirstSample:Z

    if-eqz v9, :cond_9

    iget-boolean v9, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->sampleHasPicture:Z

    if-eqz v9, :cond_8

    goto :goto_3

    :cond_8
    const/4 v2, 0x0

    const/4 v5, 0x1

    goto :goto_5

    .line 144
    :cond_9
    :goto_3
    iget-wide v9, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->totalBytesWritten:J

    int-to-long v11, v2

    sub-long/2addr v9, v11

    iput-wide v9, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->samplePosition:J

    .line 145
    iget-wide v9, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->pesTimeUs:J

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v9, v11

    if-eqz v2, :cond_a

    goto :goto_4

    :cond_a
    iget-boolean v2, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->startedFirstSample:Z

    if-eqz v2, :cond_b

    iget-wide v9, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->sampleTimeUs:J

    iget-wide v13, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->frameDurationUs:J

    add-long/2addr v9, v13

    goto :goto_4

    :cond_b
    const-wide/16 v9, 0x0

    :goto_4
    iput-wide v9, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->sampleTimeUs:J

    const/4 v2, 0x0

    .line 147
    iput-boolean v2, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->sampleIsKeyframe:Z

    .line 148
    iput-wide v11, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->pesTimeUs:J

    const/4 v5, 0x1

    .line 149
    iput-boolean v5, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->startedFirstSample:Z

    :goto_5
    if-nez v6, :cond_c

    const/4 v9, 0x1

    goto :goto_6

    :cond_c
    const/4 v9, 0x0

    .line 151
    :goto_6
    iput-boolean v9, v0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->sampleHasPicture:Z

    :cond_d
    :goto_7
    move v2, v7

    goto/16 :goto_0
.end method

.method public createTracks(Lcom/google/android/exoplayer2/extractor/ExtractorOutput;Lcom/google/android/exoplayer2/extractor/ts/TsPayloadReader$TrackIdGenerator;)V
    .locals 1

    .line 81
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/extractor/ts/TsPayloadReader$TrackIdGenerator;->generateNewId()V

    .line 82
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/extractor/ts/TsPayloadReader$TrackIdGenerator;->getFormatId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->formatId:Ljava/lang/String;

    .line 83
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/extractor/ts/TsPayloadReader$TrackIdGenerator;->getTrackId()I

    move-result p2

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lcom/google/android/exoplayer2/extractor/ExtractorOutput;->track(II)Lcom/google/android/exoplayer2/extractor/TrackOutput;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->output:Lcom/google/android/exoplayer2/extractor/TrackOutput;

    return-void
.end method

.method public packetFinished()V
    .locals 0

    return-void
.end method

.method public packetStarted(JZ)V
    .locals 0

    .line 88
    iput-wide p1, p0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->pesTimeUs:J

    return-void
.end method

.method public seek()V
    .locals 2

    .line 73
    iget-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->prefixFlags:[Z

    invoke-static {v0}, Lcom/google/android/exoplayer2/util/NalUnitUtil;->clearPrefixFlags([Z)V

    .line 74
    iget-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->csdBuffer:Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/extractor/ts/H262Reader$CsdBuffer;->reset()V

    const-wide/16 v0, 0x0

    .line 75
    iput-wide v0, p0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->totalBytesWritten:J

    const/4 v0, 0x0

    .line 76
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/extractor/ts/H262Reader;->startedFirstSample:Z

    return-void
.end method
