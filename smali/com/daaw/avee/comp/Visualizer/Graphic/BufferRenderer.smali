.class public abstract Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;
.super Ljava/lang/Object;
.source "BufferRenderer.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Graphic/IBufferRenderer;
.implements Lcom/daaw/avee/Common/IDisposable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;
    }
.end annotation


# instance fields
.field private _colorTmp:I

.field final attributes:[Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;

.field private c0:Lcom/daaw/avee/Common/Vec2f;

.field private c1:Lcom/daaw/avee/Common/Vec2f;

.field private c2:Lcom/daaw/avee/Common/Vec2f;

.field private c3:Lcom/daaw/avee/Common/Vec2f;

.field private currentRenderPassData:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

.field private flushing:Z

.field final maxTrianglesBatchForRender:I

.field private normal0tmp:Lcom/daaw/avee/Common/Vec2f;

.field private normal1tmp:Lcom/daaw/avee/Common/Vec2f;

.field private normal2tmp:Lcom/daaw/avee/Common/Vec2f;

.field private normal3tmp:Lcom/daaw/avee/Common/Vec2f;

.field private nullTextures:[Lmdesl/graphics/ITexture;

.field private tmpPathPointOut:Landroid/graphics/PointF;

.field private tmpPathPointVecOut:Landroid/graphics/PointF;

.field protected updateParticleCount:I

.field private v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

.field private v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

.field private v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

.field private v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

.field protected vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;


# direct methods
.method public constructor <init>(I)V
    .locals 8

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    new-array v1, v0, [Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;

    .line 23
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;

    const/16 v3, 0x1406

    const-string v4, "Position"

    invoke-direct {v2, v4, v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;-><init>(Ljava/lang/String;II)V

    const/4 v0, 0x0

    aput-object v2, v1, v0

    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;

    const/4 v4, 0x2

    const-string v5, "TexCoord"

    invoke-direct {v2, v5, v4, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;-><init>(Ljava/lang/String;II)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;

    const-string v5, "Color"

    const/4 v6, 0x4

    const/16 v7, 0x1401

    invoke-direct {v2, v5, v6, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;-><init>(Ljava/lang/String;II)V

    aput-object v2, v1, v4

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->attributes:[Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;

    .line 33
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    new-array v1, v4, [Lmdesl/graphics/ITexture;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    aput-object v2, v1, v3

    .line 40
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->nullTextures:[Lmdesl/graphics/ITexture;

    .line 41
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->flushing:Z

    .line 43
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->currentRenderPassData:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    .line 45
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    .line 46
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    .line 47
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    .line 48
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    .line 51
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    .line 52
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointVecOut:Landroid/graphics/PointF;

    .line 57
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    .line 58
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    .line 59
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    .line 60
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    .line 61
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    .line 62
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    .line 63
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    .line 64
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    invoke-direct {v1, v2, v2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    mul-int/lit8 v1, p1, 0x3

    .line 70
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->maxTrianglesBatchForRender:I

    .line 88
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->attributes:[Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;

    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v4, p1, v0

    .line 89
    iget v4, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;->sizeInBytes:I

    add-int/2addr v3, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 92
    :cond_0
    new-instance p1, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    invoke-direct {p1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    return-void
.end method

.method private flush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)Z
    .locals 3

    .line 173
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->flushing:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    .line 174
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->flushing:Z

    .line 175
    iget v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    if-lez v2, :cond_1

    .line 188
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->addStatFlush()V

    .line 190
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->flip()V

    .line 192
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->render(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    .line 194
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    .line 197
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->clear()V

    .line 199
    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->flushing:Z

    return v0
.end method

.method private render(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 5

    .line 206
    iget-object v0, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_atlasBuffer()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v0

    .line 208
    :goto_0
    iget v1, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentBlendMode:I

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setBlendMode(I)V

    .line 216
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTextureCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_1
    const/4 v2, 0x0

    if-ltz v1, :cond_2

    const v3, 0x84c0

    add-int/2addr v3, v1

    .line 217
    invoke-static {v3}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 218
    invoke-virtual {p2, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTexture(I)Lmdesl/graphics/ITexture;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 219
    invoke-interface {v3}, Lmdesl/graphics/ITexture;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v4

    invoke-virtual {v4}, Lmdesl/graphics/Texture;->valid()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 220
    invoke-interface {v3}, Lmdesl/graphics/ITexture;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v2

    invoke-virtual {v2}, Lmdesl/graphics/Texture;->bind()V

    goto :goto_2

    :cond_1
    const/16 v3, 0xde1

    .line 222
    invoke-static {v3, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    :goto_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .line 226
    :cond_2
    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->getTextureWrapMode()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setTextureWrapping(I)V

    .line 228
    iget-object v1, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShaderBindCb:Lcom/daaw/avee/Common/Action3;

    invoke-virtual {v0, p1, v1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->bind(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/Common/Action3;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    const/4 p2, 0x4

    .line 229
    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    mul-int/lit8 v1, v1, 0x3

    invoke-virtual {v0, p2, v2, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->draw(III)V

    .line 230
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;->unbind(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method private swapRB(I)I
    .locals 3

    const v0, -0xff0100

    and-int/2addr v0, p1

    shl-int/lit8 v1, p1, 0x10

    const/high16 v2, 0xff0000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    shr-int/lit8 p1, p1, 0x10

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v0

    return p1
.end method

.method private updateStreamRemainingLengthInBytes()I
    .locals 1

    .line 2332
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->remainingInBytes()I

    move-result v0

    return v0
.end method


# virtual methods
.method public CreateShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;
    .locals 3

    .line 106
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->attributes:[Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;

    invoke-direct {v0, v1, p1, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;-><init>(Lcom/daaw/avee/comp/Visualizer/Graphic/IBindableDrawable;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;[Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder$VertexAttribDef;)V

    return-object v0
.end method

.method protected checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)Z
    .locals 2

    .line 141
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamRemainingLengthInBytes()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->getTotalNumComponentsPerVertexInBytes()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    mul-int v1, v1, p2

    sub-int/2addr v0, v1

    const/4 v1, 0x1

    if-gez v0, :cond_0

    :goto_0
    const/4 p4, 0x1

    goto :goto_1

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->currentRenderPassData:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual {v0, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->compare(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz p4, :cond_2

    .line 148
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->currentRenderPassData:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-direct {p0, p1, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->flush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)Z

    .line 150
    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->currentRenderPassData:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->assignFrom(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    .line 153
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamRemainingLengthInBytes()I

    move-result p1

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->getTotalNumComponentsPerVertexInBytes()I

    move-result p3

    mul-int/lit8 p3, p3, 0x3

    mul-int p3, p3, p2

    sub-int/2addr p1, p3

    if-gez p1, :cond_3

    const-string p1, "buffer too small"

    .line 155
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_3
    return v1
.end method

.method protected checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;IILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)Z
    .locals 2

    .line 122
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    const/4 v1, 0x0

    invoke-direct {v0, p4, p2, p5, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    const/4 p2, 0x0

    .line 123
    invoke-virtual {p0, p1, p3, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)Z

    move-result p1

    return p1
.end method

.method protected checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;IILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Z)Z
    .locals 2

    .line 128
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    const/4 v1, 0x0

    invoke-direct {v0, p4, p2, p5, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    .line 129
    invoke-virtual {p0, p1, p3, v0, p6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)Z

    move-result p1

    return p1
.end method

.method public dispose()V
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->dispose()V

    return-void
.end method

.method public drawBatchRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lcom/daaw/avee/Common/Func/Func3;IFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;",
            "Lcom/daaw/avee/Common/Func/Func3<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;IF",
            "Lcom/daaw/avee/Common/Vec2f;",
            "Lcom/daaw/avee/Common/Vec2f;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p3

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    .line 1320
    move-object/from16 v5, p1

    check-cast v5, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    const/16 v6, 0x8

    new-array v6, v6, [F

    const/4 v7, 0x4

    new-array v7, v7, [I

    .line 1329
    iget v8, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {v4, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v8

    iput v8, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1330
    iget v8, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {v4, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v8

    iput v8, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1332
    iget v8, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {v4, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v8

    iput v8, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1333
    iget v8, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {v4, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v8

    iput v8, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1335
    iget v8, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1336
    iget v8, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1339
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/high16 v9, 0x3f800000    # 1.0f

    iput v9, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 1340
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p7 .. p7}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateW()F

    move-result v9

    iput v9, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 1342
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v9, p4

    iput v9, v8, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 1350
    iget v8, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->maxTrianglesBatchForRender:I

    rem-int/lit8 v9, v8, 0x2

    sub-int/2addr v8, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v1, :cond_2

    mul-int/lit8 v11, v10, 0x2

    .line 1353
    rem-int/2addr v11, v8

    const/4 v12, 0x2

    if-nez v11, :cond_0

    sub-int v11, v1, v10

    mul-int/lit8 v11, v11, 0x2

    .line 1354
    invoke-static {v11, v8}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-virtual {v0, v5, v11, v4, v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)Z

    move-result v11

    if-nez v11, :cond_0

    return-void

    .line 1356
    :cond_0
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    move-object/from16 v13, p2

    invoke-interface {v13, v11, v6, v7}, Lcom/daaw/avee/Common/Func/Func3;->Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-nez v11, :cond_1

    goto :goto_1

    .line 1392
    :cond_1
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1393
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v15, 0x0

    sub-float/2addr v14, v15

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1403
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v11, v6, v7, v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 1407
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1408
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v14, v15

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1418
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v11, v6, v7, v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 1422
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1423
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v14, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float/2addr v14, v15

    iput v14, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1433
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v14, 0x3

    invoke-virtual {v0, v11, v6, v7, v14}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 1437
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v12, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1438
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v12, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float/2addr v12, v15

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1448
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v11, v6, v7, v14}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 1452
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v12, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1453
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v12, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v12, v15

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1463
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v11, v6, v7, v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 1467
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v12, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1468
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v12, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v12, v15

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1478
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v12, 0x1

    invoke-virtual {v0, v11, v6, v7, v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 1480
    iget v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    const/4 v12, 0x2

    add-int/2addr v11, v12

    iput v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_2
    return-void
.end method

.method public drawBatchRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/Common/Func/Func3;Lcom/daaw/avee/Common/Func/Func3;Lcom/daaw/avee/Common/Func/Func3;Lcom/daaw/avee/Common/Func/Func3;IFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/Common/Func/Func3<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/daaw/avee/Common/Func/Func3<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/daaw/avee/Common/Func/Func3<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/daaw/avee/Common/Func/Func3<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;IF",
            "Lcom/daaw/avee/Common/Vec2f;",
            "Lcom/daaw/avee/Common/Vec2f;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ")V"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move/from16 v11, p6

    move/from16 v0, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object/from16 v14, p10

    if-eqz v8, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    if-eqz v9, :cond_1

    add-int/lit8 v1, v1, 0x2

    :cond_1
    if-eqz v10, :cond_2

    add-int/lit8 v1, v1, 0x2

    :cond_2
    move v15, v1

    const/16 v1, 0x9

    new-array v6, v1, [F

    const/4 v1, 0x1

    new-array v5, v1, [I

    .line 1509
    iget v1, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {v14, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v1

    iput v1, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1510
    iget v1, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {v14, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v1

    iput v1, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1512
    iget v1, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {v14, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v1

    iput v1, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1513
    iget v1, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {v14, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v1

    iput v1, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1515
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 1516
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p10 .. p10}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateW()F

    move-result v2

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 1518
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    const/16 v1, 0x8

    aput v0, v6, v1

    .line 1521
    iget v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->maxTrianglesBatchForRender:I

    rem-int v1, v0, v15

    sub-int v4, v0, v1

    const/4 v3, 0x0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v11, :cond_9

    mul-int v0, v2, v15

    .line 1528
    rem-int/2addr v0, v4

    if-nez v0, :cond_3

    sub-int v0, v11, v2

    mul-int v0, v0, v15

    .line 1529
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v7, v1, v0, v14, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)Z

    move-result v0

    if-nez v0, :cond_4

    return-void

    :cond_3
    move-object/from16 v1, p1

    .line 1531
    :cond_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v11, p2

    invoke-interface {v11, v0, v6, v5}, Lcom/daaw/avee/Common/Func/Func3;->Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_5

    move/from16 v18, v2

    move/from16 v16, v4

    move-object/from16 v20, v5

    move-object/from16 v21, v6

    const/16 v19, 0x0

    goto/16 :goto_3

    .line 1543
    :cond_5
    iget-object v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    move/from16 v16, v4

    iget v4, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/16 v17, 0x2

    move-object/from16 v18, v0

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move/from16 v18, v2

    move-object v2, v6

    const/16 v19, 0x0

    move-object/from16 p7, v5

    move-object/from16 v20, v6

    move/from16 v6, v17

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1554
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x0

    move-object/from16 v2, v20

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1565
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1576
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1587
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1598
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    if-eqz v8, :cond_6

    .line 1602
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v5, p7

    move-object/from16 v6, v20

    invoke-interface {v8, v0, v6, v5}, Lcom/daaw/avee/Common/Func/Func3;->Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1613
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/16 v17, 0x2

    move-object/from16 v0, p0

    move-object v2, v6

    move/from16 v6, v17

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1624
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x0

    move-object/from16 v2, v20

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1635
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1646
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1657
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1668
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    :cond_6
    if-eqz v9, :cond_7

    .line 1672
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v5, p7

    move-object/from16 v6, v20

    invoke-interface {v9, v0, v6, v5}, Lcom/daaw/avee/Common/Func/Func3;->Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1673
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/16 v17, 0x2

    move-object/from16 v0, p0

    move-object v2, v6

    move/from16 v6, v17

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1674
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x0

    move-object/from16 v2, v20

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1675
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1676
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1677
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1678
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    :cond_7
    if-eqz v10, :cond_8

    .line 1682
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v5, p7

    move-object/from16 v6, v20

    invoke-interface {v10, v0, v6, v5}, Lcom/daaw/avee/Common/Func/Func3;->Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1683
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/16 v17, 0x2

    move-object/from16 v0, p0

    move-object v2, v6

    move-object/from16 v20, v5

    move-object/from16 v21, v6

    move/from16 v6, v17

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1684
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x0

    move-object/from16 v2, v21

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1685
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1686
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1687
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    .line 1688
    iget-object v1, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V

    goto :goto_2

    :cond_8
    move-object/from16 v21, v20

    move-object/from16 v20, p7

    .line 1691
    :goto_2
    iget v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    add-int/2addr v0, v15

    iput v0, v7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    :goto_3
    add-int/lit8 v2, v18, 0x1

    move/from16 v11, p6

    move/from16 v4, v16

    move-object/from16 v5, v20

    move-object/from16 v6, v21

    const/4 v3, 0x0

    goto/16 :goto_1

    :cond_9
    return-void
.end method

.method public drawBatchRectangleEdges(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lcom/daaw/avee/Common/Func/Func4;IFLcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;ILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;",
            "Lcom/daaw/avee/Common/Func/Func4<",
            "Ljava/lang/Integer;",
            "[F[I[F",
            "Ljava/lang/Boolean;",
            ">;IF",
            "Lcom/daaw/avee/Common/Vec2f;",
            "Lcom/daaw/avee/Common/Vec2f;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;",
            "I",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;",
            ")V"
        }
    .end annotation

    move-object/from16 v6, p0

    move/from16 v7, p3

    move/from16 v0, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    .line 912
    move-object/from16 v11, p1

    check-cast v11, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    const/16 v1, 0x8

    new-array v12, v1, [F

    const/4 v13, 0x4

    new-array v14, v13, [I

    new-array v15, v1, [F

    .line 919
    iget v1, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-interface {v10, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateU(F)F

    move-result v1

    iput v1, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 920
    iget v1, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-interface {v10, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateV(F)F

    move-result v1

    iput v1, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 922
    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-interface {v10, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateU(F)F

    move-result v1

    iput v1, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 923
    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-interface {v10, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateV(F)F

    move-result v1

    iput v1, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 925
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 926
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-interface/range {p7 .. p7}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateW()F

    move-result v3

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 928
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 930
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 931
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-interface/range {p7 .. p7}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateW()F

    move-result v3

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 933
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 935
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 936
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-interface/range {p7 .. p7}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateW()F

    move-result v3

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 938
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 940
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 941
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-interface/range {p7 .. p7}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateW()F

    move-result v2

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 943
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 951
    iget v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->maxTrianglesBatchForRender:I

    rem-int/lit8 v1, v0, 0x6

    sub-int v5, v0, v1

    const/4 v4, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v7, :cond_3

    mul-int/lit8 v0, v3, 0x6

    .line 954
    rem-int/2addr v0, v5

    const/16 v16, 0x6

    if-nez v0, :cond_0

    sub-int v0, v7, v3

    mul-int/lit8 v0, v0, 0x6

    .line 955
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v17

    move-object/from16 v0, p0

    move-object v1, v11

    move-object/from16 v2, p7

    move/from16 v18, v3

    move/from16 v3, v17

    const/4 v13, 0x0

    move/from16 v4, p8

    move/from16 v17, v5

    move-object/from16 v5, p9

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;IILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_0
    move/from16 v18, v3

    move/from16 v17, v5

    const/4 v13, 0x0

    .line 957
    :cond_1
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-interface {v1, v0, v12, v14, v15}, Lcom/daaw/avee/Common/Func/Func4;->Invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    move-object/from16 v24, v11

    const/4 v1, 0x0

    goto/16 :goto_1

    .line 978
    :cond_2
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 979
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 989
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v2, 0x2

    invoke-virtual {v6, v0, v12, v14, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 993
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 994
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1004
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v0, v12, v14, v13}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 1008
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1009
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1019
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v3, 0x3

    invoke-virtual {v6, v0, v12, v14, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 1023
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1024
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1034
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v0, v12, v14, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 1038
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1039
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1049
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v0, v12, v14, v13}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 1053
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1054
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1064
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v4, 0x1

    invoke-virtual {v6, v0, v12, v14, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V

    .line 1082
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    aget v5, v14, v13

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 1083
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    aget v5, v14, v4

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 1084
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    aget v5, v14, v3

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 1085
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    aget v5, v14, v2

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 1093
    aget v0, v12, v13

    .line 1094
    aget v5, v12, v4

    .line 1095
    aget v4, v12, v2

    .line 1096
    aget v2, v12, v3

    .line 1097
    aget v3, v12, v16

    const/16 v20, 0x7

    .line 1098
    aget v13, v12, v20

    const/16 v22, 0x4

    .line 1099
    aget v1, v12, v22

    const/16 v22, 0x5

    .line 1100
    aget v7, v12, v22

    .line 1102
    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    const/16 v21, 0x0

    aget v23, v15, v21

    move-object/from16 v24, v11

    sub-float v11, v0, v23

    iput v11, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1103
    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    const/4 v11, 0x1

    aget v11, v15, v11

    sub-float v11, v5, v11

    iput v11, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1104
    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    const/4 v11, 0x2

    aget v11, v15, v11

    sub-float v11, v4, v11

    iput v11, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1105
    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    const/4 v11, 0x3

    aget v11, v15, v11

    sub-float v11, v2, v11

    iput v11, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1106
    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    const/4 v11, 0x4

    aget v19, v15, v11

    sub-float v11, v3, v19

    iput v11, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1107
    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    aget v11, v15, v22

    sub-float v11, v13, v11

    iput v11, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1108
    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    aget v11, v15, v16

    sub-float v11, v1, v11

    iput v11, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1109
    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    aget v11, v15, v20

    sub-float v11, v7, v11

    iput v11, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1122
    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v0, v10, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1123
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1124
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v5, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1125
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v5, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1126
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1128
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1129
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1130
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v5, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1131
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v5, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1132
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1135
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v5, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1136
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v5, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1137
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v5, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1138
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v5, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1139
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v5, 0x0

    invoke-virtual {v6, v0, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;I)V

    .line 1142
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v5, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1143
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v5, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v5, v5, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1144
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v5, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1145
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v5, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v5, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1146
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v0:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v5, 0x0

    invoke-virtual {v6, v0, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;I)V

    .line 1148
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1149
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1150
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1151
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1152
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1155
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1156
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1157
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1158
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1159
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v2, 0x0

    invoke-virtual {v6, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;I)V

    .line 1207
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1208
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1209
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1210
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1211
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1213
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1214
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1215
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1216
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1217
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1220
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1221
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1222
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1223
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1224
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v2, 0x0

    invoke-virtual {v6, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;I)V

    .line 1227
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1228
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1229
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1230
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1231
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v2, 0x0

    invoke-virtual {v6, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;I)V

    .line 1233
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1234
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1235
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1236
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1237
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1240
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1241
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1242
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1243
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1244
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v3:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;I)V

    .line 1304
    iget v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    add-int/lit8 v0, v0, 0x6

    iput v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    :goto_1
    add-int/lit8 v3, v18, 0x1

    move/from16 v7, p3

    move-object/from16 v10, p7

    move/from16 v5, v17

    move-object/from16 v11, v24

    const/4 v4, 0x0

    const/4 v13, 0x4

    goto/16 :goto_0

    :cond_3
    return-void
.end method

.method public drawCircle(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;II)V
    .locals 23

    move-object/from16 v6, p0

    move-object/from16 v0, p8

    move-object/from16 v1, p9

    move-object/from16 v7, p10

    move/from16 v8, p12

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v3, p5, v2

    add-float v9, p2, v3

    mul-float v3, p6, v2

    add-float v10, p3, v3

    int-to-double v3, v8

    const-wide v11, 0x401921fb54442d18L    # 6.283185307179586

    .line 1808
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v11, v3

    .line 1809
    invoke-static {v11, v12}, Ljava/lang/Math;->tan(D)D

    move-result-wide v13

    .line 1811
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v11

    .line 1819
    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-interface {v7, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateU(F)F

    move-result v3

    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1820
    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-interface {v7, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateV(F)F

    move-result v3

    iput v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1822
    iget v3, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-interface {v7, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateU(F)F

    move-result v3

    iput v3, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1823
    iget v3, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-interface {v7, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateV(F)F

    move-result v3

    iput v3, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1825
    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v3, v4

    mul-float v15, v3, v2

    .line 1826
    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v4, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v3, v4

    mul-float v5, v3, v2

    .line 1827
    iget v2, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v16, v2, v3

    .line 1828
    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v17, v1, v0

    .line 1830
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 1831
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-interface/range {p10 .. p10}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateW()F

    move-result v1

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 1832
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v1, p7

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 1833
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v1, p4

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    const/4 v0, 0x0

    const/high16 v1, -0x41000000    # -0.5f

    const/4 v2, 0x0

    const/high16 v3, -0x41000000    # -0.5f

    const/4 v4, 0x0

    const/16 v18, 0x0

    :goto_0
    if-ge v2, v8, :cond_2

    .line 1836
    iget v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->maxTrianglesBatchForRender:I

    rem-int v1, v2, v0

    if-nez v1, :cond_1

    sub-int v1, v8, v2

    .line 1837
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v19

    const/16 v20, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v21, v2

    move-object/from16 v2, p10

    move/from16 v22, v3

    move/from16 v3, v19

    move v7, v4

    move/from16 v4, p11

    move v8, v5

    move-object/from16 v5, v20

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;IILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    move/from16 v1, v22

    goto :goto_1

    :cond_1
    move/from16 v21, v2

    move v7, v4

    move v8, v5

    move v1, v3

    :goto_1
    neg-float v0, v1

    float-to-double v2, v7

    float-to-double v4, v0

    .line 1846
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v13

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v4, v2

    double-to-float v0, v4

    float-to-double v4, v1

    .line 1847
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v13

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    add-double/2addr v4, v2

    double-to-float v2, v4

    float-to-double v3, v0

    .line 1850
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v11

    double-to-float v4, v3

    float-to-double v2, v2

    .line 1851
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v11

    double-to-float v3, v2

    .line 1853
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    mul-float v2, v18, p5

    add-float/2addr v2, v9

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1854
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    mul-float v2, v1, p6

    add-float/2addr v2, v10

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1855
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    mul-float v18, v18, v16

    add-float v2, v15, v18

    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1856
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    mul-float v1, v1, v17

    add-float/2addr v1, v15

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1857
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1859
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v9, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1860
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1861
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v15, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1862
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1863
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1865
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    mul-float v1, v4, p5

    add-float/2addr v1, v9

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1866
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    mul-float v1, v3, p6

    add-float/2addr v1, v10

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1867
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    mul-float v1, v4, v16

    add-float/2addr v1, v15

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1868
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    mul-float v1, v3, v17

    add-float/2addr v1, v15

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1869
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1871
    iget v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    add-int/lit8 v2, v21, 0x1

    move-object/from16 v7, p10

    move/from16 v18, v4

    move v5, v8

    move/from16 v8, p12

    goto/16 :goto_0

    :cond_2
    return-void
.end method

.method public drawCircleSegmentW(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;IF)V
    .locals 13

    const/high16 v0, 0x3f000000    # 0.5f

    cmpg-float v1, p5, p6

    if-gez v1, :cond_0

    mul-float v1, p5, v0

    goto :goto_0

    :cond_0
    mul-float v1, p6, v0

    :goto_0
    const-wide v2, 0x401921fb54442d18L    # 6.283185307179586

    float-to-double v4, v1

    .line 1777
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v2

    double-to-float v1, v4

    div-float v1, v1, p12

    add-float/2addr v1, v0

    float-to-int v0, v1

    const/16 v1, 0x12

    .line 1781
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v12

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v11, p11

    .line 1783
    invoke-virtual/range {v0 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawCircle(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;II)V

    return-void
.end method

.method public drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V
    .locals 16

    .line 443
    new-instance v14, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    const/4 v0, 0x0

    move-object/from16 v1, p14

    move/from16 v2, p15

    invoke-direct {v14, v2, v1, v0, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    const/4 v15, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    .line 444
    invoke-virtual/range {v0 .. v15}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    return-void
.end method

.method public drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V
    .locals 13

    move-object v0, p0

    move v1, p2

    move/from16 v2, p3

    move/from16 v3, p8

    move/from16 v4, p9

    move-object/from16 v5, p12

    move-object/from16 v6, p13

    move-object/from16 v7, p14

    move/from16 v8, p15

    .line 514
    move-object v9, p1

    check-cast v9, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    const/4 v10, 0x2

    .line 516
    invoke-virtual {p0, v9, v10, v7, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)Z

    move-result v11

    if-nez v11, :cond_0

    return-void

    .line 520
    :cond_0
    iget v11, v5, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {v7, v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v11

    iput v11, v5, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 521
    iget v11, v5, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {v7, v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v11

    iput v11, v5, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 523
    iget v11, v6, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {v7, v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v11

    iput v11, v6, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 524
    iget v11, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {v7, v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v11

    iput v11, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 526
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/high16 v12, 0x3f800000    # 1.0f

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 527
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p14 .. p14}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateW()F

    move-result v12

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 528
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v12, p11

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 529
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v12, p10

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 531
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v12, p6

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 532
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v12, p7

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 533
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v12, v5, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 534
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v12, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 535
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 537
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v1, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 538
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 539
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v12, v5, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 540
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v12, v5, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 541
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 543
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v3, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 544
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v4, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 545
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v12, v6, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 546
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v12, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v12, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 547
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 549
    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v3, v11, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 550
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 551
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v6, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 552
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v6, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 553
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 555
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v1, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 556
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 557
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v5, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 558
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v5, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 559
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 561
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v2, p4

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 562
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v2, p5

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 563
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v6, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 564
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v5, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 565
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 567
    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    add-int/2addr v1, v10

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    if-eqz v8, :cond_1

    const/4 v1, 0x0

    .line 570
    invoke-virtual {p0, v9, v1, v7, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)Z

    :cond_1
    return-void
.end method

.method public drawRectangle0123(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 16

    const/4 v15, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p8

    move/from16 v7, p9

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    .line 466
    invoke-virtual/range {v0 .. v15}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    return-void
.end method

.method public drawRectangle0123(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p8

    move/from16 v7, p9

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move/from16 v15, p15

    .line 489
    invoke-virtual/range {v0 .. v15}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    return-void
.end method

.method public drawRectangleEdges(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;ILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)V
    .locals 17

    move-object/from16 v6, p0

    move/from16 v7, p2

    move/from16 v8, p3

    move/from16 v9, p4

    move/from16 v10, p5

    move/from16 v11, p6

    move/from16 v12, p7

    move/from16 v13, p8

    move/from16 v14, p9

    move/from16 v15, p10

    move/from16 v5, p11

    move-object/from16 v4, p12

    move-object/from16 v3, p13

    move-object/from16 v2, p14

    .line 589
    move-object/from16 v1, p1

    check-cast v1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;

    const/16 v16, 0xa

    move-object/from16 v0, p0

    move-object v10, v2

    move-object v9, v3

    move/from16 v3, v16

    move/from16 v4, p15

    move v14, v5

    move-object/from16 v5, p16

    .line 590
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;IILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 594
    invoke-static {v14, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->setIntColorAlpha(II)I

    move-result v0

    iput v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->_colorTmp:I

    move-object/from16 v0, p12

    .line 596
    iget v1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-interface {v10, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateU(F)F

    move-result v1

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 597
    iget v1, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-interface {v10, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateV(F)F

    move-result v1

    iput v1, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 599
    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-interface {v10, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateU(F)F

    move-result v1

    iput v1, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 600
    iget v1, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-interface {v10, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateV(F)F

    move-result v1

    iput v1, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 602
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 603
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-interface/range {p14 .. p14}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateW()F

    move-result v3

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 604
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v14, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 605
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v15, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 607
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 608
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-interface/range {p14 .. p14}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateW()F

    move-result v2

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 609
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->_colorTmp:I

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 610
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v15, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 612
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 613
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 614
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 615
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 616
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 618
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 619
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 620
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 621
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 622
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 624
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v13, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 625
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v2, p9

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 626
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 627
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 628
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 630
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v13, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 631
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 632
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 633
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 634
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 636
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 637
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 638
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 639
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 640
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 642
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v3, p4

    move-object v4, v9

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 643
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v5, p5

    iput v5, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 644
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 645
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 646
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    sub-float v1, v7, v3

    add-float v9, v8, v5

    mul-float v1, v1, v9

    sub-float v9, v3, v13

    add-float v10, v5, v2

    mul-float v9, v9, v10

    add-float/2addr v1, v9

    sub-float v9, v13, v7

    add-float v10, v2, v8

    mul-float v9, v9, v10

    add-float/2addr v1, v9

    .line 655
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    .line 657
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v10, v5, v8

    neg-float v10, v10

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 658
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v10, v3, v7

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 659
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v9}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 661
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v10, v2, v5

    neg-float v10, v10

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 662
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v10, v13, v3

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 663
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v9}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 665
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v10, v12, v2

    neg-float v10, v10

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 666
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v10, v11, v13

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 667
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v9}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 669
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v10, v8, v12

    neg-float v10, v10

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 670
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v10, v7, v11

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 671
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v9}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 691
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v10, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v14, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v10, v14

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 692
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v10, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v14, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v10, v14

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 694
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    const/high16 v14, 0x3fc00000    # 1.5f

    mul-float v1, v1, v14

    invoke-virtual {v9, v10, v1}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(Lcom/daaw/avee/Common/Vec2f;F)V

    .line 696
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v10, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v14, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v10, v14

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 697
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v10, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v14, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v10, v14

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 699
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v9, v10, v1}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(Lcom/daaw/avee/Common/Vec2f;F)V

    .line 701
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v10, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v14, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v10, v14

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 702
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v10, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v14, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v10, v14

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 704
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v9, v10, v1}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(Lcom/daaw/avee/Common/Vec2f;F)V

    .line 706
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v10, v10, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v14, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v10, v14

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 707
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v10, v10, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v14, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v10, v14

    iput v10, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 709
    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget-object v10, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v9, v10, v1}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(Lcom/daaw/avee/Common/Vec2f;F)V

    .line 711
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v9, v7, v9

    iput v9, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 712
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v9, v8, v9

    iput v9, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 713
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v9, v3, v9

    iput v9, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 714
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v9, v5, v9

    iput v9, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 715
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v9, v13, v9

    iput v9, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 716
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v9, v2, v9

    iput v9, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 717
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v9, v11, v9

    iput v9, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 718
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v9, v12, v9

    iput v9, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 731
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 732
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 733
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 734
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 735
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 737
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 738
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v5, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 739
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 740
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 741
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 744
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 745
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 746
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 747
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 748
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 751
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 752
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 753
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 754
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 755
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 757
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 758
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v5, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 759
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 760
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 761
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 764
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 765
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v9, v9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 766
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 767
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v9, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v9, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 768
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 773
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 774
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v5, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 775
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 776
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 777
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 779
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v13, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 780
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 781
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 782
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 783
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 786
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v3, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 787
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v3, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 788
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 789
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 790
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 793
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v3, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 794
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v3, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 795
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 796
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 797
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 799
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v13, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 800
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 801
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 802
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 803
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 806
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v3, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 807
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v3, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v3, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 808
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 809
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v3, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 810
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 815
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v13, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 816
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 817
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 818
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 819
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 821
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 822
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 823
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 824
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 825
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 828
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 829
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 830
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 831
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 832
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 835
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 836
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 837
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 838
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 839
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 841
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 842
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 843
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 844
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 845
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 848
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 849
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 850
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 851
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 852
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 857
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 858
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 859
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 860
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 861
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 863
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 864
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 865
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 866
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 867
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 870
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 871
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 872
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 873
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 874
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 877
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 878
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 879
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 880
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 881
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 883
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 884
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 885
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 886
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 887
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 890
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 891
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 892
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v2, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 893
    iget-object v1, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 894
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 899
    iget v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    add-int/lit8 v0, v0, 0xa

    iput v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    return-void
.end method

.method public drawRectangleFCol(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;ILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)V
    .locals 14

    move-object v6, p0

    move/from16 v7, p2

    move/from16 v8, p3

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    const/4 v3, 0x2

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p14

    move/from16 v4, p15

    move-object/from16 v5, p16

    .line 1708
    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;IILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1712
    :cond_0
    iget v0, v11, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-interface {v13, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateU(F)F

    move-result v0

    iput v0, v11, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1713
    iget v0, v11, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-interface {v13, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateV(F)F

    move-result v0

    iput v0, v11, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1715
    iget v0, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-interface {v13, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateU(F)F

    move-result v0

    iput v0, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1716
    iget v0, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-interface {v13, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateV(F)F

    move-result v0

    iput v0, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1718
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 1719
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-interface/range {p14 .. p14}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateW()F

    move-result v1

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 1720
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v1, p11

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 1721
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v1, p10

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 1723
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v1, p6

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1724
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v1, p7

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1725
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v11, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1726
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1727
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1729
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1730
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1731
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v11, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1732
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v11, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1733
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1735
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v9, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1736
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1737
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1738
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1739
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1741
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v9, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1742
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1743
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1744
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v12, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1745
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1747
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1748
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1749
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v11, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1750
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v11, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1751
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1753
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v1, p4

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1754
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v1, p5

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1755
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v12, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1756
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v1, v11, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1757
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1759
    iget v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    add-int/lit8 v0, v0, 0x2

    iput v0, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    return-void
.end method

.method public drawRectangleM1P1(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;ILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)V
    .locals 16

    .line 304
    new-instance v14, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    const/4 v0, 0x0

    move-object/from16 v1, p6

    move/from16 v2, p7

    move-object/from16 v3, p8

    invoke-direct {v14, v2, v1, v3, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, -0x40800000    # -1.0f

    const/high16 v7, -0x40800000    # -1.0f

    const/high16 v8, 0x3f800000    # 1.0f

    const/high16 v9, -0x40800000    # -1.0f

    const/4 v15, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v10, p2

    move/from16 v11, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    .line 305
    invoke-virtual/range {v0 .. v15}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    return-void
.end method

.method public drawRectangleRightBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;I)V
    .locals 13

    sub-float v5, p5, p2

    sub-float v6, p6, p3

    const/4 v12, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v11, p11

    .line 271
    invoke-virtual/range {v0 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleRightBottomWH(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;ILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)V

    return-void
.end method

.method public drawRectangleRightBottomWH(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;ILcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;)V
    .locals 12

    .line 352
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    const/4 v0, 0x0

    move-object/from16 v1, p10

    move/from16 v2, p11

    move-object/from16 v3, p12

    invoke-direct {v10, v2, v1, v3, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    const/4 v11, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    .line 353
    invoke-virtual/range {v0 .. v11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangleRightBottomWH(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    return-void
.end method

.method public drawRectangleRightBottomWH(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V
    .locals 3

    const/4 v0, 0x2

    .line 368
    invoke-virtual {p0, p1, v0, p10, p11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 373
    :cond_0
    iget v1, p8, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {p10, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v1

    iput v1, p8, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 374
    iget v1, p8, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {p10, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v1

    iput v1, p8, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 376
    iget v1, p9, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {p10, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v1

    iput v1, p9, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 377
    iget v1, p9, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {p10, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v1

    iput v1, p9, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 379
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 380
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p10}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateW()F

    move-result v2

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 381
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput p7, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 382
    iget-object p7, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput p4, p7, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 384
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput p2, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 385
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    add-float/2addr p6, p3

    iput p6, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 386
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget p7, p8, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput p7, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 387
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget p7, p9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p7, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 388
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 390
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput p2, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 391
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput p3, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 392
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget p7, p8, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput p7, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 393
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget p7, p8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p7, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 394
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 396
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    add-float/2addr p5, p2

    iput p5, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 397
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput p6, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 398
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget p7, p9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput p7, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 399
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget p7, p9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p7, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 400
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 402
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput p5, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 403
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput p6, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 404
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget p6, p9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput p6, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 405
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget p6, p9, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p6, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 406
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 408
    iget-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput p2, p4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 409
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput p3, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 410
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget p4, p8, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput p4, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 411
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget p4, p8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p4, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 412
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 414
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput p5, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 415
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput p3, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 416
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget p3, p9, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput p3, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 417
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget p3, p8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput p3, p2, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 418
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 420
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    add-int/2addr p2, v0

    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    if-eqz p11, :cond_1

    .line 423
    invoke-virtual {p0, p1, v0, p10, p11}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)Z

    :cond_1
    return-void
.end method

.method public drawRectangleWH(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V
    .locals 16

    add-float v6, p2, p5

    add-float v9, p3, p6

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move v4, v6

    move/from16 v5, p3

    move v7, v9

    move/from16 v8, p2

    move/from16 v10, p4

    move/from16 v11, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object/from16 v14, p10

    move/from16 v15, p11

    .line 340
    invoke-virtual/range {v0 .. v15}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle0123(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    return-void
.end method

.method public drawRectangleWHBottom(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V
    .locals 16

    add-float v5, p3, p6

    add-float v6, p2, p5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move v3, v5

    move v4, v6

    move/from16 v7, p3

    move/from16 v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    move/from16 v11, p7

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    move-object/from16 v14, p10

    move/from16 v15, p11

    .line 323
    invoke-virtual/range {v0 .. v15}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->drawRectangle0123(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;FFFFFFFFFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)V

    return-void
.end method

.method public flush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 2

    .line 165
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>()V

    .line 167
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->currentRenderPassData:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-direct {p0, p1, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->flush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 168
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->currentRenderPassData:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->assignFrom(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    :cond_0
    return-void
.end method

.method public onFrameEnd(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    .line 246
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->flush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    return-void
.end method

.method public onFrameStart(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    const/4 p1, 0x0

    .line 238
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    .line 239
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->clear()V

    .line 241
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->currentRenderPassData:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->setToEmpty()V

    return-void
.end method

.method public rectangleEdges(FFFFFFFFFFFFFFI)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    const/4 v4, 0x0

    .line 2048
    invoke-static {v15, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->setIntColorAlpha(II)I

    move-result v4

    iput v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->_colorTmp:I

    .line 2056
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 2057
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v14, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 2058
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v15, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 2059
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v9, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 2061
    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v3, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 2062
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v14, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 2063
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->_colorTmp:I

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 2064
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v9, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    .line 2066
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v5, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2067
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v6, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2068
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2069
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2070
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2072
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v1, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2073
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2074
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2075
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2076
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2078
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2079
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2080
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2081
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2082
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2084
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2085
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2086
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2087
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2088
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2090
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v1, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2091
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2092
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2093
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2094
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2096
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v4, p3

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2097
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v9, p4

    iput v9, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2098
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2099
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2100
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    sub-float v3, v1, v4

    add-float v13, v2, v9

    mul-float v3, v3, v13

    sub-float v13, v4, v7

    add-float v14, v9, v8

    mul-float v13, v13, v14

    add-float/2addr v3, v13

    sub-float v13, v7, v1

    add-float v14, v8, v2

    mul-float v13, v13, v14

    add-float/2addr v3, v13

    .line 2108
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v3

    .line 2110
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v14, v9, v2

    neg-float v14, v14

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 2111
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v14, v4, v1

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 2112
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v13}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 2114
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v14, v8, v9

    neg-float v14, v14

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 2115
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v14, v7, v4

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 2116
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v13}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 2118
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v14, v6, v8

    neg-float v14, v14

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 2119
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v14, v5, v7

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 2120
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v13}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 2122
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v14, v2, v6

    neg-float v14, v14

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 2123
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    sub-float v14, v1, v5

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 2124
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v13}, Lcom/daaw/avee/Common/Vec2f;->normalizeSafe()Lcom/daaw/avee/Common/Vec2f;

    .line 2126
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v15, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v15, v15, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v14, v15

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 2127
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v15, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v15, v15, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v14, v15

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 2129
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    const/high16 v15, 0x3fc00000    # 1.5f

    mul-float v3, v3, v15

    invoke-virtual {v13, v14, v3}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(Lcom/daaw/avee/Common/Vec2f;F)V

    .line 2131
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v15, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v15, v15, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v14, v15

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 2132
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal0tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v15, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v15, v15, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v14, v15

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 2134
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v13, v14, v3}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(Lcom/daaw/avee/Common/Vec2f;F)V

    .line 2136
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v15, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v15, v15, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v14, v15

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 2137
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal1tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v15, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v15, v15, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v14, v15

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 2139
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v13, v14, v3}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(Lcom/daaw/avee/Common/Vec2f;F)V

    .line 2141
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget-object v15, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v15, v15, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v14, v15

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 2142
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal2tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v14, v14, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget-object v15, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    iget v15, v15, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v14, v15

    iput v14, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 2144
    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget-object v14, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->normal3tmp:Lcom/daaw/avee/Common/Vec2f;

    invoke-virtual {v13, v14, v3}, Lcom/daaw/avee/Common/Vec2f;->multiplyByValueDividedByDotCapped(Lcom/daaw/avee/Common/Vec2f;F)V

    .line 2146
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v13, v1, v13

    iput v13, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 2147
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v13, v2, v13

    iput v13, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 2148
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v13, v4, v13

    iput v13, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 2149
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v13, v9, v13

    iput v13, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 2150
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v13, v7, v13

    iput v13, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 2151
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v13, v8, v13

    iput v13, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 2152
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float v13, v5, v13

    iput v13, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 2153
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float v13, v6, v13

    iput v13, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 2157
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v1, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2158
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2159
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2160
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2161
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2163
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2164
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v9, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2165
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2166
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2167
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2170
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2171
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2172
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2173
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2174
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2177
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2178
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2179
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2180
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2181
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2183
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2184
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v9, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2185
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2186
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2187
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2190
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2191
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v13, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v13, v13, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2192
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2193
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2194
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2199
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2200
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v9, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2201
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2202
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2203
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2205
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2206
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2207
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2208
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2209
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2212
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2213
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2214
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2215
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2216
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2219
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2220
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c1:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2221
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2222
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2223
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2225
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2226
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2227
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2228
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2229
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2232
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2233
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2234
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2235
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2236
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2241
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v7, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2242
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2243
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2244
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2245
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2247
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v5, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2248
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v6, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2249
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2250
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2251
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2254
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2255
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2256
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2257
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2258
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2261
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2262
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c2:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2263
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2264
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2265
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2267
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v5, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2268
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v6, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2269
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2270
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2271
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2274
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2275
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2276
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2277
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2278
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2283
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v5, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2284
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v6, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2285
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2286
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2287
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2289
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v1, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2290
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2291
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2292
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2293
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2296
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2297
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2298
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2299
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2300
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2303
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2304
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c3:Lcom/daaw/avee/Common/Vec2f;

    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v4, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2305
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2306
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2307
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2309
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v1, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2310
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2311
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2312
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2313
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2316
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->x:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2317
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v2, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->c0:Lcom/daaw/avee/Common/Vec2f;

    iget v2, v2, Lcom/daaw/avee/Common/Vec2f;->y:F

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2318
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v12, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2319
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2320
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v2:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2324
    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    add-int/lit8 v1, v1, 0xa

    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    return-void
.end method

.method public renderPath(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;ILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v14, p2

    move-object/from16 v15, p7

    .line 1885
    invoke-interface {v15, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->getPreferredPointCount(Landroid/graphics/RectF;)I

    move-result v13

    add-int/lit8 v16, v13, -0x1

    .line 1890
    iget-object v12, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointVecOut:Landroid/graphics/PointF;

    const/4 v7, 0x0

    const/16 v17, 0x0

    move-object/from16 v6, p7

    move/from16 v8, v16

    move v9, v13

    move-object/from16 v10, p2

    move-object/from16 v18, v11

    move/from16 v11, v17

    move v14, v13

    move-object/from16 v13, v18

    invoke-interface/range {v6 .. v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->getPointOnPath(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I

    .line 1892
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->x:F

    .line 1893
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v7, v7, Landroid/graphics/PointF;->y:F

    .line 1895
    iget v8, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {v5, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v8

    iput v8, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1896
    iget v8, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {v5, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v8

    iput v8, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1898
    iget v8, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-virtual {v5, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateU(F)F

    move-result v8

    iput v8, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    .line 1899
    iget v8, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-virtual {v5, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateV(F)F

    move-result v8

    iput v8, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    .line 1901
    iget v8, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v9, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    add-float/2addr v8, v9

    const/high16 v9, 0x3f000000    # 0.5f

    mul-float v13, v8, v9

    .line 1902
    iget v8, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v10, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    add-float/2addr v8, v10

    mul-float v12, v8, v9

    .line 1903
    iget v8, v4, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v9, v3, Lcom/daaw/avee/Common/Vec2f;->x:F

    sub-float/2addr v8, v9

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->width()F

    move-result v9

    const/high16 v10, 0x3f800000    # 1.0f

    div-float v9, v10, v9

    mul-float v17, v8, v9

    .line 1904
    iget v4, v4, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v3, v3, Lcom/daaw/avee/Common/Vec2f;->y:F

    sub-float/2addr v4, v3

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    move-result v3

    div-float v3, v10, v3

    mul-float v4, v4, v3

    .line 1906
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posW:F

    .line 1907
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p6 .. p6}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->translateW()F

    move-result v8

    iput v8, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texZ:F

    .line 1908
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 1909
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    const/4 v8, 0x0

    iput v8, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    const/4 v3, 0x0

    move v11, v6

    move v10, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v14, :cond_1

    .line 1912
    iget v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->maxTrianglesBatchForRender:I

    rem-int v7, v9, v6

    if-nez v7, :cond_0

    sub-int v7, v14, v9

    .line 1913
    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-virtual {v0, v1, v6, v5, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)Z

    move-result v6

    if-nez v6, :cond_0

    return-void

    :cond_0
    const/4 v7, 0x0

    const/16 v18, 0x0

    .line 1915
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointVecOut:Landroid/graphics/PointF;

    move-object/from16 v19, v6

    move-object/from16 v6, p7

    move-object/from16 v20, v8

    move v8, v9

    move/from16 v21, v9

    move v9, v14

    move v3, v10

    move-object/from16 v10, p2

    move/from16 v22, v11

    move/from16 v11, v18

    move/from16 v23, v12

    move-object/from16 v12, v20

    move v15, v13

    move-object/from16 v13, v19

    invoke-interface/range {v6 .. v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->getPointOnPath(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I

    .line 1918
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v7, v22

    iput v7, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1919
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v3, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1920
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v8

    sub-float v11, v7, v8

    mul-float v11, v11, v17

    add-float v13, v15, v11

    iput v13, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1921
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v7

    sub-float v10, v3, v7

    mul-float v10, v10, v4

    add-float v13, v15, v10

    iput v13, v6, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1922
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1925
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v6

    iput v6, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1926
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v6

    iput v6, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1927
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v15, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1928
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v8, v23

    iput v8, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1929
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1931
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->x:F

    iput v6, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1932
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->y:F

    iput v6, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1933
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->x:F

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v7

    sub-float/2addr v6, v7

    mul-float v6, v6, v17

    add-float v13, v15, v6

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1934
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->y:F

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v7

    sub-float/2addr v6, v7

    mul-float v6, v6, v4

    add-float v13, v15, v6

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1935
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1937
    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    .line 1939
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v11, v3, Landroid/graphics/PointF;->x:F

    .line 1940
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v10, v3, Landroid/graphics/PointF;->y:F

    add-int/lit8 v9, v21, 0x1

    move v12, v8

    move v13, v15

    const/4 v3, 0x0

    move-object/from16 v15, p7

    goto/16 :goto_0

    :cond_1
    move v15, v13

    .line 1943
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRenderEdgesPaths()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    .line 1946
    invoke-static {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->setIntColorAlpha(II)I

    move-result v13

    const/high16 v3, -0x40400000    # -1.5f

    const/4 v7, 0x0

    const/4 v11, 0x0

    .line 1950
    iget-object v12, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget-object v10, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointVecOut:Landroid/graphics/PointF;

    move-object/from16 v6, p7

    move/from16 v8, v16

    move v9, v14

    move-object/from16 v16, v10

    move-object/from16 v10, p2

    move/from16 v24, v13

    move-object/from16 v13, v16

    invoke-interface/range {v6 .. v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->getPointOnPath(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I

    .line 1951
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->x:F

    .line 1952
    iget-object v7, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v7, v7, Landroid/graphics/PointF;->y:F

    .line 1953
    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v8, v8, Landroid/graphics/PointF;->x:F

    iget-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointVecOut:Landroid/graphics/PointF;

    iget v9, v9, Landroid/graphics/PointF;->x:F

    mul-float v9, v9, v3

    add-float/2addr v8, v9

    .line 1954
    iget-object v9, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v9, v9, Landroid/graphics/PointF;->y:F

    iget-object v10, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointVecOut:Landroid/graphics/PointF;

    iget v10, v10, Landroid/graphics/PointF;->y:F

    mul-float v10, v10, v3

    add-float/2addr v9, v10

    .line 1958
    iget v10, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->maxTrianglesBatchForRender:I

    rem-int/lit8 v11, v10, 0x2

    sub-int v13, v10, v11

    move v11, v6

    move v10, v7

    const/4 v12, 0x0

    move/from16 v29, v9

    move v9, v8

    move/from16 v8, v29

    :goto_1
    if-ge v12, v14, :cond_4

    mul-int/lit8 v6, v12, 0x2

    .line 1961
    rem-int/2addr v6, v13

    if-nez v6, :cond_2

    sub-int v6, v14, v12

    mul-int/lit8 v6, v6, 0x2

    .line 1962
    invoke-static {v6, v13}, Ljava/lang/Math;->min(II)I

    move-result v6

    const/4 v7, 0x0

    invoke-virtual {v0, v1, v6, v5, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->checkFlush(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;ILcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;Z)Z

    move-result v6

    if-nez v6, :cond_3

    return-void

    :cond_2
    const/4 v7, 0x0

    :cond_3
    const/16 v16, 0x0

    const/16 v18, 0x0

    .line 1965
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointVecOut:Landroid/graphics/PointF;

    move-object/from16 v19, v6

    move-object/from16 v6, p7

    const/16 v20, 0x0

    move/from16 v7, v16

    move/from16 v25, v8

    move v8, v12

    move/from16 v26, v9

    move v9, v14

    move/from16 v27, v10

    move-object/from16 v10, p2

    move/from16 v28, v11

    move/from16 v11, v18

    move/from16 v16, v12

    move-object/from16 v12, v19

    move/from16 v18, v13

    move-object v13, v3

    invoke-interface/range {v6 .. v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;->getPointOnPath(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I

    .line 1967
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointVecOut:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->x:F

    const/high16 v7, -0x40400000    # -1.5f

    mul-float v6, v6, v7

    add-float v9, v3, v6

    .line 1968
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->y:F

    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointVecOut:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->y:F

    mul-float v6, v6, v7

    add-float v8, v3, v6

    .line 1975
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v6, v28

    iput v6, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1976
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v10, v27

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1977
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v11

    sub-float v11, v6, v11

    mul-float v11, v11, v17

    add-float v13, v15, v11

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1978
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v11

    sub-float v11, v10, v11

    mul-float v11, v11, v4

    add-float v13, v15, v11

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1979
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 1980
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1983
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v11, v11, Landroid/graphics/PointF;->x:F

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1984
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v11, v11, Landroid/graphics/PointF;->y:F

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1985
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v11, v11, Landroid/graphics/PointF;->x:F

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v12

    sub-float/2addr v11, v12

    mul-float v11, v11, v17

    add-float v13, v15, v11

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1986
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iget-object v11, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v11, v11, Landroid/graphics/PointF;->y:F

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v12

    sub-float/2addr v11, v12

    mul-float v11, v11, v4

    add-float v13, v15, v11

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1987
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 1988
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 1991
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v9, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 1992
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v8, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 1993
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v11

    sub-float v11, v9, v11

    mul-float v11, v11, v17

    add-float v13, v15, v11

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 1994
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v11

    sub-float v11, v8, v11

    mul-float v11, v11, v4

    add-float v13, v15, v11

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 1995
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v11, v24

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 1996
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2000
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2003
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v12, v26

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2004
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    move/from16 v13, v25

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2005
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v19

    sub-float v12, v12, v19

    mul-float v12, v12, v17

    add-float/2addr v12, v15

    iput v12, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2006
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v12

    sub-float v12, v13, v12

    mul-float v12, v12, v4

    add-float v13, v15, v12

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2007
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v11, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 2008
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2011
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v6, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    .line 2012
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v10, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    .line 2013
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v12

    sub-float/2addr v6, v12

    mul-float v6, v6, v17

    add-float v13, v15, v6

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    .line 2014
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v6

    sub-float/2addr v10, v6

    mul-float v10, v10, v4

    add-float v13, v15, v10

    iput v13, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    .line 2015
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    iput v2, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    .line 2016
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->v1:Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;

    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V

    .line 2019
    iget v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    add-int/lit8 v3, v3, 0x2

    iput v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->updateParticleCount:I

    .line 2021
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    .line 2022
    iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->tmpPathPointOut:Landroid/graphics/PointF;

    iget v10, v6, Landroid/graphics/PointF;->y:F

    add-int/lit8 v12, v16, 0x1

    move/from16 v13, v18

    move v11, v3

    const/high16 v3, -0x40400000    # -1.5f

    goto/16 :goto_1

    :cond_4
    return-void
.end method

.method protected updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;)V
    .locals 2

    .line 2336
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2337
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2338
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2339
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2340
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2341
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->swapRB(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(I)V

    return-void
.end method

.method protected updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;FFF[II)V
    .locals 1

    .line 2407
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2408
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    invoke-virtual {p2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2409
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    invoke-virtual {p2, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2410
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget p3, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    invoke-virtual {p2, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2411
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2412
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    aget p2, p5, p6

    invoke-direct {p0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->swapRB(I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(I)V

    return-void
.end method

.method protected updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;I)V
    .locals 2

    .line 2350
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posX:F

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2351
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posY:F

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2352
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2353
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2354
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2355
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->colorRgba:I

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/GraphicsUtils;->setIntColorAlpha(II)I

    move-result p1

    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->swapRB(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(I)V

    return-void
.end method

.method protected updateStreamWrite(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[F[II)V
    .locals 3

    .line 2366
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    mul-int/lit8 v1, p4, 0x2

    aget v2, p2, v1

    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2367
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    add-int/lit8 v1, v1, 0x1

    aget p2, p2, v1

    invoke-virtual {v0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2368
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->posZ:F

    invoke-virtual {p2, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2369
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texX:F

    invoke-virtual {p2, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2370
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    iget p1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;->texY:F

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2371
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    aget p2, p3, p4

    invoke-direct {p0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->swapRB(I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(I)V

    return-void
.end method

.method protected updateStreamWrite1ColZin8(Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer$Vertex;[FFF[II)V
    .locals 1

    .line 2393
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    mul-int/lit8 p6, p6, 0x2

    aget v0, p2, p6

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2394
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    add-int/lit8 p6, p6, 0x1

    aget p6, p2, p6

    invoke-virtual {p1, p6}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2395
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    const/16 p6, 0x8

    aget p2, p2, p6

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2396
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2397
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    invoke-virtual {p1, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(F)V

    .line 2398
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->vertices:Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;

    const/4 p2, 0x0

    aget p2, p5, p2

    invoke-direct {p0, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/BufferRenderer;->swapRB(I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VBOVertexBuffer;->put(I)V

    return-void
.end method
