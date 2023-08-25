.class public Lcom/daaw/tb$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/util/List;

.field public d:Ljava/util/ArrayList;

.field public e:Z

.field public f:Lcom/daaw/tb$c$a;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/cr2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/daaw/tb$c;->a()Lcom/daaw/tb$c$a;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/tb$c$a;->f(Lcom/daaw/tb$c$a;)Lcom/daaw/tb$c$a;

    iput-object p1, p0, Lcom/daaw/tb$a;->f:Lcom/daaw/tb$c$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/tb;
    .locals 13

    iget-object v0, p0, Lcom/daaw/tb$a;->d:Ljava/util/ArrayList;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Lcom/daaw/tb$a;->c:Ljava/util/List;

    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-nez v0, :cond_3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Details of the products must be provided."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    if-eqz v0, :cond_5

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Set SkuDetails or ProductDetailsParams, not both."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_3
    const/4 v4, 0x0

    const-string v5, "play_pass_subs"

    if-eqz v0, :cond_c

    iget-object v6, p0, Lcom/daaw/tb$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    iget-object v6, p0, Lcom/daaw/tb$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-le v6, v1, :cond_13

    iget-object v6, p0, Lcom/daaw/tb$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v6}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/daaw/tb$a;->d:Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_4
    if-ge v10, v9, :cond_8

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_7

    invoke-virtual {v11}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_7

    invoke-virtual {v11}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SKUs should have the same type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_8
    invoke-virtual {v6}, Lcom/android/billingclient/api/SkuDetails;->f()Ljava/lang/String;

    move-result-object v6

    iget-object v8, p0, Lcom/daaw/tb$a;->d:Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_6
    if-ge v10, v9, :cond_13

    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a

    invoke-virtual {v11}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a

    invoke-virtual {v11}, Lcom/android/billingclient/api/SkuDetails;->f()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    goto :goto_7

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "All SKUs must have the same package name."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_7
    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SKU cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    iget-object v6, p0, Lcom/daaw/tb$a;->c:Ljava/util/List;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/tb$b;

    const/4 v7, 0x0

    :goto_8
    iget-object v8, p0, Lcom/daaw/tb$a;->c:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_10

    iget-object v8, p0, Lcom/daaw/tb$a;->c:Ljava/util/List;

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/daaw/tb$b;

    if-eqz v8, :cond_f

    if-eqz v7, :cond_e

    invoke-virtual {v8}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v9

    invoke-virtual {v9}, Lcom/daaw/kz0;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v10

    invoke-virtual {v10}, Lcom/daaw/kz0;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    invoke-virtual {v8}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v8

    invoke-virtual {v8}, Lcom/daaw/kz0;->c()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    goto :goto_9

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "All products should have same ProductType."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_9
    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ProductDetailsParams cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    invoke-virtual {v6}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v7

    invoke-virtual {v7}, Lcom/daaw/kz0;->e()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/daaw/tb$a;->c:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_11
    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_13

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/daaw/tb$b;

    invoke-virtual {v6}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v10

    invoke-virtual {v10}, Lcom/daaw/kz0;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_11

    invoke-virtual {v9}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v10

    invoke-virtual {v10}, Lcom/daaw/kz0;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_11

    invoke-virtual {v9}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v9

    invoke-virtual {v9}, Lcom/daaw/kz0;->e()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    goto :goto_a

    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "All products must have the same package name."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    new-instance v5, Lcom/daaw/tb;

    invoke-direct {v5, v4}, Lcom/daaw/tb;-><init>(Lcom/daaw/qw2;)V

    if-eqz v0, :cond_14

    iget-object v0, p0, Lcom/daaw/tb$a;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_16

    :cond_14
    if-eqz v3, :cond_15

    iget-object v0, p0, Lcom/daaw/tb$a;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/tb$b;

    invoke-virtual {v0}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/kz0;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_b

    :cond_15
    const/4 v1, 0x0

    :cond_16
    :goto_b
    invoke-static {v5, v1}, Lcom/daaw/tb;->h(Lcom/daaw/tb;Z)V

    iget-object v0, p0, Lcom/daaw/tb$a;->a:Ljava/lang/String;

    invoke-static {v5, v0}, Lcom/daaw/tb;->j(Lcom/daaw/tb;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/tb$a;->b:Ljava/lang/String;

    invoke-static {v5, v0}, Lcom/daaw/tb;->k(Lcom/daaw/tb;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/tb$a;->f:Lcom/daaw/tb$c$a;

    invoke-virtual {v0}, Lcom/daaw/tb$c$a;->a()Lcom/daaw/tb$c;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/daaw/tb;->n(Lcom/daaw/tb;Lcom/daaw/tb$c;)V

    iget-object v0, p0, Lcom/daaw/tb$a;->d:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    if-eqz v0, :cond_17

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_c

    :cond_17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_c
    invoke-static {v5, v1}, Lcom/daaw/tb;->m(Lcom/daaw/tb;Ljava/util/ArrayList;)V

    iget-boolean v0, p0, Lcom/daaw/tb$a;->e:Z

    invoke-static {v5, v0}, Lcom/daaw/tb;->i(Lcom/daaw/tb;Z)V

    iget-object v0, p0, Lcom/daaw/tb$a;->c:Ljava/util/List;

    if-eqz v0, :cond_18

    invoke-static {v0}, Lcom/daaw/rt8;->q(Ljava/util/Collection;)Lcom/daaw/rt8;

    move-result-object v0

    goto :goto_d

    :cond_18
    invoke-static {}, Lcom/daaw/rt8;->r()Lcom/daaw/rt8;

    move-result-object v0

    :goto_d
    invoke-static {v5, v0}, Lcom/daaw/tb;->l(Lcom/daaw/tb;Lcom/daaw/rt8;)V

    return-object v5
.end method

.method public b(Ljava/util/List;)Lcom/daaw/tb$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/tb$b;",
            ">;)",
            "Lcom/daaw/tb$a;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/daaw/tb$a;->c:Ljava/util/List;

    return-object p0
.end method

.method public c(Lcom/daaw/tb$c;)Lcom/daaw/tb$a;
    .locals 0

    invoke-static {p1}, Lcom/daaw/tb$c;->c(Lcom/daaw/tb$c;)Lcom/daaw/tb$c$a;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/tb$a;->f:Lcom/daaw/tb$c$a;

    return-object p0
.end method
