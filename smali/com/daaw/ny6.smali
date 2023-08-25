.class public final Lcom/daaw/ny6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/p46;


# instance fields
.field public final a:Lcom/daaw/p46;

.field public b:J

.field public c:Landroid/net/Uri;

.field public d:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/daaw/p46;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/ny6;->a:Lcom/daaw/p46;

    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object p1, p0, Lcom/daaw/ny6;->c:Landroid/net/Uri;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ny6;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a([BII)I
    .locals 2

    iget-object v0, p0, Lcom/daaw/ny6;->a:Lcom/daaw/p46;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/xp8;->a([BII)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    iget-wide p2, p0, Lcom/daaw/ny6;->b:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lcom/daaw/ny6;->b:J

    :cond_0
    return p1
.end method

.method public final d(Lcom/daaw/qz6;)V
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/ny6;->a:Lcom/daaw/p46;

    invoke-interface {v0, p1}, Lcom/daaw/p46;->d(Lcom/daaw/qz6;)V

    return-void
.end method

.method public final g(Lcom/daaw/pa6;)J
    .locals 2

    iget-object v0, p1, Lcom/daaw/pa6;->a:Landroid/net/Uri;

    iput-object v0, p0, Lcom/daaw/ny6;->c:Landroid/net/Uri;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ny6;->d:Ljava/util/Map;

    iget-object v0, p0, Lcom/daaw/ny6;->a:Lcom/daaw/p46;

    invoke-interface {v0, p1}, Lcom/daaw/p46;->g(Lcom/daaw/pa6;)J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/daaw/ny6;->zzc()Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/ny6;->c:Landroid/net/Uri;

    invoke-virtual {p0}, Lcom/daaw/ny6;->zze()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ny6;->d:Ljava/util/Map;

    return-wide v0
.end method

.method public final k()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/ny6;->b:J

    return-wide v0
.end method

.method public final l()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ny6;->c:Landroid/net/Uri;

    return-object v0
.end method

.method public final m()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ny6;->d:Ljava/util/Map;

    return-object v0
.end method

.method public final zzc()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ny6;->a:Lcom/daaw/p46;

    invoke-interface {v0}, Lcom/daaw/p46;->zzc()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ny6;->a:Lcom/daaw/p46;

    invoke-interface {v0}, Lcom/daaw/p46;->zzd()V

    return-void
.end method

.method public final zze()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ny6;->a:Lcom/daaw/p46;

    invoke-interface {v0}, Lcom/daaw/p46;->zze()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
