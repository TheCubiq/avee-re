.class public final enum Lcom/daaw/ws;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/ws;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum q:Lcom/daaw/ws;

.field public static final enum r:Lcom/daaw/ws;

.field public static final enum s:Lcom/daaw/ws;

.field public static final enum t:Lcom/daaw/ws;

.field public static final synthetic u:[Lcom/daaw/ws;


# instance fields
.field public final p:I


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, Lcom/daaw/ws;

    const-string v1, "DEVELOPER"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/ws;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/daaw/ws;->q:Lcom/daaw/ws;

    new-instance v1, Lcom/daaw/ws;

    const-string v4, "USER_SIDELOAD"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lcom/daaw/ws;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/daaw/ws;->r:Lcom/daaw/ws;

    new-instance v4, Lcom/daaw/ws;

    const-string v6, "TEST_DISTRIBUTION"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v7}, Lcom/daaw/ws;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/daaw/ws;->s:Lcom/daaw/ws;

    new-instance v6, Lcom/daaw/ws;

    const-string v8, "APP_STORE"

    const/4 v9, 0x4

    invoke-direct {v6, v8, v7, v9}, Lcom/daaw/ws;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/daaw/ws;->t:Lcom/daaw/ws;

    new-array v8, v9, [Lcom/daaw/ws;

    aput-object v0, v8, v2

    aput-object v1, v8, v3

    aput-object v4, v8, v5

    aput-object v6, v8, v7

    sput-object v8, Lcom/daaw/ws;->u:[Lcom/daaw/ws;

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

    iput p3, p0, Lcom/daaw/ws;->p:I

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/daaw/ws;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, Lcom/daaw/ws;->t:Lcom/daaw/ws;

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/daaw/ws;->q:Lcom/daaw/ws;

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/ws;
    .locals 1

    const-class v0, Lcom/daaw/ws;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/ws;

    return-object p0
.end method

.method public static values()[Lcom/daaw/ws;
    .locals 1

    sget-object v0, Lcom/daaw/ws;->u:[Lcom/daaw/ws;

    invoke-virtual {v0}, [Lcom/daaw/ws;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/ws;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lcom/daaw/ws;->p:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/daaw/ws;->p:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
