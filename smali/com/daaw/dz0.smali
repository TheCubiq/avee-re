.class public final enum Lcom/daaw/dz0;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/dz0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/dz0;

.field public static final enum q:Lcom/daaw/dz0;

.field public static final enum r:Lcom/daaw/dz0;

.field public static final enum s:Lcom/daaw/dz0;

.field public static final enum t:Lcom/daaw/dz0;

.field public static final synthetic u:[Lcom/daaw/dz0;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/daaw/dz0;

    const-string v1, "IMMEDIATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/dz0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/dz0;->p:Lcom/daaw/dz0;

    new-instance v1, Lcom/daaw/dz0;

    const-string v3, "HIGH"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/dz0;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/dz0;->q:Lcom/daaw/dz0;

    new-instance v3, Lcom/daaw/dz0;

    const-string v5, "NORMAL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/daaw/dz0;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/daaw/dz0;->r:Lcom/daaw/dz0;

    new-instance v5, Lcom/daaw/dz0;

    const-string v7, "LOW"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/daaw/dz0;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/daaw/dz0;->s:Lcom/daaw/dz0;

    new-instance v7, Lcom/daaw/dz0;

    const-string v9, "priority"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/daaw/dz0;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/daaw/dz0;->t:Lcom/daaw/dz0;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/daaw/dz0;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lcom/daaw/dz0;->u:[Lcom/daaw/dz0;

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

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/dz0;
    .locals 1

    const-class v0, Lcom/daaw/dz0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/dz0;

    return-object p0
.end method

.method public static values()[Lcom/daaw/dz0;
    .locals 1

    sget-object v0, Lcom/daaw/dz0;->u:[Lcom/daaw/dz0;

    invoke-virtual {v0}, [Lcom/daaw/dz0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/dz0;

    return-object v0
.end method
