.class Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$6;
.super Ljava/lang/Object;
.source "VisExportDialog.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V
    .locals 0

    .line 235
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$6;->this$0:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)V
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$6;->this$0:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->access$300(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 235
    check-cast p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$6;->invoke(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;)V

    return-void
.end method
