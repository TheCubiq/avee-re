.class public Lcom/daaw/el$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/n0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/el;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/ch0;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Lcom/daaw/el;


# direct methods
.method public constructor <init>(Lcom/daaw/el;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/el$b;->b:Lcom/daaw/el;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/el$b;->a:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/el;Lcom/daaw/el$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/el$b;-><init>(Lcom/daaw/el;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/n0;Landroid/view/Menu;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public b(Lcom/daaw/n0;Landroid/view/Menu;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/el$b;->b:Lcom/daaw/el;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/el;->b(Lcom/daaw/el;Z)Z

    invoke-virtual {p1}, Lcom/daaw/n0;->f()Landroid/view/MenuInflater;

    move-result-object p1

    const/high16 v0, 0x7f0d0000

    invoke-virtual {p1, v0, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const p1, 0x7f090047

    invoke-interface {p2, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    const/4 p1, 0x1

    return p1
.end method

.method public c(Lcom/daaw/n0;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/el$b;->b:Lcom/daaw/el;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/el;->e(Lcom/daaw/el;Lcom/daaw/n0;)Lcom/daaw/n0;

    iget-object p1, p0, Lcom/daaw/el$b;->b:Lcom/daaw/el;

    invoke-static {p1}, Lcom/daaw/el;->a(Lcom/daaw/el;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/el$b;->b:Lcom/daaw/el;

    invoke-static {p1}, Lcom/daaw/el;->f(Lcom/daaw/el;)V

    :cond_0
    sget-object p1, Lcom/daaw/el;->f:Lcom/daaw/qw1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Lcom/daaw/n0;Landroid/view/MenuItem;)Z
    .locals 6

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const v3, 0x7f090047

    if-ne v0, v3, :cond_5

    invoke-interface {p2}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/SubMenu;->clear()V

    iget-object p2, p0, Lcom/daaw/el$b;->b:Lcom/daaw/el;

    invoke-static {p2}, Lcom/daaw/el;->c(Lcom/daaw/el;)Ljava/util/HashMap;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/HashMap;->size()I

    move-result p2

    iget-object v0, p0, Lcom/daaw/el$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-lez p2, :cond_3

    iget-object v0, p0, Lcom/daaw/el$b;->b:Lcom/daaw/el;

    invoke-static {v0}, Lcom/daaw/el;->d(Lcom/daaw/el;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/ch0;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " count: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, p2, :cond_0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/ch0;

    invoke-virtual {v4}, Lcom/daaw/ch0;->e()Z

    move-result v4

    if-eqz v4, :cond_0

    if-ne p2, v2, :cond_1

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/ch0;

    invoke-virtual {v4}, Lcom/daaw/ch0;->g()Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    if-le p2, v2, :cond_0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/ch0;

    invoke-virtual {v4}, Lcom/daaw/ch0;->f()Z

    move-result v4

    if-eqz v4, :cond_0

    :cond_2
    iget-object v4, p0, Lcom/daaw/el$b;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/ch0;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_1
    iget-object v0, p0, Lcom/daaw/el$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_4

    add-int/lit8 v0, p2, 0xa

    iget-object v3, p0, Lcom/daaw/el$b;->a:Ljava/util/List;

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/ch0;

    invoke-virtual {v3}, Lcom/daaw/ch0;->c()I

    move-result v3

    iget-object v4, p0, Lcom/daaw/el$b;->a:Ljava/util/List;

    invoke-interface {v4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/ch0;

    invoke-virtual {v4}, Lcom/daaw/ch0;->d()I

    move-result v4

    invoke-interface {p1, v1, v0, v3, v4}, Landroid/view/SubMenu;->add(IIII)Landroid/view/MenuItem;

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_4
    return v2

    :cond_5
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    add-int/lit8 p2, p2, -0xa

    if-ltz p2, :cond_7

    iget-object v0, p0, Lcom/daaw/el$b;->b:Lcom/daaw/el;

    invoke-static {v0}, Lcom/daaw/el;->d(Lcom/daaw/el;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-ge p2, v0, :cond_7

    sget-object v0, Lcom/daaw/el;->e:Lcom/daaw/vw1;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/al;

    if-eqz v0, :cond_6

    iget-object v3, p0, Lcom/daaw/el$b;->b:Lcom/daaw/el;

    iget-object v4, p0, Lcom/daaw/el$b;->a:Ljava/util/List;

    invoke-interface {v4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/ch0;

    invoke-virtual {v3, v0, p2}, Lcom/daaw/el;->i(Lcom/daaw/al;Lcom/daaw/ch0;)Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-virtual {p1}, Lcom/daaw/n0;->c()V

    return v2

    :cond_6
    const-string p1, "onRequestContextData returned null"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_7
    return v1
.end method
