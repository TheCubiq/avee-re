.class public final Lcom/daaw/h81;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/k81$c;


# instance fields
.field public final a:Lcom/daaw/k81;

.field public b:Z

.field public c:Landroid/os/Bundle;

.field public final d:Lcom/daaw/wi0;


# direct methods
.method public constructor <init>(Lcom/daaw/k81;Lcom/daaw/nt1;)V
    .locals 1

    const-string v0, "savedStateRegistry"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModelStoreOwner"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/h81;->a:Lcom/daaw/k81;

    new-instance p1, Lcom/daaw/h81$a;

    invoke-direct {p1, p2}, Lcom/daaw/h81$a;-><init>(Lcom/daaw/nt1;)V

    invoke-static {p1}, Lcom/daaw/aj0;->a(Lcom/daaw/x40;)Lcom/daaw/wi0;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/h81;->d:Lcom/daaw/wi0;

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 5

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/daaw/h81;->c:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/h81;->b()Lcom/daaw/i81;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/i81;->e()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/f81;

    invoke-virtual {v2}, Lcom/daaw/f81;->c()Lcom/daaw/k81$c;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/k81$c;->a()Landroid/os/Bundle;

    move-result-object v2

    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    invoke-static {v2, v4}, Lcom/daaw/ug0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/h81;->b:Z

    return-object v0
.end method

.method public final b()Lcom/daaw/i81;
    .locals 1

    iget-object v0, p0, Lcom/daaw/h81;->d:Lcom/daaw/wi0;

    invoke-interface {v0}, Lcom/daaw/wi0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i81;

    return-object v0
.end method

.method public final c()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/h81;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/h81;->a:Lcom/daaw/k81;

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v0, v1}, Lcom/daaw/k81;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/h81;->c:Landroid/os/Bundle;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/h81;->b:Z

    invoke-virtual {p0}, Lcom/daaw/h81;->b()Lcom/daaw/i81;

    :cond_0
    return-void
.end method
