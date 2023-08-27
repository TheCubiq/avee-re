.class Lcom/daaw/avee/Design/VisualizerExporterDesign$4;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent4$Handler<",
        "Landroid/app/Fragment;",
        "Lcom/daaw/avee/ContextData;",
        "Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$4;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/app/Fragment;Lcom/daaw/avee/ContextData;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;Ljava/lang/Boolean;)V
    .locals 11

    .line 205
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$4;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->access$200(Lcom/daaw/avee/Design/VisualizerExporterDesign;)J

    move-result-wide v9

    .line 207
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentExportSettings:I

    invoke-virtual {p3}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->serialize()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setString(ILjava/lang/String;)V

    .line 208
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_String_currentExportSettingsProfile:I

    iget-object v2, p3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->profileActive:Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettingsProfile;->serialize()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setString(ILjava/lang/String;)V

    .line 210
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-nez p4, :cond_0

    .line 211
    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$4;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    iget p4, p3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->startMSec:I

    int-to-long v5, p4

    iget p4, p3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;->endMSec:I

    int-to-long v7, p4

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->startExportCreateFile(Landroid/app/Fragment;Lcom/daaw/avee/ContextData;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;JJJ)V

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x7530

    cmp-long p4, v9, v0

    if-gez p4, :cond_1

    .line 215
    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$4;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x3a98

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->startExportCreateFile(Landroid/app/Fragment;Lcom/daaw/avee/ContextData;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;JJJ)V

    goto :goto_0

    .line 217
    :cond_1
    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$4;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    const-wide/16 v2, 0x5

    div-long v5, v9, v2

    const-wide/16 v2, 0x3a98

    add-long v7, v5, v2

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v1 .. v10}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->startExportCreateFile(Landroid/app/Fragment;Lcom/daaw/avee/ContextData;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;JJJ)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 202
    check-cast p1, Landroid/app/Fragment;

    check-cast p2, Lcom/daaw/avee/ContextData;

    check-cast p3, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/VisualizerExporterDesign$4;->invoke(Landroid/app/Fragment;Lcom/daaw/avee/ContextData;Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportSettings;Ljava/lang/Boolean;)V

    return-void
.end method
