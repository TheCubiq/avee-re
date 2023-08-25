.class public Lcom/google/android/exoplayer2/drm/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/yu;
.implements Lcom/google/android/exoplayer2/drm/a$c;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/drm/c$b;,
        Lcom/google/android/exoplayer2/drm/c$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/daaw/nz;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/yu<",
        "TT;>;",
        "Lcom/google/android/exoplayer2/drm/a$c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/UUID;

.field public final b:Lcom/google/android/exoplayer2/drm/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/exoplayer2/drm/f<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lcom/google/android/exoplayer2/drm/g;

.field public final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Z

.field public final f:I

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/drm/a<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/drm/a<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public i:Landroid/os/Looper;

.field public j:I

.field public k:[B

.field public volatile l:Lcom/google/android/exoplayer2/drm/c$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/exoplayer2/drm/c<",
            "TT;>.b;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic g(Lcom/google/android/exoplayer2/drm/c;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/drm/c;->g:Ljava/util/List;

    return-object p0
.end method

.method public static i(Lcom/google/android/exoplayer2/drm/DrmInitData;Ljava/util/UUID;Z)Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Lcom/google/android/exoplayer2/drm/DrmInitData;->s:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget v3, p0, Lcom/google/android/exoplayer2/drm/DrmInitData;->s:I

    const/4 v4, 0x1

    if-ge v2, v3, :cond_4

    invoke-virtual {p0, v2}, Lcom/google/android/exoplayer2/drm/DrmInitData;->h(I)Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;->g(Ljava/util/UUID;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Lcom/daaw/dd;->d:Ljava/util/UUID;

    invoke-virtual {v5, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Lcom/daaw/dd;->c:Ljava/util/UUID;

    invoke-virtual {v3, v5}, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;->g(Ljava/util/UUID;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :cond_1
    :goto_1
    if-eqz v4, :cond_3

    iget-object v4, v3, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;->s:[B

    if-nez v4, :cond_2

    if-eqz p2, :cond_3

    :cond_2
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_5

    const/4 p0, 0x0

    return-object p0

    :cond_5
    sget-object p0, Lcom/daaw/dd;->e:Ljava/util/UUID;

    invoke-virtual {p0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9

    const/4 p0, 0x0

    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    if-ge p0, p1, :cond_9

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;->c()Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p1, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;->s:[B

    invoke-static {p2}, Lcom/daaw/d01;->f([B)I

    move-result p2

    goto :goto_3

    :cond_6
    const/4 p2, -0x1

    :goto_3
    sget v2, Lcom/daaw/sq1;->a:I

    const/16 v3, 0x17

    if-ge v2, v3, :cond_7

    if-nez p2, :cond_7

    return-object p1

    :cond_7
    if-lt v2, v3, :cond_8

    if-ne p2, v4, :cond_8

    return-object p1

    :cond_8
    add-int/lit8 p0, p0, 0x1

    goto :goto_2

    :cond_9
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;

    return-object p0
.end method

.method public static j(Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;Ljava/util/UUID;)[B
    .locals 2

    iget-object p0, p0, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;->s:[B

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_1

    invoke-static {p0, p1}, Lcom/daaw/d01;->d([BLjava/util/UUID;)[B

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, p1

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static k(Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;Ljava/util/UUID;)Ljava/lang/String;
    .locals 2

    iget-object p0, p0, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;->r:Ljava/lang/String;

    sget v0, Lcom/daaw/sq1;->a:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_1

    sget-object v0, Lcom/daaw/dd;->d:Ljava/util/UUID;

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "video/mp4"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "audio/mp4"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const-string p0, "cenc"

    :cond_1
    return-object p0
.end method


# virtual methods
.method public a(Landroid/os/Looper;Lcom/google/android/exoplayer2/drm/DrmInitData;)Lcom/google/android/exoplayer2/drm/d;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Looper;",
            "Lcom/google/android/exoplayer2/drm/DrmInitData;",
            ")",
            "Lcom/google/android/exoplayer2/drm/d<",
            "TT;>;"
        }
    .end annotation

    move-object v13, p0

    move-object/from16 v10, p1

    iget-object v0, v13, Lcom/google/android/exoplayer2/drm/c;->i:Landroid/os/Looper;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-ne v0, v10, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, v13, Lcom/google/android/exoplayer2/drm/c;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object v10, v13, Lcom/google/android/exoplayer2/drm/c;->i:Landroid/os/Looper;

    iget-object v0, v13, Lcom/google/android/exoplayer2/drm/c;->l:Lcom/google/android/exoplayer2/drm/c$b;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/exoplayer2/drm/c$b;

    invoke-direct {v0, p0, v10}, Lcom/google/android/exoplayer2/drm/c$b;-><init>(Lcom/google/android/exoplayer2/drm/c;Landroid/os/Looper;)V

    iput-object v0, v13, Lcom/google/android/exoplayer2/drm/c;->l:Lcom/google/android/exoplayer2/drm/c$b;

    :cond_2
    iget-object v0, v13, Lcom/google/android/exoplayer2/drm/c;->k:[B

    const/4 v2, 0x0

    if-nez v0, :cond_4

    iget-object v0, v13, Lcom/google/android/exoplayer2/drm/c;->a:Ljava/util/UUID;

    move-object/from16 v3, p2

    invoke-static {v3, v0, v1}, Lcom/google/android/exoplayer2/drm/c;->i(Lcom/google/android/exoplayer2/drm/DrmInitData;Ljava/util/UUID;Z)Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v3, v13, Lcom/google/android/exoplayer2/drm/c;->a:Ljava/util/UUID;

    invoke-static {v0, v3}, Lcom/google/android/exoplayer2/drm/c;->j(Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;Ljava/util/UUID;)[B

    move-result-object v3

    iget-object v4, v13, Lcom/google/android/exoplayer2/drm/c;->a:Ljava/util/UUID;

    invoke-static {v0, v4}, Lcom/google/android/exoplayer2/drm/c;->k(Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    move-object v4, v3

    goto :goto_2

    :cond_3
    new-instance v0, Lcom/google/android/exoplayer2/drm/c$c;

    iget-object v1, v13, Lcom/google/android/exoplayer2/drm/c;->a:Ljava/util/UUID;

    invoke-direct {v0, v1, v2}, Lcom/google/android/exoplayer2/drm/c$c;-><init>(Ljava/util/UUID;Lcom/google/android/exoplayer2/drm/c$a;)V

    throw v2

    :cond_4
    move-object v4, v2

    move-object v5, v4

    :goto_2
    iget-boolean v0, v13, Lcom/google/android/exoplayer2/drm/c;->e:Z

    if-nez v0, :cond_6

    iget-object v0, v13, Lcom/google/android/exoplayer2/drm/c;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    iget-object v0, v13, Lcom/google/android/exoplayer2/drm/c;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/drm/a;

    move-object v2, v0

    goto :goto_3

    :cond_6
    iget-object v0, v13, Lcom/google/android/exoplayer2/drm/c;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/drm/a;

    invoke-virtual {v1, v4}, Lcom/google/android/exoplayer2/drm/a;->j([B)Z

    move-result v3

    if-eqz v3, :cond_7

    move-object v2, v1

    :cond_8
    :goto_3
    if-nez v2, :cond_9

    new-instance v14, Lcom/google/android/exoplayer2/drm/a;

    iget-object v1, v13, Lcom/google/android/exoplayer2/drm/c;->a:Ljava/util/UUID;

    iget-object v2, v13, Lcom/google/android/exoplayer2/drm/c;->b:Lcom/google/android/exoplayer2/drm/f;

    iget v6, v13, Lcom/google/android/exoplayer2/drm/c;->j:I

    iget-object v7, v13, Lcom/google/android/exoplayer2/drm/c;->k:[B

    iget-object v8, v13, Lcom/google/android/exoplayer2/drm/c;->d:Ljava/util/HashMap;

    iget-object v9, v13, Lcom/google/android/exoplayer2/drm/c;->c:Lcom/google/android/exoplayer2/drm/g;

    const/4 v11, 0x0

    iget v12, v13, Lcom/google/android/exoplayer2/drm/c;->f:I

    move-object v0, v14

    move-object v3, p0

    move-object/from16 v10, p1

    invoke-direct/range {v0 .. v12}, Lcom/google/android/exoplayer2/drm/a;-><init>(Ljava/util/UUID;Lcom/google/android/exoplayer2/drm/f;Lcom/google/android/exoplayer2/drm/a$c;[BLjava/lang/String;I[BLjava/util/HashMap;Lcom/google/android/exoplayer2/drm/g;Landroid/os/Looper;Lcom/google/android/exoplayer2/drm/b$a;I)V

    iget-object v0, v13, Lcom/google/android/exoplayer2/drm/c;->g:Ljava/util/List;

    invoke-interface {v0, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v2, v14

    :cond_9
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/drm/a;->g()V

    return-object v2
.end method

.method public b(Lcom/google/android/exoplayer2/drm/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/drm/a<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/c;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/c;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/drm/a;->w()V

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/c;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/drm/a;

    invoke-virtual {v1, p1}, Lcom/google/android/exoplayer2/drm/a;->s(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/drm/c;->h:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public d(Lcom/google/android/exoplayer2/drm/DrmInitData;)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/c;->k:[B

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/c;->a:Ljava/util/UUID;

    invoke-static {p1, v0, v1}, Lcom/google/android/exoplayer2/drm/c;->i(Lcom/google/android/exoplayer2/drm/DrmInitData;Ljava/util/UUID;Z)Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_2

    iget v0, p1, Lcom/google/android/exoplayer2/drm/DrmInitData;->s:I

    if-ne v0, v1, :cond_1

    invoke-virtual {p1, v2}, Lcom/google/android/exoplayer2/drm/DrmInitData;->h(I)Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;

    move-result-object v0

    sget-object v3, Lcom/daaw/dd;->c:Ljava/util/UUID;

    invoke-virtual {v0, v3}, Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;->g(Ljava/util/UUID;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DrmInitData only contains common PSSH SchemeData. Assuming support for: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/android/exoplayer2/drm/c;->a:Ljava/util/UUID;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    :goto_0
    iget-object p1, p1, Lcom/google/android/exoplayer2/drm/DrmInitData;->r:Ljava/lang/String;

    if-eqz p1, :cond_7

    const-string v0, "cenc"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "cbc1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "cbcs"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "cens"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    return v1

    :cond_5
    :goto_1
    sget p1, Lcom/daaw/sq1;->a:I

    const/16 v0, 0x19

    if-lt p1, v0, :cond_6

    goto :goto_2

    :cond_6
    const/4 v1, 0x0

    :cond_7
    :goto_2
    return v1
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/c;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/exoplayer2/drm/a;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/drm/a;->r()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/c;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public f(Lcom/google/android/exoplayer2/drm/d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/drm/d<",
            "TT;>;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/google/android/exoplayer2/drm/e;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    check-cast p1, Lcom/google/android/exoplayer2/drm/a;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/drm/a;->x()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/c;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/c;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/c;->h:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_1

    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/c;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/drm/a;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/drm/a;->w()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/drm/c;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final h(Landroid/os/Handler;Lcom/google/android/exoplayer2/drm/b;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
