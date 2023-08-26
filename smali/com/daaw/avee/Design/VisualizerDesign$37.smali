.class Lcom/daaw/avee/Design/VisualizerDesign$37;
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

    .line 925
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$37;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()V
    .locals 3

    .line 929
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 931
    iget v1, v0, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 932
    iget v1, v0, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/MainActivity;->toggleShowControls(I)V

    :cond_0
    return-void
.end method
