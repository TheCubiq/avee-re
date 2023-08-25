.class public Lcom/daaw/pq0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/pq0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/g0<",
        "Lcom/daaw/y31;",
        "Lcom/daaw/sr1;",
        "Lcom/daaw/w31;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pq0;


# direct methods
.method public constructor <init>(Lcom/daaw/pq0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pq0$e;->a:Lcom/daaw/pq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/y31;

    check-cast p2, Lcom/daaw/sr1;

    check-cast p3, Lcom/daaw/w31;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/pq0$e;->b(Lcom/daaw/y31;Lcom/daaw/sr1;Lcom/daaw/w31;)V

    return-void
.end method

.method public b(Lcom/daaw/y31;Lcom/daaw/sr1;Lcom/daaw/w31;)V
    .locals 5

    invoke-virtual {p3}, Lcom/daaw/w31;->f()Lcom/daaw/qc0;

    move-result-object p3

    invoke-interface {p3}, Lcom/daaw/qc0;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    div-float v0, v1, v0

    invoke-interface {p3}, Lcom/daaw/qc0;->getHeight()I

    move-result p3

    int-to-float p3, p3

    div-float/2addr v1, p3

    iget-object p3, p0, Lcom/daaw/pq0$e;->a:Lcom/daaw/pq0;

    iget-object p3, p3, Lcom/daaw/pq0;->Y:Lcom/daaw/pr1;

    invoke-virtual {p3}, Lcom/daaw/pr1;->a()[F

    move-result-object p3

    const-string v2, "u_projView"

    const/4 v3, 0x0

    invoke-virtual {p2, v2, v3, p3}, Lcom/daaw/sr1;->E(Ljava/lang/String;Z[F)V

    iget-object p3, p0, Lcom/daaw/pq0$e;->a:Lcom/daaw/pq0;

    invoke-static {p3}, Lcom/daaw/pq0;->Z(Lcom/daaw/pq0;)Lcom/daaw/dm0;

    move-result-object p3

    invoke-virtual {p1}, Lcom/daaw/y31;->b()Lcom/daaw/de0$a;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/de0$a;->a()Lcom/daaw/aq0;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/daaw/dm0;->i(Lcom/daaw/aq0;)F

    move-result p1

    new-instance p3, Lcom/daaw/bs1;

    iget-object v2, p0, Lcom/daaw/pq0$e;->a:Lcom/daaw/pq0;

    invoke-static {v2}, Lcom/daaw/pq0;->a0(Lcom/daaw/pq0;)F

    move-result v2

    iget-object v3, p0, Lcom/daaw/pq0$e;->a:Lcom/daaw/pq0;

    invoke-static {v3}, Lcom/daaw/pq0;->b0(Lcom/daaw/pq0;)F

    move-result v3

    invoke-direct {p3, v2, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iget v2, p3, Lcom/daaw/bs1;->a:F

    mul-float v2, v2, p1

    mul-float v2, v2, v0

    iput v2, p3, Lcom/daaw/bs1;->a:F

    iget v2, p3, Lcom/daaw/bs1;->b:F

    mul-float v2, v2, p1

    mul-float v2, v2, v1

    iput v2, p3, Lcom/daaw/bs1;->b:F

    invoke-virtual {p3}, Lcom/daaw/bs1;->k()F

    move-result v2

    const/high16 v3, 0x40800000    # 4.0f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    invoke-virtual {p3}, Lcom/daaw/bs1;->o()Lcom/daaw/bs1;

    iget v2, p3, Lcom/daaw/bs1;->a:F

    mul-float v2, v2, v3

    iput v2, p3, Lcom/daaw/bs1;->a:F

    iget v2, p3, Lcom/daaw/bs1;->b:F

    mul-float v2, v2, v3

    iput v2, p3, Lcom/daaw/bs1;->b:F

    :cond_0
    iget v2, p3, Lcom/daaw/bs1;->a:F

    neg-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    mul-float v2, v2, v3

    iget p3, p3, Lcom/daaw/bs1;->b:F

    mul-float p3, p3, v3

    const-string v4, "posAmount"

    invoke-virtual {p2, v4, v2, p3}, Lcom/daaw/dc1;->t(Ljava/lang/String;FF)V

    new-instance p3, Lcom/daaw/bs1;

    iget-object v2, p0, Lcom/daaw/pq0$e;->a:Lcom/daaw/pq0;

    invoke-static {v2}, Lcom/daaw/pq0;->c0(Lcom/daaw/pq0;)F

    move-result v2

    iget-object v4, p0, Lcom/daaw/pq0$e;->a:Lcom/daaw/pq0;

    invoke-static {v4}, Lcom/daaw/pq0;->d0(Lcom/daaw/pq0;)F

    move-result v4

    invoke-direct {p3, v2, v4}, Lcom/daaw/bs1;-><init>(FF)V

    iget v2, p3, Lcom/daaw/bs1;->a:F

    mul-float v2, v2, p1

    mul-float v2, v2, v0

    iput v2, p3, Lcom/daaw/bs1;->a:F

    iget v0, p3, Lcom/daaw/bs1;->b:F

    mul-float v0, v0, p1

    mul-float v0, v0, v1

    iput v0, p3, Lcom/daaw/bs1;->b:F

    neg-float p1, v2

    mul-float p1, p1, v3

    mul-float v0, v0, v3

    const-string p3, "scaleAmount"

    invoke-virtual {p2, p3, p1, v0}, Lcom/daaw/dc1;->t(Ljava/lang/String;FF)V

    return-void
.end method
