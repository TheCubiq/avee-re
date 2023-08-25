.class public final synthetic Lcom/daaw/xi6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# instance fields
.field public final synthetic a:Lcom/daaw/op6;

.field public final synthetic b:Lcom/daaw/cq5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/op6;Lcom/daaw/cq5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xi6;->a:Lcom/daaw/op6;

    iput-object p2, p0, Lcom/daaw/xi6;->b:Lcom/daaw/cq5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/xi6;->a:Lcom/daaw/op6;

    iget-object v1, p0, Lcom/daaw/xi6;->b:Lcom/daaw/cq5;

    check-cast p1, Lcom/daaw/r64;

    const-string v2, "u"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v6, p2

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_0

    const-string p1, "URL missing from httpTrack GMSG."

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lcom/daaw/r64;->d()Lcom/daaw/th6;

    move-result-object p2

    iget-boolean p2, p2, Lcom/daaw/th6;->k0:Z

    if-nez p2, :cond_1

    const/4 p1, 0x0

    invoke-virtual {v0, v6, p1}, Lcom/daaw/op6;->c(Ljava/lang/String;Lcom/daaw/to6;)V

    return-void

    :cond_1
    new-instance p2, Lcom/daaw/eq5;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v3

    check-cast p1, Lcom/daaw/a84;

    invoke-interface {p1}, Lcom/daaw/a84;->v()Lcom/daaw/wh6;

    move-result-object p1

    iget-object v5, p1, Lcom/daaw/wh6;->b:Ljava/lang/String;

    const/4 v7, 0x2

    move-object v2, p2

    invoke-direct/range {v2 .. v7}, Lcom/daaw/eq5;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v1, p2}, Lcom/daaw/cq5;->u(Lcom/daaw/eq5;)V

    return-void
.end method
