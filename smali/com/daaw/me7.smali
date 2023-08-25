.class public final Lcom/daaw/me7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ph7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/le7;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/le7;-><init>(Lcom/daaw/ke7;)V

    sput-object v0, Lcom/daaw/me7;->a:Lcom/daaw/ph7;

    return-void
.end method

.method public static a(Lcom/daaw/s97;)Lcom/daaw/vh7;
    .locals 6

    new-instance v0, Lcom/daaw/rh7;

    invoke-direct {v0}, Lcom/daaw/rh7;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/s97;->b()Lcom/daaw/oh7;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/rh7;->b(Lcom/daaw/oh7;)Lcom/daaw/rh7;

    invoke-virtual {p0}, Lcom/daaw/s97;->d()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/o97;

    invoke-virtual {v3}, Lcom/daaw/o97;->g()I

    move-result v4

    add-int/lit8 v4, v4, -0x2

    const/4 v5, 0x1

    if-eq v4, v5, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    const/4 v5, 0x3

    if-ne v4, v5, :cond_1

    sget-object v4, Lcom/daaw/v87;->d:Lcom/daaw/v87;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    sget-object v4, Lcom/daaw/v87;->c:Lcom/daaw/v87;

    goto :goto_1

    :cond_3
    sget-object v4, Lcom/daaw/v87;->b:Lcom/daaw/v87;

    :goto_1
    invoke-virtual {v3}, Lcom/daaw/o97;->a()I

    move-result v5

    invoke-virtual {v3}, Lcom/daaw/o97;->c()Lcom/daaw/l97;

    move-result-object v3

    invoke-virtual {v0, v4, v5, v3}, Lcom/daaw/rh7;->a(Lcom/daaw/v87;ILcom/daaw/l97;)Lcom/daaw/rh7;

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lcom/daaw/s97;->a()Lcom/daaw/o97;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lcom/daaw/s97;->a()Lcom/daaw/o97;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/o97;->a()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/daaw/rh7;->c(I)Lcom/daaw/rh7;

    :cond_5
    :try_start_0
    invoke-virtual {v0}, Lcom/daaw/rh7;->d()Lcom/daaw/vh7;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method
