.class public final Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;
.super Ljava/lang/Object;
.source "Ac3Reader.java"

# interfaces
.implements Lcom/google/android/exoplayer2/extractor/ts/ElementaryStreamReader;


# static fields
.field private static final HEADER_SIZE:I = 0x80

.field private static final STATE_FINDING_SYNC:I = 0x0

.field private static final STATE_READING_HEADER:I = 0x1

.field private static final STATE_READING_SAMPLE:I = 0x2


# instance fields
.field private bytesRead:I

.field private format:Lcom/google/android/exoplayer2/Format;

.field private final headerScratchBits:Lcom/google/android/exoplayer2/util/ParsableBitArray;

.field private final headerScratchBytes:Lcom/google/android/exoplayer2/util/ParsableByteArray;

.field private final language:Ljava/lang/String;

.field private lastByteWas0B:Z

.field private output:Lcom/google/android/exoplayer2/extractor/TrackOutput;

.field private sampleDurationUs:J

.field private sampleSize:I

.field private state:I

.field private timeUs:J

.field private trackFormatId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 70
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v0, Lcom/google/android/exoplayer2/util/ParsableBitArray;

    const/16 v1, 0x80

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;-><init>([B)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->headerScratchBits:Lcom/google/android/exoplayer2/util/ParsableBitArray;

    .line 80
    new-instance v1, Lcom/google/android/exoplayer2/util/ParsableByteArray;

    iget-object v0, v0, Lcom/google/android/exoplayer2/util/ParsableBitArray;->data:[B

    invoke-direct {v1, v0}, Lcom/google/android/exoplayer2/util/ParsableByteArray;-><init>([B)V

    iput-object v1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->headerScratchBytes:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    const/4 v0, 0x0

    .line 81
    iput v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->state:I

    .line 82
    iput-object p1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->language:Ljava/lang/String;

    return-void
.end method

.method private continueRead(Lcom/google/android/exoplayer2/util/ParsableByteArray;[BI)Z
    .locals 2

    .line 155
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->bytesLeft()I

    move-result v0

    iget v1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->bytesRead:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 156
    iget v1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->bytesRead:I

    invoke-virtual {p1, p2, v1, v0}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readBytes([BII)V

    .line 157
    iget p1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->bytesRead:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->bytesRead:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private parseHeader()V
    .locals 14

    .line 190
    iget-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->headerScratchBits:Lcom/google/android/exoplayer2/util/ParsableBitArray;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableBitArray;->setPosition(I)V

    .line 191
    iget-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->headerScratchBits:Lcom/google/android/exoplayer2/util/ParsableBitArray;

    invoke-static {v0}, Lcom/google/android/exoplayer2/audio/Ac3Util;->parseAc3SyncframeInfo(Lcom/google/android/exoplayer2/util/ParsableBitArray;)Lcom/google/android/exoplayer2/audio/Ac3Util$SyncFrameInfo;

    move-result-object v0

    .line 192
    iget-object v1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->format:Lcom/google/android/exoplayer2/Format;

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/google/android/exoplayer2/audio/Ac3Util$SyncFrameInfo;->channelCount:I

    iget-object v2, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->format:Lcom/google/android/exoplayer2/Format;

    iget v2, v2, Lcom/google/android/exoplayer2/Format;->channelCount:I

    if-ne v1, v2, :cond_0

    iget v1, v0, Lcom/google/android/exoplayer2/audio/Ac3Util$SyncFrameInfo;->sampleRate:I

    iget-object v2, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->format:Lcom/google/android/exoplayer2/Format;

    iget v2, v2, Lcom/google/android/exoplayer2/Format;->sampleRate:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lcom/google/android/exoplayer2/audio/Ac3Util$SyncFrameInfo;->mimeType:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->format:Lcom/google/android/exoplayer2/Format;

    iget-object v2, v2, Lcom/google/android/exoplayer2/Format;->sampleMimeType:Ljava/lang/String;

    if-eq v1, v2, :cond_1

    .line 195
    :cond_0
    iget-object v3, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->trackFormatId:Ljava/lang/String;

    iget-object v4, v0, Lcom/google/android/exoplayer2/audio/Ac3Util$SyncFrameInfo;->mimeType:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, -0x1

    iget v8, v0, Lcom/google/android/exoplayer2/audio/Ac3Util$SyncFrameInfo;->channelCount:I

    iget v9, v0, Lcom/google/android/exoplayer2/audio/Ac3Util$SyncFrameInfo;->sampleRate:I

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    iget-object v13, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->language:Ljava/lang/String;

    invoke-static/range {v3 .. v13}, Lcom/google/android/exoplayer2/Format;->createAudioSampleFormat(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;Lcom/google/android/exoplayer2/drm/DrmInitData;ILjava/lang/String;)Lcom/google/android/exoplayer2/Format;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->format:Lcom/google/android/exoplayer2/Format;

    .line 198
    iget-object v2, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->output:Lcom/google/android/exoplayer2/extractor/TrackOutput;

    invoke-interface {v2, v1}, Lcom/google/android/exoplayer2/extractor/TrackOutput;->format(Lcom/google/android/exoplayer2/Format;)V

    .line 200
    :cond_1
    iget v1, v0, Lcom/google/android/exoplayer2/audio/Ac3Util$SyncFrameInfo;->frameSize:I

    iput v1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->sampleSize:I

    const-wide/32 v1, 0xf4240

    .line 203
    iget v0, v0, Lcom/google/android/exoplayer2/audio/Ac3Util$SyncFrameInfo;->sampleCount:I

    int-to-long v3, v0

    mul-long v3, v3, v1

    iget-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->format:Lcom/google/android/exoplayer2/Format;

    iget v0, v0, Lcom/google/android/exoplayer2/Format;->sampleRate:I

    int-to-long v0, v0

    div-long/2addr v3, v0

    iput-wide v3, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->sampleDurationUs:J

    return-void
.end method

.method private skipToNextSync(Lcom/google/android/exoplayer2/util/ParsableByteArray;)Z
    .locals 5

    .line 169
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->bytesLeft()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_4

    .line 170
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->lastByteWas0B:Z

    const/16 v2, 0xb

    const/4 v3, 0x1

    if-nez v0, :cond_1

    .line 171
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v0

    if-ne v0, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->lastByteWas0B:Z

    goto :goto_0

    .line 174
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->readUnsignedByte()I

    move-result v0

    const/16 v4, 0x77

    if-ne v0, v4, :cond_2

    .line 176
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->lastByteWas0B:Z

    return v3

    :cond_2
    if-ne v0, v2, :cond_3

    const/4 v1, 0x1

    .line 179
    :cond_3
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->lastByteWas0B:Z

    goto :goto_0

    :cond_4
    return v1
.end method


# virtual methods
.method public consume(Lcom/google/android/exoplayer2/util/ParsableByteArray;)V
    .locals 10

    .line 106
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->bytesLeft()I

    move-result v0

    if-lez v0, :cond_4

    .line 107
    iget v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->state:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    goto :goto_0

    .line 125
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->bytesLeft()I

    move-result v0

    iget v2, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->sampleSize:I

    iget v3, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->bytesRead:I

    sub-int/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 126
    iget-object v2, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->output:Lcom/google/android/exoplayer2/extractor/TrackOutput;

    invoke-interface {v2, p1, v0}, Lcom/google/android/exoplayer2/extractor/TrackOutput;->sampleData(Lcom/google/android/exoplayer2/util/ParsableByteArray;I)V

    .line 127
    iget v2, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->bytesRead:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->bytesRead:I

    .line 128
    iget v7, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->sampleSize:I

    if-ne v2, v7, :cond_0

    .line 129
    iget-object v3, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->output:Lcom/google/android/exoplayer2/extractor/TrackOutput;

    iget-wide v4, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->timeUs:J

    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Lcom/google/android/exoplayer2/extractor/TrackOutput;->sampleMetadata(JIIILcom/google/android/exoplayer2/extractor/TrackOutput$CryptoData;)V

    .line 130
    iget-wide v2, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->timeUs:J

    iget-wide v4, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->sampleDurationUs:J

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->timeUs:J

    .line 131
    iput v1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->state:I

    goto :goto_0

    .line 117
    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->headerScratchBytes:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    iget-object v0, v0, Lcom/google/android/exoplayer2/util/ParsableByteArray;->data:[B

    const/16 v3, 0x80

    invoke-direct {p0, p1, v0, v3}, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->continueRead(Lcom/google/android/exoplayer2/util/ParsableByteArray;[BI)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    invoke-direct {p0}, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->parseHeader()V

    .line 119
    iget-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->headerScratchBytes:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/util/ParsableByteArray;->setPosition(I)V

    .line 120
    iget-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->output:Lcom/google/android/exoplayer2/extractor/TrackOutput;

    iget-object v1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->headerScratchBytes:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    invoke-interface {v0, v1, v3}, Lcom/google/android/exoplayer2/extractor/TrackOutput;->sampleData(Lcom/google/android/exoplayer2/util/ParsableByteArray;I)V

    .line 121
    iput v2, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->state:I

    goto :goto_0

    .line 109
    :cond_3
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->skipToNextSync(Lcom/google/android/exoplayer2/util/ParsableByteArray;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    iput v3, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->state:I

    .line 111
    iget-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->headerScratchBytes:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    iget-object v0, v0, Lcom/google/android/exoplayer2/util/ParsableByteArray;->data:[B

    const/16 v4, 0xb

    aput-byte v4, v0, v1

    .line 112
    iget-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->headerScratchBytes:Lcom/google/android/exoplayer2/util/ParsableByteArray;

    iget-object v0, v0, Lcom/google/android/exoplayer2/util/ParsableByteArray;->data:[B

    const/16 v1, 0x77

    aput-byte v1, v0, v3

    .line 113
    iput v2, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->bytesRead:I

    goto :goto_0

    :cond_4
    return-void
.end method

.method public createTracks(Lcom/google/android/exoplayer2/extractor/ExtractorOutput;Lcom/google/android/exoplayer2/extractor/ts/TsPayloadReader$TrackIdGenerator;)V
    .locals 1

    .line 94
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/extractor/ts/TsPayloadReader$TrackIdGenerator;->generateNewId()V

    .line 95
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/extractor/ts/TsPayloadReader$TrackIdGenerator;->getFormatId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->trackFormatId:Ljava/lang/String;

    .line 96
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/extractor/ts/TsPayloadReader$TrackIdGenerator;->getTrackId()I

    move-result p2

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lcom/google/android/exoplayer2/extractor/ExtractorOutput;->track(II)Lcom/google/android/exoplayer2/extractor/TrackOutput;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->output:Lcom/google/android/exoplayer2/extractor/TrackOutput;

    return-void
.end method

.method public packetFinished()V
    .locals 0

    return-void
.end method

.method public packetStarted(JZ)V
    .locals 0

    .line 101
    iput-wide p1, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->timeUs:J

    return-void
.end method

.method public seek()V
    .locals 1

    const/4 v0, 0x0

    .line 87
    iput v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->state:I

    .line 88
    iput v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->bytesRead:I

    .line 89
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/extractor/ts/Ac3Reader;->lastByteWas0B:Z

    return-void
.end method
