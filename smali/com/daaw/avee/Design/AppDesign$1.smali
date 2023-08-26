.class Lcom/daaw/avee/Design/AppDesign$1;
.super Ljava/lang/Object;
.source "AppDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/AppDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR1$Handler<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/playback/AudioFrameData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/AppDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/AppDesign;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/daaw/avee/Design/AppDesign$1;->this$0:Lcom/daaw/avee/Design/AppDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;)Lcom/daaw/avee/comp/playback/AudioFrameData;
    .locals 3

    .line 38
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->isExporting()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 39
    sget-object v0, Lcom/daaw/avee/Design/AppDesign;->onRequestsSoundVisualizationDataExport:Lcom/daaw/avee/Common/Events/WeakEventR2;

    iget-object v2, p0, Lcom/daaw/avee/Design/AppDesign$1;->this$0:Lcom/daaw/avee/Design/AppDesign;

    invoke-static {v2}, Lcom/daaw/avee/Design/AppDesign;->access$000(Lcom/daaw/avee/Design/AppDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object v2

    invoke-virtual {v0, v2, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/AudioFrameData;

    goto :goto_0

    .line 41
    :cond_0
    sget-object v0, Lcom/daaw/avee/Design/AppDesign;->onRequestsSoundVisualizationDataRealTime:Lcom/daaw/avee/Common/Events/WeakEventR2;

    iget-object v2, p0, Lcom/daaw/avee/Design/AppDesign$1;->this$0:Lcom/daaw/avee/Design/AppDesign;

    invoke-static {v2}, Lcom/daaw/avee/Design/AppDesign;->access$000(Lcom/daaw/avee/Design/AppDesign;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object v2

    invoke-virtual {v0, v2, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEventR2;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/playback/AudioFrameData;

    :goto_0
    if-eqz p1, :cond_1

    .line 43
    iget-object v0, p0, Lcom/daaw/avee/Design/AppDesign$1;->this$0:Lcom/daaw/avee/Design/AppDesign;

    invoke-static {v0, p1}, Lcom/daaw/avee/Design/AppDesign;->access$002(Lcom/daaw/avee/Design/AppDesign;Lcom/daaw/avee/comp/playback/AudioFrameData;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    :cond_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 32
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/AppDesign$1;->invoke(Ljava/lang/Integer;)Lcom/daaw/avee/comp/playback/AudioFrameData;

    move-result-object p1

    return-object p1
.end method
