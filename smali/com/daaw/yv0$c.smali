.class public Lcom/daaw/yv0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/t40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yv0;->w0(Lcom/daaw/y31;Lcom/daaw/e40;Landroid/graphics/RectF;FLcom/daaw/w31;Lcom/daaw/bs1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/t40<",
        "Ljava/lang/Integer;",
        "[F[I",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/graphics/RectF;

.field public final synthetic b:Lcom/daaw/y31;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:F

.field public final synthetic g:Lcom/daaw/bs1;

.field public final synthetic h:F

.field public final synthetic i:Lcom/daaw/yv0;


# direct methods
.method public constructor <init>(Lcom/daaw/yv0;Landroid/graphics/RectF;Lcom/daaw/y31;FFFFLcom/daaw/bs1;F)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    iput-object p2, p0, Lcom/daaw/yv0$c;->a:Landroid/graphics/RectF;

    iput-object p3, p0, Lcom/daaw/yv0$c;->b:Lcom/daaw/y31;

    iput p4, p0, Lcom/daaw/yv0$c;->c:F

    iput p5, p0, Lcom/daaw/yv0$c;->d:F

    iput p6, p0, Lcom/daaw/yv0$c;->e:F

    iput p7, p0, Lcom/daaw/yv0$c;->f:F

    iput-object p8, p0, Lcom/daaw/yv0$c;->g:Lcom/daaw/bs1;

    iput p9, p0, Lcom/daaw/yv0$c;->h:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;
    .locals 15

    move-object v0, p0

    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aget-object v1, v1, v2

    invoke-interface {v1}, Lcom/daaw/zd0;->e()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v1

    :cond_0
    const/4 v1, 0x0

    iget-object v2, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v2}, Lcom/daaw/yv0;->b0(Lcom/daaw/yv0;)Lcom/daaw/qd0;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aget-object v1, v1, v2

    invoke-interface {v1}, Lcom/daaw/zd0;->getPosition()Lcom/daaw/ds1;

    move-result-object v1

    iget-object v2, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v2}, Lcom/daaw/yv0;->b0(Lcom/daaw/yv0;)Lcom/daaw/qd0;

    move-result-object v2

    iget v3, v1, Lcom/daaw/ds1;->a:F

    iget-object v4, v0, Lcom/daaw/yv0$c;->a:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerX()F

    move-result v4

    sub-float/2addr v3, v4

    iget v1, v1, Lcom/daaw/ds1;->b:F

    iget-object v4, v0, Lcom/daaw/yv0$c;->a:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    sub-float/2addr v1, v4

    iget-object v4, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v4}, Lcom/daaw/yv0;->c0(Lcom/daaw/yv0;)Lcom/daaw/bs1;

    move-result-object v4

    invoke-interface {v2, v3, v1, v4}, Lcom/daaw/qd0;->p(FFLcom/daaw/bs1;)F

    move-result v1

    move v10, v1

    goto :goto_0

    :cond_1
    const/4 v10, 0x0

    :goto_0
    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aget-object v2, v1, v2

    iget-object v1, v0, Lcom/daaw/yv0$c;->b:Lcom/daaw/y31;

    invoke-virtual {v1}, Lcom/daaw/y31;->E()F

    move-result v3

    iget v4, v0, Lcom/daaw/yv0$c;->c:F

    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->d0(Lcom/daaw/yv0;)Lcom/daaw/bs1;

    move-result-object v5

    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->e0(Lcom/daaw/yv0;)Lcom/daaw/bs1;

    move-result-object v6

    iget v7, v0, Lcom/daaw/yv0$c;->d:F

    iget v8, v0, Lcom/daaw/yv0$c;->e:F

    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->c0(Lcom/daaw/yv0;)Lcom/daaw/bs1;

    move-result-object v9

    iget v11, v0, Lcom/daaw/yv0$c;->f:F

    iget-object v12, v0, Lcom/daaw/yv0$c;->g:Lcom/daaw/bs1;

    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    iget-object v13, v1, Lcom/daaw/yv0;->k0:Lcom/daaw/pr1;

    iget v14, v0, Lcom/daaw/yv0$c;->h:F

    invoke-interface/range {v2 .. v14}, Lcom/daaw/zd0;->d(FFLcom/daaw/bs1;Lcom/daaw/bs1;FFLcom/daaw/bs1;FFLcom/daaw/bs1;Lcom/daaw/pr1;F)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v1

    :cond_2
    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->e0(Lcom/daaw/yv0;)Lcom/daaw/bs1;

    move-result-object v1

    iget v1, v1, Lcom/daaw/bs1;->a:F

    iget-object v2, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v2}, Lcom/daaw/yv0;->e0(Lcom/daaw/yv0;)Lcom/daaw/bs1;

    move-result-object v2

    iget v2, v2, Lcom/daaw/bs1;->b:F

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    iget-object v2, v0, Lcom/daaw/yv0$c;->b:Lcom/daaw/y31;

    iget-object v3, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v3}, Lcom/daaw/yv0;->d0(Lcom/daaw/yv0;)Lcom/daaw/bs1;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lcom/daaw/y31;->L(Lcom/daaw/bs1;F)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aget-object v1, v1, v3

    const/4 v3, 0x1

    invoke-interface {v1, v3}, Lcom/daaw/zd0;->setVisible(Z)V

    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aget-object v1, v1, v3

    iget-object v3, v0, Lcom/daaw/yv0$c;->b:Lcom/daaw/y31;

    invoke-virtual {v3}, Lcom/daaw/y31;->E()F

    move-result v3

    invoke-interface {v1, v3}, Lcom/daaw/zd0;->f(F)V

    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->f0(Lcom/daaw/yv0;)[F

    move-result-object v1

    iget-object v3, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v3}, Lcom/daaw/yv0;->a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    aget-object v3, v3, v4

    invoke-interface {v3}, Lcom/daaw/zd0;->a()[F

    move-result-object v3

    iget-object v4, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    iget-object v4, v4, Lcom/daaw/yv0;->f0:[F

    invoke-static {v1, v3, v4}, Lcom/daaw/f80;->d([F[F[F)V

    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->f0(Lcom/daaw/yv0;)[F

    move-result-object v1

    invoke-static {v1, v2}, Lcom/daaw/f80;->g([FI)I

    move-result v1

    aput v1, p3, v2

    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aget-object v1, v1, v2

    invoke-interface {v1}, Lcom/daaw/zd0;->getPosition()Lcom/daaw/ds1;

    move-result-object v1

    iget-object v2, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v2}, Lcom/daaw/yv0;->a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    aget-object v3, v3, v4

    iget v4, v1, Lcom/daaw/ds1;->a:F

    iget v5, v1, Lcom/daaw/ds1;->b:F

    iget v6, v1, Lcom/daaw/ds1;->c:F

    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    aget-object v1, v1, v7

    invoke-interface {v1}, Lcom/daaw/zd0;->g()F

    move-result v7

    move-object/from16 v8, p2

    invoke-virtual/range {v2 .. v8}, Lcom/daaw/yv0;->k0(Lcom/daaw/zd0;FFFF[F)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v1

    :cond_3
    iget-object v1, v0, Lcom/daaw/yv0$c;->i:Lcom/daaw/yv0;

    invoke-static {v1}, Lcom/daaw/yv0;->a0(Lcom/daaw/yv0;)[Lcom/daaw/zd0;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aget-object v1, v1, v3

    invoke-interface {v1, v2}, Lcom/daaw/zd0;->setVisible(Z)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, [F

    check-cast p3, [I

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/yv0$c;->a(Ljava/lang/Integer;[F[I)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
