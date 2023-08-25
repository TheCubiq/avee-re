.class public final Lcom/daaw/bu5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xq5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/q15;

.field public final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/q15;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bu5;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/bu5;->b:Lcom/daaw/q15;

    iput-object p3, p0, Lcom/daaw/bu5;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static final c(Lcom/daaw/fi6;I)Z
    .locals 0

    iget-object p0, p0, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p0, p0, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object p0, p0, Lcom/daaw/ri6;->g:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V
    .locals 9

    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/daaw/oj6;

    iget-object v2, p0, Lcom/daaw/bu5;->a:Landroid/content/Context;

    iget-object v0, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v0, v0, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v3, v0, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v0, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object p2, p2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    invoke-static {p2}, Lcom/google/android/gms/ads/internal/util/zzbu;->zzl(Lcom/daaw/yh6;)Ljava/lang/String;

    move-result-object v5

    iget-object p2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    move-object v6, p2

    check-cast v6, Lcom/daaw/gn3;

    iget-object p1, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object p1, p1, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v7, p1, Lcom/daaw/ri6;->i:Lcom/google/android/gms/internal/ads/zzblz;

    iget-object v8, p1, Lcom/daaw/ri6;->g:Ljava/util/ArrayList;

    invoke-virtual/range {v1 .. v8}, Lcom/daaw/oj6;->u(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzl;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/gn3;Lcom/google/android/gms/internal/ads/zzblz;Ljava/util/List;)V

    return-void
.end method

.method public final bridge synthetic b(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/oj6;

    invoke-virtual {v0}, Lcom/daaw/oj6;->d()Lcom/daaw/on3;

    move-result-object v0

    iget-object v1, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/oj6;

    invoke-virtual {v1}, Lcom/daaw/oj6;->e()Lcom/daaw/pn3;

    move-result-object v1

    iget-object v2, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast v2, Lcom/daaw/oj6;

    invoke-virtual {v2}, Lcom/daaw/oj6;->i()Lcom/daaw/sn3;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x6

    if-eqz v2, :cond_0

    invoke-static {p1, v4}, Lcom/daaw/bu5;->c(Lcom/daaw/fi6;I)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v2}, Lcom/daaw/j35;->a0(Lcom/daaw/sn3;)Lcom/daaw/j35;

    move-result-object v4

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    invoke-static {p1, v4}, Lcom/daaw/bu5;->c(Lcom/daaw/fi6;I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v0}, Lcom/daaw/j35;->E(Lcom/daaw/on3;)Lcom/daaw/j35;

    move-result-object v4

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    const/4 v5, 0x2

    invoke-static {p1, v5}, Lcom/daaw/bu5;->c(Lcom/daaw/fi6;I)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v0}, Lcom/daaw/j35;->C(Lcom/daaw/on3;)Lcom/daaw/j35;

    move-result-object v4

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-static {p1, v4}, Lcom/daaw/bu5;->c(Lcom/daaw/fi6;I)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v1}, Lcom/daaw/j35;->F(Lcom/daaw/pn3;)Lcom/daaw/j35;

    move-result-object v4

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_5

    invoke-static {p1, v3}, Lcom/daaw/bu5;->c(Lcom/daaw/fi6;I)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1}, Lcom/daaw/j35;->D(Lcom/daaw/pn3;)Lcom/daaw/j35;

    move-result-object v4

    :goto_0
    iget-object v5, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v5, v5, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v5, v5, Lcom/daaw/ri6;->g:Ljava/util/ArrayList;

    invoke-virtual {v4}, Lcom/daaw/j35;->K()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v3, p0, Lcom/daaw/bu5;->b:Lcom/daaw/q15;

    new-instance v5, Lcom/daaw/rm4;

    iget-object v6, p3, Lcom/daaw/tq5;->a:Ljava/lang/String;

    invoke-direct {v5, p1, p2, v6}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/v35;

    invoke-direct {p1, v4}, Lcom/daaw/v35;-><init>(Lcom/daaw/j35;)V

    new-instance p2, Lcom/daaw/p55;

    const/4 v4, 0x0

    invoke-direct {p2, v1, v0, v2, v4}, Lcom/daaw/p55;-><init>(Lcom/daaw/pn3;Lcom/daaw/on3;Lcom/daaw/sn3;[B)V

    invoke-virtual {v3, v5, p1, p2}, Lcom/daaw/q15;->d(Lcom/daaw/rm4;Lcom/daaw/v35;Lcom/daaw/p55;)Lcom/daaw/l35;

    move-result-object p1

    iget-object p2, p3, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast p2, Lcom/daaw/ys5;

    invoke-virtual {p1}, Lcom/daaw/am4;->g()Lcom/daaw/nw5;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/daaw/ys5;->h3(Lcom/daaw/gn3;)V

    invoke-virtual {p1}, Lcom/daaw/am4;->c()Lcom/daaw/nr4;

    move-result-object p2

    new-instance v0, Lcom/daaw/eg4;

    iget-object p3, p3, Lcom/daaw/tq5;->b:Ljava/lang/Object;

    check-cast p3, Lcom/daaw/oj6;

    invoke-direct {v0, p3}, Lcom/daaw/eg4;-><init>(Lcom/daaw/oj6;)V

    iget-object p3, p0, Lcom/daaw/bu5;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p2, v0, p3}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Lcom/daaw/m35;->h()Lcom/daaw/e35;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lcom/daaw/yu5;

    const-string p2, "No corresponding native ad listener"

    invoke-direct {p1, v3, p2}, Lcom/daaw/yu5;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Lcom/daaw/yu5;

    const-string p2, "No native ad mappers"

    invoke-direct {p1, v3, p2}, Lcom/daaw/yu5;-><init>(ILjava/lang/String;)V

    throw p1
.end method
