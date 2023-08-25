.class public abstract Lcom/daaw/tc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sc0;
.implements Lcom/daaw/pd0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/tc$a;
    }
.end annotation


# instance fields
.field public final a:[Lcom/daaw/qr1$a;

.field public b:I

.field public c:Lcom/daaw/mr1;

.field public d:[Lcom/daaw/le0;

.field public e:Z

.field public f:Lcom/daaw/w31;

.field public g:Lcom/daaw/tc$a;

.field public h:Lcom/daaw/tc$a;

.field public i:Lcom/daaw/tc$a;

.field public j:Lcom/daaw/tc$a;

.field public k:I

.field public l:Landroid/graphics/PointF;

.field public m:Landroid/graphics/PointF;

.field public final n:I

.field public o:Lcom/daaw/bs1;

.field public p:Lcom/daaw/bs1;

.field public q:Lcom/daaw/bs1;

.field public r:Lcom/daaw/bs1;

.field public s:Lcom/daaw/bs1;

.field public t:Lcom/daaw/bs1;

.field public u:Lcom/daaw/bs1;

.field public v:Lcom/daaw/bs1;


# direct methods
.method public constructor <init>(I)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    new-array v1, v0, [Lcom/daaw/qr1$a;

    new-instance v2, Lcom/daaw/qr1$a;

    const-string v3, "Position"

    const/16 v4, 0x1406

    invoke-direct {v2, v3, v0, v4}, Lcom/daaw/qr1$a;-><init>(Ljava/lang/String;II)V

    const/4 v0, 0x0

    aput-object v2, v1, v0

    new-instance v2, Lcom/daaw/qr1$a;

    const-string v3, "TexCoord"

    const/4 v5, 0x2

    invoke-direct {v2, v3, v5, v4}, Lcom/daaw/qr1$a;-><init>(Ljava/lang/String;II)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Lcom/daaw/qr1$a;

    const-string v4, "Color"

    const/4 v6, 0x4

    const/16 v7, 0x1401

    invoke-direct {v2, v4, v6, v7}, Lcom/daaw/qr1$a;-><init>(Ljava/lang/String;II)V

    aput-object v2, v1, v5

    iput-object v1, p0, Lcom/daaw/tc;->a:[Lcom/daaw/qr1$a;

    iput v0, p0, Lcom/daaw/tc;->b:I

    new-array v2, v5, [Lcom/daaw/le0;

    const/4 v4, 0x0

    aput-object v4, v2, v0

    aput-object v4, v2, v3

    iput-object v2, p0, Lcom/daaw/tc;->d:[Lcom/daaw/le0;

    iput-boolean v0, p0, Lcom/daaw/tc;->e:Z

    new-instance v2, Lcom/daaw/w31;

    invoke-direct {v2}, Lcom/daaw/w31;-><init>()V

    iput-object v2, p0, Lcom/daaw/tc;->f:Lcom/daaw/w31;

    new-instance v2, Lcom/daaw/tc$a;

    invoke-direct {v2}, Lcom/daaw/tc$a;-><init>()V

    iput-object v2, p0, Lcom/daaw/tc;->g:Lcom/daaw/tc$a;

    new-instance v2, Lcom/daaw/tc$a;

    invoke-direct {v2}, Lcom/daaw/tc$a;-><init>()V

    iput-object v2, p0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    new-instance v2, Lcom/daaw/tc$a;

    invoke-direct {v2}, Lcom/daaw/tc$a;-><init>()V

    iput-object v2, p0, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    new-instance v2, Lcom/daaw/tc$a;

    invoke-direct {v2}, Lcom/daaw/tc$a;-><init>()V

    iput-object v2, p0, Lcom/daaw/tc;->j:Lcom/daaw/tc$a;

    new-instance v2, Landroid/graphics/PointF;

    invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V

    iput-object v2, p0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    new-instance v2, Landroid/graphics/PointF;

    invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V

    iput-object v2, p0, Lcom/daaw/tc;->m:Landroid/graphics/PointF;

    new-instance v2, Lcom/daaw/bs1;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v2, p0, Lcom/daaw/tc;->o:Lcom/daaw/bs1;

    new-instance v2, Lcom/daaw/bs1;

    invoke-direct {v2, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v2, p0, Lcom/daaw/tc;->p:Lcom/daaw/bs1;

    new-instance v2, Lcom/daaw/bs1;

    invoke-direct {v2, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v2, p0, Lcom/daaw/tc;->q:Lcom/daaw/bs1;

    new-instance v2, Lcom/daaw/bs1;

    invoke-direct {v2, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v2, p0, Lcom/daaw/tc;->r:Lcom/daaw/bs1;

    new-instance v2, Lcom/daaw/bs1;

    invoke-direct {v2, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v2, p0, Lcom/daaw/tc;->s:Lcom/daaw/bs1;

    new-instance v2, Lcom/daaw/bs1;

    invoke-direct {v2, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v2, p0, Lcom/daaw/tc;->t:Lcom/daaw/bs1;

    new-instance v2, Lcom/daaw/bs1;

    invoke-direct {v2, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v2, p0, Lcom/daaw/tc;->u:Lcom/daaw/bs1;

    new-instance v2, Lcom/daaw/bs1;

    invoke-direct {v2, v3, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v2, p0, Lcom/daaw/tc;->v:Lcom/daaw/bs1;

    mul-int/lit8 v2, p1, 0x3

    iput p1, p0, Lcom/daaw/tc;->n:I

    array-length p1, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    aget-object v4, v1, v0

    iget v4, v4, Lcom/daaw/qr1$a;->e:I

    add-int/2addr v3, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/mr1;

    invoke-direct {p1, v2, v3}, Lcom/daaw/mr1;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    return-void
.end method


# virtual methods
.method public A(Lcom/daaw/tc$a;[F[II)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    mul-int/lit8 v1, p4, 0x2

    aget v2, p2, v1

    invoke-virtual {v0, v2}, Lcom/daaw/mr1;->k(F)V

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    add-int/lit8 v1, v1, 0x1

    aget p2, p2, v1

    invoke-virtual {v0, p2}, Lcom/daaw/mr1;->k(F)V

    iget-object p2, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget v0, p1, Lcom/daaw/tc$a;->c:F

    invoke-virtual {p2, v0}, Lcom/daaw/mr1;->k(F)V

    iget-object p2, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget v0, p1, Lcom/daaw/tc$a;->e:F

    invoke-virtual {p2, v0}, Lcom/daaw/mr1;->k(F)V

    iget-object p2, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget p1, p1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p2, p1}, Lcom/daaw/mr1;->k(F)V

    iget-object p1, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    aget p2, p3, p4

    invoke-virtual {p0, p2}, Lcom/daaw/tc;->v(I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/mr1;->l(I)V

    return-void
.end method

.method public B(Lcom/daaw/tc$a;[FFF[II)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    mul-int/lit8 p6, p6, 0x2

    aget v0, p2, p6

    invoke-virtual {p1, v0}, Lcom/daaw/mr1;->k(F)V

    iget-object p1, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    add-int/lit8 p6, p6, 0x1

    aget p6, p2, p6

    invoke-virtual {p1, p6}, Lcom/daaw/mr1;->k(F)V

    iget-object p1, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    const/16 p6, 0x8

    aget p2, p2, p6

    invoke-virtual {p1, p2}, Lcom/daaw/mr1;->k(F)V

    iget-object p1, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    invoke-virtual {p1, p3}, Lcom/daaw/mr1;->k(F)V

    iget-object p1, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    invoke-virtual {p1, p4}, Lcom/daaw/mr1;->k(F)V

    iget-object p1, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    const/4 p2, 0x0

    aget p2, p5, p2

    invoke-virtual {p0, p2}, Lcom/daaw/tc;->v(I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/mr1;->l(I)V

    return-void
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    invoke-virtual {v0}, Lcom/daaw/mr1;->g()V

    return-void
.end method

.method public b(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;ILcom/daaw/qr1;)V
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

    move-object/from16 v1, p1

    check-cast v1, Lcom/daaw/y31;

    const/16 v16, 0xa

    move-object/from16 v0, p0

    move-object v10, v2

    move-object v9, v3

    move/from16 v3, v16

    move/from16 v4, p15

    move v14, v5

    move-object/from16 v5, p16

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/tc;->i(Lcom/daaw/y31;Lcom/daaw/qc0;IILcom/daaw/qr1;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-static {v14, v0}, Lcom/daaw/f80;->t(II)I

    move-result v0

    iput v0, v6, Lcom/daaw/tc;->k:I

    move-object/from16 v0, p12

    iget v1, v0, Lcom/daaw/bs1;->a:F

    invoke-interface {v10, v1}, Lcom/daaw/qc0;->e(F)F

    move-result v1

    iput v1, v0, Lcom/daaw/bs1;->a:F

    iget v1, v0, Lcom/daaw/bs1;->b:F

    invoke-interface {v10, v1}, Lcom/daaw/qc0;->b(F)F

    move-result v1

    iput v1, v0, Lcom/daaw/bs1;->b:F

    iget v1, v9, Lcom/daaw/bs1;->a:F

    invoke-interface {v10, v1}, Lcom/daaw/qc0;->e(F)F

    move-result v1

    iput v1, v9, Lcom/daaw/bs1;->a:F

    iget v1, v9, Lcom/daaw/bs1;->b:F

    invoke-interface {v10, v1}, Lcom/daaw/qc0;->b(F)F

    move-result v1

    iput v1, v9, Lcom/daaw/bs1;->b:F

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v1, Lcom/daaw/tc$a;->d:F

    invoke-interface/range {p14 .. p14}, Lcom/daaw/qc0;->f()F

    move-result v3

    iput v3, v1, Lcom/daaw/tc$a;->g:F

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v14, v1, Lcom/daaw/tc$a;->h:I

    iput v15, v1, Lcom/daaw/tc$a;->c:F

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iput v2, v1, Lcom/daaw/tc$a;->d:F

    invoke-interface/range {p14 .. p14}, Lcom/daaw/qc0;->f()F

    move-result v2

    iput v2, v1, Lcom/daaw/tc$a;->g:F

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget v2, v6, Lcom/daaw/tc;->k:I

    iput v2, v1, Lcom/daaw/tc$a;->h:I

    iput v15, v1, Lcom/daaw/tc$a;->c:F

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v11, v1, Lcom/daaw/tc$a;->a:F

    iput v12, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v9, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v7, v1, Lcom/daaw/tc$a;->a:F

    iput v8, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v0, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v13, v1, Lcom/daaw/tc$a;->a:F

    move/from16 v2, p9

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v3, v9, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->e:F

    iget v3, v9, Lcom/daaw/bs1;->b:F

    iput v3, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v13, v1, Lcom/daaw/tc$a;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v3, v9, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->e:F

    iget v3, v9, Lcom/daaw/bs1;->b:F

    iput v3, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v7, v1, Lcom/daaw/tc$a;->a:F

    iput v8, v1, Lcom/daaw/tc$a;->b:F

    iget v3, v0, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->e:F

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iput v3, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    move/from16 v3, p4

    move-object v4, v9

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    move/from16 v5, p5

    iput v5, v1, Lcom/daaw/tc$a;->b:F

    iget v9, v4, Lcom/daaw/bs1;->a:F

    iput v9, v1, Lcom/daaw/tc$a;->e:F

    iget v9, v0, Lcom/daaw/bs1;->b:F

    iput v9, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

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

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    iget-object v9, v6, Lcom/daaw/tc;->s:Lcom/daaw/bs1;

    sub-float v10, v5, v8

    neg-float v10, v10

    iput v10, v9, Lcom/daaw/bs1;->a:F

    sub-float v10, v3, v7

    iput v10, v9, Lcom/daaw/bs1;->b:F

    invoke-virtual {v9}, Lcom/daaw/bs1;->p()Lcom/daaw/bs1;

    iget-object v9, v6, Lcom/daaw/tc;->t:Lcom/daaw/bs1;

    sub-float v10, v2, v5

    neg-float v10, v10

    iput v10, v9, Lcom/daaw/bs1;->a:F

    sub-float v10, v13, v3

    iput v10, v9, Lcom/daaw/bs1;->b:F

    invoke-virtual {v9}, Lcom/daaw/bs1;->p()Lcom/daaw/bs1;

    iget-object v9, v6, Lcom/daaw/tc;->u:Lcom/daaw/bs1;

    sub-float v10, v12, v2

    neg-float v10, v10

    iput v10, v9, Lcom/daaw/bs1;->a:F

    sub-float v10, v11, v13

    iput v10, v9, Lcom/daaw/bs1;->b:F

    invoke-virtual {v9}, Lcom/daaw/bs1;->p()Lcom/daaw/bs1;

    iget-object v9, v6, Lcom/daaw/tc;->v:Lcom/daaw/bs1;

    sub-float v10, v8, v12

    neg-float v10, v10

    iput v10, v9, Lcom/daaw/bs1;->a:F

    sub-float v10, v7, v11

    iput v10, v9, Lcom/daaw/bs1;->b:F

    invoke-virtual {v9}, Lcom/daaw/bs1;->p()Lcom/daaw/bs1;

    iget-object v9, v6, Lcom/daaw/tc;->o:Lcom/daaw/bs1;

    iget-object v10, v6, Lcom/daaw/tc;->s:Lcom/daaw/bs1;

    iget v14, v10, Lcom/daaw/bs1;->a:F

    iget-object v15, v6, Lcom/daaw/tc;->v:Lcom/daaw/bs1;

    iget v4, v15, Lcom/daaw/bs1;->a:F

    add-float/2addr v14, v4

    iput v14, v9, Lcom/daaw/bs1;->a:F

    iget v4, v10, Lcom/daaw/bs1;->b:F

    iget v14, v15, Lcom/daaw/bs1;->b:F

    add-float/2addr v4, v14

    iput v4, v9, Lcom/daaw/bs1;->b:F

    const/high16 v4, 0x3fc00000    # 1.5f

    mul-float v1, v1, v4

    invoke-virtual {v9, v10, v1}, Lcom/daaw/bs1;->n(Lcom/daaw/bs1;F)V

    iget-object v4, v6, Lcom/daaw/tc;->p:Lcom/daaw/bs1;

    iget-object v9, v6, Lcom/daaw/tc;->s:Lcom/daaw/bs1;

    iget v10, v9, Lcom/daaw/bs1;->a:F

    iget-object v14, v6, Lcom/daaw/tc;->t:Lcom/daaw/bs1;

    iget v15, v14, Lcom/daaw/bs1;->a:F

    add-float/2addr v10, v15

    iput v10, v4, Lcom/daaw/bs1;->a:F

    iget v9, v9, Lcom/daaw/bs1;->b:F

    iget v10, v14, Lcom/daaw/bs1;->b:F

    add-float/2addr v9, v10

    iput v9, v4, Lcom/daaw/bs1;->b:F

    invoke-virtual {v4, v14, v1}, Lcom/daaw/bs1;->n(Lcom/daaw/bs1;F)V

    iget-object v4, v6, Lcom/daaw/tc;->q:Lcom/daaw/bs1;

    iget-object v9, v6, Lcom/daaw/tc;->t:Lcom/daaw/bs1;

    iget v10, v9, Lcom/daaw/bs1;->a:F

    iget-object v14, v6, Lcom/daaw/tc;->u:Lcom/daaw/bs1;

    iget v15, v14, Lcom/daaw/bs1;->a:F

    add-float/2addr v10, v15

    iput v10, v4, Lcom/daaw/bs1;->a:F

    iget v9, v9, Lcom/daaw/bs1;->b:F

    iget v10, v14, Lcom/daaw/bs1;->b:F

    add-float/2addr v9, v10

    iput v9, v4, Lcom/daaw/bs1;->b:F

    invoke-virtual {v4, v14, v1}, Lcom/daaw/bs1;->n(Lcom/daaw/bs1;F)V

    iget-object v4, v6, Lcom/daaw/tc;->r:Lcom/daaw/bs1;

    iget-object v9, v6, Lcom/daaw/tc;->u:Lcom/daaw/bs1;

    iget v10, v9, Lcom/daaw/bs1;->a:F

    iget-object v14, v6, Lcom/daaw/tc;->v:Lcom/daaw/bs1;

    iget v15, v14, Lcom/daaw/bs1;->a:F

    add-float/2addr v10, v15

    iput v10, v4, Lcom/daaw/bs1;->a:F

    iget v9, v9, Lcom/daaw/bs1;->b:F

    iget v10, v14, Lcom/daaw/bs1;->b:F

    add-float/2addr v9, v10

    iput v9, v4, Lcom/daaw/bs1;->b:F

    invoke-virtual {v4, v14, v1}, Lcom/daaw/bs1;->n(Lcom/daaw/bs1;F)V

    iget-object v1, v6, Lcom/daaw/tc;->o:Lcom/daaw/bs1;

    iget v4, v1, Lcom/daaw/bs1;->a:F

    sub-float v4, v7, v4

    iput v4, v1, Lcom/daaw/bs1;->a:F

    iget v4, v1, Lcom/daaw/bs1;->b:F

    sub-float v4, v8, v4

    iput v4, v1, Lcom/daaw/bs1;->b:F

    iget-object v1, v6, Lcom/daaw/tc;->p:Lcom/daaw/bs1;

    iget v4, v1, Lcom/daaw/bs1;->a:F

    sub-float v4, v3, v4

    iput v4, v1, Lcom/daaw/bs1;->a:F

    iget v4, v1, Lcom/daaw/bs1;->b:F

    sub-float v4, v5, v4

    iput v4, v1, Lcom/daaw/bs1;->b:F

    iget-object v1, v6, Lcom/daaw/tc;->q:Lcom/daaw/bs1;

    iget v4, v1, Lcom/daaw/bs1;->a:F

    sub-float v4, v13, v4

    iput v4, v1, Lcom/daaw/bs1;->a:F

    iget v4, v1, Lcom/daaw/bs1;->b:F

    sub-float v4, v2, v4

    iput v4, v1, Lcom/daaw/bs1;->b:F

    iget-object v1, v6, Lcom/daaw/tc;->r:Lcom/daaw/bs1;

    iget v4, v1, Lcom/daaw/bs1;->a:F

    sub-float v4, v11, v4

    iput v4, v1, Lcom/daaw/bs1;->a:F

    iget v4, v1, Lcom/daaw/bs1;->b:F

    sub-float v4, v12, v4

    iput v4, v1, Lcom/daaw/bs1;->b:F

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v7, v1, Lcom/daaw/tc$a;->a:F

    iput v8, v1, Lcom/daaw/tc$a;->b:F

    iget v4, v0, Lcom/daaw/bs1;->a:F

    iput v4, v1, Lcom/daaw/tc$a;->e:F

    iget v4, v0, Lcom/daaw/bs1;->b:F

    iput v4, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    iput v5, v1, Lcom/daaw/tc$a;->b:F

    move-object/from16 v4, p13

    iget v9, v4, Lcom/daaw/bs1;->a:F

    iput v9, v1, Lcom/daaw/tc$a;->e:F

    iget v9, v0, Lcom/daaw/bs1;->b:F

    iput v9, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v9, v6, Lcom/daaw/tc;->o:Lcom/daaw/bs1;

    iget v10, v9, Lcom/daaw/bs1;->a:F

    iput v10, v1, Lcom/daaw/tc$a;->a:F

    iget v9, v9, Lcom/daaw/bs1;->b:F

    iput v9, v1, Lcom/daaw/tc$a;->b:F

    iget v9, v0, Lcom/daaw/bs1;->a:F

    iput v9, v1, Lcom/daaw/tc$a;->e:F

    iget v9, v0, Lcom/daaw/bs1;->b:F

    iput v9, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v9, v6, Lcom/daaw/tc;->o:Lcom/daaw/bs1;

    iget v10, v9, Lcom/daaw/bs1;->a:F

    iput v10, v1, Lcom/daaw/tc$a;->a:F

    iget v9, v9, Lcom/daaw/bs1;->b:F

    iput v9, v1, Lcom/daaw/tc$a;->b:F

    iget v9, v0, Lcom/daaw/bs1;->a:F

    iput v9, v1, Lcom/daaw/tc$a;->e:F

    iget v9, v0, Lcom/daaw/bs1;->b:F

    iput v9, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    iput v5, v1, Lcom/daaw/tc$a;->b:F

    iget v9, v4, Lcom/daaw/bs1;->a:F

    iput v9, v1, Lcom/daaw/tc$a;->e:F

    iget v9, v0, Lcom/daaw/bs1;->b:F

    iput v9, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v9, v6, Lcom/daaw/tc;->p:Lcom/daaw/bs1;

    iget v10, v9, Lcom/daaw/bs1;->a:F

    iput v10, v1, Lcom/daaw/tc$a;->a:F

    iget v9, v9, Lcom/daaw/bs1;->b:F

    iput v9, v1, Lcom/daaw/tc$a;->b:F

    iget v9, v4, Lcom/daaw/bs1;->a:F

    iput v9, v1, Lcom/daaw/tc$a;->e:F

    iget v9, v0, Lcom/daaw/bs1;->b:F

    iput v9, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    iput v5, v1, Lcom/daaw/tc$a;->b:F

    iget v3, v0, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->e:F

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iput v3, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v13, v1, Lcom/daaw/tc$a;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v3, v4, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->e:F

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iput v3, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v3, v6, Lcom/daaw/tc;->p:Lcom/daaw/bs1;

    iget v5, v3, Lcom/daaw/bs1;->a:F

    iput v5, v1, Lcom/daaw/tc$a;->a:F

    iget v3, v3, Lcom/daaw/bs1;->b:F

    iput v3, v1, Lcom/daaw/tc$a;->b:F

    iget v3, v0, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->e:F

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iput v3, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v3, v6, Lcom/daaw/tc;->p:Lcom/daaw/bs1;

    iget v5, v3, Lcom/daaw/bs1;->a:F

    iput v5, v1, Lcom/daaw/tc$a;->a:F

    iget v3, v3, Lcom/daaw/bs1;->b:F

    iput v3, v1, Lcom/daaw/tc$a;->b:F

    iget v3, v0, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->e:F

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iput v3, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v13, v1, Lcom/daaw/tc$a;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v3, v4, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->e:F

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iput v3, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v3, v6, Lcom/daaw/tc;->q:Lcom/daaw/bs1;

    iget v5, v3, Lcom/daaw/bs1;->a:F

    iput v5, v1, Lcom/daaw/tc$a;->a:F

    iget v3, v3, Lcom/daaw/bs1;->b:F

    iput v3, v1, Lcom/daaw/tc$a;->b:F

    iget v3, v4, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->e:F

    iget v3, v0, Lcom/daaw/bs1;->b:F

    iput v3, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v13, v1, Lcom/daaw/tc$a;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v0, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v11, v1, Lcom/daaw/tc$a;->a:F

    iput v12, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v4, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v0, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v2, v6, Lcom/daaw/tc;->q:Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v0, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v2, v6, Lcom/daaw/tc;->q:Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v0, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v11, v1, Lcom/daaw/tc$a;->a:F

    iput v12, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v4, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v0, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v2, v6, Lcom/daaw/tc;->r:Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v4, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v0, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v11, v1, Lcom/daaw/tc$a;->a:F

    iput v12, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v0, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v7, v1, Lcom/daaw/tc$a;->a:F

    iput v8, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v4, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v0, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v2, v6, Lcom/daaw/tc;->r:Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v0, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v2, v6, Lcom/daaw/tc;->r:Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v0, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v0, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v7, v1, Lcom/daaw/tc$a;->a:F

    iput v8, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v4, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v0, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v2, v6, Lcom/daaw/tc;->o:Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iput v3, v1, Lcom/daaw/tc$a;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v4, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v0, v0, Lcom/daaw/bs1;->b:F

    iput v0, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget v0, v6, Lcom/daaw/tc;->b:I

    add-int/lit8 v0, v0, 0xa

    iput v0, v6, Lcom/daaw/tc;->b:I

    return-void
.end method

.method public c(Lcom/daaw/de0;Lcom/daaw/u40;IFLcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;ILcom/daaw/qr1;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/de0;",
            "Lcom/daaw/u40<",
            "Ljava/lang/Integer;",
            "[F[I[F",
            "Ljava/lang/Boolean;",
            ">;IF",
            "Lcom/daaw/bs1;",
            "Lcom/daaw/bs1;",
            "Lcom/daaw/qc0;",
            "I",
            "Lcom/daaw/qr1;",
            ")V"
        }
    .end annotation

    move-object/from16 v6, p0

    move/from16 v7, p3

    move/from16 v0, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p1

    check-cast v11, Lcom/daaw/y31;

    const/16 v1, 0x8

    new-array v12, v1, [F

    const/4 v13, 0x4

    new-array v14, v13, [I

    new-array v15, v1, [F

    iget v1, v8, Lcom/daaw/bs1;->a:F

    invoke-interface {v10, v1}, Lcom/daaw/qc0;->e(F)F

    move-result v1

    iput v1, v8, Lcom/daaw/bs1;->a:F

    iget v1, v8, Lcom/daaw/bs1;->b:F

    invoke-interface {v10, v1}, Lcom/daaw/qc0;->b(F)F

    move-result v1

    iput v1, v8, Lcom/daaw/bs1;->b:F

    iget v1, v9, Lcom/daaw/bs1;->a:F

    invoke-interface {v10, v1}, Lcom/daaw/qc0;->e(F)F

    move-result v1

    iput v1, v9, Lcom/daaw/bs1;->a:F

    iget v1, v9, Lcom/daaw/bs1;->b:F

    invoke-interface {v10, v1}, Lcom/daaw/qc0;->b(F)F

    move-result v1

    iput v1, v9, Lcom/daaw/bs1;->b:F

    iget-object v1, v6, Lcom/daaw/tc;->g:Lcom/daaw/tc$a;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v1, Lcom/daaw/tc$a;->d:F

    invoke-interface/range {p7 .. p7}, Lcom/daaw/qc0;->f()F

    move-result v3

    iput v3, v1, Lcom/daaw/tc$a;->g:F

    iget-object v1, v6, Lcom/daaw/tc;->g:Lcom/daaw/tc$a;

    iput v0, v1, Lcom/daaw/tc$a;->c:F

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v2, v1, Lcom/daaw/tc$a;->d:F

    invoke-interface/range {p7 .. p7}, Lcom/daaw/qc0;->f()F

    move-result v3

    iput v3, v1, Lcom/daaw/tc$a;->g:F

    iget-object v1, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v0, v1, Lcom/daaw/tc$a;->c:F

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iput v2, v1, Lcom/daaw/tc$a;->d:F

    invoke-interface/range {p7 .. p7}, Lcom/daaw/qc0;->f()F

    move-result v3

    iput v3, v1, Lcom/daaw/tc$a;->g:F

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iput v0, v1, Lcom/daaw/tc$a;->c:F

    iput v2, v1, Lcom/daaw/tc$a;->d:F

    invoke-interface/range {p7 .. p7}, Lcom/daaw/qc0;->f()F

    move-result v2

    iput v2, v1, Lcom/daaw/tc$a;->g:F

    iget-object v1, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iput v0, v1, Lcom/daaw/tc$a;->c:F

    iget v0, v6, Lcom/daaw/tc;->n:I

    rem-int/lit8 v1, v0, 0x6

    sub-int v5, v0, v1

    const/4 v4, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v7, :cond_3

    mul-int/lit8 v0, v3, 0x6

    rem-int/2addr v0, v5

    const/16 v16, 0x6

    if-nez v0, :cond_0

    sub-int v0, v7, v3

    mul-int/lit8 v0, v0, 0x6

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

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/tc;->i(Lcom/daaw/y31;Lcom/daaw/qc0;IILcom/daaw/qr1;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_0
    move/from16 v18, v3

    move/from16 v17, v5

    const/4 v13, 0x0

    :cond_1
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-interface {v1, v0, v12, v14, v15}, Lcom/daaw/u40;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    move-object/from16 v22, v11

    move-object/from16 v23, v12

    const/4 v1, 0x0

    goto/16 :goto_1

    :cond_2
    iget-object v0, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v2, v8, Lcom/daaw/bs1;->a:F

    iput v2, v0, Lcom/daaw/tc$a;->e:F

    iget v2, v9, Lcom/daaw/bs1;->b:F

    iput v2, v0, Lcom/daaw/tc$a;->f:F

    const/4 v2, 0x2

    invoke-virtual {v6, v0, v12, v14, v2}, Lcom/daaw/tc;->A(Lcom/daaw/tc$a;[F[II)V

    iget-object v0, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v8, Lcom/daaw/bs1;->a:F

    iput v3, v0, Lcom/daaw/tc$a;->e:F

    iget v3, v8, Lcom/daaw/bs1;->b:F

    iput v3, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v0, v12, v14, v13}, Lcom/daaw/tc;->A(Lcom/daaw/tc$a;[F[II)V

    iget-object v0, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v9, Lcom/daaw/bs1;->a:F

    iput v3, v0, Lcom/daaw/tc$a;->e:F

    iget v3, v9, Lcom/daaw/bs1;->b:F

    iput v3, v0, Lcom/daaw/tc$a;->f:F

    const/4 v3, 0x3

    invoke-virtual {v6, v0, v12, v14, v3}, Lcom/daaw/tc;->A(Lcom/daaw/tc$a;[F[II)V

    iget-object v0, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v4, v9, Lcom/daaw/bs1;->a:F

    iput v4, v0, Lcom/daaw/tc$a;->e:F

    iget v4, v9, Lcom/daaw/bs1;->b:F

    iput v4, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v0, v12, v14, v3}, Lcom/daaw/tc;->A(Lcom/daaw/tc$a;[F[II)V

    iget-object v0, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v4, v8, Lcom/daaw/bs1;->a:F

    iput v4, v0, Lcom/daaw/tc$a;->e:F

    iget v4, v8, Lcom/daaw/bs1;->b:F

    iput v4, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v0, v12, v14, v13}, Lcom/daaw/tc;->A(Lcom/daaw/tc$a;[F[II)V

    iget-object v0, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v4, v9, Lcom/daaw/bs1;->a:F

    iput v4, v0, Lcom/daaw/tc$a;->e:F

    iget v4, v8, Lcom/daaw/bs1;->b:F

    iput v4, v0, Lcom/daaw/tc$a;->f:F

    const/4 v4, 0x1

    invoke-virtual {v6, v0, v12, v14, v4}, Lcom/daaw/tc;->A(Lcom/daaw/tc$a;[F[II)V

    iget-object v0, v6, Lcom/daaw/tc;->g:Lcom/daaw/tc$a;

    aget v5, v14, v13

    iput v5, v0, Lcom/daaw/tc$a;->h:I

    iget-object v5, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    aget v13, v14, v4

    iput v13, v5, Lcom/daaw/tc$a;->h:I

    iget-object v5, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    aget v13, v14, v3

    iput v13, v5, Lcom/daaw/tc$a;->h:I

    iget-object v5, v6, Lcom/daaw/tc;->j:Lcom/daaw/tc$a;

    aget v13, v14, v2

    iput v13, v5, Lcom/daaw/tc$a;->h:I

    const/4 v5, 0x0

    aget v13, v12, v5

    aget v5, v12, v4

    aget v4, v12, v2

    aget v2, v12, v3

    aget v3, v12, v16

    const/16 v20, 0x7

    aget v1, v12, v20

    const/16 v21, 0x4

    aget v7, v12, v21

    const/16 v21, 0x5

    aget v10, v12, v21

    move-object/from16 v22, v11

    iget-object v11, v6, Lcom/daaw/tc;->o:Lcom/daaw/bs1;

    const/16 v23, 0x0

    aget v24, v15, v23

    move-object/from16 v23, v12

    sub-float v12, v13, v24

    iput v12, v11, Lcom/daaw/bs1;->a:F

    const/4 v12, 0x1

    aget v12, v15, v12

    sub-float v12, v5, v12

    iput v12, v11, Lcom/daaw/bs1;->b:F

    iget-object v11, v6, Lcom/daaw/tc;->p:Lcom/daaw/bs1;

    const/4 v12, 0x2

    aget v12, v15, v12

    sub-float v12, v4, v12

    iput v12, v11, Lcom/daaw/bs1;->a:F

    const/4 v12, 0x3

    aget v12, v15, v12

    sub-float v12, v2, v12

    iput v12, v11, Lcom/daaw/bs1;->b:F

    iget-object v11, v6, Lcom/daaw/tc;->q:Lcom/daaw/bs1;

    const/4 v12, 0x4

    aget v19, v15, v12

    sub-float v12, v3, v19

    iput v12, v11, Lcom/daaw/bs1;->a:F

    aget v12, v15, v21

    sub-float v12, v1, v12

    iput v12, v11, Lcom/daaw/bs1;->b:F

    iget-object v11, v6, Lcom/daaw/tc;->r:Lcom/daaw/bs1;

    aget v12, v15, v16

    sub-float v12, v7, v12

    iput v12, v11, Lcom/daaw/bs1;->a:F

    aget v12, v15, v20

    sub-float v12, v10, v12

    iput v12, v11, Lcom/daaw/bs1;->b:F

    iput v13, v0, Lcom/daaw/tc$a;->a:F

    iput v5, v0, Lcom/daaw/tc$a;->b:F

    iget v5, v8, Lcom/daaw/bs1;->a:F

    iput v5, v0, Lcom/daaw/tc$a;->e:F

    iget v5, v8, Lcom/daaw/bs1;->b:F

    iput v5, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v0}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v0, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v4, v0, Lcom/daaw/tc$a;->a:F

    iput v2, v0, Lcom/daaw/tc$a;->b:F

    iget v5, v9, Lcom/daaw/bs1;->a:F

    iput v5, v0, Lcom/daaw/tc$a;->e:F

    iget v5, v8, Lcom/daaw/bs1;->b:F

    iput v5, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v0}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v0, v6, Lcom/daaw/tc;->g:Lcom/daaw/tc$a;

    iget-object v5, v6, Lcom/daaw/tc;->o:Lcom/daaw/bs1;

    iget v11, v5, Lcom/daaw/bs1;->a:F

    iput v11, v0, Lcom/daaw/tc$a;->a:F

    iget v5, v5, Lcom/daaw/bs1;->b:F

    iput v5, v0, Lcom/daaw/tc$a;->b:F

    iget v5, v8, Lcom/daaw/bs1;->a:F

    iput v5, v0, Lcom/daaw/tc$a;->e:F

    iget v5, v8, Lcom/daaw/bs1;->b:F

    iput v5, v0, Lcom/daaw/tc$a;->f:F

    const/4 v5, 0x0

    invoke-virtual {v6, v0, v5}, Lcom/daaw/tc;->z(Lcom/daaw/tc$a;I)V

    iget-object v0, v6, Lcom/daaw/tc;->g:Lcom/daaw/tc$a;

    iget-object v11, v6, Lcom/daaw/tc;->o:Lcom/daaw/bs1;

    iget v12, v11, Lcom/daaw/bs1;->a:F

    iput v12, v0, Lcom/daaw/tc$a;->a:F

    iget v11, v11, Lcom/daaw/bs1;->b:F

    iput v11, v0, Lcom/daaw/tc$a;->b:F

    iget v11, v8, Lcom/daaw/bs1;->a:F

    iput v11, v0, Lcom/daaw/tc$a;->e:F

    iget v11, v8, Lcom/daaw/bs1;->b:F

    iput v11, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v0, v5}, Lcom/daaw/tc;->z(Lcom/daaw/tc$a;I)V

    iget-object v0, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v4, v0, Lcom/daaw/tc$a;->a:F

    iput v2, v0, Lcom/daaw/tc$a;->b:F

    iget v2, v9, Lcom/daaw/bs1;->a:F

    iput v2, v0, Lcom/daaw/tc$a;->e:F

    iget v2, v8, Lcom/daaw/bs1;->b:F

    iput v2, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v0}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v0, v6, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget-object v2, v6, Lcom/daaw/tc;->p:Lcom/daaw/bs1;

    iget v4, v2, Lcom/daaw/bs1;->a:F

    iput v4, v0, Lcom/daaw/tc$a;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    iput v2, v0, Lcom/daaw/tc$a;->b:F

    iget v2, v9, Lcom/daaw/bs1;->a:F

    iput v2, v0, Lcom/daaw/tc$a;->e:F

    iget v2, v8, Lcom/daaw/bs1;->b:F

    iput v2, v0, Lcom/daaw/tc$a;->f:F

    const/4 v2, 0x0

    invoke-virtual {v6, v0, v2}, Lcom/daaw/tc;->z(Lcom/daaw/tc$a;I)V

    iget-object v0, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iput v3, v0, Lcom/daaw/tc$a;->a:F

    iput v1, v0, Lcom/daaw/tc$a;->b:F

    iget v1, v8, Lcom/daaw/bs1;->a:F

    iput v1, v0, Lcom/daaw/tc$a;->e:F

    iget v1, v8, Lcom/daaw/bs1;->b:F

    iput v1, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v0}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v0, v6, Lcom/daaw/tc;->j:Lcom/daaw/tc$a;

    iput v7, v0, Lcom/daaw/tc$a;->a:F

    iput v10, v0, Lcom/daaw/tc$a;->b:F

    iget v1, v9, Lcom/daaw/bs1;->a:F

    iput v1, v0, Lcom/daaw/tc$a;->e:F

    iget v1, v8, Lcom/daaw/bs1;->b:F

    iput v1, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v0}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v0, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v1, v6, Lcom/daaw/tc;->q:Lcom/daaw/bs1;

    iget v2, v1, Lcom/daaw/bs1;->a:F

    iput v2, v0, Lcom/daaw/tc$a;->a:F

    iget v1, v1, Lcom/daaw/bs1;->b:F

    iput v1, v0, Lcom/daaw/tc$a;->b:F

    iget v1, v8, Lcom/daaw/bs1;->a:F

    iput v1, v0, Lcom/daaw/tc$a;->e:F

    iget v1, v8, Lcom/daaw/bs1;->b:F

    iput v1, v0, Lcom/daaw/tc$a;->f:F

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Lcom/daaw/tc;->z(Lcom/daaw/tc$a;I)V

    iget-object v0, v6, Lcom/daaw/tc;->i:Lcom/daaw/tc$a;

    iget-object v2, v6, Lcom/daaw/tc;->q:Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iput v3, v0, Lcom/daaw/tc$a;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    iput v2, v0, Lcom/daaw/tc$a;->b:F

    iget v2, v8, Lcom/daaw/bs1;->a:F

    iput v2, v0, Lcom/daaw/tc$a;->e:F

    iget v2, v8, Lcom/daaw/bs1;->b:F

    iput v2, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v0, v1}, Lcom/daaw/tc;->z(Lcom/daaw/tc$a;I)V

    iget-object v0, v6, Lcom/daaw/tc;->j:Lcom/daaw/tc$a;

    iput v7, v0, Lcom/daaw/tc$a;->a:F

    iput v10, v0, Lcom/daaw/tc$a;->b:F

    iget v1, v9, Lcom/daaw/bs1;->a:F

    iput v1, v0, Lcom/daaw/tc$a;->e:F

    iget v1, v8, Lcom/daaw/bs1;->b:F

    iput v1, v0, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v6, v0}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v0, v6, Lcom/daaw/tc;->j:Lcom/daaw/tc$a;

    iget-object v1, v6, Lcom/daaw/tc;->r:Lcom/daaw/bs1;

    iget v2, v1, Lcom/daaw/bs1;->a:F

    iput v2, v0, Lcom/daaw/tc$a;->a:F

    iget v1, v1, Lcom/daaw/bs1;->b:F

    iput v1, v0, Lcom/daaw/tc$a;->b:F

    iget v1, v9, Lcom/daaw/bs1;->a:F

    iput v1, v0, Lcom/daaw/tc$a;->e:F

    iget v1, v8, Lcom/daaw/bs1;->b:F

    iput v1, v0, Lcom/daaw/tc$a;->f:F

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Lcom/daaw/tc;->z(Lcom/daaw/tc$a;I)V

    iget v0, v6, Lcom/daaw/tc;->b:I

    add-int/lit8 v0, v0, 0x6

    iput v0, v6, Lcom/daaw/tc;->b:I

    :goto_1
    add-int/lit8 v3, v18, 0x1

    move/from16 v7, p3

    move-object/from16 v10, p7

    move/from16 v5, v17

    move-object/from16 v11, v22

    move-object/from16 v12, v23

    const/4 v4, 0x0

    const/4 v13, 0x4

    goto/16 :goto_0

    :cond_3
    return-void
.end method

.method public e(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;I)V
    .locals 16

    new-instance v14, Lcom/daaw/w31;

    const/4 v0, 0x0

    move-object/from16 v1, p14

    move/from16 v2, p15

    invoke-direct {v14, v2, v1, v0, v0}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

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

    invoke-virtual/range {v0 .. v15}, Lcom/daaw/tc;->k(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    return-void
.end method

.method public g(Lcom/daaw/sr1;)Lcom/daaw/qr1;
    .locals 3

    new-instance v0, Lcom/daaw/qr1;

    iget-object v1, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget-object v2, p0, Lcom/daaw/tc;->a:[Lcom/daaw/qr1$a;

    invoke-direct {v0, v1, p1, v2}, Lcom/daaw/qr1;-><init>(Lcom/daaw/rc0;Lcom/daaw/sr1;[Lcom/daaw/qr1$a;)V

    return-object v0
.end method

.method public h(Lcom/daaw/y31;ILcom/daaw/w31;Z)Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tc;->w()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    invoke-virtual {v1}, Lcom/daaw/mr1;->i()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    mul-int v1, v1, p2

    sub-int/2addr v0, v1

    const/4 v1, 0x1

    if-gez v0, :cond_0

    :goto_0
    const/4 p4, 0x1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/tc;->f:Lcom/daaw/w31;

    invoke-virtual {v0, p3}, Lcom/daaw/w31;->b(Lcom/daaw/w31;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz p4, :cond_2

    iget-object p4, p0, Lcom/daaw/tc;->f:Lcom/daaw/w31;

    invoke-virtual {p0, p1, p4}, Lcom/daaw/tc;->q(Lcom/daaw/y31;Lcom/daaw/w31;)Z

    :cond_2
    iget-object p1, p0, Lcom/daaw/tc;->f:Lcom/daaw/w31;

    invoke-virtual {p1, p3}, Lcom/daaw/w31;->a(Lcom/daaw/w31;)V

    invoke-virtual {p0}, Lcom/daaw/tc;->w()I

    move-result p1

    iget-object p3, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    invoke-virtual {p3}, Lcom/daaw/mr1;->i()I

    move-result p3

    mul-int/lit8 p3, p3, 0x3

    mul-int p3, p3, p2

    sub-int/2addr p1, p3

    if-gez p1, :cond_3

    const-string p1, "buffer too small"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_3
    return v1
.end method

.method public i(Lcom/daaw/y31;Lcom/daaw/qc0;IILcom/daaw/qr1;)Z
    .locals 2

    new-instance v0, Lcom/daaw/w31;

    const/4 v1, 0x0

    invoke-direct {v0, p4, p2, p5, v1}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p3, v0, p2}, Lcom/daaw/tc;->h(Lcom/daaw/y31;ILcom/daaw/w31;Z)Z

    move-result p1

    return p1
.end method

.method public j(Lcom/daaw/y31;Lcom/daaw/t40;Lcom/daaw/t40;Lcom/daaw/t40;Lcom/daaw/t40;IFLcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/y31;",
            "Lcom/daaw/t40<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/daaw/t40<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/daaw/t40<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/daaw/t40<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;IF",
            "Lcom/daaw/bs1;",
            "Lcom/daaw/bs1;",
            "Lcom/daaw/w31;",
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

    iget v1, v12, Lcom/daaw/bs1;->a:F

    invoke-virtual {v14, v1}, Lcom/daaw/w31;->i(F)F

    move-result v1

    iput v1, v12, Lcom/daaw/bs1;->a:F

    iget v1, v12, Lcom/daaw/bs1;->b:F

    invoke-virtual {v14, v1}, Lcom/daaw/w31;->j(F)F

    move-result v1

    iput v1, v12, Lcom/daaw/bs1;->b:F

    iget v1, v13, Lcom/daaw/bs1;->a:F

    invoke-virtual {v14, v1}, Lcom/daaw/w31;->i(F)F

    move-result v1

    iput v1, v13, Lcom/daaw/bs1;->a:F

    iget v1, v13, Lcom/daaw/bs1;->b:F

    invoke-virtual {v14, v1}, Lcom/daaw/w31;->j(F)F

    move-result v1

    iput v1, v13, Lcom/daaw/bs1;->b:F

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v1, Lcom/daaw/tc$a;->d:F

    invoke-virtual/range {p10 .. p10}, Lcom/daaw/w31;->k()F

    move-result v2

    iput v2, v1, Lcom/daaw/tc$a;->g:F

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v0, v1, Lcom/daaw/tc$a;->c:F

    const/16 v1, 0x8

    aput v0, v6, v1

    iget v0, v7, Lcom/daaw/tc;->n:I

    rem-int v1, v0, v15

    sub-int v4, v0, v1

    const/4 v3, 0x0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v11, :cond_9

    mul-int v0, v2, v15

    rem-int/2addr v0, v4

    if-nez v0, :cond_3

    sub-int v0, v11, v2

    mul-int v0, v0, v15

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    move-object/from16 v1, p1

    invoke-virtual {v7, v1, v0, v14, v3}, Lcom/daaw/tc;->h(Lcom/daaw/y31;ILcom/daaw/w31;Z)Z

    move-result v0

    if-nez v0, :cond_4

    return-void

    :cond_3
    move-object/from16 v1, p1

    :cond_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v11, p2

    invoke-interface {v11, v0, v6, v5}, Lcom/daaw/t40;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

    :cond_5
    iget-object v0, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v12, Lcom/daaw/bs1;->a:F

    move/from16 v16, v4

    iget v4, v13, Lcom/daaw/bs1;->b:F

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

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v12, Lcom/daaw/bs1;->a:F

    iget v4, v12, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x0

    move-object/from16 v2, v20

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v13, Lcom/daaw/bs1;->a:F

    iget v4, v13, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v13, Lcom/daaw/bs1;->a:F

    iget v4, v13, Lcom/daaw/bs1;->b:F

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v12, Lcom/daaw/bs1;->a:F

    iget v4, v12, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v13, Lcom/daaw/bs1;->a:F

    iget v4, v12, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    if-eqz v8, :cond_6

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v5, p7

    move-object/from16 v6, v20

    invoke-interface {v8, v0, v6, v5}, Lcom/daaw/t40;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v12, Lcom/daaw/bs1;->a:F

    iget v4, v13, Lcom/daaw/bs1;->b:F

    const/16 v17, 0x2

    move-object/from16 v0, p0

    move-object v2, v6

    move/from16 v6, v17

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v12, Lcom/daaw/bs1;->a:F

    iget v4, v12, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x0

    move-object/from16 v2, v20

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v13, Lcom/daaw/bs1;->a:F

    iget v4, v13, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v13, Lcom/daaw/bs1;->a:F

    iget v4, v13, Lcom/daaw/bs1;->b:F

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v12, Lcom/daaw/bs1;->a:F

    iget v4, v12, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v13, Lcom/daaw/bs1;->a:F

    iget v4, v12, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    :cond_6
    if-eqz v9, :cond_7

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v5, p7

    move-object/from16 v6, v20

    invoke-interface {v9, v0, v6, v5}, Lcom/daaw/t40;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v12, Lcom/daaw/bs1;->a:F

    iget v4, v13, Lcom/daaw/bs1;->b:F

    const/16 v17, 0x2

    move-object/from16 v0, p0

    move-object v2, v6

    move/from16 v6, v17

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v12, Lcom/daaw/bs1;->a:F

    iget v4, v12, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x0

    move-object/from16 v2, v20

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v13, Lcom/daaw/bs1;->a:F

    iget v4, v13, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v13, Lcom/daaw/bs1;->a:F

    iget v4, v13, Lcom/daaw/bs1;->b:F

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v12, Lcom/daaw/bs1;->a:F

    iget v4, v12, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v13, Lcom/daaw/bs1;->a:F

    iget v4, v12, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    :cond_7
    if-eqz v10, :cond_8

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v5, p7

    move-object/from16 v6, v20

    invoke-interface {v10, v0, v6, v5}, Lcom/daaw/t40;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v12, Lcom/daaw/bs1;->a:F

    iget v4, v13, Lcom/daaw/bs1;->b:F

    const/16 v17, 0x2

    move-object/from16 v0, p0

    move-object v2, v6

    move-object/from16 v20, v5

    move-object/from16 v21, v6

    move/from16 v6, v17

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v12, Lcom/daaw/bs1;->a:F

    iget v4, v12, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x0

    move-object/from16 v2, v21

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v13, Lcom/daaw/bs1;->a:F

    iget v4, v13, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x3

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v13, Lcom/daaw/bs1;->a:F

    iget v4, v13, Lcom/daaw/bs1;->b:F

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v12, Lcom/daaw/bs1;->a:F

    iget v4, v12, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    iget-object v1, v7, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget v3, v13, Lcom/daaw/bs1;->a:F

    iget v4, v12, Lcom/daaw/bs1;->b:F

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/tc;->B(Lcom/daaw/tc$a;[FFF[II)V

    goto :goto_2

    :cond_8
    move-object/from16 v21, v20

    move-object/from16 v20, p7

    :goto_2
    iget v0, v7, Lcom/daaw/tc;->b:I

    add-int/2addr v0, v15

    iput v0, v7, Lcom/daaw/tc;->b:I

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

.method public k(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V
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

    move-object v9, p1

    check-cast v9, Lcom/daaw/y31;

    const/4 v10, 0x2

    invoke-virtual {p0, v9, v10, v7, v8}, Lcom/daaw/tc;->h(Lcom/daaw/y31;ILcom/daaw/w31;Z)Z

    move-result v11

    if-nez v11, :cond_0

    return-void

    :cond_0
    iget v11, v5, Lcom/daaw/bs1;->a:F

    invoke-virtual {v7, v11}, Lcom/daaw/w31;->i(F)F

    move-result v11

    iput v11, v5, Lcom/daaw/bs1;->a:F

    iget v11, v5, Lcom/daaw/bs1;->b:F

    invoke-virtual {v7, v11}, Lcom/daaw/w31;->j(F)F

    move-result v11

    iput v11, v5, Lcom/daaw/bs1;->b:F

    iget v11, v6, Lcom/daaw/bs1;->a:F

    invoke-virtual {v7, v11}, Lcom/daaw/w31;->i(F)F

    move-result v11

    iput v11, v6, Lcom/daaw/bs1;->a:F

    iget v11, v6, Lcom/daaw/bs1;->b:F

    invoke-virtual {v7, v11}, Lcom/daaw/w31;->j(F)F

    move-result v11

    iput v11, v6, Lcom/daaw/bs1;->b:F

    iget-object v11, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    const/high16 v12, 0x3f800000    # 1.0f

    iput v12, v11, Lcom/daaw/tc$a;->d:F

    invoke-virtual/range {p14 .. p14}, Lcom/daaw/w31;->k()F

    move-result v12

    iput v12, v11, Lcom/daaw/tc$a;->g:F

    iget-object v11, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    move/from16 v12, p11

    iput v12, v11, Lcom/daaw/tc$a;->h:I

    move/from16 v12, p10

    iput v12, v11, Lcom/daaw/tc$a;->c:F

    move/from16 v12, p6

    iput v12, v11, Lcom/daaw/tc$a;->a:F

    move/from16 v12, p7

    iput v12, v11, Lcom/daaw/tc$a;->b:F

    iget v12, v5, Lcom/daaw/bs1;->a:F

    iput v12, v11, Lcom/daaw/tc$a;->e:F

    iget v12, v6, Lcom/daaw/bs1;->b:F

    iput v12, v11, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p0, v11}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v11, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v1, v11, Lcom/daaw/tc$a;->a:F

    iput v2, v11, Lcom/daaw/tc$a;->b:F

    iget v12, v5, Lcom/daaw/bs1;->a:F

    iput v12, v11, Lcom/daaw/tc$a;->e:F

    iget v12, v5, Lcom/daaw/bs1;->b:F

    iput v12, v11, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p0, v11}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v11, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v3, v11, Lcom/daaw/tc$a;->a:F

    iput v4, v11, Lcom/daaw/tc$a;->b:F

    iget v12, v6, Lcom/daaw/bs1;->a:F

    iput v12, v11, Lcom/daaw/tc$a;->e:F

    iget v12, v6, Lcom/daaw/bs1;->b:F

    iput v12, v11, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p0, v11}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v11, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v3, v11, Lcom/daaw/tc$a;->a:F

    iput v4, v11, Lcom/daaw/tc$a;->b:F

    iget v3, v6, Lcom/daaw/bs1;->a:F

    iput v3, v11, Lcom/daaw/tc$a;->e:F

    iget v3, v6, Lcom/daaw/bs1;->b:F

    iput v3, v11, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p0, v11}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v3, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v1, v3, Lcom/daaw/tc$a;->a:F

    iput v2, v3, Lcom/daaw/tc$a;->b:F

    iget v1, v5, Lcom/daaw/bs1;->a:F

    iput v1, v3, Lcom/daaw/tc$a;->e:F

    iget v1, v5, Lcom/daaw/bs1;->b:F

    iput v1, v3, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p0, v3}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v1, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    move/from16 v2, p4

    iput v2, v1, Lcom/daaw/tc$a;->a:F

    move/from16 v2, p5

    iput v2, v1, Lcom/daaw/tc$a;->b:F

    iget v2, v6, Lcom/daaw/bs1;->a:F

    iput v2, v1, Lcom/daaw/tc$a;->e:F

    iget v2, v5, Lcom/daaw/bs1;->b:F

    iput v2, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p0, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget v1, v0, Lcom/daaw/tc;->b:I

    add-int/2addr v1, v10

    iput v1, v0, Lcom/daaw/tc;->b:I

    if-eqz v8, :cond_1

    const/4 v1, 0x0

    invoke-virtual {p0, v9, v1, v7, v8}, Lcom/daaw/tc;->h(Lcom/daaw/y31;ILcom/daaw/w31;Z)Z

    :cond_1
    return-void
.end method

.method public l(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V
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

    invoke-virtual/range {v0 .. v15}, Lcom/daaw/tc;->k(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    return-void
.end method

.method public m(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V
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

    invoke-virtual/range {v0 .. v15}, Lcom/daaw/tc;->k(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    return-void
.end method

.method public n(Lcom/daaw/y31;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V
    .locals 3

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0, p10, p11}, Lcom/daaw/tc;->h(Lcom/daaw/y31;ILcom/daaw/w31;Z)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget v1, p8, Lcom/daaw/bs1;->a:F

    invoke-virtual {p10, v1}, Lcom/daaw/w31;->i(F)F

    move-result v1

    iput v1, p8, Lcom/daaw/bs1;->a:F

    iget v1, p8, Lcom/daaw/bs1;->b:F

    invoke-virtual {p10, v1}, Lcom/daaw/w31;->j(F)F

    move-result v1

    iput v1, p8, Lcom/daaw/bs1;->b:F

    iget v1, p9, Lcom/daaw/bs1;->a:F

    invoke-virtual {p10, v1}, Lcom/daaw/w31;->i(F)F

    move-result v1

    iput v1, p9, Lcom/daaw/bs1;->a:F

    iget v1, p9, Lcom/daaw/bs1;->b:F

    invoke-virtual {p10, v1}, Lcom/daaw/w31;->j(F)F

    move-result v1

    iput v1, p9, Lcom/daaw/bs1;->b:F

    iget-object v1, p0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v1, Lcom/daaw/tc$a;->d:F

    invoke-virtual {p10}, Lcom/daaw/w31;->k()F

    move-result v2

    iput v2, v1, Lcom/daaw/tc$a;->g:F

    iget-object v1, p0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput p7, v1, Lcom/daaw/tc$a;->h:I

    iput p4, v1, Lcom/daaw/tc$a;->c:F

    iput p2, v1, Lcom/daaw/tc$a;->a:F

    add-float/2addr p6, p3

    iput p6, v1, Lcom/daaw/tc$a;->b:F

    iget p4, p8, Lcom/daaw/bs1;->a:F

    iput p4, v1, Lcom/daaw/tc$a;->e:F

    iget p4, p9, Lcom/daaw/bs1;->b:F

    iput p4, v1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p0, v1}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object p4, p0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput p2, p4, Lcom/daaw/tc$a;->a:F

    iput p3, p4, Lcom/daaw/tc$a;->b:F

    iget p7, p8, Lcom/daaw/bs1;->a:F

    iput p7, p4, Lcom/daaw/tc$a;->e:F

    iget p7, p8, Lcom/daaw/bs1;->b:F

    iput p7, p4, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p0, p4}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object p4, p0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    add-float/2addr p5, p2

    iput p5, p4, Lcom/daaw/tc$a;->a:F

    iput p6, p4, Lcom/daaw/tc$a;->b:F

    iget p7, p9, Lcom/daaw/bs1;->a:F

    iput p7, p4, Lcom/daaw/tc$a;->e:F

    iget p7, p9, Lcom/daaw/bs1;->b:F

    iput p7, p4, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p0, p4}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object p4, p0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput p5, p4, Lcom/daaw/tc$a;->a:F

    iput p6, p4, Lcom/daaw/tc$a;->b:F

    iget p6, p9, Lcom/daaw/bs1;->a:F

    iput p6, p4, Lcom/daaw/tc$a;->e:F

    iget p6, p9, Lcom/daaw/bs1;->b:F

    iput p6, p4, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p0, p4}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object p4, p0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput p2, p4, Lcom/daaw/tc$a;->a:F

    iput p3, p4, Lcom/daaw/tc$a;->b:F

    iget p2, p8, Lcom/daaw/bs1;->a:F

    iput p2, p4, Lcom/daaw/tc$a;->e:F

    iget p2, p8, Lcom/daaw/bs1;->b:F

    iput p2, p4, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p0, p4}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object p2, p0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput p5, p2, Lcom/daaw/tc$a;->a:F

    iput p3, p2, Lcom/daaw/tc$a;->b:F

    iget p3, p9, Lcom/daaw/bs1;->a:F

    iput p3, p2, Lcom/daaw/tc$a;->e:F

    iget p3, p8, Lcom/daaw/bs1;->b:F

    iput p3, p2, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p0, p2}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget p2, p0, Lcom/daaw/tc;->b:I

    add-int/2addr p2, v0

    iput p2, p0, Lcom/daaw/tc;->b:I

    if-eqz p11, :cond_1

    invoke-virtual {p0, p1, v0, p10, p11}, Lcom/daaw/tc;->h(Lcom/daaw/y31;ILcom/daaw/w31;Z)Z

    :cond_1
    return-void
.end method

.method public o(Lcom/daaw/de0;FFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V
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

    invoke-virtual/range {v0 .. v15}, Lcom/daaw/tc;->m(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Z)V

    return-void
.end method

.method public p(Lcom/daaw/y31;)V
    .locals 2

    new-instance v0, Lcom/daaw/w31;

    invoke-direct {v0}, Lcom/daaw/w31;-><init>()V

    iget-object v1, p0, Lcom/daaw/tc;->f:Lcom/daaw/w31;

    invoke-virtual {p0, p1, v1}, Lcom/daaw/tc;->q(Lcom/daaw/y31;Lcom/daaw/w31;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/tc;->f:Lcom/daaw/w31;

    invoke-virtual {p1, v0}, Lcom/daaw/w31;->a(Lcom/daaw/w31;)V

    :cond_0
    return-void
.end method

.method public final q(Lcom/daaw/y31;Lcom/daaw/w31;)Z
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/tc;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/tc;->e:Z

    iget v2, p0, Lcom/daaw/tc;->b:I

    if-lez v2, :cond_1

    invoke-virtual {p1}, Lcom/daaw/y31;->k()V

    iget-object v2, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    invoke-virtual {v2}, Lcom/daaw/mr1;->h()V

    invoke-virtual {p0, p1, p2}, Lcom/daaw/tc;->t(Lcom/daaw/y31;Lcom/daaw/w31;)V

    iput v1, p0, Lcom/daaw/tc;->b:I

    :cond_1
    iget-object p1, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    invoke-virtual {p1}, Lcom/daaw/mr1;->f()V

    iput-boolean v1, p0, Lcom/daaw/tc;->e:Z

    return v0
.end method

.method public r(Lcom/daaw/y31;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/tc;->p(Lcom/daaw/y31;)V

    return-void
.end method

.method public s(Lcom/daaw/y31;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/tc;->b:I

    iget-object p1, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    invoke-virtual {p1}, Lcom/daaw/mr1;->f()V

    iget-object p1, p0, Lcom/daaw/tc;->f:Lcom/daaw/w31;

    invoke-virtual {p1}, Lcom/daaw/w31;->h()V

    return-void
.end method

.method public final t(Lcom/daaw/y31;Lcom/daaw/w31;)V
    .locals 5

    iget-object v0, p2, Lcom/daaw/w31;->c:Lcom/daaw/qr1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->r()Lcom/daaw/qr1;

    move-result-object v0

    :goto_0
    iget v1, p2, Lcom/daaw/w31;->a:I

    invoke-virtual {p1, v1}, Lcom/daaw/y31;->e(I)V

    invoke-virtual {p2}, Lcom/daaw/w31;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_1
    const/4 v2, 0x0

    if-ltz v1, :cond_2

    const v3, 0x84c0

    add-int/2addr v3, v1

    invoke-static {v3}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    invoke-virtual {p2, v1}, Lcom/daaw/w31;->c(I)Lcom/daaw/le0;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lcom/daaw/le0;->b()Lcom/daaw/vk1;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/vk1;->k()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Lcom/daaw/le0;->b()Lcom/daaw/vk1;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/vk1;->c()V

    goto :goto_2

    :cond_1
    const/16 v3, 0xde1

    invoke-static {v3, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    :goto_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lcom/daaw/w31;->g()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/daaw/y31;->T(I)V

    iget-object v1, p2, Lcom/daaw/w31;->d:Lcom/daaw/g0;

    invoke-virtual {v0, p1, v1, p2}, Lcom/daaw/qr1;->a(Lcom/daaw/y31;Lcom/daaw/g0;Lcom/daaw/w31;)V

    const/4 p2, 0x4

    iget v1, p0, Lcom/daaw/tc;->b:I

    mul-int/lit8 v1, v1, 0x3

    invoke-virtual {v0, p2, v2, v1}, Lcom/daaw/qr1;->b(III)V

    invoke-virtual {v0, p1}, Lcom/daaw/qr1;->d(Lcom/daaw/y31;)V

    return-void
.end method

.method public u(Lcom/daaw/y31;Landroid/graphics/RectF;ILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;Lcom/daaw/ge0;)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v14, p2

    move-object/from16 v15, p7

    invoke-interface {v15, v14}, Lcom/daaw/ge0;->i(Landroid/graphics/RectF;)I

    move-result v13

    add-int/lit8 v16, v13, -0x1

    iget-object v12, v0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    iget-object v11, v0, Lcom/daaw/tc;->m:Landroid/graphics/PointF;

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

    invoke-interface/range {v6 .. v13}, Lcom/daaw/ge0;->e(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I

    iget-object v6, v0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    iget v7, v6, Landroid/graphics/PointF;->x:F

    iget v6, v6, Landroid/graphics/PointF;->y:F

    iget v8, v3, Lcom/daaw/bs1;->a:F

    invoke-virtual {v5, v8}, Lcom/daaw/w31;->i(F)F

    move-result v8

    iput v8, v3, Lcom/daaw/bs1;->a:F

    iget v8, v3, Lcom/daaw/bs1;->b:F

    invoke-virtual {v5, v8}, Lcom/daaw/w31;->j(F)F

    move-result v8

    iput v8, v3, Lcom/daaw/bs1;->b:F

    iget v8, v4, Lcom/daaw/bs1;->a:F

    invoke-virtual {v5, v8}, Lcom/daaw/w31;->i(F)F

    move-result v8

    iput v8, v4, Lcom/daaw/bs1;->a:F

    iget v8, v4, Lcom/daaw/bs1;->b:F

    invoke-virtual {v5, v8}, Lcom/daaw/w31;->j(F)F

    move-result v8

    iput v8, v4, Lcom/daaw/bs1;->b:F

    iget v9, v3, Lcom/daaw/bs1;->a:F

    iget v10, v4, Lcom/daaw/bs1;->a:F

    add-float v11, v9, v10

    const/high16 v12, 0x3f000000    # 0.5f

    mul-float v13, v11, v12

    iget v11, v3, Lcom/daaw/bs1;->b:F

    add-float/2addr v11, v8

    mul-float v12, v12, v11

    sub-float/2addr v10, v9

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->width()F

    move-result v8

    const/high16 v9, 0x3f800000    # 1.0f

    div-float v8, v9, v8

    mul-float v17, v10, v8

    iget v4, v4, Lcom/daaw/bs1;->b:F

    iget v3, v3, Lcom/daaw/bs1;->b:F

    sub-float/2addr v4, v3

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    move-result v3

    div-float v3, v9, v3

    mul-float v4, v4, v3

    iget-object v3, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v9, v3, Lcom/daaw/tc$a;->d:F

    invoke-virtual/range {p6 .. p6}, Lcom/daaw/w31;->k()F

    move-result v8

    iput v8, v3, Lcom/daaw/tc$a;->g:F

    iget-object v3, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v2, v3, Lcom/daaw/tc$a;->h:I

    const/4 v8, 0x0

    iput v8, v3, Lcom/daaw/tc$a;->c:F

    const/4 v3, 0x0

    move v11, v6

    move v10, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v14, :cond_1

    iget v6, v0, Lcom/daaw/tc;->n:I

    rem-int v7, v9, v6

    if-nez v7, :cond_0

    sub-int v7, v14, v9

    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-virtual {v0, v1, v6, v5, v3}, Lcom/daaw/tc;->h(Lcom/daaw/y31;ILcom/daaw/w31;Z)Z

    move-result v6

    if-nez v6, :cond_0

    return-void

    :cond_0
    const/4 v7, 0x0

    const/16 v18, 0x0

    iget-object v8, v0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    iget-object v6, v0, Lcom/daaw/tc;->m:Landroid/graphics/PointF;

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

    invoke-interface/range {v6 .. v13}, Lcom/daaw/ge0;->e(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v3, v6, Lcom/daaw/tc$a;->a:F

    move/from16 v7, v22

    iput v7, v6, Lcom/daaw/tc$a;->b:F

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v8

    sub-float v10, v3, v8

    mul-float v10, v10, v17

    add-float v13, v15, v10

    iput v13, v6, Lcom/daaw/tc$a;->e:F

    iget-object v3, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v6

    sub-float v11, v7, v6

    mul-float v11, v11, v4

    add-float v13, v15, v11

    iput v13, v3, Lcom/daaw/tc$a;->f:F

    iget-object v3, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    invoke-virtual {v0, v3}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v3, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v6

    iput v6, v3, Lcom/daaw/tc$a;->a:F

    iget-object v3, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v6

    iput v6, v3, Lcom/daaw/tc$a;->b:F

    iget-object v3, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v15, v3, Lcom/daaw/tc$a;->e:F

    move/from16 v11, v23

    iput v11, v3, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v3}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v3, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget-object v6, v0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    iget v7, v6, Landroid/graphics/PointF;->x:F

    iput v7, v3, Lcom/daaw/tc$a;->a:F

    iget v6, v6, Landroid/graphics/PointF;->y:F

    iput v6, v3, Lcom/daaw/tc$a;->b:F

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v6

    sub-float/2addr v7, v6

    mul-float v7, v7, v17

    add-float v13, v15, v7

    iput v13, v3, Lcom/daaw/tc$a;->e:F

    iget-object v3, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget-object v6, v0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    iget v6, v6, Landroid/graphics/PointF;->y:F

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v7

    sub-float/2addr v6, v7

    mul-float v6, v6, v4

    add-float v13, v15, v6

    iput v13, v3, Lcom/daaw/tc$a;->f:F

    iget-object v3, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    invoke-virtual {v0, v3}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget v3, v0, Lcom/daaw/tc;->b:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v0, Lcom/daaw/tc;->b:I

    iget-object v3, v0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    iget v10, v3, Landroid/graphics/PointF;->x:F

    iget v3, v3, Landroid/graphics/PointF;->y:F

    add-int/lit8 v9, v21, 0x1

    move v12, v11

    move v13, v15

    move-object/from16 v15, p7

    move v11, v3

    const/4 v3, 0x0

    goto/16 :goto_0

    :cond_1
    move v15, v13

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/daaw/f80;->t(II)I

    move-result v13

    const/high16 v3, -0x40400000    # -1.5f

    const/4 v7, 0x0

    const/4 v11, 0x0

    iget-object v12, v0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    iget-object v10, v0, Lcom/daaw/tc;->m:Landroid/graphics/PointF;

    move-object/from16 v6, p7

    move/from16 v8, v16

    move v9, v14

    move-object/from16 v16, v10

    move-object/from16 v10, p2

    move/from16 v24, v13

    move-object/from16 v13, v16

    invoke-interface/range {v6 .. v13}, Lcom/daaw/ge0;->e(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I

    iget-object v6, v0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    iget v7, v6, Landroid/graphics/PointF;->x:F

    iget v6, v6, Landroid/graphics/PointF;->y:F

    iget-object v8, v0, Lcom/daaw/tc;->m:Landroid/graphics/PointF;

    iget v9, v8, Landroid/graphics/PointF;->x:F

    mul-float v9, v9, v3

    add-float/2addr v9, v7

    iget v8, v8, Landroid/graphics/PointF;->y:F

    mul-float v8, v8, v3

    add-float/2addr v8, v6

    iget v10, v0, Lcom/daaw/tc;->n:I

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

    rem-int/2addr v6, v13

    if-nez v6, :cond_2

    sub-int v6, v14, v12

    mul-int/lit8 v6, v6, 0x2

    invoke-static {v6, v13}, Ljava/lang/Math;->min(II)I

    move-result v6

    const/4 v7, 0x0

    invoke-virtual {v0, v1, v6, v5, v7}, Lcom/daaw/tc;->h(Lcom/daaw/y31;ILcom/daaw/w31;Z)Z

    move-result v6

    if-nez v6, :cond_3

    return-void

    :cond_2
    const/4 v7, 0x0

    :cond_3
    const/16 v16, 0x0

    const/16 v18, 0x0

    iget-object v6, v0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    iget-object v3, v0, Lcom/daaw/tc;->m:Landroid/graphics/PointF;

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

    invoke-interface/range {v6 .. v13}, Lcom/daaw/ge0;->e(ZIILandroid/graphics/RectF;FLandroid/graphics/PointF;Landroid/graphics/PointF;)I

    iget-object v3, v0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    iget v6, v3, Landroid/graphics/PointF;->x:F

    iget-object v7, v0, Lcom/daaw/tc;->m:Landroid/graphics/PointF;

    iget v8, v7, Landroid/graphics/PointF;->x:F

    const/high16 v9, -0x40400000    # -1.5f

    mul-float v8, v8, v9

    add-float/2addr v8, v6

    iget v3, v3, Landroid/graphics/PointF;->y:F

    iget v6, v7, Landroid/graphics/PointF;->y:F

    mul-float v6, v6, v9

    add-float/2addr v3, v6

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    move/from16 v7, v27

    iput v7, v6, Lcom/daaw/tc$a;->a:F

    move/from16 v10, v28

    iput v10, v6, Lcom/daaw/tc$a;->b:F

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v11

    sub-float v11, v7, v11

    mul-float v11, v11, v17

    add-float v13, v15, v11

    iput v13, v6, Lcom/daaw/tc$a;->e:F

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v11

    sub-float v11, v10, v11

    mul-float v11, v11, v4

    add-float v13, v15, v11

    iput v13, v6, Lcom/daaw/tc$a;->f:F

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v2, v6, Lcom/daaw/tc$a;->h:I

    invoke-virtual {v0, v6}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget-object v11, v0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    iget v12, v11, Landroid/graphics/PointF;->x:F

    iput v12, v6, Lcom/daaw/tc$a;->a:F

    iget v11, v11, Landroid/graphics/PointF;->y:F

    iput v11, v6, Lcom/daaw/tc$a;->b:F

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v11

    sub-float/2addr v12, v11

    mul-float v12, v12, v17

    add-float v13, v15, v12

    iput v13, v6, Lcom/daaw/tc$a;->e:F

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iget-object v11, v0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    iget v11, v11, Landroid/graphics/PointF;->y:F

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v12

    sub-float/2addr v11, v12

    mul-float v11, v11, v4

    add-float v13, v15, v11

    iput v13, v6, Lcom/daaw/tc$a;->f:F

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v2, v6, Lcom/daaw/tc$a;->h:I

    invoke-virtual {v0, v6}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v8, v6, Lcom/daaw/tc$a;->a:F

    iput v3, v6, Lcom/daaw/tc$a;->b:F

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v11

    sub-float v11, v8, v11

    mul-float v11, v11, v17

    add-float v13, v15, v11

    iput v13, v6, Lcom/daaw/tc$a;->e:F

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v11

    sub-float v11, v3, v11

    mul-float v11, v11, v4

    add-float v13, v15, v11

    iput v13, v6, Lcom/daaw/tc$a;->f:F

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    move/from16 v11, v24

    iput v11, v6, Lcom/daaw/tc$a;->h:I

    invoke-virtual {v0, v6}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    invoke-virtual {v0, v6}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    move/from16 v12, v25

    iput v12, v6, Lcom/daaw/tc$a;->a:F

    move/from16 v13, v26

    iput v13, v6, Lcom/daaw/tc$a;->b:F

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v19

    sub-float v12, v12, v19

    mul-float v12, v12, v17

    add-float/2addr v12, v15

    iput v12, v6, Lcom/daaw/tc$a;->e:F

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v12

    sub-float v12, v13, v12

    mul-float v12, v12, v4

    add-float v13, v15, v12

    iput v13, v6, Lcom/daaw/tc$a;->f:F

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v11, v6, Lcom/daaw/tc$a;->h:I

    invoke-virtual {v0, v6}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v7, v6, Lcom/daaw/tc$a;->a:F

    iput v10, v6, Lcom/daaw/tc$a;->b:F

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerX()F

    move-result v12

    sub-float/2addr v7, v12

    mul-float v7, v7, v17

    add-float v13, v15, v7

    iput v13, v6, Lcom/daaw/tc$a;->e:F

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->centerY()F

    move-result v7

    sub-float v7, v10, v7

    mul-float v7, v7, v4

    add-float v13, v15, v7

    iput v13, v6, Lcom/daaw/tc$a;->f:F

    iget-object v6, v0, Lcom/daaw/tc;->h:Lcom/daaw/tc$a;

    iput v2, v6, Lcom/daaw/tc$a;->h:I

    invoke-virtual {v0, v6}, Lcom/daaw/tc;->x(Lcom/daaw/tc$a;)V

    iget v6, v0, Lcom/daaw/tc;->b:I

    add-int/lit8 v6, v6, 0x2

    iput v6, v0, Lcom/daaw/tc;->b:I

    iget-object v6, v0, Lcom/daaw/tc;->l:Landroid/graphics/PointF;

    iget v10, v6, Landroid/graphics/PointF;->x:F

    iget v6, v6, Landroid/graphics/PointF;->y:F

    add-int/lit8 v12, v16, 0x1

    move v9, v3

    move/from16 v13, v18

    const/high16 v3, -0x40400000    # -1.5f

    move v11, v6

    goto/16 :goto_1

    :cond_4
    return-void
.end method

.method public final v(I)I
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

.method public final w()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    invoke-virtual {v0}, Lcom/daaw/mr1;->m()I

    move-result v0

    return v0
.end method

.method public x(Lcom/daaw/tc$a;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget v1, p1, Lcom/daaw/tc$a;->a:F

    invoke-virtual {v0, v1}, Lcom/daaw/mr1;->k(F)V

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget v1, p1, Lcom/daaw/tc$a;->b:F

    invoke-virtual {v0, v1}, Lcom/daaw/mr1;->k(F)V

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget v1, p1, Lcom/daaw/tc$a;->c:F

    invoke-virtual {v0, v1}, Lcom/daaw/mr1;->k(F)V

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget v1, p1, Lcom/daaw/tc$a;->e:F

    invoke-virtual {v0, v1}, Lcom/daaw/mr1;->k(F)V

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget v1, p1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v1}, Lcom/daaw/mr1;->k(F)V

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget p1, p1, Lcom/daaw/tc$a;->h:I

    invoke-virtual {p0, p1}, Lcom/daaw/tc;->v(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/mr1;->l(I)V

    return-void
.end method

.method public y(Lcom/daaw/tc$a;FFF[II)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    invoke-virtual {v0, p2}, Lcom/daaw/mr1;->k(F)V

    iget-object p2, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    invoke-virtual {p2, p3}, Lcom/daaw/mr1;->k(F)V

    iget-object p2, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    invoke-virtual {p2, p4}, Lcom/daaw/mr1;->k(F)V

    iget-object p2, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget p3, p1, Lcom/daaw/tc$a;->e:F

    invoke-virtual {p2, p3}, Lcom/daaw/mr1;->k(F)V

    iget-object p2, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget p1, p1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {p2, p1}, Lcom/daaw/mr1;->k(F)V

    iget-object p1, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    aget p2, p5, p6

    invoke-virtual {p0, p2}, Lcom/daaw/tc;->v(I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/mr1;->l(I)V

    return-void
.end method

.method public z(Lcom/daaw/tc$a;I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget v1, p1, Lcom/daaw/tc$a;->a:F

    invoke-virtual {v0, v1}, Lcom/daaw/mr1;->k(F)V

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget v1, p1, Lcom/daaw/tc$a;->b:F

    invoke-virtual {v0, v1}, Lcom/daaw/mr1;->k(F)V

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget v1, p1, Lcom/daaw/tc$a;->c:F

    invoke-virtual {v0, v1}, Lcom/daaw/mr1;->k(F)V

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget v1, p1, Lcom/daaw/tc$a;->e:F

    invoke-virtual {v0, v1}, Lcom/daaw/mr1;->k(F)V

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget v1, p1, Lcom/daaw/tc$a;->f:F

    invoke-virtual {v0, v1}, Lcom/daaw/mr1;->k(F)V

    iget-object v0, p0, Lcom/daaw/tc;->c:Lcom/daaw/mr1;

    iget p1, p1, Lcom/daaw/tc$a;->h:I

    invoke-static {p1, p2}, Lcom/daaw/f80;->t(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/tc;->v(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/mr1;->l(I)V

    return-void
.end method
