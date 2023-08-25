.class public final Lcom/daaw/iw6;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;)Lcom/daaw/ew6;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    new-instance v0, Lcom/daaw/jw6;

    new-instance v1, Lcom/daaw/pw6;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object p0, v2

    :cond_0
    invoke-direct {v1, p0}, Lcom/daaw/pw6;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/daaw/jw6;-><init>(Lcom/daaw/pw6;)V

    return-object v0
.end method
