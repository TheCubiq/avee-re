.class public Lcom/daaw/q91;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m10;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/m10<",
        "Lcom/daaw/tx0;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q91;->a:Landroid/content/Context;

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

    check-cast p2, Lcom/daaw/tx0;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/q91;->d(Ljava/lang/String;Lcom/daaw/tx0;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/tx0;

    invoke-virtual {p0, p1}, Lcom/daaw/q91;->e(Lcom/daaw/tx0;)V

    return-void
.end method

.method public d(Ljava/lang/String;Lcom/daaw/tx0;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/q91;->a:Landroid/content/Context;

    invoke-virtual {p2, v0}, Lcom/daaw/tx0;->j(Landroid/content/Context;)Lcom/daaw/tx0$b;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object v0, p2, Lcom/daaw/tx0$b;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object p2, p2, Lcom/daaw/tx0$b;->e:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public e(Lcom/daaw/tx0;)V
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/tx0;->h()Lcom/daaw/tx0$b;

    return-void
.end method
