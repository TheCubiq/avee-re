.class public abstract Lcom/daaw/sx5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/p46;


# instance fields
.field public final a:Z

.field public final b:Ljava/util/ArrayList;

.field public c:I

.field public d:Lcom/daaw/pa6;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/daaw/sx5;->a:Z

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/sx5;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final c(I)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/sx5;->d:Lcom/daaw/pa6;

    sget v1, Lcom/daaw/it5;->a:I

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/daaw/sx5;->c:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/sx5;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/qz6;

    iget-boolean v3, p0, Lcom/daaw/sx5;->a:Z

    invoke-interface {v2, p0, v0, v3, p1}, Lcom/daaw/qz6;->D(Lcom/daaw/p46;Lcom/daaw/pa6;ZI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Lcom/daaw/qz6;)V
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/sx5;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/sx5;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget p1, p0, Lcom/daaw/sx5;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/daaw/sx5;->c:I

    :cond_0
    return-void
.end method

.method public final k()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/sx5;->d:Lcom/daaw/pa6;

    sget v1, Lcom/daaw/it5;->a:I

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcom/daaw/sx5;->c:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/sx5;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/qz6;

    iget-boolean v3, p0, Lcom/daaw/sx5;->a:Z

    invoke-interface {v2, p0, v0, v3}, Lcom/daaw/qz6;->a(Lcom/daaw/p46;Lcom/daaw/pa6;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/sx5;->d:Lcom/daaw/pa6;

    return-void
.end method

.method public final l(Lcom/daaw/pa6;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/daaw/sx5;->c:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/sx5;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/qz6;

    iget-boolean v2, p0, Lcom/daaw/sx5;->a:Z

    invoke-interface {v1, p0, p1, v2}, Lcom/daaw/qz6;->f(Lcom/daaw/p46;Lcom/daaw/pa6;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final m(Lcom/daaw/pa6;)V
    .locals 3

    iput-object p1, p0, Lcom/daaw/sx5;->d:Lcom/daaw/pa6;

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/daaw/sx5;->c:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/sx5;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/qz6;

    iget-boolean v2, p0, Lcom/daaw/sx5;->a:Z

    invoke-interface {v1, p0, p1, v2}, Lcom/daaw/qz6;->l(Lcom/daaw/p46;Lcom/daaw/pa6;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic zze()Ljava/util/Map;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
