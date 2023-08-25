.class public final Lcom/daaw/o73;
.super Lcom/daaw/ah2;
.source ""


# instance fields
.field public final synthetic D:[B

.field public final synthetic E:Ljava/util/Map;

.field public final synthetic F:Lcom/daaw/j04;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/util/zzbo;ILjava/lang/String;Lcom/daaw/vf2;Lcom/daaw/uf2;[BLjava/util/Map;Lcom/daaw/j04;)V
    .locals 0

    iput-object p6, p0, Lcom/daaw/o73;->D:[B

    iput-object p7, p0, Lcom/daaw/o73;->E:Ljava/util/Map;

    iput-object p8, p0, Lcom/daaw/o73;->F:Lcom/daaw/j04;

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/daaw/ah2;-><init>(ILjava/lang/String;Lcom/daaw/vf2;Lcom/daaw/uf2;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/ah2;->i(Ljava/lang/String;)V

    return-void
.end method

.method public final i(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/o73;->F:Lcom/daaw/j04;

    invoke-virtual {v0, p1}, Lcom/daaw/j04;->g(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/daaw/ah2;->i(Ljava/lang/String;)V

    return-void
.end method

.method public final zzl()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o73;->E:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final zzx()[B
    .locals 1

    iget-object v0, p0, Lcom/daaw/o73;->D:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method
