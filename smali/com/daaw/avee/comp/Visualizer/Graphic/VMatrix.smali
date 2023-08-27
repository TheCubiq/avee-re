.class public Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;
.super Ljava/lang/Object;
.source "VMatrix.java"


# instance fields
.field private matrix:[F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [F

    .line 14
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->matrix:[F

    return-void
.end method

.method public static multiply([FLcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;[F)V
    .locals 6

    .line 38
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object v2

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMV([FI[FI[FI)V

    return-void
.end method

.method public static multiplyNormalizeW([FLcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;[F)V
    .locals 6

    .line 46
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object v2

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMV([FI[FI[FI)V

    const/4 p1, 0x0

    .line 48
    aget p2, p0, p1

    const/4 v0, 0x3

    aget v1, p0, v0

    div-float/2addr p2, v1

    aput p2, p0, p1

    const/4 p1, 0x1

    .line 49
    aget p2, p0, p1

    aget v1, p0, v0

    div-float/2addr p2, v1

    aput p2, p0, p1

    const/4 p1, 0x2

    .line 50
    aget p2, p0, p1

    aget v0, p0, v0

    div-float/2addr p2, v0

    aput p2, p0, p1

    return-void
.end method


# virtual methods
.method public getObj()[F
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->matrix:[F

    return-object v0
.end method

.method public multiply(Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;)V
    .locals 6

    .line 30
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object v2

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->getObj()[F

    move-result-object v4

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method public rotateZDeg(F)V
    .locals 6

    .line 26
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->matrix:[F

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    move v2, p1

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    return-void
.end method

.method public setIdentity()V
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->matrix:[F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    return-void
.end method

.method public translate(FFF)V
    .locals 2

    .line 22
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;->matrix:[F

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, p2, p3}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    return-void
.end method
