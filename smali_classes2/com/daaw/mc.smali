.class public Lcom/daaw/mc;
.super Lcom/daaw/rv;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public p:F

.field public q:F

.field public r:F

.field public s:F

.field public t:F


# virtual methods
.method public b(FFFLcom/daaw/ic1;)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v9, p4

    iget v2, v0, Lcom/daaw/mc;->r:F

    const/4 v10, 0x0

    cmpl-float v3, v2, v10

    if-nez v3, :cond_0

    invoke-virtual {v9, v1, v10}, Lcom/daaw/ic1;->m(FF)V

    return-void

    :cond_0
    iget v3, v0, Lcom/daaw/mc;->q:F

    const/high16 v11, 0x40000000    # 2.0f

    mul-float v3, v3, v11

    add-float/2addr v3, v2

    div-float v12, v3, v11

    iget v2, v0, Lcom/daaw/mc;->p:F

    mul-float v13, p3, v2

    iget v2, v0, Lcom/daaw/mc;->t:F

    add-float v14, p2, v2

    iget v2, v0, Lcom/daaw/mc;->s:F

    mul-float v2, v2, p3

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v4, v3, p3

    mul-float v4, v4, v12

    add-float v15, v2, v4

    div-float v2, v15, v12

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_1

    invoke-virtual {v9, v1, v10}, Lcom/daaw/ic1;->m(FF)V

    return-void

    :cond_1
    add-float v2, v12, v13

    mul-float v2, v2, v2

    add-float v3, v15, v13

    mul-float v4, v3, v3

    sub-float/2addr v2, v4

    float-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-float v2, v4

    sub-float v4, v14, v2

    add-float v16, v14, v2

    div-float/2addr v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->atan(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v2

    double-to-float v8, v2

    const/high16 v2, 0x42b40000    # 90.0f

    sub-float v17, v2, v8

    invoke-virtual {v9, v4, v10}, Lcom/daaw/ic1;->m(FF)V

    sub-float v3, v4, v13

    const/4 v5, 0x0

    add-float v6, v4, v13

    mul-float v18, v13, v11

    const/high16 v7, 0x43870000    # 270.0f

    move-object/from16 v2, p4

    move v4, v5

    move v5, v6

    move/from16 v6, v18

    move/from16 v19, v8

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/ic1;->a(FFFFFF)V

    sub-float v3, v14, v12

    neg-float v2, v12

    sub-float v4, v2, v15

    add-float v5, v14, v12

    sub-float v6, v12, v15

    const/high16 v2, 0x43340000    # 180.0f

    sub-float v7, v2, v17

    mul-float v17, v17, v11

    sub-float v8, v17, v2

    move-object/from16 v2, p4

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/ic1;->a(FFFFFF)V

    sub-float v3, v16, v13

    const/4 v4, 0x0

    add-float v5, v16, v13

    const/high16 v2, 0x43870000    # 270.0f

    sub-float v7, v2, v19

    move-object/from16 v2, p4

    move/from16 v6, v18

    move/from16 v8, v19

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/ic1;->a(FFFFFF)V

    invoke-virtual {v9, v1, v10}, Lcom/daaw/ic1;->m(FF)V

    return-void
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lcom/daaw/mc;->s:F

    return v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lcom/daaw/mc;->q:F

    return v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, Lcom/daaw/mc;->p:F

    return v0
.end method

.method public f()F
    .locals 1

    iget v0, p0, Lcom/daaw/mc;->r:F

    return v0
.end method

.method public i(F)V
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    iput p1, p0, Lcom/daaw/mc;->s:F

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "cradleVerticalOffset must be positive."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/mc;->q:F

    return-void
.end method

.method public k(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/mc;->p:F

    return-void
.end method

.method public m(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/mc;->r:F

    return-void
.end method

.method public n(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/mc;->t:F

    return-void
.end method
