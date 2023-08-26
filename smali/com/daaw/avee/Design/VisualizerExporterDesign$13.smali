.class Lcom/daaw/avee/Design/VisualizerExporterDesign$13;
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
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V
    .locals 0

    .line 497
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$13;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Integer;
    .locals 1

    .line 500
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1100()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    .line 501
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 503
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$13;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 497
    invoke-virtual {p0}, Lcom/daaw/avee/Design/VisualizerExporterDesign$13;->invoke()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
