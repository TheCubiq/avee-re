.class public abstract Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "ImageBaseElement.java"


# instance fields
.field currentAlbumArtPath:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

.field protected elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

.field private generatedAlbumArtHintForceGen:Z

.field private generatedAlbumArtHintNoText:Z

.field private generatedAlbumArtHintShiftHue:Z

.field protected measureAnimationSpeed:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;


# direct methods
.method public constructor <init>()V
    .locals 5

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    .line 53
    invoke-direct {p0, v1, v0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    const/4 v2, 0x0

    .line 45
    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->currentAlbumArtPath:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    .line 46
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/high16 v3, 0x3f000000    # 0.5f

    const-string v4, "TotalTimeAndBeat"

    invoke-direct {v2, v4, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->measureAnimationSpeed:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    .line 48
    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->generatedAlbumArtHintShiftHue:Z

    .line 49
    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->generatedAlbumArtHintNoText:Z

    .line 50
    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->generatedAlbumArtHintForceGen:Z

    .line 54
    invoke-virtual {p0, v0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->setScale(FF)V

    return-void
.end method


# virtual methods
.method public getKeepAspectRatioAndCropToFit()Z
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getKeepAspectRatioAndCropToFit()Z

    move-result v0

    return v0
.end method

.method public initialize(Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Func/Func2<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/avee/Common/Func/Func2<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .line 60
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;)V

    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement$2;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;)V

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    return-void
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    .line 235
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResources()V

    .line 236
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method protected abstract onAlbumArtCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/AlbumArt/ImageResult;Lcom/daaw/avee/Common/Ref;I)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/AlbumArt/ImageResult;",
            "Lcom/daaw/avee/Common/Ref<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "[",
            "Lmdesl/graphics/ITexture;",
            "Ljava/lang/Object;",
            ">;>;I)Z"
        }
    .end annotation
.end method

.method protected abstract onAlbumArtRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 5

    .line 151
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 152
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "customImage"

    const/4 v1, 0x0

    .line 153
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->setCustomImage(Ljava/lang/String;)V

    const/4 v0, 0x0

    const-string v1, "generatedAlbumArtHint"

    .line 155
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v1

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v4, "generatedAlbumArtHintShiftHue"

    .line 157
    invoke-virtual {p1, v4, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->generatedAlbumArtHintShiftHue:Z

    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    const-string v4, "generatedAlbumArtHintNoText"

    .line 158
    invoke-virtual {p1, v4, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->generatedAlbumArtHintNoText:Z

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    const-string v4, "generatedAlbumArtHintForceGen"

    .line 159
    invoke-virtual {p1, v4, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->generatedAlbumArtHintForceGen:Z

    .line 160
    iget-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->generatedAlbumArtHintShiftHue:Z

    iget-boolean v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->generatedAlbumArtHintNoText:Z

    if-eqz v4, :cond_3

    const/4 v4, 0x2

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    or-int/2addr v1, v4

    iget-boolean v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->generatedAlbumArtHintForceGen:Z

    if-eqz v4, :cond_4

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    or-int/2addr v1, v2

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->setAlbumArtGenerateHint(I)V

    const/4 v1, -0x1

    const-string v2, "generatedAlbumArtColor"

    .line 166
    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->setGeneratedAlbumArtColor(I)V

    const-string v1, "keepAspectRatioAndCropToFit"

    .line 167
    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->setKeepAspectRatioAndCropToFit(Z)V

    .line 169
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const-string v2, "colorKeyEnabled"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setColorKeyEnabled(Z)V

    .line 170
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const-string v1, "autoDetectColorKey"

    invoke-virtual {p1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setColorAutoDetect(Z)V

    .line 171
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const v1, -0xff0100

    const-string v2, "colorKey"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setColorKeyColorKey(I)V

    .line 172
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/high16 v1, 0x3f800000    # 1.0f

    const-string v2, "transparencyStrength"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v2

    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setColorKeyTransparencyStrength(F)V

    .line 173
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const-string v2, "opacityStrength"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setColorKeyOpacityStrength(F)V

    const-string v0, "measureAnimationSpeed"

    .line 176
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getChild(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    .line 177
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->measureAnimationSpeed:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/high16 v1, 0x3f000000    # 0.5f

    const-string v2, "TotalTimeAndBeat"

    invoke-virtual {v0, p1, v2, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FF)V

    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 3

    .line 248
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    .line 249
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v0

    .line 250
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;I)Z

    return v2
.end method

.method protected onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)Z

    return-void
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    .line 241
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 243
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    :cond_0
    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 1

    .line 316
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 317
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 8

    .line 183
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    .line 184
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 186
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;->PutDependencyResourceName(Ljava/lang/String;)V

    .line 187
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->internalImages:[Ljava/lang/String;

    const-string v1, "1_image"

    const-string v2, "customImage"

    invoke-virtual {p1, v2, p2, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/4 p2, 0x0

    new-array v0, p2, [Ljava/lang/String;

    const-string v2, "measureAnimationSpeed"

    const-string v3, ""

    .line 190
    invoke-virtual {p1, v2, v3, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putEmptyChild(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    .line 191
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->measureAnimationSpeed:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v2, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->onReadCustomization1D(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 194
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getAlbumArtGenerateHint()I

    move-result v4

    const-string v3, "generatedAlbumArtHint"

    const-string v5, "generatedAlbumArt"

    const/4 v6, 0x0

    const/4 v7, 0x7

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsRangeHidden(Ljava/lang/String;ILjava/lang/String;II)V

    .line 195
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getAlbumArtGenerateHint()I

    move-result v0

    const/4 v2, 0x1

    and-int/2addr v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v3, "generatedAlbumArt"

    const-string v4, "generatedAlbumArtHintShiftHue"

    invoke-virtual {p1, v4, v0, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 196
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getAlbumArtGenerateHint()I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const-string v4, "generatedAlbumArtHintNoText"

    invoke-virtual {p1, v4, v0, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 197
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getAlbumArtGenerateHint()I

    move-result v0

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    const/4 p2, 0x1

    :cond_2
    const-string v0, "generatedAlbumArtHintForceGen"

    invoke-virtual {p1, v0, p2, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 199
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getGeneratedAlbumArtColor()I

    move-result p2

    const-string v0, "generatedAlbumArtColor"

    invoke-virtual {p1, v0, p2, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    .line 200
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getKeepAspectRatioAndCropToFit()Z

    move-result p2

    const-string v0, "keepAspectRatioAndCropToFit"

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 202
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getColorKeyEnabled()Z

    move-result p2

    const-string v0, "2_ColorKey"

    const-string v1, "colorKeyEnabled"

    invoke-virtual {p1, v1, p2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 203
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getColorKeyParams()Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    move-result-object p2

    iget-boolean p2, p2, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->autoDetect:Z

    const-string v1, "autoDetectColorKey"

    invoke-virtual {p1, v1, p2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 204
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getColorKeyParams()Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    move-result-object p2

    iget p2, p2, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->colorKey:I

    const-string v1, "colorKey"

    invoke-virtual {p1, v1, p2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGB_HL(Ljava/lang/String;ILjava/lang/String;)V

    .line 205
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getColorKeyParams()Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    move-result-object p2

    iget v2, p2, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->transparencyStrength:F

    const/4 v4, 0x0

    const/high16 v5, 0x40800000    # 4.0f

    const-string v1, "transparencyStrength"

    const-string v3, "2_ColorKey"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    .line 206
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getColorKeyParams()Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    move-result-object p2

    iget v2, p2, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->opacityStrength:F

    const-string v1, "opacityStrength"

    const-string v3, "2_ColorKey"

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatAsRange(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 1

    .line 322
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 324
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 326
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->onAlbumArtRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method public setAlbumArtGenerateHint(I)V
    .locals 3

    .line 96
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setAlbumArtGenerateHint(I)V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 98
    :goto_0
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->generatedAlbumArtHintShiftHue:Z

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 99
    :goto_1
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->generatedAlbumArtHintNoText:Z

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    .line 100
    :cond_2
    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->generatedAlbumArtHintForceGen:Z

    return-void
.end method

.method public setCustomImage(Ljava/lang/String;)V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    return-void
.end method

.method public setGeneratedAlbumArtColor(I)V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setGeneratedAlbumArtColor(I)V

    return-void
.end method

.method public setKeepAspectRatioAndCropToFit(Z)V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->elementImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setKeepAspectRatioAndCropToFit(Z)V

    return-void
.end method

.method public setMeasureAnimationSpeed(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ImageBaseElement;->measureAnimationSpeed:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    return-void
.end method
