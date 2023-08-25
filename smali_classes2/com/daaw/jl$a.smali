.class public final Lcom/daaw/jl$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/jl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lcom/daaw/jl;Lcom/daaw/nl$c;)Lcom/daaw/nl$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lcom/daaw/nl$b;",
            ">(",
            "Lcom/daaw/jl;",
            "Lcom/daaw/nl$c<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/daaw/h;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lcom/daaw/h;

    invoke-interface {p0}, Lcom/daaw/nl$b;->getKey()Lcom/daaw/nl$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/h;->a(Lcom/daaw/nl$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Lcom/daaw/h;->b(Lcom/daaw/nl$b;)Lcom/daaw/nl$b;

    move-result-object p0

    instance-of p1, p0, Lcom/daaw/nl$b;

    if-eqz p1, :cond_0

    move-object v1, p0

    :cond_0
    return-object v1

    :cond_1
    sget-object v0, Lcom/daaw/jl;->b:Lcom/daaw/jl$b;

    if-ne v0, p1, :cond_2

    const-string p1, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get"

    invoke-static {p0, p1}, Lcom/daaw/ug0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static b(Lcom/daaw/jl;Lcom/daaw/nl$c;)Lcom/daaw/nl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/jl;",
            "Lcom/daaw/nl$c<",
            "*>;)",
            "Lcom/daaw/nl;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/daaw/h;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/daaw/h;

    invoke-interface {p0}, Lcom/daaw/nl$b;->getKey()Lcom/daaw/nl$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/h;->a(Lcom/daaw/nl$c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Lcom/daaw/h;->b(Lcom/daaw/nl$b;)Lcom/daaw/nl$b;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p0, Lcom/daaw/mw;->p:Lcom/daaw/mw;

    :cond_0
    return-object p0

    :cond_1
    sget-object v0, Lcom/daaw/jl;->b:Lcom/daaw/jl$b;

    if-ne v0, p1, :cond_2

    sget-object p0, Lcom/daaw/mw;->p:Lcom/daaw/mw;

    :cond_2
    return-object p0
.end method
