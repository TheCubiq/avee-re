.class public final Lcom/daaw/rh7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public b:Lcom/daaw/oh7;

.field public c:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/rh7;->a:Ljava/util/ArrayList;

    sget-object v0, Lcom/daaw/oh7;->b:Lcom/daaw/oh7;

    iput-object v0, p0, Lcom/daaw/rh7;->b:Lcom/daaw/oh7;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/rh7;->c:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/v87;ILcom/daaw/l97;)Lcom/daaw/rh7;
    .locals 3

    iget-object v0, p0, Lcom/daaw/rh7;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/th7;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, p3, v2}, Lcom/daaw/th7;-><init>(Lcom/daaw/v87;ILcom/daaw/l97;Lcom/daaw/sh7;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "addEntry cannot be called after build()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Lcom/daaw/oh7;)Lcom/daaw/rh7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rh7;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lcom/daaw/rh7;->b:Lcom/daaw/oh7;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setAnnotations cannot be called after build()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(I)Lcom/daaw/rh7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rh7;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rh7;->c:Ljava/lang/Integer;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setPrimaryKeyId cannot be called after build()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d()Lcom/daaw/vh7;
    .locals 5

    iget-object v0, p0, Lcom/daaw/rh7;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/rh7;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/rh7;->a:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    add-int/lit8 v4, v3, 0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/th7;

    invoke-virtual {v3}, Lcom/daaw/th7;->a()I

    move-result v3

    if-eq v3, v0, :cond_1

    move v3, v4

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "primary key ID is not present in entries"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/daaw/vh7;

    iget-object v1, p0, Lcom/daaw/rh7;->b:Lcom/daaw/oh7;

    iget-object v2, p0, Lcom/daaw/rh7;->a:Ljava/util/ArrayList;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/rh7;->c:Ljava/lang/Integer;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/vh7;-><init>(Lcom/daaw/oh7;Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/uh7;)V

    iput-object v4, p0, Lcom/daaw/rh7;->a:Ljava/util/ArrayList;

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cannot call build() twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method
