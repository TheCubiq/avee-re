.class public Lcom/daaw/kc;
.super Lcom/daaw/tv;
.source ""


# instance fields
.field public G:Z

.field public H:F

.field public I:F

.field public J:[Lcom/daaw/or1;

.field public K:I

.field public L:[Lcom/daaw/bs1;

.field public M:[I

.field public N:Z

.field public O:Z

.field public P:I

.field public Q:I

.field public final R:Lcom/daaw/pr1;

.field public S:I

.field public T:I

.field public U:Lcom/daaw/vv;

.field public V:Z

.field public W:Lcom/daaw/vk1;

.field public X:Lcom/daaw/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            "Lcom/daaw/w31;",
            ">;"
        }
    .end annotation
.end field

.field public Y:Lcom/daaw/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            "Lcom/daaw/w31;",
            ">;"
        }
    .end annotation
.end field

.field public Z:Lcom/daaw/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            "Lcom/daaw/w31;",
            ">;"
        }
    .end annotation
.end field

.field public a0:Lcom/daaw/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/g0<",
            "Lcom/daaw/y31;",
            "Lcom/daaw/sr1;",
            "Lcom/daaw/w31;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    const/4 v0, 0x2

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/tv;-><init>(IFF)V

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/daaw/kc;->G:Z

    iput v1, p0, Lcom/daaw/kc;->H:F

    const v3, 0x40833333    # 4.1f

    iput v3, p0, Lcom/daaw/kc;->I:F

    new-array v3, v2, [Lcom/daaw/or1;

    iput-object v3, p0, Lcom/daaw/kc;->J:[Lcom/daaw/or1;

    const/high16 v3, -0x1000000

    iput v3, p0, Lcom/daaw/kc;->K:I

    const/4 v3, 0x3

    new-array v4, v3, [Lcom/daaw/bs1;

    iput-object v4, p0, Lcom/daaw/kc;->L:[Lcom/daaw/bs1;

    new-array v3, v3, [I

    iput-object v3, p0, Lcom/daaw/kc;->M:[I

    iput-boolean v2, p0, Lcom/daaw/kc;->N:Z

    iput-boolean v2, p0, Lcom/daaw/kc;->O:Z

    iput v0, p0, Lcom/daaw/kc;->P:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/kc;->Q:I

    new-instance v3, Lcom/daaw/pr1;

    invoke-direct {v3}, Lcom/daaw/pr1;-><init>()V

    iput-object v3, p0, Lcom/daaw/kc;->R:Lcom/daaw/pr1;

    const/16 v3, 0x64

    iput v3, p0, Lcom/daaw/kc;->S:I

    iput v3, p0, Lcom/daaw/kc;->T:I

    iput-boolean v0, p0, Lcom/daaw/kc;->V:Z

    new-instance v3, Lcom/daaw/kc$b;

    invoke-direct {v3, p0}, Lcom/daaw/kc$b;-><init>(Lcom/daaw/kc;)V

    iput-object v3, p0, Lcom/daaw/kc;->X:Lcom/daaw/g0;

    new-instance v3, Lcom/daaw/kc$c;

    invoke-direct {v3, p0}, Lcom/daaw/kc$c;-><init>(Lcom/daaw/kc;)V

    iput-object v3, p0, Lcom/daaw/kc;->Y:Lcom/daaw/g0;

    new-instance v3, Lcom/daaw/kc$d;

    invoke-direct {v3, p0}, Lcom/daaw/kc$d;-><init>(Lcom/daaw/kc;)V

    iput-object v3, p0, Lcom/daaw/kc;->Z:Lcom/daaw/g0;

    new-instance v3, Lcom/daaw/kc$e;

    invoke-direct {v3, p0}, Lcom/daaw/kc$e;-><init>(Lcom/daaw/kc;)V

    iput-object v3, p0, Lcom/daaw/kc;->a0:Lcom/daaw/g0;

    invoke-virtual {p0, v1, v1}, Lcom/daaw/tv;->R(FF)V

    iget-object v3, p0, Lcom/daaw/kc;->L:[Lcom/daaw/bs1;

    new-instance v4, Lcom/daaw/bs1;

    invoke-direct {v4, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    aput-object v4, v3, v2

    :goto_0
    iget-object v1, p0, Lcom/daaw/kc;->L:[Lcom/daaw/bs1;

    array-length v3, v1

    if-ge v0, v3, :cond_0

    new-instance v3, Lcom/daaw/bs1;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4}, Lcom/daaw/bs1;-><init>(FF)V

    aput-object v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, Lcom/daaw/kc;->M:[I

    array-length v3, v1

    if-ge v0, v3, :cond_1

    const/4 v3, -0x1

    aput v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    new-instance v0, Lcom/daaw/vv;

    new-instance v1, Lcom/daaw/kc$a;

    invoke-direct {v1, p0}, Lcom/daaw/kc$a;-><init>(Lcom/daaw/kc;)V

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v3, v3}, Lcom/daaw/vv;-><init>(Lcom/daaw/vv$b;Lcom/daaw/r40;Lcom/daaw/s40;Lcom/daaw/s40;)V

    iput-object v0, p0, Lcom/daaw/kc;->U:Lcom/daaw/vv;

    sget-object v0, Lcom/daaw/vv;->t:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, Lcom/daaw/kc;->j0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic Y(Lcom/daaw/kc;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/tv;->m()V

    return-void
.end method

.method public static synthetic Z(Lcom/daaw/kc;)Lcom/daaw/pr1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kc;->R:Lcom/daaw/pr1;

    return-object p0
.end method

.method public static synthetic a0(Lcom/daaw/kc;)I
    .locals 0

    iget p0, p0, Lcom/daaw/kc;->K:I

    return p0
.end method

.method public static synthetic b0(Lcom/daaw/kc;)F
    .locals 0

    iget p0, p0, Lcom/daaw/kc;->H:F

    return p0
.end method


# virtual methods
.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v14, p1

    iget-object v0, v6, Lcom/daaw/kc;->U:Lcom/daaw/vv;

    move-object/from16 v7, p2

    invoke-virtual {v0, v14, v7}, Lcom/daaw/vv;->u(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget v0, v6, Lcom/daaw/kc;->Q:I

    invoke-virtual {v14, v0}, Lcom/daaw/y31;->B(I)Lcom/daaw/or1;

    move-result-object v15

    iget-object v0, v14, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v0, v0, Lcom/daaw/y31$c;->a:Lcom/daaw/sg0;

    invoke-interface {v0}, Lcom/daaw/sg0;->e()Z

    move-result v0

    invoke-virtual {v6, v0}, Lcom/daaw/kc;->n0(Z)V

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/tv;->C(Lcom/daaw/y31;)V

    if-eqz v15, :cond_5

    iget-object v0, v6, Lcom/daaw/kc;->W:Lcom/daaw/vk1;

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/tv;->n(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/tv;->s(Lcom/daaw/aq0;)F

    move-result v5

    iget-object v2, v6, Lcom/daaw/kc;->R:Lcom/daaw/pr1;

    invoke-virtual {v13}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v13}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/tv;->b(Lcom/daaw/y31;Lcom/daaw/pr1;FFF)V

    invoke-virtual/range {p0 .. p1}, Lcom/daaw/kc;->o0(Lcom/daaw/y31;)V

    iget-object v0, v6, Lcom/daaw/kc;->W:Lcom/daaw/vk1;

    const/4 v1, 0x0

    iput-object v1, v6, Lcom/daaw/kc;->W:Lcom/daaw/vk1;

    invoke-super/range {p0 .. p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-boolean v1, v6, Lcom/daaw/kc;->O:Z

    const/4 v2, -0x1

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v14, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v1}, Lcom/daaw/y31$c;->s()Lcom/daaw/qr1;

    move-result-object v1

    new-array v7, v3, [Lcom/daaw/qc0;

    new-instance v8, Lcom/daaw/z6;

    invoke-direct {v8, v15, v5}, Lcom/daaw/z6;-><init>(Lcom/daaw/le0;Z)V

    aput-object v8, v7, v5

    iget-object v8, v6, Lcom/daaw/kc;->U:Lcom/daaw/vv;

    invoke-virtual {v8, v14}, Lcom/daaw/vv;->m(Lcom/daaw/y31;)Lcom/daaw/qc0;

    move-result-object v8

    aput-object v8, v7, v4

    new-instance v8, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kc;->c0()I

    move-result v9

    iget-object v10, v6, Lcom/daaw/kc;->X:Lcom/daaw/g0;

    invoke-direct {v8, v9, v7, v1, v10}, Lcom/daaw/w31;-><init>(I[Lcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    iget v1, v13, Landroid/graphics/RectF;->left:F

    iget v7, v13, Landroid/graphics/RectF;->top:F

    invoke-virtual {v14, v1, v7, v2, v8}, Lcom/daaw/y31;->u(FFILcom/daaw/w31;)V

    :cond_1
    iget-object v1, v6, Lcom/daaw/kc;->L:[Lcom/daaw/bs1;

    array-length v1, v1

    sub-int/2addr v1, v4

    :goto_0
    if-ltz v1, :cond_3

    iget-object v7, v6, Lcom/daaw/kc;->L:[Lcom/daaw/bs1;

    aget-object v7, v7, v1

    iget v8, v7, Lcom/daaw/bs1;->a:F

    const/4 v9, 0x0

    cmpl-float v10, v8, v9

    if-eqz v10, :cond_2

    iget v7, v7, Lcom/daaw/bs1;->b:F

    cmpl-float v9, v7, v9

    if-eqz v9, :cond_2

    const/high16 v9, 0x3f800000    # 1.0f

    div-float v8, v9, v8

    const/high16 v10, 0x3f000000    # 0.5f

    mul-float v8, v8, v10

    div-float/2addr v9, v7

    mul-float v9, v9, v10

    new-instance v11, Lcom/daaw/bs1;

    sub-float v7, v10, v8

    sub-float v12, v10, v9

    invoke-direct {v11, v7, v12}, Lcom/daaw/bs1;-><init>(FF)V

    new-instance v12, Lcom/daaw/bs1;

    add-float/2addr v8, v10

    add-float/2addr v9, v10

    invoke-direct {v12, v8, v9}, Lcom/daaw/bs1;-><init>(FF)V

    iget-object v7, v14, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v7}, Lcom/daaw/y31$c;->s()Lcom/daaw/qr1;

    move-result-object v7

    iget-object v8, v6, Lcom/daaw/kc;->M:[I

    aget v10, v8, v1

    new-array v8, v3, [Lcom/daaw/qc0;

    new-instance v9, Lcom/daaw/z6;

    invoke-direct {v9, v0, v5}, Lcom/daaw/z6;-><init>(Lcom/daaw/le0;Z)V

    aput-object v9, v8, v5

    iget-object v9, v6, Lcom/daaw/kc;->U:Lcom/daaw/vv;

    invoke-virtual {v9, v14}, Lcom/daaw/vv;->m(Lcom/daaw/y31;)Lcom/daaw/qc0;

    move-result-object v9

    aput-object v9, v8, v4

    new-instance v9, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/tv;->f()I

    move-result v2

    iget-object v4, v6, Lcom/daaw/kc;->Z:Lcom/daaw/g0;

    invoke-direct {v9, v2, v8, v7, v4}, Lcom/daaw/w31;-><init>(I[Lcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    iget v8, v13, Landroid/graphics/RectF;->left:F

    iget v2, v13, Landroid/graphics/RectF;->top:F

    move-object/from16 v7, p1

    move-object v4, v9

    move v9, v2

    move-object v2, v13

    move-object v13, v4

    invoke-virtual/range {v7 .. v13}, Lcom/daaw/y31;->v(FFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    goto :goto_1

    :cond_2
    move-object v2, v13

    :goto_1
    add-int/lit8 v1, v1, -0x1

    move-object v13, v2

    const/4 v2, -0x1

    const/4 v4, 0x1

    goto :goto_0

    :cond_3
    move-object v2, v13

    iget-boolean v0, v6, Lcom/daaw/kc;->N:Z

    if-eqz v0, :cond_4

    iget-object v0, v14, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->s()Lcom/daaw/qr1;

    move-result-object v0

    new-array v1, v3, [Lcom/daaw/qc0;

    new-instance v3, Lcom/daaw/z6;

    invoke-virtual {v15}, Lcom/daaw/e40;->b()Lcom/daaw/vk1;

    move-result-object v4

    invoke-direct {v3, v4, v5}, Lcom/daaw/z6;-><init>(Lcom/daaw/le0;Z)V

    aput-object v3, v1, v5

    iget-object v3, v14, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v3}, Lcom/daaw/y31$c;->c()Lcom/daaw/z6;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v1, v4

    new-instance v3, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/kc;->c0()I

    move-result v4

    iget-object v5, v6, Lcom/daaw/kc;->Y:Lcom/daaw/g0;

    invoke-direct {v3, v4, v1, v0, v5}, Lcom/daaw/w31;-><init>(I[Lcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    iget v0, v2, Landroid/graphics/RectF;->left:F

    iget v1, v2, Landroid/graphics/RectF;->top:F

    const/4 v2, -0x1

    invoke-virtual {v14, v0, v1, v2, v3}, Lcom/daaw/y31;->u(FFILcom/daaw/w31;)V

    :cond_4
    return-void

    :cond_5
    :goto_2
    invoke-super/range {p0 .. p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    return-void
.end method

.method public F(Lcom/daaw/y31;)V
    .locals 5

    invoke-super {p0, p1}, Lcom/daaw/tv;->F(Lcom/daaw/y31;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/kc;->W:Lcom/daaw/vk1;

    iget-boolean v0, p0, Lcom/daaw/kc;->V:Z

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/daaw/kc;->Q:I

    invoke-virtual {p1, v0}, Lcom/daaw/y31;->B(I)Lcom/daaw/or1;

    move-result-object v0

    iget-object v1, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v1, v1, Lcom/daaw/y31$c;->a:Lcom/daaw/sg0;

    invoke-interface {v1}, Lcom/daaw/sg0;->e()Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/kc;->n0(Z)V

    invoke-virtual {p0, p1}, Lcom/daaw/tv;->C(Lcom/daaw/y31;)V

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v1, p0, Lcom/daaw/kc;->H:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_2

    iget-object v1, p0, Lcom/daaw/kc;->J:[Lcom/daaw/or1;

    array-length v2, v1

    if-lez v2, :cond_2

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/daaw/e40;->b()Lcom/daaw/vk1;

    move-result-object v0

    invoke-virtual {p0, p1, v1, v0}, Lcom/daaw/kc;->p0(Lcom/daaw/y31;Lcom/daaw/e40;Lcom/daaw/vk1;)V

    const/4 v0, 0x1

    const/4 v1, 0x1

    :goto_0
    iget-object v2, p0, Lcom/daaw/kc;->J:[Lcom/daaw/or1;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-object v3, v2, v1

    add-int/lit8 v4, v1, -0x1

    aget-object v2, v2, v4

    invoke-virtual {v2}, Lcom/daaw/e40;->b()Lcom/daaw/vk1;

    move-result-object v2

    invoke-virtual {p0, p1, v3, v2}, Lcom/daaw/kc;->p0(Lcom/daaw/y31;Lcom/daaw/e40;Lcom/daaw/vk1;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    array-length p1, v2

    sub-int/2addr p1, v0

    aget-object p1, v2, p1

    invoke-virtual {p1}, Lcom/daaw/e40;->b()Lcom/daaw/vk1;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/daaw/e40;->b()Lcom/daaw/vk1;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lcom/daaw/kc;->W:Lcom/daaw/vk1;

    :cond_3
    return-void
.end method

.method public c0()I
    .locals 1

    iget v0, p0, Lcom/daaw/kc;->P:I

    return v0
.end method

.method public d0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/kc;->N:Z

    return v0
.end method

.method public e0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/kc;->O:Z

    return v0
.end method

.method public f0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/kc;->P:I

    return-void
.end method

.method public g0(F)V
    .locals 1

    iget v0, p0, Lcom/daaw/kc;->I:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/daaw/kc;->I:F

    invoke-virtual {p0}, Lcom/daaw/kc;->l()V

    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "BlurEffect"

    return-object v0
.end method

.method public h0(F)V
    .locals 0

    iput p1, p0, Lcom/daaw/kc;->H:F

    return-void
.end method

.method public i0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/kc;->K:I

    return-void
.end method

.method public j0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/kc;->U:Lcom/daaw/vv;

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->C(Ljava/lang/String;)V

    return-void
.end method

.method public k0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/kc;->Q:I

    return-void
.end method

.method public l()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/tv;->l()V

    iget-object v0, p0, Lcom/daaw/kc;->U:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/vv;->p()V

    :cond_0
    return-void
.end method

.method public l0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/kc;->N:Z

    return-void
.end method

.method public m0(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/kc;->O:Z

    return-void
.end method

.method public n0(Z)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/kc;->G:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/daaw/kc;->G:Z

    invoke-virtual {p0}, Lcom/daaw/kc;->l()V

    return-void
.end method

.method public final o0(Lcom/daaw/y31;)V
    .locals 3

    const/16 v0, 0xde1

    const/16 v1, 0x2801

    const/16 v2, 0x2601

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v1, 0x2800

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/y31;->T(I)V

    return-void
.end method

.method public final p0(Lcom/daaw/y31;Lcom/daaw/e40;Lcom/daaw/vk1;)V
    .locals 6

    invoke-virtual {p1, p2}, Lcom/daaw/y31;->i(Lcom/daaw/e40;)V

    iget-object p2, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {p2}, Lcom/daaw/y31$c;->u()Lcom/daaw/qr1;

    move-result-object v3

    new-instance p2, Lcom/daaw/w31;

    new-instance v2, Lcom/daaw/z6;

    const/4 v0, 0x0

    invoke-direct {v2, p3, v0}, Lcom/daaw/z6;-><init>(Lcom/daaw/le0;Z)V

    iget-object v4, p0, Lcom/daaw/kc;->a0:Lcom/daaw/g0;

    const/4 v1, 0x3

    const/4 v5, 0x2

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;I)V

    invoke-static {}, Lcom/daaw/bs1;->s()Lcom/daaw/bs1;

    move-result-object p3

    invoke-static {}, Lcom/daaw/bs1;->q()Lcom/daaw/bs1;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {p1, v1, p3, v0, p2}, Lcom/daaw/y31;->y(ILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    return-void
.end method

.method public t(Lcom/daaw/un;)V
    .locals 7

    invoke-super {p0, p1}, Lcom/daaw/tv;->t(Lcom/daaw/un;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->u(Lcom/daaw/un;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, v0}, Lcom/daaw/tv;->R(FF)V

    const-string v1, "blendModeContent"

    invoke-virtual {p1, v1}, Lcom/daaw/un;->h(Ljava/lang/String;)Lcom/daaw/un;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/un;->B()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, v2}, Lcom/daaw/fc;->a(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/kc;->f0(I)V

    const-string v1, "color"

    const/high16 v3, -0x1000000

    invoke-virtual {p1, v1, v3}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/kc;->i0(I)V

    const-string v1, "sourceCompositionIndex"

    const/4 v3, 0x1

    invoke-virtual {p1, v1, v3}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/kc;->k0(I)V

    iget-object v1, p0, Lcom/daaw/kc;->U:Lcom/daaw/vv;

    sget-object v4, Lcom/daaw/vv;->t:[Ljava/lang/String;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    const-string v6, "MaskImage"

    invoke-virtual {p1, v6, v4}, Lcom/daaw/un;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/daaw/vv;->C(Ljava/lang/String;)V

    const-string v1, "blurRadius"

    const/high16 v4, 0x40000000    # 2.0f

    invoke-virtual {p1, v1, v4}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/kc;->h0(F)V

    const-string v1, "blurMultiplier"

    const v4, 0x40833333    # 4.1f

    invoke-virtual {p1, v1, v4}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/kc;->g0(F)V

    const-string v1, "showUnblurredContent"

    invoke-virtual {p1, v1, v5}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/kc;->l0(Z)V

    const-string v1, "showUnblurredContentUnder"

    invoke-virtual {p1, v1, v5}, Lcom/daaw/un;->n(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/daaw/kc;->m0(Z)V

    iget-object v1, p0, Lcom/daaw/kc;->L:[Lcom/daaw/bs1;

    new-instance v4, Lcom/daaw/bs1;

    invoke-direct {v4, v0, v0}, Lcom/daaw/bs1;-><init>(FF)V

    const-string v0, "1layerScale"

    invoke-virtual {p1, v0, v4}, Lcom/daaw/un;->z(Ljava/lang/String;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    move-result-object v0

    aput-object v0, v1, v5

    iget-object v0, p0, Lcom/daaw/kc;->L:[Lcom/daaw/bs1;

    new-instance v1, Lcom/daaw/bs1;

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4}, Lcom/daaw/bs1;-><init>(FF)V

    const-string v6, "2layerScale"

    invoke-virtual {p1, v6, v1}, Lcom/daaw/un;->z(Ljava/lang/String;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    move-result-object v1

    aput-object v1, v0, v3

    iget-object v0, p0, Lcom/daaw/kc;->L:[Lcom/daaw/bs1;

    new-instance v1, Lcom/daaw/bs1;

    invoke-direct {v1, v4, v4}, Lcom/daaw/bs1;-><init>(FF)V

    const-string v4, "3layerScale"

    invoke-virtual {p1, v4, v1}, Lcom/daaw/un;->z(Ljava/lang/String;Lcom/daaw/bs1;)Lcom/daaw/bs1;

    move-result-object v1

    aput-object v1, v0, v2

    iget-object v0, p0, Lcom/daaw/kc;->M:[I

    const-string v1, "1layerColor"

    const/4 v4, -0x1

    invoke-virtual {p1, v1, v4}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v1

    aput v1, v0, v5

    iget-object v0, p0, Lcom/daaw/kc;->M:[I

    const-string v1, "2layerColor"

    invoke-virtual {p1, v1, v4}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v1

    aput v1, v0, v3

    iget-object v0, p0, Lcom/daaw/kc;->M:[I

    const-string v1, "3layerColor"

    invoke-virtual {p1, v1, v4}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result p1

    aput p1, v0, v2

    return-void
.end method

.method public v(Lcom/daaw/y31;)Z
    .locals 7

    iget-object v0, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v0, v0, Lcom/daaw/y31$c;->a:Lcom/daaw/sg0;

    invoke-interface {v0}, Lcom/daaw/sg0;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/daaw/kc;->G:Z

    iget-object v0, p1, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v0, v0, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->q(Lcom/daaw/aq0;)Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/kc;->U:Lcom/daaw/vv;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/vv;->q(Lcom/daaw/y31;Landroid/graphics/RectF;I)Z

    iget v0, p0, Lcom/daaw/kc;->I:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/y31;->I()Lcom/daaw/cs1;

    move-result-object v1

    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Lcom/daaw/kc;->J:[Lcom/daaw/or1;

    array-length v5, v4

    if-ge v3, v5, :cond_1

    aget-object v5, v4, v3

    if-eqz v5, :cond_0

    aget-object v4, v4, v3

    invoke-virtual {v4}, Lcom/daaw/e40;->a()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    array-length v3, v4

    if-eq v3, v0, :cond_2

    new-array v0, v0, [Lcom/daaw/or1;

    iput-object v0, p0, Lcom/daaw/kc;->J:[Lcom/daaw/or1;

    :cond_2
    iget v0, v1, Lcom/daaw/cs1;->a:I

    iget v1, v1, Lcom/daaw/cs1;->b:I

    const/4 v3, 0x0

    :goto_1
    iget-object v4, p0, Lcom/daaw/kc;->J:[Lcom/daaw/or1;

    array-length v4, v4

    if-ge v3, v4, :cond_4

    const/4 v4, 0x2

    div-int/2addr v0, v4

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    div-int/2addr v1, v4

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v4, p0, Lcom/daaw/kc;->J:[Lcom/daaw/or1;

    const/16 v5, 0x2601

    const/16 v6, 0x2901

    invoke-static {v0, v1, v5, v6, v2}, Lcom/daaw/or1;->g(IIIIZ)Lcom/daaw/or1;

    move-result-object v5

    aput-object v5, v4, v3

    iget-object v4, p0, Lcom/daaw/kc;->J:[Lcom/daaw/or1;

    aget-object v5, v4, v3

    if-eqz v5, :cond_3

    aget-object v5, v4, v3

    invoke-virtual {v5}, Lcom/daaw/or1;->f()Lcom/daaw/or1;

    move-result-object v5

    aput-object v5, v4, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_4
    invoke-super {p0, p1}, Lcom/daaw/tv;->v(Lcom/daaw/y31;)Z

    move-result p1

    return p1
.end method

.method public w(Lcom/daaw/y31;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->w(Lcom/daaw/y31;I)V

    iget-object v0, p0, Lcom/daaw/kc;->U:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/vv;->r(Lcom/daaw/y31;I)Z

    return-void
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/tv;->x(Lcom/daaw/y31;)V

    iget-object v0, p0, Lcom/daaw/kc;->U:Lcom/daaw/vv;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/vv;->s(Lcom/daaw/y31;)V

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/kc;->J:[Lcom/daaw/or1;

    array-length v1, v0

    if-ge p1, v1, :cond_2

    aget-object v1, v0, p1

    if-eqz v1, :cond_1

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lcom/daaw/e40;->a()V

    :cond_1
    iget-object v0, p0, Lcom/daaw/kc;->J:[Lcom/daaw/or1;

    const/4 v1, 0x0

    aput-object v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lcom/daaw/tv;->y(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    iget v0, p0, Lcom/daaw/kc;->Q:I

    invoke-interface {p3, v0}, Lcom/daaw/vc0;->a(I)V

    iget-object v0, p0, Lcom/daaw/kc;->U:Lcom/daaw/vv;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/vv;->t(Lcom/daaw/de0;Lcom/daaw/e40;Lcom/daaw/vc0;)V

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 9

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->z(Lcom/daaw/un;Lcom/daaw/od0;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->A(Lcom/daaw/un;)V

    const v0, 0x7f1002a0

    invoke-virtual {p0, v0}, Lcom/daaw/tv;->j(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/un;->p0(Ljava/lang/String;)V

    iget v0, p0, Lcom/daaw/kc;->P:I

    invoke-static {v0}, Lcom/daaw/fc;->b(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/fc;->a:[Ljava/lang/String;

    const-string v2, "blendModeContent"

    const-string v6, "1_appearance"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/un;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/daaw/un;

    iget v0, p0, Lcom/daaw/kc;->K:I

    const-string v1, "color"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/un;->T(Ljava/lang/String;ILjava/lang/String;)V

    iget v2, p0, Lcom/daaw/kc;->Q:I

    const-string v1, "sourceCompositionIndex"

    const-string v3, "1_appearance"

    const/4 v4, 0x1

    const/4 v5, 0x5

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    iget-object v0, p0, Lcom/daaw/kc;->U:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->j()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/od0;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/kc;->U:Lcom/daaw/vv;

    invoke-virtual {v0}, Lcom/daaw/vv;->j()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/vv;->t:[Ljava/lang/String;

    const-string v2, "MaskImage"

    invoke-virtual {p1, v2, v0, v6, v1}, Lcom/daaw/un;->f0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    iget v2, p0, Lcom/daaw/kc;->H:F

    const-string v1, "blurRadius"

    const-string v3, "2_blur"

    const/4 v4, 0x0

    const/high16 v5, 0x40400000    # 3.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/kc;->I:F

    const-string v1, "blurMultiplier"

    const-string v3, "2_blur"

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x40c00000    # 6.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    invoke-virtual {p0}, Lcom/daaw/kc;->d0()Z

    move-result v0

    const-string v1, "showUnblurredContent"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/kc;->e0()Z

    move-result v0

    const-string v1, "showUnblurredContentUnder"

    invoke-virtual {p1, v1, v0, v6}, Lcom/daaw/un;->L(Ljava/lang/String;ZLjava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/kc;->L:[Lcom/daaw/bs1;

    const/4 v6, 0x0

    aget-object v2, v0, v6

    const-string v1, "1layerScale"

    const-string v3, "2_blur"

    const/4 v4, 0x0

    const/high16 v5, 0x41200000    # 10.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->k0(Ljava/lang/String;Lcom/daaw/bs1;Ljava/lang/String;FF)V

    iget-object v0, p0, Lcom/daaw/kc;->L:[Lcom/daaw/bs1;

    const/4 v7, 0x1

    aget-object v2, v0, v7

    const-string v1, "2layerScale"

    const-string v3, "2_blur"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->k0(Ljava/lang/String;Lcom/daaw/bs1;Ljava/lang/String;FF)V

    iget-object v0, p0, Lcom/daaw/kc;->L:[Lcom/daaw/bs1;

    const/4 v8, 0x2

    aget-object v2, v0, v8

    const-string v1, "3layerScale"

    const-string v3, "2_blur"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->k0(Ljava/lang/String;Lcom/daaw/bs1;Ljava/lang/String;FF)V

    iget-object v0, p0, Lcom/daaw/kc;->M:[I

    aget v0, v0, v6

    const-string v1, "1layerColor"

    const-string v2, "2_blur"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->T(Ljava/lang/String;ILjava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/kc;->M:[I

    aget v0, v0, v7

    const-string v1, "2layerColor"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->T(Ljava/lang/String;ILjava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/kc;->M:[I

    aget v0, v0, v8

    const-string v1, "3layerColor"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->T(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method
