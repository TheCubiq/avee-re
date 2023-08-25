.class public final enum Lcom/daaw/zu0;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/zu0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/zu0;

.field public static final enum q:Lcom/daaw/zu0;

.field public static final synthetic r:[Lcom/daaw/zu0;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/daaw/zu0;

    const-string v1, "RUN_AS_NON_EXPEDITED_WORK_REQUEST"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/zu0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/zu0;->p:Lcom/daaw/zu0;

    new-instance v1, Lcom/daaw/zu0;

    const-string v3, "DROP_WORK_REQUEST"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/zu0;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/zu0;->q:Lcom/daaw/zu0;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/daaw/zu0;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/daaw/zu0;->r:[Lcom/daaw/zu0;

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

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/zu0;
    .locals 1

    const-class v0, Lcom/daaw/zu0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/zu0;

    return-object p0
.end method

.method public static values()[Lcom/daaw/zu0;
    .locals 1

    sget-object v0, Lcom/daaw/zu0;->r:[Lcom/daaw/zu0;

    invoke-virtual {v0}, [Lcom/daaw/zu0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/zu0;

    return-object v0
.end method
