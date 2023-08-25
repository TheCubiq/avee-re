.class public final Lcom/daaw/d97;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/dn7;

.field public final b:Lcom/daaw/oh7;


# direct methods
.method public constructor <init>(Lcom/daaw/dn7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/d97;->a:Lcom/daaw/dn7;

    sget-object p1, Lcom/daaw/oh7;->b:Lcom/daaw/oh7;

    iput-object p1, p0, Lcom/daaw/d97;->b:Lcom/daaw/oh7;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/dn7;Lcom/daaw/c97;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/d97;-><init>(Lcom/daaw/dn7;)V

    return-void
.end method

.method public static final a(Lcom/daaw/dn7;)Lcom/daaw/d97;
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/dn7;->L()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Lcom/daaw/d97;

    invoke-direct {v0, p0}, Lcom/daaw/d97;-><init>(Lcom/daaw/dn7;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Lcom/daaw/w87;)Lcom/daaw/d97;
    .locals 3

    new-instance v0, Lcom/daaw/je7;

    invoke-virtual {p0}, Lcom/daaw/w87;->a()Lcom/daaw/vm7;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/ff7;->a(Lcom/daaw/vm7;)Lcom/daaw/ff7;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/daaw/je7;-><init>(Lcom/daaw/ff7;)V

    new-instance p0, Lcom/daaw/b97;

    invoke-direct {p0}, Lcom/daaw/b97;-><init>()V

    new-instance v1, Lcom/daaw/z87;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/daaw/z87;-><init>(Lcom/daaw/l97;Lcom/daaw/y87;)V

    invoke-virtual {v1}, Lcom/daaw/z87;->d()Lcom/daaw/z87;

    invoke-virtual {v1}, Lcom/daaw/z87;->e()Lcom/daaw/z87;

    invoke-virtual {p0, v1}, Lcom/daaw/b97;->a(Lcom/daaw/z87;)Lcom/daaw/b97;

    invoke-virtual {p0}, Lcom/daaw/b97;->b()Lcom/daaw/d97;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c()Lcom/daaw/dn7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/d97;->a:Lcom/daaw/dn7;

    return-object v0
.end method

.method public final d(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 7

    invoke-static {p1}, Lcom/daaw/w97;->e(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/daaw/d97;->a:Lcom/daaw/dn7;

    invoke-static {v1}, Lcom/daaw/y97;->b(Lcom/daaw/dn7;)V

    new-instance v1, Lcom/daaw/n97;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/daaw/n97;-><init>(Ljava/lang/Class;Lcom/daaw/m97;)V

    iget-object v2, p0, Lcom/daaw/d97;->b:Lcom/daaw/oh7;

    invoke-virtual {v1, v2}, Lcom/daaw/n97;->c(Lcom/daaw/oh7;)Lcom/daaw/n97;

    iget-object v2, p0, Lcom/daaw/d97;->a:Lcom/daaw/dn7;

    invoke-virtual {v2}, Lcom/daaw/dn7;->R()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/cn7;

    invoke-virtual {v3}, Lcom/daaw/cn7;->U()I

    move-result v4

    const/4 v5, 0x3

    if-ne v4, v5, :cond_0

    invoke-virtual {v3}, Lcom/daaw/cn7;->M()Lcom/daaw/nm7;

    move-result-object v4

    invoke-static {v4, v0}, Lcom/daaw/w97;->f(Lcom/daaw/nm7;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3}, Lcom/daaw/cn7;->L()I

    move-result v5

    iget-object v6, p0, Lcom/daaw/d97;->a:Lcom/daaw/dn7;

    invoke-virtual {v6}, Lcom/daaw/dn7;->M()I

    move-result v6

    if-ne v5, v6, :cond_1

    invoke-virtual {v1, v4, v3}, Lcom/daaw/n97;->a(Ljava/lang/Object;Lcom/daaw/cn7;)Lcom/daaw/n97;

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v4, v3}, Lcom/daaw/n97;->b(Ljava/lang/Object;Lcom/daaw/cn7;)Lcom/daaw/n97;

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/daaw/n97;->d()Lcom/daaw/s97;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/w97;->j(Lcom/daaw/s97;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "No wrapper found for "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/d97;->a:Lcom/daaw/dn7;

    invoke-static {v0}, Lcom/daaw/y97;->a(Lcom/daaw/dn7;)Lcom/daaw/in7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ls7;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
