.class public final enum Lcom/daaw/vb2;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum q:Lcom/daaw/vb2;

.field public static final enum r:Lcom/daaw/vb2;

.field public static final s:[Lcom/daaw/vb2;

.field public static final synthetic t:[Lcom/daaw/vb2;


# instance fields
.field public final p:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/daaw/vb2;

    const-string v1, "AD_STORAGE"

    const/4 v2, 0x0

    const-string v3, "ad_storage"

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/vb2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/daaw/vb2;->q:Lcom/daaw/vb2;

    new-instance v1, Lcom/daaw/vb2;

    const-string v3, "ANALYTICS_STORAGE"

    const/4 v4, 0x1

    const-string v5, "analytics_storage"

    invoke-direct {v1, v3, v4, v5}, Lcom/daaw/vb2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/daaw/vb2;->r:Lcom/daaw/vb2;

    const/4 v3, 0x2

    new-array v5, v3, [Lcom/daaw/vb2;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    sput-object v5, Lcom/daaw/vb2;->t:[Lcom/daaw/vb2;

    new-array v3, v3, [Lcom/daaw/vb2;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/daaw/vb2;->s:[Lcom/daaw/vb2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/daaw/vb2;->p:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/daaw/vb2;
    .locals 1

    sget-object v0, Lcom/daaw/vb2;->t:[Lcom/daaw/vb2;

    invoke-virtual {v0}, [Lcom/daaw/vb2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/vb2;

    return-object v0
.end method
