.class public final Lcom/daaw/rl2;
.super Lcom/daaw/ql2;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/ql2;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method

.method public static p(Ljava/lang/String;Landroid/content/Context;Z)Lcom/daaw/rl2;
    .locals 1

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/daaw/ql2;->l(Landroid/content/Context;Z)V

    new-instance v0, Lcom/daaw/rl2;

    invoke-direct {v0, p1, p0, p2}, Lcom/daaw/rl2;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static q(Ljava/lang/String;Landroid/content/Context;ZI)Lcom/daaw/rl2;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1, p2}, Lcom/daaw/ql2;->l(Landroid/content/Context;Z)V

    new-instance p3, Lcom/daaw/rl2;

    invoke-direct {p3, p1, p0, p2}, Lcom/daaw/rl2;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    return-object p3
.end method


# virtual methods
.method public final j(Lcom/daaw/wm2;Landroid/content/Context;Lcom/daaw/hi2;Lcom/daaw/ai2;)Ljava/util/List;
    .locals 8

    invoke-virtual {p1}, Lcom/daaw/wm2;->k()Ljava/util/concurrent/ExecutorService;

    move-result-object p4

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    iget-boolean p4, p0, Lcom/daaw/ql2;->J:Z

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/wm2;->a()I

    move-result v6

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-super {p0, p1, p2, p3, v0}, Lcom/daaw/ql2;->j(Lcom/daaw/wm2;Landroid/content/Context;Lcom/daaw/hi2;Lcom/daaw/ai2;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p4, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance p2, Lcom/daaw/sn2;

    const/16 v7, 0x18

    const-string v3, "dJwO6Cl9MRqD0Gc5K3JTdZycyClQqkAPKU0XDLxQQPeGCWqiQha6f2rP1wtqtwx3"

    const-string v4, "rLNLoOjJQBnuvnCDgD+yaoADKoI2087E89SpHXw4yFg="

    move-object v1, p2

    move-object v2, p1

    move-object v5, p3

    invoke-direct/range {v1 .. v7}, Lcom/daaw/sn2;-><init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;II)V

    invoke-interface {p4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p4

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3, v0}, Lcom/daaw/ql2;->j(Lcom/daaw/wm2;Landroid/content/Context;Lcom/daaw/hi2;Lcom/daaw/ai2;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
