.class Lcom/daaw/avee/Design/VisualizerExporterDesign$6;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Landroid/app/Fragment;",
        "Lcom/daaw/avee/ContextData;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$6;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/app/Fragment;Lcom/daaw/avee/ContextData;Ljava/lang/String;)V
    .locals 1

    const-string p1, "visExportDestDir"

    const v0, 0x7f100198

    .line 234
    invoke-static {p2, p1, v0, p3}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->createAndShowDialog(Lcom/daaw/avee/ContextData;Ljava/lang/String;ILjava/lang/String;)Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 230
    check-cast p1, Landroid/app/Fragment;

    check-cast p2, Lcom/daaw/avee/ContextData;

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerExporterDesign$6;->invoke(Landroid/app/Fragment;Lcom/daaw/avee/ContextData;Ljava/lang/String;)V

    return-void
.end method
