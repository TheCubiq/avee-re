.class public Lcom/daaw/vg0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lcom/daaw/gl;)Lcom/daaw/gl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/gl<",
            "-TT;>;)",
            "Lcom/daaw/gl<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/daaw/il;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/daaw/il;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/daaw/il;->f()Lcom/daaw/gl;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method
