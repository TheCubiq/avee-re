.class public abstract Lcom/google/android/exoplayer2/source/chunk/BaseMediaChunk;
.super Lcom/google/android/exoplayer2/source/chunk/MediaChunk;
.source "BaseMediaChunk.java"


# instance fields
.field private firstSampleIndices:[I

.field private output:Lcom/google/android/exoplayer2/source/chunk/BaseMediaChunkOutput;

.field public final seekTimeUs:J


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSpec;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJJ)V
    .locals 12

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    move-wide/from16 v10, p12

    .line 59
    invoke-direct/range {v0 .. v11}, Lcom/google/android/exoplayer2/source/chunk/MediaChunk;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSpec;Lcom/google/android/exoplayer2/Format;ILjava/lang/Object;JJJ)V

    move-wide/from16 v1, p10

    .line 61
    iput-wide v1, v0, Lcom/google/android/exoplayer2/source/chunk/BaseMediaChunk;->seekTimeUs:J

    return-void
.end method


# virtual methods
.method public final getFirstSampleIndex(I)I
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/chunk/BaseMediaChunk;->firstSampleIndices:[I

    aget p1, v0, p1

    return p1
.end method

.method protected final getOutput()Lcom/google/android/exoplayer2/source/chunk/BaseMediaChunkOutput;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/chunk/BaseMediaChunk;->output:Lcom/google/android/exoplayer2/source/chunk/BaseMediaChunkOutput;

    return-object v0
.end method

.method public init(Lcom/google/android/exoplayer2/source/chunk/BaseMediaChunkOutput;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/chunk/BaseMediaChunk;->output:Lcom/google/android/exoplayer2/source/chunk/BaseMediaChunkOutput;

    .line 72
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/chunk/BaseMediaChunkOutput;->getWriteIndices()[I

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/chunk/BaseMediaChunk;->firstSampleIndices:[I

    return-void
.end method
