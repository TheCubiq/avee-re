.class public final Lcom/daaw/jy6;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/lang/Object;)Lcom/daaw/iy6;
    .locals 2

    new-instance v0, Lcom/daaw/iy6;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/iy6;-><init>(Ljava/lang/String;Lcom/daaw/gy6;)V

    return-object v0
.end method
