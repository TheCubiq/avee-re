.class public Lcom/daaw/fl$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/fl;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/fl;


# direct methods
.method public constructor <init>(Lcom/daaw/fl;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fl$f;->a:Lcom/daaw/fl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/fl$f;->a:Lcom/daaw/fl;

    invoke-static {v1}, Lcom/daaw/fl;->c(Lcom/daaw/fl;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/sd0;

    sget-object v2, Lcom/daaw/el;->h:Lcom/daaw/qw1;

    invoke-virtual {v2, v1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/fl$f;->a:Lcom/daaw/fl;

    invoke-static {v0}, Lcom/daaw/fl;->c(Lcom/daaw/fl;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method
