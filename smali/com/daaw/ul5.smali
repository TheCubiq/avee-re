.class public final Lcom/daaw/ul5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/pl5;

.field public final c:Lcom/daaw/en6;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/pl5;Lcom/daaw/en6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ul5;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/ul5;->b:Lcom/daaw/pl5;

    iput-object p3, p0, Lcom/daaw/ul5;->c:Lcom/daaw/en6;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/rl5;

    invoke-direct {v1, p1}, Lcom/daaw/rl5;-><init>(Lcom/google/android/gms/internal/ads/zzccb;)V

    iget-object v2, p0, Lcom/daaw/ul5;->a:Lcom/daaw/g77;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ul5;->c:Lcom/daaw/en6;

    sget-object v2, Lcom/daaw/ym6;->u:Lcom/daaw/ym6;

    invoke-virtual {v1, v2, v0}, Lcom/daaw/wm6;->b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ul5;->b:Lcom/daaw/pl5;

    new-instance v2, Lcom/daaw/sl5;

    invoke-direct {v2, v1}, Lcom/daaw/sl5;-><init>(Lcom/daaw/pl5;)V

    invoke-virtual {v0, v2}, Lcom/daaw/vm6;->f(Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object v0

    new-instance v1, Lcom/daaw/tl5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/tl5;-><init>(Lcom/daaw/ul5;Lcom/google/android/gms/internal/ads/zzccb;)V

    iget-object p1, p0, Lcom/daaw/ul5;->a:Lcom/daaw/g77;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
