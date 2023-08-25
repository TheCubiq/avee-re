.class public final enum Lcom/daaw/zg5;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum p:Lcom/daaw/zg5;

.field public static final enum q:Lcom/daaw/zg5;

.field public static final enum r:Lcom/daaw/zg5;

.field public static final synthetic s:[Lcom/daaw/zg5;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/daaw/zg5;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/zg5;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/zg5;->p:Lcom/daaw/zg5;

    new-instance v1, Lcom/daaw/zg5;

    const-string v3, "SHAKE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/zg5;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/zg5;->q:Lcom/daaw/zg5;

    new-instance v3, Lcom/daaw/zg5;

    const-string v5, "FLICK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/daaw/zg5;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/daaw/zg5;->r:Lcom/daaw/zg5;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/daaw/zg5;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/daaw/zg5;->s:[Lcom/daaw/zg5;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/daaw/zg5;
    .locals 1

    const-class v0, Lcom/daaw/zg5;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/zg5;

    return-object p0
.end method

.method public static values()[Lcom/daaw/zg5;
    .locals 1

    sget-object v0, Lcom/daaw/zg5;->s:[Lcom/daaw/zg5;

    invoke-virtual {v0}, [Lcom/daaw/zg5;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/zg5;

    return-object v0
.end method
