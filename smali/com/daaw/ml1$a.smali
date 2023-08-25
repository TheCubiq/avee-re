.class public final Lcom/daaw/ml1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ml1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/ml1$a;->a:J

    iput-wide v0, p0, Lcom/daaw/ml1$a;->b:J

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/ml1;
    .locals 5

    new-instance v0, Lcom/daaw/ml1;

    iget-wide v1, p0, Lcom/daaw/ml1$a;->a:J

    iget-wide v3, p0, Lcom/daaw/ml1$a;->b:J

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/ml1;-><init>(JJ)V

    return-object v0
.end method

.method public b(J)Lcom/daaw/ml1$a;
    .locals 0

    iput-wide p1, p0, Lcom/daaw/ml1$a;->b:J

    return-object p0
.end method

.method public c(J)Lcom/daaw/ml1$a;
    .locals 0

    iput-wide p1, p0, Lcom/daaw/ml1$a;->a:J

    return-object p0
.end method
