.class public Lcom/daaw/v71$a;
.super Lcom/daaw/v71$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/v71;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/v71$e<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/daaw/v71$c;Lcom/daaw/v71$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/v71$c<",
            "TK;TV;>;",
            "Lcom/daaw/v71$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/daaw/v71$e;-><init>(Lcom/daaw/v71$c;Lcom/daaw/v71$c;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/daaw/v71$c;)Lcom/daaw/v71$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/v71$c<",
            "TK;TV;>;)",
            "Lcom/daaw/v71$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Lcom/daaw/v71$c;->s:Lcom/daaw/v71$c;

    return-object p1
.end method

.method public c(Lcom/daaw/v71$c;)Lcom/daaw/v71$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/v71$c<",
            "TK;TV;>;)",
            "Lcom/daaw/v71$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Lcom/daaw/v71$c;->r:Lcom/daaw/v71$c;

    return-object p1
.end method
