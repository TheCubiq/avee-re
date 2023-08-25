.class public final synthetic Lcom/daaw/yi6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# instance fields
.field public final synthetic a:Lcom/daaw/vy4;

.field public final synthetic b:Lcom/daaw/op6;

.field public final synthetic c:Lcom/daaw/cq5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/vy4;Lcom/daaw/op6;Lcom/daaw/cq5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/yi6;->a:Lcom/daaw/vy4;

    iput-object p2, p0, Lcom/daaw/yi6;->b:Lcom/daaw/op6;

    iput-object p3, p0, Lcom/daaw/yi6;->c:Lcom/daaw/cq5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/yi6;->a:Lcom/daaw/vy4;

    iget-object v1, p0, Lcom/daaw/yi6;->b:Lcom/daaw/op6;

    iget-object v2, p0, Lcom/daaw/yi6;->c:Lcom/daaw/cq5;

    check-cast p1, Lcom/daaw/a74;

    invoke-static {p2, v0}, Lcom/daaw/yg3;->d(Ljava/util/Map;Lcom/daaw/vy4;)V

    const-string v0, "u"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_0

    const-string p1, "URL missing from click GMSG."

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p1, p2}, Lcom/daaw/yg3;->b(Lcom/daaw/a74;Ljava/lang/String;)Lcom/daaw/f77;

    move-result-object p2

    new-instance v0, Lcom/daaw/zi6;

    invoke-direct {v0, p1, v1, v2}, Lcom/daaw/zi6;-><init>(Lcom/daaw/a74;Lcom/daaw/op6;Lcom/daaw/cq5;)V

    sget-object p1, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {p2, v0, p1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method
