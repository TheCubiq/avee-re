.class Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture$ErrorTexture;
.super Ljava/lang/Object;
.source "AtlasTexture.java"

# interfaces
.implements Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ErrorTexture"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 0

    return-void
.end method

.method public getHeight()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getSub(FFFF)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 0

    return-object p0
.end method

.method public getSub(IIII)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 0

    return-object p0
.end method

.method public getSubZ(F)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 0

    return-object p0
.end method

.method public getSubZ(I)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 0

    return-object p0
.end method

.method public getTexture2D()Lmdesl/graphics/ITexture;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isFlipped()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public translateU(F)F
    .locals 0

    const/high16 p1, 0x3f800000    # 1.0f

    return p1
.end method

.method public translateV(F)F
    .locals 0

    const/high16 p1, 0x3f800000    # 1.0f

    return p1
.end method

.method public translateW()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public translateW(F)F
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
