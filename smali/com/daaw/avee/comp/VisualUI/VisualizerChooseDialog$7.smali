.class Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$7;
.super Ljava/lang/Object;
.source "VisualizerChooseDialog.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->updateVisualizerTemplates(ILjava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/VAsyncTask$ResultListener<",
        "Ljava/util/List<",
        "Landroid/graphics/Bitmap;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

.field final synthetic val$thumbButtons:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;Ljava/util/List;)V
    .locals 0

    .line 306
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$7;->this$0:Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$7;->val$thumbButtons:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Ljava/lang/Object;Z)V
    .locals 0

    .line 306
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$7;->onResult(Ljava/util/List;Z)V

    return-void
.end method

.method public onResult(Ljava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;Z)V"
        }
    .end annotation

    .line 310
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$7;->val$thumbButtons:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    .line 313
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$7;->val$thumbButtons:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setImageBitmap(Landroid/graphics/Bitmap;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
