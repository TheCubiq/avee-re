.class public abstract Lcom/daaw/nx;
.super Lcom/daaw/mc1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/mc1;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/daaw/b61;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/mc1;-><init>(Lcom/daaw/b61;)V

    return-void
.end method


# virtual methods
.method public abstract g(Lcom/daaw/ni1;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ni1;",
            "TT;)V"
        }
    .end annotation
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/mc1;->a()Lcom/daaw/ni1;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lcom/daaw/nx;->g(Lcom/daaw/ni1;Ljava/lang/Object;)V

    invoke-interface {v0}, Lcom/daaw/ni1;->S()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lcom/daaw/mc1;->f(Lcom/daaw/ni1;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v0}, Lcom/daaw/mc1;->f(Lcom/daaw/ni1;)V

    throw p1
.end method
