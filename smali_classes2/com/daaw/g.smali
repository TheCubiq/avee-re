.class public abstract Lcom/daaw/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nl$b;


# instance fields
.field private final key:Lcom/daaw/nl$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/nl$c<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/nl$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/nl$c<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g;->key:Lcom/daaw/nl$c;

    return-void
.end method


# virtual methods
.method public fold(Ljava/lang/Object;Lcom/daaw/n50;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lcom/daaw/n50<",
            "-TR;-",
            "Lcom/daaw/nl$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/daaw/nl$b$a;->a(Lcom/daaw/nl$b;Ljava/lang/Object;Lcom/daaw/n50;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lcom/daaw/nl$b;",
            ">(",
            "Lcom/daaw/nl$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/daaw/nl$b$a;->b(Lcom/daaw/nl$b;Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object p1

    return-object p1
.end method

.method public getKey()Lcom/daaw/nl$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/nl$c<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/g;->key:Lcom/daaw/nl$c;

    return-object v0
.end method

.method public minusKey(Lcom/daaw/nl$c;)Lcom/daaw/nl;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/nl$c<",
            "*>;)",
            "Lcom/daaw/nl;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/daaw/nl$b$a;->c(Lcom/daaw/nl$b;Lcom/daaw/nl$c;)Lcom/daaw/nl;

    move-result-object p1

    return-object p1
.end method

.method public plus(Lcom/daaw/nl;)Lcom/daaw/nl;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/nl$b$a;->d(Lcom/daaw/nl$b;Lcom/daaw/nl;)Lcom/daaw/nl;

    move-result-object p1

    return-object p1
.end method
