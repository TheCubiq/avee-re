.class public Lcom/daaw/io$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lu$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/io;->m(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;Landroid/app/Activity;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/io;


# direct methods
.method public constructor <init>(Lcom/daaw/io;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/io$j;->a:Lcom/daaw/io;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 4

    const/4 v0, 0x1

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    iget-object v1, p0, Lcom/daaw/io$j;->a:Lcom/daaw/io;

    invoke-static {v1}, Lcom/daaw/io;->e(Lcom/daaw/io;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    iget-object v2, p0, Lcom/daaw/io$j;->a:Lcom/daaw/io;

    iget v3, v2, Lcom/daaw/io;->l:I

    if-ltz v3, :cond_1

    invoke-static {v2}, Lcom/daaw/io;->e(Lcom/daaw/io;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v3, v2, :cond_1

    iget-object v1, p0, Lcom/daaw/io$j;->a:Lcom/daaw/io;

    invoke-static {v1}, Lcom/daaw/io;->e(Lcom/daaw/io;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/io$j;->a:Lcom/daaw/io;

    iget v2, v2, Lcom/daaw/io;->l:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ho$i;

    :cond_1
    iget-object v2, p0, Lcom/daaw/io$j;->a:Lcom/daaw/io;

    invoke-static {v2}, Lcom/daaw/io;->e(Lcom/daaw/io;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/ho$i;

    iget-object v3, p0, Lcom/daaw/io$j;->a:Lcom/daaw/io;

    invoke-static {v3}, Lcom/daaw/io;->e(Lcom/daaw/io;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    iget-object p1, p0, Lcom/daaw/io$j;->a:Lcom/daaw/io;

    invoke-static {p1}, Lcom/daaw/io;->e(Lcom/daaw/io;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/io$j;->a:Lcom/daaw/io;

    if-eqz v1, :cond_2

    invoke-static {p1}, Lcom/daaw/io;->e(Lcom/daaw/io;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p2

    goto :goto_0

    :cond_2
    const/4 p2, -0x1

    :goto_0
    iput p2, p1, Lcom/daaw/io;->l:I

    iget-object p1, p0, Lcom/daaw/io$j;->a:Lcom/daaw/io;

    invoke-static {p1}, Lcom/daaw/io;->e(Lcom/daaw/io;)Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2, v0}, Lcom/daaw/io;->f(Lcom/daaw/io;Ljava/util/List;Z)V

    return-void
.end method
