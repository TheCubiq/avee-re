.class Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$7;
.super Ljava/lang/Object;
.source "VisExportDialog.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->updateExportSettings(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;)V
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

    .line 283
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$7;->this$0:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
