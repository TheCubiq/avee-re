.class public final Lcom/daaw/lz8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Lcom/daaw/lz8;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:J


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v6, Lcom/daaw/lz8;

    const/4 v1, -0x3

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v4, -0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/daaw/lz8;-><init>(IJJ)V

    sput-object v6, Lcom/daaw/lz8;->d:Lcom/daaw/lz8;

    return-void
.end method

.method public constructor <init>(IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/lz8;->a:I

    iput-wide p2, p0, Lcom/daaw/lz8;->b:J

    iput-wide p4, p0, Lcom/daaw/lz8;->c:J

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/lz8;)I
    .locals 0

    iget p0, p0, Lcom/daaw/lz8;->a:I

    return p0
.end method

.method public static bridge synthetic b(Lcom/daaw/lz8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/lz8;->c:J

    return-wide v0
.end method

.method public static bridge synthetic c(Lcom/daaw/lz8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/lz8;->b:J

    return-wide v0
.end method

.method public static d(JJ)Lcom/daaw/lz8;
    .locals 7

    new-instance v6, Lcom/daaw/lz8;

    const/4 v1, -0x1

    move-object v0, v6

    move-wide v2, p0

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/daaw/lz8;-><init>(IJJ)V

    return-object v6
.end method

.method public static e(J)Lcom/daaw/lz8;
    .locals 7

    new-instance v6, Lcom/daaw/lz8;

    const/4 v1, 0x0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, v6

    move-wide v4, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/lz8;-><init>(IJJ)V

    return-object v6
.end method

.method public static f(JJ)Lcom/daaw/lz8;
    .locals 7

    new-instance v6, Lcom/daaw/lz8;

    const/4 v1, -0x2

    move-object v0, v6

    move-wide v2, p0

    move-wide v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/daaw/lz8;-><init>(IJJ)V

    return-object v6
.end method
