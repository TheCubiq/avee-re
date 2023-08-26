.class public Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;
.super Ljava/lang/Object;
.source "AudioEncoderCore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EncodeData"
.end annotation


# instance fields
.field public buffer:Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;

.field public length:I

.field public presentationTimeUs:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;->buffer:Lcom/daaw/avee/Common/ShortBufferResourcePool$ShortBufferResource;

    const/4 v0, 0x0

    .line 57
    iput v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;->length:I

    const-wide/16 v0, 0x0

    .line 58
    iput-wide v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/AudioEncoderCore$EncodeData;->presentationTimeUs:J

    return-void
.end method
