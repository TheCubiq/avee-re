.class public final Lcom/daaw/mn5;
.super Lcom/daaw/au3;
.source ""


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Lcom/daaw/e96;

.field public final r:Lcom/daaw/c96;

.field public final s:Lcom/daaw/yn5;

.field public final t:Lcom/daaw/g77;

.field public final u:Lcom/daaw/vn5;

.field public final v:Lcom/daaw/yu3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/e96;Lcom/daaw/c96;Lcom/daaw/vn5;Lcom/daaw/yn5;Lcom/daaw/g77;Lcom/daaw/yu3;[B)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/au3;-><init>()V

    iput-object p1, p0, Lcom/daaw/mn5;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/mn5;->q:Lcom/daaw/e96;

    iput-object p3, p0, Lcom/daaw/mn5;->r:Lcom/daaw/c96;

    iput-object p4, p0, Lcom/daaw/mn5;->u:Lcom/daaw/vn5;

    iput-object p5, p0, Lcom/daaw/mn5;->s:Lcom/daaw/yn5;

    iput-object p6, p0, Lcom/daaw/mn5;->t:Lcom/daaw/g77;

    iput-object p7, p0, Lcom/daaw/mn5;->v:Lcom/daaw/yu3;

    return-void
.end method


# virtual methods
.method public final F0(Lcom/google/android/gms/internal/ads/zzcbf;Lcom/daaw/eu3;)V
    .locals 5

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/mn5;->q:Lcom/daaw/e96;

    new-instance v2, Lcom/daaw/t86;

    invoke-direct {v2, p1, v0}, Lcom/daaw/t86;-><init>(Lcom/google/android/gms/internal/ads/zzcbf;I)V

    invoke-interface {v1, v2}, Lcom/daaw/e96;->a(Lcom/daaw/t86;)Lcom/daaw/e96;

    invoke-interface {v1}, Lcom/daaw/e96;->zzb()Lcom/daaw/f96;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/f96;->b()Lcom/daaw/en6;

    move-result-object v0

    sget-object v1, Lcom/daaw/hn5;->a:Lcom/daaw/hn5;

    sget-object v2, Lcom/daaw/in5;->a:Lcom/daaw/in5;

    sget-object v3, Lcom/daaw/ym6;->u:Lcom/daaw/ym6;

    invoke-static {}, Lcom/daaw/s67;->j()Lcom/daaw/f77;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/daaw/wm6;->b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object v0

    new-instance v3, Lcom/daaw/jn5;

    invoke-direct {v3, p1}, Lcom/daaw/jn5;-><init>(Lcom/daaw/f96;)V

    invoke-virtual {v0, v3}, Lcom/daaw/vm6;->f(Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/daaw/vm6;->e(Lcom/daaw/em6;)Lcom/daaw/vm6;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/daaw/vm6;->f(Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/mn5;->h3(Lcom/daaw/f77;Lcom/daaw/eu3;)V

    sget-object p2, Lcom/daaw/ab3;->d:Lcom/daaw/ma3;

    invoke-virtual {p2}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/mn5;->s:Lcom/daaw/yn5;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/daaw/fn5;

    invoke-direct {v0, p2}, Lcom/daaw/fn5;-><init>(Lcom/daaw/yn5;)V

    iget-object p2, p0, Lcom/daaw/mn5;->t:Lcom/daaw/g77;

    invoke-interface {p1, v0, p2}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_0
    return-void
.end method

.method public final U1(Lcom/google/android/gms/internal/ads/zzcbj;Lcom/daaw/eu3;)V
    .locals 1

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/mn5;->g3(Lcom/google/android/gms/internal/ads/zzcbj;I)Lcom/daaw/f77;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/mn5;->h3(Lcom/daaw/f77;Lcom/daaw/eu3;)V

    return-void
.end method

.method public final g3(Lcom/google/android/gms/internal/ads/zzcbj;I)Lcom/daaw/f77;
    .locals 8

    new-instance v7, Lcom/daaw/on5;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzcbj;->p:Ljava/lang/String;

    iget v2, p1, Lcom/google/android/gms/internal/ads/zzcbj;->q:I

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzcbj;->r:Landroid/os/Bundle;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-interface {v3, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object v4, p1, Lcom/google/android/gms/internal/ads/zzcbj;->s:[B

    iget-boolean v6, p1, Lcom/google/android/gms/internal/ads/zzcbj;->t:Z

    const-string v5, ""

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/on5;-><init>(Ljava/lang/String;ILjava/util/Map;[BLjava/lang/String;Z)V

    iget-object v0, p0, Lcom/daaw/mn5;->r:Lcom/daaw/c96;

    new-instance v1, Lcom/daaw/ma6;

    invoke-direct {v1, p1}, Lcom/daaw/ma6;-><init>(Lcom/google/android/gms/internal/ads/zzcbj;)V

    invoke-interface {v0, v1}, Lcom/daaw/c96;->a(Lcom/daaw/ma6;)Lcom/daaw/c96;

    invoke-interface {v0}, Lcom/daaw/c96;->zzb()Lcom/daaw/d96;

    move-result-object v0

    iget-boolean v1, v7, Lcom/daaw/on5;->f:Z

    if-eqz v1, :cond_4

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzcbj;->p:Ljava/lang/String;

    sget-object v1, Lcom/daaw/lb3;->c:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    const/16 v2, 0x3b

    invoke-static {v2}, Lcom/daaw/by6;->b(C)Lcom/daaw/by6;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/fz6;->c(Lcom/daaw/by6;)Lcom/daaw/fz6;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/fz6;->d(Ljava/lang/CharSequence;)Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lcom/daaw/d96;->a()Lcom/daaw/l76;

    move-result-object p1

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {p1, v1}, Lcom/daaw/l76;->a(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    new-instance v1, Lcom/daaw/kn5;

    invoke-direct {v1, v7}, Lcom/daaw/kn5;-><init>(Lcom/daaw/on5;)V

    iget-object v2, p0, Lcom/daaw/mn5;->t:Lcom/daaw/g77;

    invoke-static {p1, v1, v2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    goto :goto_2

    :cond_4
    :goto_1
    invoke-static {v7}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    :goto_2
    invoke-virtual {v0}, Lcom/daaw/d96;->b()Lcom/daaw/en6;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/mn5;->p:Landroid/content/Context;

    iget-object v4, p0, Lcom/daaw/mn5;->v:Lcom/daaw/yu3;

    new-instance v7, Lcom/daaw/un5;

    const/4 v6, 0x0

    const-string v3, ""

    move-object v1, v7

    move v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/daaw/un5;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/yu3;I[B)V

    sget-object p2, Lcom/daaw/ym6;->y:Lcom/daaw/ym6;

    invoke-virtual {v0, p2, p1}, Lcom/daaw/wm6;->b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object p1

    invoke-virtual {p1, v7}, Lcom/daaw/vm6;->e(Lcom/daaw/em6;)Lcom/daaw/vm6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object p1

    sget-object p2, Lcom/daaw/gn5;->a:Lcom/daaw/gn5;

    iget-object v0, p0, Lcom/daaw/mn5;->t:Lcom/daaw/g77;

    invoke-static {p1, p2, v0}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final h3(Lcom/daaw/f77;Lcom/daaw/eu3;)V
    .locals 2

    invoke-static {p1}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object p1

    new-instance v0, Lcom/daaw/en5;

    invoke-direct {v0, p0}, Lcom/daaw/en5;-><init>(Lcom/daaw/mn5;)V

    sget-object v1, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {p1, v0, v1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    new-instance v0, Lcom/daaw/ln5;

    invoke-direct {v0, p0, p2}, Lcom/daaw/ln5;-><init>(Lcom/daaw/mn5;Lcom/daaw/eu3;)V

    sget-object p2, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {p1, v0, p2}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method
