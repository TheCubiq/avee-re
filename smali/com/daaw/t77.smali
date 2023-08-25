.class public final Lcom/daaw/t77;
.super Lcom/daaw/e77;
.source ""


# instance fields
.field public final r:Lcom/daaw/v57;

.field public final synthetic s:Lcom/daaw/v77;


# direct methods
.method public constructor <init>(Lcom/daaw/v77;Lcom/daaw/v57;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/t77;->s:Lcom/daaw/v77;

    invoke-direct {p0}, Lcom/daaw/e77;-><init>()V

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/t77;->r:Lcom/daaw/v57;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/t77;->r:Lcom/daaw/v57;

    invoke-interface {v0}, Lcom/daaw/v57;->zza()Lcom/daaw/f77;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/t77;->r:Lcom/daaw/v57;

    const-string v2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"

    invoke-static {v0, v2, v1}, Lcom/daaw/sy6;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/t77;->r:Lcom/daaw/v57;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/t77;->s:Lcom/daaw/v77;

    invoke-virtual {v0, p1}, Lcom/daaw/c57;->i(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final synthetic e(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/daaw/f77;

    iget-object v0, p0, Lcom/daaw/t77;->s:Lcom/daaw/v77;

    invoke-virtual {v0, p1}, Lcom/daaw/c57;->w(Lcom/daaw/f77;)Z

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/t77;->s:Lcom/daaw/v77;

    invoke-virtual {v0}, Lcom/daaw/c57;->isDone()Z

    move-result v0

    return v0
.end method
