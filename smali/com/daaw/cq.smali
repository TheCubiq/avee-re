.class public final enum Lcom/daaw/cq;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/cq;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/cq;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum q:Lcom/daaw/cq;

.field public static final enum r:Lcom/daaw/cq;

.field public static final s:Lcom/daaw/cq;

.field public static final synthetic t:[Lcom/daaw/cq;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/daaw/cq;

    const-string v1, "ALWAYS_ARGB_8888"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/cq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/cq;->p:Lcom/daaw/cq;

    new-instance v1, Lcom/daaw/cq;

    const-string v3, "PREFER_ARGB_8888"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/cq;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/cq;->q:Lcom/daaw/cq;

    new-instance v3, Lcom/daaw/cq;

    const-string v5, "PREFER_RGB_565"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/daaw/cq;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/daaw/cq;->r:Lcom/daaw/cq;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/daaw/cq;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/daaw/cq;->t:[Lcom/daaw/cq;

    sput-object v3, Lcom/daaw/cq;->s:Lcom/daaw/cq;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/cq;
    .locals 1

    const-class v0, Lcom/daaw/cq;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/cq;

    return-object p0
.end method

.method public static values()[Lcom/daaw/cq;
    .locals 1

    sget-object v0, Lcom/daaw/cq;->t:[Lcom/daaw/cq;

    invoke-virtual {v0}, [Lcom/daaw/cq;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/cq;

    return-object v0
.end method
