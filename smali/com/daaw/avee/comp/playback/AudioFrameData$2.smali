.class final Lcom/daaw/avee/comp/playback/AudioFrameData$2;
.super Ljava/lang/Object;
.source "AudioFrameData.java"

# interfaces
.implements Lcom/daaw/avee/Common/ISimpleListShort;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/AudioFrameData;->pcmAsMono(II[S)Lcom/daaw/avee/Common/ISimpleListShort;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$lengthInFrames:I

.field final synthetic val$pcmBuffer:[S

.field final synthetic val$pcmBufferChannelCount:I


# direct methods
.method constructor <init>(I[SI)V
    .locals 0

    .line 180
    iput p1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$2;->val$lengthInFrames:I

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$2;->val$pcmBuffer:[S

    iput p3, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$2;->val$pcmBufferChannelCount:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)S
    .locals 3

    .line 188
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$2;->val$pcmBuffer:[S

    iget v1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$2;->val$pcmBufferChannelCount:I

    mul-int v2, p1, v1

    aget-short v2, v0, v2

    mul-int p1, p1, v1

    add-int/lit8 p1, p1, 0x1

    aget-short p1, v0, p1

    add-int/2addr v2, p1

    div-int/lit8 v2, v2, 0x2

    int-to-short p1, v2

    return p1
.end method

.method public size()I
    .locals 1

    .line 183
    iget v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$2;->val$lengthInFrames:I

    return v0
.end method
