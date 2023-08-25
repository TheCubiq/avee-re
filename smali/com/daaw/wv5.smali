.class public final Lcom/daaw/wv5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qq5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/ia5;

.field public final c:Lcom/daaw/o95;

.field public final d:Lcom/daaw/ri6;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Lcom/google/android/gms/internal/ads/zzchu;

.field public final g:Lcom/daaw/bh3;

.field public final h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/ri6;Ljava/util/concurrent/Executor;Lcom/daaw/o95;Lcom/daaw/ia5;Lcom/daaw/bh3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wv5;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/wv5;->d:Lcom/daaw/ri6;

    iput-object p5, p0, Lcom/daaw/wv5;->c:Lcom/daaw/o95;

    iput-object p4, p0, Lcom/daaw/wv5;->e:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/daaw/wv5;->f:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p6, p0, Lcom/daaw/wv5;->b:Lcom/daaw/ia5;

    iput-object p7, p0, Lcom/daaw/wv5;->g:Lcom/daaw/bh3;

    sget-object p1, Lcom/daaw/g93;->W7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/wv5;->h:Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z
    .locals 0

    iget-object p1, p2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/daaw/yh6;->a:Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/f77;
    .locals 3

    new-instance v0, Lcom/daaw/ma5;

    invoke-direct {v0}, Lcom/daaw/ma5;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v1

    new-instance v2, Lcom/daaw/pv5;

    invoke-direct {v2, p0, p2, p1, v0}, Lcom/daaw/pv5;-><init>(Lcom/daaw/wv5;Lcom/daaw/th6;Lcom/daaw/fi6;Lcom/daaw/ma5;)V

    iget-object p1, p0, Lcom/daaw/wv5;->e:Ljava/util/concurrent/Executor;

    invoke-static {v1, v2, p1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    new-instance p2, Lcom/daaw/qv5;

    invoke-direct {p2, v0}, Lcom/daaw/qv5;-><init>(Lcom/daaw/ma5;)V

    iget-object v0, p0, Lcom/daaw/wv5;->e:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p2, v0}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method

.method public final synthetic c(Lcom/daaw/th6;Lcom/daaw/fi6;Lcom/daaw/ma5;Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move-object/from16 v1, p2

    iget-object v2, v0, Lcom/daaw/wv5;->b:Lcom/daaw/ia5;

    iget-object v3, v0, Lcom/daaw/wv5;->d:Lcom/daaw/ri6;

    iget-object v3, v3, Lcom/daaw/ri6;->e:Lcom/google/android/gms/ads/internal/client/zzq;

    iget-object v4, v1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v4, v4, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    invoke-virtual {v2, v3, v11, v4}, Lcom/daaw/ia5;->a(Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/th6;Lcom/daaw/wh6;)Lcom/daaw/a74;

    move-result-object v12

    iget-boolean v2, v11, Lcom/daaw/th6;->X:Z

    invoke-interface {v12, v2}, Lcom/daaw/a74;->X(Z)V

    iget-object v2, v0, Lcom/daaw/wv5;->a:Landroid/content/Context;

    move-object v3, v12

    check-cast v3, Landroid/view/View;

    move-object/from16 v4, p3

    invoke-virtual {v4, v2, v3}, Lcom/daaw/ma5;->a(Landroid/content/Context;Landroid/view/View;)V

    new-instance v13, Lcom/daaw/e14;

    invoke-direct {v13}, Lcom/daaw/e14;-><init>()V

    iget-object v14, v0, Lcom/daaw/wv5;->c:Lcom/daaw/o95;

    new-instance v15, Lcom/daaw/rm4;

    const/4 v10, 0x0

    invoke-direct {v15, v1, v11, v10}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance v9, Lcom/daaw/l95;

    new-instance v8, Lcom/daaw/vv5;

    iget-object v2, v0, Lcom/daaw/wv5;->a:Landroid/content/Context;

    iget-object v3, v0, Lcom/daaw/wv5;->b:Lcom/daaw/ia5;

    iget-object v4, v0, Lcom/daaw/wv5;->d:Lcom/daaw/ri6;

    iget-object v5, v0, Lcom/daaw/wv5;->f:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v7, v0, Lcom/daaw/wv5;->g:Lcom/daaw/bh3;

    iget-boolean v6, v0, Lcom/daaw/wv5;->h:Z

    move-object v1, v8

    move/from16 v16, v6

    move-object/from16 v6, p1

    move-object/from16 v17, v7

    move-object v7, v13

    move-object v11, v8

    move-object v8, v12

    move-object v0, v9

    move-object/from16 v9, v17

    move-object/from16 v17, v10

    move/from16 v10, v16

    invoke-direct/range {v1 .. v10}, Lcom/daaw/vv5;-><init>(Landroid/content/Context;Lcom/daaw/ia5;Lcom/daaw/ri6;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/th6;Lcom/daaw/f77;Lcom/daaw/a74;Lcom/daaw/bh3;Z)V

    invoke-direct {v0, v11, v12}, Lcom/daaw/l95;-><init>(Lcom/daaw/c15;Lcom/daaw/a74;)V

    invoke-virtual {v14, v15, v0}, Lcom/daaw/o95;->b(Lcom/daaw/rm4;Lcom/daaw/l95;)Lcom/daaw/k95;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/daaw/k95;->i()Lcom/daaw/ez4;

    move-result-object v1

    invoke-static {v12, v1}, Lcom/daaw/ph3;->b(Lcom/daaw/a74;Lcom/daaw/oh3;)V

    invoke-virtual {v0}, Lcom/daaw/am4;->b()Lcom/daaw/gr4;

    move-result-object v1

    new-instance v2, Lcom/daaw/rv5;

    invoke-direct {v2, v12}, Lcom/daaw/rv5;-><init>(Lcom/daaw/a74;)V

    sget-object v3, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v0}, Lcom/daaw/k95;->l()Lcom/daaw/ha5;

    move-result-object v1

    move-object/from16 v2, p0

    iget-boolean v3, v2, Lcom/daaw/wv5;->h:Z

    if-eqz v3, :cond_0

    iget-object v10, v2, Lcom/daaw/wv5;->g:Lcom/daaw/bh3;

    goto :goto_0

    :cond_0
    move-object/from16 v10, v17

    :goto_0
    const/4 v3, 0x1

    invoke-virtual {v1, v12, v3, v10}, Lcom/daaw/ha5;->i(Lcom/daaw/a74;ZLcom/daaw/bh3;)V

    invoke-virtual {v0}, Lcom/daaw/k95;->l()Lcom/daaw/ha5;

    move-object/from16 v1, p1

    iget-object v3, v1, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    iget-object v4, v3, Lcom/daaw/yh6;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/daaw/yh6;->a:Ljava/lang/String;

    invoke-static {v12, v4, v3}, Lcom/daaw/ha5;->j(Lcom/daaw/a74;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/f77;

    move-result-object v3

    new-instance v4, Lcom/daaw/sv5;

    invoke-direct {v4, v2, v12, v1, v0}, Lcom/daaw/sv5;-><init>(Lcom/daaw/wv5;Lcom/daaw/a74;Lcom/daaw/th6;Lcom/daaw/k95;)V

    iget-object v0, v2, Lcom/daaw/wv5;->e:Ljava/util/concurrent/Executor;

    invoke-static {v3, v4, v0}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
