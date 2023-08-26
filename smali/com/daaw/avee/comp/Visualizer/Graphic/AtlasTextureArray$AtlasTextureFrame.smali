.class Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;
.super Ljava/lang/Object;
.source "AtlasTextureArray.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AtlasTextureFrame"
.end annotation


# instance fields
.field final frame:I

.field final parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;I)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    .line 20
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->frame:I

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 0

    return-void
.end method

.method public getHeight()I
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->getHeight()I

    move-result v0

    return v0
.end method

.method public getSub(FFFF)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->getSub(FFFF)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object p1

    return-object p1
.end method

.method public getSub(IIII)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->getSub(IIII)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object p1

    return-object p1
.end method

.method public getSubZ(F)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->getSubZ(F)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object p1

    return-object p1
.end method

.method public getSubZ(I)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->getSubZ(I)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object p1

    return-object p1
.end method

.method public getTexture2D()Lmdesl/graphics/ITexture;
    .locals 2

    .line 60
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    iget v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->frame:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->getTexture2D(I)Lmdesl/graphics/ITexture;

    move-result-object v0

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->getWidth()I

    move-result v0

    return v0
.end method

.method public isFlipped()Z
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->isFlipped()Z

    move-result v0

    return v0
.end method

.method public translateU(F)F
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->translateU(F)F

    move-result p1

    return p1
.end method

.method public translateV(F)F
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->translateV(F)F

    move-result p1

    return p1
.end method

.method public translateW()F
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->translateW()F

    move-result v0

    return v0
.end method

.method public translateW(F)F
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray$AtlasTextureFrame;->parent:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->translateU(F)F

    move-result p1

    return p1
.end method
