.class public Lcom/daaw/aq0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/de0;

.field public b:Lcom/daaw/bq0;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/fe0;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/de0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/bq0;

    invoke-direct {v0}, Lcom/daaw/bq0;-><init>()V

    iput-object v0, p0, Lcom/daaw/aq0;->b:Lcom/daaw/bq0;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/aq0;->c:Ljava/util/List;

    iput-object p1, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/fe0;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/aq0;->c:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(I)Lcom/daaw/fe0;
    .locals 1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/aq0;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/aq0;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/fe0;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public c(FZFF)F
    .locals 0

    if-eqz p2, :cond_0

    cmpg-float p2, p4, p3

    if-gez p2, :cond_0

    mul-float p1, p1, p4

    return p1

    :cond_0
    mul-float p1, p1, p3

    return p1
.end method

.method public d(FZFF)F
    .locals 0

    if-eqz p2, :cond_0

    cmpg-float p2, p3, p4

    if-gez p2, :cond_0

    mul-float p1, p1, p3

    return p1

    :cond_0
    mul-float p1, p1, p4

    return p1
.end method

.method public e(F)F
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/aq0;->f(FZ)F

    move-result p1

    return p1
.end method

.method public f(FZ)F
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p2}, Lcom/daaw/de0;->a()I

    move-result p2

    iget-object v0, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {v0}, Lcom/daaw/de0;->f()I

    move-result v0

    if-ge p2, v0, :cond_0

    iget-object p2, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p2}, Lcom/daaw/de0;->a()I

    move-result p2

    :goto_0
    int-to-float p2, p2

    mul-float p1, p1, p2

    return p1

    :cond_0
    iget-object p2, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p2}, Lcom/daaw/de0;->f()I

    move-result p2

    goto :goto_0
.end method

.method public g(FZ)F
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p2}, Lcom/daaw/de0;->f()I

    move-result p2

    iget-object v0, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {v0}, Lcom/daaw/de0;->a()I

    move-result v0

    if-ge p2, v0, :cond_0

    iget-object p2, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p2}, Lcom/daaw/de0;->f()I

    move-result p2

    :goto_0
    int-to-float p2, p2

    mul-float p1, p1, p2

    return p1

    :cond_0
    iget-object p2, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p2}, Lcom/daaw/de0;->a()I

    move-result p2

    goto :goto_0
.end method

.method public h(F)F
    .locals 2

    iget-object v0, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {v0}, Lcom/daaw/de0;->a()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {v1}, Lcom/daaw/de0;->f()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {v0}, Lcom/daaw/de0;->a()I

    move-result v0

    :goto_0
    int-to-float v0, v0

    mul-float p1, p1, v0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {v0}, Lcom/daaw/de0;->f()I

    move-result v0

    goto :goto_0
.end method

.method public i(I)F
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    return v1

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    iget-object v0, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {v0}, Lcom/daaw/de0;->f()I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, p1

    return v0

    :cond_1
    const/high16 p1, 0x3f000000    # 0.5f

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p1}, Lcom/daaw/de0;->f()I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, v1

    return p1
.end method

.method public j(I)F
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    return v1

    :cond_0
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    iget-object v0, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {v0}, Lcom/daaw/de0;->a()I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, p1

    return v0

    :cond_1
    const/high16 p1, 0x3f000000    # 0.5f

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p1}, Lcom/daaw/de0;->a()I

    move-result p1

    int-to-float p1, p1

    mul-float p1, p1, v1

    return p1
.end method

.method public k(FZ)F
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p2}, Lcom/daaw/de0;->a()I

    move-result p2

    iget-object v0, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {v0}, Lcom/daaw/de0;->f()I

    move-result v0

    if-ge p2, v0, :cond_0

    iget-object p2, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p2}, Lcom/daaw/de0;->a()I

    move-result p2

    :goto_0
    int-to-float p2, p2

    mul-float p1, p1, p2

    return p1

    :cond_0
    iget-object p2, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p2}, Lcom/daaw/de0;->f()I

    move-result p2

    goto :goto_0
.end method

.method public l(FZ)F
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p2}, Lcom/daaw/de0;->f()I

    move-result p2

    iget-object v0, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {v0}, Lcom/daaw/de0;->a()I

    move-result v0

    if-ge p2, v0, :cond_0

    iget-object p2, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p2}, Lcom/daaw/de0;->f()I

    move-result p2

    :goto_0
    int-to-float p2, p2

    mul-float p1, p1, p2

    return p1

    :cond_0
    iget-object p2, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {p2}, Lcom/daaw/de0;->a()I

    move-result p2

    goto :goto_0
.end method

.method public m(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {v0}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->b()Lcom/daaw/sg0;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/sg0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "result null, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return-object p1

    :cond_0
    return-object v0
.end method

.method public n(Ljava/lang/String;Lcom/daaw/bs1;Lcom/daaw/bs1;)Lcom/daaw/bs1;
    .locals 7

    iget-object v0, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    invoke-interface {v0}, Lcom/daaw/de0;->b()Lcom/daaw/de0$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/de0$a;->b()Lcom/daaw/sg0;

    move-result-object v1

    iget-object v5, p0, Lcom/daaw/aq0;->b:Lcom/daaw/bq0;

    iget-object v6, p0, Lcom/daaw/aq0;->a:Lcom/daaw/de0;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-interface/range {v1 .. v6}, Lcom/daaw/sg0;->a(Ljava/lang/String;Lcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/bq0;Lcom/daaw/de0;)Lcom/daaw/bs1;

    move-result-object p2

    if-nez p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "result null, "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/bs1;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p2}, Lcom/daaw/bs1;-><init>(FF)V

    return-object p1

    :cond_0
    return-object p2
.end method

.method public o()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/aq0;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public p(F)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/aq0;->b:Lcom/daaw/bq0;

    iput p1, v0, Lcom/daaw/bq0;->a:F

    return-void
.end method

.method public q(F)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/aq0;->b:Lcom/daaw/bq0;

    iput p1, v0, Lcom/daaw/bq0;->b:F

    return-void
.end method
