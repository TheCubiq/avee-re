.class Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$2;
.super Ljava/lang/Object;
.source "VisualizerChooseDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$2;->this$0:Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 157
    sget-object p1, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onRemoveVisTemplateAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$2;->this$0:Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->access$000(Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;)Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method
