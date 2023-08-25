.class public final Lcom/daaw/t26;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/f77;

.field public final b:J

.field public final c:Lcom/daaw/ag;


# direct methods
.method public constructor <init>(Lcom/daaw/f77;JLcom/daaw/ag;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/t26;->a:Lcom/daaw/f77;

    iput-object p4, p0, Lcom/daaw/t26;->c:Lcom/daaw/ag;

    invoke-interface {p4}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    add-long/2addr v0, p2

    iput-wide v0, p0, Lcom/daaw/t26;->b:J

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 5

    iget-wide v0, p0, Lcom/daaw/t26;->b:J

    iget-object v2, p0, Lcom/daaw/t26;->c:Lcom/daaw/ag;

    invoke-interface {v2}, Lcom/daaw/ag;->b()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
