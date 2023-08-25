.class public Lcom/daaw/j67;
.super Lcom/daaw/t67;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/t67;-><init>()V

    return-void
.end method

.method public static D(Lcom/daaw/f77;)Lcom/daaw/j67;
    .locals 1

    instance-of v0, p0, Lcom/daaw/j67;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/j67;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/k67;

    invoke-direct {v0, p0}, Lcom/daaw/k67;-><init>(Lcom/daaw/f77;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
