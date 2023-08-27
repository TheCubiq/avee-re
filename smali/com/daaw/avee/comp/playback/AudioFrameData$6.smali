.class final Lcom/daaw/avee/comp/playback/AudioFrameData$6;
.super Ljava/lang/Object;
.source "AudioFrameData.java"

# interfaces
.implements Lcom/daaw/avee/Common/ISimpleListShort;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmAsMonoD(II[S)Lcom/daaw/avee/Common/ISimpleListShort;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$lengthInFramesFinal:I

.field final synthetic val$pcmBuffer:[S

.field final synthetic val$pcmBufferChannelCount:I


# direct methods
.method constructor <init>(I[SI)V
    .locals 0

    .line 251
    iput p1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$6;->val$lengthInFramesFinal:I

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$6;->val$pcmBuffer:[S

    iput p3, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$6;->val$pcmBufferChannelCount:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)S
    .locals 4

    mul-int/lit8 p1, p1, 0x2

    .line 260
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$6;->val$pcmBuffer:[S

    iget v1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$6;->val$pcmBufferChannelCount:I

    mul-int v2, p1, v1

    aget-short v2, v0, v2

    mul-int v3, p1, v1

    add-int/lit8 v3, v3, 0x1

    aget-short v3, v0, v3

    add-int/2addr v2, v3

    mul-int v3, p1, v1

    add-int/lit8 v3, v3, 0x2

    aget-short v3, v0, v3

    add-int/2addr v2, v3

    mul-int p1, p1, v1

    add-int/lit8 p1, p1, 0x3

    aget-short p1, v0, p1

    add-int/2addr v2, p1

    div-int/lit8 v2, v2, 0x4

    int-to-short p1, v2

    return p1
.end method

.method public size()I
    .locals 1

    .line 254
    iget v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$6;->val$lengthInFramesFinal:I

    return v0
.end method
