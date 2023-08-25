.class public Lcom/daaw/ye1$e;
.super Lcom/daaw/ye1$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ye1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/xe1$b;",
            ">;"
        }
    .end annotation
.end field

.field public f:I

.field public g:I

.field public h:J

.field public i:J

.field public j:J

.field public k:I

.field public l:Z

.field public m:Lcom/daaw/xe1$a;


# direct methods
.method public constructor <init>(Lcom/daaw/ye1$a;Ljava/lang/String;)V
    .locals 1

    const-string v0, "SmoothStreamingMedia"

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/ye1$a;-><init>(Lcom/daaw/ye1$a;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/ye1$e;->k:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/ye1$e;->m:Lcom/daaw/xe1$a;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/daaw/ye1$e;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Lcom/daaw/xe1$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ye1$e;->e:Ljava/util/List;

    check-cast p1, Lcom/daaw/xe1$b;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/daaw/xe1$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/ye1$e;->m:Lcom/daaw/xe1$a;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    check-cast p1, Lcom/daaw/xe1$a;

    iput-object p1, p0, Lcom/daaw/ye1$e;->m:Lcom/daaw/xe1$a;

    :cond_2
    :goto_1
    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lcom/daaw/ye1$e;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v13, v0, [Lcom/daaw/xe1$b;

    iget-object v1, p0, Lcom/daaw/ye1$e;->e:Ljava/util/List;

    invoke-interface {v1, v13}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/ye1$e;->m:Lcom/daaw/xe1$a;

    if-eqz v1, :cond_1

    new-instance v1, Lcom/google/android/exoplayer2/drm/DrmInitData;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;

    new-instance v3, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;

    iget-object v4, p0, Lcom/daaw/ye1$e;->m:Lcom/daaw/xe1$a;

    iget-object v5, v4, Lcom/daaw/xe1$a;->a:Ljava/util/UUID;

    iget-object v4, v4, Lcom/daaw/xe1$a;->b:[B

    const-string v6, "video/mp4"

    invoke-direct {v3, v5, v6, v4}, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/drm/DrmInitData;-><init>([Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, v13, v2

    const/4 v5, 0x0

    :goto_1
    iget-object v6, v3, Lcom/daaw/xe1$b;->j:[Lcom/google/android/exoplayer2/Format;

    array-length v7, v6

    if-ge v5, v7, :cond_0

    aget-object v7, v6, v5

    invoke-virtual {v7, v1}, Lcom/google/android/exoplayer2/Format;->b(Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/Format;

    move-result-object v7

    aput-object v7, v6, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/xe1;

    iget v2, p0, Lcom/daaw/ye1$e;->f:I

    iget v3, p0, Lcom/daaw/ye1$e;->g:I

    iget-wide v4, p0, Lcom/daaw/ye1$e;->h:J

    iget-wide v6, p0, Lcom/daaw/ye1$e;->i:J

    iget-wide v8, p0, Lcom/daaw/ye1$e;->j:J

    iget v10, p0, Lcom/daaw/ye1$e;->k:I

    iget-boolean v11, p0, Lcom/daaw/ye1$e;->l:Z

    iget-object v12, p0, Lcom/daaw/ye1$e;->m:Lcom/daaw/xe1$a;

    move-object v1, v0

    invoke-direct/range {v1 .. v13}, Lcom/daaw/xe1;-><init>(IIJJJIZLcom/daaw/xe1$a;[Lcom/daaw/xe1$b;)V

    return-object v0
.end method

.method public n(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 4

    const-string v0, "MajorVersion"

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ye1$a;->k(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/daaw/ye1$e;->f:I

    const-string v0, "MinorVersion"

    invoke-virtual {p0, p1, v0}, Lcom/daaw/ye1$a;->k(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/daaw/ye1$e;->g:I

    const-string v0, "TimeScale"

    const-wide/32 v1, 0x989680

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/daaw/ye1$a;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/daaw/ye1$e;->h:J

    const-string v1, "Duration"

    invoke-virtual {p0, p1, v1}, Lcom/daaw/ye1$a;->l(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/daaw/ye1$e;->i:J

    const-string v1, "DVRWindowLength"

    const-wide/16 v2, 0x0

    invoke-virtual {p0, p1, v1, v2, v3}, Lcom/daaw/ye1$a;->j(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;J)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/daaw/ye1$e;->j:J

    const-string v1, "LookaheadCount"

    const/4 v2, -0x1

    invoke-virtual {p0, p1, v1, v2}, Lcom/daaw/ye1$a;->i(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/daaw/ye1$e;->k:I

    const-string v1, "IsLive"

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v1, v2}, Lcom/daaw/ye1$a;->g(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/ye1$e;->l:Z

    iget-wide v1, p0, Lcom/daaw/ye1$e;->h:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/daaw/ye1$a;->p(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
