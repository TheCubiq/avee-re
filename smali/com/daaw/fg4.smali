.class public final Lcom/daaw/fg4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/oq4;


# instance fields
.field public final p:Lcom/daaw/wh6;

.field public final q:Lcom/daaw/fi6;

.field public final r:Lcom/daaw/kp6;

.field public final s:Lcom/daaw/op6;


# direct methods
.method public constructor <init>(Lcom/daaw/fi6;Lcom/daaw/op6;Lcom/daaw/kp6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fg4;->q:Lcom/daaw/fi6;

    iput-object p2, p0, Lcom/daaw/fg4;->s:Lcom/daaw/op6;

    iput-object p3, p0, Lcom/daaw/fg4;->r:Lcom/daaw/kp6;

    iget-object p1, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object p1, p1, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iput-object p1, p0, Lcom/daaw/fg4;->p:Lcom/daaw/wh6;

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 4

    iget-object p1, p0, Lcom/daaw/fg4;->s:Lcom/daaw/op6;

    iget-object v0, p0, Lcom/daaw/fg4;->r:Lcom/daaw/kp6;

    iget-object v1, p0, Lcom/daaw/fg4;->q:Lcom/daaw/fi6;

    iget-object v2, p0, Lcom/daaw/fg4;->p:Lcom/daaw/wh6;

    iget-object v2, v2, Lcom/daaw/wh6;->a:Ljava/util/List;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Lcom/daaw/kp6;->c(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/op6;->d(Ljava/util/List;)V

    return-void
.end method
