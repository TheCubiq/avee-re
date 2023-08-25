.class public Lcom/daaw/nc0$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wb$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/nc0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/nc0;


# direct methods
.method public constructor <init>(Lcom/daaw/nc0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nc0$i;->a:Lcom/daaw/nc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/nc0;Lcom/daaw/nc0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/nc0$i;-><init>(Lcom/daaw/nc0;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lcom/daaw/nc0;->m:Z

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/nc0;->o(Z)Z

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/nc0$i;->a:Lcom/daaw/nc0;

    invoke-static {v0}, Lcom/daaw/nc0;->n(Lcom/daaw/nc0;)Lcom/daaw/wb;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/x10;->a()Lcom/daaw/x10;

    move-result-object v0

    const-string v1, "no billing manager from it\'s listener"

    invoke-virtual {v0, v1}, Lcom/daaw/x10;->c(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/nc0$i;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/nc0$i;->a:Lcom/daaw/nc0;

    invoke-virtual {v0}, Lcom/daaw/nc0;->O()V

    :goto_0
    return-void
.end method

.method public c(Ljava/util/List;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;Z)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/billingclient/api/Purchase;

    const/4 v3, 0x0

    invoke-virtual {v1}, Lcom/android/billingclient/api/Purchase;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "premium"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v2}, Lcom/daaw/nc0;->o(Z)Z

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/billingclient/api/Purchase;

    invoke-virtual {v3}, Lcom/android/billingclient/api/Purchase;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/daaw/nc0$i;->a:Lcom/daaw/nc0;

    invoke-static {v1}, Lcom/daaw/nc0;->p(Lcom/daaw/nc0;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_5

    if-eqz p2, :cond_6

    :cond_5
    iget-object p2, p0, Lcom/daaw/nc0$i;->a:Lcom/daaw/nc0;

    invoke-static {p2, p1}, Lcom/daaw/nc0;->r(Lcom/daaw/nc0;Ljava/util/List;)Ljava/util/List;

    iget-object p1, p0, Lcom/daaw/nc0$i;->a:Lcom/daaw/nc0;

    invoke-static {p1, v0}, Lcom/daaw/nc0;->q(Lcom/daaw/nc0;Ljava/util/List;)Ljava/util/List;

    :cond_6
    sget-object p1, Lcom/daaw/nc0;->n:Lcom/daaw/ww1;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, p2}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sput-boolean v2, Lcom/daaw/nc0;->m:Z

    iget-object p1, p0, Lcom/daaw/nc0$i;->a:Lcom/daaw/nc0;

    invoke-static {p1}, Lcom/daaw/nc0;->s(Lcom/daaw/nc0;)V

    return-void
.end method
