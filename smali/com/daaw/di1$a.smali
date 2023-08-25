.class public Lcom/daaw/di1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/n0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/di1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/view/ActionMode$Callback;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/daaw/di1;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/daaw/cd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cd1<",
            "Landroid/view/Menu;",
            "Landroid/view/Menu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/di1$a;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/di1$a;->a:Landroid/view/ActionMode$Callback;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/di1$a;->c:Ljava/util/ArrayList;

    new-instance p1, Lcom/daaw/cd1;

    invoke-direct {p1}, Lcom/daaw/cd1;-><init>()V

    iput-object p1, p0, Lcom/daaw/di1$a;->d:Lcom/daaw/cd1;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/n0;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/di1$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lcom/daaw/di1$a;->e(Lcom/daaw/n0;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-virtual {p0, p2}, Lcom/daaw/di1$a;->f(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(Lcom/daaw/n0;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/di1$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lcom/daaw/di1$a;->e(Lcom/daaw/n0;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-virtual {p0, p2}, Lcom/daaw/di1$a;->f(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public c(Lcom/daaw/n0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/di1$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lcom/daaw/di1$a;->e(Lcom/daaw/n0;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    return-void
.end method

.method public d(Lcom/daaw/n0;Landroid/view/MenuItem;)Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/di1$a;->a:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lcom/daaw/di1$a;->e(Lcom/daaw/n0;)Landroid/view/ActionMode;

    move-result-object p1

    new-instance v1, Lcom/daaw/jp0;

    iget-object v2, p0, Lcom/daaw/di1$a;->b:Landroid/content/Context;

    check-cast p2, Lcom/daaw/hi1;

    invoke-direct {v1, v2, p2}, Lcom/daaw/jp0;-><init>(Landroid/content/Context;Lcom/daaw/hi1;)V

    invoke-interface {v0, p1, v1}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public e(Lcom/daaw/n0;)Landroid/view/ActionMode;
    .locals 4

    iget-object v0, p0, Lcom/daaw/di1$a;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lcom/daaw/di1$a;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/di1;

    if-eqz v2, :cond_0

    iget-object v3, v2, Lcom/daaw/di1;->b:Lcom/daaw/n0;

    if-ne v3, p1, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/di1;

    iget-object v1, p0, Lcom/daaw/di1$a;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lcom/daaw/di1;-><init>(Landroid/content/Context;Lcom/daaw/n0;)V

    iget-object p1, p0, Lcom/daaw/di1$a;->c:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final f(Landroid/view/Menu;)Landroid/view/Menu;
    .locals 3

    iget-object v0, p0, Lcom/daaw/di1$a;->d:Lcom/daaw/cd1;

    invoke-virtual {v0, p1}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Menu;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/np0;

    iget-object v1, p0, Lcom/daaw/di1$a;->b:Landroid/content/Context;

    move-object v2, p1

    check-cast v2, Lcom/daaw/fi1;

    invoke-direct {v0, v1, v2}, Lcom/daaw/np0;-><init>(Landroid/content/Context;Lcom/daaw/fi1;)V

    iget-object v1, p0, Lcom/daaw/di1$a;->d:Lcom/daaw/cd1;

    invoke-virtual {v1, p1, v0}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method
