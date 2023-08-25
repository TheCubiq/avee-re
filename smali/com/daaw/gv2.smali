.class public final Lcom/daaw/gv2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/kw2;


# instance fields
.field public final p:[Lcom/daaw/kw2;


# direct methods
.method public constructor <init>([Lcom/daaw/kw2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gv2;->p:[Lcom/daaw/kw2;

    return-void
.end method


# virtual methods
.method public final a(J)Z
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/gv2;->zza()J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    iget-object v4, p0, Lcom/daaw/gv2;->p:[Lcom/daaw/kw2;

    array-length v5, v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v5, :cond_3

    aget-object v8, v4, v6

    invoke-interface {v8}, Lcom/daaw/kw2;->zza()J

    move-result-wide v9

    cmp-long v11, v9, v2

    if-nez v11, :cond_2

    invoke-interface {v8, p1, p2}, Lcom/daaw/kw2;->a(J)Z

    move-result v8

    or-int/2addr v7, v8

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    or-int/2addr v1, v7

    if-nez v7, :cond_0

    :goto_1
    return v1
.end method

.method public final zza()J
    .locals 12

    iget-object v0, p0, Lcom/daaw/gv2;->p:[Lcom/daaw/kw2;

    array-length v1, v0

    const-wide v2, 0x7fffffffffffffffL

    const/4 v4, 0x0

    move-wide v5, v2

    :goto_0
    const-wide/high16 v7, -0x8000000000000000L

    if-ge v4, v1, :cond_1

    aget-object v9, v0, v4

    invoke-interface {v9}, Lcom/daaw/kw2;->zza()J

    move-result-wide v9

    cmp-long v11, v9, v7

    if-eqz v11, :cond_0

    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    cmp-long v0, v5, v2

    if-nez v0, :cond_2

    return-wide v7

    :cond_2
    return-wide v5
.end method
