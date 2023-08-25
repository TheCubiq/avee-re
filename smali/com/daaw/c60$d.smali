.class public Lcom/daaw/c60$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/c60;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/sw1$a<",
        "Landroid/view/View;",
        "Landroid/view/View;",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/c60;


# direct methods
.method public constructor <init>(Lcom/daaw/c60;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c60$d;->a:Lcom/daaw/c60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/View;

    check-cast p3, Landroid/view/View;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/c60$d;->b(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public b(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 1

    new-instance p3, Ljava/util/Date;

    invoke-direct {p3}, Ljava/util/Date;-><init>()V

    iget-object v0, p0, Lcom/daaw/c60$d;->a:Lcom/daaw/c60;

    iget-object v0, v0, Lcom/daaw/c60;->e:Ljava/util/Date;

    invoke-virtual {p3, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/c60$d;->a:Lcom/daaw/c60;

    iget-object v0, v0, Lcom/daaw/c60;->f:Ljava/util/Date;

    invoke-virtual {p3, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_1

    const p3, 0x7f08017c

    if-eqz p1, :cond_0

    invoke-virtual {p1, p3}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_0
    if-eqz p2, :cond_3

    :goto_0
    invoke-virtual {p2, p3}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/daaw/c60$d;->a:Lcom/daaw/c60;

    iget-object v0, v0, Lcom/daaw/c60;->g:Ljava/util/Date;

    invoke-virtual {p3, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/c60$d;->a:Lcom/daaw/c60;

    iget-object v0, v0, Lcom/daaw/c60;->h:Ljava/util/Date;

    invoke-virtual {p3, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result p3

    if-eqz p3, :cond_3

    const p3, 0x7f080155

    if-eqz p1, :cond_2

    invoke-virtual {p1, p3}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_2
    if-eqz p2, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/daaw/c60$d;->a:Lcom/daaw/c60;

    invoke-static {p1}, Lcom/daaw/c60;->h(Lcom/daaw/c60;)V

    return-void
.end method
