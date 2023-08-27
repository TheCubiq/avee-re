.class Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;
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

.field final synthetic val$statText:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign$17;Ljava/lang/String;)V
    .locals 0

    .line 744
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iput-object p2, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;->val$statText:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 747
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v0

    if-nez v0, :cond_0

    .line 748
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    new-instance v1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    invoke-direct {v1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;-><init>()V

    invoke-static {v0, v1}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2702(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    .line 749
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->active:Z

    .line 750
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v0

    iput-boolean v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->isLoadingResources:Z

    .line 751
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v0

    iput v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->progressMax:I

    .line 752
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->progressValue:I

    .line 753
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;->val$statText:Ljava/lang/String;

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;->statText:Ljava/lang/String;

    .line 754
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17$1;->this$1:Lcom/daaw/avee/Design/VisualizerExporterDesign$17;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerExporterDesign$17;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$2700(Lcom/daaw/avee/Design/VisualizerExporterDesign;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->updateExportingProgressStatus(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)V

    return-void
.end method
