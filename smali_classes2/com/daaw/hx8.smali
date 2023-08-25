.class public final Lcom/daaw/hx8;
.super Lcom/daaw/ad2;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/oy8;Ljava/lang/String;)V
    .locals 0

    const-string p1, "getVersion"

    invoke-direct {p0, p1}, Lcom/daaw/ad2;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/w07;Ljava/util/List;)Lcom/daaw/gl2;
    .locals 2

    new-instance p1, Lcom/daaw/tb2;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/daaw/tb2;-><init>(Ljava/lang/Double;)V

    return-object p1
.end method
