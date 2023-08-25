.class public final Lcom/daaw/nl$a$a;
.super Lcom/daaw/si0;
.source ""

# interfaces
.implements Lcom/daaw/n50;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/nl$a;->a(Lcom/daaw/nl;Lcom/daaw/nl;)Lcom/daaw/nl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/si0;",
        "Lcom/daaw/n50<",
        "Lcom/daaw/nl;",
        "Lcom/daaw/nl$b;",
        "Lcom/daaw/nl;",
        ">;"
    }
.end annotation


# static fields
.field public static final q:Lcom/daaw/nl$a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/nl$a$a;

    invoke-direct {v0}, Lcom/daaw/nl$a$a;-><init>()V

    sput-object v0, Lcom/daaw/nl$a$a;->q:Lcom/daaw/nl$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/daaw/si0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/nl;

    check-cast p2, Lcom/daaw/nl$b;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/nl$a$a;->d(Lcom/daaw/nl;Lcom/daaw/nl$b;)Lcom/daaw/nl;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/daaw/nl;Lcom/daaw/nl$b;)Lcom/daaw/nl;
    .locals 3

    const-string v0, "acc"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lcom/daaw/nl$b;->getKey()Lcom/daaw/nl$c;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/daaw/nl;->minusKey(Lcom/daaw/nl$c;)Lcom/daaw/nl;

    move-result-object p1

    sget-object v0, Lcom/daaw/mw;->p:Lcom/daaw/mw;

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/daaw/jl;->b:Lcom/daaw/jl$b;

    invoke-interface {p1, v1}, Lcom/daaw/nl;->get(Lcom/daaw/nl$c;)Lcom/daaw/nl$b;

    move-result-object v2

    check-cast v2, Lcom/daaw/jl;

    if-nez v2, :cond_1

    new-instance v0, Lcom/daaw/dh;

    invoke-direct {v0, p1, p2}, Lcom/daaw/dh;-><init>(Lcom/daaw/nl;Lcom/daaw/nl$b;)V

    :goto_0
    move-object p2, v0

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1}, Lcom/daaw/nl;->minusKey(Lcom/daaw/nl$c;)Lcom/daaw/nl;

    move-result-object p1

    if-ne p1, v0, :cond_2

    new-instance p1, Lcom/daaw/dh;

    invoke-direct {p1, p2, v2}, Lcom/daaw/dh;-><init>(Lcom/daaw/nl;Lcom/daaw/nl$b;)V

    move-object p2, p1

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/daaw/dh;

    new-instance v1, Lcom/daaw/dh;

    invoke-direct {v1, p1, p2}, Lcom/daaw/dh;-><init>(Lcom/daaw/nl;Lcom/daaw/nl$b;)V

    invoke-direct {v0, v1, v2}, Lcom/daaw/dh;-><init>(Lcom/daaw/nl;Lcom/daaw/nl$b;)V

    goto :goto_0

    :goto_1
    return-object p2
.end method
