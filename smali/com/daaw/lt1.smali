.class public final Lcom/daaw/lt1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lcom/daaw/nt1;)Lcom/daaw/hn;
    .locals 1

    const-string v0, "owner"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/daaw/w80;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/w80;

    invoke-interface {p0}, Lcom/daaw/w80;->d()Lcom/daaw/hn;

    move-result-object p0

    const-string v0, "{\n        owner.defaultV\u2026ModelCreationExtras\n    }"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/daaw/hn$a;->b:Lcom/daaw/hn$a;

    :goto_0
    return-object p0
.end method
