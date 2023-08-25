.class public final Lcom/daaw/oy8;
.super Lcom/daaw/ad2;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "internal.platform"

    invoke-direct {p0, v0}, Lcom/daaw/ad2;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/ad2;->q:Ljava/util/Map;

    new-instance v1, Lcom/daaw/hx8;

    const-string v2, "getVersion"

    invoke-direct {v1, p0, v2}, Lcom/daaw/hx8;-><init>(Lcom/daaw/oy8;Ljava/lang/String;)V

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/w07;Ljava/util/List;)Lcom/daaw/gl2;
    .locals 0

    sget-object p1, Lcom/daaw/gl2;->g:Lcom/daaw/gl2;

    return-object p1
.end method
