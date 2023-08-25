.class public abstract Lcom/daaw/v71$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;
.implements Lcom/daaw/v71$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/v71;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;",
        "Lcom/daaw/v71$f<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public p:Lcom/daaw/v71$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/v71$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public q:Lcom/daaw/v71$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/v71$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field


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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/v71$e;->p:Lcom/daaw/v71$c;

    iput-object p1, p0, Lcom/daaw/v71$e;->q:Lcom/daaw/v71$c;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/v71$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/v71$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/v71$e;->p:Lcom/daaw/v71$c;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lcom/daaw/v71$e;->q:Lcom/daaw/v71$c;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/v71$e;->q:Lcom/daaw/v71$c;

    iput-object v0, p0, Lcom/daaw/v71$e;->p:Lcom/daaw/v71$c;

    :cond_0
    iget-object v0, p0, Lcom/daaw/v71$e;->p:Lcom/daaw/v71$c;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0, v0}, Lcom/daaw/v71$e;->b(Lcom/daaw/v71$c;)Lcom/daaw/v71$c;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/v71$e;->p:Lcom/daaw/v71$c;

    :cond_1
    iget-object v0, p0, Lcom/daaw/v71$e;->q:Lcom/daaw/v71$c;

    if-ne v0, p1, :cond_2

    invoke-virtual {p0}, Lcom/daaw/v71$e;->e()Lcom/daaw/v71$c;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/v71$e;->q:Lcom/daaw/v71$c;

    :cond_2
    return-void
.end method

.method public abstract b(Lcom/daaw/v71$c;)Lcom/daaw/v71$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/v71$c<",
            "TK;TV;>;)",
            "Lcom/daaw/v71$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public abstract c(Lcom/daaw/v71$c;)Lcom/daaw/v71$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/v71$c<",
            "TK;TV;>;)",
            "Lcom/daaw/v71$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public d()Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/v71$e;->q:Lcom/daaw/v71$c;

    invoke-virtual {p0}, Lcom/daaw/v71$e;->e()Lcom/daaw/v71$c;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/v71$e;->q:Lcom/daaw/v71$c;

    return-object v0
.end method

.method public final e()Lcom/daaw/v71$c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/v71$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/v71$e;->q:Lcom/daaw/v71$c;

    iget-object v1, p0, Lcom/daaw/v71$e;->p:Lcom/daaw/v71$c;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/daaw/v71$e;->c(Lcom/daaw/v71$c;)Lcom/daaw/v71$c;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/v71$e;->q:Lcom/daaw/v71$c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/v71$e;->d()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
