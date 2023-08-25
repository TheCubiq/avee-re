.class public abstract Lcom/daaw/xa1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/he0;


# instance fields
.field public a:[F

.field public b:[F

.field public c:[F

.field public d:Z

.field public e:F

.field public f:F

.field public g:F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v1, v0, [F

    iput-object v1, p0, Lcom/daaw/xa1;->a:[F

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/daaw/xa1;->b:[F

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/daaw/xa1;->c:[F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/xa1;->d:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/xa1;->e:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/daaw/xa1;->f:F

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 3

    const-string v0, "colorFrom"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "colorTo"

    invoke-virtual {p1, v2, v1}, Lcom/daaw/un;->r(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p0, v0, v2, v1}, Lcom/daaw/xa1;->s(III)Lcom/daaw/xa1;

    const-string v0, "fixedHeight"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/xa1;->t(F)Lcom/daaw/xa1;

    const-string v0, "barHeightMultiplier"

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0, v1}, Lcom/daaw/un;->o(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/daaw/xa1;->f:F

    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/xa1;->b:[F

    invoke-static {v0}, Lcom/daaw/f80;->m([F)I

    move-result v0

    const-string v1, "colorFrom"

    const-string v2, "misc"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->T(Ljava/lang/String;ILjava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/xa1;->c:[F

    invoke-static {v0}, Lcom/daaw/f80;->m([F)I

    move-result v0

    const-string v1, "colorTo"

    invoke-virtual {p1, v1, v0, v2}, Lcom/daaw/un;->T(Ljava/lang/String;ILjava/lang/String;)V

    iget v2, p0, Lcom/daaw/xa1;->e:F

    const-string v1, "fixedHeight"

    const-string v3, "misc"

    const/high16 v4, -0x3db80000    # -50.0f

    const/high16 v5, 0x42480000    # 50.0f

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    iget v2, p0, Lcom/daaw/xa1;->f:F

    const-string v1, "barHeightMultiplier"

    const-string v3, "misc"

    const/high16 v4, -0x40000000    # -2.0f

    const/high16 v5, 0x40000000    # 2.0f

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/un;->O(Ljava/lang/String;FLjava/lang/String;FF)V

    return-void
.end method

.method public q(IIF)I
    .locals 3

    int-to-float p1, p1

    int-to-float p2, p2

    div-float/2addr p1, p2

    const/high16 p2, 0x41200000    # 10.0f

    sub-float/2addr p2, p3

    add-float/2addr p1, p2

    const/high16 p2, 0x3f800000    # 1.0f

    rem-float/2addr p1, p2

    iput p1, p0, Lcom/daaw/xa1;->g:F

    const/high16 p2, 0x40000000    # 2.0f

    const/high16 p3, 0x3f000000    # 0.5f

    cmpg-float v0, p1, p3

    if-gtz v0, :cond_0

    iget-object p3, p0, Lcom/daaw/xa1;->b:[F

    iget-object v0, p0, Lcom/daaw/xa1;->c:[F

    iget-object v1, p0, Lcom/daaw/xa1;->a:[F

    mul-float p1, p1, p2

    invoke-static {p3, v0, v1, p1}, Lcom/daaw/br1;->r([F[F[FF)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/xa1;->c:[F

    iget-object v1, p0, Lcom/daaw/xa1;->b:[F

    iget-object v2, p0, Lcom/daaw/xa1;->a:[F

    sub-float/2addr p1, p3

    mul-float p1, p1, p2

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/br1;->r([F[F[FF)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/xa1;->a:[F

    invoke-static {p1}, Lcom/daaw/f80;->m([F)I

    move-result p1

    return p1
.end method

.method public r(I)Lcom/daaw/xa1;
    .locals 0

    invoke-virtual {p0, p1, p1, p1}, Lcom/daaw/xa1;->s(III)Lcom/daaw/xa1;

    move-result-object p1

    return-object p1
.end method

.method public s(III)Lcom/daaw/xa1;
    .locals 0

    iget-object p3, p0, Lcom/daaw/xa1;->b:[F

    invoke-static {p3, p1}, Lcom/daaw/f80;->q([FI)V

    iget-object p1, p0, Lcom/daaw/xa1;->c:[F

    invoke-static {p1, p2}, Lcom/daaw/f80;->q([FI)V

    return-object p0
.end method

.method public t(F)Lcom/daaw/xa1;
    .locals 2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x3c23d70a    # 0.01f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/xa1;->d:Z

    iput p1, p0, Lcom/daaw/xa1;->e:F

    return-object p0
.end method
