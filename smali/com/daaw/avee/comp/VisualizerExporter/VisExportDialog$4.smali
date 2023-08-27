.class Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$4;
.super Ljava/lang/Object;
.source "VisExportDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$4;->this$0:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 158
    sget-object v0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onDestDirAction:Lcom/daaw/avee/Common/Events/WeakEvent3;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$4;->this$0:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;

    new-instance v2, Lcom/daaw/avee/ContextData;

    invoke-direct {v2, p1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/view/View;)V

    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$4;->this$0:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->access$100(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;)Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
