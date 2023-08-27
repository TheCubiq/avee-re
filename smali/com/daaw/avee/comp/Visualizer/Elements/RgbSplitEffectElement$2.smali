.class Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$2;
.super Ljava/lang/Object;
.source "RgbSplitEffectElement.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func1<",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;",
        "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$2;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;
    .locals 1

    if-eqz p1, :cond_0

    .line 102
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$2;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getVisualizationData()Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestsAlbumArtPath()Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    move-result-object p1

    iput-object p1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->currentAlbumArtPath:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    .line 104
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$2;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;

    iget-object p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement;->currentAlbumArtPath:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    return-object p1
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 97
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RgbSplitEffectElement$2;->onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    move-result-object p1

    return-object p1
.end method
