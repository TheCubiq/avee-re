.class final Lcom/daaw/avee/comp/playback/AudioFrameData$5;
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


# direct methods
.method constructor <init>(I[S)V
    .locals 0

    .line 235
    iput p1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$5;->val$lengthInFramesFinal:I

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$5;->val$pcmBuffer:[S

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)S
    .locals 2

    .line 243
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$5;->val$pcmBuffer:[S

    mul-int/lit8 p1, p1, 0x2

    aget-short v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    aget-short p1, v0, p1

    add-int/2addr v1, p1

    div-int/lit8 v1, v1, 0x2

    int-to-short p1, v1

    return p1
.end method

.method public size()I
    .locals 1

    .line 238
    iget v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$5;->val$lengthInFramesFinal:I

    return v0
.end method
