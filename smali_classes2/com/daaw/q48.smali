.class public final Lcom/daaw/q48;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/daaw/e48;)Lcom/daaw/e48;
    .locals 1

    instance-of v0, p0, Lcom/daaw/k48;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/daaw/h48;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/daaw/h48;

    invoke-direct {v0, p0}, Lcom/daaw/h48;-><init>(Lcom/daaw/e48;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/k48;

    invoke-direct {v0, p0}, Lcom/daaw/k48;-><init>(Lcom/daaw/e48;)V

    :goto_0
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static b(Ljava/lang/Object;)Lcom/daaw/e48;
    .locals 1

    new-instance v0, Lcom/daaw/n48;

    invoke-direct {v0, p0}, Lcom/daaw/n48;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
