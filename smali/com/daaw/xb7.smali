.class public final Lcom/daaw/xb7;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(I)Z
    .locals 2

    add-int/lit8 p0, p0, -0x1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p0, :cond_2

    invoke-static {}, Lcom/daaw/yb7;->b()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, Lcom/daaw/yb7;->a()Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    return v0

    :cond_2
    invoke-static {}, Lcom/daaw/yb7;->b()Z

    move-result p0

    if-nez p0, :cond_3

    return v0

    :cond_3
    return v1
.end method
