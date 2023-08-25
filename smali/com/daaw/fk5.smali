.class public final Lcom/daaw/fk5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pt4;


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Lcom/daaw/ky3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/ky3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fk5;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/fk5;->q:Lcom/daaw/ky3;

    return-void
.end method


# virtual methods
.method public final F(Lcom/daaw/fi6;)V
    .locals 3

    iget-object v0, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v0, v0, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget-object v0, v0, Lcom/daaw/wh6;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/fk5;->q:Lcom/daaw/ky3;

    iget-object v1, p0, Lcom/daaw/fk5;->p:Landroid/content/Context;

    iget-object v2, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v2, v2, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v2, v2, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ky3;->u(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzl;)V

    iget-object v0, p0, Lcom/daaw/fk5;->q:Lcom/daaw/ky3;

    iget-object v1, p0, Lcom/daaw/fk5;->p:Landroid/content/Context;

    iget-object p1, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object p1, p1, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget-object p1, p1, Lcom/daaw/wh6;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/ky3;->q(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/ads/zzccb;)V
    .locals 0

    return-void
.end method
