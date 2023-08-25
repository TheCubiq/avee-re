.class public final Lcom/daaw/xz7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;
.implements Lcom/daaw/qz7;


# static fields
.field public static final b:Lcom/daaw/xz7;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/xz7;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/xz7;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/xz7;->b:Lcom/daaw/xz7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xz7;->a:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/Object;)Lcom/daaw/wz7;
    .locals 2

    new-instance v0, Lcom/daaw/xz7;

    const-string v1, "instance cannot be null"

    invoke-static {p0, v1}, Lcom/daaw/e08;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-direct {v0, p0}, Lcom/daaw/xz7;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Object;)Lcom/daaw/wz7;
    .locals 1

    if-nez p0, :cond_0

    sget-object p0, Lcom/daaw/xz7;->b:Lcom/daaw/xz7;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/xz7;

    invoke-direct {v0, p0}, Lcom/daaw/xz7;-><init>(Ljava/lang/Object;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public final zzb()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xz7;->a:Ljava/lang/Object;

    return-object v0
.end method
