.class public final Lcom/daaw/l81;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/l81$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/daaw/l81$a;


# instance fields
.field public final a:Lcom/daaw/m81;

.field public final b:Lcom/daaw/k81;

.field public c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/l81$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/l81$a;-><init>(Lcom/daaw/pq;)V

    sput-object v0, Lcom/daaw/l81;->d:Lcom/daaw/l81$a;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/m81;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/l81;->a:Lcom/daaw/m81;

    new-instance p1, Lcom/daaw/k81;

    invoke-direct {p1}, Lcom/daaw/k81;-><init>()V

    iput-object p1, p0, Lcom/daaw/l81;->b:Lcom/daaw/k81;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/m81;Lcom/daaw/pq;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/l81;-><init>(Lcom/daaw/m81;)V

    return-void
.end method

.method public static final a(Lcom/daaw/m81;)Lcom/daaw/l81;
    .locals 1

    sget-object v0, Lcom/daaw/l81;->d:Lcom/daaw/l81$a;

    invoke-virtual {v0, p0}, Lcom/daaw/l81$a;->a(Lcom/daaw/m81;)Lcom/daaw/l81;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Lcom/daaw/k81;
    .locals 1

    iget-object v0, p0, Lcom/daaw/l81;->b:Lcom/daaw/k81;

    return-object v0
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/l81;->a:Lcom/daaw/m81;

    invoke-interface {v0}, Lcom/daaw/sj0;->a()Landroidx/lifecycle/c;

    move-result-object v0

    const-string v1, "owner.lifecycle"

    invoke-static {v0, v1}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/lifecycle/c;->b()Landroidx/lifecycle/c$c;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/c$c;->q:Landroidx/lifecycle/c$c;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    new-instance v1, Landroidx/savedstate/Recreator;

    iget-object v2, p0, Lcom/daaw/l81;->a:Lcom/daaw/m81;

    invoke-direct {v1, v2}, Landroidx/savedstate/Recreator;-><init>(Lcom/daaw/m81;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/c;->a(Lcom/daaw/rj0;)V

    iget-object v1, p0, Lcom/daaw/l81;->b:Lcom/daaw/k81;

    invoke-virtual {v1, v0}, Lcom/daaw/k81;->e(Landroidx/lifecycle/c;)V

    iput-boolean v3, p0, Lcom/daaw/l81;->c:Z

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Restarter must be created only during owner\'s initialization stage"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/l81;->c:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/l81;->c()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/l81;->a:Lcom/daaw/m81;

    invoke-interface {v0}, Lcom/daaw/sj0;->a()Landroidx/lifecycle/c;

    move-result-object v0

    const-string v1, "owner.lifecycle"

    invoke-static {v0, v1}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/lifecycle/c;->b()Landroidx/lifecycle/c$c;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/c$c;->s:Landroidx/lifecycle/c$c;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/c$c;->a(Landroidx/lifecycle/c$c;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/daaw/l81;->b:Lcom/daaw/k81;

    invoke-virtual {v0, p1}, Lcom/daaw/k81;->f(Landroid/os/Bundle;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "performRestore cannot be called when owner is "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/lifecycle/c;->b()Landroidx/lifecycle/c$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "outBundle"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/l81;->b:Lcom/daaw/k81;

    invoke-virtual {v0, p1}, Lcom/daaw/k81;->g(Landroid/os/Bundle;)V

    return-void
.end method
