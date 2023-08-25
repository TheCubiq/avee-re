.class public Lcom/daaw/ja1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fe0;
.implements Lcom/daaw/rd0;


# instance fields
.field public a:[F

.field public b:F

.field public c:F

.field public d:[F

.field public e:I

.field public f:I

.field public final g:F

.field public final h:F

.field public final i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:Lcom/daaw/je0;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [F

    iput-object v1, p0, Lcom/daaw/ja1;->a:[F

    const/4 v1, 0x0

    iput v1, p0, Lcom/daaw/ja1;->b:F

    iput v1, p0, Lcom/daaw/ja1;->c:F

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/daaw/ja1;->d:[F

    const/16 v0, 0xb

    iput v0, p0, Lcom/daaw/ja1;->e:I

    const/16 v0, 0x8

    iput v0, p0, Lcom/daaw/ja1;->f:I

    const/high16 v0, 0x43960000    # 300.0f

    iput v0, p0, Lcom/daaw/ja1;->g:F

    const v0, 0x3f666666    # 0.9f

    iput v0, p0, Lcom/daaw/ja1;->h:F

    const v0, 0x3c23d70a    # 0.01f

    iput v0, p0, Lcom/daaw/ja1;->i:F

    const/high16 v0, 0x447a0000    # 1000.0f

    iput v0, p0, Lcom/daaw/ja1;->j:F

    iput v1, p0, Lcom/daaw/ja1;->k:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/ja1;->l:F

    new-instance v0, Lcom/daaw/ja1$a;

    invoke-direct {v0, p0}, Lcom/daaw/ja1$a;-><init>(Lcom/daaw/ja1;)V

    iput-object v0, p0, Lcom/daaw/ja1;->m:Lcom/daaw/je0;

    return-void
.end method

.method public static synthetic q(Lcom/daaw/ja1;)[F
    .locals 0

    iget-object p0, p0, Lcom/daaw/ja1;->a:[F

    return-object p0
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 2

    const-string v0, "inputSize"

    const/16 v1, 0xb

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ja1;->r(I)V

    const-string v0, "sampleOutCountPower"

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/ja1;->s(I)V

    return-void
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lcom/daaw/ja1;->c:F

    return v0
.end method

.method public f(IIILcom/daaw/je0;)Lcom/daaw/je0;
    .locals 0

    iget-object p1, p0, Lcom/daaw/ja1;->m:Lcom/daaw/je0;

    return-object p1
.end method

.method public j()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Lcom/daaw/de0;Lcom/daaw/sg0;)V
    .locals 10

    iget p1, p0, Lcom/daaw/ja1;->e:I

    const/4 v0, 0x1

    shl-int p1, v0, p1

    const/16 v1, 0x20

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/16 v1, 0x4000

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget v1, p0, Lcom/daaw/ja1;->f:I

    shl-int v1, v0, v1

    const/16 v2, 0x8

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    const/16 v2, 0x200

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-interface {p2, p1}, Lcom/daaw/sg0;->j(I)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/avee/comp/playback/a;->l()Lcom/daaw/ke0;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/ke0;->size()I

    move-result v5

    iget-object v6, p0, Lcom/daaw/ja1;->d:[F

    aput p2, v6, v3

    iget-short v7, p1, Lcom/daaw/avee/comp/playback/a;->e:S

    int-to-float v7, v7

    aput v7, v6, v0

    iget p1, p1, Lcom/daaw/avee/comp/playback/a;->g:F

    iput p1, p0, Lcom/daaw/ja1;->b:F

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/daaw/gd1;

    invoke-direct {v4, v3, v2}, Lcom/daaw/gd1;-><init>(SI)V

    iget-object p1, p0, Lcom/daaw/ja1;->d:[F

    aput p2, p1, v3

    const/high16 v5, 0x447a0000    # 1000.0f

    aput v5, p1, v0

    iput p2, p0, Lcom/daaw/ja1;->b:F

    const/4 v5, 0x4

    :goto_0
    if-ge v5, v2, :cond_1

    new-instance v4, Lcom/daaw/gd1;

    invoke-direct {v4, v3, v2}, Lcom/daaw/gd1;-><init>(SI)V

    goto :goto_1

    :cond_1
    move v2, v5

    :goto_1
    iget-object p1, p0, Lcom/daaw/ja1;->a:[F

    array-length p1, p1

    if-eq p1, v1, :cond_2

    new-array p1, v1, [F

    iput-object p1, p0, Lcom/daaw/ja1;->a:[F

    :cond_2
    iget-object p1, p0, Lcom/daaw/ja1;->d:[F

    invoke-virtual {p0, p1}, Lcom/daaw/ja1;->t([F)V

    const p1, 0x3ecccccd    # 0.4f

    int-to-float v0, v2

    iget-object v1, p0, Lcom/daaw/ja1;->a:[F

    array-length v1, v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/4 v1, 0x0

    :goto_2
    iget-object v5, p0, Lcom/daaw/ja1;->a:[F

    array-length v6, v5

    const/high16 v7, 0x3f800000    # 1.0f

    if-ge v1, v6, :cond_3

    aget v6, v5, v1

    mul-float v6, v6, p1

    mul-float v6, v6, v7

    aput v6, v5, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_3
    iput p2, p0, Lcom/daaw/ja1;->c:F

    const/high16 p1, 0x42c80000    # 100.0f

    const p2, 0x3f4ccccd    # 0.8f

    const/high16 v1, 0x3b800000    # 0.00390625f

    cmpl-float v5, v0, v7

    if-lez v5, :cond_6

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v2, :cond_5

    invoke-static {v5, v2, p2}, Lcom/daaw/bv;->d(IIF)F

    move-result v6

    mul-float v6, v6, v1

    invoke-interface {v4, v5}, Lcom/daaw/ke0;->get(I)S

    move-result v7

    int-to-float v7, v7

    mul-float v7, v7, v6

    iget v6, p0, Lcom/daaw/ja1;->l:F

    mul-float v7, v7, v6

    mul-float v7, v7, p1

    iget v8, p0, Lcom/daaw/ja1;->c:F

    mul-float v6, v6, v7

    invoke-static {v8, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    iput v6, p0, Lcom/daaw/ja1;->c:F

    int-to-float v6, v5

    div-float/2addr v6, v0

    float-to-double v8, v6

    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    move-result-wide v8

    double-to-int v6, v8

    iget-object v8, p0, Lcom/daaw/ja1;->a:[F

    array-length v9, v8

    if-ge v6, v9, :cond_4

    aget v9, v8, v6

    add-float/2addr v9, v7

    aput v9, v8, v6

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_5
    :goto_4
    iget-object p1, p0, Lcom/daaw/ja1;->a:[F

    array-length p2, p1

    if-ge v3, p2, :cond_7

    aget p2, p1, v3

    div-float/2addr p2, v0

    aput p2, p1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_6
    :goto_5
    iget-object v5, p0, Lcom/daaw/ja1;->a:[F

    array-length v5, v5

    if-ge v3, v5, :cond_7

    int-to-float v5, v3

    mul-float v5, v5, v0

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    move-result-wide v5

    double-to-int v5, v5

    invoke-static {v5, v2, p2}, Lcom/daaw/bv;->d(IIF)F

    move-result v6

    mul-float v6, v6, v1

    invoke-interface {v4, v5}, Lcom/daaw/ke0;->get(I)S

    move-result v5

    int-to-float v5, v5

    mul-float v5, v5, v6

    iget v6, p0, Lcom/daaw/ja1;->l:F

    mul-float v5, v5, v6

    mul-float v5, v5, p1

    iget v7, p0, Lcom/daaw/ja1;->c:F

    mul-float v6, v6, v5

    invoke-static {v7, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    iput v6, p0, Lcom/daaw/ja1;->c:F

    iget-object v6, p0, Lcom/daaw/ja1;->a:[F

    aget v7, v6, v3

    add-float/2addr v7, v5

    aput v7, v6, v3

    aget v5, v6, v3

    const/high16 v7, 0x3f000000    # 0.5f

    mul-float v5, v5, v7

    aput v5, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_7
    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 12

    iget v2, p0, Lcom/daaw/ja1;->e:I

    const-string v1, "inputSize"

    const-string v3, "Performance"

    const/4 v4, 0x5

    const/16 v5, 0xd

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    iget v8, p0, Lcom/daaw/ja1;->f:I

    const-string v7, "sampleOutCountPower"

    const-string v9, "Waveform"

    const/4 v10, 0x3

    const/16 v11, 0x9

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Lcom/daaw/un;->W(Ljava/lang/String;ILjava/lang/String;II)V

    return-void
.end method

.method public r(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/ja1;->e:I

    return-void
.end method

.method public s(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/ja1;->f:I

    return-void
.end method

.method public final t([F)V
    .locals 6

    iget v0, p0, Lcom/daaw/ja1;->k:F

    const v1, 0x3dccccd0    # 0.100000024f

    mul-float v0, v0, v1

    const/4 v2, 0x0

    aget v2, p1, v2

    const v3, 0x3f666666    # 0.9f

    mul-float v2, v2, v3

    add-float/2addr v0, v2

    iput v0, p0, Lcom/daaw/ja1;->k:F

    const/4 v2, 0x1

    aget v4, p1, v2

    iget v5, p0, Lcom/daaw/ja1;->j:F

    cmpl-float v4, v4, v5

    if-lez v4, :cond_0

    mul-float v5, v5, v1

    aget p1, p1, v2

    mul-float p1, p1, v3

    goto :goto_0

    :cond_0
    const v1, 0x3f7d70a4    # 0.99f

    mul-float v5, v5, v1

    aget p1, p1, v2

    const v1, 0x3c23d70a    # 0.01f

    mul-float p1, p1, v1

    :goto_0
    add-float/2addr v5, p1

    iput v5, p0, Lcom/daaw/ja1;->j:F

    iget p1, p0, Lcom/daaw/ja1;->j:F

    sub-float/2addr p1, v0

    iput p1, p0, Lcom/daaw/ja1;->l:F

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v0

    if-gez p1, :cond_1

    iput v0, p0, Lcom/daaw/ja1;->l:F

    :cond_1
    const/high16 p1, 0x43960000    # 300.0f

    iget v0, p0, Lcom/daaw/ja1;->l:F

    div-float/2addr p1, v0

    iput p1, p0, Lcom/daaw/ja1;->l:F

    return-void
.end method
