.class public final enum Lcom/daaw/uf$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/uf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/uf$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum q:Lcom/daaw/uf$b;

.field public static final enum r:Lcom/daaw/uf$b;

.field public static final synthetic s:[Lcom/daaw/uf$b;


# instance fields
.field public final p:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/daaw/uf$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/daaw/uf$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/daaw/uf$b;->q:Lcom/daaw/uf$b;

    new-instance v1, Lcom/daaw/uf$b;

    const-string v3, "ANDROID_FIREBASE"

    const/4 v4, 0x1

    const/16 v5, 0x17

    invoke-direct {v1, v3, v4, v5}, Lcom/daaw/uf$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/daaw/uf$b;->r:Lcom/daaw/uf$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/daaw/uf$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/daaw/uf$b;->s:[Lcom/daaw/uf$b;

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

    iput p3, p0, Lcom/daaw/uf$b;->p:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/uf$b;
    .locals 1

    const-class v0, Lcom/daaw/uf$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/uf$b;

    return-object p0
.end method

.method public static values()[Lcom/daaw/uf$b;
    .locals 1

    sget-object v0, Lcom/daaw/uf$b;->s:[Lcom/daaw/uf$b;

    invoke-virtual {v0}, [Lcom/daaw/uf$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/uf$b;

    return-object v0
.end method
