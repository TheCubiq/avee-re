.class Lcom/daaw/avee/Design/VisualizerSharingDesign$2;
.super Ljava/lang/Object;
.source "VisualizerSharingDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerSharingDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;",
        "Ljava/util/List<",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerSharingDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerSharingDesign;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerSharingDesign$2;->this$0:Lcom/daaw/avee/Design/VisualizerSharingDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 200
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerSharingDesign$2;->this$0:Lcom/daaw/avee/Design/VisualizerSharingDesign;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, Lcom/daaw/avee/Design/VisualizerSharingDesign;->currentTemplateIndexes:Ljava/lang/ref/WeakReference;

    .line 202
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 203
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    const-string v0, "android.intent.category.OPENABLE"

    .line 204
    invoke-virtual {p2, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "*/*"

    .line 206
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    .line 208
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 210
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f100194

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p2

    const/16 v0, 0x40

    .line 209
    invoke-virtual {p1, p2, v0}, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 196
    check-cast p1, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerSharingDesign$2;->invoke(Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;Ljava/util/List;)V

    return-void
.end method
