.class public Lcom/daaw/h42;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i42;


# instance fields
.field public final a:J

.field public final b:Lcom/daaw/g42;


# direct methods
.method public constructor <init>(JJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/h42;->a:J

    new-instance p1, Lcom/daaw/g42;

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-nez p2, :cond_0

    sget-object p2, Lcom/daaw/j42;->c:Lcom/daaw/j42;

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/daaw/j42;

    invoke-direct {p2, v0, v1, p3, p4}, Lcom/daaw/j42;-><init>(JJ)V

    :goto_0
    invoke-direct {p1, p2, p2}, Lcom/daaw/g42;-><init>(Lcom/daaw/j42;Lcom/daaw/j42;)V

    iput-object p1, p0, Lcom/daaw/h42;->b:Lcom/daaw/g42;

    return-void
.end method


# virtual methods
.method public final b(J)Lcom/daaw/g42;
    .locals 0

    iget-object p1, p0, Lcom/daaw/h42;->b:Lcom/daaw/g42;

    return-object p1
.end method

.method public final zze()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/h42;->a:J

    return-wide v0
.end method

.method public final zzh()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
