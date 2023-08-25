.class public final enum Lcom/daaw/dl0$b;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/daaw/tz0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/dl0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/dl0$b;",
        ">;",
        "Lcom/daaw/tz0;"
    }
.end annotation


# static fields
.field public static final enum q:Lcom/daaw/dl0$b;

.field public static final enum r:Lcom/daaw/dl0$b;

.field public static final enum s:Lcom/daaw/dl0$b;

.field public static final enum t:Lcom/daaw/dl0$b;

.field public static final enum u:Lcom/daaw/dl0$b;

.field public static final enum v:Lcom/daaw/dl0$b;

.field public static final enum w:Lcom/daaw/dl0$b;

.field public static final synthetic x:[Lcom/daaw/dl0$b;


# instance fields
.field public final p:I


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    new-instance v0, Lcom/daaw/dl0$b;

    const-string v1, "REASON_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/daaw/dl0$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/daaw/dl0$b;->q:Lcom/daaw/dl0$b;

    new-instance v1, Lcom/daaw/dl0$b;

    const-string v3, "MESSAGE_TOO_OLD"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/daaw/dl0$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/daaw/dl0$b;->r:Lcom/daaw/dl0$b;

    new-instance v3, Lcom/daaw/dl0$b;

    const-string v5, "CACHE_FULL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/daaw/dl0$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/daaw/dl0$b;->s:Lcom/daaw/dl0$b;

    new-instance v5, Lcom/daaw/dl0$b;

    const-string v7, "PAYLOAD_TOO_BIG"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lcom/daaw/dl0$b;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/daaw/dl0$b;->t:Lcom/daaw/dl0$b;

    new-instance v7, Lcom/daaw/dl0$b;

    const-string v9, "MAX_RETRIES_REACHED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lcom/daaw/dl0$b;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/daaw/dl0$b;->u:Lcom/daaw/dl0$b;

    new-instance v9, Lcom/daaw/dl0$b;

    const-string v11, "INVALID_PAYLOD"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Lcom/daaw/dl0$b;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/daaw/dl0$b;->v:Lcom/daaw/dl0$b;

    new-instance v11, Lcom/daaw/dl0$b;

    const-string v13, "SERVER_ERROR"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, Lcom/daaw/dl0$b;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lcom/daaw/dl0$b;->w:Lcom/daaw/dl0$b;

    const/4 v13, 0x7

    new-array v13, v13, [Lcom/daaw/dl0$b;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Lcom/daaw/dl0$b;->x:[Lcom/daaw/dl0$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/daaw/dl0$b;->p:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/dl0$b;
    .locals 1

    const-class v0, Lcom/daaw/dl0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/dl0$b;

    return-object p0
.end method

.method public static values()[Lcom/daaw/dl0$b;
    .locals 1

    sget-object v0, Lcom/daaw/dl0$b;->x:[Lcom/daaw/dl0$b;

    invoke-virtual {v0}, [Lcom/daaw/dl0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/dl0$b;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/daaw/dl0$b;->p:I

    return v0
.end method
