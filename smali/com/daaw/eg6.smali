.class public final synthetic Lcom/daaw/eg6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ty6;


# static fields
.field public static final synthetic p:Lcom/daaw/eg6;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/eg6;

    invoke-direct {v0}, Lcom/daaw/eg6;-><init>()V

    sput-object v0, Lcom/daaw/eg6;->p:Lcom/daaw/eg6;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
