.class public Lcom/daaw/pr1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:[F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/daaw/pr1;->a:[F

    return-void
.end method


# virtual methods
.method public a()[F
    .locals 1

    iget-object v0, p0, Lcom/daaw/pr1;->a:[F

    return-object v0
.end method

.method public b(Lcom/daaw/pr1;Lcom/daaw/pr1;)V
    .locals 6

    invoke-virtual {p0}, Lcom/daaw/pr1;->a()[F

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/pr1;->a()[F

    move-result-object v2

    invoke-virtual {p2}, Lcom/daaw/pr1;->a()[F

    move-result-object v4

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method public c(F)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/pr1;->a:[F

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    move v2, p1

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/pr1;->a:[F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    return-void
.end method

.method public e(FFF)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/pr1;->a:[F

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, p2, p3}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    return-void
.end method
