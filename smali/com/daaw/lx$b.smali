.class public final enum Lcom/daaw/lx$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/lx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/lx$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/lx$b;

.field public static final enum q:Lcom/daaw/lx$b;

.field public static final synthetic r:[Lcom/daaw/lx$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/daaw/lx$b;

    const-string v1, "CACHE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/lx$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/lx$b;->p:Lcom/daaw/lx$b;

    new-instance v1, Lcom/daaw/lx$b;

    const-string v3, "SOURCE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/daaw/lx$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/daaw/lx$b;->q:Lcom/daaw/lx$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/daaw/lx$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/daaw/lx$b;->r:[Lcom/daaw/lx$b;

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

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/lx$b;
    .locals 1

    const-class v0, Lcom/daaw/lx$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/lx$b;

    return-object p0
.end method

.method public static values()[Lcom/daaw/lx$b;
    .locals 1

    sget-object v0, Lcom/daaw/lx$b;->r:[Lcom/daaw/lx$b;

    invoke-virtual {v0}, [Lcom/daaw/lx$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/lx$b;

    return-object v0
.end method
