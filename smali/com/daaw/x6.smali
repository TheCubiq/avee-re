.class public Lcom/daaw/x6;
.super Lcom/daaw/z6;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/le0;IIIIZ)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/daaw/z6;-><init>(Lcom/daaw/le0;IIIIZ)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/le0;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/z6;-><init>(Lcom/daaw/le0;Z)V

    return-void
.end method


# virtual methods
.method public b(F)F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    invoke-super {p0, v0}, Lcom/daaw/z6;->b(F)F

    move-result p1

    return p1
.end method

.method public e(F)F
    .locals 0

    invoke-super {p0, p1}, Lcom/daaw/z6;->e(F)F

    move-result p1

    return p1
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public h(Lcom/daaw/le0;IIIIZ)Lcom/daaw/qc0;
    .locals 8

    new-instance v7, Lcom/daaw/x6;

    move-object v0, v7

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/daaw/x6;-><init>(Lcom/daaw/le0;IIIIZ)V

    return-object v7
.end method
