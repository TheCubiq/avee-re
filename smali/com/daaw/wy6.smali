.class public final Lcom/daaw/wy6;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lcom/daaw/ty6;Lcom/daaw/ty6;)Lcom/daaw/ty6;
    .locals 3

    new-instance v0, Lcom/daaw/vy6;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/daaw/ty6;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 p1, 0x0

    invoke-direct {v0, p0, p1}, Lcom/daaw/vy6;-><init>(Ljava/util/List;Lcom/daaw/uy6;)V

    return-object v0
.end method
