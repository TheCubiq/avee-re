.class public Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "DummyElement.java"


# static fields
.field public static final internalImages:[Ljava/lang/String;

.field public static final mirrorModes:[Ljava/lang/String;

.field public static final typeName:Ljava/lang/String; = "DummyElement"


# instance fields
.field private color2:I

.field private flipMirror:Z

.field private mirrorMode:I

.field private shaderOnBindAction:Lcom/daaw/avee/Common/Action3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Action3<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ">;"
        }
    .end annotation
.end field

.field targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

.field public final vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "composition:0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 32
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->internalImages:[Ljava/lang/String;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "Horizontal"

    aput-object v2, v1, v3

    const-string v2, "Vertical"

    aput-object v2, v1, v0

    const/4 v0, 0x2

    const-string v2, "HorizontalAndVertical"

    aput-object v2, v1, v0

    .line 36
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->mirrorModes:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x4

    const/high16 v1, 0x3f800000    # 1.0f

    .line 55
    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    const/4 v2, -0x1

    .line 43
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->color2:I

    const/4 v2, 0x0

    .line 48
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->mirrorMode:I

    .line 49
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->flipMirror:Z

    .line 51
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    .line 184
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$2;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;)V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 56
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setBlendMode(I)V

    .line 57
    invoke-virtual {p0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setScale(FF)V

    .line 59
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const-string v0, "composition:1"

    .line 66
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setTargetImage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;)V
    .locals 0

    .line 28
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method


# virtual methods
.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "DummyElement"

    return-object v0
.end method

.method public getFlipMirror()Z
    .locals 1

    .line 108
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->flipMirror:Z

    return v0
.end method

.method public getMirrorMode()I
    .locals 1

    .line 98
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->mirrorMode:I

    return v0
.end method

.method public getTargetImage()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    .line 151
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResources()V

    .line 152
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 3

    .line 113
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 114
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "TargetImage"

    const-string v1, "composition:1"

    .line 117
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setTargetImage(Ljava/lang/String;)V

    .line 120
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->mirrorModes:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const-string v2, "mirrorMode"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertySelectString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 121
    sget-object v2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->mirrorModes:[Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/daaw/avee/Common/Utils;->StringToIndex([Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setMirrorMode(I)V

    const-string v0, "flipMirror"

    .line 122
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setFlipMirror(Z)V

    const-string v0, "color"

    const/4 v1, -0x1

    .line 124
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setColor2(I)V

    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 3

    .line 165
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->measureDrawRectMaxScaleValues(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v0

    .line 166
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;I)Z

    .line 167
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    move-result p1

    return p1
.end method

.method protected onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)Z

    .line 173
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V

    return-void
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    .line 157
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 159
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    :cond_0
    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 1

    .line 178
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 180
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 4

    .line 130
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    .line 131
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "Dummy Element"

    .line 133
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->getTargetImage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;->PutDependencyResourceName(Ljava/lang/String;)V

    .line 137
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->getTargetImage()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->internalImages:[Ljava/lang/String;

    const-string v1, "1_appearance"

    const-string v2, "TargetImage"

    invoke-virtual {p1, v2, p2, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 140
    sget-object p2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->mirrorModes:[Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->getMirrorMode()I

    move-result v0

    sget-object v2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->mirrorModes:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-static {p2, v0, v2}, Lcom/daaw/avee/Common/Utils;->IndexToString([Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 141
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->mirrorModes:[Ljava/lang/String;

    const-string v2, "mirrorMode"

    invoke-virtual {p1, v2, p2, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putSelectString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 142
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->getFlipMirror()Z

    move-result p2

    const-string v0, "flipMirror"

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 144
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->color2:I

    const-string v0, "color"

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 24

    move-object/from16 v6, p0

    move-object/from16 v15, p1

    .line 194
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    move-object/from16 v1, p2

    invoke-virtual {v0, v15, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 199
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 204
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v14

    .line 205
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->measureDrawRot(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v5

    .line 206
    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->createRotationAndVpMat(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;FFF)V

    .line 215
    iget-object v4, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferVPMat()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v4

    .line 218
    iget-object v5, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v5, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v5

    .line 221
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->getBlendMode()I

    move-result v7

    iget-object v8, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v13, v7, v5, v4, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    # instead of drawRectangle0123 we use drawFullscreenQuad

    # gathering the arguments: 

    iget v8, v14, Landroid/graphics/RectF;->left:F

    iget v9, v14, Landroid/graphics/RectF;->top:F

    # iget v10, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->color2:I

    const/4 v10, -0x1 # white

    move-object/from16 v7, p1

    # renderPassData already in v13

    move-object v11, v13

    # drawFullscreenQuad(float left, float top, int color, Vec2f from, Vec2f to, RenderPassData renderPassData)

    invoke-virtual/range {v7 .. v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V












    return-void
.end method

.method public setColor2(I)V
    .locals 0

    .line 90
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->color2:I

    return-void
.end method

.method public setFlipMirror(Z)V
    .locals 0

    .line 104
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->flipMirror:Z

    return-void
.end method

.method public setMirrorMode(I)V
    .locals 0

    .line 94
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->mirrorMode:I

    return-void
.end method

.method public setTargetImage(Ljava/lang/String;)V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    return-void
.end method
