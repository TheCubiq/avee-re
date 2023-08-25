.class public Lcom/daaw/qg0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/16 v2, 0x3a

    invoke-static {p0, v2, v1}, Lcom/daaw/br1;->B(Ljava/lang/String;I[Ljava/lang/String;)V

    aget-object p0, v1, v0

    const-string v2, "internalres"

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, Lcom/daaw/fs;->b()Lcom/daaw/fs;

    move-result-object p0

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {p0, v1, v0}, Lcom/daaw/fs;->a(Ljava/lang/String;I)I

    move-result p0

    return p0

    :cond_1
    return v0
.end method
