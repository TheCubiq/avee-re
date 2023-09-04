.class public Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;
.super Ljava/lang/Object;
.source "RenderState.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RenderResources"
.end annotation


# instance fields
.field private atlasBufferFxLightShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

.field private atlasBufferShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

.field private atlasTexBlack:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

.field private atlasTexEdge:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

.field private atlasTexLoadingPlaceholer:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

.field private atlasTexLoadingPlaceholerClone:Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;

.field private atlasTexParticles:[Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

.field private atlasTexRandom16:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

.field private atlasTexRoundSegment:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

.field private atlasTexSquareSegment:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

.field private atlasTexSquareYSidesSegment:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

.field private atlasTexWhite:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

.field private bitmapEdge:Landroid/graphics/Bitmap;

.field private bitmapLoadingPlaceholer:Landroid/graphics/Bitmap;

.field private bitmapLogoBW:Landroid/graphics/Bitmap;

.field private bitmapRandom16:Landroid/graphics/Bitmap;

.field private bitmapRoundSegment:Landroid/graphics/Bitmap;

.field private bitmapSquareSegment:Landroid/graphics/Bitmap;

.field private bitmapSquareYSidesSegment:Landroid/graphics/Bitmap;

.field private blurKernelShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

.field private blurShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

.field private blurShader2:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

.field private blurStackShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

.field private bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

.field private bufferRenderer_MotionBlurEffect:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

.field private bufferRenderer_RgbSplitEffect:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

.field private bufferRenderer_FishEyeEffect:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

.field private bufferRenderer_atlasBuffer:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

.field private bufferRenderer_atlasBufferCustomVPMat:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

.field private bufferRenderer_atlasBufferFxLight:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

.field private bufferRenderer_blurShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

.field private bufferRenderer_blurShader2:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

.field private bufferRenderer_blurShaderKernel:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

.field private bufferRenderer_blurStackShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

.field private fontRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;

.field private fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

.field private fxaaShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

.field public final meter:Lcom/daaw/avee/comp/Visualizer/Meter;

.field private motionBlurEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

.field private rgbSplitEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

.field private fishEyeEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

.field public final visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;)V
    .locals 1

    .line 762
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 760
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexParticles:[Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 763
    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    .line 764
    new-instance p2, Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-direct {p2, p1}, Lcom/daaw/avee/comp/Visualizer/Meter;-><init>(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)V

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;
    .locals 0

    .line 713
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexLoadingPlaceholerClone:Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;
    .locals 0

    .line 713
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;)Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;
    .locals 0

    .line 713
    iget-object p0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    return-object p0
.end method

.method private disposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    .locals 0

    # first check if p1 exists

    if-eqz p1, :cond_0

    .line 1084
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->dispose()V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public getAtlasBufferFxLightShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;
    .locals 1

    .line 787
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasBufferFxLightShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    return-object v0
.end method

.method public getAtlasBufferShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;
    .locals 1

    .line 783
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasBufferShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    return-object v0
.end method

.method public getAtlasTexBlack()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    .line 881
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexBlack:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    return-object v0
.end method

.method public getAtlasTexEdge()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    .line 864
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexEdge:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    return-object v0
.end method

.method public getAtlasTexLoadingPlaceholer()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    .line 905
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexLoadingPlaceholerClone:Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;

    return-object v0
.end method

.method public getAtlasTexLogoBW()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getAtlasTexParticle(I)Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 2

    .line 885
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexParticles:[Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 886
    aget-object p1, v0, p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    .line 888
    aget-object p1, v0, p1

    return-object p1
.end method

.method public getAtlasTexRandom16()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    .line 892
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexRandom16:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    return-object v0
.end method

.method public getAtlasTexRoundSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    .line 868
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexRoundSegment:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    return-object v0
.end method

.method public getAtlasTexSquareSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    .line 872
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexSquareSegment:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    return-object v0
.end method

.method public getAtlasTexSquareYSidesSegment()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    .line 877
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexSquareYSidesSegment:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    return-object v0
.end method

.method public getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
    .locals 1

    .line 860
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexWhite:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    return-object v0
.end method

.method public getBlurKernelShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;
    .locals 1

    .line 803
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurKernelShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    return-object v0
.end method

.method public getBlurShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;
    .locals 1

    .line 799
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    return-object v0
.end method

.method public getBlurShader2()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;
    .locals 1

    .line 795
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurShader2:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    return-object v0
.end method

.method public getBlurStackShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;
    .locals 1

    .line 807
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurStackShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    return-object v0
.end method

.method public getBufferRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;
    .locals 1

    .line 812
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    return-object v0
.end method

.method public getBufferRenderer_MotionBlurEffect()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    .locals 1

    .line 832
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_MotionBlurEffect:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    return-object v0
.end method

.method public getBufferRenderer_RgbSplitEffect()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    .locals 1

    .line 828
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_RgbSplitEffect:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    return-object v0
.end method

.method public getBufferRenderer_FishEyeEffect()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    .locals 1

    # .line 828
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_FishEyeEffect:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    return-object v0
.end method

.method public getBufferRenderer_atlasBuffer()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    .locals 1

    .line 816
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_atlasBuffer:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    return-object v0
.end method

.method public getBufferRenderer_atlasBufferFxLight()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    .locals 1

    .line 824
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_atlasBufferFxLight:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    return-object v0
.end method

.method public getBufferRenderer_atlasBufferVPMat()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    .locals 1

    .line 820
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_atlasBufferCustomVPMat:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    return-object v0
.end method

.method public getBufferRenderer_blurShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    .locals 1

    .line 836
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_blurShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    return-object v0
.end method

.method public getBufferRenderer_blurShader2()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    .locals 1

    .line 840
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_blurShader2:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    return-object v0
.end method

.method public getBufferRenderer_blurShaderKernel()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    .locals 1

    .line 844
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_blurShaderKernel:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    return-object v0
.end method

.method public getBufferRenderer_blurStackShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    .locals 1

    .line 848
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_blurStackShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    return-object v0
.end method

.method public getFontRenderer()Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;
    .locals 1

    .line 852
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fontRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;

    return-object v0
.end method

.method public getFullQuad()Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;
    .locals 1

    .line 856
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    return-object v0
.end method

.method public getFxaaShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;
    .locals 1

    .line 791
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fxaaShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    return-object v0
.end method

.method public getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;
    .locals 1

    .line 774
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    return-object v0
.end method

.method public getVisualizationData()Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;
    .locals 1

    .line 779
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    return-object v0
.end method

.method public isValid()Z
    .locals 1

    .line 769
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fontRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasBufferShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

# public VShaderBinder createCustomShaderBinder(VShaderProgram shaderProgram) {
#     return this.bufferRenderer.CreateShaderBinder(shaderProgram);
# }

.method public createCustomShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    .locals 1

    .line 1105
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->CreateShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object p1

    return-object p1
.end method




# public VShaderProgram loadShaderFromString(String str, String str2) {
#             try {
#                 VShaderProgram vShaderProgram = new VShaderProgram(str, str2);
#                 if (vShaderProgram.getLog().length() != 0) {
#                     tlog.w(vShaderProgram.getLog());
#                 }
#                 return vShaderProgram;
#             } catch (Exception e) {
#                 tlog.w("Resources loading error: " + e.getMessage());
#                 return null;
#             }
#         }

.method public loadShaderFromString(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;
    .locals 2

    .line 1088
    :try_start_0
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-direct {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1089
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->getLog()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_0

    .line 1090
    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->getLog()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    move-exception v2

    .line 1093
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Resources loading error: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

.end method


.method public loadShader(Landroid/content/res/Resources;II)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;
    .locals 2

    .line 1092
    invoke-static {p1, p2}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object v0

    .line 1093
    invoke-static {p1, p3}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    .line 1097
    :try_start_0
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-direct {v1, v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1098
    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->getLog()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_0

    .line 1099
    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;->getLog()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v1

    :catch_0
    move-exception p1

    .line 1102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "; "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ") Resources loading error: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public onResources(Landroid/content/res/Resources;)V
    .locals 1

    const v0, 0x7f080146

    .line 1129
    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bitmapEdge:Landroid/graphics/Bitmap;

    const v0, 0x7f08007e

    .line 1132
    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bitmapRoundSegment:Landroid/graphics/Bitmap;

    const v0, 0x7f08015a

    .line 1135
    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bitmapSquareSegment:Landroid/graphics/Bitmap;

    const v0, 0x7f08015b

    .line 1138
    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bitmapSquareYSidesSegment:Landroid/graphics/Bitmap;

    const v0, 0x7f08014d

    .line 1141
    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bitmapRandom16:Landroid/graphics/Bitmap;

    const v0, 0x7f0800dc

    .line 1150
    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bitmapLogoBW:Landroid/graphics/Bitmap;

    const v0, 0x7f080124

    .line 1153
    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bitmapLoadingPlaceholer:Landroid/graphics/Bitmap;

    return-void
.end method

.method public onSurfaceCreated()V
    .locals 20

    move-object/from16 v1, p0

    const-string v2, "Resources loading error: "

    .line 910
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 912
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 914
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;->dispose()V

    .line 915
    :cond_1
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;-><init>()V

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fullQuad:Lcom/daaw/avee/comp/Visualizer/Graphic/FullscreenQuad;

    .line 917
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    const/4 v5, -0x1

    const/4 v6, 0x2

    const/4 v7, 0x2

    const/16 v8, 0x2601

    const/16 v9, 0x2601

    const/16 v10, 0x2901

    const/4 v11, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(IIIIIIZ)V

    .line 924
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    const/high16 v13, -0x1000000

    const/4 v14, 0x2

    const/4 v15, 0x2

    const/16 v16, 0x2601

    const/16 v17, 0x2601

    const/16 v18, 0x2901

    const/16 v19, 0x0

    move-object v12, v4

    invoke-direct/range {v12 .. v19}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(IIIIIIZ)V

    .line 931
    iget-object v5, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexWhite:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->dispose()V

    .line 932
    :cond_2
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    const/4 v6, 0x1

    invoke-direct {v5, v3, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iput-object v5, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexWhite:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 933
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexBlack:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->dispose()V

    .line 934
    :cond_3
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-direct {v3, v4, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexBlack:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 936
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexEdge:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->dispose()V

    .line 937
    :cond_4
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    iget-object v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bitmapEdge:Landroid/graphics/Bitmap;

    const/16 v9, 0x2601

    const/16 v10, 0x2601

    const/16 v11, 0x2901

    const/4 v12, 0x1

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    invoke-direct {v3, v4, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexEdge:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 944
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexRoundSegment:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->dispose()V

    .line 945
    :cond_5
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    iget-object v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bitmapRoundSegment:Landroid/graphics/Bitmap;

    const/16 v9, 0x2601

    const/16 v10, 0x2601

    const/16 v11, 0x2901

    const/4 v12, 0x1

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    invoke-direct {v3, v4, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexRoundSegment:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 951
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexSquareSegment:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->dispose()V

    .line 952
    :cond_6
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    iget-object v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bitmapSquareSegment:Landroid/graphics/Bitmap;

    const/16 v9, 0x2601

    const/16 v10, 0x2601

    const/16 v11, 0x2901

    const/4 v12, 0x1

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    invoke-direct {v3, v4, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexSquareSegment:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 958
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexSquareYSidesSegment:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->dispose()V

    .line 959
    :cond_7
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    iget-object v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bitmapSquareYSidesSegment:Landroid/graphics/Bitmap;

    const/16 v9, 0x2601

    const/16 v10, 0x2601

    const/16 v11, 0x2901

    const/4 v12, 0x1

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    invoke-direct {v3, v4, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexSquareYSidesSegment:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 965
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexRandom16:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->dispose()V

    .line 966
    :cond_8
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    iget-object v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bitmapRandom16:Landroid/graphics/Bitmap;

    const/16 v9, 0x2601

    const/16 v10, 0x2601

    const/16 v11, 0x2901

    const/4 v12, 0x0

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    invoke-direct {v3, v4, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexRandom16:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 997
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexLoadingPlaceholer:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->dispose()V

    .line 998
    :cond_9
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    iget-object v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bitmapLoadingPlaceholer:Landroid/graphics/Bitmap;

    const/16 v9, 0x2601

    const/16 v10, 0x2601

    const/16 v11, 0x2901

    const/4 v12, 0x0

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    invoke-direct {v3, v4, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexLoadingPlaceholer:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 1003
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;

    iget-object v4, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexLoadingPlaceholer:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->getTexture2D()Lmdesl/graphics/ITexture;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasTexLoadingPlaceholerClone:Lcom/daaw/avee/comp/Visualizer/Graphic/LoadingAtlasTexture;

    .line 1008
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-direct {v1, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->disposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    const v3, 0x7f0f0003

    const v4, 0x7f0f0002

    .line 1009
    invoke-virtual {v1, v0, v4, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShader(Landroid/content/res/Resources;II)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    .line 1010
    invoke-static {v3}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 1012
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurShader2:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-direct {v1, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->disposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurShader2:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    const v3, 0x7f0f0004

    .line 1013
    invoke-virtual {v1, v0, v4, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShader(Landroid/content/res/Resources;II)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurShader2:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    .line 1014
    invoke-static {v3}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 1016
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurKernelShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-direct {v1, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->disposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurKernelShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    const/high16 v3, 0x7f0f0000

    const v5, 0x7f0f000c

    .line 1017
    invoke-virtual {v1, v0, v5, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShader(Landroid/content/res/Resources;II)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurKernelShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    .line 1018
    invoke-static {v3}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 1020
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurStackShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-direct {v1, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->disposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurStackShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    const v3, 0x7f0f0001

    .line 1021
    invoke-virtual {v1, v0, v4, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShader(Landroid/content/res/Resources;II)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->blurStackShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    .line 1022
    invoke-static {v3}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 1024
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fxaaShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-direct {v1, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->disposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fxaaShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    const v3, 0x7f0f001e

    const v4, 0x7f0f001d

    .line 1025
    invoke-virtual {v1, v0, v3, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShader(Landroid/content/res/Resources;II)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fxaaShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    .line 1026
    invoke-static {v3}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 1028
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasBufferShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-direct {v1, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->disposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasBufferShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    const v3, 0x7f0f0005

    .line 1029
    invoke-virtual {v1, v0, v5, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShader(Landroid/content/res/Resources;II)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasBufferShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    .line 1030
    invoke-static {v3}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 1032
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasBufferFxLightShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-direct {v1, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->disposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasBufferFxLightShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    const v3, 0x7f0f0006

    const v4, 0x7f0f0007

    .line 1033
    invoke-virtual {v1, v0, v3, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShader(Landroid/content/res/Resources;II)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasBufferFxLightShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    .line 1034
    invoke-static {v3}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 1036
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->rgbSplitEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-direct {v1, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->disposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->rgbSplitEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    const v3, 0x7f0f000b

    const v4, 0x7f0f000a

    .line 1037
    invoke-virtual {v1, v0, v3, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShader(Landroid/content/res/Resources;II)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->rgbSplitEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    .line 1038
    invoke-static {v3}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V
  

    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fishEyeEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-direct {v1, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->disposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fishEyeEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    const v5, 0x7f0f0034

    const v4, 0x7f0f0033

    invoke-virtual {v1, v0, v5, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShader(Landroid/content/res/Resources;II)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fishEyeEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-static {v3}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    .line 1040
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->motionBlurEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-direct {v1, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->disposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->motionBlurEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    const v3, 0x7f0f0009

    const v4, 0x7f0f0008

    .line 1041
    invoke-virtual {v1, v0, v3, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShader(Landroid/content/res/Resources;II)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->motionBlurEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    .line 1042
    invoke-static {v0}, Ljunit/framework/Assert;->assertNotNull(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 1044
    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_atlasBuffer:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1045
    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_atlasBufferCustomVPMat:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1046
    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_atlasBufferFxLight:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1047
    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_RgbSplitEffect:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    
    # .line 104
    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_FishEyeEffect:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1048
    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_MotionBlurEffect:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1049
    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_blurShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1050
    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_blurShader2:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1051
    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_blurShaderKernel:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1052
    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_blurStackShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1055
    :try_start_0
    iget-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    invoke-static {v0}, Lcom/daaw/avee/Common/Utils;->disposeSafe(Lcom/daaw/avee/Common/IDisposable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    .line 1056
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;

    const/16 v3, 0x190

    invoke-direct {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRendererEdge;-><init>(I)V

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    .line 1058
    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasBufferShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->CreateShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_atlasBuffer:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1059
    iget-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasBufferShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->CreateShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_atlasBufferCustomVPMat:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1060
    iget-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->atlasBufferFxLightShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->CreateShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_atlasBufferFxLight:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1061
    iget-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->rgbSplitEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->CreateShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_RgbSplitEffect:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    
    
    # .line 1061
    iget-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fishEyeEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->CreateShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_FishEyeEffect:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1062
    iget-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->motionBlurEffectShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->CreateShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_MotionBlurEffect:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1064
    iget-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBlurShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->CreateShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_blurShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1065
    iget-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBlurShader2()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->CreateShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_blurShader2:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1066
    iget-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBlurKernelShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->CreateShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_blurShaderKernel:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 1067
    iget-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBlurStackShader()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->CreateShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer_blurStackShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1069
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 1070
    sget-object v3, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 1074
    :goto_0
    :try_start_1
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;

    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->bufferRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;

    invoke-direct {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;-><init>(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;)V

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->fontRenderer:Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFontRenderer;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 1076
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 1077
    sget-object v3, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
