.class public Lcom/daaw/ok1;
.super Lcom/daaw/tv;
.source ""


# static fields
.field public static final O:[Ljava/lang/String;


# instance fields
.field public G:Lcom/daaw/te1;

.field public H:Ljava/lang/String;

.field public I:I

.field public J:I

.field public K:Ljava/lang/String;

.field public L:I

.field public final M:Lcom/daaw/pr1;

.field public N:Lcom/daaw/g0;
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
.method public static constructor <clinit>()V
    .locals 9

    const-string v0, "internal_0:2131230911"

    const-string v1, "internal_1:2131230912"

    const-string v2, "internal_2:2131230913"

    const-string v3, "internal_3:2131230914"

    const-string v4, "internal_4:2131230915"

    const-string v5, "internal_5:2131230916"

    const-string v6, "internal_6:2131230917"

    const-string v7, "internal_7:2131230918"

    const-string v8, "internal_8:2131230919"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/ok1;->O:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/tv;-><init>(IFF)V

    const-string v0, "{ArtistOrTitle}"

    iput-object v0, p0, Lcom/daaw/ok1;->H:Ljava/lang/String;

    const/16 v0, 0x1e

    iput v0, p0, Lcom/daaw/ok1;->I:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/ok1;->J:I

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    const/16 v0, 0x1f4

    iput v0, p0, Lcom/daaw/ok1;->L:I

    new-instance v0, Lcom/daaw/pr1;

    invoke-direct {v0}, Lcom/daaw/pr1;-><init>()V

    iput-object v0, p0, Lcom/daaw/ok1;->M:Lcom/daaw/pr1;

    new-instance v0, Lcom/daaw/ok1$a;

    invoke-direct {v0, p0}, Lcom/daaw/ok1$a;-><init>(Lcom/daaw/ok1;)V

    iput-object v0, p0, Lcom/daaw/ok1;->N:Lcom/daaw/g0;

    return-void
.end method


# virtual methods
.method public B(Lcom/daaw/y31;Lcom/daaw/e40;)V
    .locals 20

    move-object/from16 v6, p0

    move-object/from16 v15, p1

    invoke-super/range {p0 .. p2}, Lcom/daaw/tv;->B(Lcom/daaw/y31;Lcom/daaw/e40;)V

    iget-object v0, v6, Lcom/daaw/ok1;->G:Lcom/daaw/te1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/te1;->f()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v0, v15, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v0, v0, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    iget-object v1, v6, Lcom/daaw/ok1;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/daaw/aq0;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-instance v0, Lcom/daaw/cs1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/cs1;-><init>(II)V

    iget-object v0, v15, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->v()Lcom/daaw/ue1;

    move-result-object v0

    iget-object v1, v6, Lcom/daaw/ok1;->G:Lcom/daaw/te1;

    invoke-virtual {v0, v1, v11}, Lcom/daaw/ue1;->b(Lcom/daaw/te1;Ljava/lang/String;)Lcom/daaw/cs1;

    move-result-object v0

    iget-object v1, v15, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    iget-object v1, v1, Lcom/daaw/y31$c;->b:Lcom/daaw/aq0;

    invoke-virtual {v6, v1, v0}, Lcom/daaw/tv;->o(Lcom/daaw/aq0;Lcom/daaw/cs1;)Landroid/graphics/RectF;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v1

    invoke-virtual {v6, v1}, Lcom/daaw/tv;->s(Lcom/daaw/aq0;)F

    move-result v5

    iget v1, v14, Landroid/graphics/RectF;->left:F

    iget v2, v0, Lcom/daaw/cs1;->a:I

    int-to-float v2, v2

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v2, v2, v3

    add-float v4, v1, v2

    iget v1, v14, Landroid/graphics/RectF;->top:F

    iget v0, v0, Lcom/daaw/cs1;->b:I

    int-to-float v0, v0

    mul-float v0, v0, v3

    sub-float v7, v1, v0

    invoke-virtual {v6, v14}, Lcom/daaw/ok1;->Z(Landroid/graphics/RectF;)Lcom/daaw/bs1;

    move-result-object v8

    iget-object v2, v6, Lcom/daaw/ok1;->M:Lcom/daaw/pr1;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v3, v4

    move v4, v7

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/tv;->b(Lcom/daaw/y31;Lcom/daaw/pr1;FFF)V

    iget-object v0, v15, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->t()Lcom/daaw/qr1;

    move-result-object v0

    new-instance v1, Lcom/daaw/w31;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/tv;->f()I

    move-result v2

    iget-object v3, v6, Lcom/daaw/ok1;->G:Lcom/daaw/te1;

    invoke-virtual {v3}, Lcom/daaw/te1;->c()Lcom/daaw/qc0;

    move-result-object v3

    iget-object v4, v6, Lcom/daaw/ok1;->N:Lcom/daaw/g0;

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    iget-object v0, v15, Lcom/daaw/y31;->u:Lcom/daaw/y31$c;

    invoke-virtual {v0}, Lcom/daaw/y31$c;->v()Lcom/daaw/ue1;

    move-result-object v7

    iget-object v9, v6, Lcom/daaw/ok1;->G:Lcom/daaw/te1;

    new-instance v10, Lcom/daaw/ds1;

    iget v0, v14, Landroid/graphics/RectF;->left:F

    iget v2, v8, Lcom/daaw/bs1;->a:F

    add-float/2addr v0, v2

    iget v2, v14, Landroid/graphics/RectF;->top:F

    iget v3, v8, Lcom/daaw/bs1;->b:F

    add-float/2addr v2, v3

    const/4 v3, 0x0

    invoke-direct {v10, v0, v2, v3}, Lcom/daaw/ds1;-><init>(FFF)V

    iget v12, v6, Lcom/daaw/ok1;->J:I

    const/4 v13, 0x0

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v8, p1

    move-object v3, v14

    move v14, v0

    move-object v0, v15

    move v15, v2

    move-object/from16 v19, v1

    invoke-virtual/range {v7 .. v19}, Lcom/daaw/ue1;->a(Lcom/daaw/y31;Lcom/daaw/te1;Lcom/daaw/ds1;Ljava/lang/String;IIZIIIILcom/daaw/w31;)V

    invoke-virtual {v6, v0, v3}, Lcom/daaw/ok1;->e0(Lcom/daaw/y31;Landroid/graphics/RectF;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public Y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    return-object v0
.end method

.method public Z(Landroid/graphics/RectF;)Lcom/daaw/bs1;
    .locals 1

    new-instance p1, Lcom/daaw/bs1;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0}, Lcom/daaw/bs1;-><init>(FF)V

    return-object p1
.end method

.method public a0(FF)V
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iget v1, p0, Lcom/daaw/ok1;->J:I

    invoke-static {v0, v1}, Lcom/daaw/f80;->q([FI)V

    const/4 v1, 0x2

    aget v2, v0, v1

    invoke-static {p2, v2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    aput p2, v0, v1

    const/4 p2, 0x3

    aget v1, v0, p2

    invoke-static {p1, v1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    aput p1, v0, p2

    invoke-static {v0}, Lcom/daaw/f80;->m([F)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/ok1;->f0(I)V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public b0(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/ok1;->I:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/ok1;->I:I

    return-void
.end method

.method public c0(Lcom/daaw/un;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/ok1;->Y()Ljava/lang/String;

    move-result-object v0

    const-string v1, "typeFace"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/un;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/ok1;->g0(Ljava/lang/String;)V

    return-void
.end method

.method public d0(Lcom/daaw/un;)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/ok1;->Y()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/ok1;->O:[Ljava/lang/String;

    const-string v2, "typeFace"

    const-string v3, "appearance"

    invoke-virtual {p1, v2, v0, v3, v1}, Lcom/daaw/un;->e0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public e0(Lcom/daaw/y31;Landroid/graphics/RectF;)V
    .locals 0

    return-void
.end method

.method public f0(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/ok1;->J:I

    return-void
.end method

.method public g0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/daaw/br1;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/tv;->l()V

    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const-string v0, "Text"

    return-object v0
.end method

.method public h0(I)V
    .locals 1

    iget v0, p0, Lcom/daaw/ok1;->I:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x1f4

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/daaw/ok1;->I:I

    invoke-virtual {p0}, Lcom/daaw/tv;->l()V

    return-void
.end method

.method public i0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ok1;->H:Ljava/lang/String;

    return-void
.end method

.method public t(Lcom/daaw/un;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/daaw/tv;->t(Lcom/daaw/un;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->u(Lcom/daaw/un;)V

    const-string v0, "text"

    const-string v1, "{ArtistOrTitle}"

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/ok1;->i0(Ljava/lang/String;)V

    const-string v0, "color"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ok1;->f0(I)V

    const-string v0, "fontSize"

    const/16 v1, 0x1e

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ok1;->h0(I)V

    const-string v0, "typeFace"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/ok1;->g0(Ljava/lang/String;)V

    return-void
.end method

.method public v(Lcom/daaw/y31;)Z
    .locals 6

    invoke-virtual {p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object v0

    iget v1, p0, Lcom/daaw/ok1;->I:I

    int-to-float v1, v1

    const v2, 0x3e0f5c29    # 0.14f

    mul-float v1, v1, v2

    const v2, 0x3c23d70a    # 0.01f

    mul-float v1, v1, v2

    invoke-virtual {v0, v1}, Lcom/daaw/aq0;->h(F)F

    move-result v0

    float-to-int v0, v0

    iget v1, p0, Lcom/daaw/ok1;->L:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    iget-object v2, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :catch_0
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    goto/16 :goto_1

    :cond_0
    iget-object v2, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    const-string v3, "default_bold"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    goto/16 :goto_1

    :cond_1
    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_a

    :try_start_0
    const-string v3, "internal_0"

    iget-object v4, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/greatvibes-regular.otf"

    :goto_0
    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    goto/16 :goto_1

    :cond_2
    const-string v3, "internal_1"

    iget-object v4, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/notomono-regular.ttf"

    goto :goto_0

    :cond_3
    const-string v3, "internal_2"

    iget-object v4, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/orbitron-medium.otf"

    goto :goto_0

    :cond_4
    const-string v3, "internal_3"

    iget-object v4, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/orkney-light.otf"

    goto :goto_0

    :cond_5
    const-string v3, "internal_4"

    iget-object v4, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/Akshar-Medium.ttf"

    goto :goto_0

    :cond_6
    const-string v3, "internal_5"

    iget-object v4, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/Hibana-SubMedium.otf"

    goto :goto_0

    :cond_7
    const-string v3, "internal_6"

    iget-object v4, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/Russo_One.ttf"

    goto :goto_0

    :cond_8
    const-string v3, "internal_7"

    iget-object v4, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/Space-Fray.ttf"

    goto :goto_0

    :cond_9
    const-string v3, "internal_8"

    iget-object v4, p0, Lcom/daaw/ok1;->K:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/Valden.otf"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :cond_a
    :goto_1
    iget-object v2, p0, Lcom/daaw/ok1;->G:Lcom/daaw/te1;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lcom/daaw/te1;->a()V

    :cond_b
    new-instance v2, Lcom/daaw/te1;

    const/16 v3, 0xa

    new-array v3, v3, [Lcom/daaw/ve;

    const/4 v4, 0x0

    invoke-static {}, Lcom/daaw/ve;->c()Lcom/daaw/ve;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-static {}, Lcom/daaw/ve;->l()Lcom/daaw/ve;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x2

    invoke-static {}, Lcom/daaw/ve;->f()Lcom/daaw/ve;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x3

    invoke-static {}, Lcom/daaw/ve;->g()Lcom/daaw/ve;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x4

    invoke-static {}, Lcom/daaw/ve;->e()Lcom/daaw/ve;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x5

    invoke-static {}, Lcom/daaw/ve;->k()Lcom/daaw/ve;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x6

    invoke-static {}, Lcom/daaw/ve;->h()Lcom/daaw/ve;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x7

    invoke-static {}, Lcom/daaw/ve;->b()Lcom/daaw/ve;

    move-result-object v5

    aput-object v5, v3, v4

    const/16 v4, 0x8

    invoke-static {}, Lcom/daaw/ve;->i()Lcom/daaw/ve;

    move-result-object v5

    aput-object v5, v3, v4

    const/16 v4, 0x9

    invoke-static {}, Lcom/daaw/ve;->j()Lcom/daaw/ve;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-direct {v2, v1, v0, v3}, Lcom/daaw/te1;-><init>(Landroid/graphics/Typeface;I[Lcom/daaw/ve;)V

    iput-object v2, p0, Lcom/daaw/ok1;->G:Lcom/daaw/te1;

    invoke-super {p0, p1}, Lcom/daaw/tv;->v(Lcom/daaw/y31;)Z

    move-result p1

    return p1
.end method

.method public x(Lcom/daaw/y31;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/tv;->x(Lcom/daaw/y31;)V

    iget-object p1, p0, Lcom/daaw/ok1;->G:Lcom/daaw/te1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/te1;->a()V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/ok1;->G:Lcom/daaw/te1;

    return-void
.end method

.method public z(Lcom/daaw/un;Lcom/daaw/od0;)V
    .locals 8

    invoke-super {p0, p1, p2}, Lcom/daaw/tv;->z(Lcom/daaw/un;Lcom/daaw/od0;)V

    invoke-super {p0, p1}, Lcom/daaw/tv;->A(Lcom/daaw/un;)V

    const p2, 0x7f1002a8

    invoke-virtual {p0, p2}, Lcom/daaw/tv;->j(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/un;->p0(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/ok1;->H:Ljava/lang/String;

    const-string v0, "text"

    const-string v1, "appearance"

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/un;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget p2, p0, Lcom/daaw/ok1;->J:I

    const-string v0, "color"

    invoke-virtual {p1, v0, p2, v1}, Lcom/daaw/un;->T(Ljava/lang/String;ILjava/lang/String;)V

    iget v4, p0, Lcom/daaw/ok1;->I:I

    const-string v3, "fontSize"

    const-string v5, "appearance"

    const/16 v6, 0x8

    const/16 v7, 0x64

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    invoke-virtual {p0, p1}, Lcom/daaw/ok1;->d0(Lcom/daaw/un;)V

    return-void
.end method
