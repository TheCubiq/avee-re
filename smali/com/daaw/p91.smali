.class public Lcom/daaw/p91;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m10;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/m10<",
        "Lcom/daaw/h60;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    check-cast p2, Lcom/daaw/h60;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/p91;->d(Ljava/lang/String;Lcom/daaw/h60;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/h60;

    invoke-virtual {p0, p1}, Lcom/daaw/p91;->e(Lcom/daaw/h60;)V

    return-void
.end method

.method public d(Ljava/lang/String;Lcom/daaw/h60;)Z
    .locals 0

    iget-object p2, p2, Lcom/daaw/h60;->a:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public e(Lcom/daaw/h60;)V
    .locals 0

    return-void
.end method
