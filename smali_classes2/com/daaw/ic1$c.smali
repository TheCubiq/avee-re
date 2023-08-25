.class public Lcom/daaw/ic1$c;
.super Lcom/daaw/ic1$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ic1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final b:Lcom/daaw/ic1$e;

.field public final c:F

.field public final d:F


# direct methods
.method public constructor <init>(Lcom/daaw/ic1$e;FF)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ic1$g;-><init>()V

    iput-object p1, p0, Lcom/daaw/ic1$c;->b:Lcom/daaw/ic1$e;

    iput p2, p0, Lcom/daaw/ic1$c;->c:F

    iput p3, p0, Lcom/daaw/ic1$c;->d:F

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Matrix;Lcom/daaw/ec1;ILandroid/graphics/Canvas;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/ic1$c;->b:Lcom/daaw/ic1$e;

    invoke-static {v0}, Lcom/daaw/ic1$e;->d(Lcom/daaw/ic1$e;)F

    move-result v0

    iget v1, p0, Lcom/daaw/ic1$c;->d:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/daaw/ic1$c;->b:Lcom/daaw/ic1$e;

    invoke-static {v1}, Lcom/daaw/ic1$e;->b(Lcom/daaw/ic1$e;)F

    move-result v1

    iget v2, p0, Lcom/daaw/ic1$c;->c:F

    sub-float/2addr v1, v2

    new-instance v2, Landroid/graphics/RectF;

    float-to-double v3, v0

    float-to-double v0, v1

    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-float v0, v0

    const/4 v1, 0x0

    invoke-direct {v2, v1, v1, v0, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0, p1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iget p1, p0, Lcom/daaw/ic1$c;->c:F

    iget v1, p0, Lcom/daaw/ic1$c;->d:F

    invoke-virtual {v0, p1, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    invoke-virtual {p0}, Lcom/daaw/ic1$c;->c()F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->preRotate(F)Z

    invoke-virtual {p2, p4, v0, v2, p3}, Lcom/daaw/ec1;->b(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Landroid/graphics/RectF;I)V

    return-void
.end method

.method public c()F
    .locals 3

    iget-object v0, p0, Lcom/daaw/ic1$c;->b:Lcom/daaw/ic1$e;

    invoke-static {v0}, Lcom/daaw/ic1$e;->d(Lcom/daaw/ic1$e;)F

    move-result v0

    iget v1, p0, Lcom/daaw/ic1$c;->d:F

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/daaw/ic1$c;->b:Lcom/daaw/ic1$e;

    invoke-static {v1}, Lcom/daaw/ic1$e;->b(Lcom/daaw/ic1$e;)F

    move-result v1

    iget v2, p0, Lcom/daaw/ic1$c;->c:F

    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method
