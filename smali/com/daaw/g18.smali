.class public final synthetic Lcom/daaw/g18;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# static fields
.field public static final synthetic a:Lcom/daaw/g18;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/g18;

    invoke-direct {v0}, Lcom/daaw/g18;-><init>()V

    sput-object v0, Lcom/daaw/g18;->a:Lcom/daaw/g18;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/daaw/mv3;

    new-instance v0, Lcom/daaw/x68;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/daaw/x68;-><init>(I)V

    const/16 v1, 0x3eb

    invoke-static {v0, v1}, Lcom/daaw/vu7;->d(Ljava/lang/RuntimeException;I)Lcom/daaw/vu7;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/daaw/mv3;->E(Lcom/daaw/jn3;)V

    return-void
.end method
