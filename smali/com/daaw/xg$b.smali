.class public final enum Lcom/daaw/xg$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/xg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/xg$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/xg$b;

.field public static final enum q:Lcom/daaw/xg$b;

.field public static final synthetic r:[Lcom/daaw/xg$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/daaw/xg$b;

    const-string v1, "FLOWER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/xg$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/xg$b;->p:Lcom/daaw/xg$b;

    new-instance v1, Lcom/daaw/xg$b;

    const-string v3, "CIRCLE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/xg$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/xg$b;->q:Lcom/daaw/xg$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/daaw/xg$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/daaw/xg$b;->r:[Lcom/daaw/xg$b;

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

.method public static a(I)Lcom/daaw/xg$b;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    sget-object p0, Lcom/daaw/xg$b;->p:Lcom/daaw/xg$b;

    return-object p0

    :cond_0
    sget-object p0, Lcom/daaw/xg$b;->q:Lcom/daaw/xg$b;

    return-object p0

    :cond_1
    sget-object p0, Lcom/daaw/xg$b;->p:Lcom/daaw/xg$b;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/xg$b;
    .locals 1

    const-class v0, Lcom/daaw/xg$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/xg$b;

    return-object p0
.end method

.method public static values()[Lcom/daaw/xg$b;
    .locals 1

    sget-object v0, Lcom/daaw/xg$b;->r:[Lcom/daaw/xg$b;

    invoke-virtual {v0}, [Lcom/daaw/xg$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/xg$b;

    return-object v0
.end method
