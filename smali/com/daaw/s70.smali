.class public Lcom/daaw/s70;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static c:Lcom/daaw/tw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tw1<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/ee0;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Ljava/lang/Object;

.field public static volatile e:Lcom/daaw/s70;


# instance fields
.field public a:I

.field public final b:[Lcom/daaw/l91;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/tw1;

    invoke-direct {v0}, Lcom/daaw/tw1;-><init>()V

    sput-object v0, Lcom/daaw/s70;->c:Lcom/daaw/tw1;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/s70;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    sput-object v0, Lcom/daaw/s70;->e:Lcom/daaw/s70;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/s70;->a:I

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/daaw/l91;

    iput-object v0, p0, Lcom/daaw/s70;->b:[Lcom/daaw/l91;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/s70;->b:[Lcom/daaw/l91;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    new-instance v2, Lcom/daaw/l91;

    invoke-direct {v2, v0}, Lcom/daaw/l91;-><init>(I)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/daaw/s70;->a:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/daaw/s70;->e(IZ)V

    return-void
.end method

.method public static a()Lcom/daaw/s70;
    .locals 2

    sget-object v0, Lcom/daaw/s70;->e:Lcom/daaw/s70;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lcom/daaw/s70;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/s70;->e:Lcom/daaw/s70;

    if-nez v1, :cond_1

    new-instance v1, Lcom/daaw/s70;

    invoke-direct {v1}, Lcom/daaw/s70;-><init>()V

    sput-object v1, Lcom/daaw/s70;->e:Lcom/daaw/s70;

    :cond_1
    sget-object v1, Lcom/daaw/s70;->e:Lcom/daaw/s70;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static c()Lcom/daaw/s70;
    .locals 1

    sget-object v0, Lcom/daaw/s70;->e:Lcom/daaw/s70;

    return-object v0
.end method


# virtual methods
.method public b()Lcom/daaw/ee0;
    .locals 1

    iget v0, p0, Lcom/daaw/s70;->a:I

    invoke-virtual {p0, v0}, Lcom/daaw/s70;->d(I)Lcom/daaw/l91;

    move-result-object v0

    return-object v0
.end method

.method public d(I)Lcom/daaw/l91;
    .locals 2

    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/s70;->b:[Lcom/daaw/l91;

    array-length v1, v0

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object p1, v0, p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public e(IZ)V
    .locals 3

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/s70;->b:[Lcom/daaw/l91;

    array-length v0, v0

    if-lt p1, v0, :cond_1

    :cond_0
    const/4 p1, -0x1

    :cond_1
    if-ltz p1, :cond_2

    iget-object v0, p0, Lcom/daaw/s70;->b:[Lcom/daaw/l91;

    aget-object v0, v0, p1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/daaw/s70;->c:Lcom/daaw/tw1;

    iget v2, p0, Lcom/daaw/s70;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v1, v2, p1, v0, p2}, Lcom/daaw/tw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public f(ILjava/lang/String;)V
    .locals 2

    if-ltz p1, :cond_2

    iget-object v0, p0, Lcom/daaw/s70;->b:[Lcom/daaw/l91;

    array-length v1, v0

    if-lt p1, v1, :cond_0

    goto :goto_1

    :cond_0
    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/daaw/l91;->f:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/s70;->b:[Lcom/daaw/l91;

    aget-object v0, v0, p1

    if-nez p2, :cond_1

    const-string p2, ""

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p2, v1

    :goto_0
    iput-object p2, v0, Lcom/daaw/l91;->f:Ljava/lang/String;

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/s70;->e(IZ)V

    :cond_2
    :goto_1
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/daaw/s70;->a:I

    invoke-virtual {p0, v0, p1}, Lcom/daaw/s70;->f(ILjava/lang/String;)V

    return-void
.end method

.method public h(I)V
    .locals 1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/s70;->b:[Lcom/daaw/l91;

    array-length v0, v0

    if-lt p1, v0, :cond_1

    :cond_0
    const/4 p1, -0x1

    :cond_1
    iput p1, p0, Lcom/daaw/s70;->a:I

    iget p1, p0, Lcom/daaw/s70;->a:I

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/s70;->e(IZ)V

    return-void
.end method

.method public i(IZLjava/lang/String;Lcom/daaw/sd0;)V
    .locals 2

    if-ltz p1, :cond_3

    iget-object v0, p0, Lcom/daaw/s70;->b:[Lcom/daaw/l91;

    array-length v1, v0

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_0
    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/daaw/m91;->c:Lcom/daaw/sd0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p4}, Lcom/daaw/sd0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/daaw/s70;->b:[Lcom/daaw/l91;

    aget-object v0, v0, p1

    const-string v1, ""

    iput-object v1, v0, Lcom/daaw/l91;->f:Ljava/lang/String;

    :cond_2
    iget-object v0, p0, Lcom/daaw/s70;->b:[Lcom/daaw/l91;

    aget-object v1, v0, p1

    iput-boolean p2, v1, Lcom/daaw/m91;->a:Z

    aget-object p2, v0, p1

    iput-object p3, p2, Lcom/daaw/m91;->b:Ljava/lang/String;

    aget-object p2, v0, p1

    iput-object p4, p2, Lcom/daaw/m91;->c:Lcom/daaw/sd0;

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/s70;->e(IZ)V

    :cond_3
    :goto_0
    return-void
.end method
