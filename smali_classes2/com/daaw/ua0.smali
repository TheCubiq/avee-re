.class public Lcom/daaw/ua0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Lcom/daaw/vh;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/vh<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/ua0$a;

    invoke-direct {v0}, Lcom/daaw/ua0$a;-><init>()V

    const-class v1, Lcom/daaw/ta0;

    invoke-static {v0, v1}, Lcom/daaw/vh;->l(Ljava/lang/Object;Ljava/lang/Class;)Lcom/daaw/vh;

    move-result-object v0

    return-object v0
.end method
