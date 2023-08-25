.class public Lcom/daaw/v71$d;
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
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
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

.field public q:Z

.field public final synthetic r:Lcom/daaw/v71;


# direct methods
.method public constructor <init>(Lcom/daaw/v71;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/v71$d;->r:Lcom/daaw/v71;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/v71$d;->q:Z

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

    iget-object v0, p0, Lcom/daaw/v71$d;->p:Lcom/daaw/v71$c;

    if-ne p1, v0, :cond_1

    iget-object p1, v0, Lcom/daaw/v71$c;->s:Lcom/daaw/v71$c;

    iput-object p1, p0, Lcom/daaw/v71$d;->p:Lcom/daaw/v71$c;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/v71$d;->q:Z

    :cond_1
    return-void
.end method

.method public b()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/v71$d;->q:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/v71$d;->q:Z

    iget-object v0, p0, Lcom/daaw/v71$d;->r:Lcom/daaw/v71;

    iget-object v0, v0, Lcom/daaw/v71;->p:Lcom/daaw/v71$c;

    :goto_0
    iput-object v0, p0, Lcom/daaw/v71$d;->p:Lcom/daaw/v71$c;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/v71$d;->p:Lcom/daaw/v71$c;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/daaw/v71$c;->r:Lcom/daaw/v71$c;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/daaw/v71$d;->p:Lcom/daaw/v71$c;

    return-object v0
.end method

.method public hasNext()Z
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/v71$d;->q:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/v71$d;->r:Lcom/daaw/v71;

    iget-object v0, v0, Lcom/daaw/v71;->p:Lcom/daaw/v71$c;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    iget-object v0, p0, Lcom/daaw/v71$d;->p:Lcom/daaw/v71$c;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lcom/daaw/v71$c;->r:Lcom/daaw/v71$c;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/v71$d;->b()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
