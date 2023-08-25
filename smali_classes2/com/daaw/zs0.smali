.class public final Lcom/daaw/zs0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/iu;
.implements Lcom/daaw/ze;


# static fields
.field public static final p:Lcom/daaw/zs0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/zs0;

    invoke-direct {v0}, Lcom/daaw/zs0;-><init>()V

    sput-object v0, Lcom/daaw/zs0;->p:Lcom/daaw/zs0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public c(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NonDisposableHandle"

    return-object v0
.end method
