.class public final Lcom/daaw/aa8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lcom/daaw/aa8;

.field public static final d:Lcom/daaw/aa8;

.field public static final e:Lcom/daaw/aa8;

.field public static final f:Lcom/daaw/aa8;

.field public static final g:Lcom/daaw/aa8;


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/daaw/aa8;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, Lcom/daaw/aa8;-><init>(JJ)V

    sput-object v0, Lcom/daaw/aa8;->c:Lcom/daaw/aa8;

    new-instance v3, Lcom/daaw/aa8;

    const-wide v4, 0x7fffffffffffffffL

    invoke-direct {v3, v4, v5, v4, v5}, Lcom/daaw/aa8;-><init>(JJ)V

    sput-object v3, Lcom/daaw/aa8;->d:Lcom/daaw/aa8;

    new-instance v3, Lcom/daaw/aa8;

    invoke-direct {v3, v4, v5, v1, v2}, Lcom/daaw/aa8;-><init>(JJ)V

    sput-object v3, Lcom/daaw/aa8;->e:Lcom/daaw/aa8;

    new-instance v3, Lcom/daaw/aa8;

    invoke-direct {v3, v1, v2, v4, v5}, Lcom/daaw/aa8;-><init>(JJ)V

    sput-object v3, Lcom/daaw/aa8;->f:Lcom/daaw/aa8;

    sput-object v0, Lcom/daaw/aa8;->g:Lcom/daaw/aa8;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-ltz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-static {v4}, Lcom/daaw/uo4;->d(Z)V

    cmp-long v4, p3, v2

    if-ltz v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Lcom/daaw/uo4;->d(Z)V

    iput-wide p1, p0, Lcom/daaw/aa8;->a:J

    iput-wide p3, p0, Lcom/daaw/aa8;->b:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lcom/daaw/aa8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/daaw/aa8;

    iget-wide v2, p0, Lcom/daaw/aa8;->a:J

    iget-wide v4, p1, Lcom/daaw/aa8;->a:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Lcom/daaw/aa8;->b:J

    iget-wide v4, p1, Lcom/daaw/aa8;->b:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/daaw/aa8;->a:J

    long-to-int v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Lcom/daaw/aa8;->b:J

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method
