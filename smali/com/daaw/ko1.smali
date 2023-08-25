.class public final Lcom/daaw/ko1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/th1;


# instance fields
.field public final p:Lcom/daaw/go1;

.field public final q:[J

.field public final r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/daaw/jo1;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/daaw/ho1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/go1;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/go1;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/daaw/jo1;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/daaw/ho1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ko1;->p:Lcom/daaw/go1;

    iput-object p3, p0, Lcom/daaw/ko1;->s:Ljava/util/Map;

    if-eqz p2, :cond_0

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lcom/daaw/ko1;->r:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/daaw/go1;->j()[J

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ko1;->q:[J

    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 2

    iget-object v0, p0, Lcom/daaw/ko1;->q:[J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1, v1}, Lcom/daaw/sq1;->c([JJZZ)I

    move-result p1

    iget-object p2, p0, Lcom/daaw/ko1;->q:[J

    array-length p2, p2

    if-ge p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public b(I)J
    .locals 3

    iget-object v0, p0, Lcom/daaw/ko1;->q:[J

    aget-wide v1, v0, p1

    return-wide v1
.end method

.method public c(J)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lcom/daaw/ln;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/ko1;->p:Lcom/daaw/go1;

    iget-object v1, p0, Lcom/daaw/ko1;->r:Ljava/util/Map;

    iget-object v2, p0, Lcom/daaw/ko1;->s:Ljava/util/Map;

    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/daaw/go1;->h(JLjava/util/Map;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ko1;->q:[J

    array-length v0, v0

    return v0
.end method
