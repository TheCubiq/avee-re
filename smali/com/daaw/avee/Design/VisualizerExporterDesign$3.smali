.class Lcom/daaw/avee/Design/VisualizerExporterDesign$3;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Lcom/daaw/avee/ContextData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$3;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;)V
    .locals 2

    .line 186
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_1

    .line 188
    invoke-virtual {p1}, Lcom/daaw/avee/ContextData;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 190
    :cond_0
    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;->createAndShowVisExportDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;

    goto :goto_0

    .line 192
    :cond_1
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 194
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f10009b

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 195
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 182
    check-cast p1, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign$3;->invoke(Lcom/daaw/avee/ContextData;)V

    return-void
.end method
