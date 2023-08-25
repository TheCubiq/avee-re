.class public final Lcom/daaw/n88;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/lh8;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/IdentityHashMap;

.field public final d:Ljava/util/Map;

.field public final e:Lcom/daaw/k88;

.field public final f:Lcom/daaw/yr8;

.field public final g:Lcom/daaw/jn8;

.field public final h:Ljava/util/HashMap;

.field public final i:Ljava/util/Set;

.field public j:Z

.field public k:Lcom/daaw/qz6;

.field public l:Lcom/daaw/wt8;


# direct methods
.method public constructor <init>(Lcom/daaw/k88;Lcom/daaw/fb8;Landroid/os/Handler;Lcom/daaw/lh8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lcom/daaw/n88;->a:Lcom/daaw/lh8;

    iput-object p1, p0, Lcom/daaw/n88;->e:Lcom/daaw/k88;

    new-instance p1, Lcom/daaw/wt8;

    const/4 p4, 0x0

    invoke-direct {p1, p4}, Lcom/daaw/wt8;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/n88;->l:Lcom/daaw/wt8;

    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/n88;->c:Ljava/util/IdentityHashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/n88;->d:Ljava/util/Map;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    new-instance p1, Lcom/daaw/yr8;

    invoke-direct {p1}, Lcom/daaw/yr8;-><init>()V

    iput-object p1, p0, Lcom/daaw/n88;->f:Lcom/daaw/yr8;

    new-instance p4, Lcom/daaw/jn8;

    invoke-direct {p4}, Lcom/daaw/jn8;-><init>()V

    iput-object p4, p0, Lcom/daaw/n88;->g:Lcom/daaw/jn8;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/n88;->h:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/n88;->i:Ljava/util/Set;

    invoke-virtual {p1, p3, p2}, Lcom/daaw/yr8;->b(Landroid/os/Handler;Lcom/daaw/zr8;)V

    invoke-virtual {p4, p3, p2}, Lcom/daaw/jn8;->b(Landroid/os/Handler;Lcom/daaw/ln8;)V

    return-void
.end method

.method public static bridge synthetic c(Lcom/daaw/n88;)Lcom/daaw/jn8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/n88;->g:Lcom/daaw/jn8;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/n88;)Lcom/daaw/yr8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/n88;->f:Lcom/daaw/yr8;

    return-object p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final b()Lcom/daaw/l64;
    .locals 4

    iget-object v0, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/h88;

    iput v1, v2, Lcom/daaw/h88;->d:I

    iget-object v2, v2, Lcom/daaw/h88;->a:Lcom/daaw/kr8;

    invoke-virtual {v2}, Lcom/daaw/kr8;->I()Lcom/daaw/l64;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/l64;->c()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/c98;

    iget-object v1, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    iget-object v2, p0, Lcom/daaw/n88;->l:Lcom/daaw/wt8;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/c98;-><init>(Ljava/util/Collection;Lcom/daaw/wt8;[B)V

    return-object v0

    :cond_1
    sget-object v0, Lcom/daaw/l64;->a:Lcom/daaw/l64;

    return-object v0
.end method

.method public final synthetic e(Lcom/daaw/rr8;Lcom/daaw/l64;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/n88;->e:Lcom/daaw/k88;

    invoke-interface {p1}, Lcom/daaw/k88;->zzh()V

    return-void
.end method

.method public final f(Lcom/daaw/qz6;)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/n88;->j:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iput-object p1, p0, Lcom/daaw/n88;->k:Lcom/daaw/qz6;

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/h88;

    invoke-virtual {p0, v0}, Lcom/daaw/n88;->t(Lcom/daaw/h88;)V

    iget-object v2, p0, Lcom/daaw/n88;->i:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lcom/daaw/n88;->j:Z

    return-void
.end method

.method public final g()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/n88;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/e88;

    :try_start_0
    iget-object v2, v1, Lcom/daaw/e88;->a:Lcom/daaw/rr8;

    iget-object v3, v1, Lcom/daaw/e88;->b:Lcom/daaw/qr8;

    invoke-interface {v2, v3}, Lcom/daaw/rr8;->n(Lcom/daaw/qr8;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    const-string v3, "MediaSourceList"

    const-string v4, "Failed to release child source."

    invoke-static {v3, v4, v2}, Lcom/daaw/s95;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    iget-object v2, v1, Lcom/daaw/e88;->a:Lcom/daaw/rr8;

    iget-object v3, v1, Lcom/daaw/e88;->c:Lcom/daaw/b88;

    invoke-interface {v2, v3}, Lcom/daaw/rr8;->g(Lcom/daaw/zr8;)V

    iget-object v2, v1, Lcom/daaw/e88;->a:Lcom/daaw/rr8;

    iget-object v1, v1, Lcom/daaw/e88;->c:Lcom/daaw/b88;

    invoke-interface {v2, v1}, Lcom/daaw/rr8;->i(Lcom/daaw/ln8;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/n88;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lcom/daaw/n88;->i:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/n88;->j:Z

    return-void
.end method

.method public final h(Lcom/daaw/nr8;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n88;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/h88;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lcom/daaw/h88;->a:Lcom/daaw/kr8;

    invoke-virtual {v1, p1}, Lcom/daaw/cu8;->l(Lcom/daaw/nr8;)V

    iget-object v1, v0, Lcom/daaw/h88;->c:Ljava/util/List;

    check-cast p1, Lcom/daaw/br8;

    iget-object p1, p1, Lcom/daaw/br8;->p:Lcom/daaw/pr8;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/daaw/n88;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {p1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/n88;->r()V

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/n88;->s(Lcom/daaw/h88;)V

    return-void
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/n88;->j:Z

    return v0
.end method

.method public final j(ILjava/util/List;Lcom/daaw/wt8;)Lcom/daaw/l64;
    .locals 3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p3, p0, Lcom/daaw/n88;->l:Lcom/daaw/wt8;

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, p1

    if-ge p3, v0, :cond_3

    sub-int v0, p3, p1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/h88;

    if-lez p3, :cond_0

    iget-object v1, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    add-int/lit8 v2, p3, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/h88;

    iget-object v2, v1, Lcom/daaw/h88;->a:Lcom/daaw/kr8;

    invoke-virtual {v2}, Lcom/daaw/kr8;->I()Lcom/daaw/l64;

    move-result-object v2

    iget v1, v1, Lcom/daaw/h88;->d:I

    invoke-virtual {v2}, Lcom/daaw/l64;->c()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lcom/daaw/h88;->a(I)V

    iget-object v1, v0, Lcom/daaw/h88;->a:Lcom/daaw/kr8;

    invoke-virtual {v1}, Lcom/daaw/kr8;->I()Lcom/daaw/l64;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/l64;->c()I

    move-result v1

    invoke-virtual {p0, p3, v1}, Lcom/daaw/n88;->p(II)V

    iget-object v1, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    invoke-interface {v1, p3, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object v1, p0, Lcom/daaw/n88;->d:Ljava/util/Map;

    iget-object v2, v0, Lcom/daaw/h88;->b:Ljava/lang/Object;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Lcom/daaw/n88;->j:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, Lcom/daaw/n88;->t(Lcom/daaw/h88;)V

    iget-object v1, p0, Lcom/daaw/n88;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {v1}, Ljava/util/IdentityHashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/n88;->i:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v0}, Lcom/daaw/n88;->q(Lcom/daaw/h88;)V

    :cond_2
    :goto_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/n88;->b()Lcom/daaw/l64;

    move-result-object p1

    return-object p1
.end method

.method public final k(IIILcom/daaw/wt8;)Lcom/daaw/l64;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/n88;->a()I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lcom/daaw/uo4;->d(Z)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/n88;->l:Lcom/daaw/wt8;

    invoke-virtual {p0}, Lcom/daaw/n88;->b()Lcom/daaw/l64;

    move-result-object p1

    return-object p1
.end method

.method public final l(IILcom/daaw/wt8;)Lcom/daaw/l64;
    .locals 2

    const/4 v0, 0x0

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    invoke-virtual {p0}, Lcom/daaw/n88;->a()I

    move-result v1

    if-gt p2, v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Lcom/daaw/uo4;->d(Z)V

    iput-object p3, p0, Lcom/daaw/n88;->l:Lcom/daaw/wt8;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/n88;->u(II)V

    invoke-virtual {p0}, Lcom/daaw/n88;->b()Lcom/daaw/l64;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ljava/util/List;Lcom/daaw/wt8;)Lcom/daaw/l64;
    .locals 2

    iget-object v0, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/daaw/n88;->u(II)V

    iget-object v0, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0, v0, p1, p2}, Lcom/daaw/n88;->j(ILjava/util/List;Lcom/daaw/wt8;)Lcom/daaw/l64;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lcom/daaw/wt8;)Lcom/daaw/l64;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/n88;->a()I

    move-result v0

    invoke-virtual {p1}, Lcom/daaw/wt8;->c()I

    move-result v1

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/wt8;->f()Lcom/daaw/wt8;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lcom/daaw/wt8;->g(II)Lcom/daaw/wt8;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/daaw/n88;->l:Lcom/daaw/wt8;

    invoke-virtual {p0}, Lcom/daaw/n88;->b()Lcom/daaw/l64;

    move-result-object p1

    return-object p1
.end method

.method public final o(Lcom/daaw/pr8;Lcom/daaw/nw8;J)Lcom/daaw/nr8;
    .locals 3

    iget-object v0, p1, Lcom/daaw/md3;->a:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroid/util/Pair;

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Landroid/util/Pair;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lcom/daaw/pr8;->c(Ljava/lang/Object;)Lcom/daaw/pr8;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/n88;->d:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/h88;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/n88;->i:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/daaw/n88;->h:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/e88;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lcom/daaw/e88;->a:Lcom/daaw/rr8;

    iget-object v1, v1, Lcom/daaw/e88;->b:Lcom/daaw/qr8;

    invoke-interface {v2, v1}, Lcom/daaw/rr8;->j(Lcom/daaw/qr8;)V

    :cond_0
    iget-object v1, v0, Lcom/daaw/h88;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, v0, Lcom/daaw/h88;->a:Lcom/daaw/kr8;

    invoke-virtual {v1, p1, p2, p3, p4}, Lcom/daaw/kr8;->J(Lcom/daaw/pr8;Lcom/daaw/nw8;J)Lcom/daaw/br8;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/n88;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/daaw/n88;->r()V

    return-object p1
.end method

.method public final p(II)V
    .locals 2

    :goto_0
    iget-object v0, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/h88;

    iget v1, v0, Lcom/daaw/h88;->d:I

    add-int/2addr v1, p2

    iput v1, v0, Lcom/daaw/h88;->d:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final q(Lcom/daaw/h88;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n88;->h:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/e88;

    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/daaw/e88;->a:Lcom/daaw/rr8;

    iget-object p1, p1, Lcom/daaw/e88;->b:Lcom/daaw/qr8;

    invoke-interface {v0, p1}, Lcom/daaw/rr8;->a(Lcom/daaw/qr8;)V

    :cond_0
    return-void
.end method

.method public final r()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/n88;->i:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/h88;

    iget-object v2, v1, Lcom/daaw/h88;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/n88;->q(Lcom/daaw/h88;)V

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final s(Lcom/daaw/h88;)V
    .locals 3

    iget-boolean v0, p1, Lcom/daaw/h88;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/daaw/h88;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n88;->h:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/e88;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lcom/daaw/e88;->a:Lcom/daaw/rr8;

    iget-object v2, v0, Lcom/daaw/e88;->b:Lcom/daaw/qr8;

    invoke-interface {v1, v2}, Lcom/daaw/rr8;->n(Lcom/daaw/qr8;)V

    iget-object v1, v0, Lcom/daaw/e88;->a:Lcom/daaw/rr8;

    iget-object v2, v0, Lcom/daaw/e88;->c:Lcom/daaw/b88;

    invoke-interface {v1, v2}, Lcom/daaw/rr8;->g(Lcom/daaw/zr8;)V

    iget-object v1, v0, Lcom/daaw/e88;->a:Lcom/daaw/rr8;

    iget-object v0, v0, Lcom/daaw/e88;->c:Lcom/daaw/b88;

    invoke-interface {v1, v0}, Lcom/daaw/rr8;->i(Lcom/daaw/ln8;)V

    iget-object v0, p0, Lcom/daaw/n88;->i:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final t(Lcom/daaw/h88;)V
    .locals 5

    iget-object v0, p1, Lcom/daaw/h88;->a:Lcom/daaw/kr8;

    new-instance v1, Lcom/daaw/y78;

    invoke-direct {v1, p0}, Lcom/daaw/y78;-><init>(Lcom/daaw/n88;)V

    new-instance v2, Lcom/daaw/b88;

    invoke-direct {v2, p0, p1}, Lcom/daaw/b88;-><init>(Lcom/daaw/n88;Lcom/daaw/h88;)V

    iget-object v3, p0, Lcom/daaw/n88;->h:Ljava/util/HashMap;

    new-instance v4, Lcom/daaw/e88;

    invoke-direct {v4, v0, v1, v2}, Lcom/daaw/e88;-><init>(Lcom/daaw/rr8;Lcom/daaw/qr8;Lcom/daaw/b88;)V

    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/daaw/it5;->e()Landroid/os/Looper;

    move-result-object p1

    new-instance v3, Landroid/os/Handler;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    invoke-interface {v0, v3, v2}, Lcom/daaw/rr8;->f(Landroid/os/Handler;Lcom/daaw/zr8;)V

    invoke-static {}, Lcom/daaw/it5;->e()Landroid/os/Looper;

    move-result-object p1

    new-instance v3, Landroid/os/Handler;

    invoke-direct {v3, p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    invoke-interface {v0, v3, v2}, Lcom/daaw/rr8;->d(Landroid/os/Handler;Lcom/daaw/ln8;)V

    iget-object p1, p0, Lcom/daaw/n88;->k:Lcom/daaw/qz6;

    iget-object v2, p0, Lcom/daaw/n88;->a:Lcom/daaw/lh8;

    invoke-interface {v0, v1, p1, v2}, Lcom/daaw/rr8;->m(Lcom/daaw/qr8;Lcom/daaw/qz6;Lcom/daaw/lh8;)V

    return-void
.end method

.method public final u(II)V
    .locals 3

    :cond_0
    :goto_0
    add-int/lit8 p2, p2, -0x1

    if-lt p2, p1, :cond_1

    iget-object v0, p0, Lcom/daaw/n88;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/h88;

    iget-object v1, p0, Lcom/daaw/n88;->d:Ljava/util/Map;

    iget-object v2, v0, Lcom/daaw/h88;->b:Ljava/lang/Object;

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lcom/daaw/h88;->a:Lcom/daaw/kr8;

    invoke-virtual {v1}, Lcom/daaw/kr8;->I()Lcom/daaw/l64;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/l64;->c()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {p0, p2, v1}, Lcom/daaw/n88;->p(II)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/daaw/h88;->e:Z

    iget-boolean v1, p0, Lcom/daaw/n88;->j:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/daaw/n88;->s(Lcom/daaw/h88;)V

    goto :goto_0

    :cond_1
    return-void
.end method
