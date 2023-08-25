.class public final enum Lcom/daaw/da$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/da;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/da$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/da$a;

.field public static final enum q:Lcom/daaw/da$a;

.field public static final enum r:Lcom/daaw/da$a;

.field public static final enum s:Lcom/daaw/da$a;

.field public static final synthetic t:[Lcom/daaw/da$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/daaw/da$a;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/da$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/da$a;->p:Lcom/daaw/da$a;

    new-instance v1, Lcom/daaw/da$a;

    const-string v3, "TRANSIENT_ERROR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/da$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/da$a;->q:Lcom/daaw/da$a;

    new-instance v3, Lcom/daaw/da$a;

    const-string v5, "FATAL_ERROR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/daaw/da$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/daaw/da$a;->r:Lcom/daaw/da$a;

    new-instance v5, Lcom/daaw/da$a;

    const-string v7, "INVALID_PAYLOAD"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/daaw/da$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/daaw/da$a;->s:Lcom/daaw/da$a;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/daaw/da$a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/daaw/da$a;->t:[Lcom/daaw/da$a;

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

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/da$a;
    .locals 1

    const-class v0, Lcom/daaw/da$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/da$a;

    return-object p0
.end method

.method public static values()[Lcom/daaw/da$a;
    .locals 1

    sget-object v0, Lcom/daaw/da$a;->t:[Lcom/daaw/da$a;

    invoke-virtual {v0}, [Lcom/daaw/da$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/da$a;

    return-object v0
.end method
