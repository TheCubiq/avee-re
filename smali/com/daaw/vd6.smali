.class public final synthetic Lcom/daaw/vd6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/ae6;

.field public final synthetic b:Lcom/daaw/qk6;

.field public final synthetic c:Lcom/daaw/jn4;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ae6;Lcom/daaw/qk6;Lcom/daaw/jn4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vd6;->a:Lcom/daaw/ae6;

    iput-object p2, p0, Lcom/daaw/vd6;->b:Lcom/daaw/qk6;

    iput-object p3, p0, Lcom/daaw/vd6;->c:Lcom/daaw/jn4;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 5

    iget-object v0, p0, Lcom/daaw/vd6;->b:Lcom/daaw/qk6;

    iget-object v1, p0, Lcom/daaw/vd6;->c:Lcom/daaw/jn4;

    check-cast p1, Lcom/daaw/fi6;

    iput-object p1, v0, Lcom/daaw/qk6;->b:Lcom/daaw/fi6;

    iget-object v0, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v0, v0, Lcom/daaw/ei6;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/th6;

    iget-object v3, v3, Lcom/daaw/th6;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v4, "FirstPartyRenderer"

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/daaw/jn4;->i(Lcom/daaw/f77;)Lcom/daaw/f77;

    move-result-object p1

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x0

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    :goto_2
    return-object p1
.end method
