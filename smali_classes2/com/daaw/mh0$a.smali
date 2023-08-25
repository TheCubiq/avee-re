.class public final Lcom/daaw/mh0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/mh0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lcom/daaw/mh0;Ljava/lang/Object;Lcom/daaw/n50;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/mh0;",
            "TR;",
            "Lcom/daaw/n50<",
            "-TR;-",
            "Lcom/daaw/nl$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/daaw/nl$b$a;->a(Lcom/daaw/nl$b;Ljava/lang/Object;Lcom/daaw/n50;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/daaw/mh0;Lcom/daaw/nl$c;)Lcom/daaw/nl$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lcom/daaw/nl$b;",
            ">(",
            "Lcom/daaw/mh0;",
            "Lcom/daaw/nl$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/daaw/nl$b$a;->b(Lcom/daaw/nl$b;Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/daaw/mh0;ZZLcom/daaw/z40;ILjava/lang/Object;)Lcom/daaw/iu;
    .locals 0

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lcom/daaw/mh0;->w(ZZLcom/daaw/z40;)Lcom/daaw/iu;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: invokeOnCompletion"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Lcom/daaw/mh0;Lcom/daaw/nl$c;)Lcom/daaw/nl;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/mh0;",
            "Lcom/daaw/nl$c<",
            "*>;)",
            "Lcom/daaw/nl;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/daaw/nl$b$a;->c(Lcom/daaw/nl$b;Lcom/daaw/nl$c;)Lcom/daaw/nl;

    move-result-object p0

    return-object p0
.end method
