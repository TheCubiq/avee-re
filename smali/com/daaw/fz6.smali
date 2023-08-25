.class public final Lcom/daaw/fz6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/by6;

.field public final b:Lcom/daaw/ez6;


# direct methods
.method public constructor <init>(Lcom/daaw/ez6;)V
    .locals 1

    sget-object v0, Lcom/daaw/ay6;->q:Lcom/daaw/ay6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fz6;->b:Lcom/daaw/ez6;

    iput-object v0, p0, Lcom/daaw/fz6;->a:Lcom/daaw/by6;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/fz6;)Lcom/daaw/by6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fz6;->a:Lcom/daaw/by6;

    return-object p0
.end method

.method public static b(I)Lcom/daaw/fz6;
    .locals 2

    new-instance p0, Lcom/daaw/fz6;

    new-instance v0, Lcom/daaw/bz6;

    const/16 v1, 0xfa0

    invoke-direct {v0, v1}, Lcom/daaw/bz6;-><init>(I)V

    invoke-direct {p0, v0}, Lcom/daaw/fz6;-><init>(Lcom/daaw/ez6;)V

    return-object p0
.end method

.method public static c(Lcom/daaw/by6;)Lcom/daaw/fz6;
    .locals 2

    new-instance v0, Lcom/daaw/fz6;

    new-instance v1, Lcom/daaw/zy6;

    invoke-direct {v1, p0}, Lcom/daaw/zy6;-><init>(Lcom/daaw/by6;)V

    invoke-direct {v0, v1}, Lcom/daaw/fz6;-><init>(Lcom/daaw/ez6;)V

    return-object v0
.end method

.method public static synthetic e(Lcom/daaw/fz6;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/fz6;->g(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d(Ljava/lang/CharSequence;)Ljava/lang/Iterable;
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/cz6;

    invoke-direct {v0, p0, p1}, Lcom/daaw/cz6;-><init>(Lcom/daaw/fz6;Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public final f(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2

    invoke-virtual {p0, p1}, Lcom/daaw/fz6;->g(Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lcom/daaw/fz6;->b:Lcom/daaw/ez6;

    invoke-interface {v0, p0, p1}, Lcom/daaw/ez6;->a(Lcom/daaw/fz6;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object p1

    return-object p1
.end method
