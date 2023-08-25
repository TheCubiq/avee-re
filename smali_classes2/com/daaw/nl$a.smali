.class public final Lcom/daaw/nl$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/nl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lcom/daaw/nl;Lcom/daaw/nl;)Lcom/daaw/nl;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/mw;->p:Lcom/daaw/mw;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/nl$a$a;->q:Lcom/daaw/nl$a$a;

    invoke-interface {p1, p0, v0}, Lcom/daaw/nl;->fold(Ljava/lang/Object;Lcom/daaw/n50;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/nl;

    :goto_0
    return-object p0
.end method
