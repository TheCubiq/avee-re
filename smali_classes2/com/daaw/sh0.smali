.class public final synthetic Lcom/daaw/sh0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lcom/daaw/nl;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, Lcom/daaw/mh0;->d:Lcom/daaw/mh0$b;

    invoke-interface {p0, v0}, Lcom/daaw/nl;->get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object p0

    check-cast p0, Lcom/daaw/mh0;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Lcom/daaw/mh0;->L(Ljava/util/concurrent/CancellationException;)V

    :goto_0
    return-void
.end method
