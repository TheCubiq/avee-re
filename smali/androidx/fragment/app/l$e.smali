.class public Landroidx/fragment/app/l$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/l$e$b;,
        Landroidx/fragment/app/l$e$c;
    }
.end annotation


# instance fields
.field public a:Landroidx/fragment/app/l$e$c;

.field public b:Landroidx/fragment/app/l$e$b;

.field public final c:Landroidx/fragment/app/Fragment;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/daaw/wd;",
            ">;"
        }
    .end annotation
.end field

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/l$e$c;Landroidx/fragment/app/l$e$b;Landroidx/fragment/app/Fragment;Lcom/daaw/wd;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/l$e;->d:Ljava/util/List;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/l$e;->e:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/l$e;->f:Z

    iput-boolean v0, p0, Landroidx/fragment/app/l$e;->g:Z

    iput-object p1, p0, Landroidx/fragment/app/l$e;->a:Landroidx/fragment/app/l$e$c;

    iput-object p2, p0, Landroidx/fragment/app/l$e;->b:Landroidx/fragment/app/l$e$b;

    iput-object p3, p0, Landroidx/fragment/app/l$e;->c:Landroidx/fragment/app/Fragment;

    new-instance p1, Landroidx/fragment/app/l$e$a;

    invoke-direct {p1, p0}, Landroidx/fragment/app/l$e$a;-><init>(Landroidx/fragment/app/l$e;)V

    invoke-virtual {p4, p1}, Lcom/daaw/wd;->c(Lcom/daaw/wd$b;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/l$e;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/l$e;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/l$e;->f:Z

    iget-object v0, p0, Landroidx/fragment/app/l$e;->e:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/l$e;->c()V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/l$e;->e:Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/wd;

    invoke-virtual {v1}, Lcom/daaw/wd;->a()V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public c()V
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/l$e;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SpecialEffectsController: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " has called complete."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/l$e;->g:Z

    iget-object v0, p0, Landroidx/fragment/app/l$e;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final d(Lcom/daaw/wd;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/l$e;->e:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/l$e;->e:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/l$e;->c()V

    :cond_0
    return-void
.end method

.method public e()Landroidx/fragment/app/l$e$c;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/l$e;->a:Landroidx/fragment/app/l$e$c;

    return-object v0
.end method

.method public final f()Landroidx/fragment/app/Fragment;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/l$e;->c:Landroidx/fragment/app/Fragment;

    return-object v0
.end method

.method public g()Landroidx/fragment/app/l$e$b;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/l$e;->b:Landroidx/fragment/app/l$e$b;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/l$e;->f:Z

    return v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/l$e;->g:Z

    return v0
.end method

.method public final j(Lcom/daaw/wd;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/l$e;->l()V

    iget-object v0, p0, Landroidx/fragment/app/l$e;->e:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final k(Landroidx/fragment/app/l$e$c;Landroidx/fragment/app/l$e$b;)V
    .locals 4

    sget-object v0, Landroidx/fragment/app/l$c;->b:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    const-string v1, "SpecialEffectsController: For fragment "

    const/4 v2, 0x2

    if-eq p2, v0, :cond_4

    const-string v0, " mFinalState = "

    if-eq p2, v2, :cond_2

    const/4 v3, 0x3

    if-eq p2, v3, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object p2, p0, Landroidx/fragment/app/l$e;->a:Landroidx/fragment/app/l$e$c;

    sget-object v3, Landroidx/fragment/app/l$e$c;->p:Landroidx/fragment/app/l$e$c;

    if-eq p2, v3, :cond_6

    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->E0(I)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/l$e;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/l$e;->a:Landroidx/fragment/app/l$e$c;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " -> "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ". "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iput-object p1, p0, Landroidx/fragment/app/l$e;->a:Landroidx/fragment/app/l$e$c;

    goto :goto_1

    :cond_2
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->E0(I)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Landroidx/fragment/app/l$e;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Landroidx/fragment/app/l$e;->a:Landroidx/fragment/app/l$e$c;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " -> REMOVED. mLifecycleImpact  = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Landroidx/fragment/app/l$e;->b:Landroidx/fragment/app/l$e$b;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " to REMOVING."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    sget-object p1, Landroidx/fragment/app/l$e$c;->p:Landroidx/fragment/app/l$e$c;

    iput-object p1, p0, Landroidx/fragment/app/l$e;->a:Landroidx/fragment/app/l$e$c;

    sget-object p1, Landroidx/fragment/app/l$e$b;->r:Landroidx/fragment/app/l$e$b;

    :goto_0
    iput-object p1, p0, Landroidx/fragment/app/l$e;->b:Landroidx/fragment/app/l$e$b;

    goto :goto_1

    :cond_4
    iget-object p1, p0, Landroidx/fragment/app/l$e;->a:Landroidx/fragment/app/l$e$c;

    sget-object p2, Landroidx/fragment/app/l$e$c;->p:Landroidx/fragment/app/l$e$c;

    if-ne p1, p2, :cond_6

    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->E0(I)Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Landroidx/fragment/app/l$e;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Landroidx/fragment/app/l$e;->b:Landroidx/fragment/app/l$e$b;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " to ADDING."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    sget-object p1, Landroidx/fragment/app/l$e$c;->q:Landroidx/fragment/app/l$e$c;

    iput-object p1, p0, Landroidx/fragment/app/l$e;->a:Landroidx/fragment/app/l$e$c;

    sget-object p1, Landroidx/fragment/app/l$e$b;->q:Landroidx/fragment/app/l$e$b;

    goto :goto_0

    :cond_6
    :goto_1
    return-void
.end method

.method public l()V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Operation "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "} "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "mFinalState = "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/fragment/app/l$e;->a:Landroidx/fragment/app/l$e$c;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "mLifecycleImpact = "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/fragment/app/l$e;->b:Landroidx/fragment/app/l$e$b;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "mFragment = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/l$e;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
