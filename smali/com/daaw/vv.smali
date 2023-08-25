.class public Lcom/daaw/vv;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/af0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/vv$a;,
        Lcom/daaw/vv$b;
    }
.end annotation


# static fields
.field public static final s:[Ljava/lang/String;

.field public static final t:[Ljava/lang/String;

.field public static u:Lcom/daaw/l31;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/l31<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lcom/daaw/r40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/r40<",
            "Lcom/daaw/de0;",
            "Lcom/daaw/i2;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lcom/daaw/vv$b;

.field public c:Lcom/daaw/s40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/s40<",
            "Lcom/daaw/y31;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lcom/daaw/s40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/s40<",
            "Lcom/daaw/y31;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lcom/daaw/qc0;

.field public f:Lcom/daaw/qc0;

.field public g:Lcom/daaw/i2;

.field public h:Ljava/lang/String;

.field public i:I

.field public j:Lcom/daaw/df0;

.field public k:Ljava/lang/Object;

.field public l:I

.field public m:Z

.field public n:I

.field public o:I

.field public p:Lcom/daaw/l31;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/l31<",
            "Lcom/daaw/lo1<",
            "[",
            "Lcom/daaw/le0;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public q:Z

.field public r:Lcom/daaw/ye0;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const-string v0, "internalres:white"

    const-string v1, "internalres:black"

    const-string v2, "internalres:particle_circle_blur4"

    const-string v3, "internalres:vignette80"

    const-string v4, "internalres:rainbow128"

    const-string v5, "internalres:particle_blur01_more"

    const-string v6, "internalres:lens_flare"

    const-string v7, "internalres:lens_flare_2"

    const-string v8, "composition:0"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/vv;->s:[Ljava/lang/String;

    const-string v1, "internalres:transparent"

    const-string v2, "internalres:white"

    const-string v3, "internalres:black"

    const-string v4, "internalres:particle_circle_blur4"

    const-string v5, "internalres:particle_blur01"

    const-string v6, "internalres:particle_blur_inv"

    const-string v7, "internalres:vignette80"

    const-string v8, "composition:0"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/vv;->t:[Ljava/lang/String;

    new-instance v0, Lcom/daaw/l31;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/l31;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/vv;->u:Lcom/daaw/l31;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/vv$b;Lcom/daaw/r40;Lcom/daaw/s40;Lcom/daaw/s40;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv$b;",
            "Lcom/daaw/r40<",
            "Lcom/daaw/de0;",
            "Lcom/daaw/i2;",
            ">;",
            "Lcom/daaw/s40<",
            "Lcom/daaw/y31;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/s40<",
            "Lcom/daaw/y31;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/vv;->e:Lcom/daaw/qc0;

    iput-object v0, p0, Lcom/daaw/vv;->f:Lcom/daaw/qc0;

    new-instance v1, Lcom/daaw/i2;

    sget-object v2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    const-string v3, ""

    invoke-direct {v1, v2, v3, v3}, Lcom/daaw/i2;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/daaw/vv;->g:Lcom/daaw/i2;

    iput-object v0, p0, Lcom/daaw/vv;->h:Ljava/lang/String;

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/vv;->i:I

    iput-object v0, p0, Lcom/daaw/vv;->j:Lcom/daaw/df0;

    iput v1, p0, Lcom/daaw/vv;->l:I

    iput-boolean v1, p0, Lcom/daaw/vv;->m:Z

    const/4 v2, -0x1

    iput v2, p0, Lcom/daaw/vv;->n:I

    iput v1, p0, Lcom/daaw/vv;->o:I

    new-instance v2, Lcom/daaw/l31;

    invoke-direct {v2, v0}, Lcom/daaw/l31;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/daaw/vv;->p:Lcom/daaw/l31;

    iput-boolean v1, p0, Lcom/daaw/vv;->q:Z

    new-instance v0, Lcom/daaw/ye0;

    const v1, -0xff0100

    const/4 v2, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/daaw/ye0;-><init>(IZFF)V

    iput-object v0, p0, Lcom/daaw/vv;->r:Lcom/daaw/ye0;

    iput-object p1, p0, Lcom/daaw/vv;->b:Lcom/daaw/vv$b;

    iput-object p2, p0, Lcom/daaw/vv;->a:Lcom/daaw/r40;

    iput-object p3, p0, Lcom/daaw/vv;->c:Lcom/daaw/s40;

    iput-object p4, p0, Lcom/daaw/vv;->d:Lcom/daaw/s40;

    return-void
.end method

.method public static c(Lcom/daaw/l31;Lcom/daaw/l31;Lcom/daaw/y31;Lcom/daaw/df0;Lcom/daaw/l31;ILcom/daaw/s40;Lcom/daaw/s40;)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/l31<",
            "Lcom/daaw/qc0;",
            ">;",
            "Lcom/daaw/l31<",
            "Lcom/daaw/qc0;",
            ">;",
            "Lcom/daaw/y31;",
            "Lcom/daaw/df0;",
            "Lcom/daaw/l31<",
            "Lcom/daaw/lo1<",
            "[",
            "Lcom/daaw/le0;",
            "Ljava/lang/Object;",
            ">;>;I",
            "Lcom/daaw/s40<",
            "Lcom/daaw/y31;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/s40<",
            "Lcom/daaw/y31;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;)Z"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p6

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez p3, :cond_1

    iput-object v6, v0, Lcom/daaw/l31;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    iput-object v6, v1, Lcom/daaw/l31;->a:Ljava/lang/Object;

    :cond_0
    return v5

    :cond_1
    invoke-static/range {p3 .. p3}, Lcom/daaw/df0;->g(Lcom/daaw/df0;)Landroid/graphics/Bitmap;

    move-result-object v7

    if-nez v7, :cond_3

    iput-object v6, v0, Lcom/daaw/l31;->a:Ljava/lang/Object;

    if-eqz v1, :cond_2

    iput-object v6, v1, Lcom/daaw/l31;->a:Ljava/lang/Object;

    :cond_2
    return v5

    :cond_3
    if-eqz v1, :cond_6

    if-eqz v4, :cond_4

    move-object/from16 v8, p7

    invoke-interface {v8, v2, v7}, Lcom/daaw/s40;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_4
    move-object v8, v6

    :goto_0
    if-eqz v8, :cond_5

    new-instance v15, Lcom/daaw/x6;

    new-instance v14, Lcom/daaw/vr1;

    const/16 v11, 0x2601

    const/16 v12, 0x2601

    const/16 v13, 0x2901

    const/16 v16, 0x0

    move-object v9, v14

    move-object v10, v8

    move-object v6, v14

    move/from16 v14, v16

    invoke-direct/range {v9 .. v14}, Lcom/daaw/vr1;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    invoke-direct {v15, v6, v5}, Lcom/daaw/x6;-><init>(Lcom/daaw/le0;Z)V

    iput-object v15, v1, Lcom/daaw/l31;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_5
    iput-object v6, v1, Lcom/daaw/l31;->a:Ljava/lang/Object;

    :goto_1
    if-eqz v8, :cond_6

    if-eq v7, v8, :cond_6

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    :cond_6
    invoke-virtual/range {p3 .. p3}, Lcom/daaw/df0;->d()I

    move-result v1

    const/4 v6, 0x0

    if-le v1, v5, :cond_10

    if-nez p5, :cond_7

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/df0;->h()V

    new-instance v2, Lcom/daaw/lo1;

    new-array v4, v1, [Lcom/daaw/le0;

    new-instance v7, Lcom/daaw/vv$a;

    invoke-direct {v7}, Lcom/daaw/vv$a;-><init>()V

    invoke-direct {v2, v4, v7}, Lcom/daaw/lo1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, v3, Lcom/daaw/l31;->a:Ljava/lang/Object;

    :cond_7
    iget-object v2, v3, Lcom/daaw/l31;->a:Ljava/lang/Object;

    if-eqz v2, :cond_8

    check-cast v2, Lcom/daaw/lo1;

    iget-object v2, v2, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v2, Lcom/daaw/vv$a;

    goto :goto_2

    :cond_8
    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_9

    return v5

    :cond_9
    iget v4, v2, Lcom/daaw/vv$a;->a:I

    if-ge v4, v1, :cond_f

    iget-object v1, v2, Lcom/daaw/vv$a;->c:Lcom/daaw/jr1;

    if-nez v1, :cond_a

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/df0;->a()V

    invoke-virtual/range {p3 .. p3}, Lcom/daaw/df0;->e()Lcom/daaw/jr1;

    move-result-object v1

    iput-object v1, v2, Lcom/daaw/vv$a;->c:Lcom/daaw/jr1;

    :cond_a
    iget-object v1, v2, Lcom/daaw/vv$a;->c:Lcom/daaw/jr1;

    invoke-virtual {v1}, Lcom/daaw/jr1;->c()Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, v2, Lcom/daaw/vv$a;->c:Lcom/daaw/jr1;

    invoke-virtual {v1}, Lcom/daaw/jr1;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    if-nez v1, :cond_b

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/16 v4, 0x20

    invoke-static {v4, v4, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    :cond_b
    new-instance v4, Lcom/daaw/vr1;

    sget-object v7, Lcom/daaw/vv;->u:Lcom/daaw/l31;

    invoke-static {v1, v6, v7}, Lcom/daaw/vv;->v(Landroid/graphics/Bitmap;ILcom/daaw/l31;)Landroid/graphics/Bitmap;

    move-result-object v8

    const/16 v9, 0x2601

    const/16 v10, 0x2601

    const/16 v11, 0x2901

    const/4 v12, 0x0

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/daaw/vr1;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    iget v1, v2, Lcom/daaw/vv$a;->a:I

    if-nez v1, :cond_c

    iget-object v7, v3, Lcom/daaw/l31;->a:Ljava/lang/Object;

    check-cast v7, Lcom/daaw/lo1;

    iget-object v7, v7, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v7, [Lcom/daaw/le0;

    aput-object v4, v7, v1

    new-instance v1, Lcom/daaw/y6;

    invoke-direct {v1, v7, v5}, Lcom/daaw/y6;-><init>([Lcom/daaw/le0;Z)V

    iput-object v1, v2, Lcom/daaw/vv$a;->b:Lcom/daaw/a7;

    :cond_c
    iget-object v1, v3, Lcom/daaw/l31;->a:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/lo1;

    iget-object v1, v1, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v1, [Lcom/daaw/le0;

    iget v3, v2, Lcom/daaw/vv$a;->a:I

    aput-object v4, v1, v3

    iget-object v1, v2, Lcom/daaw/vv$a;->b:Lcom/daaw/a7;

    if-eqz v1, :cond_d

    invoke-virtual {v1, v3, v4}, Lcom/daaw/a7;->k(ILcom/daaw/le0;)V

    :cond_d
    iget v1, v2, Lcom/daaw/vv$a;->a:I

    add-int/2addr v1, v5

    iput v1, v2, Lcom/daaw/vv$a;->a:I

    const/4 v1, 0x0

    iput-object v1, v2, Lcom/daaw/vv$a;->c:Lcom/daaw/jr1;

    :cond_e
    iget-object v1, v2, Lcom/daaw/vv$a;->b:Lcom/daaw/a7;

    iput-object v1, v0, Lcom/daaw/l31;->a:Ljava/lang/Object;

    return v6

    :cond_f
    const/4 v1, 0x0

    iget-object v2, v2, Lcom/daaw/vv$a;->b:Lcom/daaw/a7;

    iput-object v2, v0, Lcom/daaw/l31;->a:Ljava/lang/Object;

    iput-object v1, v3, Lcom/daaw/l31;->a:Ljava/lang/Object;

    goto :goto_5

    :cond_10
    if-eqz v4, :cond_11

    invoke-interface {v4, v2, v7}, Lcom/daaw/s40;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    goto :goto_3

    :cond_11
    move-object v1, v7

    :goto_3
    if-eqz v1, :cond_12

    new-instance v2, Lcom/daaw/x6;

    new-instance v3, Lcom/daaw/vr1;

    sget-object v4, Lcom/daaw/vv;->u:Lcom/daaw/l31;

    invoke-static {v1, v6, v4}, Lcom/daaw/vv;->v(Landroid/graphics/Bitmap;ILcom/daaw/l31;)Landroid/graphics/Bitmap;

    move-result-object v4

    const/16 v6, 0x2601

    const/16 v8, 0x2601

    const/16 v9, 0x2901

    const/4 v10, 0x0

    move-object/from16 p1, v3

    move-object/from16 p2, v4

    move/from16 p3, v6

    move/from16 p4, v8

    move/from16 p5, v9

    move/from16 p6, v10

    invoke-direct/range {p1 .. p6}, Lcom/daaw/vr1;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    invoke-direct {v2, v3, v5}, Lcom/daaw/x6;-><init>(Lcom/daaw/le0;Z)V

    goto :goto_4

    :cond_12
    const/4 v2, 0x0

    :goto_4
    iput-object v2, v0, Lcom/daaw/l31;->a:Ljava/lang/Object;

    if-eqz v1, :cond_13

    if-eq v7, v1, :cond_13

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_13
    :goto_5
    return v5
.end method

.method public static v(Landroid/graphics/Bitmap;ILcom/daaw/l31;)Landroid/graphics/Bitmap;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "I",
            "Lcom/daaw/l31<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    return-object p0
.end method


# virtual methods
.method public A(F)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vv;->r:Lcom/daaw/ye0;

    iget v1, v0, Lcom/daaw/ye0;->d:F

    cmpl-float v1, v1, p1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iput p1, v0, Lcom/daaw/ye0;->d:F

    invoke-virtual {p0}, Lcom/daaw/vv;->o()V

    return-void
.end method

.method public B(F)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vv;->r:Lcom/daaw/ye0;

    iget v1, v0, Lcom/daaw/ye0;->c:F

    cmpl-float v1, v1, p1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iput p1, v0, Lcom/daaw/ye0;->c:F

    invoke-virtual {p0}, Lcom/daaw/vv;->o()V

    return-void
.end method

.method public C(Ljava/lang/String;)V
    .locals 3

    iput-object p1, p0, Lcom/daaw/vv;->h:Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/xi;->i0(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/daaw/vv;->i:I

    const/4 v0, 0x0

    if-lez p1, :cond_0

    invoke-virtual {p0, v0}, Lcom/daaw/vv;->F(Lcom/daaw/i2;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/vv;->h:Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    new-instance p1, Lcom/daaw/i2;

    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iget-object v1, p0, Lcom/daaw/vv;->h:Ljava/lang/String;

    const-string v2, ""

    invoke-direct {p1, v0, v1, v2}, Lcom/daaw/i2;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/daaw/vv;->F(Lcom/daaw/i2;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/vv;->a:Lcom/daaw/r40;

    if-eqz p1, :cond_2

    invoke-interface {p1, v0}, Lcom/daaw/r40;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/daaw/i2;

    :cond_2
    invoke-virtual {p0, v0}, Lcom/daaw/vv;->F(Lcom/daaw/i2;)V

    :goto_0
    return-void
.end method

.method public D(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/vv;->n:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/daaw/vv;->n:I

    invoke-virtual {p0}, Lcom/daaw/vv;->o()V

    return-void
.end method

.method public E(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/vv;->m:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/daaw/vv;->m:Z

    invoke-virtual {p0}, Lcom/daaw/vv;->o()V

    return-void
.end method

.method public F(Lcom/daaw/i2;)V
    .locals 2

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/daaw/vv;->g:Lcom/daaw/i2;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/vv;->g:Lcom/daaw/i2;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/daaw/i2;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/daaw/i2;->a:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/br1;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/vv;->g:Lcom/daaw/i2;

    iget-object v0, v0, Lcom/daaw/i2;->b:Ljava/lang/String;

    iget-object v1, p1, Lcom/daaw/i2;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/br1;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/vv;->g:Lcom/daaw/i2;

    iget-object v0, v0, Lcom/daaw/i2;->c:Ljava/lang/String;

    iget-object v1, p1, Lcom/daaw/i2;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/br1;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iput-object p1, p0, Lcom/daaw/vv;->g:Lcom/daaw/i2;

    invoke-virtual {p0}, Lcom/daaw/vv;->o()V

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vv;->k:Ljava/lang/Object;

    return-void
.end method

.method public b(Lcom/daaw/df0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iget-object p2, p0, Lcom/daaw/vv;->g:Lcom/daaw/i2;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lcom/daaw/i2;->b:Ljava/lang/String;

    invoke-static {p3, p2}, Lcom/daaw/br1;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/vv;->g:Lcom/daaw/i2;

    iget-object p2, p2, Lcom/daaw/i2;->b:Ljava/lang/String;

    invoke-static {p3, p2}, Lcom/daaw/br1;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/vv;->o()V

    iget-object p2, p0, Lcom/daaw/vv;->j:Lcom/daaw/df0;

    invoke-static {p2}, Lcom/daaw/df0;->c(Lcom/daaw/df0;)V

    iput-object p1, p0, Lcom/daaw/vv;->j:Lcom/daaw/df0;

    const/4 p1, 0x2

    iput p1, p0, Lcom/daaw/vv;->o:I

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vv;->e:Lcom/daaw/qc0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/qc0;->a()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/vv;->e:Lcom/daaw/qc0;

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vv;->f:Lcom/daaw/qc0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/qc0;->a()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/vv;->f:Lcom/daaw/qc0;

    return-void
.end method

.method public f(Lcom/daaw/y31;Lcom/daaw/df0;I)Z
    .locals 10

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/vv;->d()V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance v8, Lcom/daaw/l31;

    const/4 v0, 0x0

    invoke-direct {v8, v0}, Lcom/daaw/l31;-><init>(Ljava/lang/Object;)V

    new-instance v9, Lcom/daaw/l31;

    invoke-direct {v9, v0}, Lcom/daaw/l31;-><init>(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/daaw/vv;->p:Lcom/daaw/l31;

    iget-object v6, p0, Lcom/daaw/vv;->c:Lcom/daaw/s40;

    iget-object v7, p0, Lcom/daaw/vv;->d:Lcom/daaw/s40;

    move-object v0, v8

    move-object v1, v9

    move-object v2, p1

    move-object v3, p2

    move v5, p3

    invoke-static/range {v0 .. v7}, Lcom/daaw/vv;->c(Lcom/daaw/l31;Lcom/daaw/l31;Lcom/daaw/y31;Lcom/daaw/df0;Lcom/daaw/l31;ILcom/daaw/s40;Lcom/daaw/s40;)Z

    move-result p1

    iget-object p2, p0, Lcom/daaw/vv;->e:Lcom/daaw/qc0;

    iget-object p3, v8, Lcom/daaw/l31;->a:Ljava/lang/Object;

    if-eq p2, p3, :cond_1

    invoke-virtual {p0}, Lcom/daaw/vv;->d()V

    :cond_1
    iget-object p2, v8, Lcom/daaw/l31;->a:Ljava/lang/Object;

    check-cast p2, Lcom/daaw/qc0;

    iput-object p2, p0, Lcom/daaw/vv;->e:Lcom/daaw/qc0;

    invoke-virtual {p0}, Lcom/daaw/vv;->e()V

    iget-object p2, v9, Lcom/daaw/l31;->a:Ljava/lang/Object;

    check-cast p2, Lcom/daaw/qc0;

    iput-object p2, p0, Lcom/daaw/vv;->f:Lcom/daaw/qc0;

    return p1
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/daaw/vv;->l:I

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/vv;->q:Z

    return v0
.end method

.method public i()Lcom/daaw/ye0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vv;->r:Lcom/daaw/ye0;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vv;->h:Ljava/lang/String;

    return-object v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lcom/daaw/vv;->n:I

    return v0
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/vv;->m:Z

    return v0
.end method

.method public m(Lcom/daaw/y31;)Lcom/daaw/qc0;
    .locals 2

    iget v0, p0, Lcom/daaw/vv;->i:I

    if-lez v0, :cond_1

    invoke-virtual {p1, v0}, Lcom/daaw/y31;->B(I)Lcom/daaw/or1;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object p1, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p1}, Lcom/daaw/y31$c;->c()Lcom/daaw/z6;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/daaw/z6;

    invoke-virtual {v0}, Lcom/daaw/e40;->b()Lcom/daaw/vk1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/daaw/z6;-><init>(Lcom/daaw/le0;Z)V

    return-object p1

    :cond_1
    iget-object p1, p0, Lcom/daaw/vv;->e:Lcom/daaw/qc0;

    return-object p1
.end method

.method public n(Lcom/daaw/y31;)Lcom/daaw/qc0;
    .locals 0

    iget p1, p0, Lcom/daaw/vv;->i:I

    if-lez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/vv;->f:Lcom/daaw/qc0;

    return-object p1
.end method

.method public final o()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/vv;->p()V

    iget-object v0, p0, Lcom/daaw/vv;->b:Lcom/daaw/vv$b;

    invoke-interface {v0}, Lcom/daaw/vv$b;->a()V

    return-void
.end method

.method public p()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/vv;->o:I

    return-void
.end method

.method public q(Lcom/daaw/y31;Landroid/graphics/RectF;I)Z
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Lcom/daaw/vv;->o:I

    const/4 v2, 0x1

    if-nez v1, :cond_2

    iget-object v1, v0, Lcom/daaw/vv;->j:Lcom/daaw/df0;

    invoke-static {v1}, Lcom/daaw/df0;->c(Lcom/daaw/df0;)V

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/vv;->j:Lcom/daaw/df0;

    iput v2, v0, Lcom/daaw/vv;->o:I

    iget-object v3, v0, Lcom/daaw/vv;->g:Lcom/daaw/i2;

    if-nez v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/vv;->o()V

    iget-object v3, v0, Lcom/daaw/vv;->j:Lcom/daaw/df0;

    invoke-static {v3}, Lcom/daaw/df0;->c(Lcom/daaw/df0;)V

    iput-object v1, v0, Lcom/daaw/vv;->j:Lcom/daaw/df0;

    const/4 v1, 0x2

    iput v1, v0, Lcom/daaw/vv;->o:I

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    iget-object v4, v4, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v4, v4, Lcom/daaw/y31$c;->a:Lcom/daaw/sg0;

    new-instance v15, Lcom/daaw/h2;

    iget-object v6, v3, Lcom/daaw/i2;->a:Landroid/net/Uri;

    iget-object v7, v3, Lcom/daaw/i2;->b:Ljava/lang/String;

    iget-object v8, v3, Lcom/daaw/i2;->c:Ljava/lang/String;

    iget-boolean v3, v0, Lcom/daaw/vv;->m:Z

    xor-int/lit8 v9, v3, 0x1

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->width()F

    move-result v3

    float-to-int v10, v3

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    move-result v3

    float-to-int v11, v3

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->width()F

    move-result v3

    float-to-int v12, v3

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    move-result v3

    float-to-int v13, v3

    iget v14, v0, Lcom/daaw/vv;->l:I

    iget v3, v0, Lcom/daaw/vv;->n:I

    iget-boolean v5, v0, Lcom/daaw/vv;->q:Z

    if-eqz v5, :cond_1

    iget-object v1, v0, Lcom/daaw/vv;->r:Lcom/daaw/ye0;

    :cond_1
    move-object/from16 v16, v1

    move-object v5, v15

    move-object v1, v15

    move v15, v3

    invoke-direct/range {v5 .. v16}, Lcom/daaw/h2;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZIIIIIILcom/daaw/ye0;)V

    invoke-interface {v4, v0, v1}, Lcom/daaw/sg0;->c(Lcom/daaw/af0;Lcom/daaw/h2;)V

    :cond_2
    :goto_0
    return v2
.end method

.method public r(Lcom/daaw/y31;I)Z
    .locals 2

    iget v0, p0, Lcom/daaw/vv;->o:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/vv;->j:Lcom/daaw/df0;

    invoke-virtual {p0, p1, v0, p2}, Lcom/daaw/vv;->f(Lcom/daaw/y31;Lcom/daaw/df0;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    iput p1, p0, Lcom/daaw/vv;->o:I

    iget-object p1, p0, Lcom/daaw/vv;->j:Lcom/daaw/df0;

    invoke-static {p1}, Lcom/daaw/df0;->c(Lcom/daaw/df0;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/vv;->j:Lcom/daaw/df0;

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public s(Lcom/daaw/y31;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/vv;->d()V

    invoke-virtual {p0}, Lcom/daaw/vv;->e()V

    return-void
.end method

.method public t(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 0

    iget p2, p0, Lcom/daaw/vv;->i:I

    if-lez p2, :cond_0

    invoke-interface {p3, p2}, Lcom/daaw/vc0;->a(I)V

    :cond_0
    iget-object p2, p0, Lcom/daaw/vv;->h:Ljava/lang/String;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-gtz p2, :cond_3

    :cond_1
    iget p2, p0, Lcom/daaw/vv;->i:I

    if-gtz p2, :cond_3

    iget-object p2, p0, Lcom/daaw/vv;->a:Lcom/daaw/r40;

    if-eqz p2, :cond_2

    invoke-interface {p2, p1}, Lcom/daaw/r40;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/i2;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/daaw/vv;->F(Lcom/daaw/i2;)V

    :cond_3
    return-void
.end method

.method public u(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 1

    iget p2, p0, Lcom/daaw/vv;->o:I

    const/4 v0, 0x3

    if-eq p2, v0, :cond_0

    iget p2, p0, Lcom/daaw/vv;->i:I

    if-gtz p2, :cond_0

    invoke-virtual {p1}, Lcom/daaw/y31;->z()V

    :cond_0
    return-void
.end method

.method public w(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/vv;->l:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/daaw/vv;->l:I

    invoke-virtual {p0}, Lcom/daaw/vv;->o()V

    return-void
.end method

.method public x(Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vv;->r:Lcom/daaw/ye0;

    iget-boolean v1, v0, Lcom/daaw/ye0;->b:Z

    if-ne v1, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, v0, Lcom/daaw/ye0;->b:Z

    invoke-virtual {p0}, Lcom/daaw/vv;->o()V

    return-void
.end method

.method public y(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vv;->r:Lcom/daaw/ye0;

    iget v1, v0, Lcom/daaw/ye0;->a:I

    if-ne v1, p1, :cond_0

    return-void

    :cond_0
    iput p1, v0, Lcom/daaw/ye0;->a:I

    invoke-virtual {p0}, Lcom/daaw/vv;->o()V

    return-void
.end method

.method public z(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/vv;->q:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/daaw/vv;->q:Z

    invoke-virtual {p0}, Lcom/daaw/vv;->o()V

    return-void
.end method
