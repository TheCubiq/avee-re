.class Lcom/daaw/avee/Design/VisualizerExporterDesign$16;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerExporterDesign;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/Design/PlaybackDesign;Lcom/daaw/avee/Design/MainUIDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V
    .locals 0

    .line 638
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$16;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;
    .locals 2

    .line 642
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1100()Z

    move-result v0

    if-nez v0, :cond_0

    .line 643
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$16;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1402(Lcom/daaw/avee/Design/VisualizerExporterDesign;Z)Z

    .line 645
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$16;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->destroyEncoder(Lcom/daaw/avee/Common/StatusMsg;)V

    return-object v1

    .line 648
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$16;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 638
    invoke-virtual {p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$16;->invoke()Lcom/daaw/avee/comp/Visualizer/FrameCaptureDesc;

    move-result-object v0

    return-object v0
.end method
