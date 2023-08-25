.class public abstract Lcom/daaw/ka1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ka1$d;,
        Lcom/daaw/ka1$c;,
        Lcom/daaw/ka1$b;,
        Lcom/daaw/ka1$a;,
        Lcom/daaw/ka1$e;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/d31;

.field public final b:J

.field public final c:J


# direct methods
.method public constructor <init>(Lcom/daaw/d31;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ka1;->a:Lcom/daaw/d31;

    iput-wide p2, p0, Lcom/daaw/ka1;->b:J

    iput-wide p4, p0, Lcom/daaw/ka1;->c:J

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/j41;)Lcom/daaw/d31;
    .locals 0

    iget-object p1, p0, Lcom/daaw/ka1;->a:Lcom/daaw/d31;

    return-object p1
.end method

.method public b()J
    .locals 6

    iget-wide v0, p0, Lcom/daaw/ka1;->c:J

    iget-wide v4, p0, Lcom/daaw/ka1;->b:J

    const-wide/32 v2, 0xf4240

    invoke-static/range {v0 .. v5}, Lcom/daaw/sq1;->T(JJJ)J

    move-result-wide v0

    return-wide v0
.end method
