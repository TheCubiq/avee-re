.class Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$3;
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

    .line 147
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$3;->this$0:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 150
    sget-object p1, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->onCancelAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    return-void
.end method
