.class final Lcom/google/android/exoplayer2/source/dash/EventSampleStream;
.super Ljava/lang/Object;
.source "EventSampleStream.java"

# interfaces
.implements Lcom/google/android/exoplayer2/source/SampleStream;


# instance fields
.field private currentIndex:I

.field private final eventMessageEncoder:Lcom/google/android/exoplayer2/metadata/emsg/EventMessageEncoder;

.field private eventStream:Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;

.field private eventStreamUpdatable:Z

.field private eventTimesUs:[J

.field private isFormatSentDownstream:Z

.field private pendingSeekPositionUs:J

.field private final upstreamFormat:Lcom/google/android/exoplayer2/Format;


# direct methods
.method constructor <init>(Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;Lcom/google/android/exoplayer2/Format;Z)V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->upstreamFormat:Lcom/google/android/exoplayer2/Format;

    .line 48
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventStream:Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;

    .line 49
    new-instance p2, Lcom/google/android/exoplayer2/metadata/emsg/EventMessageEncoder;

    invoke-direct {p2}, Lcom/google/android/exoplayer2/metadata/emsg/EventMessageEncoder;-><init>()V

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventMessageEncoder:Lcom/google/android/exoplayer2/metadata/emsg/EventMessageEncoder;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    iput-wide v0, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->pendingSeekPositionUs:J

    .line 51
    iget-object p2, p1, Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;->presentationTimesUs:[J

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventTimesUs:[J

    .line 52
    invoke-virtual {p0, p1, p3}, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->updateEventStream(Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;Z)V

    return-void
.end method


# virtual methods
.method eventStreamId()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventStream:Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;->id()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isReady()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public maybeThrowError()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method public readData(Lcom/google/android/exoplayer2/FormatHolder;Lcom/google/android/exoplayer2/decoder/DecoderInputBuffer;Z)I
    .locals 6

    const/4 v0, 0x1

    if-nez p3, :cond_4

    .line 85
    iget-boolean p3, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->isFormatSentDownstream:Z

    if-nez p3, :cond_0

    goto :goto_0

    .line 90
    :cond_0
    iget p1, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->currentIndex:I

    iget-object p3, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventTimesUs:[J

    array-length p3, p3

    const/4 v1, -0x4

    const/4 v2, -0x3

    if-ne p1, p3, :cond_2

    .line 91
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventStreamUpdatable:Z

    if-nez p1, :cond_1

    const/4 p1, 0x4

    .line 92
    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/decoder/DecoderInputBuffer;->setFlags(I)V

    return v1

    :cond_1
    return v2

    :cond_2
    add-int/lit8 p3, p1, 0x1

    .line 98
    iput p3, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->currentIndex:I

    .line 99
    iget-object p3, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventMessageEncoder:Lcom/google/android/exoplayer2/metadata/emsg/EventMessageEncoder;

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventStream:Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;

    iget-object v3, v3, Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;->events:[Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;

    aget-object v3, v3, p1

    iget-object v4, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventStream:Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;

    iget-wide v4, v4, Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;->timescale:J

    invoke-virtual {p3, v3, v4, v5}, Lcom/google/android/exoplayer2/metadata/emsg/EventMessageEncoder;->encode(Lcom/google/android/exoplayer2/metadata/emsg/EventMessage;J)[B

    move-result-object p3

    if-eqz p3, :cond_3

    .line 102
    array-length v2, p3

    invoke-virtual {p2, v2}, Lcom/google/android/exoplayer2/decoder/DecoderInputBuffer;->ensureSpaceForWrite(I)V

    .line 103
    invoke-virtual {p2, v0}, Lcom/google/android/exoplayer2/decoder/DecoderInputBuffer;->setFlags(I)V

    .line 104
    iget-object v0, p2, Lcom/google/android/exoplayer2/decoder/DecoderInputBuffer;->data:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 105
    iget-object p3, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventTimesUs:[J

    aget-wide v2, p3, p1

    iput-wide v2, p2, Lcom/google/android/exoplayer2/decoder/DecoderInputBuffer;->timeUs:J

    return v1

    :cond_3
    return v2

    .line 86
    :cond_4
    :goto_0
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->upstreamFormat:Lcom/google/android/exoplayer2/Format;

    iput-object p2, p1, Lcom/google/android/exoplayer2/FormatHolder;->format:Lcom/google/android/exoplayer2/Format;

    .line 87
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->isFormatSentDownstream:Z

    const/4 p1, -0x5

    return p1
.end method

.method public seekToUs(J)V
    .locals 4

    .line 127
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventTimesUs:[J

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, p2, v2, v1}, Lcom/google/android/exoplayer2/util/Util;->binarySearchCeil([JJZZ)I

    move-result v0

    iput v0, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->currentIndex:I

    .line 128
    iget-boolean v3, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventStreamUpdatable:Z

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventTimesUs:[J

    array-length v3, v3

    if-ne v0, v3, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 129
    :goto_0
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->pendingSeekPositionUs:J

    return-void
.end method

.method public skipData(J)I
    .locals 4

    .line 114
    iget v0, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->currentIndex:I

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventTimesUs:[J

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 115
    invoke-static {v1, p1, p2, v2, v3}, Lcom/google/android/exoplayer2/util/Util;->binarySearchCeil([JJZZ)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 116
    iget p2, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->currentIndex:I

    sub-int p2, p1, p2

    .line 117
    iput p1, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->currentIndex:I

    return p2
.end method

.method updateEventStream(Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;Z)V
    .locals 8

    .line 56
    iget v0, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->currentIndex:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    move-wide v4, v1

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventTimesUs:[J

    add-int/lit8 v0, v0, -0x1

    aget-wide v4, v3, v0

    .line 58
    :goto_0
    iput-boolean p2, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventStreamUpdatable:Z

    .line 59
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventStream:Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;

    .line 60
    iget-object p1, p1, Lcom/google/android/exoplayer2/source/dash/manifest/EventStream;->presentationTimesUs:[J

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->eventTimesUs:[J

    .line 61
    iget-wide v6, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->pendingSeekPositionUs:J

    cmp-long p2, v6, v1

    if-eqz p2, :cond_1

    .line 62
    invoke-virtual {p0, v6, v7}, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->seekToUs(J)V

    goto :goto_1

    :cond_1
    cmp-long p2, v4, v1

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    .line 64
    invoke-static {p1, v4, v5, p2, p2}, Lcom/google/android/exoplayer2/util/Util;->binarySearchCeil([JJZZ)I

    move-result p1

    iput p1, p0, Lcom/google/android/exoplayer2/source/dash/EventSampleStream;->currentIndex:I

    :cond_2
    :goto_1
    return-void
.end method
