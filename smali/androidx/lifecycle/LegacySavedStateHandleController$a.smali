.class public final Landroidx/lifecycle/LegacySavedStateHandleController$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/k81$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/LegacySavedStateHandleController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/m81;)V
    .locals 5

    instance-of v0, p1, Lcom/daaw/nt1;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/daaw/nt1;

    invoke-interface {v0}, Lcom/daaw/nt1;->g()Lcom/daaw/mt1;

    move-result-object v0

    invoke-interface {p1}, Lcom/daaw/m81;->i()Lcom/daaw/k81;

    move-result-object v1

    invoke-virtual {v0}, Lcom/daaw/mt1;->c()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/daaw/mt1;->b(Ljava/lang/String;)Lcom/daaw/ht1;

    move-result-object v3

    invoke-interface {p1}, Lcom/daaw/sj0;->a()Landroidx/lifecycle/c;

    move-result-object v4

    invoke-static {v3, v1, v4}, Landroidx/lifecycle/LegacySavedStateHandleController;->a(Lcom/daaw/ht1;Lcom/daaw/k81;Landroidx/lifecycle/c;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/mt1;->c()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    const-class p1, Landroidx/lifecycle/LegacySavedStateHandleController$a;

    invoke-virtual {v1, p1}, Lcom/daaw/k81;->i(Ljava/lang/Class;)V

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
