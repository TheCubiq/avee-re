.class public final Lcom/daaw/vh8;
.super Lcom/daaw/ad2;
.source ""


# instance fields
.field public final r:Lcom/daaw/ck8;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/daaw/ck8;)V
    .locals 2

    const-string p1, "internal.remoteConfig"

    invoke-direct {p0, p1}, Lcom/daaw/ad2;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/daaw/vh8;->r:Lcom/daaw/ck8;

    iget-object p1, p0, Lcom/daaw/ad2;->q:Ljava/util/Map;

    new-instance v0, Lcom/daaw/if8;

    const-string v1, "getValue"

    invoke-direct {v0, p0, v1, p2}, Lcom/daaw/if8;-><init>(Lcom/daaw/vh8;Ljava/lang/String;Lcom/daaw/ck8;)V

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/w07;Ljava/util/List;)Lcom/daaw/gl2;
    .locals 0

    sget-object p1, Lcom/daaw/gl2;->g:Lcom/daaw/gl2;

    return-object p1
.end method
