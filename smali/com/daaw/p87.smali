.class public Lcom/daaw/p87;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/n87;


# instance fields
.field public final a:Lcom/daaw/ee7;

.field public final b:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lcom/daaw/ee7;Ljava/lang/Class;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/ee7;->j()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Ljava/lang/Void;

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const/4 p1, 0x1

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v1, p1

    const-string p1, "Given internalKeyMananger %s does not support primitive class %s"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput-object p1, p0, Lcom/daaw/p87;->a:Lcom/daaw/ee7;

    iput-object p2, p0, Lcom/daaw/p87;->b:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/xt7;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/p87;->a:Lcom/daaw/ee7;

    invoke-virtual {v0}, Lcom/daaw/ee7;->h()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Expected proto of type "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/p87;->a:Lcom/daaw/ee7;

    invoke-virtual {v1}, Lcom/daaw/ee7;->h()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/p87;->f(Lcom/daaw/xt7;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Lcom/daaw/yq7;)Ljava/lang/Object;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/p87;->a:Lcom/daaw/ee7;

    invoke-virtual {v0, p1}, Lcom/daaw/ee7;->c(Lcom/daaw/yq7;)Lcom/daaw/xt7;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/p87;->f(Lcom/daaw/xt7;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lcom/daaw/xs7; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    iget-object v1, p0, Lcom/daaw/p87;->a:Lcom/daaw/ee7;

    invoke-virtual {v1}, Lcom/daaw/ee7;->h()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failures parsing proto of type "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final c(Lcom/daaw/yq7;)Lcom/daaw/nm7;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/p87;->e()Lcom/daaw/o87;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/o87;->a(Lcom/daaw/yq7;)Lcom/daaw/xt7;

    move-result-object p1

    invoke-static {}, Lcom/daaw/nm7;->L()Lcom/daaw/km7;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/p87;->a:Lcom/daaw/ee7;

    invoke-virtual {v1}, Lcom/daaw/ee7;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/km7;->t(Ljava/lang/String;)Lcom/daaw/km7;

    invoke-interface {p1}, Lcom/daaw/xt7;->d()Lcom/daaw/yq7;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/km7;->u(Lcom/daaw/yq7;)Lcom/daaw/km7;

    iget-object p1, p0, Lcom/daaw/p87;->a:Lcom/daaw/ee7;

    invoke-virtual {p1}, Lcom/daaw/ee7;->b()Lcom/daaw/mm7;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/km7;->s(Lcom/daaw/mm7;)Lcom/daaw/km7;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/nm7;
    :try_end_0
    .catch Lcom/daaw/xs7; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Unexpected proto"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final d(Lcom/daaw/yq7;)Lcom/daaw/xt7;
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/p87;->e()Lcom/daaw/o87;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/o87;->a(Lcom/daaw/yq7;)Lcom/daaw/xt7;

    move-result-object p1
    :try_end_0
    .catch Lcom/daaw/xs7; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    iget-object v1, p0, Lcom/daaw/p87;->a:Lcom/daaw/ee7;

    invoke-virtual {v1}, Lcom/daaw/ee7;->a()Lcom/daaw/de7;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/de7;->e()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failures parsing proto of type "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final e()Lcom/daaw/o87;
    .locals 2

    new-instance v0, Lcom/daaw/o87;

    iget-object v1, p0, Lcom/daaw/p87;->a:Lcom/daaw/ee7;

    invoke-virtual {v1}, Lcom/daaw/ee7;->a()Lcom/daaw/de7;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/o87;-><init>(Lcom/daaw/de7;)V

    return-object v0
.end method

.method public final f(Lcom/daaw/xt7;)Ljava/lang/Object;
    .locals 2

    const-class v0, Ljava/lang/Void;

    iget-object v1, p0, Lcom/daaw/p87;->b:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/p87;->a:Lcom/daaw/ee7;

    invoke-virtual {v0, p1}, Lcom/daaw/ee7;->e(Lcom/daaw/xt7;)V

    iget-object v0, p0, Lcom/daaw/p87;->a:Lcom/daaw/ee7;

    iget-object v1, p0, Lcom/daaw/p87;->b:Ljava/lang/Class;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/ee7;->i(Lcom/daaw/xt7;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Cannot create a primitive for Void"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zzc()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p87;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p87;->a:Lcom/daaw/ee7;

    invoke-virtual {v0}, Lcom/daaw/ee7;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
