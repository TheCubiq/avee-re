.class public Lcom/daaw/jt1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/jt1$b;,
        Lcom/daaw/jt1$d;,
        Lcom/daaw/jt1$c;,
        Lcom/daaw/jt1$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/mt1;

.field public final b:Lcom/daaw/jt1$b;

.field public final c:Lcom/daaw/hn;


# direct methods
.method public constructor <init>(Lcom/daaw/mt1;Lcom/daaw/jt1$b;)V
    .locals 7

    const-string v0, "store"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/daaw/jt1;-><init>(Lcom/daaw/mt1;Lcom/daaw/jt1$b;Lcom/daaw/hn;ILcom/daaw/pq;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/mt1;Lcom/daaw/jt1$b;Lcom/daaw/hn;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jt1;->a:Lcom/daaw/mt1;

    iput-object p2, p0, Lcom/daaw/jt1;->b:Lcom/daaw/jt1$b;

    iput-object p3, p0, Lcom/daaw/jt1;->c:Lcom/daaw/hn;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/mt1;Lcom/daaw/jt1$b;Lcom/daaw/hn;ILcom/daaw/pq;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, Lcom/daaw/hn$a;->b:Lcom/daaw/hn$a;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/jt1;-><init>(Lcom/daaw/mt1;Lcom/daaw/jt1$b;Lcom/daaw/hn;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/nt1;Lcom/daaw/jt1$b;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/daaw/nt1;->g()Lcom/daaw/mt1;

    move-result-object v0

    const-string v1, "owner.viewModelStore"

    invoke-static {v0, v1}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/daaw/lt1;->a(Lcom/daaw/nt1;)Lcom/daaw/hn;

    move-result-object p1

    invoke-direct {p0, v0, p2, p1}, Lcom/daaw/jt1;-><init>(Lcom/daaw/mt1;Lcom/daaw/jt1$b;Lcom/daaw/hn;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/daaw/ht1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/daaw/ht1;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/daaw/jt1;->b(Ljava/lang/String;Ljava/lang/Class;)Lcom/daaw/ht1;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/Class;)Lcom/daaw/ht1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/daaw/ht1;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelClass"

    invoke-static {p2, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/jt1;->a:Lcom/daaw/mt1;

    invoke-virtual {v0, p1}, Lcom/daaw/mt1;->b(Ljava/lang/String;)Lcom/daaw/ht1;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, Lcom/daaw/jt1;->b:Lcom/daaw/jt1$b;

    instance-of p2, p1, Lcom/daaw/jt1$d;

    if-eqz p2, :cond_0

    check-cast p1, Lcom/daaw/jt1$d;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const-string p2, "viewModel"

    invoke-static {v0, p2}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/daaw/jt1$d;->a(Lcom/daaw/ht1;)V

    :cond_1
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    invoke-static {v0, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0

    :cond_2
    new-instance v0, Lcom/daaw/ir0;

    iget-object v1, p0, Lcom/daaw/jt1;->c:Lcom/daaw/hn;

    invoke-direct {v0, v1}, Lcom/daaw/ir0;-><init>(Lcom/daaw/hn;)V

    sget-object v1, Lcom/daaw/jt1$c;->c:Lcom/daaw/hn$b;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/ir0;->b(Lcom/daaw/hn$b;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/daaw/jt1;->b:Lcom/daaw/jt1$b;

    invoke-interface {v1, p2, v0}, Lcom/daaw/jt1$b;->b(Ljava/lang/Class;Lcom/daaw/hn;)Lcom/daaw/ht1;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/jt1;->a:Lcom/daaw/mt1;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/mt1;->d(Ljava/lang/String;Lcom/daaw/ht1;)V

    return-object p2
.end method
