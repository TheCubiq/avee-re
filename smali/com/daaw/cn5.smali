.class public final Lcom/daaw/cn5;
.super Lcom/daaw/wt3;
.source ""


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Ljava/util/concurrent/Executor;

.field public final r:Lcom/daaw/g77;

.field public final s:Lcom/daaw/yn5;

.field public final t:Lcom/daaw/hf4;

.field public final u:Ljava/util/ArrayDeque;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field public final v:Lcom/daaw/vo6;

.field public final w:Lcom/daaw/yu3;

.field public final x:Lcom/daaw/vn5;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/g77;Lcom/daaw/yu3;Lcom/daaw/hf4;Lcom/daaw/yn5;Ljava/util/ArrayDeque;Lcom/daaw/vn5;Lcom/daaw/vo6;[B)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/wt3;-><init>()V

    invoke-static {p1}, Lcom/daaw/g93;->c(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/daaw/cn5;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/cn5;->q:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/cn5;->r:Lcom/daaw/g77;

    iput-object p4, p0, Lcom/daaw/cn5;->w:Lcom/daaw/yu3;

    iput-object p6, p0, Lcom/daaw/cn5;->s:Lcom/daaw/yn5;

    iput-object p5, p0, Lcom/daaw/cn5;->t:Lcom/daaw/hf4;

    iput-object p7, p0, Lcom/daaw/cn5;->u:Ljava/util/ArrayDeque;

    iput-object p8, p0, Lcom/daaw/cn5;->x:Lcom/daaw/vn5;

    iput-object p9, p0, Lcom/daaw/cn5;->v:Lcom/daaw/vo6;

    return-void
.end method

.method public static m3(Lcom/daaw/f77;Lcom/daaw/en6;Lcom/daaw/xl3;Lcom/daaw/to6;Lcom/daaw/io6;)Lcom/daaw/f77;
    .locals 3

    sget-object v0, Lcom/daaw/ul3;->b:Lcom/daaw/rl3;

    sget-object v1, Lcom/daaw/tm5;->a:Lcom/daaw/tm5;

    const-string v2, "AFMA_getAdDictionary"

    invoke-virtual {p2, v2, v0, v1}, Lcom/daaw/xl3;->a(Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)Lcom/daaw/nl3;

    move-result-object p2

    invoke-static {p0, p4}, Lcom/daaw/so6;->d(Lcom/daaw/f77;Lcom/daaw/io6;)V

    sget-object v0, Lcom/daaw/ym6;->w:Lcom/daaw/ym6;

    invoke-virtual {p1, v0, p0}, Lcom/daaw/wm6;->b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/daaw/vm6;->f(Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object p0

    invoke-static {p0, p3, p4}, Lcom/daaw/so6;->c(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;)V

    return-object p0
.end method

.method public static n3(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/en6;Lcom/daaw/o86;)Lcom/daaw/f77;
    .locals 2

    new-instance v0, Lcom/daaw/km5;

    invoke-direct {v0, p2}, Lcom/daaw/km5;-><init>(Lcom/daaw/o86;)V

    sget-object p2, Lcom/daaw/lm5;->a:Lcom/daaw/lm5;

    sget-object v1, Lcom/daaw/ym6;->u:Lcom/daaw/ym6;

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzccb;->p:Landroid/os/Bundle;

    invoke-static {p0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p0

    invoke-virtual {p1, v1, p0}, Lcom/daaw/wm6;->b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/daaw/vm6;->f(Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/daaw/vm6;->e(Lcom/daaw/em6;)Lcom/daaw/vm6;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A1(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/hu3;)V
    .locals 1

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/cn5;->i3(Lcom/google/android/gms/internal/ads/zzccb;I)Lcom/daaw/f77;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/cn5;->p3(Lcom/daaw/f77;Lcom/daaw/hu3;)V

    return-void
.end method

.method public final L2(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/hu3;)V
    .locals 1

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/cn5;->h3(Lcom/google/android/gms/internal/ads/zzccb;I)Lcom/daaw/f77;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/cn5;->p3(Lcom/daaw/f77;Lcom/daaw/hu3;)V

    sget-object p2, Lcom/daaw/ab3;->c:Lcom/daaw/ma3;

    invoke-virtual {p2}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, Lcom/daaw/ya3;->j:Lcom/daaw/ma3;

    invoke-virtual {p2}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/cn5;->s:Lcom/daaw/yn5;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/daaw/mm5;

    invoke-direct {v0, p2}, Lcom/daaw/mm5;-><init>(Lcom/daaw/yn5;)V

    iget-object p2, p0, Lcom/daaw/cn5;->r:Lcom/daaw/g77;

    :goto_0
    invoke-interface {p1, v0, p2}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_0
    iget-object p2, p0, Lcom/daaw/cn5;->s:Lcom/daaw/yn5;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/daaw/mm5;

    invoke-direct {v0, p2}, Lcom/daaw/mm5;-><init>(Lcom/daaw/yn5;)V

    iget-object p2, p0, Lcom/daaw/cn5;->q:Ljava/util/concurrent/Executor;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final b2(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/hu3;)V
    .locals 1

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/cn5;->g3(Lcom/google/android/gms/internal/ads/zzccb;I)Lcom/daaw/f77;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/cn5;->p3(Lcom/daaw/f77;Lcom/daaw/hu3;)V

    return-void
.end method

.method public final g3(Lcom/google/android/gms/internal/ads/zzccb;I)Lcom/daaw/f77;
    .locals 8

    sget-object v0, Lcom/daaw/lb3;->a:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Split request is disabled."

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzccb;->x:Lcom/google/android/gms/internal/ads/zzfkz;

    if-nez v0, :cond_1

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Pool configuration missing from request."

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1

    :cond_1
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzfkz;->t:I

    if-eqz v1, :cond_3

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzfkz;->u:I

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzf()Lcom/daaw/ol3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/cn5;->p:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzchu;->h()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/cn5;->v:Lcom/daaw/vo6;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/ol3;->b(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vo6;)Lcom/daaw/xl3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/cn5;->t:Lcom/daaw/hf4;

    invoke-interface {v1, p1, p2}, Lcom/daaw/hf4;->a(Lcom/google/android/gms/internal/ads/zzccb;I)Lcom/daaw/o86;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/o86;->c()Lcom/daaw/en6;

    move-result-object v1

    invoke-static {p1, v1, p2}, Lcom/daaw/cn5;->n3(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/en6;Lcom/daaw/o86;)Lcom/daaw/f77;

    move-result-object v5

    invoke-virtual {p2}, Lcom/daaw/o86;->d()Lcom/daaw/to6;

    move-result-object p2

    iget-object v2, p0, Lcom/daaw/cn5;->p:Landroid/content/Context;

    const/16 v3, 0x9

    invoke-static {v2, v3}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object v7

    invoke-static {v5, v1, v0, p2, v7}, Lcom/daaw/cn5;->m3(Lcom/daaw/f77;Lcom/daaw/en6;Lcom/daaw/xl3;Lcom/daaw/to6;Lcom/daaw/io6;)Lcom/daaw/f77;

    move-result-object v4

    sget-object p2, Lcom/daaw/ym6;->O:Lcom/daaw/ym6;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/daaw/f77;

    const/4 v2, 0x0

    aput-object v5, v0, v2

    const/4 v2, 0x1

    aput-object v4, v0, v2

    invoke-virtual {v1, p2, v0}, Lcom/daaw/wm6;->a(Ljava/lang/Object;[Lcom/daaw/f77;)Lcom/daaw/jm6;

    move-result-object p2

    new-instance v0, Lcom/daaw/sm5;

    move-object v2, v0

    move-object v3, p0

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Lcom/daaw/sm5;-><init>(Lcom/daaw/cn5;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/io6;)V

    invoke-virtual {p2, v0}, Lcom/daaw/jm6;->a(Ljava/util/concurrent/Callable;)Lcom/daaw/vm6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Caching is disabled."

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final h3(Lcom/google/android/gms/internal/ads/zzccb;I)Lcom/daaw/f77;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzf()Lcom/daaw/ol3;

    move-result-object v2

    iget-object v3, v0, Lcom/daaw/cn5;->p:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzchu;->h()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v4

    iget-object v5, v0, Lcom/daaw/cn5;->v:Lcom/daaw/vo6;

    invoke-virtual {v2, v3, v4, v5}, Lcom/daaw/ol3;->b(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vo6;)Lcom/daaw/xl3;

    move-result-object v2

    iget-object v3, v0, Lcom/daaw/cn5;->t:Lcom/daaw/hf4;

    move/from16 v8, p2

    invoke-interface {v3, v1, v8}, Lcom/daaw/hf4;->a(Lcom/google/android/gms/internal/ads/zzccb;I)Lcom/daaw/o86;

    move-result-object v3

    sget-object v4, Lcom/daaw/bn5;->d:Lcom/daaw/ql3;

    sget-object v5, Lcom/daaw/ul3;->c:Lcom/daaw/pl3;

    const-string v6, "google.afma.response.normalize"

    invoke-virtual {v2, v6, v4, v5}, Lcom/daaw/xl3;->a(Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)Lcom/daaw/nl3;

    move-result-object v10

    sget-object v4, Lcom/daaw/lb3;->a:Lcom/daaw/ma3;

    invoke-virtual {v4}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzccb;->y:Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "Request contained a PoolKey but split request is disabled."

    :goto_0
    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzccb;->w:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/daaw/cn5;->l3(Ljava/lang/String;)Lcom/daaw/zm5;

    move-result-object v5

    if-nez v5, :cond_1

    const-string v4, "Request contained a PoolKey but no matching parameters were found."

    goto :goto_0

    :cond_1
    :goto_1
    move-object v11, v5

    if-nez v11, :cond_2

    iget-object v4, v0, Lcom/daaw/cn5;->p:Landroid/content/Context;

    const/16 v5, 0x9

    invoke-static {v4, v5}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object v4

    goto :goto_2

    :cond_2
    iget-object v4, v11, Lcom/daaw/zm5;->e:Lcom/daaw/io6;

    :goto_2
    move-object v12, v4

    invoke-virtual {v3}, Lcom/daaw/o86;->d()Lcom/daaw/to6;

    move-result-object v13

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzccb;->p:Landroid/os/Bundle;

    const-string v5, "ad_types"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v13, v4}, Lcom/daaw/to6;->d(Ljava/util/ArrayList;)Lcom/daaw/to6;

    new-instance v14, Lcom/daaw/xn5;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzccb;->v:Ljava/lang/String;

    invoke-direct {v14, v4, v13, v12}, Lcom/daaw/xn5;-><init>(Ljava/lang/String;Lcom/daaw/to6;Lcom/daaw/io6;)V

    iget-object v5, v0, Lcom/daaw/cn5;->p:Landroid/content/Context;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzccb;->q:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v6, v4, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    iget-object v7, v0, Lcom/daaw/cn5;->w:Lcom/daaw/yu3;

    new-instance v15, Lcom/daaw/un5;

    const/4 v9, 0x0

    move-object v4, v15

    move/from16 v8, p2

    invoke-direct/range {v4 .. v9}, Lcom/daaw/un5;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/yu3;I[B)V

    invoke-virtual {v3}, Lcom/daaw/o86;->c()Lcom/daaw/en6;

    move-result-object v4

    iget-object v5, v0, Lcom/daaw/cn5;->p:Landroid/content/Context;

    const/16 v6, 0xb

    invoke-static {v5, v6}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object v5

    const/16 v6, 0xa

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x2

    if-nez v11, :cond_3

    invoke-static {v1, v4, v3}, Lcom/daaw/cn5;->n3(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/en6;Lcom/daaw/o86;)Lcom/daaw/f77;

    move-result-object v1

    invoke-static {v1, v4, v2, v13, v12}, Lcom/daaw/cn5;->m3(Lcom/daaw/f77;Lcom/daaw/en6;Lcom/daaw/xl3;Lcom/daaw/to6;Lcom/daaw/io6;)Lcom/daaw/f77;

    move-result-object v2

    iget-object v3, v0, Lcom/daaw/cn5;->p:Landroid/content/Context;

    invoke-static {v3, v6}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object v3

    sget-object v6, Lcom/daaw/ym6;->y:Lcom/daaw/ym6;

    new-array v11, v9, [Lcom/daaw/f77;

    aput-object v2, v11, v8

    aput-object v1, v11, v7

    invoke-virtual {v4, v6, v11}, Lcom/daaw/wm6;->a(Ljava/lang/Object;[Lcom/daaw/f77;)Lcom/daaw/jm6;

    move-result-object v6

    new-instance v11, Lcom/daaw/qm5;

    invoke-direct {v11, v1, v2}, Lcom/daaw/qm5;-><init>(Lcom/daaw/f77;Lcom/daaw/f77;)V

    invoke-virtual {v6, v11}, Lcom/daaw/jm6;->a(Ljava/util/concurrent/Callable;)Lcom/daaw/vm6;

    move-result-object v6

    invoke-virtual {v6, v14}, Lcom/daaw/vm6;->e(Lcom/daaw/em6;)Lcom/daaw/vm6;

    move-result-object v6

    new-instance v11, Lcom/daaw/oo6;

    invoke-direct {v11, v3}, Lcom/daaw/oo6;-><init>(Lcom/daaw/io6;)V

    invoke-virtual {v6, v11}, Lcom/daaw/vm6;->e(Lcom/daaw/em6;)Lcom/daaw/vm6;

    move-result-object v6

    invoke-virtual {v6, v15}, Lcom/daaw/vm6;->e(Lcom/daaw/em6;)Lcom/daaw/vm6;

    move-result-object v6

    invoke-virtual {v6}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object v6

    invoke-static {v6, v13, v3}, Lcom/daaw/so6;->a(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;)V

    invoke-static {v6, v5}, Lcom/daaw/so6;->d(Lcom/daaw/f77;Lcom/daaw/io6;)V

    sget-object v3, Lcom/daaw/ym6;->A:Lcom/daaw/ym6;

    const/4 v11, 0x3

    new-array v11, v11, [Lcom/daaw/f77;

    aput-object v1, v11, v8

    aput-object v2, v11, v7

    aput-object v6, v11, v9

    invoke-virtual {v4, v3, v11}, Lcom/daaw/wm6;->a(Ljava/lang/Object;[Lcom/daaw/f77;)Lcom/daaw/jm6;

    move-result-object v3

    new-instance v4, Lcom/daaw/rm5;

    invoke-direct {v4, v6, v1, v2}, Lcom/daaw/rm5;-><init>(Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;)V

    goto :goto_3

    :cond_3
    new-instance v1, Lcom/daaw/wn5;

    iget-object v2, v11, Lcom/daaw/zm5;->b:Lorg/json/JSONObject;

    iget-object v3, v11, Lcom/daaw/zm5;->a:Lcom/daaw/pu3;

    invoke-direct {v1, v2, v3}, Lcom/daaw/wn5;-><init>(Lorg/json/JSONObject;Lcom/daaw/pu3;)V

    iget-object v2, v0, Lcom/daaw/cn5;->p:Landroid/content/Context;

    invoke-static {v2, v6}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object v2

    sget-object v3, Lcom/daaw/ym6;->y:Lcom/daaw/ym6;

    invoke-static {v1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v1

    invoke-virtual {v4, v3, v1}, Lcom/daaw/wm6;->b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object v1

    invoke-virtual {v1, v14}, Lcom/daaw/vm6;->e(Lcom/daaw/em6;)Lcom/daaw/vm6;

    move-result-object v1

    new-instance v3, Lcom/daaw/oo6;

    invoke-direct {v3, v2}, Lcom/daaw/oo6;-><init>(Lcom/daaw/io6;)V

    invoke-virtual {v1, v3}, Lcom/daaw/vm6;->e(Lcom/daaw/em6;)Lcom/daaw/vm6;

    move-result-object v1

    invoke-virtual {v1, v15}, Lcom/daaw/vm6;->e(Lcom/daaw/em6;)Lcom/daaw/vm6;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object v1

    invoke-static {v1, v13, v2}, Lcom/daaw/so6;->a(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;)V

    invoke-static {v11}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v2

    invoke-static {v1, v5}, Lcom/daaw/so6;->d(Lcom/daaw/f77;Lcom/daaw/io6;)V

    sget-object v3, Lcom/daaw/ym6;->A:Lcom/daaw/ym6;

    new-array v6, v9, [Lcom/daaw/f77;

    aput-object v1, v6, v8

    aput-object v2, v6, v7

    invoke-virtual {v4, v3, v6}, Lcom/daaw/wm6;->a(Ljava/lang/Object;[Lcom/daaw/f77;)Lcom/daaw/jm6;

    move-result-object v3

    new-instance v4, Lcom/daaw/vm5;

    invoke-direct {v4, v1, v2}, Lcom/daaw/vm5;-><init>(Lcom/daaw/f77;Lcom/daaw/f77;)V

    :goto_3
    invoke-virtual {v3, v4}, Lcom/daaw/jm6;->a(Ljava/util/concurrent/Callable;)Lcom/daaw/vm6;

    move-result-object v1

    invoke-virtual {v1, v10}, Lcom/daaw/vm6;->f(Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object v1

    invoke-static {v1, v13, v5}, Lcom/daaw/so6;->a(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;)V

    return-object v1
.end method

.method public final i3(Lcom/google/android/gms/internal/ads/zzccb;I)Lcom/daaw/f77;
    .locals 6

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzf()Lcom/daaw/ol3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/cn5;->p:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzchu;->h()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/cn5;->v:Lcom/daaw/vo6;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/ol3;->b(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vo6;)Lcom/daaw/xl3;

    move-result-object v0

    sget-object v1, Lcom/daaw/qb3;->a:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Signal collection disabled."

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, Lcom/daaw/cn5;->t:Lcom/daaw/hf4;

    invoke-interface {v1, p1, p2}, Lcom/daaw/hf4;->a(Lcom/google/android/gms/internal/ads/zzccb;I)Lcom/daaw/o86;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/o86;->a()Lcom/daaw/l76;

    move-result-object v1

    sget-object v2, Lcom/daaw/ul3;->b:Lcom/daaw/rl3;

    sget-object v3, Lcom/daaw/ul3;->c:Lcom/daaw/pl3;

    const-string v4, "google.afma.request.getSignals"

    invoke-virtual {v0, v4, v2, v3}, Lcom/daaw/xl3;->a(Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)Lcom/daaw/nl3;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/cn5;->p:Landroid/content/Context;

    const/16 v3, 0x16

    invoke-static {v2, v3}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object v2

    invoke-virtual {p2}, Lcom/daaw/o86;->c()Lcom/daaw/en6;

    move-result-object v3

    sget-object v4, Lcom/daaw/ym6;->B:Lcom/daaw/ym6;

    iget-object v5, p1, Lcom/google/android/gms/internal/ads/zzccb;->p:Landroid/os/Bundle;

    invoke-static {v5}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/daaw/wm6;->b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object v3

    new-instance v4, Lcom/daaw/oo6;

    invoke-direct {v4, v2}, Lcom/daaw/oo6;-><init>(Lcom/daaw/io6;)V

    invoke-virtual {v3, v4}, Lcom/daaw/vm6;->e(Lcom/daaw/em6;)Lcom/daaw/vm6;

    move-result-object v3

    new-instance v4, Lcom/daaw/um5;

    invoke-direct {v4, v1}, Lcom/daaw/um5;-><init>(Lcom/daaw/l76;)V

    invoke-virtual {v3, v4}, Lcom/daaw/vm6;->f(Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object v1

    sget-object v3, Lcom/daaw/ym6;->C:Lcom/daaw/ym6;

    invoke-virtual {v1, v3}, Lcom/daaw/vm6;->b(Ljava/lang/Object;)Lcom/daaw/vm6;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/vm6;->f(Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object v0

    invoke-virtual {p2}, Lcom/daaw/o86;->d()Lcom/daaw/to6;

    move-result-object p2

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzccb;->p:Landroid/os/Bundle;

    const-string v1, "ad_types"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/to6;->d(Ljava/util/ArrayList;)Lcom/daaw/to6;

    invoke-static {v0, p2, v2}, Lcom/daaw/so6;->b(Lcom/daaw/f77;Lcom/daaw/to6;Lcom/daaw/io6;)V

    sget-object p1, Lcom/daaw/ab3;->e:Lcom/daaw/ma3;

    invoke-virtual {p1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lcom/daaw/ya3;->j:Lcom/daaw/ma3;

    invoke-virtual {p1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/cn5;->s:Lcom/daaw/yn5;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lcom/daaw/mm5;

    invoke-direct {p2, p1}, Lcom/daaw/mm5;-><init>(Lcom/daaw/yn5;)V

    iget-object p1, p0, Lcom/daaw/cn5;->r:Lcom/daaw/g77;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/cn5;->s:Lcom/daaw/yn5;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Lcom/daaw/mm5;

    invoke-direct {p2, p1}, Lcom/daaw/mm5;-><init>(Lcom/daaw/yn5;)V

    iget-object p1, p0, Lcom/daaw/cn5;->q:Ljava/util/concurrent/Executor;

    :goto_0
    invoke-interface {v0, p2, p1}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_2
    return-object v0
.end method

.method public final j1(Ljava/lang/String;Lcom/daaw/hu3;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/cn5;->j3(Ljava/lang/String;)Lcom/daaw/f77;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/cn5;->p3(Lcom/daaw/f77;Lcom/daaw/hu3;)V

    return-void
.end method

.method public final j3(Ljava/lang/String;)Lcom/daaw/f77;
    .locals 2

    sget-object v0, Lcom/daaw/lb3;->a:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Split request is disabled."

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/xm5;

    invoke-direct {v0, p0}, Lcom/daaw/xm5;-><init>(Lcom/daaw/cn5;)V

    invoke-virtual {p0, p1}, Lcom/daaw/cn5;->l3(Ljava/lang/String;)Lcom/daaw/zm5;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/Exception;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "URL to be removed not found for cache key: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic k3(Lcom/daaw/f77;Lcom/daaw/f77;Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/io6;)Ljava/io/InputStream;
    .locals 7

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/pu3;

    invoke-virtual {v0}, Lcom/daaw/pu3;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Lorg/json/JSONObject;

    iget-object v4, p3, Lcom/google/android/gms/internal/ads/zzccb;->w:Ljava/lang/String;

    new-instance p2, Lcom/daaw/zm5;

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/daaw/pu3;

    move-object v1, p2

    move-object v5, v0

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/daaw/zm5;-><init>(Lcom/daaw/pu3;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/io6;)V

    invoke-virtual {p0, p2}, Lcom/daaw/cn5;->o3(Lcom/daaw/zm5;)V

    new-instance p1, Ljava/io/ByteArrayInputStream;

    sget-object p2, Lcom/daaw/cy6;->c:Ljava/nio/charset/Charset;

    invoke-virtual {v0, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object p1
.end method

.method public final declared-synchronized l3(Ljava/lang/String;)Lcom/daaw/zm5;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/cn5;->u:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/zm5;

    iget-object v2, v1, Lcom/daaw/zm5;->c:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_1

    :goto_0
    throw p1

    :goto_1
    goto :goto_0
.end method

.method public final declared-synchronized o3(Lcom/daaw/zm5;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/cn5;->zzo()V

    iget-object v0, p0, Lcom/daaw/cn5;->u:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final p3(Lcom/daaw/f77;Lcom/daaw/hu3;)V
    .locals 2

    new-instance v0, Lcom/daaw/wm5;

    invoke-direct {v0, p0}, Lcom/daaw/wm5;-><init>(Lcom/daaw/cn5;)V

    sget-object v1, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {p1, v0, v1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    new-instance v0, Lcom/daaw/ym5;

    invoke-direct {v0, p0, p2}, Lcom/daaw/ym5;-><init>(Lcom/daaw/cn5;Lcom/daaw/hu3;)V

    sget-object p2, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {p1, v0, p2}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final declared-synchronized zzo()V
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/daaw/lb3;->d:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    :goto_0
    iget-object v1, p0, Lcom/daaw/cn5;->u:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    if-lt v1, v0, :cond_0

    iget-object v1, p0, Lcom/daaw/cn5;->u:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method
