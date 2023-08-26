.class Lcom/daaw/avee/Design/PcmDesign$1;
.super Ljava/lang/Object;
.source "PcmDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PcmDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Lcom/daaw/avee/comp/Common/ExoPcmData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PcmDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PcmDesign;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/daaw/avee/Design/PcmDesign$1;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/Common/ExoPcmData;)V
    .locals 9

    .line 33
    iget-object v0, p0, Lcom/daaw/avee/Design/PcmDesign$1;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    invoke-static {v0, p1}, Lcom/daaw/avee/Design/PcmDesign;->access$002(Lcom/daaw/avee/Design/PcmDesign;Lcom/daaw/avee/comp/Common/ExoPcmData;)Lcom/daaw/avee/comp/Common/ExoPcmData;

    .line 35
    iget-boolean v0, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->enabled:Z

    if-nez v0, :cond_0

    return-void

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/PcmDesign$1;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/PcmDesign;->access$100(Lcom/daaw/avee/Design/PcmDesign;)Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 41
    iget-object v2, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->buffer:Ljava/nio/ByteBuffer;

    iget-wide v3, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->bufferPresentationTimeUs:J

    iget v5, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->bufferIndex:I

    iget v6, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->sampleRate:I

    iget v7, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->channelCount:I

    iget v8, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->bitDepth:I

    invoke-virtual/range {v1 .. v8}, Lcom/daaw/avee/comp/PcmProcess/ExoVisualizerDataProvider;->onPcmData(Ljava/nio/ByteBuffer;JIIII)V

    .line 44
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/Design/PcmDesign$1;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/PcmDesign;->access$200(Lcom/daaw/avee/Design/PcmDesign;)Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 46
    iget-object v2, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->buffer:Ljava/nio/ByteBuffer;

    iget-wide v3, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->bufferPresentationTimeUs:J

    iget v5, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->bufferIndex:I

    iget v6, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->sampleRate:I

    iget v7, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->channelCount:I

    iget v8, p1, Lcom/daaw/avee/comp/Common/ExoPcmData;->bitDepth:I

    invoke-virtual/range {v1 .. v8}, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->onPcmData(Ljava/nio/ByteBuffer;JIIII)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 30
    check-cast p1, Lcom/daaw/avee/comp/Common/ExoPcmData;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/PcmDesign$1;->invoke(Lcom/daaw/avee/comp/Common/ExoPcmData;)V

    return-void
.end method
