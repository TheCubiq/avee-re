.class public final Lcom/daaw/rg8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/d34;

.field public b:Lcom/daaw/y17;

.field public c:Lcom/daaw/b27;

.field public d:Lcom/daaw/pr8;

.field public e:Lcom/daaw/pr8;

.field public f:Lcom/daaw/pr8;


# direct methods
.method public constructor <init>(Lcom/daaw/d34;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rg8;->a:Lcom/daaw/d34;

    invoke-static {}, Lcom/daaw/y17;->u()Lcom/daaw/y17;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rg8;->b:Lcom/daaw/y17;

    invoke-static {}, Lcom/daaw/b27;->d()Lcom/daaw/b27;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rg8;->c:Lcom/daaw/b27;

    return-void
.end method

.method public static bridge synthetic f(Lcom/daaw/rg8;)Lcom/daaw/y17;
    .locals 0

    iget-object p0, p0, Lcom/daaw/rg8;->b:Lcom/daaw/y17;

    return-object p0
.end method

.method public static j(Lcom/daaw/ty3;Lcom/daaw/y17;Lcom/daaw/pr8;Lcom/daaw/d34;)Lcom/daaw/pr8;
    .locals 10

    invoke-interface {p0}, Lcom/daaw/ty3;->zzn()Lcom/daaw/l64;

    move-result-object v0

    invoke-interface {p0}, Lcom/daaw/ty3;->zzg()I

    move-result v1

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lcom/daaw/l64;->f(I)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    invoke-interface {p0}, Lcom/daaw/ty3;->zzs()Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, -0x1

    if-nez v4, :cond_2

    invoke-virtual {v0}, Lcom/daaw/l64;->o()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, p3, v5}, Lcom/daaw/l64;->d(ILcom/daaw/d34;Z)Lcom/daaw/d34;

    move-result-object p3

    invoke-interface {p0}, Lcom/daaw/ty3;->zzl()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/daaw/it5;->f0(J)J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lcom/daaw/d34;->c(J)I

    move-result p3

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p3, -0x1

    :goto_2
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/pr8;

    invoke-interface {p0}, Lcom/daaw/ty3;->zzs()Z

    move-result v6

    invoke-interface {p0}, Lcom/daaw/ty3;->zzd()I

    move-result v7

    invoke-interface {p0}, Lcom/daaw/ty3;->zze()I

    move-result v8

    move-object v4, v1

    move-object v5, v2

    move v9, p3

    invoke-static/range {v4 .. v9}, Lcom/daaw/rg8;->m(Lcom/daaw/pr8;Ljava/lang/Object;ZIII)Z

    move-result v4

    if-eqz v4, :cond_3

    return-object v1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz p2, :cond_5

    invoke-interface {p0}, Lcom/daaw/ty3;->zzs()Z

    move-result v6

    invoke-interface {p0}, Lcom/daaw/ty3;->zzd()I

    move-result v7

    invoke-interface {p0}, Lcom/daaw/ty3;->zze()I

    move-result v8

    move-object v4, p2

    move-object v5, v2

    move v9, p3

    invoke-static/range {v4 .. v9}, Lcom/daaw/rg8;->m(Lcom/daaw/pr8;Ljava/lang/Object;ZIII)Z

    move-result p0

    if-eqz p0, :cond_5

    return-object p2

    :cond_5
    return-object v3
.end method

.method public static m(Lcom/daaw/pr8;Ljava/lang/Object;ZIII)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x1

    if-eqz p2, :cond_2

    iget p2, p0, Lcom/daaw/md3;->b:I

    if-ne p2, p3, :cond_3

    iget p0, p0, Lcom/daaw/md3;->c:I

    if-ne p0, p4, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    iget p2, p0, Lcom/daaw/md3;->b:I

    const/4 p3, -0x1

    if-ne p2, p3, :cond_3

    iget p0, p0, Lcom/daaw/md3;->e:I

    if-ne p0, p5, :cond_3

    :goto_0
    const/4 v0, 0x1

    nop

    :cond_3
    return v0
.end method


# virtual methods
.method public final a(Lcom/daaw/pr8;)Lcom/daaw/l64;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rg8;->c:Lcom/daaw/b27;

    invoke-virtual {v0, p1}, Lcom/daaw/b27;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/l64;

    return-object p1
.end method

.method public final b()Lcom/daaw/pr8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rg8;->d:Lcom/daaw/pr8;

    return-object v0
.end method

.method public final c()Lcom/daaw/pr8;
    .locals 3

    iget-object v0, p0, Lcom/daaw/rg8;->b:Lcom/daaw/y17;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/rg8;->b:Lcom/daaw/y17;

    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    move-object v0, v1

    :goto_0
    check-cast v0, Lcom/daaw/pr8;

    return-object v0
.end method

.method public final d()Lcom/daaw/pr8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rg8;->e:Lcom/daaw/pr8;

    return-object v0
.end method

.method public final e()Lcom/daaw/pr8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rg8;->f:Lcom/daaw/pr8;

    return-object v0
.end method

.method public final g(Lcom/daaw/ty3;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/rg8;->b:Lcom/daaw/y17;

    iget-object v1, p0, Lcom/daaw/rg8;->e:Lcom/daaw/pr8;

    iget-object v2, p0, Lcom/daaw/rg8;->a:Lcom/daaw/d34;

    invoke-static {p1, v0, v1, v2}, Lcom/daaw/rg8;->j(Lcom/daaw/ty3;Lcom/daaw/y17;Lcom/daaw/pr8;Lcom/daaw/d34;)Lcom/daaw/pr8;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rg8;->d:Lcom/daaw/pr8;

    return-void
.end method

.method public final h(Ljava/util/List;Lcom/daaw/pr8;Lcom/daaw/ty3;)V
    .locals 1

    invoke-static {p1}, Lcom/daaw/y17;->s(Ljava/util/Collection;)Lcom/daaw/y17;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/rg8;->b:Lcom/daaw/y17;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/pr8;

    iput-object p1, p0, Lcom/daaw/rg8;->e:Lcom/daaw/pr8;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/rg8;->f:Lcom/daaw/pr8;

    :cond_0
    iget-object p1, p0, Lcom/daaw/rg8;->d:Lcom/daaw/pr8;

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/rg8;->b:Lcom/daaw/y17;

    iget-object p2, p0, Lcom/daaw/rg8;->e:Lcom/daaw/pr8;

    iget-object v0, p0, Lcom/daaw/rg8;->a:Lcom/daaw/d34;

    invoke-static {p3, p1, p2, v0}, Lcom/daaw/rg8;->j(Lcom/daaw/ty3;Lcom/daaw/y17;Lcom/daaw/pr8;Lcom/daaw/d34;)Lcom/daaw/pr8;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rg8;->d:Lcom/daaw/pr8;

    :cond_1
    invoke-interface {p3}, Lcom/daaw/ty3;->zzn()Lcom/daaw/l64;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/rg8;->l(Lcom/daaw/l64;)V

    return-void
.end method

.method public final i(Lcom/daaw/ty3;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/rg8;->b:Lcom/daaw/y17;

    iget-object v1, p0, Lcom/daaw/rg8;->e:Lcom/daaw/pr8;

    iget-object v2, p0, Lcom/daaw/rg8;->a:Lcom/daaw/d34;

    invoke-static {p1, v0, v1, v2}, Lcom/daaw/rg8;->j(Lcom/daaw/ty3;Lcom/daaw/y17;Lcom/daaw/pr8;Lcom/daaw/d34;)Lcom/daaw/pr8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/rg8;->d:Lcom/daaw/pr8;

    invoke-interface {p1}, Lcom/daaw/ty3;->zzn()Lcom/daaw/l64;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/rg8;->l(Lcom/daaw/l64;)V

    return-void
.end method

.method public final k(Lcom/daaw/a27;Lcom/daaw/pr8;Lcom/daaw/l64;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p2, Lcom/daaw/md3;->a:Ljava/lang/Object;

    invoke-virtual {p3, v0}, Lcom/daaw/l64;->a(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1, p2, p3}, Lcom/daaw/a27;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/a27;

    return-void

    :cond_1
    iget-object p3, p0, Lcom/daaw/rg8;->c:Lcom/daaw/b27;

    invoke-virtual {p3, p2}, Lcom/daaw/b27;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/l64;

    if-eqz p3, :cond_2

    invoke-virtual {p1, p2, p3}, Lcom/daaw/a27;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/daaw/a27;

    :cond_2
    return-void
.end method

.method public final l(Lcom/daaw/l64;)V
    .locals 3

    new-instance v0, Lcom/daaw/a27;

    invoke-direct {v0}, Lcom/daaw/a27;-><init>()V

    iget-object v1, p0, Lcom/daaw/rg8;->b:Lcom/daaw/y17;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/rg8;->e:Lcom/daaw/pr8;

    invoke-virtual {p0, v0, v1, p1}, Lcom/daaw/rg8;->k(Lcom/daaw/a27;Lcom/daaw/pr8;Lcom/daaw/l64;)V

    iget-object v1, p0, Lcom/daaw/rg8;->f:Lcom/daaw/pr8;

    iget-object v2, p0, Lcom/daaw/rg8;->e:Lcom/daaw/pr8;

    invoke-static {v1, v2}, Lcom/daaw/ky6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/rg8;->f:Lcom/daaw/pr8;

    invoke-virtual {p0, v0, v1, p1}, Lcom/daaw/rg8;->k(Lcom/daaw/a27;Lcom/daaw/pr8;Lcom/daaw/l64;)V

    :cond_0
    iget-object v1, p0, Lcom/daaw/rg8;->d:Lcom/daaw/pr8;

    iget-object v2, p0, Lcom/daaw/rg8;->e:Lcom/daaw/pr8;

    invoke-static {v1, v2}, Lcom/daaw/ky6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/daaw/rg8;->d:Lcom/daaw/pr8;

    iget-object v2, p0, Lcom/daaw/rg8;->f:Lcom/daaw/pr8;

    invoke-static {v1, v2}, Lcom/daaw/ky6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/rg8;->b:Lcom/daaw/y17;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lcom/daaw/rg8;->b:Lcom/daaw/y17;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/pr8;

    invoke-virtual {p0, v0, v2, p1}, Lcom/daaw/rg8;->k(Lcom/daaw/a27;Lcom/daaw/pr8;Lcom/daaw/l64;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/daaw/rg8;->b:Lcom/daaw/y17;

    iget-object v2, p0, Lcom/daaw/rg8;->d:Lcom/daaw/pr8;

    invoke-virtual {v1, v2}, Lcom/daaw/y17;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    iget-object v1, p0, Lcom/daaw/rg8;->d:Lcom/daaw/pr8;

    invoke-virtual {p0, v0, v1, p1}, Lcom/daaw/rg8;->k(Lcom/daaw/a27;Lcom/daaw/pr8;Lcom/daaw/l64;)V

    :cond_3
    invoke-virtual {v0}, Lcom/daaw/a27;->c()Lcom/daaw/b27;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rg8;->c:Lcom/daaw/b27;

    return-void
.end method
