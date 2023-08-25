.class public final Lcom/daaw/cj;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/cj$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/res/Configuration;)Lcom/daaw/rk0;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lcom/daaw/cj$a;->a(Landroid/content/res/Configuration;)Landroid/os/LocaleList;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/rk0;->i(Landroid/os/LocaleList;)Lcom/daaw/rk0;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/util/Locale;

    const/4 v1, 0x0

    iget-object p0, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    aput-object p0, v0, v1

    invoke-static {v0}, Lcom/daaw/rk0;->a([Ljava/util/Locale;)Lcom/daaw/rk0;

    move-result-object p0

    return-object p0
.end method
