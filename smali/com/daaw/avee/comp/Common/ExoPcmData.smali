.class public Lcom/daaw/avee/comp/Common/ExoPcmData;
.super Ljava/lang/Object;
.source "ExoPcmData.java"


# instance fields
.field public bitDepth:I

.field public buffer:Ljava/nio/ByteBuffer;

.field public bufferIndex:I

.field public bufferPresentationTimeUs:J

.field public channelCount:I

.field public enabled:Z

.field public positionUs:J

.field public sampleRate:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Common/ExoPcmData;->enabled:Z

    const/16 v0, 0x10

    .line 16
    iput v0, p0, Lcom/daaw/avee/comp/Common/ExoPcmData;->bitDepth:I

    return-void
.end method
