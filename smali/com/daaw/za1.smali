.class public Lcom/daaw/za1;
.super Lcom/daaw/xa1;
.source ""

# interfaces
.implements Lcom/daaw/t40;
.implements Lcom/daaw/u40;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/xa1;",
        "Lcom/daaw/t40<",
        "Ljava/lang/Integer;",
        "[F[I",
        "Ljava/lang/Boolean;",
        ">;",
        "Lcom/daaw/u40<",
        "Ljava/lang/Integer;",
        "[F[I[F",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public A:Lcom/daaw/he0$a;

.field public B:[Lcom/daaw/he0$a;

.field public C:Lcom/daaw/bs1;

.field public D:Lcom/daaw/bs1;

.field public E:Lcom/daaw/bs1;

.field public F:Lcom/daaw/bs1;

.field public G:Lcom/daaw/bs1;

.field public H:Lcom/daaw/bs1;

.field public I:Lcom/daaw/bs1;

.field public J:Lcom/daaw/bs1;

.field public K:Lcom/daaw/bs1;

.field public L:Lcom/daaw/bs1;

.field public M:Lcom/daaw/bs1;

.field public N:Lcom/daaw/bs1;

.field public O:Z

.field public P:Z

.field public Q:F

.field public h:Landroid/graphics/PointF;

.field public i:Landroid/graphics/PointF;

.field public j:Landroid/graphics/PointF;

.field public k:Lcom/daaw/bs1;

.field public l:Lcom/daaw/bs1;

.field public m:Lcom/daaw/bs1;

.field public n:Lcom/daaw/bs1;

.field public o:F

.field public p:F

.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:F

.field public w:F

.field public x:Lcom/daaw/he0$a;

.field public y:Lcom/daaw/he0$a;

.field public z:Lcom/daaw/he0$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/xa1;-><init>()V

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/za1;->h:Landroid/graphics/PointF;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/za1;->i:Landroid/graphics/PointF;

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/daaw/za1;->j:Landroid/graphics/PointF;

    new-instance v0, Lcom/daaw/bs1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->k:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->l:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->m:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->n:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->C:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->D:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->E:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->F:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->G:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->H:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->I:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->J:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->K:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->L:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->M:Lcom/daaw/bs1;

    new-instance v0, Lcom/daaw/bs1;

    invoke-direct {v0, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v0, p0, Lcom/daaw/za1;->N:Lcom/daaw/bs1;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/za1;->O:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/za1;->P:Z

    iput v1, p0, Lcom/daaw/za1;->Q:F

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/xa1;->a(Lcom/daaw/un;)V

    const-string v0, "mirror"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/za1;->O:Z

    const-string v0, "flipEveryOther"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/za1;->P:Z

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, [F

    check-cast p3, [I

    check-cast p4, [F

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/za1;->v(Ljava/lang/Integer;[F[I[F)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, [F

    check-cast p3, [I

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/za1;->u(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public m(Lcom/daaw/de0;[Lcom/daaw/he0$a;FFIF)V
    .locals 15

    move-object v10, p0

    move-object/from16 v0, p2

    iput-object v0, v10, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    move/from16 v1, p4

    iput v1, v10, Lcom/daaw/za1;->w:F

    move/from16 v1, p6

    iput v1, v10, Lcom/daaw/za1;->Q:F

    array-length v3, v0

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->h()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v1, Lcom/daaw/w31;

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/de0$a;->f()Lcom/daaw/z6;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x2

    move-object v4, v1

    move/from16 v5, p5

    invoke-direct/range {v4 .. v9}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v7, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_1
    iget-object v4, v10, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    array-length v5, v4

    if-ge v2, v5, :cond_9

    aget-object v5, v4, v2

    iput-object v5, v10, Lcom/daaw/za1;->x:Lcom/daaw/he0$a;

    iget v6, v5, Lcom/daaw/he0$a;->a:I

    if-gez v6, :cond_1

    move-object v6, v5

    goto :goto_2

    :cond_1
    aget-object v6, v4, v6

    :goto_2
    iput-object v6, v10, Lcom/daaw/za1;->z:Lcom/daaw/he0$a;

    iget v8, v5, Lcom/daaw/he0$a;->b:I

    if-gez v8, :cond_2

    move-object v4, v5

    goto :goto_3

    :cond_2
    aget-object v4, v4, v8

    :goto_3
    iput-object v4, v10, Lcom/daaw/za1;->A:Lcom/daaw/he0$a;

    iget v8, v5, Lcom/daaw/he0$a;->d:F

    iget v9, v6, Lcom/daaw/he0$a;->d:F

    iget v11, v4, Lcom/daaw/he0$a;->d:F

    iget-boolean v11, v10, Lcom/daaw/za1;->P:Z

    if-eqz v11, :cond_4

    rem-int/lit8 v11, v2, 0x2

    const/high16 v12, -0x40800000    # -1.0f

    if-nez v11, :cond_3

    mul-float v8, v8, v12

    goto :goto_4

    :cond_3
    mul-float v9, v9, v12

    :cond_4
    :goto_4
    iget-object v11, v10, Lcom/daaw/za1;->h:Landroid/graphics/PointF;

    iget v12, v6, Lcom/daaw/he0$a;->e:F

    iput v12, v11, Landroid/graphics/PointF;->x:F

    iget v12, v6, Lcom/daaw/he0$a;->f:F

    iput v12, v11, Landroid/graphics/PointF;->y:F

    iget-object v12, v10, Lcom/daaw/za1;->i:Landroid/graphics/PointF;

    iget v13, v5, Lcom/daaw/he0$a;->e:F

    iput v13, v12, Landroid/graphics/PointF;->x:F

    iget v13, v5, Lcom/daaw/he0$a;->f:F

    iput v13, v12, Landroid/graphics/PointF;->y:F

    iget-object v13, v10, Lcom/daaw/za1;->j:Landroid/graphics/PointF;

    iget v14, v4, Lcom/daaw/he0$a;->e:F

    iput v14, v13, Landroid/graphics/PointF;->x:F

    iget v4, v4, Lcom/daaw/he0$a;->f:F

    iput v4, v13, Landroid/graphics/PointF;->y:F

    const/high16 v4, -0x40000000    # -2.0f

    mul-float v9, v9, v4

    iget v13, v10, Lcom/daaw/za1;->w:F

    mul-float v9, v9, v13

    iget v14, v10, Lcom/daaw/xa1;->f:F

    mul-float v9, v9, v14

    mul-float v8, v8, v4

    mul-float v8, v8, v13

    mul-float v8, v8, v14

    iget-boolean v4, v10, Lcom/daaw/za1;->O:Z

    if-eqz v4, :cond_5

    iget v4, v11, Landroid/graphics/PointF;->x:F

    iget v13, v6, Lcom/daaw/he0$a;->g:F

    mul-float v13, v13, v9

    sub-float/2addr v4, v13

    iput v4, v11, Landroid/graphics/PointF;->x:F

    iget v4, v11, Landroid/graphics/PointF;->y:F

    iget v6, v6, Lcom/daaw/he0$a;->h:F

    mul-float v6, v6, v9

    sub-float/2addr v4, v6

    iput v4, v11, Landroid/graphics/PointF;->y:F

    iget v4, v12, Landroid/graphics/PointF;->x:F

    iget v6, v5, Lcom/daaw/he0$a;->g:F

    mul-float v6, v6, v8

    sub-float/2addr v4, v6

    iput v4, v12, Landroid/graphics/PointF;->x:F

    iget v4, v12, Landroid/graphics/PointF;->y:F

    iget v6, v5, Lcom/daaw/he0$a;->h:F

    mul-float v6, v6, v8

    sub-float/2addr v4, v6

    iput v4, v12, Landroid/graphics/PointF;->y:F

    float-to-double v8, v8

    const-wide/high16 v13, 0x4000000000000000L    # 2.0

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v13

    double-to-float v8, v8

    :cond_5
    iget-boolean v4, v10, Lcom/daaw/xa1;->d:Z

    const/4 v6, 0x0

    const/4 v9, 0x1

    if-nez v4, :cond_7

    cmpg-float v4, v8, v6

    if-gez v4, :cond_6

    :goto_5
    const/4 v4, 0x1

    goto :goto_6

    :cond_6
    const/4 v4, 0x0

    goto :goto_6

    :cond_7
    iget v4, v10, Lcom/daaw/xa1;->e:F

    cmpl-float v4, v4, v6

    if-lez v4, :cond_6

    goto :goto_5

    :goto_6
    if-eqz v4, :cond_8

    iget v4, v12, Landroid/graphics/PointF;->x:F

    iput v4, v10, Lcom/daaw/za1;->s:F

    iget v6, v12, Landroid/graphics/PointF;->y:F

    iput v6, v10, Lcom/daaw/za1;->t:F

    iget v11, v5, Lcom/daaw/he0$a;->g:F

    mul-float v11, v11, v8

    add-float/2addr v11, v4

    iput v11, v10, Lcom/daaw/za1;->u:F

    iget v12, v5, Lcom/daaw/he0$a;->h:F

    mul-float v12, v12, v8

    add-float/2addr v12, v6

    iput v12, v10, Lcom/daaw/za1;->v:F

    iput-boolean v9, v5, Lcom/daaw/he0$a;->u:Z

    iput v11, v5, Lcom/daaw/he0$a;->s:F

    iput v12, v5, Lcom/daaw/he0$a;->t:F

    iput v11, v5, Lcom/daaw/he0$a;->k:F

    iput v12, v5, Lcom/daaw/he0$a;->l:F

    iput v4, v5, Lcom/daaw/he0$a;->m:F

    iput v6, v5, Lcom/daaw/he0$a;->n:F

    goto :goto_7

    :cond_8
    iget v4, v12, Landroid/graphics/PointF;->x:F

    iput v4, v10, Lcom/daaw/za1;->u:F

    iget v6, v12, Landroid/graphics/PointF;->y:F

    iput v6, v10, Lcom/daaw/za1;->v:F

    iget v9, v5, Lcom/daaw/he0$a;->g:F

    mul-float v9, v9, v8

    add-float/2addr v9, v4

    iput v9, v10, Lcom/daaw/za1;->s:F

    iget v11, v5, Lcom/daaw/he0$a;->h:F

    mul-float v11, v11, v8

    add-float/2addr v11, v6

    iput v11, v10, Lcom/daaw/za1;->t:F

    iput-boolean v1, v5, Lcom/daaw/he0$a;->u:Z

    iput v9, v5, Lcom/daaw/he0$a;->s:F

    iput v11, v5, Lcom/daaw/he0$a;->t:F

    iput v4, v5, Lcom/daaw/he0$a;->k:F

    iput v6, v5, Lcom/daaw/he0$a;->l:F

    iput v9, v5, Lcom/daaw/he0$a;->m:F

    iput v11, v5, Lcom/daaw/he0$a;->n:F

    :goto_7
    iget v4, v5, Lcom/daaw/he0$a;->k:F

    iput v4, v5, Lcom/daaw/he0$a;->o:F

    iget v4, v5, Lcom/daaw/he0$a;->l:F

    iput v4, v5, Lcom/daaw/he0$a;->p:F

    iget v4, v5, Lcom/daaw/he0$a;->m:F

    iput v4, v5, Lcom/daaw/he0$a;->q:F

    iget v4, v5, Lcom/daaw/he0$a;->n:F

    iput v4, v5, Lcom/daaw/he0$a;->r:F

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    :cond_9
    iget-boolean v2, v10, Lcom/daaw/xa1;->d:Z

    if-eqz v2, :cond_b

    const/4 v2, 0x0

    :goto_8
    iget-object v4, v10, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    array-length v5, v4

    if-ge v2, v5, :cond_b

    aget-object v4, v4, v2

    iput-object v4, v10, Lcom/daaw/za1;->x:Lcom/daaw/he0$a;

    iget-object v5, v10, Lcom/daaw/za1;->n:Lcom/daaw/bs1;

    iget v6, v10, Lcom/daaw/xa1;->e:F

    invoke-virtual {p0, v4, v5, v6, v1}, Lcom/daaw/za1;->w(Lcom/daaw/he0$a;Lcom/daaw/bs1;FI)V

    iget-object v4, v10, Lcom/daaw/za1;->x:Lcom/daaw/he0$a;

    iget-boolean v5, v4, Lcom/daaw/he0$a;->u:Z

    if-eqz v5, :cond_a

    iget v5, v4, Lcom/daaw/he0$a;->s:F

    iget-object v6, v10, Lcom/daaw/za1;->n:Lcom/daaw/bs1;

    iget v8, v6, Lcom/daaw/bs1;->a:F

    add-float/2addr v5, v8

    iput v5, v4, Lcom/daaw/he0$a;->q:F

    iget v8, v4, Lcom/daaw/he0$a;->t:F

    iget v6, v6, Lcom/daaw/bs1;->b:F

    add-float/2addr v8, v6

    iput v8, v4, Lcom/daaw/he0$a;->r:F

    iput v5, v4, Lcom/daaw/he0$a;->m:F

    iput v8, v4, Lcom/daaw/he0$a;->n:F

    goto :goto_9

    :cond_a
    iget v5, v4, Lcom/daaw/he0$a;->s:F

    iget-object v6, v10, Lcom/daaw/za1;->n:Lcom/daaw/bs1;

    iget v8, v6, Lcom/daaw/bs1;->a:F

    add-float/2addr v5, v8

    iput v5, v4, Lcom/daaw/he0$a;->o:F

    iget v8, v4, Lcom/daaw/he0$a;->t:F

    iget v6, v6, Lcom/daaw/bs1;->b:F

    add-float/2addr v8, v6

    iput v8, v4, Lcom/daaw/he0$a;->p:F

    iput v5, v4, Lcom/daaw/he0$a;->k:F

    iput v8, v4, Lcom/daaw/he0$a;->l:F

    :goto_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_b
    if-eqz v0, :cond_c

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->j()Lcom/daaw/sc0;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v5

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v6

    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/de0$a;->c()Lcom/daaw/z6;

    move-result-object v7

    const/4 v9, 0x0

    move-object/from16 v1, p1

    move-object v2, p0

    move/from16 v8, p5

    invoke-interface/range {v0 .. v9}, Lcom/daaw/sc0;->c(Lcom/daaw/de0;Lcom/daaw/u40;IFLcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;ILcom/daaw/qr1;)V

    goto :goto_a

    :cond_c
    invoke-interface/range {p1 .. p1}, Lcom/daaw/de0;->j()Lcom/daaw/sc0;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object v5

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v6

    move-object/from16 v1, p1

    move-object v2, p0

    invoke-interface/range {v0 .. v7}, Lcom/daaw/sc0;->f(Lcom/daaw/de0;Lcom/daaw/t40;IFLcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    :goto_a
    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/daaw/xa1;->o(Lcom/daaw/un;)V

    iget-boolean v0, p0, Lcom/daaw/za1;->O:Z

    const-string v1, "mirror"

    const-string v2, "b"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-boolean v0, p0, Lcom/daaw/za1;->P:Z

    const-string v1, "flipEveryOther"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public u(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;
    .locals 10

    iget-object v0, p0, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/daaw/za1;->x:Lcom/daaw/he0$a;

    iget v0, v0, Lcom/daaw/he0$a;->a:I

    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    aget-object v2, v1, v0

    iput-object v2, p0, Lcom/daaw/za1;->z:Lcom/daaw/he0$a;

    array-length v1, v1

    iget v2, p0, Lcom/daaw/za1;->Q:F

    invoke-virtual {p0, v0, v1, v2}, Lcom/daaw/xa1;->q(IIF)I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v1, p0, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    array-length v1, v1

    iget v2, p0, Lcom/daaw/za1;->Q:F

    invoke-virtual {p0, p1, v1, v2}, Lcom/daaw/xa1;->q(IIF)I

    move-result p1

    const/4 v1, 0x0

    aput v0, p3, v1

    const/4 v0, 0x1

    aput p1, p3, v0

    aget p1, p3, v1

    const/4 v2, 0x2

    aput p1, p3, v2

    aget p1, p3, v0

    const/4 v3, 0x3

    aput p1, p3, v3

    iget-object p1, p0, Lcom/daaw/za1;->z:Lcom/daaw/he0$a;

    iget p3, p1, Lcom/daaw/he0$a;->o:F

    iput p3, p0, Lcom/daaw/za1;->q:F

    iget v4, p1, Lcom/daaw/he0$a;->p:F

    iput v4, p0, Lcom/daaw/za1;->r:F

    iget v5, p1, Lcom/daaw/he0$a;->q:F

    iput v5, p0, Lcom/daaw/za1;->o:F

    iget p1, p1, Lcom/daaw/he0$a;->r:F

    iput p1, p0, Lcom/daaw/za1;->p:F

    iget-object v6, p0, Lcom/daaw/za1;->x:Lcom/daaw/he0$a;

    iget v7, v6, Lcom/daaw/he0$a;->o:F

    iput v7, p0, Lcom/daaw/za1;->u:F

    iget v8, v6, Lcom/daaw/he0$a;->p:F

    iput v8, p0, Lcom/daaw/za1;->v:F

    iget v9, v6, Lcom/daaw/he0$a;->q:F

    iput v9, p0, Lcom/daaw/za1;->s:F

    iget v6, v6, Lcom/daaw/he0$a;->r:F

    iput v6, p0, Lcom/daaw/za1;->t:F

    aput p3, p2, v1

    aput v4, p2, v0

    aput v7, p2, v2

    aput v8, p2, v3

    const/4 p3, 0x4

    aput v5, p2, p3

    const/4 p3, 0x5

    aput p1, p2, p3

    const/4 p1, 0x6

    aput v9, p2, p1

    const/4 p1, 0x7

    aput v6, p2, p1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public v(Ljava/lang/Integer;[F[I[F)Ljava/lang/Boolean;
    .locals 18

    move-object/from16 v14, p0

    iget-object v0, v14, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, v14, Lcom/daaw/za1;->x:Lcom/daaw/he0$a;

    iget v0, v0, Lcom/daaw/he0$a;->a:I

    if-ltz v0, :cond_3

    iget-object v1, v14, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    aget-object v0, v1, v0

    iput-object v0, v14, Lcom/daaw/za1;->z:Lcom/daaw/he0$a;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, v14, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    array-length v1, v1

    iget v2, v14, Lcom/daaw/za1;->Q:F

    invoke-virtual {v14, v0, v1, v2}, Lcom/daaw/xa1;->q(IIF)I

    move-result v0

    const/4 v1, 0x1

    aput v0, p3, v1

    iget-object v0, v14, Lcom/daaw/za1;->x:Lcom/daaw/he0$a;

    iget v0, v0, Lcom/daaw/he0$a;->a:I

    iget-object v2, v14, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    array-length v2, v2

    iget v3, v14, Lcom/daaw/za1;->Q:F

    invoke-virtual {v14, v0, v2, v3}, Lcom/daaw/xa1;->q(IIF)I

    move-result v0

    const/4 v2, 0x0

    aput v0, p3, v2

    aget v0, p3, v2

    const/4 v3, 0x2

    aput v0, p3, v3

    aget v0, p3, v1

    const/4 v4, 0x3

    aput v0, p3, v4

    iget-object v0, v14, Lcom/daaw/za1;->z:Lcom/daaw/he0$a;

    iget v5, v0, Lcom/daaw/he0$a;->o:F

    iput v5, v14, Lcom/daaw/za1;->q:F

    iget v6, v0, Lcom/daaw/he0$a;->p:F

    iput v6, v14, Lcom/daaw/za1;->r:F

    iget v7, v0, Lcom/daaw/he0$a;->q:F

    iput v7, v14, Lcom/daaw/za1;->o:F

    iget v8, v0, Lcom/daaw/he0$a;->r:F

    iput v8, v14, Lcom/daaw/za1;->p:F

    iget-object v9, v14, Lcom/daaw/za1;->x:Lcom/daaw/he0$a;

    iget v10, v9, Lcom/daaw/he0$a;->o:F

    iput v10, v14, Lcom/daaw/za1;->u:F

    iget v11, v9, Lcom/daaw/he0$a;->p:F

    iput v11, v14, Lcom/daaw/za1;->v:F

    iget v12, v9, Lcom/daaw/he0$a;->q:F

    iput v12, v14, Lcom/daaw/za1;->s:F

    iget v13, v9, Lcom/daaw/he0$a;->r:F

    iput v13, v14, Lcom/daaw/za1;->t:F

    aput v5, p2, v2

    aput v6, p2, v1

    aput v10, p2, v3

    aput v11, p2, v4

    const/4 v1, 0x4

    aput v7, p2, v1

    const/4 v1, 0x5

    aput v8, p2, v1

    const/4 v1, 0x6

    aput v12, p2, v1

    const/4 v1, 0x7

    aput v13, p2, v1

    iget v0, v0, Lcom/daaw/he0$a;->a:I

    if-ltz v0, :cond_1

    iget-object v1, v14, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    aget-object v0, v1, v0

    iput-object v0, v14, Lcom/daaw/za1;->y:Lcom/daaw/he0$a;

    iget v2, v0, Lcom/daaw/he0$a;->o:F

    iget v3, v0, Lcom/daaw/he0$a;->p:F

    iget v4, v0, Lcom/daaw/he0$a;->q:F

    iget v0, v0, Lcom/daaw/he0$a;->r:F

    iget v9, v9, Lcom/daaw/he0$a;->b:I

    if-ltz v9, :cond_0

    aget-object v1, v1, v9

    iput-object v1, v14, Lcom/daaw/za1;->A:Lcom/daaw/he0$a;

    iget v9, v1, Lcom/daaw/he0$a;->o:F

    iget v15, v1, Lcom/daaw/he0$a;->p:F

    iget v14, v1, Lcom/daaw/he0$a;->q:F

    iget v1, v1, Lcom/daaw/he0$a;->r:F

    sub-float v3, v6, v3

    neg-float v3, v3

    sub-float v2, v5, v2

    sub-float v6, v11, v6

    neg-float v6, v6

    sub-float v5, v10, v5

    sub-float/2addr v15, v11

    neg-float v11, v15

    sub-float/2addr v9, v10

    sub-float v0, v8, v0

    neg-float v10, v0

    sub-float v15, v7, v4

    sub-float v0, v13, v8

    neg-float v8, v0

    sub-float v16, v12, v7

    sub-float/2addr v1, v13

    neg-float v13, v1

    sub-float v12, v14, v12

    move-object/from16 v0, p0

    move v1, v3

    move v3, v6

    move v4, v5

    move v5, v11

    move v6, v9

    move v7, v10

    move v9, v8

    move v8, v15

    move/from16 v10, v16

    move v11, v13

    move-object/from16 v13, p4

    invoke-virtual/range {v0 .. v13}, Lcom/daaw/za1;->x(FFFFFFFFFFFF[F)V

    goto :goto_0

    :cond_0
    sub-float v1, v6, v3

    neg-float v1, v1

    sub-float v2, v5, v2

    sub-float v3, v11, v6

    neg-float v3, v3

    sub-float v9, v10, v5

    sub-float/2addr v11, v6

    neg-float v6, v11

    sub-float/2addr v10, v5

    sub-float v0, v8, v0

    neg-float v11, v0

    sub-float v14, v7, v4

    sub-float v0, v13, v8

    neg-float v15, v0

    sub-float v16, v12, v7

    sub-float/2addr v13, v8

    neg-float v13, v13

    sub-float/2addr v12, v7

    move-object/from16 v0, p0

    move v4, v9

    move v5, v6

    move v6, v10

    move v7, v11

    move v8, v14

    move v9, v15

    move/from16 v10, v16

    move v11, v13

    move-object/from16 v13, p4

    invoke-virtual/range {v0 .. v13}, Lcom/daaw/za1;->x(FFFFFFFFFFFF[F)V

    :goto_0
    move-object/from16 v14, p0

    goto/16 :goto_1

    :cond_1
    iget v0, v9, Lcom/daaw/he0$a;->b:I

    move-object/from16 v14, p0

    if-ltz v0, :cond_2

    iget-object v1, v14, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    aget-object v0, v1, v0

    iput-object v0, v14, Lcom/daaw/za1;->A:Lcom/daaw/he0$a;

    iget v1, v0, Lcom/daaw/he0$a;->o:F

    iget v2, v0, Lcom/daaw/he0$a;->p:F

    iget v3, v0, Lcom/daaw/he0$a;->q:F

    iget v0, v0, Lcom/daaw/he0$a;->r:F

    sub-float v4, v11, v6

    neg-float v4, v4

    sub-float v9, v10, v5

    sub-float v6, v11, v6

    neg-float v6, v6

    sub-float v5, v10, v5

    sub-float/2addr v2, v11

    neg-float v15, v2

    sub-float v10, v1, v10

    sub-float v1, v13, v8

    neg-float v2, v1

    sub-float v16, v12, v7

    sub-float/2addr v13, v8

    neg-float v13, v13

    sub-float v17, v12, v7

    sub-float/2addr v0, v11

    neg-float v11, v0

    sub-float v12, v3, v12

    move-object/from16 v0, p0

    move v1, v4

    move v7, v2

    move v2, v9

    move v3, v6

    move v4, v5

    move v5, v15

    move v6, v10

    move/from16 v8, v16

    move v9, v13

    move/from16 v10, v17

    move-object/from16 v13, p4

    invoke-virtual/range {v0 .. v13}, Lcom/daaw/za1;->x(FFFFFFFFFFFF[F)V

    goto :goto_1

    :cond_2
    sub-float v0, v11, v6

    neg-float v1, v0

    sub-float v2, v10, v5

    sub-float v0, v11, v6

    neg-float v3, v0

    sub-float v4, v10, v5

    sub-float/2addr v11, v6

    neg-float v6, v11

    sub-float v9, v10, v5

    sub-float v0, v13, v8

    neg-float v10, v0

    sub-float v11, v12, v7

    sub-float v0, v13, v8

    neg-float v15, v0

    sub-float v16, v12, v7

    sub-float/2addr v13, v8

    neg-float v13, v13

    sub-float/2addr v12, v7

    move-object/from16 v0, p0

    move v5, v6

    move v6, v9

    move v7, v10

    move v8, v11

    move v9, v15

    move/from16 v10, v16

    move v11, v13

    move-object/from16 v13, p4

    invoke-virtual/range {v0 .. v13}, Lcom/daaw/za1;->x(FFFFFFFFFFFF[F)V

    :goto_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final w(Lcom/daaw/he0$a;Lcom/daaw/bs1;FI)V
    .locals 4

    iget v0, p1, Lcom/daaw/he0$a;->b:I

    if-gez v0, :cond_0

    iput-object p1, p0, Lcom/daaw/za1;->A:Lcom/daaw/he0$a;

    iget-object v0, p0, Lcom/daaw/za1;->l:Lcom/daaw/bs1;

    const/4 v1, 0x0

    iput v1, v0, Lcom/daaw/bs1;->a:F

    iput v1, v0, Lcom/daaw/bs1;->b:F

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    aget-object v0, v1, v0

    iput-object v0, p0, Lcom/daaw/za1;->A:Lcom/daaw/he0$a;

    iget-object v1, p0, Lcom/daaw/za1;->l:Lcom/daaw/bs1;

    invoke-virtual {v0, p4}, Lcom/daaw/he0$a;->b(I)F

    move-result v0

    invoke-virtual {p1, p4}, Lcom/daaw/he0$a;->b(I)F

    move-result v2

    sub-float/2addr v0, v2

    neg-float v0, v0

    iput v0, v1, Lcom/daaw/bs1;->a:F

    iget-object v0, p0, Lcom/daaw/za1;->l:Lcom/daaw/bs1;

    iget-object v1, p0, Lcom/daaw/za1;->A:Lcom/daaw/he0$a;

    invoke-virtual {v1, p4}, Lcom/daaw/he0$a;->a(I)F

    move-result v1

    invoke-virtual {p1, p4}, Lcom/daaw/he0$a;->a(I)F

    move-result v2

    sub-float/2addr v1, v2

    iput v1, v0, Lcom/daaw/bs1;->b:F

    iget-object v0, p0, Lcom/daaw/za1;->l:Lcom/daaw/bs1;

    invoke-virtual {v0}, Lcom/daaw/bs1;->o()Lcom/daaw/bs1;

    :goto_0
    iget v0, p1, Lcom/daaw/he0$a;->a:I

    if-gez v0, :cond_1

    iget-object p4, p0, Lcom/daaw/za1;->l:Lcom/daaw/bs1;

    iget v0, p4, Lcom/daaw/bs1;->a:F

    iput v0, p1, Lcom/daaw/he0$a;->i:F

    iget p4, p4, Lcom/daaw/bs1;->b:F

    iput p4, p1, Lcom/daaw/he0$a;->j:F

    mul-float v0, v0, p3

    iput v0, p2, Lcom/daaw/bs1;->a:F

    mul-float p4, p4, p3

    iput p4, p2, Lcom/daaw/bs1;->b:F

    return-void

    :cond_1
    iget-object v1, p0, Lcom/daaw/za1;->B:[Lcom/daaw/he0$a;

    aget-object v0, v1, v0

    iget-object v1, p0, Lcom/daaw/za1;->k:Lcom/daaw/bs1;

    invoke-virtual {p1, p4}, Lcom/daaw/he0$a;->b(I)F

    move-result v2

    invoke-virtual {v0, p4}, Lcom/daaw/he0$a;->b(I)F

    move-result v3

    sub-float/2addr v2, v3

    neg-float v2, v2

    iput v2, v1, Lcom/daaw/bs1;->a:F

    iget-object v1, p0, Lcom/daaw/za1;->k:Lcom/daaw/bs1;

    invoke-virtual {p1, p4}, Lcom/daaw/he0$a;->a(I)F

    move-result v2

    invoke-virtual {v0, p4}, Lcom/daaw/he0$a;->a(I)F

    move-result p4

    sub-float/2addr v2, p4

    iput v2, v1, Lcom/daaw/bs1;->b:F

    iget-object p4, p0, Lcom/daaw/za1;->k:Lcom/daaw/bs1;

    invoke-virtual {p4}, Lcom/daaw/bs1;->o()Lcom/daaw/bs1;

    iget-object p4, p0, Lcom/daaw/za1;->m:Lcom/daaw/bs1;

    iget-object v0, p0, Lcom/daaw/za1;->k:Lcom/daaw/bs1;

    iget v1, v0, Lcom/daaw/bs1;->a:F

    iget-object v2, p0, Lcom/daaw/za1;->l:Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    add-float/2addr v1, v3

    iput v1, p4, Lcom/daaw/bs1;->a:F

    iget v0, v0, Lcom/daaw/bs1;->b:F

    iget v1, v2, Lcom/daaw/bs1;->b:F

    add-float/2addr v0, v1

    iput v0, p4, Lcom/daaw/bs1;->b:F

    invoke-virtual {p4}, Lcom/daaw/bs1;->o()Lcom/daaw/bs1;

    iget-object p4, p0, Lcom/daaw/za1;->m:Lcom/daaw/bs1;

    iget v0, p4, Lcom/daaw/bs1;->a:F

    iput v0, p1, Lcom/daaw/he0$a;->i:F

    iget p4, p4, Lcom/daaw/bs1;->b:F

    iput p4, p1, Lcom/daaw/he0$a;->j:F

    iget-object v1, p0, Lcom/daaw/za1;->k:Lcom/daaw/bs1;

    iget v2, v1, Lcom/daaw/bs1;->a:F

    neg-float v2, v2

    iput v2, v1, Lcom/daaw/bs1;->a:F

    iget v3, v1, Lcom/daaw/bs1;->b:F

    neg-float v3, v3

    iput v3, v1, Lcom/daaw/bs1;->b:F

    invoke-static {v0, p4, v2, v3}, Lcom/daaw/bs1;->g(FFFF)F

    move-result p4

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p4

    const/high16 v0, 0x3e800000    # 0.25f

    invoke-static {p4, v0}, Ljava/lang/Math;->max(FF)F

    move-result p4

    div-float/2addr p3, p4

    const/high16 p4, 0x3f800000    # 1.0f

    iget v0, p1, Lcom/daaw/he0$a;->i:F

    mul-float v0, v0, p4

    mul-float v0, v0, p3

    iput v0, p2, Lcom/daaw/bs1;->a:F

    iget p1, p1, Lcom/daaw/he0$a;->j:F

    mul-float p1, p1, p4

    mul-float p1, p1, p3

    iput p1, p2, Lcom/daaw/bs1;->b:F

    return-void
.end method

.method public x(FFFFFFFFFFFF[F)V
    .locals 15

    move-object v0, p0

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

    mul-float v13, v1, v1

    mul-float v14, v2, v2

    add-float/2addr v13, v14

    float-to-double v13, v13

    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v13

    double-to-float v0, v0

    float-to-double v1, v2

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v1, v13

    double-to-float v1, v1

    mul-float v2, v3, v3

    mul-float v13, v4, v4

    add-float/2addr v2, v13

    float-to-double v13, v2

    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    float-to-double v2, v3

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v13

    double-to-float v2, v2

    float-to-double v3, v4

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v13

    double-to-float v3, v3

    mul-float v4, v5, v5

    mul-float v13, v6, v6

    add-float/2addr v4, v13

    float-to-double v13, v4

    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    float-to-double v4, v5

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v4, v13

    double-to-float v4, v4

    float-to-double v5, v6

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v5, v13

    double-to-float v5, v5

    mul-float v6, v7, v7

    mul-float v13, v8, v8

    add-float/2addr v6, v13

    float-to-double v13, v6

    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    float-to-double v6, v7

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v6, v13

    double-to-float v6, v6

    float-to-double v7, v8

    invoke-static {v7, v8}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v7, v13

    double-to-float v7, v7

    mul-float v8, v9, v9

    mul-float v13, v10, v10

    add-float/2addr v8, v13

    float-to-double v13, v8

    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    float-to-double v8, v9

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v8, v13

    double-to-float v8, v8

    float-to-double v9, v10

    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v9, v13

    double-to-float v9, v9

    mul-float v10, v11, v11

    mul-float v13, v12, v12

    add-float/2addr v10, v13

    float-to-double v13, v10

    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v13

    float-to-double v10, v11

    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v10, v13

    double-to-float v10, v10

    float-to-double v11, v12

    invoke-static {v11, v12}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v11, v13

    double-to-float v11, v11

    move-object v12, p0

    iget-object v13, v12, Lcom/daaw/za1;->C:Lcom/daaw/bs1;

    add-float/2addr v0, v2

    iput v0, v13, Lcom/daaw/bs1;->a:F

    add-float/2addr v1, v3

    iput v1, v13, Lcom/daaw/bs1;->b:F

    const/high16 v0, 0x3fc00000    # 1.5f

    invoke-virtual {v13, v2, v3, v0}, Lcom/daaw/bs1;->m(FFF)V

    iget-object v1, v12, Lcom/daaw/za1;->D:Lcom/daaw/bs1;

    add-float/2addr v4, v2

    iput v4, v1, Lcom/daaw/bs1;->a:F

    add-float/2addr v5, v3

    iput v5, v1, Lcom/daaw/bs1;->b:F

    invoke-virtual {v1, v2, v3, v0}, Lcom/daaw/bs1;->m(FFF)V

    iget-object v1, v12, Lcom/daaw/za1;->E:Lcom/daaw/bs1;

    add-float/2addr v10, v8

    iput v10, v1, Lcom/daaw/bs1;->a:F

    add-float/2addr v11, v9

    iput v11, v1, Lcom/daaw/bs1;->b:F

    invoke-virtual {v1, v8, v9, v0}, Lcom/daaw/bs1;->m(FFF)V

    iget-object v1, v12, Lcom/daaw/za1;->F:Lcom/daaw/bs1;

    add-float/2addr v6, v8

    iput v6, v1, Lcom/daaw/bs1;->a:F

    add-float/2addr v7, v9

    iput v7, v1, Lcom/daaw/bs1;->b:F

    invoke-virtual {v1, v8, v9, v0}, Lcom/daaw/bs1;->m(FFF)V

    iget-object v0, v12, Lcom/daaw/za1;->C:Lcom/daaw/bs1;

    iget v1, v0, Lcom/daaw/bs1;->a:F

    const/4 v2, 0x0

    aput v1, p13, v2

    iget v0, v0, Lcom/daaw/bs1;->b:F

    const/4 v1, 0x1

    aput v0, p13, v1

    iget-object v0, v12, Lcom/daaw/za1;->D:Lcom/daaw/bs1;

    iget v1, v0, Lcom/daaw/bs1;->a:F

    const/4 v2, 0x2

    aput v1, p13, v2

    iget v0, v0, Lcom/daaw/bs1;->b:F

    const/4 v1, 0x3

    aput v0, p13, v1

    iget-object v0, v12, Lcom/daaw/za1;->E:Lcom/daaw/bs1;

    iget v1, v0, Lcom/daaw/bs1;->a:F

    neg-float v1, v1

    const/4 v2, 0x4

    aput v1, p13, v2

    iget v0, v0, Lcom/daaw/bs1;->b:F

    neg-float v0, v0

    const/4 v1, 0x5

    aput v0, p13, v1

    iget-object v0, v12, Lcom/daaw/za1;->F:Lcom/daaw/bs1;

    iget v1, v0, Lcom/daaw/bs1;->a:F

    neg-float v1, v1

    const/4 v2, 0x6

    aput v1, p13, v2

    iget v0, v0, Lcom/daaw/bs1;->b:F

    neg-float v0, v0

    const/4 v1, 0x7

    aput v0, p13, v1

    return-void
.end method
