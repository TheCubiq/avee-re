.class public final enum Lcom/daaw/jk6;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum p:Lcom/daaw/jk6;

.field public static final enum q:Lcom/daaw/jk6;

.field public static final enum r:Lcom/daaw/jk6;

.field public static final synthetic s:[Lcom/daaw/jk6;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/daaw/jk6;

    const-string v1, "Rewarded"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/jk6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/jk6;->p:Lcom/daaw/jk6;

    new-instance v1, Lcom/daaw/jk6;

    const-string v3, "Interstitial"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/jk6;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/jk6;->q:Lcom/daaw/jk6;

    new-instance v3, Lcom/daaw/jk6;

    const-string v5, "AppOpen"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/daaw/jk6;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/daaw/jk6;->r:Lcom/daaw/jk6;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/daaw/jk6;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/daaw/jk6;->s:[Lcom/daaw/jk6;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/daaw/jk6;
    .locals 1

    sget-object v0, Lcom/daaw/jk6;->s:[Lcom/daaw/jk6;

    invoke-virtual {v0}, [Lcom/daaw/jk6;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/jk6;

    return-object v0
.end method
