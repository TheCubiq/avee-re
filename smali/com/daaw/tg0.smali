.class public Lcom/daaw/tg0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(FFD)F
    .locals 0

    sub-float/2addr p1, p0

    double-to-float p2, p2

    mul-float p1, p1, p2

    add-float/2addr p0, p1

    return p0
.end method

.method public static b(Lcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/bs1;D)V
    .locals 2

    iget v0, p1, Lcom/daaw/bs1;->a:F

    iget v1, p2, Lcom/daaw/bs1;->a:F

    sub-float/2addr v1, v0

    double-to-float p3, p3

    mul-float v1, v1, p3

    add-float/2addr v0, v1

    iput v0, p0, Lcom/daaw/bs1;->a:F

    iget p1, p1, Lcom/daaw/bs1;->b:F

    iget p2, p2, Lcom/daaw/bs1;->b:F

    sub-float/2addr p2, p1

    mul-float p2, p2, p3

    add-float/2addr p1, p2

    iput p1, p0, Lcom/daaw/bs1;->b:F

    return-void
.end method
