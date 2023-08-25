.class public final synthetic Lcom/daaw/np8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gq8;


# static fields
.field public static final synthetic a:Lcom/daaw/np8;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/np8;

    invoke-direct {v0}, Lcom/daaw/np8;-><init>()V

    sput-object v0, Lcom/daaw/np8;->a:Lcom/daaw/np8;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/daaw/ep8;

    sget v0, Lcom/daaw/hq8;->d:I

    iget-object p1, p1, Lcom/daaw/ep8;->a:Ljava/lang/String;

    const-string v0, "OMX.google"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
