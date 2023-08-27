.class Lcom/daaw/avee/Design/VisualizerDesign$5$1;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign$5;->invoke(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/Design/VisualizerDesign$5;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign$5;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$5$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 174
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment2Instance()Lcom/daaw/avee/comp/VisualUI/Fragment2;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 176
    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerDesign$5$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$5;

    iget-object v1, v1, Lcom/daaw/avee/Design/VisualizerDesign$5;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign$5$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$5;

    iget-object v2, v2, Lcom/daaw/avee/Design/VisualizerDesign$5;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {v2}, Lcom/daaw/avee/Design/VisualizerDesign;->access$300(Lcom/daaw/avee/Design/VisualizerDesign;)F

    move-result v2

    invoke-static {v1, v2}, Lcom/daaw/avee/Design/VisualizerDesign;->access$400(Lcom/daaw/avee/Design/VisualizerDesign;F)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->setVideoSizeTh(F)V

    :cond_0
    return-void
.end method
