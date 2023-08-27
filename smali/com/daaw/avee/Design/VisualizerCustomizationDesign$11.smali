.class Lcom/daaw/avee/Design/VisualizerCustomizationDesign$11;
.super Ljava/lang/Object;
.source "VisualizerCustomizationDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->updateChangesToVisDialogGlTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Action1<",
        "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;

.field final synthetic val$calledCompositionIndex:I

.field final synthetic val$calledFromAddElement:Z


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;ZI)V
    .locals 0

    .line 212
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$11;->this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;

    iput-boolean p2, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$11;->val$calledFromAddElement:Z

    iput p3, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$11;->val$calledCompositionIndex:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 2

    .line 216
    iget-boolean v0, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$11;->val$calledFromAddElement:Z

    iget v1, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$11;->val$calledCompositionIndex:I

    invoke-static {p1, v0, v1}, Lcom/daaw/avee/Design/VisualizerDesign;->updateChangesToVisDialogGlTh(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V

    return-void
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;)V
    .locals 0

    .line 212
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$11;->onInvoke(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    return-void
.end method
