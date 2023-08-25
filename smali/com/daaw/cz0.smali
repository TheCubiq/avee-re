.class public final enum Lcom/daaw/cz0;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/cz0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/cz0;

.field public static final enum q:Lcom/daaw/cz0;

.field public static final enum r:Lcom/daaw/cz0;

.field public static final synthetic s:[Lcom/daaw/cz0;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/daaw/cz0;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/cz0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/cz0;->p:Lcom/daaw/cz0;

    new-instance v1, Lcom/daaw/cz0;

    const-string v3, "VERY_LOW"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/cz0;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/cz0;->q:Lcom/daaw/cz0;

    new-instance v3, Lcom/daaw/cz0;

    const-string v5, "HIGHEST"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/daaw/cz0;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/daaw/cz0;->r:Lcom/daaw/cz0;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/daaw/cz0;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/daaw/cz0;->s:[Lcom/daaw/cz0;

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

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/cz0;
    .locals 1

    const-class v0, Lcom/daaw/cz0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/cz0;

    return-object p0
.end method

.method public static values()[Lcom/daaw/cz0;
    .locals 1

    sget-object v0, Lcom/daaw/cz0;->s:[Lcom/daaw/cz0;

    invoke-virtual {v0}, [Lcom/daaw/cz0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/cz0;

    return-object v0
.end method
