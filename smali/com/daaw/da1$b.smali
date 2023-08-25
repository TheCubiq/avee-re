.class public final Lcom/daaw/da1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/da1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/da1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:J

.field public final b:Lcom/daaw/da1$a;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/daaw/da1$b;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/da1$b;->a:J

    new-instance p1, Lcom/daaw/da1$a;

    const-wide/16 v0, 0x0

    cmp-long p2, p3, v0

    if-nez p2, :cond_0

    sget-object p2, Lcom/daaw/fa1;->c:Lcom/daaw/fa1;

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/daaw/fa1;

    invoke-direct {p2, v0, v1, p3, p4}, Lcom/daaw/fa1;-><init>(JJ)V

    :goto_0
    invoke-direct {p1, p2}, Lcom/daaw/da1$a;-><init>(Lcom/daaw/fa1;)V

    iput-object p1, p0, Lcom/daaw/da1$b;->b:Lcom/daaw/da1$a;

    return-void
.end method


# virtual methods
.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g(J)Lcom/daaw/da1$a;
    .locals 0

    iget-object p1, p0, Lcom/daaw/da1$b;->b:Lcom/daaw/da1$a;

    return-object p1
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/da1$b;->a:J

    return-wide v0
.end method
