.class Lcom/daaw/avee/Design/VisualizerDesign$15$1;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$TaskListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign$15;->invoke(Ljava/util/List;)Lcom/daaw/avee/Common/VAsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/VAsyncTask$TaskListener<",
        "Ljava/util/List<",
        "Landroid/graphics/Bitmap;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/Design/VisualizerDesign$15;

.field final synthetic val$list:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign$15;Ljava/util/List;)V
    .locals 0

    .line 558
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$15;

    iput-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->val$list:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Ljava/lang/Object;
    .locals 0

    .line 558
    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;>;)",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 562
    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->val$list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x1

    new-array v1, v0, [I

    .line 567
    new-instance v2, Ljava/util/HashMap;

    iget-object v3, p0, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->val$list:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V

    .line 569
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerThemes;->s()Lcom/daaw/avee/Design/VisualizerThemes;

    move-result-object v3

    const/4 v4, 0x0

    const-string v5, ""

    invoke-virtual {v3, v4, v4, v5}, Lcom/daaw/avee/Design/VisualizerThemes;->getThemeObjectForLoading2(IZLjava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v3

    const/4 v5, 0x0

    .line 571
    :goto_0
    iget-object v6, p0, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->val$list:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_4

    .line 574
    iget-object v6, p0, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->val$list:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    iget v9, v6, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->id:I

    .line 575
    invoke-static {v9, v1}, Lcom/daaw/avee/Design/VisualizerDesign;->getPrefThemeCustomizationDataOrTemplateData(I[I)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object v11

    .line 579
    iget-object v6, p0, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$15;

    iget-object v6, v6, Lcom/daaw/avee/Design/VisualizerDesign$15;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    iget-object v6, v6, Lcom/daaw/avee/Design/VisualizerDesign;->cachedPreviewThumbs:Ljava/util/HashMap;

    aget v7, v1, v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Bitmap;

    if-eqz v6, :cond_0

    .line 581
    aget v7, v1, v4

    if-nez v7, :cond_3

    .line 583
    :cond_0
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/16 v7, 0xc0

    invoke-static {v7, v7, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v12

    .line 585
    iget-object v6, p0, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$15;

    iget-object v6, v6, Lcom/daaw/avee/Design/VisualizerDesign$15;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    const/4 v7, 0x0

    const/4 v10, 0x1

    move-object v8, v3

    invoke-static/range {v6 .. v11}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1400(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;IZLcom/daaw/avee/comp/Visualizer/CustomScene;)V

    if-eqz v3, :cond_2

    .line 588
    iget-object v6, p0, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$15;

    iget-object v6, v6, Lcom/daaw/avee/Design/VisualizerDesign$15;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    iget-object v6, v6, Lcom/daaw/avee/Design/VisualizerDesign;->renderStatePreview:Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;

    invoke-virtual {v6}, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;->onFrameStart()V

    .line 589
    iget-object v6, p0, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$15;

    iget-object v6, v6, Lcom/daaw/avee/Design/VisualizerDesign$15;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    iget-object v6, v6, Lcom/daaw/avee/Design/VisualizerDesign;->renderStatePreview:Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;

    invoke-virtual {v6, v12}, Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;->setDestBitmap(Landroid/graphics/Bitmap;)V

    const/4 v6, 0x0

    :goto_1
    const/4 v7, 0x0

    if-ge v6, v0, :cond_1

    .line 592
    iget-object v8, p0, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$15;

    iget-object v8, v8, Lcom/daaw/avee/Design/VisualizerDesign$15;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    iget-object v8, v8, Lcom/daaw/avee/Design/VisualizerDesign;->renderStatePreview:Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;

    invoke-virtual {v3, v8, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 594
    :cond_1
    iget-object v6, p0, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$15;

    iget-object v6, v6, Lcom/daaw/avee/Design/VisualizerDesign$15;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    iget-object v6, v6, Lcom/daaw/avee/Design/VisualizerDesign;->renderStatePreview:Lcom/daaw/avee/comp/Visualizer/GraphicPreview/RenderStatePreview;

    invoke-virtual {v3, v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->onRenderPreview(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    :cond_2
    move-object v6, v12

    .line 598
    :cond_3
    aget v7, v1, v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    invoke-interface {p1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 603
    :cond_4
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerDesign$15$1;->this$1:Lcom/daaw/avee/Design/VisualizerDesign$15;

    iget-object v0, v0, Lcom/daaw/avee/Design/VisualizerDesign$15;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    iput-object v2, v0, Lcom/daaw/avee/Design/VisualizerDesign;->cachedPreviewThumbs:Ljava/util/HashMap;

    return-object p1
.end method
