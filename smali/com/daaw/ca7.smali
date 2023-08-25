.class public final Lcom/daaw/ca7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/t97;


# static fields
.field public static final a:Ljava/util/logging/Logger;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/daaw/ca7;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/daaw/ca7;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic b()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Lcom/daaw/ca7;->a:Ljava/util/logging/Logger;

    return-object v0
.end method


# virtual methods
.method public final synthetic a(Lcom/daaw/s97;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/daaw/ba7;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/daaw/ba7;-><init>(Lcom/daaw/s97;Lcom/daaw/aa7;)V

    return-object v0
.end method

.method public final zza()Ljava/lang/Class;
    .locals 1

    const-class v0, Lcom/daaw/a87;

    return-object v0
.end method

.method public final zzb()Ljava/lang/Class;
    .locals 1

    const-class v0, Lcom/daaw/a87;

    return-object v0
.end method
