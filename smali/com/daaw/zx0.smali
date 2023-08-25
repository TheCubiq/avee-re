.class public Lcom/daaw/zx0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/zx0$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/zx0$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public b(F)F
    .locals 4

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v0, 0x0

    const/4 v1, -0x1

    :goto_0
    iget-object v2, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/zx0$a;

    iget v2, v2, Lcom/daaw/zx0$a;->a:F

    cmpl-float v2, v2, p1

    if-nez v2, :cond_0

    iget-object p1, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/zx0$a;

    iget p1, p1, Lcom/daaw/zx0$a;->b:F

    return p1

    :cond_0
    iget-object v2, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/zx0$a;

    iget v2, v2, Lcom/daaw/zx0$a;->a:F

    cmpl-float v2, v2, p1

    if-lez v2, :cond_1

    invoke-virtual {p0, v1, v0, p1}, Lcom/daaw/zx0;->c(IIF)F

    move-result p1

    return p1

    :cond_1
    add-int/lit8 v1, v0, 0x1

    move v3, v1

    move v1, v0

    move v0, v3

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0, v1, v0, p1}, Lcom/daaw/zx0;->c(IIF)F

    move-result p1

    return p1
.end method

.method public c(IIF)F
    .locals 2

    iget-object v0, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, 0x0

    :cond_1
    iget-object v0, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p2, v0, :cond_2

    iget-object p2, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :cond_2
    if-ne p1, p2, :cond_3

    iget-object p1, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/zx0$a;

    iget p1, p1, Lcom/daaw/zx0$a;->b:F

    return p1

    :cond_3
    iget-object v0, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/zx0$a;

    iget v0, v0, Lcom/daaw/zx0$a;->a:F

    sub-float/2addr p3, v0

    iget-object v0, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/zx0$a;

    iget v0, v0, Lcom/daaw/zx0$a;->a:F

    iget-object v1, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/zx0$a;

    iget v1, v1, Lcom/daaw/zx0$a;->a:F

    sub-float/2addr v0, v1

    div-float/2addr p3, v0

    iget-object v0, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/zx0$a;

    iget p1, p1, Lcom/daaw/zx0$a;->b:F

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p3

    mul-float p1, p1, v0

    iget-object v0, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/zx0$a;

    iget p2, p2, Lcom/daaw/zx0$a;->b:F

    mul-float p2, p2, p3

    add-float/2addr p1, p2

    return p1
.end method

.method public d(FF)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/zx0$a;

    iget v1, v1, Lcom/daaw/zx0$a;->a:F

    cmpl-float v1, v1, p1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/zx0$a;

    iget v1, v1, Lcom/daaw/zx0$a;->a:F

    cmpl-float v1, v1, p1

    if-lez v1, :cond_1

    iget-object v1, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    new-instance v2, Lcom/daaw/zx0$a;

    invoke-direct {v2, p0, p1, p2}, Lcom/daaw/zx0$a;-><init>(Lcom/daaw/zx0;FF)V

    invoke-interface {v1, v0, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/zx0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Lcom/daaw/zx0$a;

    invoke-direct {v2, p0, p1, p2}, Lcom/daaw/zx0$a;-><init>(Lcom/daaw/zx0;FF)V

    invoke-interface {v0, v1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method
