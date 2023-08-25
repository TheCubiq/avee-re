.class public Lcom/daaw/ok0;
.super Lcom/daaw/z6;
.source ""


# instance fields
.field public j:F


# direct methods
.method public constructor <init>(Lcom/daaw/le0;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/z6;-><init>(Lcom/daaw/le0;Z)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/ok0;->j:F

    return-void
.end method


# virtual methods
.method public b(F)F
    .locals 3

    iget v0, p0, Lcom/daaw/ok0;->j:F

    const/high16 v1, 0x3f000000    # 0.5f

    cmpl-float v2, v0, v1

    if-lez v2, :cond_0

    sub-float/2addr v0, v1

    sub-float v0, v1, v0

    :cond_0
    const v1, 0x3f4ccccd    # 0.8f

    mul-float v0, v0, v1

    const v1, 0x3e4ccccd    # 0.2f

    mul-float p1, p1, v1

    add-float/2addr p1, v0

    add-float/2addr p1, v0

    invoke-super {p0, p1}, Lcom/daaw/z6;->b(F)F

    move-result p1

    return p1
.end method

.method public c(F)Lcom/daaw/qc0;
    .locals 0

    return-object p0
.end method

.method public e(F)F
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/z6;->e(F)F

    move-result p1

    return p1
.end method

.method public i()I
    .locals 1

    const/16 v0, 0x64

    return v0
.end method

.method public j(F)V
    .locals 2

    iget v0, p0, Lcom/daaw/ok0;->j:F

    const v1, 0x3f666666    # 0.9f

    mul-float p1, p1, v1

    add-float/2addr v0, p1

    const/high16 p1, 0x3f800000    # 1.0f

    rem-float/2addr v0, p1

    iput v0, p0, Lcom/daaw/ok0;->j:F

    return-void
.end method
