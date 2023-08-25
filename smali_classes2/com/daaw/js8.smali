.class public final Lcom/daaw/js8;
.super Lcom/daaw/ad2;
.source ""


# instance fields
.field public final r:Lcom/daaw/zp8;


# direct methods
.method public constructor <init>(Lcom/daaw/zp8;)V
    .locals 5

    const-string v0, "internal.logger"

    invoke-direct {p0, v0}, Lcom/daaw/ad2;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/js8;->r:Lcom/daaw/zp8;

    iget-object p1, p0, Lcom/daaw/ad2;->q:Ljava/util/Map;

    new-instance v0, Lcom/daaw/er8;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2}, Lcom/daaw/er8;-><init>(Lcom/daaw/js8;ZZ)V

    const-string v3, "log"

    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/daaw/ad2;->q:Ljava/util/Map;

    new-instance v0, Lcom/daaw/qm8;

    const-string v4, "silent"

    invoke-direct {v0, p0, v4}, Lcom/daaw/qm8;-><init>(Lcom/daaw/js8;Ljava/lang/String;)V

    invoke-interface {p1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/daaw/ad2;->q:Ljava/util/Map;

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ad2;

    new-instance v0, Lcom/daaw/er8;

    invoke-direct {v0, p0, v2, v2}, Lcom/daaw/er8;-><init>(Lcom/daaw/js8;ZZ)V

    invoke-virtual {p1, v3, v0}, Lcom/daaw/ad2;->h(Ljava/lang/String;Lcom/daaw/gl2;)V

    iget-object p1, p0, Lcom/daaw/ad2;->q:Ljava/util/Map;

    new-instance v0, Lcom/daaw/oo8;

    const-string v2, "unmonitored"

    invoke-direct {v0, p0, v2}, Lcom/daaw/oo8;-><init>(Lcom/daaw/js8;Ljava/lang/String;)V

    invoke-interface {p1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/daaw/ad2;->q:Ljava/util/Map;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ad2;

    new-instance v0, Lcom/daaw/er8;

    invoke-direct {v0, p0, v1, v1}, Lcom/daaw/er8;-><init>(Lcom/daaw/js8;ZZ)V

    invoke-virtual {p1, v3, v0}, Lcom/daaw/ad2;->h(Ljava/lang/String;Lcom/daaw/gl2;)V

    return-void
.end method

.method public static bridge synthetic c(Lcom/daaw/js8;)Lcom/daaw/zp8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/js8;->r:Lcom/daaw/zp8;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/daaw/w07;Ljava/util/List;)Lcom/daaw/gl2;
    .locals 0

    sget-object p1, Lcom/daaw/gl2;->g:Lcom/daaw/gl2;

    return-object p1
.end method
