.class public Lcom/daaw/td1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static f:Lcom/daaw/sw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sw1<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static g:Lcom/daaw/pw1;

.field public static final h:Ljava/lang/Object;

.field public static i:Lcom/daaw/td1;


# instance fields
.field public a:Z

.field public b:I

.field public c:Ljava/util/Date;

.field public d:Z

.field public e:Ljava/util/Timer;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/sw1;

    invoke-direct {v0}, Lcom/daaw/sw1;-><init>()V

    sput-object v0, Lcom/daaw/td1;->f:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/pw1;

    invoke-direct {v0}, Lcom/daaw/pw1;-><init>()V

    sput-object v0, Lcom/daaw/td1;->g:Lcom/daaw/pw1;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/td1;->h:Ljava/lang/Object;

    const/4 v0, 0x0

    sput-object v0, Lcom/daaw/td1;->i:Lcom/daaw/td1;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/td1;->a:Z

    iput v0, p0, Lcom/daaw/td1;->b:I

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    iput-object v1, p0, Lcom/daaw/td1;->c:Ljava/util/Date;

    iput-boolean v0, p0, Lcom/daaw/td1;->d:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/td1;->e:Ljava/util/Timer;

    sget-object v0, Lcom/daaw/td1;->f:Lcom/daaw/sw1;

    iget-boolean v1, p0, Lcom/daaw/td1;->a:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget v2, p0, Lcom/daaw/td1;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-boolean v3, p0, Lcom/daaw/td1;->d:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/td1;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/td1;->d()V

    return-void
.end method

.method public static c()Lcom/daaw/td1;
    .locals 2

    sget-object v0, Lcom/daaw/td1;->i:Lcom/daaw/td1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lcom/daaw/td1;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/td1;->i:Lcom/daaw/td1;

    if-nez v1, :cond_1

    new-instance v1, Lcom/daaw/td1;

    invoke-direct {v1}, Lcom/daaw/td1;-><init>()V

    sput-object v1, Lcom/daaw/td1;->i:Lcom/daaw/td1;

    :cond_1
    sget-object v1, Lcom/daaw/td1;->i:Lcom/daaw/td1;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public b(ZILjava/util/Date;Z)V
    .locals 2

    if-gez p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput-boolean p1, p0, Lcom/daaw/td1;->a:Z

    iput p2, p0, Lcom/daaw/td1;->b:I

    iput-object p3, p0, Lcom/daaw/td1;->c:Ljava/util/Date;

    iput-boolean p4, p0, Lcom/daaw/td1;->d:Z

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/daaw/td1;->e:Ljava/util/Timer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_1
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/daaw/td1;->e:Ljava/util/Timer;

    new-instance v1, Lcom/daaw/td1$a;

    invoke-direct {v1, p0}, Lcom/daaw/td1$a;-><init>(Lcom/daaw/td1;)V

    invoke-virtual {v0, v1, p3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;Ljava/util/Date;)V

    goto :goto_0

    :cond_2
    iget-object p3, p0, Lcom/daaw/td1;->e:Ljava/util/Timer;

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljava/util/Timer;->cancel()V

    :cond_3
    const/4 p3, 0x0

    iput-object p3, p0, Lcom/daaw/td1;->e:Ljava/util/Timer;

    :goto_0
    sget-object p3, Lcom/daaw/td1;->f:Lcom/daaw/sw1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-virtual {p3, p1, p2, p4}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final d()V
    .locals 4

    iget v0, p0, Lcom/daaw/td1;->b:I

    iget-object v1, p0, Lcom/daaw/td1;->c:Ljava/util/Date;

    iget-boolean v2, p0, Lcom/daaw/td1;->d:Z

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0, v1, v2}, Lcom/daaw/td1;->b(ZILjava/util/Date;Z)V

    sget-object v0, Lcom/daaw/td1;->g:Lcom/daaw/pw1;

    invoke-virtual {v0}, Lcom/daaw/pw1;->a()V

    return-void
.end method

.method public e()Lcom/daaw/ud1;
    .locals 2

    new-instance v0, Lcom/daaw/ud1;

    invoke-direct {v0}, Lcom/daaw/ud1;-><init>()V

    iget-boolean v1, p0, Lcom/daaw/td1;->a:Z

    iput-boolean v1, v0, Lcom/daaw/ud1;->a:Z

    iget v1, p0, Lcom/daaw/td1;->b:I

    iput v1, v0, Lcom/daaw/ud1;->b:I

    iget-boolean v1, p0, Lcom/daaw/td1;->d:Z

    iput-boolean v1, v0, Lcom/daaw/ud1;->c:Z

    return-object v0
.end method

.method public f()I
    .locals 5

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iget-object v1, p0, Lcom/daaw/td1;->c:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    long-to-int v0, v1

    div-int/lit16 v0, v0, 0x3e8

    return v0
.end method

.method public g()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/daaw/td1;->c:Ljava/util/Date;

    return-object v0
.end method
