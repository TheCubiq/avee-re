.class Lcom/daaw/avee/Design/VisualizerDesign$40;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 1012
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$40;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 3

    .line 1015
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1017
    iget v1, v0, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    .line 1018
    iget v2, v0, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/MainActivity;->showControls(ZI)V

    .line 1021
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$40;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1700(Lcom/daaw/avee/Design/VisualizerDesign;Ljava/lang/Integer;Z)V

    return-void
.end method
