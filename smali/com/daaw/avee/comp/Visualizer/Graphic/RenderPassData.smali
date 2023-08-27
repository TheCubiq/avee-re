.class public Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;
.super Ljava/lang/Object;
.source "RenderPassData.java"


# instance fields
.field private atlasTex:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

.field public currentBlendMode:I

.field public currentShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

.field public currentShaderBindCb:Lcom/daaw/avee/Common/Action3;
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

.field private currentTexture:[Lmdesl/graphics/ITexture;

.field private texWrapMode:I

.field private textureIsFlipped:[Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [Lmdesl/graphics/ITexture;

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 18
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentTexture:[Lmdesl/graphics/ITexture;

    new-array v0, v0, [Z

    .line 23
    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->textureIsFlipped:[Z

    .line 65
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->setToEmpty()V

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;",
            "Lcom/daaw/avee/Common/Action3<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ">;)V"
        }
    .end annotation

    const/4 v5, 0x1

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 27
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;I)V

    return-void
.end method

.method public constructor <init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;",
            "Lcom/daaw/avee/Common/Action3<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ">;I)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [Lmdesl/graphics/ITexture;

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v4, 0x1

    aput-object v2, v1, v4

    .line 18
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentTexture:[Lmdesl/graphics/ITexture;

    new-array v0, v0, [Z

    .line 23
    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->textureIsFlipped:[Z

    .line 32
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentBlendMode:I

    if-eqz p2, :cond_0

    .line 33
    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getTexture2D()Lmdesl/graphics/ITexture;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    aput-object p1, v1, v3

    .line 34
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentTexture:[Lmdesl/graphics/ITexture;

    aput-object v2, p1, v4

    .line 35
    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 36
    iput-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShaderBindCb:Lcom/daaw/avee/Common/Action3;

    .line 37
    iput p5, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->texWrapMode:I

    .line 38
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->textureIsFlipped:[Z

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->isFlipped()Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, 0x1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    aput-boolean p3, p1, v3

    .line 39
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->textureIsFlipped:[Z

    aget-boolean p3, p1, v3

    aput-boolean p3, p1, v4

    if-eqz p2, :cond_2

    goto :goto_2

    .line 41
    :cond_2
    sget-object p2, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->errorTexture:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    :goto_2
    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->atlasTex:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;",
            "Lcom/daaw/avee/Common/Action3<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ">;)V"
        }
    .end annotation

    const/4 v5, 0x1

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 46
    invoke-direct/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;I)V

    return-void
.end method

.method public constructor <init>(I[Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;",
            "Lcom/daaw/avee/Common/Action3<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ">;I)V"
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [Lmdesl/graphics/ITexture;

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v4, 0x1

    aput-object v2, v1, v4

    .line 18
    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentTexture:[Lmdesl/graphics/ITexture;

    new-array v0, v0, [Z

    .line 23
    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->textureIsFlipped:[Z

    .line 51
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentBlendMode:I

    .line 52
    aget-object p1, p2, v3

    if-eqz p1, :cond_0

    aget-object p1, p2, v3

    invoke-interface {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getTexture2D()Lmdesl/graphics/ITexture;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    aput-object p1, v1, v3

    .line 53
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentTexture:[Lmdesl/graphics/ITexture;

    aget-object v0, p2, v4

    if-eqz v0, :cond_1

    aget-object v0, p2, v4

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->getTexture2D()Lmdesl/graphics/ITexture;

    move-result-object v2

    :cond_1
    aput-object v2, p1, v4

    .line 54
    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 55
    iput-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShaderBindCb:Lcom/daaw/avee/Common/Action3;

    .line 56
    iput p5, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->texWrapMode:I

    .line 57
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->textureIsFlipped:[Z

    aget-object p3, p2, v3

    if-eqz p3, :cond_2

    aget-object p3, p2, v3

    invoke-interface {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->isFlipped()Z

    move-result p3

    if-eqz p3, :cond_2

    const/4 p3, 0x1

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    :goto_1
    aput-boolean p3, p1, v3

    .line 58
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->textureIsFlipped:[Z

    aget-object p3, p2, v4

    if-eqz p3, :cond_3

    aget-object p3, p2, v4

    invoke-interface {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->isFlipped()Z

    move-result p3

    if-eqz p3, :cond_3

    const/4 p3, 0x1

    goto :goto_2

    :cond_3
    const/4 p3, 0x0

    :goto_2
    aput-boolean p3, p1, v4

    .line 60
    aget-object p1, p2, v3

    if-eqz p1, :cond_4

    aget-object p1, p2, v3

    goto :goto_3

    :cond_4
    sget-object p1, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->errorTexture:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    :goto_3
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->atlasTex:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
    .end array-data
.end method


# virtual methods
.method public assignFrom(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V
    .locals 4

    .line 69
    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentBlendMode:I

    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentBlendMode:I

    .line 70
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    .line 71
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShaderBindCb:Lcom/daaw/avee/Common/Action3;

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShaderBindCb:Lcom/daaw/avee/Common/Action3;

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 72
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentTexture:[Lmdesl/graphics/ITexture;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 73
    iget-object v3, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentTexture:[Lmdesl/graphics/ITexture;

    aget-object v3, v3, v1

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 75
    :cond_0
    iget v1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->texWrapMode:I

    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->texWrapMode:I

    .line 76
    :goto_1
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->textureIsFlipped:[Z

    array-length v2, v1

    if-ge v0, v2, :cond_1

    .line 77
    iget-object v2, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->textureIsFlipped:[Z

    aget-boolean v2, v2, v0

    aput-boolean v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 79
    :cond_1
    iget-object p1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->atlasTex:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->atlasTex:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    return-void
.end method

.method public compare(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)Z
    .locals 4

    .line 83
    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentBlendMode:I

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentBlendMode:I

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    .line 85
    :cond_0
    iget v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->texWrapMode:I

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->texWrapMode:I

    if-eq v0, v1, :cond_1

    return v2

    .line 87
    :cond_1
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->compareNullEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v2

    .line 89
    :cond_2
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShaderBindCb:Lcom/daaw/avee/Common/Action3;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShaderBindCb:Lcom/daaw/avee/Common/Action3;

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->compareNullEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    return v2

    :cond_3
    const/4 v0, 0x0

    .line 92
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentTexture:[Lmdesl/graphics/ITexture;

    array-length v3, v1

    if-ge v0, v3, :cond_5

    .line 99
    aget-object v1, v1, v0

    iget-object v3, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentTexture:[Lmdesl/graphics/ITexture;

    aget-object v3, v3, v0

    invoke-static {v1, v3}, Lcom/daaw/avee/Common/Utils;->compareNullEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method public getTexture(I)Lmdesl/graphics/ITexture;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentTexture:[Lmdesl/graphics/ITexture;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public getTextureCount()I
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentTexture:[Lmdesl/graphics/ITexture;

    array-length v0, v0

    return v0
.end method

.method public getTextureIsFlipped(I)Z
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->textureIsFlipped:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public getTexturePrimary()Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->atlasTex:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    return-object v0
.end method

.method public getTextureWrapMode()I
    .locals 1

    .line 165
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->texWrapMode:I

    return v0
.end method

.method public setToEmpty()V
    .locals 5

    const/4 v0, 0x0

    .line 114
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShaderBindCb:Lcom/daaw/avee/Common/Action3;

    .line 115
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    const/4 v1, 0x0

    .line 116
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentBlendMode:I

    const/4 v2, 0x0

    .line 117
    :goto_0
    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->currentTexture:[Lmdesl/graphics/ITexture;

    array-length v4, v3

    if-ge v2, v4, :cond_0

    aput-object v0, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 118
    :goto_1
    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->textureIsFlipped:[Z

    array-length v3, v2

    if-ge v0, v3, :cond_1

    aput-boolean v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 120
    :cond_1
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->errorTexture:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->atlasTex:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    const/4 v0, 0x2

    .line 121
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->texWrapMode:I

    return-void
.end method

.method public translateU(F)F
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->atlasTex:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateU(F)F

    move-result p1

    return p1
.end method

.method public translateV(F)F
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->atlasTex:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateV(F)F

    move-result p1

    return p1
.end method

.method public translateW()F
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->atlasTex:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateW()F

    move-result v0

    return v0
.end method

.method public translateW(F)F
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;->atlasTex:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->translateW(F)F

    move-result p1

    return p1
.end method
