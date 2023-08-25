.class public Lcom/daaw/w51$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/w51;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/rw1$a<",
        "Lcom/daaw/al;",
        "Ljava/util/Collection<",
        "Lcom/daaw/tx0;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/w51;


# direct methods
.method public constructor <init>(Lcom/daaw/w51;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/w51$a;->a:Lcom/daaw/w51;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/al;Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/al;",
            "Ljava/util/Collection<",
            "Lcom/daaw/tx0;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/al;->a()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/i5;->b(Landroid/content/Context;Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f10022a

    :goto_0
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/daaw/vy;->a:Lcom/daaw/qw1;

    invoke-virtual {p2, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    if-gtz v0, :cond_1

    return-void

    :cond_1
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/tx0;

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/daaw/tx0;->k(Landroid/content/Context;)Lcom/daaw/tx0$c;

    move-result-object p2

    iget-object v0, p2, Lcom/daaw/tx0$c;->a:Lcom/daaw/tx0$b;

    iget-object v0, v0, Lcom/daaw/tx0$b;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object p1

    if-gtz v0, :cond_3

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f10022b

    goto :goto_0

    :cond_3
    iget-object v0, p2, Lcom/daaw/tx0$c;->a:Lcom/daaw/tx0$b;

    iget-object v0, v0, Lcom/daaw/tx0$b;->b:Ljava/lang/String;

    iget-object v1, p2, Lcom/daaw/tx0$c;->g:Ljava/lang/String;

    iget-object v2, p2, Lcom/daaw/tx0$c;->e:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/tx0$c;->c:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2, p2}, Lcom/daaw/x51;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/al;

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/w51$a;->a(Lcom/daaw/al;Ljava/util/Collection;)V

    return-void
.end method
