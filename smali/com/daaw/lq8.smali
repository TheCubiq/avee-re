.class public abstract Lcom/daaw/lq8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rr8;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/HashSet;

.field public final c:Lcom/daaw/yr8;

.field public final d:Lcom/daaw/jn8;

.field public e:Landroid/os/Looper;

.field public f:Lcom/daaw/l64;

.field public g:Lcom/daaw/lh8;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/lq8;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/lq8;->b:Ljava/util/HashSet;

    new-instance v0, Lcom/daaw/yr8;

    invoke-direct {v0}, Lcom/daaw/yr8;-><init>()V

    iput-object v0, p0, Lcom/daaw/lq8;->c:Lcom/daaw/yr8;

    new-instance v0, Lcom/daaw/jn8;

    invoke-direct {v0}, Lcom/daaw/jn8;-><init>()V

    iput-object v0, p0, Lcom/daaw/lq8;->d:Lcom/daaw/jn8;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/qr8;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/lq8;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/lq8;->b:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    xor-int/lit8 p1, v0, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/lq8;->b:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/lq8;->u()V

    :cond_0
    return-void
.end method

.method public synthetic b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final d(Landroid/os/Handler;Lcom/daaw/ln8;)V
    .locals 1

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/lq8;->d:Lcom/daaw/jn8;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/jn8;->b(Landroid/os/Handler;Lcom/daaw/ln8;)V

    return-void
.end method

.method public final f(Landroid/os/Handler;Lcom/daaw/zr8;)V
    .locals 1

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/lq8;->c:Lcom/daaw/yr8;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/yr8;->b(Landroid/os/Handler;Lcom/daaw/zr8;)V

    return-void
.end method

.method public final g(Lcom/daaw/zr8;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lq8;->c:Lcom/daaw/yr8;

    invoke-virtual {v0, p1}, Lcom/daaw/yr8;->m(Lcom/daaw/zr8;)V

    return-void
.end method

.method public final i(Lcom/daaw/ln8;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lq8;->d:Lcom/daaw/jn8;

    invoke-virtual {v0, p1}, Lcom/daaw/jn8;->c(Lcom/daaw/ln8;)V

    return-void
.end method

.method public final j(Lcom/daaw/qr8;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/lq8;->e:Landroid/os/Looper;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/lq8;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/lq8;->b:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/lq8;->v()V

    :cond_0
    return-void
.end method

.method public final m(Lcom/daaw/qr8;Lcom/daaw/qz6;Lcom/daaw/lh8;)V
    .locals 3

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/lq8;->e:Landroid/os/Looper;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    invoke-static {v2}, Lcom/daaw/uo4;->d(Z)V

    iput-object p3, p0, Lcom/daaw/lq8;->g:Lcom/daaw/lh8;

    iget-object p3, p0, Lcom/daaw/lq8;->f:Lcom/daaw/l64;

    iget-object v1, p0, Lcom/daaw/lq8;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/daaw/lq8;->e:Landroid/os/Looper;

    if-nez v1, :cond_2

    iput-object v0, p0, Lcom/daaw/lq8;->e:Landroid/os/Looper;

    iget-object p3, p0, Lcom/daaw/lq8;->b:Ljava/util/HashSet;

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2}, Lcom/daaw/lq8;->w(Lcom/daaw/qz6;)V

    return-void

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p0, p1}, Lcom/daaw/lq8;->j(Lcom/daaw/qr8;)V

    invoke-interface {p1, p0, p3}, Lcom/daaw/qr8;->a(Lcom/daaw/rr8;Lcom/daaw/l64;)V

    :cond_3
    return-void
.end method

.method public final n(Lcom/daaw/qr8;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lq8;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/lq8;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/lq8;->e:Landroid/os/Looper;

    iput-object p1, p0, Lcom/daaw/lq8;->f:Lcom/daaw/l64;

    iput-object p1, p0, Lcom/daaw/lq8;->g:Lcom/daaw/lh8;

    iget-object p1, p0, Lcom/daaw/lq8;->b:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    invoke-virtual {p0}, Lcom/daaw/lq8;->y()V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/lq8;->a(Lcom/daaw/qr8;)V

    return-void
.end method

.method public final o()Lcom/daaw/lh8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lq8;->g:Lcom/daaw/lh8;

    invoke-static {v0}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public synthetic p()Lcom/daaw/l64;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final q(Lcom/daaw/pr8;)Lcom/daaw/jn8;
    .locals 2

    iget-object v0, p0, Lcom/daaw/lq8;->d:Lcom/daaw/jn8;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/daaw/jn8;->a(ILcom/daaw/pr8;)Lcom/daaw/jn8;

    move-result-object p1

    return-object p1
.end method

.method public final r(ILcom/daaw/pr8;)Lcom/daaw/jn8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/lq8;->d:Lcom/daaw/jn8;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/jn8;->a(ILcom/daaw/pr8;)Lcom/daaw/jn8;

    move-result-object p1

    return-object p1
.end method

.method public final s(Lcom/daaw/pr8;)Lcom/daaw/yr8;
    .locals 4

    iget-object v0, p0, Lcom/daaw/lq8;->c:Lcom/daaw/yr8;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/daaw/yr8;->a(ILcom/daaw/pr8;J)Lcom/daaw/yr8;

    move-result-object p1

    return-object p1
.end method

.method public final t(ILcom/daaw/pr8;J)Lcom/daaw/yr8;
    .locals 2

    iget-object p3, p0, Lcom/daaw/lq8;->c:Lcom/daaw/yr8;

    const-wide/16 v0, 0x0

    invoke-virtual {p3, p1, p2, v0, v1}, Lcom/daaw/yr8;->a(ILcom/daaw/pr8;J)Lcom/daaw/yr8;

    move-result-object p1

    return-object p1
.end method

.method public u()V
    .locals 0

    return-void
.end method

.method public v()V
    .locals 0

    return-void
.end method

.method public abstract w(Lcom/daaw/qz6;)V
.end method

.method public final x(Lcom/daaw/l64;)V
    .locals 4

    iput-object p1, p0, Lcom/daaw/lq8;->f:Lcom/daaw/l64;

    iget-object v0, p0, Lcom/daaw/lq8;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/qr8;

    invoke-interface {v3, p0, p1}, Lcom/daaw/qr8;->a(Lcom/daaw/rr8;Lcom/daaw/l64;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract y()V
.end method

.method public final z()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/lq8;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
