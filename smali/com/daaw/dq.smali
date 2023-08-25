.class public Lcom/daaw/dq;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/dq$b;,
        Lcom/daaw/dq$a;,
        Lcom/daaw/dq$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        "Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final m:Lcom/daaw/dq$b;


# instance fields
.field public final a:Lcom/daaw/ix;

.field public final b:I

.field public final c:I

.field public final d:Lcom/daaw/ip;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ip<",
            "TA;>;"
        }
    .end annotation
.end field

.field public final e:Lcom/daaw/jp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/jp<",
            "TA;TT;>;"
        }
    .end annotation
.end field

.field public final f:Lcom/daaw/cn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cn1<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final g:Lcom/daaw/i51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/i51<",
            "TT;TZ;>;"
        }
    .end annotation
.end field

.field public final h:Lcom/daaw/dq$a;

.field public final i:Lcom/daaw/wt;

.field public final j:Lcom/daaw/dz0;

.field public final k:Lcom/daaw/dq$b;

.field public volatile l:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/dq$b;

    invoke-direct {v0}, Lcom/daaw/dq$b;-><init>()V

    sput-object v0, Lcom/daaw/dq;->m:Lcom/daaw/dq$b;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/ix;IILcom/daaw/ip;Lcom/daaw/jp;Lcom/daaw/cn1;Lcom/daaw/i51;Lcom/daaw/dq$a;Lcom/daaw/wt;Lcom/daaw/dz0;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ix;",
            "II",
            "Lcom/daaw/ip<",
            "TA;>;",
            "Lcom/daaw/jp<",
            "TA;TT;>;",
            "Lcom/daaw/cn1<",
            "TT;>;",
            "Lcom/daaw/i51<",
            "TT;TZ;>;",
            "Lcom/daaw/dq$a;",
            "Lcom/daaw/wt;",
            "Lcom/daaw/dz0;",
            ")V"
        }
    .end annotation

    sget-object v11, Lcom/daaw/dq;->m:Lcom/daaw/dq$b;

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v11}, Lcom/daaw/dq;-><init>(Lcom/daaw/ix;IILcom/daaw/ip;Lcom/daaw/jp;Lcom/daaw/cn1;Lcom/daaw/i51;Lcom/daaw/dq$a;Lcom/daaw/wt;Lcom/daaw/dz0;Lcom/daaw/dq$b;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/ix;IILcom/daaw/ip;Lcom/daaw/jp;Lcom/daaw/cn1;Lcom/daaw/i51;Lcom/daaw/dq$a;Lcom/daaw/wt;Lcom/daaw/dz0;Lcom/daaw/dq$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ix;",
            "II",
            "Lcom/daaw/ip<",
            "TA;>;",
            "Lcom/daaw/jp<",
            "TA;TT;>;",
            "Lcom/daaw/cn1<",
            "TT;>;",
            "Lcom/daaw/i51<",
            "TT;TZ;>;",
            "Lcom/daaw/dq$a;",
            "Lcom/daaw/wt;",
            "Lcom/daaw/dz0;",
            "Lcom/daaw/dq$b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/dq;->a:Lcom/daaw/ix;

    iput p2, p0, Lcom/daaw/dq;->b:I

    iput p3, p0, Lcom/daaw/dq;->c:I

    iput-object p4, p0, Lcom/daaw/dq;->d:Lcom/daaw/ip;

    iput-object p5, p0, Lcom/daaw/dq;->e:Lcom/daaw/jp;

    iput-object p6, p0, Lcom/daaw/dq;->f:Lcom/daaw/cn1;

    iput-object p7, p0, Lcom/daaw/dq;->g:Lcom/daaw/i51;

    iput-object p8, p0, Lcom/daaw/dq;->h:Lcom/daaw/dq$a;

    iput-object p9, p0, Lcom/daaw/dq;->i:Lcom/daaw/wt;

    iput-object p10, p0, Lcom/daaw/dq;->j:Lcom/daaw/dz0;

    iput-object p11, p0, Lcom/daaw/dq;->k:Lcom/daaw/dq$b;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/dq;)Lcom/daaw/dq$b;
    .locals 0

    iget-object p0, p0, Lcom/daaw/dq;->k:Lcom/daaw/dq$b;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Lcom/daaw/z41;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)",
            "Lcom/daaw/z41<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/jl0;->b()J

    move-result-wide v0

    new-instance v2, Lcom/daaw/dq$c;

    iget-object v3, p0, Lcom/daaw/dq;->e:Lcom/daaw/jp;

    invoke-interface {v3}, Lcom/daaw/jp;->a()Lcom/daaw/zw;

    move-result-object v3

    invoke-direct {v2, p0, v3, p1}, Lcom/daaw/dq$c;-><init>(Lcom/daaw/dq;Lcom/daaw/zw;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/dq;->h:Lcom/daaw/dq$a;

    invoke-interface {p1}, Lcom/daaw/dq$a;->a()Lcom/daaw/ut;

    move-result-object p1

    iget-object v3, p0, Lcom/daaw/dq;->a:Lcom/daaw/ix;

    invoke-virtual {v3}, Lcom/daaw/ix;->b()Lcom/daaw/hi0;

    move-result-object v3

    invoke-interface {p1, v3, v2}, Lcom/daaw/ut;->b(Lcom/daaw/hi0;Lcom/daaw/ut$b;)V

    const-string p1, "DecodeJob"

    const/4 v2, 0x2

    invoke-static {p1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "Wrote source to cache"

    invoke-virtual {p0, v3, v0, v1}, Lcom/daaw/dq;->j(Ljava/lang/String;J)V

    :cond_0
    invoke-static {}, Lcom/daaw/jl0;->b()J

    move-result-wide v0

    iget-object v3, p0, Lcom/daaw/dq;->a:Lcom/daaw/ix;

    invoke-virtual {v3}, Lcom/daaw/ix;->b()Lcom/daaw/hi0;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/daaw/dq;->i(Lcom/daaw/hi0;)Lcom/daaw/z41;

    move-result-object v3

    invoke-static {p1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_1

    if-eqz v3, :cond_1

    const-string p1, "Decoded source from cache"

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/dq;->j(Ljava/lang/String;J)V

    :cond_1
    return-object v3
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/dq;->l:Z

    iget-object v0, p0, Lcom/daaw/dq;->d:Lcom/daaw/ip;

    invoke-interface {v0}, Lcom/daaw/ip;->cancel()V

    return-void
.end method

.method public d()Lcom/daaw/z41;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/z41<",
            "TZ;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/dq;->g()Lcom/daaw/z41;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/dq;->m(Lcom/daaw/z41;)Lcom/daaw/z41;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Object;)Lcom/daaw/z41;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)",
            "Lcom/daaw/z41<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dq;->i:Lcom/daaw/wt;

    invoke-virtual {v0}, Lcom/daaw/wt;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/dq;->b(Ljava/lang/Object;)Lcom/daaw/z41;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/jl0;->b()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/dq;->e:Lcom/daaw/jp;

    invoke-interface {v2}, Lcom/daaw/jp;->d()Lcom/daaw/d51;

    move-result-object v2

    iget v3, p0, Lcom/daaw/dq;->b:I

    iget v4, p0, Lcom/daaw/dq;->c:I

    invoke-interface {v2, p1, v3, v4}, Lcom/daaw/d51;->c(Ljava/lang/Object;II)Lcom/daaw/z41;

    move-result-object p1

    const/4 v2, 0x2

    const-string v3, "DecodeJob"

    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "Decoded from source"

    invoke-virtual {p0, v2, v0, v1}, Lcom/daaw/dq;->j(Ljava/lang/String;J)V

    :cond_1
    :goto_0
    return-object p1
.end method

.method public f()Lcom/daaw/z41;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/z41<",
            "TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dq;->i:Lcom/daaw/wt;

    invoke-virtual {v0}, Lcom/daaw/wt;->a()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/daaw/jl0;->b()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/dq;->a:Lcom/daaw/ix;

    invoke-virtual {p0, v2}, Lcom/daaw/dq;->i(Lcom/daaw/hi0;)Lcom/daaw/z41;

    move-result-object v2

    const-string v3, "DecodeJob"

    const/4 v4, 0x2

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "Decoded transformed from cache"

    invoke-virtual {p0, v5, v0, v1}, Lcom/daaw/dq;->j(Ljava/lang/String;J)V

    :cond_1
    invoke-static {}, Lcom/daaw/jl0;->b()J

    move-result-wide v0

    invoke-virtual {p0, v2}, Lcom/daaw/dq;->k(Lcom/daaw/z41;)Lcom/daaw/z41;

    move-result-object v2

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "Transcoded transformed from cache"

    invoke-virtual {p0, v3, v0, v1}, Lcom/daaw/dq;->j(Ljava/lang/String;J)V

    :cond_2
    return-object v2
.end method

.method public final g()Lcom/daaw/z41;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/z41<",
            "TT;>;"
        }
    .end annotation

    :try_start_0
    invoke-static {}, Lcom/daaw/jl0;->b()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/dq;->d:Lcom/daaw/ip;

    iget-object v3, p0, Lcom/daaw/dq;->j:Lcom/daaw/dz0;

    invoke-interface {v2, v3}, Lcom/daaw/ip;->a(Lcom/daaw/dz0;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "DecodeJob"

    const/4 v4, 0x2

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "Fetched data"

    invoke-virtual {p0, v3, v0, v1}, Lcom/daaw/dq;->j(Ljava/lang/String;J)V

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/dq;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/daaw/dq;->d:Lcom/daaw/ip;

    invoke-interface {v1}, Lcom/daaw/ip;->b()V

    return-object v0

    :cond_1
    :try_start_1
    invoke-virtual {p0, v2}, Lcom/daaw/dq;->e(Ljava/lang/Object;)Lcom/daaw/z41;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, p0, Lcom/daaw/dq;->d:Lcom/daaw/ip;

    invoke-interface {v1}, Lcom/daaw/ip;->b()V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/dq;->d:Lcom/daaw/ip;

    invoke-interface {v1}, Lcom/daaw/ip;->b()V

    throw v0
.end method

.method public h()Lcom/daaw/z41;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/z41<",
            "TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dq;->i:Lcom/daaw/wt;

    invoke-virtual {v0}, Lcom/daaw/wt;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/daaw/jl0;->b()J

    move-result-wide v0

    iget-object v2, p0, Lcom/daaw/dq;->a:Lcom/daaw/ix;

    invoke-virtual {v2}, Lcom/daaw/ix;->b()Lcom/daaw/hi0;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/daaw/dq;->i(Lcom/daaw/hi0;)Lcom/daaw/z41;

    move-result-object v2

    const/4 v3, 0x2

    const-string v4, "DecodeJob"

    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "Decoded source from cache"

    invoke-virtual {p0, v3, v0, v1}, Lcom/daaw/dq;->j(Ljava/lang/String;J)V

    :cond_1
    invoke-virtual {p0, v2}, Lcom/daaw/dq;->m(Lcom/daaw/z41;)Lcom/daaw/z41;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lcom/daaw/hi0;)Lcom/daaw/z41;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/hi0;",
            ")",
            "Lcom/daaw/z41<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/dq;->h:Lcom/daaw/dq$a;

    invoke-interface {v0}, Lcom/daaw/dq$a;->a()Lcom/daaw/ut;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/ut;->c(Lcom/daaw/hi0;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/daaw/dq;->e:Lcom/daaw/jp;

    invoke-interface {v1}, Lcom/daaw/jp;->e()Lcom/daaw/d51;

    move-result-object v1

    iget v2, p0, Lcom/daaw/dq;->b:I

    iget v3, p0, Lcom/daaw/dq;->c:I

    invoke-interface {v1, v0, v2, v3}, Lcom/daaw/d51;->c(Ljava/lang/Object;II)Lcom/daaw/z41;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/daaw/dq;->h:Lcom/daaw/dq$a;

    invoke-interface {v1}, Lcom/daaw/dq$a;->a()Lcom/daaw/ut;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/daaw/ut;->a(Lcom/daaw/hi0;)V

    :cond_1
    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/dq;->h:Lcom/daaw/dq$a;

    invoke-interface {v1}, Lcom/daaw/dq$a;->a()Lcom/daaw/ut;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/daaw/ut;->a(Lcom/daaw/hi0;)V

    throw v0
.end method

.method public final j(Ljava/lang/String;J)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, p3}, Lcom/daaw/jl0;->a(J)D

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, ", key: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/daaw/dq;->a:Lcom/daaw/ix;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final k(Lcom/daaw/z41;)Lcom/daaw/z41;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "TT;>;)",
            "Lcom/daaw/z41<",
            "TZ;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/dq;->g:Lcom/daaw/i51;

    invoke-interface {v0, p1}, Lcom/daaw/i51;->a(Lcom/daaw/z41;)Lcom/daaw/z41;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lcom/daaw/z41;)Lcom/daaw/z41;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "TT;>;)",
            "Lcom/daaw/z41<",
            "TT;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/dq;->f:Lcom/daaw/cn1;

    iget v1, p0, Lcom/daaw/dq;->b:I

    iget v2, p0, Lcom/daaw/dq;->c:I

    invoke-interface {v0, p1, v1, v2}, Lcom/daaw/cn1;->a(Lcom/daaw/z41;II)Lcom/daaw/z41;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p1}, Lcom/daaw/z41;->c()V

    :cond_1
    return-object v0
.end method

.method public final m(Lcom/daaw/z41;)Lcom/daaw/z41;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "TT;>;)",
            "Lcom/daaw/z41<",
            "TZ;>;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/jl0;->b()J

    move-result-wide v0

    invoke-virtual {p0, p1}, Lcom/daaw/dq;->l(Lcom/daaw/z41;)Lcom/daaw/z41;

    move-result-object p1

    const-string v2, "DecodeJob"

    const/4 v3, 0x2

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "Transformed resource from source"

    invoke-virtual {p0, v4, v0, v1}, Lcom/daaw/dq;->j(Ljava/lang/String;J)V

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/dq;->n(Lcom/daaw/z41;)V

    invoke-static {}, Lcom/daaw/jl0;->b()J

    move-result-wide v0

    invoke-virtual {p0, p1}, Lcom/daaw/dq;->k(Lcom/daaw/z41;)Lcom/daaw/z41;

    move-result-object p1

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "Transcoded transformed from source"

    invoke-virtual {p0, v2, v0, v1}, Lcom/daaw/dq;->j(Ljava/lang/String;J)V

    :cond_1
    return-object p1
.end method

.method public final n(Lcom/daaw/z41;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "TT;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/dq;->i:Lcom/daaw/wt;

    invoke-virtual {v0}, Lcom/daaw/wt;->a()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/jl0;->b()J

    move-result-wide v0

    new-instance v2, Lcom/daaw/dq$c;

    iget-object v3, p0, Lcom/daaw/dq;->e:Lcom/daaw/jp;

    invoke-interface {v3}, Lcom/daaw/jp;->c()Lcom/daaw/e51;

    move-result-object v3

    invoke-direct {v2, p0, v3, p1}, Lcom/daaw/dq$c;-><init>(Lcom/daaw/dq;Lcom/daaw/zw;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/dq;->h:Lcom/daaw/dq$a;

    invoke-interface {p1}, Lcom/daaw/dq$a;->a()Lcom/daaw/ut;

    move-result-object p1

    iget-object v3, p0, Lcom/daaw/dq;->a:Lcom/daaw/ix;

    invoke-interface {p1, v3, v2}, Lcom/daaw/ut;->b(Lcom/daaw/hi0;Lcom/daaw/ut$b;)V

    const/4 p1, 0x2

    const-string v2, "DecodeJob"

    invoke-static {v2, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "Wrote transformed from source to cache"

    invoke-virtual {p0, p1, v0, v1}, Lcom/daaw/dq;->j(Ljava/lang/String;J)V

    :cond_1
    :goto_0
    return-void
.end method
