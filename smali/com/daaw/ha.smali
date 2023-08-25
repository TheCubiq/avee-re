.class public final enum Lcom/daaw/ha;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/ha;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/ha;

.field public static final enum q:Lcom/daaw/ha;

.field public static final synthetic r:[Lcom/daaw/ha;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/daaw/ha;

    const-string v1, "EXPONENTIAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/ha;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/ha;->p:Lcom/daaw/ha;

    new-instance v1, Lcom/daaw/ha;

    const-string v3, "LINEAR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/ha;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/ha;->q:Lcom/daaw/ha;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/daaw/ha;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/daaw/ha;->r:[Lcom/daaw/ha;

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

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/ha;
    .locals 1

    const-class v0, Lcom/daaw/ha;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/ha;

    return-object p0
.end method

.method public static values()[Lcom/daaw/ha;
    .locals 1

    sget-object v0, Lcom/daaw/ha;->r:[Lcom/daaw/ha;

    invoke-virtual {v0}, [Lcom/daaw/ha;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/ha;

    return-object v0
.end method
