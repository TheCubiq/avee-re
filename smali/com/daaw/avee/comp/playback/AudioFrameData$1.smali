.class final Lcom/daaw/avee/comp/playback/AudioFrameData$1;
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
.field final synthetic val$lengthInFramesFinal:I

.field final synthetic val$pcmBuffer:[S


# direct methods
.method constructor <init>(I[S)V
    .locals 0

    .line 167
    iput p1, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$1;->val$lengthInFramesFinal:I

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$1;->val$pcmBuffer:[S

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)S
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$1;->val$pcmBuffer:[S

    aget-short p1, v0, p1

    return p1
.end method

.method public size()I
    .locals 1

    .line 170
    iget v0, p0, Lcom/daaw/avee/comp/playback/AudioFrameData$1;->val$lengthInFramesFinal:I

    return v0
.end method
