.class public final synthetic Lcom/daaw/b65;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/c65;

.field public final synthetic b:Lcom/daaw/f77;

.field public final synthetic c:Lcom/daaw/f77;

.field public final synthetic d:Lcom/daaw/f77;

.field public final synthetic e:Lcom/daaw/f77;

.field public final synthetic f:Lcom/daaw/f77;

.field public final synthetic g:Lorg/json/JSONObject;

.field public final synthetic h:Lcom/daaw/f77;

.field public final synthetic i:Lcom/daaw/f77;

.field public final synthetic j:Lcom/daaw/f77;

.field public final synthetic k:Lcom/daaw/f77;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/c65;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;Lorg/json/JSONObject;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/daaw/f77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b65;->a:Lcom/daaw/c65;

    iput-object p2, p0, Lcom/daaw/b65;->b:Lcom/daaw/f77;

    iput-object p3, p0, Lcom/daaw/b65;->c:Lcom/daaw/f77;

    iput-object p4, p0, Lcom/daaw/b65;->d:Lcom/daaw/f77;

    iput-object p5, p0, Lcom/daaw/b65;->e:Lcom/daaw/f77;

    iput-object p6, p0, Lcom/daaw/b65;->f:Lcom/daaw/f77;

    iput-object p7, p0, Lcom/daaw/b65;->g:Lorg/json/JSONObject;

    iput-object p8, p0, Lcom/daaw/b65;->h:Lcom/daaw/f77;

    iput-object p9, p0, Lcom/daaw/b65;->i:Lcom/daaw/f77;

    iput-object p10, p0, Lcom/daaw/b65;->j:Lcom/daaw/f77;

    iput-object p11, p0, Lcom/daaw/b65;->k:Lcom/daaw/f77;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lcom/daaw/b65;->b:Lcom/daaw/f77;

    iget-object v1, p0, Lcom/daaw/b65;->c:Lcom/daaw/f77;

    iget-object v2, p0, Lcom/daaw/b65;->d:Lcom/daaw/f77;

    iget-object v3, p0, Lcom/daaw/b65;->e:Lcom/daaw/f77;

    iget-object v4, p0, Lcom/daaw/b65;->f:Lcom/daaw/f77;

    iget-object v5, p0, Lcom/daaw/b65;->g:Lorg/json/JSONObject;

    iget-object v6, p0, Lcom/daaw/b65;->h:Lcom/daaw/f77;

    iget-object v7, p0, Lcom/daaw/b65;->i:Lcom/daaw/f77;

    iget-object v8, p0, Lcom/daaw/b65;->j:Lcom/daaw/f77;

    iget-object v9, p0, Lcom/daaw/b65;->k:Lcom/daaw/f77;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/j35;

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/daaw/j35;->n(Ljava/util/List;)V

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/vc3;

    invoke-virtual {v0, v1}, Lcom/daaw/j35;->k(Lcom/daaw/vc3;)V

    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/vc3;

    invoke-virtual {v0, v1}, Lcom/daaw/j35;->o(Lcom/daaw/vc3;)V

    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/nc3;

    invoke-virtual {v0, v1}, Lcom/daaw/j35;->h(Lcom/daaw/nc3;)V

    invoke-static {v5}, Lcom/daaw/s65;->j(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/j35;->q(Ljava/util/List;)V

    invoke-static {v5}, Lcom/daaw/s65;->i(Lorg/json/JSONObject;)Lcom/google/android/gms/ads/internal/client/zzel;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/j35;->j(Lcom/google/android/gms/ads/internal/client/zzel;)V

    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/a74;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/daaw/j35;->y(Lcom/daaw/a74;)V

    invoke-interface {v1}, Lcom/daaw/a74;->g()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/j35;->x(Landroid/view/View;)V

    invoke-interface {v1}, Lcom/daaw/a74;->zzs()Lcom/daaw/z74;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/j35;->w(Lcom/google/android/gms/ads/internal/client/zzdq;)V

    :cond_0
    invoke-interface {v7}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/a74;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lcom/daaw/j35;->m(Lcom/daaw/a74;)V

    invoke-interface {v1}, Lcom/daaw/a74;->g()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/j35;->z(Landroid/view/View;)V

    :cond_1
    invoke-interface {v8}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/a74;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Lcom/daaw/j35;->r(Lcom/daaw/a74;)V

    :cond_2
    invoke-interface {v9}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/w65;

    iget v3, v2, Lcom/daaw/w65;->a:I

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    iget-object v3, v2, Lcom/daaw/w65;->b:Ljava/lang/String;

    iget-object v2, v2, Lcom/daaw/w65;->d:Lcom/daaw/dc3;

    invoke-virtual {v0, v3, v2}, Lcom/daaw/j35;->l(Ljava/lang/String;Lcom/daaw/dc3;)V

    goto :goto_0

    :cond_3
    iget-object v3, v2, Lcom/daaw/w65;->b:Ljava/lang/String;

    iget-object v2, v2, Lcom/daaw/w65;->c:Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Lcom/daaw/j35;->u(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    return-object v0
.end method
