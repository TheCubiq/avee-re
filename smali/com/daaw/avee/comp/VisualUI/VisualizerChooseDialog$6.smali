.class Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$6;
.super Ljava/lang/Object;
.source "VisualizerChooseDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->updateVisualizerTemplates(ILjava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

.field final synthetic val$themeslist:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;Ljava/util/List;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$6;->this$0:Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$6;->val$themeslist:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 247
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 252
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$6;->val$themeslist:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 253
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$6;->val$themeslist:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    .line 255
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$6;->this$0:Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

    iget-object v2, v1, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->selectedThumbButton:[Landroid/view/View;

    invoke-static {v1, v2, p1, v0}, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->access$200(Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;[Landroid/view/View;Landroid/view/View;Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;)V

    .line 258
    sget-object p1, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onSkinThemePresetSelected:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
