.class public final enum Lcom/daaw/lz;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/lz;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/lz;

.field public static final enum q:Lcom/daaw/lz;

.field public static final enum r:Lcom/daaw/lz;

.field public static final enum s:Lcom/daaw/lz;

.field public static final synthetic t:[Lcom/daaw/lz;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/daaw/lz;

    const-string v1, "REPLACE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/lz;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/lz;->p:Lcom/daaw/lz;

    new-instance v1, Lcom/daaw/lz;

    const-string v3, "KEEP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/lz;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/lz;->q:Lcom/daaw/lz;

    new-instance v3, Lcom/daaw/lz;

    const-string v5, "APPEND"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/daaw/lz;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/daaw/lz;->r:Lcom/daaw/lz;

    new-instance v5, Lcom/daaw/lz;

    const-string v7, "APPEND_OR_REPLACE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/daaw/lz;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/daaw/lz;->s:Lcom/daaw/lz;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/daaw/lz;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/daaw/lz;->t:[Lcom/daaw/lz;

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

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/lz;
    .locals 1

    const-class v0, Lcom/daaw/lz;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/lz;

    return-object p0
.end method

.method public static values()[Lcom/daaw/lz;
    .locals 1

    sget-object v0, Lcom/daaw/lz;->t:[Lcom/daaw/lz;

    invoke-virtual {v0}, [Lcom/daaw/lz;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/lz;

    return-object v0
.end method
