.class Lcom/daaw/avee/Design/VisualizerExporterDesign$5;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerExporterDesign;-><init>(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/Design/PlaybackDesign;Lcom/daaw/avee/Design/MainUIDesign;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V
    .locals 0

    .line 223
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$5;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 3

    .line 226
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$5;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    new-instance v1, Lcom/daaw/avee/Common/StatusMsg;

    invoke-direct {v1}, Lcom/daaw/avee/Common/StatusMsg;-><init>()V

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$300(Lcom/daaw/avee/Design/VisualizerExporterDesign;ZLcom/daaw/avee/Common/StatusMsg;Z)V

    return-void
.end method
