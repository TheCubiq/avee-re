.class public final Lcom/daaw/nf7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Ljava/util/Map;

.field public final c:Ljava/util/Map;

.field public final d:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/hf7;Lcom/daaw/mf7;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/util/HashMap;

    invoke-static {p1}, Lcom/daaw/hf7;->f(Lcom/daaw/hf7;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lcom/daaw/nf7;->a:Ljava/util/Map;

    new-instance p2, Ljava/util/HashMap;

    invoke-static {p1}, Lcom/daaw/hf7;->e(Lcom/daaw/hf7;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lcom/daaw/nf7;->b:Ljava/util/Map;

    new-instance p2, Ljava/util/HashMap;

    invoke-static {p1}, Lcom/daaw/hf7;->h(Lcom/daaw/hf7;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lcom/daaw/nf7;->c:Ljava/util/Map;

    new-instance p2, Ljava/util/HashMap;

    invoke-static {p1}, Lcom/daaw/hf7;->g(Lcom/daaw/hf7;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lcom/daaw/nf7;->d:Ljava/util/Map;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/nf7;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/daaw/nf7;->b:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/nf7;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/daaw/nf7;->a:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/nf7;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/daaw/nf7;->d:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/nf7;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/daaw/nf7;->c:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/daaw/gf7;Lcom/daaw/x97;)Lcom/daaw/m87;
    .locals 4
    .param p2    # Lcom/daaw/x97;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    new-instance v0, Lcom/daaw/jf7;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {p1}, Lcom/daaw/gf7;->zzd()Lcom/daaw/dq7;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/jf7;-><init>(Ljava/lang/Class;Lcom/daaw/dq7;Lcom/daaw/if7;)V

    iget-object v1, p0, Lcom/daaw/nf7;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/nf7;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/xd7;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/xd7;->a(Lcom/daaw/gf7;Lcom/daaw/x97;)Lcom/daaw/m87;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No Key Parser for requested key type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " available"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
