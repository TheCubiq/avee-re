.class public final Lcom/daaw/ho2;
.super Lcom/daaw/no2;
.source ""


# instance fields
.field public final i:Lcom/daaw/en2;

.field public j:J


# direct methods
.method public constructor <init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;IILcom/daaw/en2;)V
    .locals 7

    const-string v2, "yXY8/mGMSUXAD/doic4NhOcSiaIXIqWtQGozx2RibPkZkGDEn3zdgJKu8ncuIp2B"

    const-string v3, "lomf+VO0Ecj7WivSbw6aVWdgbo/lmDysFNgyXwY+gTY="

    const/16 v6, 0x35

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/daaw/no2;-><init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;II)V

    iput-object p7, p0, Lcom/daaw/ho2;->i:Lcom/daaw/en2;

    if-eqz p7, :cond_0

    invoke-virtual {p7}, Lcom/daaw/en2;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/ho2;->j:J

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/ho2;->i:Lcom/daaw/en2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    iget-object v1, p0, Lcom/daaw/no2;->f:Ljava/lang/reflect/Method;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-wide v4, p0, Lcom/daaw/ho2;->j:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/hi2;->H(J)Lcom/daaw/hi2;

    :cond_0
    return-void
.end method
