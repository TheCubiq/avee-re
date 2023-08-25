.class public final Lcom/daaw/jp1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nl$b;
.implements Lcom/daaw/nl$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/nl$b;",
        "Lcom/daaw/nl$c<",
        "Lcom/daaw/jp1;",
        ">;"
    }
.end annotation


# static fields
.field public static final p:Lcom/daaw/jp1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/jp1;

    invoke-direct {v0}, Lcom/daaw/jp1;-><init>()V

    sput-object v0, Lcom/daaw/jp1;->p:Lcom/daaw/jp1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/nl$c<",
            "*>;"
        }
    .end annotation

    return-object p0
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
