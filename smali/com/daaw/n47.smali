.class public final Lcom/daaw/n47;
.super Lcom/daaw/p47;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/p47;-><init>(Lcom/daaw/f77;Ljava/lang/Class;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic E(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/daaw/w57;

    invoke-interface {p1, p2}, Lcom/daaw/w57;->zza(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p2

    const-string v0, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"

    invoke-static {p2, v0, p1}, Lcom/daaw/sy6;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final synthetic F(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/f77;

    invoke-virtual {p0, p1}, Lcom/daaw/c57;->w(Lcom/daaw/f77;)Z

    return-void
.end method
