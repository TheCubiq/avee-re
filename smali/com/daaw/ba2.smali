.class public final Lcom/daaw/ba2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/ha2;

.field public final b:Lcom/daaw/ka2;

.field public final c:Lcom/daaw/m42;

.field public final d:Lcom/daaw/n42;

.field public e:I


# direct methods
.method public constructor <init>(Lcom/daaw/ha2;Lcom/daaw/ka2;Lcom/daaw/m42;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ba2;->a:Lcom/daaw/ha2;

    iput-object p2, p0, Lcom/daaw/ba2;->b:Lcom/daaw/ka2;

    iput-object p3, p0, Lcom/daaw/ba2;->c:Lcom/daaw/m42;

    iget-object p1, p1, Lcom/daaw/ha2;->f:Lcom/daaw/f92;

    iget-object p1, p1, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string p2, "audio/true-hd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/daaw/n42;

    invoke-direct {p1}, Lcom/daaw/n42;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/daaw/ba2;->d:Lcom/daaw/n42;

    return-void
.end method
