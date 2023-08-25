.class public final enum Lcom/daaw/ch5;
.super Ljava/lang/Enum;
.source ""


# static fields
.field public static final enum p:Lcom/daaw/ch5;

.field public static final enum q:Lcom/daaw/ch5;

.field public static final enum r:Lcom/daaw/ch5;

.field public static final enum s:Lcom/daaw/ch5;

.field public static final synthetic t:[Lcom/daaw/ch5;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/daaw/ch5;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/ch5;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/ch5;->p:Lcom/daaw/ch5;

    new-instance v1, Lcom/daaw/ch5;

    const-string v3, "API"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/ch5;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/ch5;->q:Lcom/daaw/ch5;

    new-instance v3, Lcom/daaw/ch5;

    const-string v5, "GESTURE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/daaw/ch5;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/daaw/ch5;->r:Lcom/daaw/ch5;

    new-instance v5, Lcom/daaw/ch5;

    const-string v7, "DEBUG_MENU"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/daaw/ch5;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/daaw/ch5;->s:Lcom/daaw/ch5;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/daaw/ch5;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/daaw/ch5;->t:[Lcom/daaw/ch5;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/daaw/ch5;
    .locals 1

    sget-object v0, Lcom/daaw/ch5;->t:[Lcom/daaw/ch5;

    invoke-virtual {v0}, [Lcom/daaw/ch5;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/ch5;

    return-object v0
.end method
