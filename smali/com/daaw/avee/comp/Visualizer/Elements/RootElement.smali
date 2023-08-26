.class public Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;
.source "RootElement.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup<",
        "Lcom/daaw/avee/comp/Visualizer/Elements/Composition;",
        "Lcom/daaw/avee/comp/Visualizer/CustomComposition;",
        "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
        ">;"
    }
.end annotation


# static fields
.field public static final typeName:Ljava/lang/String; = "Root"


# instance fields
.field private basedOnTemplate:I

.field private captureToImageBuffer:Z

.field private compareIdentifier:I

.field private frameCounter:I

.field private fxaaContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

.field private offscreenImageBuffer:[I

.field private offscreenImageHeight:I

.field private offscreenImageWidth:I

.field private offscreenRenderingEnabled:Z

.field private offscreenTargetContent:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

.field private showOffscreenContent:Z

.field private versionId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2

    .line 49
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;-><init>()V

    const-string v0, "10"

    .line 37
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->versionId:Ljava/lang/String;

    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenRenderingEnabled:Z

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    .line 40
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenTargetContent:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    const/4 v1, 0x0

    .line 41
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->fxaaContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    .line 42
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->showOffscreenContent:Z

    .line 45
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenImageWidth:I

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenImageHeight:I

    .line 47
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->frameCounter:I

    .line 50
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->versionId:Ljava/lang/String;

    .line 51
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->compareIdentifier:I

    .line 52
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->basedOnTemplate:I

    return-void
.end method

.method private renderCompositionIndex(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;I)V
    .locals 4

    .line 276
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->childList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p3, v0, :cond_0

    return-void

    .line 278
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->childList:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    .line 279
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->shouldRender()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    .line 280
    :cond_1
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->markRenderedForThisFrame()V

    .line 282
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->getCompositionDependencies()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    .line 283
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 285
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {p0, p1, p2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->renderCompositionIndex(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 290
    :cond_2
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 291
    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 292
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->getCompositionFrameBuffer()Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setCompositionResult(ILcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)V

    return-void
.end method

.method private setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 3

    const/16 v0, 0x2601

    const/16 v1, 0xde1

    const/16 v2, 0x2801

    .line 369
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    .line 370
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/4 v0, 0x1

    .line 371
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setTextureWrapping(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic CreateFactoryElement(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
    .locals 0

    .line 31
    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->CreateFactoryElement(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    move-result-object p1

    return-object p1
.end method

.method public CreateFactoryElement(ILjava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/Composition;
    .locals 2

    const-string v0, "Composition"

    .line 410
    invoke-static {v0, p2}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    sget-object p2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->DEFAULT_VERSION:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p2, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    :goto_1
    invoke-static {p2}, Ljunit/framework/Assert;->assertTrue(Z)V

    .line 412
    new-instance p2, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    if-nez p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    invoke-direct {p2, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>(Z)V

    return-object p2
.end method

.method public bridge synthetic addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V
    .locals 0

    .line 31
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    return-void
.end method

.method public addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->childList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->isFinalComposition()Z

    move-result v0

    invoke-static {v0}, Ljunit/framework/Assert;->assertTrue(Z)V

    .line 78
    :cond_0
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    return-void
.end method

.method public addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->childList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljunit/framework/Assert;->assertTrue(Z)V

    .line 83
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->childList:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    return-void
.end method

.method createFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;
    .locals 4

    .line 123
    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getSafeRenderBufferSizeTextureDim()Lcom/daaw/avee/Common/Vec2i;

    move-result-object p1

    .line 124
    iget v0, p1, Lcom/daaw/avee/Common/Vec2i;->x:I

    iget p1, p1, Lcom/daaw/avee/Common/Vec2i;->y:I

    const/16 v1, 0x2601

    const/16 v2, 0x2901

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->createSafe(IIIIZ)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 126
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->checkIfValid()Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 128
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-object p2
.end method

.method destroyFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;
    .locals 0

    if-eqz p1, :cond_0

    .line 136
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->dispose()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 204
    instance-of v0, p1, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 205
    :cond_0
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    .line 206
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->compareIdentifier:I

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->compareIdentifier:I

    if-ne v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public getBasedOnTemplate()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->basedOnTemplate:I

    return v0
.end method

.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "Root"

    return-object v0
.end method

.method public getOffscreenImageBuffer()[I
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenImageBuffer:[I

    return-object v0
.end method

.method public getOffscreenImageHeight()I
    .locals 1

    .line 116
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenImageHeight:I

    return v0
.end method

.method public getOffscreenImageWidth()I
    .locals 1

    .line 111
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenImageWidth:I

    return v0
.end method

.method public getVersionId()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->versionId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 199
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->compareIdentifier:I

    mul-int/lit8 v0, v0, 0x2d

    add-int/lit8 v0, v0, 0x2f

    return v0
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 3

    .line 222
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenRenderingEnabled:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 224
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenTargetContent:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    array-length v2, v0

    if-ge v1, v2, :cond_0

    .line 225
    aget-object v2, v0, v1

    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->destroyFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 226
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenTargetContent:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    aget-object v2, v0, v1

    invoke-virtual {p0, p1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->createFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 228
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->fxaaContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->destroyFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->fxaaContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    goto :goto_2

    .line 248
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenTargetContent:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    array-length v2, v0

    if-ge v1, v2, :cond_2

    .line 249
    aget-object v2, v0, v1

    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->destroyFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 251
    :cond_2
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->fxaaContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->destroyFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->fxaaContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    .line 257
    :goto_2
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    move-result p1

    return p1
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 2

    .line 211
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    const/4 p1, 0x0

    .line 213
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenTargetContent:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 214
    aget-object v1, v0, p1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->destroyFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v1

    aput-object v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 216
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->fxaaContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->destroyFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->fxaaContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 3

    .line 305
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 309
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenTargetContent:[Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->frameCounter:I

    array-length v2, v0

    rem-int v2, v1, v2

    aget-object v2, v0, v2

    if-nez v2, :cond_0

    .line 310
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 311
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->renderChilds(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    return-void

    .line 315
    :cond_0
    array-length v2, v0

    rem-int/2addr v1, v2

    aget-object v0, v0, v1

    invoke-virtual {p0, p1, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->renderToFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 317
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->frameCounter:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->frameCounter:I

    return-void
.end method

.method public onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    .line 299
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onRenderOffscreenContent(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method public readThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 0

    .line 361
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->getCustomization(Lcom/daaw/avee/comp/Visualizer/ICustomization;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 362
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->getVersionId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->setVersionId(Ljava/lang/String;)V

    .line 363
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->getBasedOnTemplate()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->setBasedOnTemplate(I)V

    const-string p2, "Root"

    .line 364
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->setTypeId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected renderChilds(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 1

    const/4 v0, 0x0

    .line 271
    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->renderCompositionIndex(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;I)V

    return-void
.end method

.method renderToFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 5

    .line 144
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    .line 145
    invoke-static {v1, v1, v1, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v1, 0x4100

    .line 146
    invoke-static {v1}, Landroid/opengl/GLES20;->glClear(I)V

    .line 148
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 149
    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->renderChilds(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 151
    iget-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->captureToImageBuffer:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    new-array v1, v1, [[I

    .line 152
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenImageBuffer:[I

    aput-object v3, v1, v2

    .line 156
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 158
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getWidth()I

    move-result v3

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getHeight()I

    move-result v4

    invoke-static {v2, v2, v3, v4, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->getFrameBufferPixelsRGB(IIII[[I)[I

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenImageBuffer:[I

    .line 159
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenImageWidth:I

    .line 160
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getHeight()I

    move-result v1

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenImageHeight:I

    .line 168
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->fxaaContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    const/4 v3, -0x1

    if-eqz v1, :cond_2

    .line 171
    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindFrameBuffer(Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 172
    invoke-virtual {p1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setBlendMode(I)V

    .line 175
    iget-object p3, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFxaaShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->bindShaderForceFlush(Lmdesl/graphics/glutils/ShaderProgram;)V

    .line 176
    iget-object p3, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFxaaShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p3

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v1

    invoke-virtual {v1}, Lmdesl/graphics/Texture;->getWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float v1, v1, v0

    const-string v4, "resolutionW"

    invoke-virtual {p3, v4, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 177
    iget-object p3, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFxaaShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object p3

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v1

    invoke-virtual {v1}, Lmdesl/graphics/Texture;->getHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float v1, v1, v0

    const-string v0, "resolutionH"

    invoke-virtual {p3, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->setUniformf(Ljava/lang/String;F)V

    .line 178
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object p3

    invoke-virtual {p3}, Lmdesl/graphics/Texture;->bind()V

    .line 179
    iget-object p3, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFullQuad()Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    move-result-object p3

    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getFxaaShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v0

    const-string v1, "Position"

    invoke-virtual {p3, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;->drawShader(Lmdesl/graphics/glutils/ShaderProgram;Ljava/lang/String;)V

    .line 181
    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->fxaaContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-super {p0, p1, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 182
    iget-boolean p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->showOffscreenContent:Z

    if-eqz p3, :cond_1

    new-instance p3, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object p2

    invoke-direct {p3, p2, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->getBlendMode()I

    move-result p2

    invoke-virtual {p1, v3, p3, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    .line 184
    :cond_1
    invoke-static {}, Landroid/opengl/GLES20;->glFinish()V

    .line 185
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->fxaaContent:Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->onOffScreenContentRendered(Lmdesl/graphics/Texture;)V

    goto :goto_0

    .line 188
    :cond_2
    invoke-super {p0, p1, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementGroup;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 189
    iget-boolean p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->showOffscreenContent:Z

    if-eqz p3, :cond_3

    new-instance p3, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v0

    invoke-direct {p3, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->getBlendMode()I

    move-result v0

    invoke-virtual {p1, v3, p3, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V

    .line 191
    :cond_3
    invoke-static {}, Landroid/opengl/GLES20;->glFinish()V

    .line 192
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->onOffScreenContentRendered(Lmdesl/graphics/Texture;)V

    :goto_0
    return-void
.end method

.method public setOffscreenRenderingEnabled(ZZ[I)V
    .locals 0

    .line 91
    iput-boolean p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->captureToImageBuffer:Z

    if-eqz p2, :cond_0

    .line 93
    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenImageBuffer:[I

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 95
    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenImageBuffer:[I

    .line 98
    :goto_0
    iget-boolean p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenRenderingEnabled:Z

    if-ne p2, p1, :cond_1

    return-void

    .line 99
    :cond_1
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->offscreenRenderingEnabled:Z

    .line 101
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->markNeedReCreateGLResources()V

    return-void
.end method

.method public setThemeCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 356
    :cond_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->getBasedOnTemplate()I

    move-result v0

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->basedOnTemplate:I

    .line 357
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->setCustomization(Lcom/daaw/avee/comp/Visualizer/ICustomization;)Z

    return-void
.end method
