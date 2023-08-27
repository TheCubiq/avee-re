.class Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->invoke(Lmdesl/graphics/Texture;Ljava/lang/Boolean;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign$17;)V
    .locals 0

    .line 829
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 832
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v0

    if-nez v0, :cond_0

    .line 833
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    new-instance v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    invoke-direct {v1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;-><init>()V

    invoke-static {v0, v1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2702(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    .line 834
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v0

    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1100()Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->active:Z

    .line 835
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->isLoadingResources:Z

    .line 836
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v2, v2, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1800(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v3, v3, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1600(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->progressMax:I

    .line 837
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v2, v2, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v2}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1500(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result v2

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v3, v3, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$1600(Lcom/daaw/avee/Design/VisualizerExporterDesign;)I

    move-result v3

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v3, v3, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v3}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v3

    iget v3, v3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->progressMax:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->progressValue:I

    .line 838
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$3;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->updateExportingProgressStatus(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)V

    return-void
.end method
