.class public Lcom/daaw/gk$i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/gk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/gk$i;->a:J

    iput-object p3, p0, Lcom/daaw/gk$i;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lcom/daaw/gk$i;

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/daaw/gk$i;->a:J

    check-cast p1, Lcom/daaw/gk$i;

    iget-wide v2, p1, Lcom/daaw/gk$i;->a:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/daaw/gk$i;->a:J

    long-to-int v1, v0

    return v1
.end method
