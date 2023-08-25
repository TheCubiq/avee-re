.class public final Lcom/daaw/b86;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/mu2;

.field public final b:Lcom/daaw/w07;

.field public final c:Lcom/daaw/w07;

.field public final d:Lcom/daaw/h68;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/mu2;

    invoke-direct {v0}, Lcom/daaw/mu2;-><init>()V

    iput-object v0, p0, Lcom/daaw/b86;->a:Lcom/daaw/mu2;

    new-instance v1, Lcom/daaw/w07;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Lcom/daaw/w07;-><init>(Lcom/daaw/w07;Lcom/daaw/mu2;)V

    iput-object v1, p0, Lcom/daaw/b86;->c:Lcom/daaw/w07;

    invoke-virtual {v1}, Lcom/daaw/w07;->a()Lcom/daaw/w07;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/b86;->b:Lcom/daaw/w07;

    new-instance v0, Lcom/daaw/h68;

    invoke-direct {v0}, Lcom/daaw/h68;-><init>()V

    iput-object v0, p0, Lcom/daaw/b86;->d:Lcom/daaw/h68;

    new-instance v2, Lcom/daaw/aw8;

    invoke-direct {v2, v0}, Lcom/daaw/aw8;-><init>(Lcom/daaw/h68;)V

    const-string v3, "require"

    invoke-virtual {v1, v3, v2}, Lcom/daaw/w07;->g(Ljava/lang/String;Lcom/daaw/gl2;)V

    sget-object v2, Lcom/daaw/ne5;->a:Lcom/daaw/ne5;

    const-string v3, "internal.platform"

    invoke-virtual {v0, v3, v2}, Lcom/daaw/h68;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    new-instance v0, Lcom/daaw/tb2;

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/daaw/tb2;-><init>(Ljava/lang/Double;)V

    const-string v2, "runtime.counter"

    invoke-virtual {v1, v2, v0}, Lcom/daaw/w07;->g(Ljava/lang/String;Lcom/daaw/gl2;)V

    return-void
.end method


# virtual methods
.method public final varargs a(Lcom/daaw/w07;[Lcom/daaw/gs7;)Lcom/daaw/gl2;
    .locals 4

    sget-object v0, Lcom/daaw/gl2;->g:Lcom/daaw/gl2;

    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v0, p2, v2

    invoke-static {v0}, Lcom/daaw/b38;->a(Lcom/daaw/gs7;)Lcom/daaw/gl2;

    move-result-object v0

    iget-object v3, p0, Lcom/daaw/b86;->c:Lcom/daaw/w07;

    invoke-static {v3}, Lcom/daaw/ou7;->c(Lcom/daaw/w07;)I

    instance-of v3, v0, Lcom/daaw/km2;

    if-nez v3, :cond_0

    instance-of v3, v0, Lcom/daaw/ck2;

    if-eqz v3, :cond_1

    :cond_0
    iget-object v3, p0, Lcom/daaw/b86;->a:Lcom/daaw/mu2;

    invoke-virtual {v3, p1, v0}, Lcom/daaw/mu2;->a(Lcom/daaw/w07;Lcom/daaw/gl2;)Lcom/daaw/gl2;

    move-result-object v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method
