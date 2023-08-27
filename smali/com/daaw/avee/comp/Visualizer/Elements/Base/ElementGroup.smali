.class public abstract Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "ElementGroup.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;",
        "ChildC:",
        "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
        "ThisC::",
        "Lcom/daaw/avee/comp/Visualizer/ICustomization<",
        "TChildC;>;>",
        "Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;"
    }
.end annotation


# instance fields
.field protected childList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x2

    .line 28
    invoke-direct {p0, v1, v0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public abstract CreateFactoryElement(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation
.end method

.method public addChild(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    .line 43
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;

    const-string v1, "addChild"

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v0, p2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 45
    iput-object p0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;

    return-void
.end method

.method public addChildAtBeginning(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 49
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;

    const-string v1, "addChildAtBeginning"

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 51
    iput-object p0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;

    return-void
.end method

.method public addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 55
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;

    const-string v1, "addChildAtEnd"

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    iput-object p0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;

    return-void
.end method

.method public dispose()V
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    .line 36
    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->dispose()V

    goto :goto_0

    .line 39
    :cond_0
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->dispose()V

    return-void
.end method

.method protected earlyUpdateChilds(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    .line 99
    invoke-virtual {v1, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public findElementById(I)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
    .locals 2

    .line 232
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->findElementById(I)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 235
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    .line 236
    invoke-virtual {v1, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->findElementById(I)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method protected getCustomization(Lcom/daaw/avee/comp/Visualizer/ICustomization;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TThisC;",
            "Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 172
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    .line 175
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/ICustomization;->createDataEntry()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 176
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    invoke-virtual {v4, v3, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->getCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ILcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)Z

    move-result v3

    if-nez v3, :cond_1

    return v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public markNeedReCreateGLResources()V
    .locals 2

    .line 85
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResources()V

    .line 86
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    .line 87
    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResources()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 0

    .line 93
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 94
    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->earlyUpdateChilds(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 0

    return-void
.end method

.method public onRenderPreview(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 3

    .line 125
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderPreview(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 127
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    .line 128
    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->shouldRender()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 129
    invoke-virtual {v1, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderPreview(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public removeChild(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 61
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;

    const-string v1, "removeChild"

    invoke-static {v1, p0, v0}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 64
    iput-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;

    return-void
.end method

.method public removeChildAt(I)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    const/4 v0, 0x0

    .line 71
    iput-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->parent:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;

    return-object p1
.end method

.method protected renderChilds(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 3

    .line 113
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    .line 114
    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->shouldRender()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 115
    invoke-virtual {v1, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 116
    invoke-virtual {v1, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderHighlight(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    goto :goto_0

    .line 118
    :cond_0
    invoke-virtual {v1, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderInvisible(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected renderOffscreenContentChilds(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 3

    .line 104
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    .line 105
    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->shouldRender()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 106
    invoke-virtual {v1, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected setCustomization(Lcom/daaw/avee/comp/Visualizer/ICustomization;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TThisC;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 188
    :cond_0
    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/ICustomization;->getEntryCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-ge v0, v1, :cond_4

    .line 193
    invoke-interface {p1, v0}, Lcom/daaw/avee/comp/Visualizer/ICustomization;->getEntry(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    .line 194
    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName()Ljava/lang/String;

    move-result-object v5

    .line 195
    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getVersionId()Ljava/lang/String;

    move-result-object v4

    .line 200
    iget-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lt v2, v6, :cond_1

    .line 202
    invoke-virtual {p0, v0, v5, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->CreateFactoryElement(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 203
    invoke-virtual {p0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 205
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v3

    goto :goto_1

    .line 207
    :cond_1
    iget-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    invoke-static {v6, v5, v4}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->CompareElementReUsability(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 209
    iget-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    invoke-virtual {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->dispose()V

    .line 210
    invoke-virtual {p0, v0, v5, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->CreateFactoryElement(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 212
    iget-object v5, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v5, v2, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 217
    :cond_2
    :goto_1
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    invoke-interface {p1, v0}, Lcom/daaw/avee/comp/Visualizer/ICustomization;->getEntry(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    invoke-virtual {v4, v5, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->setCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;I)Z

    add-int/2addr v2, v3

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 221
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    .line 222
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->childList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;

    .line 223
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->dispose()V

    goto :goto_2

    :cond_5
    return v3
.end method
