.class Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$8;
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

.field final synthetic val$exportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

.field final synthetic val$videoCodecProfileNames:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;[Ljava/lang/String;)V
    .locals 0

    .line 307
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$8;->this$0:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$8;->val$exportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$8;->val$videoCodecProfileNames:[Ljava/lang/String;

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

    add-int/lit8 p3, p3, -0x1

    if-ltz p3, :cond_0

    .line 313
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$8;->val$exportSettings:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->getProfile(I)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    move-result-object p1

    .line 314
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$8;->this$0:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;

    iget-object p3, p0, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$8;->val$videoCodecProfileNames:[Ljava/lang/String;

    invoke-static {p2, p1, p3}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->access$500(Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;[Ljava/lang/String;)V

    :cond_0
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
