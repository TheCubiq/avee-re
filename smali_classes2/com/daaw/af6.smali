.class public final Lcom/daaw/af6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zp8;


# instance fields
.field public final synthetic a:Lcom/daaw/gh6;


# direct methods
.method public constructor <init>(Lcom/daaw/gh6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/af6;->a:Lcom/daaw/gh6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/util/List;ZZ)V
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 v0, 0x3

    const/4 v1, 0x1

    if-eqz p1, :cond_7

    if-eq p1, v1, :cond_4

    if-eq p1, v0, :cond_3

    const/4 v2, 0x4

    if-eq p1, v2, :cond_0

    iget-object p1, p0, Lcom/daaw/af6;->a:Lcom/daaw/gh6;

    iget-object p1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->u()Lcom/daaw/hk5;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/af6;->a:Lcom/daaw/gh6;

    iget-object p1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    if-eqz p4, :cond_1

    invoke-virtual {p1}, Lcom/daaw/om5;->y()Lcom/daaw/hk5;

    move-result-object p1

    goto :goto_0

    :cond_1
    if-nez p5, :cond_2

    invoke-virtual {p1}, Lcom/daaw/om5;->x()Lcom/daaw/hk5;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object p1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/daaw/af6;->a:Lcom/daaw/gh6;

    iget-object p1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object p1

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/daaw/af6;->a:Lcom/daaw/gh6;

    iget-object p1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    if-eqz p4, :cond_5

    invoke-virtual {p1}, Lcom/daaw/om5;->t()Lcom/daaw/hk5;

    move-result-object p1

    goto :goto_0

    :cond_5
    if-nez p5, :cond_6

    invoke-virtual {p1}, Lcom/daaw/om5;->s()Lcom/daaw/hk5;

    move-result-object p1

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p1

    goto :goto_0

    :cond_7
    iget-object p1, p0, Lcom/daaw/af6;->a:Lcom/daaw/gh6;

    iget-object p1, p1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object p1

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    const/4 p5, 0x0

    if-eq p4, v1, :cond_a

    const/4 v2, 0x2

    if-eq p4, v2, :cond_9

    if-eq p4, v0, :cond_8

    invoke-virtual {p1, p2}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    return-void

    :cond_8
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p4, p5, p3}, Lcom/daaw/hk5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_9
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p4, p3}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_a
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
