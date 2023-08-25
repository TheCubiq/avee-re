.class public final Lcom/daaw/yt2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/hu2;

.field public final b:Lcom/daaw/ws2;

.field public c:Lcom/daaw/fu2;

.field public d:Lcom/daaw/vt2;

.field public e:I

.field public f:I

.field public g:I

.field public h:Lcom/daaw/vs2;

.field public i:Lcom/daaw/gu2;


# direct methods
.method public constructor <init>(Lcom/daaw/ws2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/hu2;

    invoke-direct {v0}, Lcom/daaw/hu2;-><init>()V

    iput-object v0, p0, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    iput-object p1, p0, Lcom/daaw/yt2;->b:Lcom/daaw/ws2;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fu2;Lcom/daaw/vt2;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/yt2;->c:Lcom/daaw/fu2;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/yt2;->d:Lcom/daaw/vt2;

    iget-object p2, p0, Lcom/daaw/yt2;->b:Lcom/daaw/ws2;

    iget-object p1, p1, Lcom/daaw/fu2;->f:Lcom/google/android/gms/internal/ads/zzatd;

    invoke-interface {p2, p1}, Lcom/daaw/ws2;->a(Lcom/google/android/gms/internal/ads/zzatd;)V

    invoke-virtual {p0}, Lcom/daaw/yt2;->b()V

    return-void
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/yt2;->a:Lcom/daaw/hu2;

    const/4 v1, 0x0

    iput v1, v0, Lcom/daaw/hu2;->d:I

    const-wide/16 v2, 0x0

    iput-wide v2, v0, Lcom/daaw/hu2;->r:J

    iput-boolean v1, v0, Lcom/daaw/hu2;->l:Z

    iput-boolean v1, v0, Lcom/daaw/hu2;->q:Z

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/daaw/hu2;->n:Lcom/daaw/gu2;

    iput v1, p0, Lcom/daaw/yt2;->e:I

    iput v1, p0, Lcom/daaw/yt2;->g:I

    iput v1, p0, Lcom/daaw/yt2;->f:I

    iput-object v2, p0, Lcom/daaw/yt2;->h:Lcom/daaw/vs2;

    iput-object v2, p0, Lcom/daaw/yt2;->i:Lcom/daaw/gu2;

    return-void
.end method
