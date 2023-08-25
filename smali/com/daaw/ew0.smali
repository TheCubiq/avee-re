.class public Lcom/daaw/ew0;
.super Lcom/daaw/kt;
.source ""


# instance fields
.field public volatile b:Lcom/daaw/wz;

.field public c:Lcom/daaw/dw0;

.field public d:Lcom/daaw/pz;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/daaw/kt;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ew0;->b:Lcom/daaw/wz;

    new-instance v1, Lcom/daaw/pz;

    invoke-direct {v1}, Lcom/daaw/pz;-><init>()V

    iput-object v1, p0, Lcom/daaw/ew0;->d:Lcom/daaw/pz;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/daaw/ew0;->e:Ljava/lang/Object;

    iput-object v0, p0, Lcom/daaw/ew0;->c:Lcom/daaw/dw0;

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->B0:Lcom/daaw/qw1;

    new-instance v1, Lcom/daaw/ew0$a;

    invoke-direct {v1, p0}, Lcom/daaw/ew0$a;-><init>(Lcom/daaw/ew0;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qw1;->b(Lcom/daaw/qw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/avee/comp/playback/MediaPlaybackService;->A0:Lcom/daaw/pw1;

    new-instance v1, Lcom/daaw/ew0$b;

    invoke-direct {v1, p0}, Lcom/daaw/ew0$b;-><init>(Lcom/daaw/ew0;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/pw1;->b(Lcom/daaw/pw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/qv1;->Q:Lcom/daaw/sw1;

    new-instance v1, Lcom/daaw/ew0$c;

    invoke-direct {v1, p0}, Lcom/daaw/ew0$c;-><init>(Lcom/daaw/ew0;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/sw1;->b(Lcom/daaw/sw1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/pv1;->u:Lcom/daaw/ow1;

    new-instance v1, Lcom/daaw/ew0$d;

    invoke-direct {v1, p0}, Lcom/daaw/ew0$d;-><init>(Lcom/daaw/ew0;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ow1;->b(Lcom/daaw/ow1$a;Ljava/util/List;)Lcom/daaw/ow1;

    sget-object v0, Lcom/daaw/qv1;->R:Lcom/daaw/ow1;

    new-instance v1, Lcom/daaw/ew0$e;

    invoke-direct {v1, p0}, Lcom/daaw/ew0$e;-><init>(Lcom/daaw/ew0;)V

    iget-object v2, p0, Lcom/daaw/kt;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/ow1;->b(Lcom/daaw/ow1$a;Ljava/util/List;)Lcom/daaw/ow1;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/ew0;Lcom/daaw/pz;)Lcom/daaw/pz;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ew0;->d:Lcom/daaw/pz;

    return-object p1
.end method

.method public static synthetic b(Lcom/daaw/ew0;)Lcom/daaw/wz;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ew0;->b:Lcom/daaw/wz;

    return-object p0
.end method

.method public static synthetic c(Lcom/daaw/ew0;)Lcom/daaw/dw0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ew0;->c:Lcom/daaw/dw0;

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/ew0;Lcom/daaw/dw0;)Lcom/daaw/dw0;
    .locals 0

    iput-object p1, p0, Lcom/daaw/ew0;->c:Lcom/daaw/dw0;

    return-object p1
.end method

.method public static synthetic e(Lcom/daaw/ew0;Lcom/daaw/avee/comp/playback/a;Lcom/daaw/avee/comp/playback/a$g;Z)Lcom/daaw/avee/comp/playback/a;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ew0;->f(Lcom/daaw/avee/comp/playback/a;Lcom/daaw/avee/comp/playback/a$g;Z)Lcom/daaw/avee/comp/playback/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final f(Lcom/daaw/avee/comp/playback/a;Lcom/daaw/avee/comp/playback/a$g;Z)Lcom/daaw/avee/comp/playback/a;
    .locals 7

    sget-object v0, Lcom/daaw/avee/comp/playback/c;->d:Lcom/daaw/ow1;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lcom/daaw/ow1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/playback/a;

    if-nez v0, :cond_1

    if-eqz p3, :cond_0

    const-string p1, "AudioFrameData is null, MediaService not started?"

    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_0
    return-object v0

    :cond_1
    iget-boolean p3, v0, Lcom/daaw/avee/comp/playback/a;->r:Z

    if-nez p3, :cond_2

    return-object v0

    :cond_2
    iget-object v1, p0, Lcom/daaw/ew0;->c:Lcom/daaw/dw0;

    if-eqz v1, :cond_4

    iget-wide v2, p2, Lcom/daaw/avee/comp/playback/a$g;->g:J

    const-wide/16 v4, 0x0

    cmp-long p3, v2, v4

    if-gez p3, :cond_3

    iget-wide v2, v0, Lcom/daaw/avee/comp/playback/a;->s:J

    :cond_3
    iget-object p3, p0, Lcom/daaw/ew0;->d:Lcom/daaw/pz;

    iget v6, p3, Lcom/daaw/pz;->g:I

    move-object v4, p2

    move-object v5, p1

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/dw0;->c(JLcom/daaw/avee/comp/playback/a$h;Lcom/daaw/avee/comp/playback/a;I)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    return-object p1

    :cond_4
    iget-wide v0, v0, Lcom/daaw/avee/comp/playback/a;->s:J

    invoke-virtual {p0, v0, v1, p1, p2}, Lcom/daaw/ew0;->g(JLcom/daaw/avee/comp/playback/a;Lcom/daaw/avee/comp/playback/a$g;)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    return-object p1
.end method

.method public g(JLcom/daaw/avee/comp/playback/a;Lcom/daaw/avee/comp/playback/a$g;)Lcom/daaw/avee/comp/playback/a;
    .locals 8

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/ew0;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/ew0;->b:Lcom/daaw/wz;

    if-nez v1, :cond_1

    new-instance v1, Lcom/daaw/wz;

    invoke-direct {v1}, Lcom/daaw/wz;-><init>()V

    :cond_1
    move-object v7, v1

    iget-wide v1, p4, Lcom/daaw/avee/comp/playback/a$g;->g:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gez v5, :cond_2

    move-wide v2, p1

    goto :goto_0

    :cond_2
    move-wide v2, v1

    :goto_0
    iget-boolean v6, p4, Lcom/daaw/avee/comp/playback/a$g;->h:Z

    move-object v1, v7

    move-object v4, p4

    move-object v5, p3

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/wz;->b(JLcom/daaw/avee/comp/playback/a$h;Lcom/daaw/avee/comp/playback/a;Z)Lcom/daaw/avee/comp/playback/a;

    move-result-object p1

    iput-object v7, p0, Lcom/daaw/ew0;->b:Lcom/daaw/wz;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
