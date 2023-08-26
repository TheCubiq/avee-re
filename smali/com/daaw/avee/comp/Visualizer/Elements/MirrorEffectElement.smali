.class public Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "MirrorEffectElement.java"


# static fields
.field public static final internalImages:[Ljava/lang/String;

.field public static final mirrorModes:[Ljava/lang/String;

.field public static final typeName:Ljava/lang/String; = "MirrorEffect"


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
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->internalImages:[Ljava/lang/String;

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
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->mirrorModes:[Ljava/lang/String;

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
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->color2:I

    const/4 v2, 0x0

    .line 48
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->mirrorMode:I

    .line 49
    iput-boolean v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->flipMirror:Z

    .line 51
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    .line 184
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement$2;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;)V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 56
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->setBlendMode(I)V

    .line 57
    invoke-virtual {p0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->setScale(FF)V

    .line 59
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const-string v0, "composition:1"

    .line 66
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->setTargetImage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;)V
    .locals 0

    .line 28
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method


# virtual methods
.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "MirrorEffect"

    return-object v0
.end method

.method public getFlipMirror()Z
    .locals 1

    .line 108
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->flipMirror:Z

    return v0
.end method

.method public getMirrorMode()I
    .locals 1

    .line 98
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->mirrorMode:I

    return v0
.end method

.method public getTargetImage()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    .line 151
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResources()V

    .line 152
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

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

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->setTargetImage(Ljava/lang/String;)V

    .line 120
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->mirrorModes:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const-string v2, "mirrorMode"

    invoke-virtual {p1, v2, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertySelectString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 121
    sget-object v2, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->mirrorModes:[Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/daaw/avee/Common/Utils;->StringToIndex([Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->setMirrorMode(I)V

    const-string v0, "flipMirror"

    .line 122
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyBool(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->setFlipMirror(Z)V

    const-string v0, "color"

    const/4 v1, -0x1

    .line 124
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->setColor2(I)V

    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 3

    .line 165
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->measureDrawRectMaxScaleValues(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v0

    .line 166
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

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
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

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
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

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
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 4

    .line 130
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    .line 131
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "Mirror Effect"

    .line 133
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->getTargetImage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;->PutDependencyResourceName(Ljava/lang/String;)V

    .line 137
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->getTargetImage()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->internalImages:[Ljava/lang/String;

    const-string v1, "1_appearance"

    const-string v2, "TargetImage"

    invoke-virtual {p1, v2, p2, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 140
    sget-object p2, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->mirrorModes:[Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->getMirrorMode()I

    move-result v0

    sget-object v2, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->mirrorModes:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-static {p2, v0, v2}, Lcom/daaw/avee/Common/Utils;->IndexToString([Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 141
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->mirrorModes:[Ljava/lang/String;

    const-string v2, "mirrorMode"

    invoke-virtual {p1, v2, p2, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putSelectString(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 142
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->getFlipMirror()Z

    move-result p2

    const-string v0, "flipMirror"

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyBool(Ljava/lang/String;ZLjava/lang/String;)V

    .line 144
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->color2:I

    const-string v0, "color"

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyIntAsCRGBA(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 24

    move-object/from16 v6, p0

    move-object/from16 v15, p1

    .line 194
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    move-object/from16 v1, p2

    invoke-virtual {v0, v15, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 199
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 204
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v14

    .line 205
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->measureDrawRot(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v5

    .line 206
    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->createRotationAndVpMat(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;FFF)V

    .line 212
    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 213
    new-instance v2, Lcom/daaw/avee/Common/Vec2f;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v2, v3, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 215
    iget-object v4, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBufferVPMat()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v4

    .line 218
    iget-object v5, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v5, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v5

    .line 221
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->getBlendMode()I

    move-result v7

    iget-object v8, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v13, v7, v5, v4, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 223
    iget v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->mirrorMode:I

    const/high16 v5, 0x3f000000    # 0.5f

    if-nez v4, :cond_2

    .line 228
    invoke-virtual {v14}, Landroid/graphics/RectF;->centerX()F

    move-result v4

    .line 230
    iget-boolean v7, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->flipMirror:Z

    if-eqz v7, :cond_0

    .line 231
    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 232
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 233
    iput v5, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 234
    iput v1, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    goto :goto_0

    .line 236
    :cond_0
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 237
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 238
    iput v5, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 239
    iput v1, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 242
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v7

    iget v9, v14, Landroid/graphics/RectF;->left:F

    iget v10, v14, Landroid/graphics/RectF;->top:F

    iget v12, v14, Landroid/graphics/RectF;->top:F

    iget v11, v14, Landroid/graphics/RectF;->bottom:F

    iget v8, v14, Landroid/graphics/RectF;->left:F

    iget v1, v14, Landroid/graphics/RectF;->bottom:F

    const/16 v17, 0x0

    iget v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->color2:I

    move/from16 v16, v8

    move-object/from16 v8, p1

    move/from16 v18, v11

    move v11, v4

    move-object/from16 v22, v13

    move v13, v4

    move-object/from16 v23, v14

    move/from16 v14, v18

    move/from16 v15, v16

    move/from16 v16, v1

    move/from16 v18, v3

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    invoke-virtual/range {v7 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle0123(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    .line 252
    iget-boolean v1, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->flipMirror:Z

    if-eqz v1, :cond_1

    .line 253
    iput v5, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 254
    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v3, 0x0

    .line 255
    iput v3, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 256
    iput v3, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    goto :goto_1

    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    .line 258
    iput v5, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 259
    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 260
    iput v1, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 261
    iput v3, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 264
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v7

    move-object/from16 v1, v23

    iget v10, v1, Landroid/graphics/RectF;->top:F

    iget v11, v1, Landroid/graphics/RectF;->right:F

    iget v12, v1, Landroid/graphics/RectF;->top:F

    iget v13, v1, Landroid/graphics/RectF;->right:F

    iget v14, v1, Landroid/graphics/RectF;->bottom:F

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    const/16 v17, 0x0

    iget v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->color2:I

    move-object/from16 v8, p1

    move v9, v4

    move v15, v4

    move/from16 v16, v1

    move/from16 v18, v3

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    invoke-virtual/range {v7 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle0123(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    goto/16 :goto_8

    :cond_2
    move-object/from16 v22, v13

    move-object v1, v14

    const/4 v3, 0x1

    if-ne v4, v3, :cond_5

    .line 280
    iget-boolean v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->flipMirror:Z

    if-eqz v3, :cond_3

    const/4 v3, 0x0

    .line 281
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 282
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/high16 v4, 0x3f800000    # 1.0f

    .line 283
    iput v4, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 284
    iput v5, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    .line 286
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 287
    iput v4, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 288
    iput v4, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 289
    iput v5, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 293
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v7

    iget v9, v1, Landroid/graphics/RectF;->left:F

    iget v10, v1, Landroid/graphics/RectF;->top:F

    iget v11, v1, Landroid/graphics/RectF;->right:F

    iget v12, v1, Landroid/graphics/RectF;->top:F

    iget v13, v1, Landroid/graphics/RectF;->right:F

    .line 297
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v14

    iget v15, v1, Landroid/graphics/RectF;->left:F

    .line 298
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v16

    const/16 v17, 0x0

    iget v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->color2:I

    move-object/from16 v8, p1

    move/from16 v18, v3

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    .line 293
    invoke-virtual/range {v7 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle0123(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    .line 304
    iget-boolean v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->flipMirror:Z

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    .line 305
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 306
    iput v5, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/high16 v4, 0x3f800000    # 1.0f

    .line 307
    iput v4, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 308
    iput v3, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    .line 310
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 311
    iput v5, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 312
    iput v4, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 313
    iput v4, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 316
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v7

    iget v9, v1, Landroid/graphics/RectF;->left:F

    .line 318
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v10

    iget v11, v1, Landroid/graphics/RectF;->right:F

    .line 319
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v12

    iget v13, v1, Landroid/graphics/RectF;->right:F

    iget v14, v1, Landroid/graphics/RectF;->bottom:F

    iget v15, v1, Landroid/graphics/RectF;->left:F

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    const/16 v17, 0x0

    iget v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->color2:I

    move-object/from16 v8, p1

    move/from16 v16, v1

    move/from16 v18, v3

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    .line 316
    invoke-virtual/range {v7 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle0123(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    goto/16 :goto_8

    :cond_5
    const/4 v3, 0x2

    if-ne v4, v3, :cond_a

    .line 329
    iget-boolean v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->flipMirror:Z

    if-eqz v3, :cond_6

    const/4 v3, 0x0

    .line 330
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/high16 v3, 0x3f800000    # 1.0f

    .line 331
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 332
    iput v5, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 333
    iput v5, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    goto :goto_4

    :cond_6
    const/high16 v3, 0x3f800000    # 1.0f

    .line 335
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 336
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 337
    iput v5, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 338
    iput v5, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 341
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v7

    iget v9, v1, Landroid/graphics/RectF;->left:F

    iget v10, v1, Landroid/graphics/RectF;->top:F

    .line 344
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v11

    iget v12, v1, Landroid/graphics/RectF;->top:F

    .line 345
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v13

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v14

    iget v15, v1, Landroid/graphics/RectF;->left:F

    .line 346
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v16

    const/16 v17, 0x0

    iget v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->color2:I

    move-object/from16 v8, p1

    move/from16 v18, v3

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    .line 341
    invoke-virtual/range {v7 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle0123(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    .line 352
    iget-boolean v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->flipMirror:Z

    if-eqz v3, :cond_7

    .line 353
    iput v5, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/high16 v3, 0x3f800000    # 1.0f

    .line 354
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v4, 0x0

    .line 355
    iput v4, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 356
    iput v5, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    goto :goto_5

    :cond_7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 358
    iput v5, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 359
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 360
    iput v3, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 361
    iput v5, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 364
    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v7

    .line 366
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v9

    iget v10, v1, Landroid/graphics/RectF;->top:F

    iget v11, v1, Landroid/graphics/RectF;->right:F

    iget v12, v1, Landroid/graphics/RectF;->top:F

    iget v13, v1, Landroid/graphics/RectF;->right:F

    .line 368
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v14

    .line 369
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v15

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v16

    const/16 v17, 0x0

    iget v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->color2:I

    move-object/from16 v8, p1

    move/from16 v18, v3

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    .line 364
    invoke-virtual/range {v7 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle0123(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    .line 379
    iget-boolean v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->flipMirror:Z

    if-eqz v3, :cond_8

    const/4 v3, 0x0

    .line 380
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 381
    iput v5, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 382
    iput v5, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/high16 v3, 0x3f800000    # 1.0f

    .line 383
    iput v3, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    goto :goto_6

    :cond_8
    const/high16 v3, 0x3f800000    # 1.0f

    .line 385
    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 386
    iput v5, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 387
    iput v5, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 388
    iput v3, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 391
    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v7

    iget v9, v1, Landroid/graphics/RectF;->left:F

    .line 393
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v10

    .line 394
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v11

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v12

    .line 395
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v13

    iget v14, v1, Landroid/graphics/RectF;->bottom:F

    iget v15, v1, Landroid/graphics/RectF;->left:F

    iget v3, v1, Landroid/graphics/RectF;->bottom:F

    const/16 v17, 0x0

    iget v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->color2:I

    move-object/from16 v8, p1

    move/from16 v16, v3

    move/from16 v18, v4

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    .line 391
    invoke-virtual/range {v7 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle0123(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    .line 402
    iget-boolean v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->flipMirror:Z

    if-eqz v3, :cond_9

    .line 403
    iput v5, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 404
    iput v5, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v3, 0x0

    .line 405
    iput v3, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    const/high16 v3, 0x3f800000    # 1.0f

    .line 406
    iput v3, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    goto :goto_7

    :cond_9
    const/high16 v3, 0x3f800000    # 1.0f

    .line 408
    iput v5, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 409
    iput v5, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 410
    iput v3, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 411
    iput v3, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 414
    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    move-result-object v7

    .line 416
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v9

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v10

    iget v11, v1, Landroid/graphics/RectF;->right:F

    .line 417
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v12

    iget v13, v1, Landroid/graphics/RectF;->right:F

    iget v14, v1, Landroid/graphics/RectF;->bottom:F

    .line 419
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result v15

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    const/16 v17, 0x0

    iget v3, v6, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->color2:I

    move-object/from16 v8, p1

    move/from16 v16, v1

    move/from16 v18, v3

    move-object/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v22

    .line 414
    invoke-virtual/range {v7 .. v21}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle0123(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    :cond_a
    :goto_8
    return-void
.end method

.method public setColor2(I)V
    .locals 0

    .line 90
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->color2:I

    return-void
.end method

.method public setFlipMirror(Z)V
    .locals 0

    .line 104
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->flipMirror:Z

    return-void
.end method

.method public setMirrorMode(I)V
    .locals 0

    .line 94
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->mirrorMode:I

    return-void
.end method

.method public setTargetImage(Ljava/lang/String;)V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/MirrorEffectElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    return-void
.end method
